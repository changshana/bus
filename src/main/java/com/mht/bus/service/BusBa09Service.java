package com.mht.bus.service;

import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.BusBa09;
import com.mht.common.service.CommonService;

import java.util.List;

/**
 * @auther Ranbo
 * 2019/3/13 10:17
 */
public class BusBa09Service extends CommonService {
    public static final BusBa09Service me=new BusBa09Service();
    public static final BusBa09 dao=new BusBa09().dao();
    public Page<BusBa09> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `bus_ba09`");
    }
    public BusBa09 findById(String id){
        return dao.findById(id);
    }
    public void save(BusBa09 busBa09){
        busBa09.save();
    }
    public void update(BusBa09 busBa09){
        busBa09.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
}
