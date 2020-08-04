package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusBa08;
import com.mht.common.service.CommonService;

/**
 * @auther Ranbo
 * 2019/3/5 10:45
 */
public class BusBa08Service extends CommonService {
    public static final BusBa08Service me=new BusBa08Service();
    public static final BusBa08 dao=new BusBa08().dao();
    public Page paginate(int pageNumber, int pageSize,Kv cond) {
        SqlPara sqlPara= Db.getSqlPara("bus.getBusba08DistinctList",cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public Page paginateList(int pageNumber, int pageSize,Kv cond) {
        SqlPara sqlPara= Db.getSqlPara("bus.getBusba08List",cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }

    public BusBa08 findById(String id){
        return dao.findById(id);
    }
    public void save(BusBa08 busBa08){
        busBa08.save();
    }
    public void update(BusBa08 busBa08){
        busBa08.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
}
