package com.mht.index;

import java.io.UnsupportedEncodingException;
import java.util.*;

import com.jfinal.kit.Kv;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.CommonController;
import com.mht.common.model.SysUser;
import com.mht.common.model.SysUserRole;
import com.mht.common.utils.AESUtil;
import com.mht.common.utils.MD5;
import com.mht.system.PermStaticCode;
import com.mht.system.service.SysPlatService;
import com.mht.system.service.SysUserRoleService;
import com.mht.system.service.SysUserService;

import cn.dreampie.ValidateKit;

/**
 * IndexController
 */
public class IndexController extends CommonController {

    public SysUserService sysUserService = SysUserService.me;
    public SysPlatService sysPlatService = SysPlatService.me;
    public SysUserRoleService sysUserRoleService = SysUserRoleService.me;


    public void index() {
        setOptionSession();
        setPathSession();
        setSessionAttr("plat_id","9");
        render("lpLogin.html");

    }

    private void setOptionSession() {
        setSessionAttr("option", Db.findFirst("select * from sys_setting"));
        setSessionAttr("theme", ValidateKit.isNullOrEmpty(getSessionAttr("theme")) ? (getPara("theme", "yzs")) : getSessionAttr("theme"));
    }

    public void changeUserPlat(){
        String plat_id = getPara("plat_id");
        if(!ValidateKit.isNullOrEmpty(plat_id)){
            setSessionAttr("plat_id",plat_id);
            redirect("/lpIndex");
        }else{
            redirect("/");
        }
    }

    public void lpIndex() {
        String plat_id = getSessionAttr("plat_id");
        if(ValidateKit.isNullOrEmpty(plat_id)){
            redirect("/");
        }else{
            if (!ValidateKit.isNullOrEmpty(getPara("theme"))) {
                setSessionAttr("theme", getPara("theme"));
            }
            if (getSessionAttr("user") == null) {
                setOptionSession();
                login();
            } else {
                SysUser user = getUserInfo();
                if (checkUserHasPlatPerm(user, plat_id)) {
                    List userPermList = sysUserService.findUserPerm(user.getStr("user_id"), plat_id);
                    setAttr("userPermList", userPermList);
                    setAttr("user", user);
                    setSessionAttr("site_name", record(Kv.by("site_id", user.getSiteId()), "system.getSiteMsg").get("site_name"));
                    setAttr("plat_id", plat_id);
                    List userOtherSysplatById = sysPlatService.getUserOtherSysplatById(plat_id, user.getPlatIds());
                    setAttr("user_other_plat", userOtherSysplatById.size() > 0 ? userOtherSysplatById : null);
                    setSessionAttr("login_plat", sysPlatService.findById(plat_id));
                    setSessionAttr("other_plat", userOtherSysplatById.size() > 0 ? userOtherSysplatById : null);
                    setPathSession();
                    render("lpIndex.html");
                } else {
                    getSession().removeAttribute("user");
                    getSession().removeAttribute("plat_id");
                    index();
                }

            }
        }

    }


    public void toConsolePage() {
        String plat_id = getSessionAttr("plat_id").toString();
        if ("0".equals(plat_id)) {
            List allSysplat = sysPlatService.getAllSysplat();
            int hot1 = 0, hot2 = 0;
            if (allSysplat.size() >= 5) {
                hot1 = 5;
            } else {
                hot1 = allSysplat.size();
            }
            if (allSysplat.size() >= 10) {
                hot2 = 10;
            } else {
                hot2 = allSysplat.size();
            }
            setAttr("all_plat", allSysplat);
            setAttr("hot_plat5", allSysplat.subList(0, hot1));
            setAttr("hot_plat10", allSysplat.subList(0, hot2));
            Kv cond = Kv.by("user_id", getUserInfo().getStr("user_id")).set("plat_id", getPara("plat_id", plat_id));
//            setAttr("fast_menus", Db.find(Db.getSqlPara("system.findFastMenu",cond)));
            setAttr("total", Db.findFirst(Db.getSqlPara("system.findAllRoleAndUser")));
            List<Record> findAllPlatMsgSortRole = Db.find(Db.getSqlPara("system.findAllPlatMsgSortRole"));
            setAttr("all_plat_sort_role10", findAllPlatMsgSortRole.subList(0, hot2));
        }
        if (plat_id.equals("8")) {
            setAttr("school_zone", commonService.records("repair.getSchoolList"));
        } else if (plat_id.equals("9")) {
            //do nothing
        } else if (plat_id.equals("20")) {
            setAttr("materialsEnterInfo", commonService.records("materials.materialsEnterInfo"));
        } else if (plat_id.equals("24")) {
            List roles = sysUserRoleService.findRoleByUserId(getUserInfo().getUserId().toString());
            if (!"student".equals(((Record) roles.get(0)).getStr("keycode"))) {
                plat_id = null;
            }
        }
//        render("home/console_" + plat_id + ".html");
        render("home/console_" + plat_id + (ValidateKit.isNullOrEmpty(getPara("flag")) ? "" : "_" + getPara("flag")) + ".html");
    }

