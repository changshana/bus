package com.mht.file;

import java.util.ArrayList;
import java.util.List;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.service.CommonService;

import cn.dreampie.ValidateKit;


public class FileService extends CommonService {

    //private static final Log log = Log.getLog(FileService.class);

    public static final FileService me = new FileService();

    public List getExportData(Kv cond){
        List returnList=new ArrayList();
        if(cond.getStr("sqlId").isEmpty()){
            return null;
        }
        SqlPara sqlPara = Db.getSqlPara(cond.getStr("sqlId"), cond);
        if(ValidateKit.isNullOrEmpty(cond.getStr("limit"))||"0".equals(cond.getStr("limit"))){
            returnList=Db.find(sqlPara);
        }else{
            returnList=Db.paginate(Integer.parseInt(cond.getStr("page")), Integer.parseInt(cond.getStr("limit")), sqlPara).getList();
        }
        return returnList;
    }

}