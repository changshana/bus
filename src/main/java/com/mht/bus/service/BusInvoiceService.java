package com.mht.bus.service;

import com.mht.common.model.BusInvoice;
import com.mht.common.model.BusPrice;
import com.mht.common.service.CommonService;

public class BusInvoiceService extends CommonService {
    public static final BusInvoiceService me=new BusInvoiceService();
    public static final BusInvoice dao=new BusInvoice().dao();
    public BusInvoice findById(String id){
        return dao.findById(id);
    }
    public void save(BusInvoice busInvoice){
        busInvoice.save();
    }
    public void update(BusInvoice busInvoice){
        busInvoice.update();
    }

}