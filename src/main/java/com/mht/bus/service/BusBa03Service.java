package com.mht.bus.service;

import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.BusBa03;
import com.mht.common.service.CommonService;

public class BusBa03Service extends CommonService {
    public static final BusBa03Service me = new BusBa03Service();
    public static final BusBa03 dao = new BusBa03().dao();

    public Page<BusBa03> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *,(select count(0) from bus_ba01 b where a.aba030=b.aba030) as count,aba002 ", "FROM `bus_ba03` a left join bus_ba02 c on c.aba020=a.aba020");
    }

    public BusBa03 findById(String id) {
        return dao.findById(id);
    }

    public void save(BusBa03 busBa03) {
        busBa03.save();
    }

    public void update(BusBa03 busBa03) {
        busBa03.update();
    }

    public void delete(String id) {
        dao.deleteById(id);
    }
}