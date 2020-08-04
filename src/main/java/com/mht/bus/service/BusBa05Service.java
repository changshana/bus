package com.mht.bus.service;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.mht.bus.util.BusStaticUtil;
import com.mht.common.model.BusBa05;
import com.mht.common.model.BusPayinfo;
import com.mht.wxPay.MyConfig;
import com.mht.wxPay.WXPay;
import com.mht.wxPay.WXPayConstants;
import com.mht.wxPay.WXPayUtil;

import java.util.HashMap;
import java.util.Map;

public class BusBa05Service {
    public static final BusBa05Service me = new BusBa05Service();
    public static final BusBa05 dao = new BusBa05().dao();

    public Page<BusBa05> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `bus_ba05`");
    }

    public BusBa05 findById(String id) {
        return dao.findById(id);
    }

    public void save(BusBa05 busBa05) {
        busBa05.save();
    }

    public void update(BusBa05 busBa05) {
        busBa05.update();
    }

    public void delete(String id) {
        dao.deleteById(id);
    }
}
