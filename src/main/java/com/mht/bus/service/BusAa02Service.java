package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusAa02;
import com.mht.common.model.BusBa02;
import com.mht.common.service.CommonService;

import java.util.Date;
import java.util.List;

public class BusAa02Service extends CommonService {
    public static final BusAa02Service me=new BusAa02Service();
    public static final BusAa02 dao=new BusAa02().dao();
    public Page<BusAa02> paginate(int pageNumber, int pageSize , Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusAa02List", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public BusAa02 findById(String id){
        return dao.findById(id);
    }
    public void save(BusAa02 busAa02){
        busAa02.save();
    }
    public void update(BusAa02 busAa02){
        busAa02.update();
    }
    public void delete(String id){
        dao.deleteById(id);
        Db.update("delete from bus_ca02 where aaa020=?",Integer.parseInt(id));
    }
    public Page<BusAa02> busInfoPersonExistencePaginate(int pageNumber, int pageSize , Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusInfoPersonExistence", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public Page<BusAa02> busInfoPersonPaginate(int pageNumber, int pageSize , Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusInfoPerson", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }

    public Page<BusAa02> busInfoTimeExistencePaginate(int pageNumber, int pageSize , Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusInfoTimeExistence", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }

    public Page<BusAa02> busInfoTimePaginate(int pageNumber, int pageSize , Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusInfoTime", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }

    public List<BusBa02> findAll() {
        List<BusBa02> list = Db.query("select * from  bus_ba02");
        return list;
    }


    public BusAa02 findByAca046(String aca046) {
        return dao.findFirst("select * from bus_aa02 where aaa004 = ?",aca046);
    }
}
