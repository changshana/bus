package com.mht.bus;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.CommonController;

import java.time.YearMonth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 公车预约统计相关
 */
public class BusStatistics extends CommonController {

    //通用统计
    public void commonOrderStatistics() {
        YearMonth end = YearMonth.now();
        YearMonth start = end.minusMonths(5L);
        setAttr("startMonth", start.toString());
        setAttr("endMonth", end.toString());
        render("commonOrderStatistic.html");
    }

    //获取通用统计数据
    public void getCOSData() {
        String start = getPara("start");
        String end = getPara("end");
        Map res = new HashMap();
        try {
            if (ValidateKit.isNullOrEmpty(start) || ValidateKit.isNullOrEmpty(end)) {
                res.put("flag", Boolean.FALSE);
                res.put("msg", "参数缺失！");
                renderJson(res);
                return;
            }
            Map<String, Object> data = new HashMap<>();
            Kv cond = new Kv();
            cond.put("start", start);
            cond.put("end", end);
            //1.获取统计数据
            Record totalData = record(cond, "bus.getCOSTotalData");
            data.put("totalData", totalData);
            //2.获取订单和收费月统计
            List<Record> monthData = records(cond, "bus.getCOSMonthData");
            data.put("monthData", monthData);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "数据加载成功！");
            res.put("data", data);
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "服务器数据加载错误！");
        }
        renderJson(res);
    }

    //获取评价数据
    public void getEvaData() {
        Map res = new HashMap();
        try {
            Record record = record(getCond(getParaMap()), "bus.getOrderEvaData");
            res.put("flag", Boolean.TRUE);
            res.put("msg", "数据加载成功！");
            res.put("data", record);
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "服务器数据加载错误！");
        }
        renderJson(res);
    }

    //用户统计
    public void userStatistic() {
        render("userStatistic.html");
    }

}
