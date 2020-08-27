package com.mht.system;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.upload.UploadFile;
import com.mht.common.CommonController;
import com.mht.common.model.*;
import com.mht.common.utils.AESUtil;
import com.mht.common.utils.Format;
import com.mht.system.service.PmFieldService;
import com.mht.system.service.PmModuleService;
import com.mht.system.service.PmTableService;
import com.mht.system.service.SiteInfoService;
import com.mht.system.service.SysModuleService;
import com.mht.system.service.SysPermService;
import com.mht.system.service.SysPlatService;
import com.mht.system.service.SysRolePermService;
import com.mht.system.service.SysRoleService;
import com.mht.system.service.SysRoleSiteService;
import com.mht.system.service.SysSettingService;
import com.mht.system.service.SysUserPermService;
import com.mht.system.service.SysUserRoleService;
import com.mht.system.service.SysUserService;

import cn.dreampie.ValidateKit;
import com.xiaoleilu.hutool.system.UserInfo;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SystemController extends CommonController {

    public static final SysUserService sysUserService = SysUserService.me;
    public static final SysRoleService sysRoleService = SysRoleService.me;
    public static final SysPermService sysPermService = SysPermService.me;
    public static final SysModuleService sysModuleService = SysModuleService.me;
    public static final SysRolePermService sysRolePermService = SysRolePermService.me;
    public static final SysUserPermService sysUserPermService = SysUserPermService.me;
    public static final SysUserRoleService sysUserRoleService = SysUserRoleService.me;
    public static final SysSettingService sysSettingService = SysSettingService.me;
    public static final SiteInfoService siteInfoService = SiteInfoService.me;
    public static final SysRoleSiteService sysRoleSiteService = SysRoleSiteService.me;
    public static final PmTableService pmTableService = PmTableService.me;
    public static final PmFieldService pmFieldService = PmFieldService.me;
    public static final SysPlatService sysPlatService = SysPlatService.me;
    public static final PmModuleService pmModuleService = PmModuleService.me;


    /**
     * 用户管理
     */
    public void systemUser() {
        render("userManager.html");
    }

    /**
     * 获取用户列表
     */
    public void getUserList() {
        String search_param = getPara("search_param", "");
        String status = getPara("status", "");
        String plat_id = getSessionAttr("plat_id").toString();
        Kv cond = Kv.by("status", status).set("search_param", search_param);
        if (!"0".equals(plat_id)) {
            cond.set("plat_id", plat_id);
        }
        Page userPage = paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond, "system.findUserList");
        renderJson(Format.layuiPage(userPage));

    }
    /**
     *获取解密的明文密码
     */
    public void getPassword(){
        SysUser user = sysUserService.findById(getParaToInt("user_id"));
        user.setPassword(AESUtil.AESDncode(user.getPassword()));
        renderJson(user);
    }

    /**
     * 删除用户
     */
    public void deleteUser() {
        String user_ids = getPara("user_ids");
        String[] userIdArr = user_ids.split(",");
        for (String user_id : userIdArr) {
            sysUserService.delete(Integer.parseInt(user_id));
        }
        renderJson();

    }

    /**
     * 跳转至添加用户页面
     */
    public void addUser() {
        String user_id = getPara("user_id", "");
        if (!ValidateKit.isNullOrEmpty(user_id)) {
            SysUser sysUser = sysUserService.findById(Integer.parseInt(user_id));
            sysUser.setPassword(AESUtil.AESDncode(sysUser.getPassword()));
            setAttr("sysUser", sysUser);
//            setAttr("childSietList",getSiteList(sysUser.getParentSiteId().toString()));
        }
//        setAttr("sietList",getSiteList(""));
        setAttr("platList", getPlatList(""));
        render("addUser.html");
    }

    /**
     * 新增用户
     */
    public void addUserSave() {
        SysUser sysUser = getModel(SysUser.class, "sysUser");
        if (ValidateKit.isNullOrEmpty(sysUser.getStatus())) {
            sysUser.setStatus(0);
        }

        sysUser.setPassword(AESUtil.AESEncode(sysUser.getPassword()));
        if (ValidateKit.isNullOrEmpty(sysUser.getUserId())) {
            sysUser.setCreateTime(getNowDate());
            sysUserService.save(sysUser);
        } else {
            sysUserService.update(sysUser);
        }
        redirect("/system/systemUser");
    }

    /**
     * 用户名验重
     */
    public void checkUserName() {
        renderJson(record(getCond(getParaMap()), "system.getUserByName").getInt("count"));
    }

    /**
     * 角色管理
     */
    public void systemRole() {
        String plat_id = getPara("plat_id", getSessionAttr("plat_id").toString());
        setAttr("plat_id", plat_id);
        render("roleManager.html");
    }

    /**
     * 获取角色列表
     */
    public void getRoleList() {
        String search_param = getPara("search_param", "");
        String plat_id = getPara("plat_id", getSessionAttr("plat_id").toString());
        Page rolePage = sysRoleService.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), search_param, plat_id);
        renderJson(Format.layuiPage(rolePage));

    }

    /**
     * 跳转至添加角色页面
     */
    public void addRole() {
        String role_id = getPara("role_id", "");
        if (!ValidateKit.isNullOrEmpty(role_id)) {
            SysRole sysRole = sysRoleService.findById(Integer.parseInt(role_id));
            setAttr("sysRole", sysRole);
        }
        setAttr("plat_id", getPara("plat_id", getSessionAttr("plat_id").toString()));
        render("addRole.html");
    }

    /**
     * 新增角色
     */
    public void addRoleSave() {
        SysRole sysRole = getModel(SysRole.class, "sysRole");
        if (ValidateKit.isNullOrEmpty(sysRole.getRoleId())) {
            Integer max_order_code = sysRoleService.findMaxOrderCode().getInt("max_order_code");
            sysRole.setOrderCode(max_order_code == null ? 0 : max_order_code + 1);
            sysRoleService.save(sysRole);
        } else {
            sysRoleService.update(sysRole);
        }
        redirect("/system/systemRole?plat_id=" + sysRole.getPlatId());
    }

    /**
     * 删除角色
     */
    public void deleteRole() {
        String role_ids = getPara("role_ids");
        String[] roleIdArr = role_ids.split(",");
        for (String role_id : roleIdArr) {
            sysRoleService.delete(Integer.parseInt(role_id));
        }
        renderJson();

    }

    /**
     * 移动角色
     */
    public void moveRole() {
        Integer r1 = getParaToInt("r1");
        Integer c1 = getParaToInt("c1");
        Integer r2 = getParaToInt("r2");
        Integer c2 = getParaToInt("c2");
        sysRoleService.updateOrderCode(r1, c2);
        sysRoleService.updateOrderCode(r2, c1);
        renderJson();
    }

    /**
     * 模块管理
     */
    public void systemModule() {
        String parent_module_id = getPara("parent_module_id", "");
        setAttr("parent_module_id", parent_module_id);
        String plat_id = getPara("plat_id", getSessionAttr("plat_id").toString());
        setAttr("plat_id", plat_id);
        render("moduleManager.html");
    }


    /**
     * 获取系统权限中模块列表
     */
    public void getModulePermList() {
        String status = getPara("status", "");
        String plat_id = getPara("plat_id", getSessionAttr("plat_id").toString());
        List moduleList = sysModuleService.getModuleList("", status, plat_id);
        renderJson(Format.listTolayuiPage(moduleList));

    }

    /**
     * 获取系统权限中子模块列表
     */
    public void getChildModulePermList() {
        String parent_module_id = getPara("parent_module_id", "");
        String status = getPara("status", "");
        if (ValidateKit.isNullOrEmpty(parent_module_id)) {
            renderJson(Format.listTolayuiPage(null));
        } else {
            List moduleList = sysModuleService.getModuleList(parent_module_id, status);
            renderJson(Format.listTolayuiPage(moduleList));
        }
    }

    /**
     * 模板批量设置权限
     */
    public void addPermToModule() {
        String moduleIds = getPara("ids");
        for (String module_id : moduleIds.split(",")) {
            sysPermService.addPermToModule(module_id);
        }
        renderJson();
    }

    /**
     * 跳转至添加模块页面
     */
    public void addModule() {
        String module_id = getPara("module_id", "");
        String parent_module_id = getPara("parent_module_id", "");
        if (!ValidateKit.isNullOrEmpty(module_id)) {
            SysModule sysModule = sysModuleService.findById(Integer.parseInt(module_id));
            setAttr("sysModule", sysModule);
        }
        if (!ValidateKit.isNullOrEmpty(parent_module_id)) {
            String module_name = sysModuleService.findById(Integer.parseInt(parent_module_id)).getModuleName();
            setAttr("module_name", module_name);
        }
        setAttr("parent_module_id", parent_module_id);
        setAttr("plat_id", getPara("plat_id", getSessionAttr("plat_id").toString()));
        render("addModule.html");
    }

    /**
     * 新增模块
     */
    public void addModuleSave() {
        SysModule sysModule = getModel(SysModule.class, "sysModule");
        if (ValidateKit.isNullOrEmpty(sysModule.getStatus())) {
            sysModule.setStatus(0);
        }
        if (ValidateKit.isNullOrEmpty(sysModule.getModuleId())) {
            Integer max_order_code = sysModuleService.findMaxOrderCode().getInt("max_order_code");
            sysModule.setOrderCode(max_order_code == null ? 0 : max_order_code + 1);
            sysModuleService.save(sysModule);
        } else {
            sysModuleService.update(sysModule);
        }
        redirect("/system/systemModule?parent_module_id=" + sysModule.getParentModuleId() + "&plat_id=" + sysModule.getPlatId());
    }

    /**
     * 删除模块
     */
    public void deleteModule() {
        String module_ids = getPara("module_ids");
        String[] moduleIdArr = module_ids.split(",");
        for (String module_id : moduleIdArr) {
            sysModuleService.delete(Integer.parseInt(module_id));
        }
        renderJson();

    }

    /**
     * 模块权限管理
     */
    public void systemPerm() {
        String module_id = getPara("module_id", "");
        setAttr("module_id", module_id);
        render("permManager.html");
    }

    /**
     * 获取模块所有权限列表
     */
    public void getPermList() {
        Page permPage = paginate(getParaToInt("page", 1), getParaToInt("limit", 10), getCond(getParaMap()), "system.getPermList");
        renderJson(Format.layuiPage(permPage));

    }


    /**
     * 新增模块的权限
     */
    public void addPerm() {
        String module_id = getPara("module_id", "");
        String perm_id = getPara("perm_id", "");
        String module_name = sysModuleService.findById(Integer.parseInt(module_id)).getModuleName();
        setAttr("module_name", module_name);
        setAttr("module_id", module_id);
        if (!"".equals(perm_id)) {
            Record perm = sysPermService.findById(Integer.parseInt(perm_id));
            perm.set("perm_value_1", Integer.parseInt(perm.get("perm_value_1").toString()));
            perm.set("perm_value_2", Integer.parseInt(perm.get("perm_value_2").toString()));
            perm.set("perm_value_4", Integer.parseInt(perm.get("perm_value_4").toString()));
            perm.set("perm_value_8", Integer.parseInt(perm.get("perm_value_8").toString()));
            perm.set("perm_value_16", Integer.parseInt(perm.get("perm_value_16").toString()));
            perm.set("perm_value_32", Integer.parseInt(perm.get("perm_value_32").toString()));
            setAttr("perm", perm);
        }
        render("addPerm.html");
    }

    /**
     * 新增模块的权限
     */
    public void addPermSave() {
        SysPerm sysPerm = getModel(SysPerm.class, "sysPerm");
        if (!ValidateKit.isNullOrEmpty(sysPerm.getPermId())) {
            sysPermService.update(sysPerm);
        } else {
            sysPermService.save(sysPerm);
        }
        redirect("/system/systemPerm?module_id=" + sysPerm.getModuleId());
    }

    /**
     * 删除模块
     */
    public void deletePerm() {
        String perm_ids = getPara("perm_ids");
        String[] permIdArr = perm_ids.split(",");
        for (String perm_id : permIdArr) {
            sysPermService.delete(Integer.parseInt(perm_id));
        }
        renderJson();

    }

    /**
     * 模块移动
     */
    public void moveModule() {
        Integer m1 = getParaToInt("m1");
        Integer c1 = getParaToInt("c1");
        Integer m2 = getParaToInt("m2");
        Integer c2 = getParaToInt("c2");
        sysModuleService.updateOrderCode(m1, c2);
        sysModuleService.updateOrderCode(m2, c1);
        renderJson();
    }

    /**
     * 用户/角色权限配置
     */
    public void allotUserPerm() {
        String user_id = getPara("user_id", "");
        String role_id = getPara("role_id", "");
        if (!ValidateKit.isNullOrEmpty(user_id)) {
            setAttr("type", "user");
            setAttr("user_id", user_id);
            List<SysPlat> userSysplatList = sysPlatService.getUserSysplatByUserId(user_id);
            setAttr("user_plat_list", userSysplatList);
            setAttr("plat_id", getPara("plat_id", userSysplatList.get(0).getPlatId().toString()));
        }
        if (!ValidateKit.isNullOrEmpty(role_id)) {
            setAttr("plat_id", getPara("plat_id", getSessionAttr("plat_id").toString()));
            setAttr("type", "role");
            if ("user".equals(getPara("ret", ""))) {
                setAttr("ret", "user");
            }
            setAttr("role_id", role_id);
        }
        render("allotUserPerm.html");
    }

    /**
     * 保存用户/角色权限的设置
     */
    public void saveUserPrem() {
        String type = getPara("type");
        String flag = getPara("flag");
        Integer perm_id = getParaToInt("perm_id");
        Integer value = getParaToInt("value");
        if ("user".equals(type)) {
            Integer user_id = getParaToInt("type_id");
            SysUserPerm sysUserPerm = sysUserPermService.findByUserIdAndPermId(user_id, perm_id);
            if (!ValidateKit.isNullOrEmpty(sysUserPerm.getUserPermId())) {
                sysUserPerm.setPermId(perm_id);
                if ("all".equals(flag)) {
                    if (value == 0) {
                        sysUserPerm.setPermValue(0);
                    } else {
                        sysUserPerm.setPermValue(value);
                    }
                } else {
                    sysUserPerm.setPermValue(sysUserPerm.getPermValue() + value);
                }
                sysUserPermService.update(sysUserPerm);
            } else {
                sysUserPerm.setUserId(user_id);
                sysUserPerm.setPermId(perm_id);
                sysUserPerm.setPermValue(value);
                sysUserPermService.save(sysUserPerm);
            }
        }
        if ("role".equals(type)) {
            Integer role_id = getParaToInt("type_id");
            SysRolePerm sysRolePerm = sysRolePermService.findByRoleIdAndPermId(role_id, perm_id);
            if (!ValidateKit.isNullOrEmpty(sysRolePerm.getRolePermId())) {
                sysRolePerm.setPermId(perm_id);
                if ("all".equals(flag)) {
                    if (value == 0) {
                        sysRolePerm.setPermValue(0);
                    } else {
                        sysRolePerm.setPermValue(value);
                    }
                } else {
                    sysRolePerm.setPermValue(sysRolePerm.getPermValue() + value);
                }
                sysRolePermService.update(sysRolePerm);
            } else {
                sysRolePerm.setRoleId(role_id);
                sysRolePerm.setPermId(perm_id);
                sysRolePerm.setPermValue(value);
                sysRolePermService.save(sysRolePerm);
            }
        }
        renderJson();
    }


    /**
     * 批量更新用户/角色的权限配置
     */
    public void saveUserPremAll() {
        String type = getPara("type");
        String flag = getPara("flag");
        Integer module_id = getParaToInt("module_id");
        Integer value = 0;//取消设置默认为0
        Integer perm_id = null;
        if ("user".equals(type)) {
            Integer user_id = getParaToInt("type_id");
            List<SysPerm> sysPerms = sysPermService.findByModuleId(module_id);
            for (SysPerm sysPerm : sysPerms) {
                perm_id = sysPerm.getPermId();
                SysUserPerm sysUserPerm = sysUserPermService.findByUserIdAndPermId(user_id, perm_id);
                sysUserPerm.setPermId(perm_id);
                sysUserPerm.setPermValue(sysPerm.getPermValue());
                if ("all".equals(flag)) {
                    sysUserPerm.setPermValue(sysPerm.getPermValue());
                } else {
                    sysUserPerm.setPermValue(value);
                }
                if (sysUserPerm.getUserPermId() != null) {
                    sysUserPermService.update(sysUserPerm);
                } else {
                    sysUserPerm.setUserId(user_id);
                    sysUserPermService.save(sysUserPerm);
                }
            }
        }
        if ("role".equals(type)) {
            Integer role_id = getParaToInt("type_id");
            List<SysPerm> sysPerms = sysPermService.findByModuleId(module_id);
            for (SysPerm sysPerm : sysPerms) {
                perm_id = sysPerm.getPermId();
                SysRolePerm sysRolePerm = sysRolePermService.findByRoleIdAndPermId(role_id, perm_id);
                sysRolePerm.setPermId(perm_id);
                sysRolePerm.setPermValue(sysPerm.getPermValue());
                if ("all".equals(flag)) {
                    sysRolePerm.setPermValue(sysPerm.getPermValue());
                } else {
                    sysRolePerm.setPermValue(value);
                }
                if (sysRolePerm.getRolePermId() != null) {
                    sysRolePermService.update(sysRolePerm);
                } else {
                    sysRolePerm.setRoleId(role_id);
                    sysRolePermService.save(sysRolePerm);
                }
            }
        }
        renderJson();
    }

    /**
     * 验证角色是否包含有效用户
     */
    public void checkRoleHasUser() {
        String role_ids = getPara("role_ids");
        String[] roleIdArr = role_ids.split(",");
        boolean flag = true;
        for (String role_id : roleIdArr) {
            List userRoleList = sysUserRoleService.findUserByRoleId(role_id);
            if (userRoleList.size() != 0) {
                flag = false;
            }
        }
        renderJson(flag);
    }

    /**
     * 验证模板是否包含子模版
     */
    public void checkModuleHasChild() {
        String module_ids = getPara("module_ids");
        String[] moduleIdArr = module_ids.split(",");
        boolean flag = true;
        for (String module_id : moduleIdArr) {
            List userRoleList = sysModuleService.findChildModuleByParentId(module_id);
            if (userRoleList.size() != 0) {
                flag = false;
            }
        }
        renderJson(flag);
    }


    /**
     * 获取模块所有权限列表和用户拥有的权限信息
     */
    public void getUserPermList() {
        String module_id = getPara("module_id", "");
        String user_id = getPara("user_id", "");
        String role_id = getPara("role_id", "");
        List list = sysPermService.getPermList(module_id, user_id, role_id);
        renderJson(Format.listTolayuiPage(list));

    }

    /**
     * 改变状态
     */
    public void changeStatus() {
        sysUserService.update(getPara("status"), getPara("table_name"), getPara("table_id"), getPara("id"));
        renderJson();
    }

    /**
     * 改变状态--批量
     */
    public void changeModelStatus() {
        String status = getPara("status");
        String table_name = getPara("table_name");
        String table_id = getPara("table_id");
        String ids = getPara("ids");
        String[] idArr = ids.split(",");
        for (String id : idArr) {
            sysUserService.update(status, table_name, table_id, id);
        }
        renderJson();
    }


    public void getUserRoleList() {
        String user_id = getPara("user_id", "");
        List list = sysUserRoleService.getListByUserId(user_id, getPara("plat_id", getSessionAttr("plat_id").toString()));
        renderJson(Format.listTolayuiPage(list));
//        renderJson(Format.layuiPage(sysUserRoleService.paginateByUserId(getParaToInt("page", 1), getParaToInt("limit", 10),user_id,getPara("plat_id",getSessionAttr("plat_id").toString()))));
    }

    /**
     * 分配用户角色
     */
    public void allotUserRole() {
        String user_id = getPara("user_id", "");
        setAttr("user_id", user_id);
        List<SysPlat> userSysplatList = sysPlatService.getUserSysplatByUserId(user_id);
        setAttr("user_plat_list", userSysplatList);
        setAttr("plat_id", getPara("plat_id", userSysplatList.get(0).getPlatId().toString()));
        setAttr("role_ids", sysUserRoleService.findUserCheckedRoleIds(user_id));
        render("allotUserRole.html");
    }


    /**
     * 为用户分配/取消角色
     */
    public void saveUserRole() {
        Integer user_id = getParaToInt("user_id");
        String role_ids = getPara("role_ids");
        String flag = getPara("flag");
        SysUserRole userRole = getModel(SysUserRole.class, "sysUserRole");
        userRole.setUserId(user_id);
        String[] role_id = role_ids.split(",");
        for (int i = 0; i < role_id.length; i++) {
            userRole.setRoleId(Integer.parseInt(role_id[i]));
            if ("1".equals(flag)) {
                sysUserRoleService.saveUserRole(userRole);
            } else {
                sysUserRoleService.update(userRole);
            }
        }
        renderJson();
    }

    /**
     * 角色选择用户
     */
    public void allotRoleUser() {
        String role_id = getPara("role_id", "");
        setAttr("role_id", role_id);
        setAttr("plat_id", getPara("plat_id"));
        setAttr("user_ids", sysUserRoleService.findRoleUsers(role_id));
        render("allotRoleUser.html");
    }

    /**
     * 根据角色获取用户
     */
    public void getUserListAboutRole() {
        String flag = getPara("flag");
        String role_id = getPara("role_id");
        List list = sysUserService.userListAboutRole(role_id, flag, getPara("plat_id", getSessionAttr("plat_id").toString()), getSessionAttr("plat_id").toString());
        renderJson(Format.listTolayuiPage(list));
    }

    /**
     * 改变用户角色
     */
    public void changeUserRole() {
        String user_ids = getPara("user_ids");
        String role_id = getPara("role_id");
        String flag = getPara("flag");
        SysUserRole userRole = getModel(SysUserRole.class, "sysUserRole");
        userRole.setRoleId(Integer.parseInt(role_id));
        String[] users = user_ids.split(",");
        for (int i = 0; i < users.length; i++) {
            userRole.setUserRoleId(null);
            userRole.setUserId(Integer.parseInt(users[i]));
            if ("add".equals(flag)) {
                sysUserRoleService.saveUserRole(userRole);
            } else {
                sysUserRoleService.update(userRole);
            }
        }
        renderJson();
    }

    /**
     * 获取平台所有角色下的用户
     */
    public void getUserWithRoleList(){
        renderJson(Format.layuiPage(paginate(getParaToInt("page", 1),getParaToInt("limit", 10),Kv.by("plat_id",getPara("plat_id",getSessionAttr("plat_id"))).set("role_id",getPara("role_id")),"system.getUserWithRoleList")));
    }

    /**
     * 系统设置
     */
    public void sysSetting() {
        setAttr("setting", sysSettingService.findOne());
        setAttr("province", getProvinceList());
        render("sysSetting.html");
    }

    /**
     * 全局配置保存图片
     */
    public void uploadImg() {
        UploadFile uploadFile = getFile();
        String type = getPara("type");
        SysSetting sysSetting = sysSettingService.findOne();
        if (sysSetting.getSettingId() != null) {
            sysSetting.set(type, uploadFile.getFileName());
            sysSettingService.update(sysSetting);
        } else {
            sysSetting.set(type, uploadFile.getFileName());
            sysSettingService.save(sysSetting);
        }
        renderJson(Format.result(uploadFile.getFileName()));
    }

    /**
     * 保存全局配置信息
     */
    public void sysSettingSave() {
        SysSetting sysSetting = getModel(SysSetting.class, "sysSetting");
        if (sysSetting.getSettingId() != null) {
            sysSettingService.update(sysSetting);
        } else {
            sysSettingService.save(sysSetting);
        }
        renderJson();
    }


    /**
     * 站点管理
     */
    public void systemOrg() {
        render("orgManager.html");
    }

    /**
     * 站点编辑
     */
    public void addOrg() {
        String site_id = getPara("site_id", "");
        String parent_site_id = getPara("parent_site_id", "");
        if (!ValidateKit.isNullOrEmpty(site_id)) {
            setAttr("siteInfo", siteInfoService.findById(site_id));
        }
        if (!ValidateKit.isNullOrEmpty(parent_site_id)) {
            String site_name = siteInfoService.findById(parent_site_id).getSiteName();
            setAttr("site_name", site_name);
        }
        setAttr("parent_site_id", parent_site_id);
        setAttr("province", getProvinceList());
        render("addOrg.html");
    }

    /**
     * 保存机构信息
     */
    public void siteInfoSave() {
        SiteInfo siteInfo = getModel(SiteInfo.class, "siteInfo");
        if (siteInfo.getStatus() == null) {
            siteInfo.setStatus(0);
        }
        if (siteInfo.getSiteId() != null) {
            siteInfoService.update(siteInfo);
        } else {
            siteInfoService.save(siteInfo);
        }
        redirect("/system/systemOrg");
    }

    /**
     * 获取一级机构信息
     */
    public void getOrgList() {
        String status = getPara("status", "");
        List list = siteInfoService.getOrgList("", status);
        renderJson(Format.listTolayuiPage(list));
    }

    /**
     * 获取二级机构信息
     */
    public void getChildOrgList() {
        String status = getPara("status", "");
        String parent_site_id = getPara("parent_site_id");
        if ("".equals(parent_site_id)) {
            renderJson(Format.layuiPage(null));
        } else {
            List list = siteInfoService.getOrgList(parent_site_id, status);
            renderJson(Format.listTolayuiPage(list));
        }
    }

    /**
     * 验证以及机构是否包含二级机构
     */
    public void checkOrgHasChild() {
        String site_ids = getPara("site_ids");
        String[] siteIdArr = site_ids.split(",");
        boolean flag = true;
        for (String site_id : siteIdArr) {
            List siteList = siteInfoService.findOrgSite(site_id);
            if (siteList.size() != 0) {
                flag = false;
            }
        }
        renderJson(flag);
    }

    /**
     * 删除机构信息
     */
    public void deleteOrg() {
        String site_ids = getPara("site_ids");
        String[] siteIdArr = site_ids.split(",");
        for (String site_id : siteIdArr) {
            siteInfoService.delete(site_id);
        }
        renderJson();
    }


    /**
     * 给角色分配机构
     */
    public void allotRoleOrg() {
        String role_id = getPara("role_id");
        setAttr("role_id", role_id);
        render("allotRoleOrg.html");
    }

    /**
     * 获取角色所属机构
     */
    public void getRoleOrgList() {
        String role_id = getPara("role_id");
        List list = sysRoleSiteService.getRoleSiteList("", role_id);
        renderJson(Format.listTolayuiPage(list));
    }

    /**
     * 获取角色二级机构
     */
    public void getRoleChildOrgList() {
        String role_id = getPara("role_id");
        String parent_site_id = getPara("parent_site_id");
        if ("".equals(parent_site_id)) {
            renderJson(Format.layuiPage(null));
        } else {
            List list = sysRoleSiteService.getRoleSiteList(parent_site_id, role_id);
            renderJson(Format.listTolayuiPage(list));
        }
    }

    /**
     * 获取角色站点
     */
    public void getRoleSitesByParentSite() {
        String role_id = getPara("role_id");
        String parent_site_id = getPara("parent_site_id");
        String roleSitesByParentSite = sysRoleSiteService.getRoleSitesByParentSite(parent_site_id, role_id);
        Map result = new HashMap();
        result.put("site_ids", roleSitesByParentSite);
        renderJson(result);
    }

    /**
     * 保存角色与站点关联信息
     */
    public void saveRoleSite() {
        String flag = getPara("flag");
        String role_id = getPara("role_id");
        String site_id = getPara("site_id");
        String parent_site_id = getPara("parent_site_id");
        SysRoleSite sysRoleSite = getModel(SysRoleSite.class, "sysRoleSite");
        sysRoleSite.setParentSiteId(Integer.parseInt(parent_site_id));
        sysRoleSite.setRoleId(Integer.parseInt(role_id));
        sysRoleSite.setSiteId(Integer.parseInt(site_id));
        if ("add".equals(flag)) {
            if (sysRoleSiteService.findRoleSite(sysRoleSite).size() == 0) {
                sysRoleSiteService.save(sysRoleSite);
            }
        } else {
            sysRoleSiteService.update(sysRoleSite);
        }
        renderJson();
    }

    /**
     * 保存角色所有站点
     */
    public void saveRoleSiteAll() {
        String flag = getPara("flag");
        String role_id = getPara("role_id");
        String parent_site_id = getPara("parent_site_id");
        SysRoleSite sysRoleSite = getModel(SysRoleSite.class, "sysRoleSite");
        sysRoleSite.setParentSiteId(Integer.parseInt(parent_site_id));
        sysRoleSite.setRoleId(Integer.parseInt(role_id));
        if ("add".equals(flag)) {
            List list = siteInfoService.getOrgList(parent_site_id, "1");
            for (Object object : list) {
                SiteInfo siteInfo = (SiteInfo) object;
                sysRoleSite.setSiteId(siteInfo.getSiteId());
                if (sysRoleSiteService.findRoleSite(sysRoleSite).size() == 0) {
                    sysRoleSiteService.save(sysRoleSite);
                }
            }
        } else {
            sysRoleSiteService.updateAll(sysRoleSite);
        }
        renderJson();
    }

    /**
     * 根据上级站点获取子站点
     *
     * @param parent_site_id 父站点ID
     * @return
     */
    public List getSiteList(String parent_site_id) {
        List list = siteInfoService.getOrgList(parent_site_id, "1");
        return list;
    }

    /**
     * 获取系统平台列表
     *
     * @param plat_id 平台ID
     * @return
     */
    public List getPlatList(String plat_id) {
        List list = sysPlatService.getSysplatById(plat_id);
        return list;
    }

    /**
     * ajax获取二级站点列表
     */
    public void getChildSiteListForPage() {
        String parent_site_id = getPara("parent_site_id", "");
        List list = siteInfoService.getOrgList(parent_site_id, "1");
        renderJson(list);
    }

    /**
     * 添加机构管理员
     */
    public void addOrgManager() {
        String site_ids = getPara("site_ids", "");
        String[] arr_site_id = site_ids.split(",");
        Integer count = 0;
        SiteInfo siteInfo = new SiteInfo();
        SysUser sysUser = new SysUser();
        for (String site_id : arr_site_id) {
            siteInfo = siteInfoService.findById(site_id);
            if (siteInfo.getStatus() == 1) {
                List userList = sysUserService.findUserBySite(site_id);
                sysUser.setUserName(siteInfo.getSiteName());
                sysUser.setStatus(1);
                sysUser.setCreateTime(getNowDate());
                sysUser.setLoginName(siteInfo.getSiteCode());
                sysUser.setPassword(siteInfo.getSiteCode());
                sysUser.setParentSiteId(siteInfo.getSiteId());
                sysUser.setSiteId(null);
                sysUser.setMobile(siteInfo.getTelphone());
                sysUser.setQq(siteInfo.getLinkQq());
                if (userList.size() > 0) {
                    sysUser.setUserId(((SysUser) userList.get(0)).getUserId());
                    sysUserService.update(sysUser);
                } else {
                    sysUserService.save(sysUser);
                }
                count++;
            }
        }
        renderJson(count);
    }

    /**
     * 项目管理
     */
    public void projectManager() {
        String module_id = getPara("module_id", "");
//        List moduleList = sysModuleService.getModuleList("","");
        List moduleList = pmModuleService.getModuleList();
        if (ValidateKit.isNullOrEmpty(module_id)) {
            if (moduleList.size() > 0) {
                module_id = ((PmModule) moduleList.get(0)).getModuleId().toString();
            }
        }
        setAttr("moduleList", moduleList);
        setAttr("module_id", module_id);
        render("projectManager.html");
    }

    /**
     * 系统工具
     */
    public void systemTool() {
        render("systemTool.html");
    }

    /**
     * 项目管理--获取模块列表
     */
    public void queryPmTableList() {
        String module_id = getPara("module_id", "");
        if (ValidateKit.isNullOrEmpty(module_id)) {
            renderJson(Format.layuiPage(null));
        } else {
            renderJson(Format.layuiPage(pmTableService.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), module_id, "")));
        }
    }

    /**
     * 添加模块
     */
    public void addPmTable() {
        String module_id = getPara("module_id", "");
        String table_id = getPara("table_id", "");
        setAttr("module_id", module_id);
        List moduleList = pmModuleService.getModuleList();
        if (moduleList.isEmpty()) {
            render("projectManager.html");
        } else {
            if (!ValidateKit.isNullOrEmpty(table_id)) {
                PmTable pmTable = pmTableService.findById(table_id);
                setAttr("pmTable", pmTable);
            }
            setAttr("moduleList", moduleList);
            render("addPmTable.html");
        }
    }

    /**
     * 保存模块
     */
    public void addPmTableSave() {
        PmTable pmTable = getModel(PmTable.class, "pmTable");
        if (ValidateKit.isNullOrEmpty(pmTable.getStatus())) {
            pmTable.setStatus(0);
        }
        if (ValidateKit.isNullOrEmpty(pmTable.getIsView())) {
            pmTable.setIsView(0);
        }
        if (ValidateKit.isNullOrEmpty(pmTable.getTableId())) {
            pmTable.setCreateTime(getNowDate());
            pmTable.setCreator(getUserInfo().getUserName());
            pmTableService.save(pmTable);
        } else {
            pmTableService.update(pmTable);
        }
        redirect("/system/projectManager?module_id=" + pmTable.getModuleId());
    }

    /**
     * 删除模块
     */
    public void deletePmTable() {
        String table_ids = getPara("table_ids");
        String[] arr_table_id = table_ids.split(",");
        for (String table_id : arr_table_id) {
            pmTableService.delete(table_id);
        }
        renderJson();
    }

    /**
     * 数据库表名验重
     */
    public void findTableByName() {
        List<PmTable> table_name = pmTableService.findByTableName(getPara("table_name"), getPara("table_id", ""));
        if (table_name.size() > 0) {
            renderJson(false);
        } else {
            renderJson(true);
        }
    }

    /**
     * 数据库表字段管理页
     */
    public void tableFields() {
        String table_id = getPara("table_id", "");
        String module_id = getPara("module_id", "");
        setAttr("tableList", pmTableService.findTableList(module_id));
        setAttr("table_id", table_id);
        setAttr("module_id", module_id);
        render("tableFieldsManager.html");
    }

    /**
     * 获取数据表所有字段列表
     */
    public void queryPmFieldList() {
        String table_id = getPara("table_id", "");
        if (ValidateKit.isNullOrEmpty(table_id)) {
            renderJson(Format.layuiPage(null));
        } else {
//            renderJson(Format.layuiPage(pmFieldService.paginate(getParaToInt("page",1),getParaToInt("limit",10),table_id,"")));
            renderJson(Format.listTolayuiPage(pmFieldService.getPmFieldList(table_id)));
        }
    }

    /**
     * 编辑字段信息页
     */
    public void addPmField() {
        String table_id = getPara("table_id", "");
        String field_id = getPara("field_id", "");
        String module_id = getPara("module_id", "");
        setAttr("table_id", table_id);
        setAttr("table_name", pmTableService.findById(table_id).getTableName());
        if (!ValidateKit.isNullOrEmpty(field_id)) {
            setAttr("pmField", pmFieldService.findById(field_id));
        }
        setAttr("module_id", module_id);
        render("addTableFields.html");
    }

    /**
     * 字段名验重
     */
    public void checkFieldName() {
        String field_name = getPara("field_name");
        String table_id = getPara("table_id");
        String field_id = getPara("field_id", "");
        List<PmField> fieldList = pmFieldService.findFieldByName(field_name, table_id, field_id);
        if (fieldList.size() == 0) {
            renderJson(true);
        } else {
            renderJson(false);
        }
    }

    /**
     * 添加字段
     */
    public void addPmFiedSave() {
        PmField pmField = getModel(PmField.class, "pmField");
        if (pmField.getStatus() == null) {
            pmField.setStatus(0);
        }
        if (pmField.getListPageShow() == null) {
            pmField.setListPageShow(0);
        }
        if (pmField.getFieldIskey() == null) {
            pmField.setFieldIskey(0);
        }
        if (pmField.getDbAutoIncrement() == null) {
            pmField.setDbAutoIncrement(0);
        }
        if (pmField.getFieldAutoIncrement() == null) {
            pmField.setFieldAutoIncrement(0);
        }
        if (pmField.getFieldUnique() == null) {
            pmField.setFieldUnique(0);
        }
        if (pmField.getFieldIsnullable() == null) {
            pmField.setFieldIsnullable(0);
        }
        if (pmField.getFieldId() == null) {
            String maxOrderCode = pmFieldService.getMaxOrderCode();
            if (ValidateKit.isNullOrEmpty(maxOrderCode)) {
                maxOrderCode = "0";
            }
            pmField.setOrderCode(Integer.parseInt(maxOrderCode) + 1);
            pmFieldService.save(pmField);
        } else {
            pmFieldService.update(pmField);
        }
        Integer table_id = pmField.getTableId();
        Integer module_id = pmTableService.findById(String.valueOf(table_id)).getModuleId();
        redirect("/system/tableFields?module_id=" + module_id + "&table_id=" + table_id);
    }

    /**
     * 删除字段
     */
    public void deletePmField() {
        String field_ids = getPara("field_ids");
        String[] arr_field_id = field_ids.split(",");
        for (String field_id : arr_field_id) {
            pmFieldService.delete(field_id);
        }
        renderJson();
    }

    /**
     * 移动字段顺序
     */
    public void moveField() {
        Integer f1 = getParaToInt("f1");
        Integer c1 = getParaToInt("c1");
        Integer f2 = getParaToInt("f2");
        Integer c2 = getParaToInt("c2");
        pmFieldService.updateOrderCode(f1, c2);
        pmFieldService.updateOrderCode(f2, c1);
        renderJson();
    }

    /**
     * 根据数据库表生成代码
     */
    public void tableCode() {
        try {
            String type = getPara("type", "databaseSql");
            String table_id = getPara("table_id");
            PmTable table = pmTableService.findById(table_id);
            List<PmField> tableFields = pmFieldService.findList(table_id);
            String pk_name = pmFieldService.findPrimaryKeyName(table_id);
            String module_url = pmTableService.finModuleUrlWithTable(table_id);
            StringBuffer code = new StringBuffer();
            if ("databaseSql".equals(type)) {
                code = CodeUtil.createTableSql(table, tableFields);
            }
            if ("tableService".equals(type)) {
                code = CodeUtil.createTableService(table, pk_name);
            }
            if ("tableController".equals(type)) {
                code = CodeUtil.createTableController(table, pk_name);
            }
            if ("tablePropPage".equals(type)) {
                code = CodeUtil.createTablePropPage(table, module_url, tableFields);
            }
            if ("tableListPage".equals(type)) {
                code = CodeUtil.createTableListPage(table, module_url, tableFields, pk_name);
            }
            setAttr("code", code);
            setAttr("type", type);
            setAttr("table_id", table_id);
            setAttr("module_id", table.getModuleId());
            render("tableCode.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 列表索引
     */
    public void tableIndex() {
        String table_id = getPara("table_id");
        setAttr("table_id", table_id);
        setAttr("table_name", pmTableService.findById(table_id).getTableName());
        setAttr("fieldList", pmFieldService.findList(table_id));
        render("tableIndexManager.html");
    }

    /**
     * 系统平台管理页
     */
    public void sysPlat() {
        render("sysPlat.html");
    }

    /**
     * ajax获取系统平台
     */
    public void getSysPlatList() {
        renderJson(sysPlatService.getSysplatList());
    }

    /**
     * 编辑系统平台信息
     */
    public void addOrUpdateSysPlat() {
        String plat_id = getPara("plat_id", "");
        SysPlat sysPlat = getModel(SysPlat.class, "sysPlat");
        if (!ValidateKit.isNullOrEmpty(plat_id)) {
            sysPlat = sysPlatService.findById(plat_id);
        }
        setAttr("sysPlat", sysPlat);
        render("sysPlatDetail.html");
    }

    /**
     * 保存系统平台信息
     */
    public void saveSysPlat() {
        SysPlat sysPlat = getModel(SysPlat.class, "sysPlat");
        if (ValidateKit.isNullOrEmpty(sysPlat.getStatus())) {
            sysPlat.setStatus(0);
        }
        if (sysPlat.getPlatId() == null) {
            sysPlatService.save(sysPlat);
        } else {
            sysPlatService.update(sysPlat);
        }
        redirect("/system/sysPlat");
    }

    /**
     * 删除系统平台
     */
    public void deleteSysPlat() {
        String plat_id = getPara("plat_id");
        sysPlatService.delete(plat_id);
        renderJson();
    }

    /**
     * 系统平台名验重
     */
    public void checkPlatName() {
        String plat_name = getPara("plat_name");
        String plat_id = getPara("plat_id", "");
        List sysplatByName = sysPlatService.getSysplatByName(plat_name, plat_id);
        if (sysplatByName.size() > 0) {
            renderJson(false);
        } else {
            renderJson(true);
        }
    }


    /**
     * 模块管理页
     */
    public void pmModule() {
        render("pmModule.html");
    }

    /**
     * 获取模块列表
     */
    public void getPmModuleList() {
        renderJson(Format.layuiPage(pmModuleService.paginate(getParaToInt("page", 1), getParaToInt("limit", 10))));
    }

    /**
     * 编辑模块信息
     */
    public void addOrUpdatePmModule() {
        String module_id = getPara("module_id", "");
        PmModule pmModule = getModel(PmModule.class, "pmModule");
        if (!ValidateKit.isNullOrEmpty(module_id)) {
            pmModule = pmModuleService.findById(module_id);
        }
        setAttr("pmModule", pmModule);
        render("pmModuleDetail.html");
    }

    /**
     * 保存模块
     */
    public void savePmModule() {
        PmModule pmModule = getModel(PmModule.class, "pmModule");
        if (ValidateKit.isNullOrEmpty(pmModule.getModuleId())) {
            pmModuleService.save(pmModule);
        } else {
            pmModuleService.update(pmModule);
        }
        pmModule();
    }

    /**
     * 删除模块
     */
    public void deletePmModule() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            pmModuleService.delete(id);
        }
        renderJson();
    }

    /**
     * 数据字典
     */
    public void dataDictionary() {
        String table_ids = getPara("table_ids");
        String[] arr_table_id = table_ids.split(",");
        List tables = new ArrayList();
        for (String table_id : arr_table_id) {
            Map tableMsg = new HashMap();
            PmTable table = pmTableService.findById(table_id);
            List<Record> fieldList = pmFieldService.getPmFieldList(table_id);
            tableMsg.put("table", table);
            tableMsg.put("fieldList", fieldList);
            tables.add(tableMsg);
        }
        setAttr("tables", tables);
        render("dataDictionary.html");
    }

    /**
     * 获取sys_code表中的码值列表
     */
    public void getCodeFromSys_code() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = CommonController.getCond(paraMap);
        Page code = paginate(getParaToInt("page", 1), getParaToInt("limit", 100), cond, "system.getCodeList");
        renderJson(Format.layuiPage(code));
    }


    /**
     * 机构中心管理（new）
     */
    public void orgManagerNew() {
        setAttr("province", getProvinceList());
        setAttr("topSite", getPlatTopSite());
        render("orgManagerNew.html");
    }

    public void getOrgTree() {
        //构建机构树
        Map tree = new HashMap();
        tree.put("orgTree", siteInfoService.getOrgTree(getPara("field", "id"), getSessionAttr("plat_id")));
        renderJson(tree);
    }

    public void getSiteMsg() {
        Record siteInfo = record(getCond(getParaMap()), "system.getSiteMsg");
        renderJson(siteInfo);
    }

    /**
     * 保存机构信息（new）
     */
    public void siteInfoSaveNew() {
        SiteInfo siteInfo = getModel(SiteInfo.class, "siteInfo");
        if (siteInfo.getStatus() == null) {
            siteInfo.setStatus(0);
        }
        if (siteInfo.getSiteId() != null) {
            siteInfoService.update(siteInfo);
        } else {
            siteInfoService.save(siteInfo);
        }
        redirect("/system/orgManagerNew");
    }

    /**
     * 机构名验重
     */
    public void checkSiteName() {
        List siteMsg = records(getCond(getParaMap()), "system.checkSiteName");
        if (siteMsg.size() > 0) {
            renderJson(false);
        } else {
            renderJson(true);
        }
    }

    public void changePassword() {
        render("changePassword.html");
    }

    final Base64.Decoder decoder = Base64.getDecoder();
    public void confirmChangingPassword() throws UnsupportedEncodingException {
        String newPassword = getPara("newPassword");
        String newPassword2 = getPara("newPassword2");
        String oldPassword = getPara("oldPassword");
        SysUser user = getUserInfo();
        if (ValidateKit.isNullOrEmpty(newPassword) || ValidateKit.isNullOrEmpty(newPassword2) || ValidateKit.isNullOrEmpty(oldPassword)) {
            renderJson("data", "请完善密码信息，谢谢!");
            return;
        }
        newPassword=new String(decoder.decode(newPassword), "UTF-8");
        newPassword2=new String(decoder.decode(newPassword2), "UTF-8");
        oldPassword=new String(decoder.decode(oldPassword), "UTF-8");
        if (!oldPassword.equals(AESUtil.AESDncode(user.getPassword()))) {
            renderJson("data", "原密码输入错误!");
            return;
        }
        if (!(newPassword.equals(newPassword2))) {
            renderJson("data", "两次输入密码不同，请重新输入，谢谢!");
            return;
        }
        if (newPassword.equals(oldPassword)) {
            renderJson("data", "新密码和原密码相同了，请重新输入，谢谢!");
            return;
        }
        if (!newPassword.matches("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,18}$")) {
            renderJson("data", "密码必须由6-18位的数字字符组成，谢谢！");
            return;
        }
        user.setPassword(AESUtil.AESEncode(newPassword));
        user.update();
        renderJson("data", "");
    }

}
