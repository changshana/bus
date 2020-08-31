package com.mht.bus;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Record;
import com.mht.bus.service.BusOrderService;
import com.mht.common.CommonController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 公车预约统计相关
 */
public class BusStatistics extends CommonController {

    public static final BusOrderService busOrderService = BusOrderService.me;

    //通用统计
    public void commonOrderStatistics() {
        render("commonOrderStatistic.html");
    }

    //用户统计
    public void userStatistic() {
        render("userStatistic.html");
    }


    /****************************** 用户统计开始 ****************************************/

    /*个人订单总数  个人订单里程数   个人订单总金额*/
    public void personOrderTotal(){
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
        Record record = new Record();
        try {
            record = busOrderService.record(cond, "bus.getOrderTotal");
//        res.put("flag", Boolean.TRUE);
//        res.put("msg", "用户统计订单总数、订单里程数、订单总金额！");
//        res.put("data",records);
        } catch (Exception e) {
            e.printStackTrace();
//            res.put("flag", Boolean.FALSE);
//            res.put("msg", "查询异常！");
        }
        renderJson(record);
    }


    /*个人已完成订单详情*/
    public void personOverOrderDetail(){
        Map res = new HashMap();
        try {
            List<Record> records = busOrderService.records("bus.getOverOrderDetail");
            res.put("flag", Boolean.TRUE);
            res.put("msg", "已完成订单详情！");
            res.put("data",records);
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "查询异常！");
        }
        renderJson(res);
    }

    /*柱状图  个人每月订单数*/
    public void personMonthlyOrder(){
        Map res = new HashMap();
        try {
            List<Record> records = busOrderService.records("bus.getMonthlyOrder");
            res.put("flag", Boolean.TRUE);
            res.put("msg", "每月订单数！");
            res.put("data",records);
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "查询异常！");
        }
        renderJson(res);
    }

    /****************************** 用户统计结束 ****************************************/

    /****************************** 通用统计开始 ****************************************/
    /*订单总数  收费总金额  总车辆输*/

    /*所有订单统计  按月份  折线图*/

    /*所有收费统计  按月份  柱状图*/

    /*所有评分详情 按星级*/


    /****************************** 通用统计结束 ****************************************/





}
