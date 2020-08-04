package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusCa01;
import com.mht.common.service.CommonService;

public class BusCa01Service extends CommonService {
    public static final BusCa01Service me=new BusCa01Service();
    public static final BusCa01 dao=new BusCa01().dao();
    public Page paginate(int pageNumber, int pageSize,Kv cond) {
        SqlPara sqlPara= Db.getSqlPara("bus.getCa01List",cond);
        return Db.paginate(pageNumber,pageSize,sqlPara);
    }
    public BusCa01 findById(String id){
        return dao.findById(id);
    }
    public void save(BusCa01 busCa01){
        busCa01.save();
    }
    public void update(BusCa01 busCa01){
        busCa01.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
}