package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusAa01;
import com.mht.common.service.CommonService;

public class BusAa01Service extends CommonService {
    public static final BusAa01Service me=new BusAa01Service();
    public static final BusAa01 dao=new BusAa01().dao();
    public Page<BusAa01> paginate(int pageNumber, int pageSize, Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusAa01List", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public Page<BusAa01> paginate1(int pageNumber, int pageSize, Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusOrderAa01List", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public BusAa01 findById(String id){
        return dao.findById(id);
    }
    public void save(BusAa01 busAa01){
        busAa01.save();
    }
    public void update(BusAa01 busAa01){
        busAa01.update();
    }
    public void delete(String id){
        dao.deleteById(id);
        Db.update("delete from bus_ca02 where aaa001=?",Integer.parseInt(id));
    }

}