package com.mht.bus.service;

import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.BusBa01;
import com.mht.common.service.CommonService;

public class BusBa01Service extends CommonService {
    public static final BusBa01Service me = new BusBa01Service();
    public static final BusBa01 dao = new BusBa01().dao();

    public Page<BusBa01> paginate(int pageNumber, int pageSize, int aba030) {
        return dao.paginate(pageNumber, pageSize, "select a.*,b.aba007,b.aba008 ", "FROM `bus_ba01` a  left join bus_ba03 b  on a.aba030=b.aba030 where a.aba030=" + aba030);
    }

    public BusBa01 findById(String id) {
        return dao.findById(id);
    }

    public void save(BusBa01 busBa01) {
        busBa01.save();
    }

    public void update(BusBa01 busBa01) {
        busBa01.update();
    }

    public void delete(String id) {
        dao.deleteById(id);
    }
}