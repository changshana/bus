package com.mht.bus.util;

import com.jfinal.plugin.activerecord.Db;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.*;

/**
 * 定时任务工具类
 */
public class BusScheduleUtil {

    //单例对象-饿汉
    private static BusScheduleUtil instance=new BusScheduleUtil();
    public static BusScheduleUtil  getInstance(){
        return instance;
    }
    private static ScheduledExecutorService service=new ScheduledThreadPoolExecutor(5);

    /**
     * 关闭容器
     */
    public void shutdown(){
        System.out.println("O-=-=-=-=-=-=-=-=-=-=-=-=-=-容器开始关闭...=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=O");
        service.shutdown();
        System.out.println("O-=-=-=-=-=-=-=-=-=-=-=-=-=-容器已关闭=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=O");

    }

    public final SimpleDateFormat getFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm");
    }
    /**
     * 添加任务-同步方法
     * @param task
     * @param delay
     * @param unit
     */
    public  synchronized void  addTask(Runnable task,long delay,TimeUnit unit){
        service.schedule(task,delay,unit);
    }

    /**
     * 获取默认的延时时间
     * @param timeStr
     * @return 单位 TimeUnit.MILLISECONDS
     */
    public long getDefaultDelay(String timeStr){
        long diff=0;
        try{
            diff=getFormat().parse(timeStr).getTime()- Calendar.getInstance().getTime().getTime();
        }catch (ParseException e){
            e.printStackTrace();
            throw new IllegalArgumentException(e.getMessage());
        }
        return diff;
    }

    /**
     *
     * @param task 任务
     * @param initDelay 初次任务延时时间
     * @param period 周期
     * @param unit 周期单位
     */
    public synchronized void addTask(Runnable task,long initDelay,long period,TimeUnit unit){
        service.scheduleAtFixedRate(task,initDelay,period,unit);
    }
}
