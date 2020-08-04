package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusAa04;
import com.mht.common.service.CommonService;

/**
 * @author Ranbo
 * 2019/4/30 15:21
 */
public class BusAa04Service extends CommonService {
    public static final BusAa04Service me=new BusAa04Service();
    public static final BusAa04 dao=new BusAa04().dao();
    public Page<BusAa04> paginate(int pageNumber, int pageSize,Kv cond) {
        SqlPara sqlpara=dao.getSqlPara("bus.getAa04list",cond);
        return dao.paginate(pageNumber, pageSize, sqlpara);
    }
    public BusAa04 findById(String id){
        return dao.findById(id);
    }
    public void save(BusAa04 busAa04){
        busAa04.save();
    }
    public void update(BusAa04 busAa04){
        busAa04.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
}
