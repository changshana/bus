package com.mht.bus.service;

import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.BusCa05;
import com.mht.common.service.CommonService;

/**
 * @auther Ranbo
 * 2019/4/4 11:03
 */
public class BusCa05Service extends CommonService {
    public static final BusCa05Service me=new BusCa05Service();
    public static final BusCa05 dao=new BusCa05().dao();
    public Page<BusCa05> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `bus_ca05`");
    }
    public BusCa05 findById(String id){
        return dao.findById(id);
    }
    public void save(BusCa05 busCa05){
        busCa05.save();
    }
    public void update(BusCa05 busCa05){
        busCa05.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
}
