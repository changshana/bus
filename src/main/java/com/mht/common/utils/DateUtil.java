package com.mht.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    /**
     * 指定格式字符串转日期
     * @param dateStr
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static Date convertToDate(String dateStr,String pattern) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date=sdf.parse(dateStr);
        return date;
    }

    /**
     * 获取当前时间
     * @return
     */
    public static Date getNowDate() {
        return new Date();
    }
    /**
     * 根据格式获取当前时间
     * @return
     */
    public static String getNowDateFormat(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }
    /**
     * 根据格式获取时间
     * @return
     */
    public static String getDateFormat(String format,Date date) {
        return new SimpleDateFormat(format).format(date);
    }
    /**
     * 根据格式获取时间,返回Date
     * @return
     */
    public static Date getDateWithFormat(String format,String date) throws ParseException{
        return new SimpleDateFormat(format).parse(date);
    }
    /**
     * 根据格式获取时间,返回Date
     * @return
     */
    public static Date getNowDateWithFormat(String format) throws ParseException{
        return new SimpleDateFormat(format).parse(getNowDateFormat(format));
    }

    /**
     * 获取当前时间（yyyyMMdd）
     * @return
     */
    public static String getYearToDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }

    /**
     * 校验日期格式
     * @param str 日期字符串
     * @param pattern 日期格式
     * @return
     */
    public static boolean isValidDate(String str,String pattern) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            // 设置lenient为false.
            // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    /**
     * 获取当前时间（yyyy-MM-dd）
     * @return
     */
    public static String getYearToDateS() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }
    /**
     * 获取当前时间（yyyy-MM-dd）
     * @return
     */
    public static String getDateToDateS() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }

    /**
     * 指定日期后几天
     *
     * @param startDay 指定日期
     * @param count    天数
     * @return
     */
    public static String getAfterDay(String startDay, int count) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(startDay);
            Calendar cl = Calendar.getInstance();
            cl.setTime(date);
            cl.add(Calendar.DATE, count);
            return sdf.format(cl.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
    /**
     * date2比date1多的天数
     * @param date1
     * @param date2
     * @return
     */
    public static int differentDays(Date date1,Date date2){
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);
        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2){//同一年
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0){//闰年
                    timeDistance += 366;
                }
                else{//不是闰年
                    timeDistance += 365;
                }
            }
            return timeDistance + (day2-day1) ;
        }
        else{//不同年
            return day2-day1;
        }
    }

    /**
     * 指定日期推后或者提前日期计算
     * @param n 推后或提交天数
     * @param str 指定日期字符串
     * @return
     * @throws ParseException
     */
    public static String getPreviewOrLastTime(int n,String str) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date = ft.parse(str);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE,n);
        return format.format(c.getTime());
    }

    /**
     * 获取精确到秒的时间戳
     * @return
     */
    public static int getSecondTimestamp(Date date) {
        if (null == date) {
            return 0;
        }
        String timestamp = String.valueOf(date.getTime());
        int length = timestamp.length();
        if (length > 3) {
            return Integer.valueOf(timestamp.substring(0, length - 3));
        } else {
            return 0;
        }
    }
}
