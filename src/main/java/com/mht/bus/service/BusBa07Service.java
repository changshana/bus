package com.mht.bus.service;

import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.BusBa07;

public class BusBa07Service {
    public static final BusBa07Service me = new BusBa07Service();
    public static final BusBa07 dao = new BusBa07().dao();

    public Page<BusBa07> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `bus_ba07`");
    }

    public BusBa07 findById(String id) {
        return dao.findById(id);
    }

    public void save(BusBa07 busBa07) {
        busBa07.save();
    }

    public void update(BusBa07 busBa07) {
        busBa07.update();
    }

    public void delete(String id) {
        dao.deleteById(id);
    }
}
