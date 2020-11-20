package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusAa01;
import com.mht.common.model.BusPrice;
import com.mht.common.service.CommonService;

public class BusPriceService extends CommonService {
    public static final BusPriceService me=new BusPriceService();
    public static final BusPrice dao=new BusPrice().dao();
    public BusPrice findById(String id){
        return dao.findById(id);
    }
    public void save(BusPrice busPrice){
        busPrice.save();
    }
    public void update(BusPrice busPrice){
        busPrice.update();
    }

    public BusPrice findFirst(){
        return dao.findFirst("SELECT * from bus_price");
    }

}