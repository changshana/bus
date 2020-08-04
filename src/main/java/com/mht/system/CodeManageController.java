package com.mht.system;


import cn.dreampie.ValidateKit;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.mht.common.CommonController;
import com.mht.common.model.SysCode;
import com.mht.common.utils.Format;
import com.mht.system.service.SysCodeService;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ranbo
 */
public class CodeManageController extends CommonController {

    public static final SysCodeService sysCodeService=SysCodeService.me;

    /**
     * 跳转主页面
     */
    public void codeManage(){
        render("codeManage.html");
    }

    /**
     * 查询码值种类
     */
    public void getCodeType(){
        Page code= SysCodeService.getCodeTypeListPage(1,100);
        renderJson(Format.layuiPage(code));
    }

    /**
     * 查询码值列表
     */
    public void getCodeList(){

        String search_param=getPara("search_param","").toUpperCase();
        String status=getPara("status","");
        String codeType=getPara("code_type","").toUpperCase();
        Map searchParam=new HashMap();
        searchParam.put("codeType",codeType);
        searchParam.put("status",status);
        searchParam.put("search_param",search_param);
        setAttr("searchParam",searchParam);
        Page pages =sysCodeService.getCodeList(getParaToInt("page",1),getParaToInt("limit",10),search_param,codeType,status);
        renderJson(Format.layuiPage(pages));

    }

    /**
     * 批量启用/禁用
     */
    public void changeItemsStatus(){
        String code_ids=getPara("code_ids","");
        String status=getPara("status","");
        if(!ValidateKit.isNullOrEmpty(code_ids)){
            String[] codeIdArr=code_ids.split(",");
            for(String codeId:codeIdArr){
                sysCodeService.updateStatus(codeId,status);
            }
        }
        renderJson();
    }

    /**
     * 批量删除
     */
    public void delete(){
        String code_ids=getPara("code_ids","");
        String[] codeIdArr=code_ids.split(",");
        if(!ValidateKit.isNullOrEmpty(code_ids)){
            for(String code_id:codeIdArr){
                sysCodeService.delete(Integer.parseInt(code_id));
            }
        }
        renderJson();
    }

    /**
     * 新增或修改一条记录
     */
    public void  addSysCode(){
        SysCode sysCode=getModel(SysCode.class,"sysCode",true);
        String code_type=sysCode.getCodeType();
        if(!ValidateKit.isNullOrEmpty(code_type)){
            sysCode.setCodeType(code_type.toUpperCase());
        }
        if(ValidateKit.isNullOrEmpty(sysCode.getId())){//新增
            sysCodeService.save(sysCode);
        }else{//修改
            sysCodeService.update(sysCode);
        }
        String iframe=getPara("iframe","");
        if(ValidateKit.isNullOrEmpty(iframe)){
            redirect("/code/codeManage");
        }else{
            renderJson();
        }

    }

    /**
     * 跳转到添加/编辑问答记录页面
     */
    public void toAdd(){
        String code_id=getPara("code_id","");
        if(!ValidateKit.isNullOrEmpty(code_id)){
            SysCode sysCode = sysCodeService.findById(Integer.parseInt(code_id));
            setAttr("sysCode",sysCode);
        }else{
            String code_type=getPara("code_type","");
            String code_name=getPara("code_name","");
            String iframe=getPara("iframe","");
            Map initParam=new HashMap();
            initParam.put("code_type",code_type);
            initParam.put("iframe",iframe);
            initParam.put("code_name",code_name);
            setAttr("sysCode",initParam);
        }
        render("addSysCode.html");
    }

}
