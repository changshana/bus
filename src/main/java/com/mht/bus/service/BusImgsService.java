package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusAa01;
import com.mht.common.model.BusImgs;
import com.mht.common.service.CommonService;

import java.util.List;

public class BusImgsService extends CommonService {
    public static final BusImgsService me=new BusImgsService();
    public static final BusImgs dao=new BusImgs().dao();

    public BusImgs findById(String id){
        return dao.findById(id);
    }
    public void save(BusImgs busImgs){
        busImgs.save();
    }
    public void update(BusImgs busImgs){
        busImgs.update();
    }
    public void delete(String id){
        dao.deleteById(id);
        Db.update("delete from Bus_imgs where aaa001=?",Integer.parseInt(id));
    }

    public BusImgs findByAaa002(Integer aca030) {
        return dao.findFirst("SELECT * from bus_imgs where aaa002 = ?",aca030);
    }
}