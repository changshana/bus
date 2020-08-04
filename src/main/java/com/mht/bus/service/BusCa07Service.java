package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusCa07;
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
 * 2019/9/24 11:00
 */
public class BusCa07Service extends CommonService {
    public static final BusCa07Service me=new BusCa07Service();
    public static final BusCa07 dao=new BusCa07().dao();
    public Page paginate(int pageNumber, int pageSize, Kv cond) {
        SqlPara sqlPara= dao.getSqlPara("bus.getCa07List",cond);
        return Db.paginate(pageNumber, pageSize,sqlPara);
    }
    public BusCa07 findById(String id){
        return dao.findById(id);
    }
    public void save(BusCa07 busCa07){
        busCa07.save();
    }
    public void update(BusCa07 busCa07){
        busCa07.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
}
