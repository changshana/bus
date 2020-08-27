package com.mht.bus;

import com.mht.common.CommonController;

/**
 * 公车预约统计相关
 */
public class BusStatistics extends CommonController {

    //通用统计
    public void commonOrderStatistics() {
        render("commonOrderStatistic.html");
    }

    //用户统计
    public void userStatistic() {
        render("userStatistic.html");
    }

}
