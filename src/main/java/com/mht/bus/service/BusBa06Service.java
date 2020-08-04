package com.mht.bus.service;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.model.BusBa06;
import com.mht.common.service.CommonService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.HOUR_OF_DAY;

/**
 * Description 选座时间
 * ClassName BusBa06Service
 * Author Yii Cheung
 * Date 2018/12/18
 */
public class BusBa06Service extends CommonService {
    public static final BusBa06Service me = new BusBa06Service();
    public static final BusBa06 dao = new BusBa06().dao();

    public BusBa06 findById(String id) {
        return dao.findById(id);
    }

    public void save(BusBa06 busBa06) {
        busBa06.save();
    }

    public void update(BusBa06 busBa06) {
        busBa06.update();
    }

    public void delete(String id) {
        dao.deleteById(id);
    }

    /**
     * Description 修改预约时间设置状态
     * parameter status 修改后状态
     * parameter id 预约时间设置id
     * return void
     * Date 2018/12/20
     */
    public void changeStatus(Integer status, Integer id) {
        Db.update("UPDATE `bus_ba06` a SET a.aba996 = ? WHERE a.aba060 = ?", status, id);
    }

    /**
     * <p>
     * 验证车辆的类型、座位数
     * 时刻表是否设置车辆
     * 预约时间设置是否应用到班次
     * 判断当前时间是否在预约时间段之内
     * </p>
     * Description 判断当前时间是否在预约时间段之内
     * parameter bus_id 车辆id
     * parameter time_id 班次id
     * return boolean
     * Date 2018/12/24
     */
    public boolean checkTime(Integer bus_id, Integer time_id) {
        boolean flag;
        if (ValidateKit.isNullOrEmpty(bus_id) || ValidateKit.isNullOrEmpty(time_id)) {
            flag = false;
        } else {
            Record record = record(Kv.by("bus_id", bus_id).set("time_id", time_id), "bus.getBusTime");
            if (ValidateKit.isNullOrEmpty(record)) {
                flag = false;
            } else {
                Date day = record.getDate("aba053");   // 发车日期
                String time = record.get("aba051");   // 发车时间
                Integer start_time = record.getInt("aba062");   // 预约开始时间数值
                Integer start_time_unit = record.getInt("aba063");   // 预约开始时间单位
                Integer end_time = record.getInt("aba064");   // 预约结束时间数值
                Integer end_time_unit = record.getInt("aba065");   // 预约结束时间单位
                Calendar objective = Calendar.getInstance();
                objective.setTime(day);
                try {
                    Date day_day=getDateWithFormat("HH:mm:ss",time);
                    //获取完整的发车日期和时间
                    Calendar objective_time = Calendar.getInstance();
                    objective_time.setTime(day_day);
                    objective.set(HOUR_OF_DAY, objective_time.get(HOUR_OF_DAY));
                    objective.set(Calendar.MINUTE, objective_time.get(Calendar.MINUTE));
                    objective.set(Calendar.SECOND, objective_time.get(Calendar.SECOND));
                    //判断当前时间是否大于预约开始时间，小于预约结束时间
                    flag = getNowDate().getTime() > timeTransform(objective, start_time, start_time_unit).getTime() && getNowDate().getTime() < timeTransform(objective, end_time, end_time_unit).getTime();
                } catch (Exception e) {
                    flag = false;
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }


    /**
     * Description 获取开始时间、结束时间
     * parameter objective 发车时间
     * parameter time 时间数值
     * parameter unit 时间单位
     * return java.util.Date
     * Date 2018/12/24
     */
    private Date timeTransform(Calendar objective, Integer time, Integer unit) throws Exception {
        Calendar calendar = Calendar.getInstance();
        switch (unit) {
            case 1:
                //时间单位为天
                calendar.set(Calendar.DAY_OF_MONTH, objective.get(Calendar.DAY_OF_MONTH));
                break;
            case 2:
                //时间单位为小时
                calendar.set(Calendar.HOUR_OF_DAY, objective.get(Calendar.HOUR_OF_DAY) - time);
                break;
            case 3:
                //时间单位为分钟
                calendar.set(Calendar.MINUTE, objective.get(Calendar.MINUTE));
                break;
            default:
                //其他
                throw new Exception("无效的时间单位！");
        }
        return calendar.getTime();
    }
}
