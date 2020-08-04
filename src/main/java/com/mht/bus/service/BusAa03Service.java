package com.mht.bus.service;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusAa03;
import com.mht.common.service.CommonService;

/**
 * @auther Ranbo
 * 2019/2/27 16:18
 */
public class BusAa03Service extends CommonService {
    public static final BusAa03Service me=new BusAa03Service();
    public static final BusAa03 dao=new BusAa03().dao();
    public Page<BusAa03> paginate(int pageNumber, int pageSize,Kv cond) {
        SqlPara sqlPara= Db.getSqlPara("bus.getAa03List",cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public BusAa03 findById(String id){
        return dao.findById(id);
    }
    public void save(BusAa03 busAa03){
        busAa03.save();
    }
    public void update(BusAa03 busAa03){
        busAa03.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
    public void changeAaa033(String id,int aaa033){
        BusAa03 busAa03=dao.findById(id);
        if(!ValidateKit.isNullOrEmpty(busAa03)){
            busAa03.setAaa033(aaa033);
            busAa03.update();
        }
    }
}