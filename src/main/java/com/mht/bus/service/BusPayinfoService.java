package com.mht.bus.service;

import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.BusPayinfo;
import com.mht.common.service.CommonService;

/**
 * @auther Ranbo
 * 2019/3/28 14:11
 */
public class BusPayinfoService extends CommonService {
    public static final BusPayinfoService me=new BusPayinfoService();
    public static final BusPayinfo dao=new BusPayinfo().dao();
    public Page<BusPayinfo> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `bus_payInfo`");
    }
    public BusPayinfo findById(String id){
        return dao.findById(id);
    }
    public void save(BusPayinfo busPayinfo){
        busPayinfo.save();
    }
    public void update(BusPayinfo busPayinfo){
        busPayinfo.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
}