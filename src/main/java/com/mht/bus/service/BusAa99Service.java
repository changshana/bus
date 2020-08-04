package com.mht.bus.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusAa99;
import com.mht.common.service.CommonService;

public class BusAa99Service extends CommonService {
    public static final BusAa99Service me=new BusAa99Service();
    public static final BusAa99 dao=new BusAa99().dao();
    public Page<BusAa99> paginate(int pageNumber, int pageSize) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusAa99List");
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public BusAa99 findById(String id){
        return dao.findById(id);
    }
    public void save(BusAa99 busAa99){
        busAa99.save();
    }
    public void update(BusAa99 busAa99){
        busAa99.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
}