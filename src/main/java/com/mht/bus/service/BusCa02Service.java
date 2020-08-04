package com.mht.bus.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.BusCa02;
import com.mht.common.service.CommonService;

public class BusCa02Service extends CommonService {
    public static final BusCa02Service me=new BusCa02Service();
    public static final BusCa02 dao=new BusCa02().dao();
    public Page<BusCa02> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `bus_ca02`");
    }
    public BusCa02 findById(String id){
        return dao.findById(id);
    }
    public void save(BusCa02 busCa02){
        busCa02.save();
    }
    public void update(BusCa02 busCa02){
        busCa02.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }

    public void delBusAndPerson(Integer aaa020,String aaa001){
        Db.update("delete from bus_ca02 where aaa020=? and aaa001=?",aaa020,aaa001);
    }

    public void delByPerson(String aaa020){
        Db.update("delete from bus_ca02 where aaa020=?",aaa020);
    }
}