    public void platLogin(){
        String plat_id = getPara("plat_id","0");
        setSessionAttr("plat_id",plat_id);
        redirect("/login");
    }

    public void login() {
        Object plat_id = getSessionAttr("plat_id");
        if(ValidateKit.isNullOrEmpty(plat_id)){
            redirect("/");
        }else{
            render("lpLogin.html");
        }
    }

    public void errorEnterPage(){
        if(!ValidateKit.isNullOrEmpty(getSessionAttr("option"))&&!ValidateKit.isNullOrEmpty(getSessionAttr("plat_id"))){
            login();
        }else{
            index();
        }
    }

    public void changeLoginUser() {
        SysUser sysUser = sysUserService.findById(getParaToInt("user"));
        getSession().setAttribute("user", sysUser);
        index();
    }

    public void loginout() {
        setSessionAttr("user",null);
        setSessionAttr("plat_id",null);
        index();
    }

    final Base64.Decoder decoder = Base64.getDecoder();
    public void checkLogin() throws UnsupportedEncodingException {
        String loginName = getPara("username");
        String password = getPara("password");
        String plat_id = getSessionAttr("plat_id");
        Map returnMap = new HashMap();
        if (ValidateKit.isNullOrEmpty(loginName) || ValidateKit.isNullOrEmpty(password)) {
            returnMap.put("flag", false);
            returnMap.put("msg", "用户名或密码不能为空");
        }else{
            password=new String(decoder.decode(password), "UTF-8");
            List<SysUser> userList = sysUserService.findUserByLoginName(loginName);
            if (userList.size() == 0) {
                returnMap.put("flag", false);
                returnMap.put("msg", "该用户不存在");
            } else {
                userList = sysUserService.findUser(loginName, AESUtil.AESEncode(password));
                if (userList.size() == 0) {
                    returnMap.put("flag", false);
                    returnMap.put("msg", "用户名或密码错误");
                } else {
                    //获取用户相关信息
                    SysUser sysUser = userList.get(0);
                    if (checkUserHasPlatPerm(sysUser, plat_id)) {
                        getSession().setAttribute("plat_id", plat_id);
                        getSession().setAttribute("user", sysUser);
                        returnMap.put("flag", true);
                    } else {
                        returnMap.put("flag", false);
                        returnMap.put("msg", "此用户没有访问该系统的权限！");
                    }
                }
            }

        }
        renderJson(returnMap);
    }

    public boolean checkUserHasPlatPerm(SysUser user, String plat_id) {
        String platIds = user.getPlatIds();
        String[] arr_ids = platIds.split(",");
        return Arrays.asList(arr_ids).contains(plat_id);
    }



    public void error() {
        render("404.html");
    }


    public void setPathSession() {
        String basePath = getRequest().getScheme() + "://" + getRequest().getServerName() + ":" + getRequest().getServerPort() + getRequest().getContextPath() + "/";
        getSession().setAttribute("basePath", basePath);//basepath
        getSession().setAttribute("staticPath", PropKit.get("file.accessHead"));//文件访问路径
    }

    /**
     *所有密码加密
     */
    public void changePassword(){
        List<Record> records = records("system.getSysUserList");
        String password,user_id;
        for(Record record:records){
            password=record.get("password");
            user_id=record.get("user_id").toString();
            password=AESUtil.AESEncode(password);
            sysUserService.updateSql("system.updateUserPassword",Kv.by("password",password).set("user_id",user_id));
        }
        renderJson();
    }


    public void testAESEncode(){
        renderJson(AESUtil.AESEncode(getPara("val")));
    }


}



