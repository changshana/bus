package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.PmModule;

/**
 * @author xionggy ， 2018/3/27.
 */
public class PmModuleService{
    public static final PmModuleService me=new PmModuleService();
    public static final PmModule dao=new PmModule().dao();
    public Page<PmModule> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `pm_module`");
    }
    public PmModule findById(String id){
        return dao.findById(id);
    }
    public void save(PmModule pmModule){
        pmModule.save();
    }
    public void update(PmModule pmModule){
        pmModule.update();
    }
    public void delete(String id){
        Db.update("delete from `pm_module` where module_id="+id);
    }

    public List getModuleList() {
        return dao.find("select * from pm_module order by order_code");
    }
    public String getMaxModuleOrderCode() {
        return Db.queryStr("select max(order_code) as order_code from pm_module");
    }
}