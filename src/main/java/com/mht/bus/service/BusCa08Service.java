package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusCa08;
import com.mht.common.service.CommonService;

/**
 * ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 *
 * @author Ranbo
 * 2019/12/23 9:30
 */
public class BusCa08Service extends CommonService {
    public static final BusCa08Service me=new BusCa08Service();
    public static final BusCa08 dao=new BusCa08().dao();
    public Page paginate(int pageNumber, int pageSize,Kv cond) {
        SqlPara sqlPara= Db.getSqlPara("bus.getBusCa08List",cond);
        return Db.paginate(pageNumber, pageSize, sqlPara);
    }
    public BusCa08 findById(String id){
        return dao.findById(id);
    }
    public void save(BusCa08 busCa08){
        busCa08.save();
    }
    public void update(BusCa08 busCa08){
        busCa08.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
    public BusCa08 getCa08ByAccount(String identity,String account ){
        return dao.findFirst("select * from bus_ca08 where aca084=? and aca081=? and aaa996=1",identity,account);
    }
}
