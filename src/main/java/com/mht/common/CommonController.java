package com.mht.common;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.gson.Gson;
import com.jfinal.core.Controller;
import com.jfinal.kit.Kv;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.upload.UploadFile;
import com.mht.common.model.SysUser;
import com.mht.common.service.CommonService;

import cn.dreampie.ValidateKit;

/**
 * @author xionggy ， 2018/5/24.
 */
public class  CommonController extends Controller {

    public CommonService commonService = CommonService.me;

    /**
     * 获取平台顶级机构信息
     * @return
     */
    public Record getPlatTopSite(){
        return ValidateKit.isNullOrEmpty(getSessionAttr("plat_id"))?null:record(Kv.by("plat_id",getSessionAttr("plat_id")),"system.getTopOrgTree");
    }

    /**
     * 获取登录用户的信息
     *
     * @return
     */
    public SysUser getUserInfo() {
        return ValidateKit.isNullOrEmpty(getSessionAttr("user")) ? null : (SysUser) getSessionAttr("user");
    }

    /**
     * 获取当前时间
     *
     * @return
     */
    public static Date getNowDate() {
        return new Date();
    }

    /**
     * 获取当前年份
     *
     * @return
     */
    public static String getCurrentYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        return sdf.format(date);
    }

    /**
     * 获取当前时间戳
     */
    public static Date getNowTimeStamp() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(calendar.getTime());
        Date nowTimeStamp = new Date();
        return calendar.getTime();
    }

    /**
     * 获取当前时间（yyyyMMdd）
     *
     * @return
     */
    public static String getYearToDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }

    /**
     * 获取当前时间（yyyy-MM-dd）
     *
     * @return
     */
    public static String getYearToDateS() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }

    /**
     * 获取当前时间（yyyy-MM）
     *
     * @return
     */
    public static String getMonthToDateS() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }

    /**
     * 通过字符串获取时间（yyyy-MM-dd）
     *
     * */
    public Date getStringToDate(String date){
        Date parse= null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            parse = sdf.parse(date);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return parse;
        }
    }

    /**
     * 通过字符串获取时间（yyyyMM）
     *
     * */
    public String getYMtoDate(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
        return format.format(getNowDate());
    }

    /**
     * 国家
     *
     * @return
     */
    public List getCountryList() {
        return commonService.getCountryList();
    }
    /**
     * 民族
     *
     * @return
     */
    public List getNationList() {
        return commonService.getNationList();
    }

    /**
     * 省
     *
     * @return
     */
    public List getProvinceList() {
        return commonService.getProvinceList();
    }

    /**
     * ajax获取省
     */
    public void getProvinceListByAjax() {
        renderJson(commonService.getProvinceList());
    }

    /**
     * 市
     *
     * @return
     */
    public List getCityList(String provinceCode) {
        return commonService.getCityList(provinceCode);
    }

    /**
     * ajax获取市信息
     */
    public void getCityListByAjax() {
        renderJson(commonService.getCityList(getPara("province_code")));
    }

    /**
     * 区
     *
     * @return
     */
    public List getTownList(String cityCode) {
        return commonService.getTownList(cityCode);
    }

    /**
     * ajax获取区信息
     */
    public void getTownListByAjax() {
        renderJson(commonService.getTownList(getPara("city_code")));
    }


    /**
     * 身份证验重，返回数据库中已存在的身份证信息
     */
    public void checkIdCard() {
        renderJson(commonService.findMsgByIdCard(getCond(getParaMap())));
    }

    /**
     * 封装前台页面传过来的参数，用于调用外部sql文件时传参
     *
     * @param paraMap
     * @return cond
     */
    public static Kv getCond(Map<String, String[]> paraMap) {
        Iterator<String> paraKeyIterator = paraMap.keySet().iterator();
        String paraKey = "";
        Kv cond = Kv.by("1", "1");
        while (paraKeyIterator.hasNext()) {
            paraKey = paraKeyIterator.next();
            cond.set(paraKey, paraMap.get(paraKey)[0]);
        }
        return cond;
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
        return commonService.paginate(pageNumber, pageSize, cond, sqlId);
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
        return commonService.paginate(pageNumber, pageSize, sqlId);
    }

    /**
     * 普通查询调用外部sql模板文件
     *
     * @param cond
     * @param sqlId
     * @return
     */
    public List<Record> records(Kv cond, String sqlId) {
        return commonService.records(cond, sqlId);
    }

    /**
     * 普通查询调用外部sql模板文件,返回第一条数据
     *
     * @param cond
     * @param sqlId
     * @return
     */
    public Record record(Kv cond, String sqlId) {
        return commonService.record(cond, sqlId);
    }

    /**
     * 普通查询调用外部sql模板文件
     *
     * @param sqlId
     * @return
     */
    public List<Record> records(String sqlId) {
        return commonService.records(sqlId);
    }

    /**
     * 普通查询调用外部sql模板文件,返回第一条数据
     *
     * @param sqlId
     * @return
     */
    public Record record(String sqlId) {
        return commonService.record(sqlId);
    }


    /**
     * 获取当前用户权限的权限值
     *
     * @param permCode
     * @return
     */
    public Integer getPermValue(Object permCode) {
        Kv cond = Kv.by("user_id", getUserInfo().getUserId()).set("perm_code", permCode);
        if (!ValidateKit.isNullOrEmpty(getUserInfo())) {
            return commonService.getPermValue(cond);
        } else {
            return 0;
        }
    }

    /**
     * 获取当前用户权限的权限值
     *
     * @param permCode
     * @return
     */
    public Integer getPermValue(Integer permCode) {
        Kv cond = Kv.by("user_id", getUserInfo().getUserId()).set("perm_code", permCode);
        if (!ValidateKit.isNullOrEmpty(getUserInfo())) {
            return commonService.getPermValue(cond);
        } else {
            return 0;
        }
    }

    /**
     * 获取用户机构及下级机构
     *
     * @return
     */
    public Map getUserSiteInfo() {
        return commonService.getUserSiteInfo(getUserInfo().getSiteId());
    }

    /**
     * 导入模板下载
     */
    public void downloadTemplate(String template) {
        renderFile(template);
    }

    /***
     * @Title: 获取访问者的 ConfigName
     * @return String    本次访问的ConfigName
     */
    public static String getSqlServerConfigName() {
        return PropKit.get("sqlServerConfigName");
    }

    /**
     * 三方组件示例
     */
    public void extendDemo() {
        render("demo/" + getPara("demoType", "treeTable") + ".html");
    }

    //判断是否是手机号
    public boolean isMobile(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$");
        m = p.matcher(str);
        b = m.matches();
        return b;
    }

    // 对身份证号进行长度等简单判断
    public boolean validate(String no) {
        if (no == null || no.length() != 18 || !no.matches("\\d{17}[0-9X]")) {
            return false;
        } else {
            return true;
        }
    }
    //判断邮箱格式
    public static boolean isEmail(String string) {
        if (string == null)
            return false;
        String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern p;
        Matcher m;
        p = Pattern.compile(regEx1);
        m = p.matcher(string);
        if (m.matches()) {
            return true;
        }else {
            return false;
        }
    }

    public Map doSuccessMap(String message, Object obj) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("success", 1);
        map.put("message", message);
        map.put("data", obj);
        return map;
    }

    /**
     * 关键字过滤   导入时暂用
     */
    public Object keywordFilter(Object keyValue){
        if(!ValidateKit.isNullOrEmpty(keyValue)){
            if(Arrays.asList(keywords.split(",")).contains(keyValue)){
                keyValue=null;
            }
        }
        return keyValue;
    }
    public static final String keywords="0，无，没有,1900-01-00,1900/01/00";

    /**
     * 更改状态 aaa996
     */
    public void changeAaa996() {
        commonService.update(getPara("aaa996"), getPara("table_name"), getPara("table_id"), getPara("id"));
        renderJson();
    }

    /**
     * 为model设置默认值
     * @param model
     * @return
     */
    public Model setModelDefaultMsg(Model model){
        if(ValidateKit.isNullOrEmpty(model.get("aaa996"))){
            model.set("aaa996",1);
        }
        model.set("aaa997",getUserInfo().getUserName());
        model.set("aaa998",getNowDate());
        return model;
    }

    /**
     * 上传文件处理,返回文件存储路径
     */
    public void uploadFile(){
        String uploadPath=getPara("uploadPath");
        UploadFile file = getFile("file",uploadPath);
        Map result=new HashMap();
        result.put("filePath","upload/"+uploadPath +file.getFileName());
        renderJson(result);
    }

    /**
     * 指定路劲的kindedtor编辑器内上传图片
     * */
    public String uploadFileAppoint(String prefix,String folder){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String dateStr = sdf.format(Calendar.getInstance().getTime());
        UploadFile uploadFile;
        if ((uploadFile = getFile("imgFile", folder+"/" + dateStr)) == null)
            return null;
        String fileName = uploadFile.getFileName();
        String storeName = prefix +"_" + System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf("."));
        String filePath = uploadFile.getFile().getParent();
        File newFile = new File(filePath + File.separator + storeName);
        uploadFile.getFile().renameTo(newFile);
        return getRequest().getContextPath() + File.separator + "upload" + File.separator + folder + File.separator + dateStr + File.separator + storeName;
    }

    /**
     * 获取openId
     * 方法体说明：向远程接口发起请求，返回字节流类型结果
     */
    public String  getOpenId(String js_code, String appid, String secret){
        InputStream is = null;
        String str=null;
        String openid=null;
        try {
            String url="https://api.weixin.qq.com/sns/jscode2session?appid="+appid +"&secret="+secret+"&js_code=" +js_code+ "&grant_type=authorization_code";
            URL u = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            conn.setRequestProperty("Content-Type", "application/octet-stream");
            //设置连接超时时间
            conn.setConnectTimeout(50000);
            //设置读取返回内容超时时间
            conn.setReadTimeout(50000);
            //设置从HttpURLConnection对象读入，默认为true
            conn.setDoInput(true);
            //设置请求方式，默认为GET
            conn.setRequestMethod("GET");
            //从HttpURLConnection对象中读取响应的消息
            //执行该语句时才正式发起请求
            is = conn.getInputStream();
            byte[] bytes = new byte[is.available()];
            is.read(bytes);
            str = new String(bytes);
            //获取openid
            Gson gson = new Gson();
            Map<String, Object> map = new HashMap<String, Object>();
            map = gson.fromJson(str, map.getClass());
            openid=(String) map.get("openid");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {//释放资源
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return openid;
    }

    /**
     * 计算两个日期相差的天数
     * @param startDate
     * @param endDate
     * @return
     * @author WangLiping
     */
    public static int comparePastDate(String endDate,String startDate){
        int day=0;
        try {
            //设置转换的日期格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //开始时间
            Date oldDate = sdf.parse(startDate);
            //结束时间
            Date newDate = sdf.parse(endDate);
            //得到相差的天数 betweenDate
            long betweenDate = (newDate.getTime() - oldDate.getTime())/(60*60*24*1000);
            //打印控制台相差的天数
            day = (int)betweenDate+1;
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return day;
    }

}
