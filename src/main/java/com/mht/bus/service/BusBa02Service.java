package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusBa02;
import com.mht.common.service.CommonService;

public class BusBa02Service extends CommonService {
    public static final BusBa02Service me=new BusBa02Service();
    public static final BusBa02 dao=new BusBa02().dao();
    public Page<BusBa02> paginate(int pageNumber, int pageSize, Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusBa02List", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public BusBa02 findById(String id){
        return dao.findById(id);
    }
    public void save(BusBa02 busBa02){
        busBa02.save();
    }
    public void update(BusBa02 busBa02){
        busBa02.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
    public void updateStatus(String id){
        updateSql("bus.updateBusType", Kv.by("aba020",id));
    }
}