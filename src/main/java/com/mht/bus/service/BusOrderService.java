package com.mht.bus.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.BusOrder;
import com.mht.common.service.CommonService;

import java.util.List;

/**
 * Package: com.mht.bus.service
 * Description： TODO
 * Author: 作者
 * Date: Created in 2020/7/20 10:39
 * Company: 公司
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 * Modified By:
 */
public class BusOrderService extends CommonService {
    public static final BusOrderService me = new BusOrderService();
    public static final BusOrder dao = new BusOrder().dao();

    public void save(BusOrder busOrder){
        busOrder.save();
    }

    public void update(BusOrder busOrder){
        busOrder.update();
    }

    public void delete(String id){
        dao.deleteById(id);
        Db.update("delete from bus_order where aaa001=?",Integer.parseInt(id));
    }

    public Page<BusOrder> paginate(int pageNumber, int pageSize, Kv cond) {
        SqlPara sqlPara=dao.getSqlPara("bus.getBusOrderList",cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }

    public Integer findOrders(String openid) {
        //订单审核通过数即为订单数
        List<Object> list = Db.query("select aca030 from bus_order where aza206 = 1 and aca050 = 1 and aca031 = ?",openid);
        return list.size();
    }

    public Integer findOrderProcessing(String openid) {
        List<Object> list = Db.query("select aca030 from bus_order where aza206 = 1 and aca050 = 1 and aaa996 = 1 and aca036 = 1 and aca031 = ?",openid);
        return list.size();
    }

    public BusOrder findById(Integer aca030) {
        BusOrder busOrder = dao.findById(aca030);
        return busOrder;
    }

    public BusOrder findByOpenid(String aca031) {
        BusOrder busOrder = dao.findFirst("select * from bus_order where aca031 = ?", aca031);
        return  busOrder;
    }

}
