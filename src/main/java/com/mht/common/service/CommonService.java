package com.mht.common.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;

import cn.dreampie.ValidateKit;

/**
 * @author xionggy ， 2018/5/24.
 */
public class CommonService {

    public static final CommonService me = new CommonService();

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
    public static int differentDays(Date date1,Date date2)
    {
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
     * 国家
     * @return
     */
    public List getCountryList() {
        return records("system.getPubCountry");
    }

    /**
     * 民族
     *
     * @return
     */
    public List getNationList() {
        return records("system.getPubNation");
    }

    /**
     * 省
     *
     * @return
     */
    public List getProvinceList() {
        return records("system.getPubProvince");
    }
    /**
     * 市
     *
     * @return
     */
    public List getCityList(String provinceCode) {
        Kv cond = Kv.by("province_code", provinceCode);
        return records(cond, "system.getPubCity");
    }
    /**
     * 区
     *
     * @return
     */
    public List getTownList(String cityCode) {
        Kv cond = Kv.by("city_code", cityCode);
        return records(cond, "system.getPubTown");
    }

    /**
     * 库表中身份证验重
     * @return
     */
    public List findMsgByIdCard(Kv cond) {
        return records(cond, "system.findMsgByIdCard");
    }

    /**
     * 获取用户的权限值
     * @param cond
     * @return
     */
    public Integer getPermValue(Kv cond) {
        Integer perm_by_user = Integer.parseInt(record(cond, "system.getUserPerm").getStr("perm_value"));
        String role_perm = record(cond, "system.getRolePerm").getStr("perm_value");
        Integer perm_by_role;
        if(!ValidateKit.isNullOrEmpty(role_perm)&&role_perm.indexOf(",")>0){
            String[] rp_values = role_perm.split(",");
            perm_by_role=Integer.parseInt(rp_values[0]);
            for(String value:rp_values){
                perm_by_role=perm_by_role|Integer.parseInt(value);
            }
        }else{
            perm_by_role=Integer.parseInt(role_perm);
        }
        Integer perm_value = 0;
        if (perm_by_user != 0 && perm_by_role != 0) {
            perm_value = perm_by_role | perm_by_user;
        } else {
            perm_value = perm_by_role == 0 ? perm_by_user == 0 ? 0 : perm_by_user : perm_by_role;
        }
        return perm_value;
    }

    /**
     * 分页查询调用外部sql模板文件
     *
     * @param pageNumber
     * @param pageSize
     * @param cond
     * @param sqlId
     * @return
     */
    public Page paginate(Integer pageNumber, Integer pageSize, Kv cond, String sqlId) {
        SqlPara sqlPara = Db.getSqlPara(sqlId, cond);
        return Db.paginate(pageNumber, pageSize, sqlPara);
    }

    /**
     * 分页查询调用外部sql模板文件
     *
     * @param pageNumber
     * @param pageSize
     * @param sqlId
     * @return
     */
    public Page paginate(Integer pageNumber, Integer pageSize, String sqlId) {
        SqlPara sqlPara = Db.getSqlPara(sqlId, new Kv());
        return Db.paginate(pageNumber, pageSize, sqlPara);
    }

    /**
     * 普通查询调用外部sql模板文件
     *
     * @param cond
     * @param sqlId
     * @return
     */
    public List<Record> records(Kv cond, String sqlId) {
        SqlPara sqlPara = Db.getSqlPara(sqlId, cond);
        return Db.find(sqlPara);
    }

    /**
     * 普通查询调用外部sql模板文件，返回第一条数据
     *
     * @param cond
     * @param sqlId
     * @return
     */
    public Record record(Kv cond, String sqlId) {
        SqlPara sqlPara = Db.getSqlPara(sqlId, cond);
        return Db.findFirst(sqlPara);
    }

    /**
     * 普通查询调用外部sql模板文件
     *
     * @param sqlId
     * @return
     */
    public List<Record> records(String sqlId) {
        SqlPara sqlPara = Db.getSqlPara(sqlId, new Kv());
        return Db.find(sqlPara);
    }

    /**
     * 普通查询调用外部sql模板文件,返回第一条数据
     *
     * @param sqlId
     * @return
     */
    public Record record(String sqlId) {
        SqlPara sqlPara = Db.getSqlPara(sqlId, new Kv());
        return Db.findFirst(sqlPara);
    }

    /**
     * 数据库更新操作：调用外部sql模板文件
     *
     * @param sqlId
     * @return
     */
    public void updateSql(String sqlId) {
        SqlPara sqlPara = Db.getSqlPara(sqlId, new Kv());
        Db.update(sqlPara);
    }
    /**
     * 数据库更新操作：调用外部sql模板文件
     *
     * @param sqlId
     * @param cond
     * @return
     */
    public void updateSql(String sqlId,Kv cond) {
        SqlPara sqlPara = Db.getSqlPara(sqlId, cond);
        Db.update(sqlPara);
    }

    /**
     * 获取用户机构信息及下级机构信息
     * @param siteId
     * @return this:本级机构ID；all:本级及下级机构
     */
    public Map getUserSiteInfo(Integer siteId) {
        Map siteMap=new HashMap();
        siteMap.put("this",siteId);
        Record record = record(Kv.by("siteId", siteId), "system.getUserSiteChilds");
        siteMap.put("all",record.get("childIds"));
        return siteMap;
    }

    /**
     * 更改状态  aaa996
     * @param status
     * @param tableName
     * @param tableId
     * @param id
     */
    public void update(String status,String tableName,String tableId,String id) {
        Db.update("update "+tableName+" set aaa996="+status+" where "+tableId+"="+id);
    }

    /**
     * 更改表中某个字段的值，如状态
     * @param statusName
     * @param statusValue
     * @param tableName
     * @param tableIdName
     * @param idValue
     */
    public void updateStatus(String statusName,String statusValue,String tableName,String tableIdName,String idValue) {
        Db.update("update "+tableName+" set "+statusName+"="+statusValue+" where "+tableIdName+"="+idValue);
    }

    /**
     * 根绝plat_id和site_code获取下级机构信息
     * @param siteCode
     * @param platId
     * @return
     */
    public List getChildSiteInfoWithCode(String siteCode, String platId) {
        if(ValidateKit.isNullOrEmpty(siteCode)||ValidateKit.isNullOrEmpty(platId)){
            return null;
        }else{
            Record siteInfo = record(Kv.by("site_code", siteCode).set("plat_id", platId), "system.checkSiteName");
            if(ValidateKit.isNullOrEmpty(siteInfo)){
                return null;
            }else {
                return records(Kv.by("parent_site_id",siteInfo.get("site_id")),"system.getOrgTreeByParent");
            }
        }
    }
}
