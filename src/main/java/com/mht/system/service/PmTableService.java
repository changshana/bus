package com.mht.system.service;

import java.util.List;

import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.model.PmTable;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class PmTableService extends CommonService {

    public static final PmTableService me=new PmTableService();

    public static final PmTable pmTableDao=new PmTable().dao();


    public Page<PmTable> paginate(int pageNumber, int pageSize,String module_id, String search_param) {
        String filter="";
        if(!"".equals(search_param)){
            filter+=" and a.table_name like '%"+search_param+"%' ";
        }
        return pmTableDao.paginate(pageNumber, pageSize, "select a.*," +
                "(SELECT count(1) FROM information_schema. TABLES WHERE table_schema = '"+ PropKit.get("jdbcName")+"' and table_name=a.table_name) as is_exist",
                "FROM `pm_table` a where a.module_id="+module_id+filter+" order by a.create_time");
    }



    public PmTable findById(String id){
        return pmTableDao.findById(id);
    }

    public void delete(String id){
        Db.update("delete from pm_table where table_id="+id);
    }

    public void save(PmTable pmTable){
        pmTable.save();
    }

    public void update(PmTable pmTable) {
        pmTable.update();
    }

    public List<PmTable> findByTableName(String table_name,String table_id){
        if(table_id.isEmpty()){
            return pmTableDao.find("select * from pm_table where table_name = '"+table_name+"'");
        }else{
            return pmTableDao.find("select * from pm_table where table_name = '"+table_name+"' and table_id != "+table_id);
        }
    }

    public List<PmTable> findTableList(String module_id){
        return pmTableDao.find("select * from pm_table where module_id = "+module_id);
    }

    public String finModuleUrlWithTable(String table_id) {
        List<Record> records = Db.find("select page from sys_module where module_id=(select module_id from pm_table where table_id=" + table_id + ")");
        if(records.size()>0){
            String url=records.get(0).getStr("page");
            return url==null?"":url.substring(0,url.lastIndexOf("/"));
        }else{
            return "";
        }
    }
}
