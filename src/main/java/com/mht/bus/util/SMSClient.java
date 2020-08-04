package com.mht.bus.util;

import com.lemon.toolkit.StringUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class SMSClient {
    //(多个号码以逗号分隔,一次性最多支持600个号码)
    //发送内容需在3到500个字之间
    private String serviceURL = "https://mb345.com/ws/BatchSend2.aspx";
    private String serviceGetURL = "https://sdk2.028lk.com/sdk2/Get.aspx";

    private String sn = "INFO008977";// 序列号
    private String pwd = "xk5ErEjvVM";// 密码
    private String sign = "后勤保障部维修管理系统";// 密码

    private static Map<String, String> map = null;

    static {
        map = new HashMap<String, String>();
        map.put("0", "");//发送成功
        map.put("-1", "帐号未注册");
        map.put("-2", "其他错误");
        map.put("-3", "密码错误");
        map.put("-4", "手机号格式不对");
        map.put("-5", "余额不足");
        map.put("-6", "定时发送时间不是有效的时间格式");
        map.put("-7", "提交信息末尾未加签名，请添加中文的企业签名【 】");
        map.put("-8", "发送内容需在1到300字之间");
        map.put("-9", "程序错误");
        map.put("-10", "短信参数配置错误");
        map.put("-11", "发送内容需在1到300字之间");
        map.put("-100", "IP黑名单");
        map.put("-102", "帐号黑名单");
        map.put("-103", "帐号黑名单");
    }


    public String getServiceGetURL() {
        return serviceGetURL + "?CorpID=" + sn + "&Pwd=" + pwd + "";
    }

    public SMSClient(String url, String sn, String pwd, String sign) {
        this.serviceURL = url;
        this.sn = sn;
        this.pwd = pwd;
        this.sign = sign;
    }

    public SMSClient() {
    }


    public String sendSMS(String sMobiles, String sContent) throws UnsupportedEncodingException, MalformedURLException {
        if (sMobiles.length() < 11) {
            return "-4";
        }
        return sendSMS(sMobiles, sContent, "");
    }

    public String sendSMS(String sMobiles, String sContent, String sSendTime) throws UnsupportedEncodingException, MalformedURLException {

        if (serviceURL.equals("") || sn.equals("") || pwd.equals("")) {
            return "-10";
        }
        sContent += "【" + sign + "】";//添加短信签名
        sContent = URLEncoder.encode(sContent.replaceAll("\r\n", " "), "GBK");// 发送内容


        if (!sSendTime.equals("")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            sSendTime = sdf.format(sSendTime);
        }

        String aMobiles[] = StringUtil.split(sMobiles, ",");
//
//        //逐条发送
        String sRetStr = "";
        for (int i = 0; i < aMobiles.length; i++) {
            sRetStr += sendASMS(aMobiles[i], sContent, sSendTime);
        }

        return sRetStr;


    }
    public String sendSMS(String sMobiles, String sContent, String sSendTime,String sign) throws UnsupportedEncodingException, MalformedURLException {

        if (serviceURL.equals("") || sn.equals("") || pwd.equals("")) {
            return "-10";
        }
        sContent += "【" + sign + "】";//添加短信签名
        sContent = URLEncoder.encode(sContent.replaceAll("\r\n", " "), "GBK");// 发送内容


        if (!sSendTime.equals("")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            sSendTime = sdf.format(sSendTime);
        }

        String aMobiles[] = StringUtil.split(sMobiles, ",");
//
//        //逐条发送
        String sRetStr = "";
        for (int i = 0; i < aMobiles.length; i++) {
            sRetStr += sendASMS(aMobiles[i], sContent, sSendTime);
        }

        return sRetStr;


    }

    //发送单条短信
    private String sendASMS(String sMobile, String sContent, String sSendTime) throws MalformedURLException {

        String sUrl = serviceURL + "?CorpID=" + sn + "&Pwd=" + pwd + "&Mobile=" + sMobile + "&Content=" + sContent + "&Cell=&SendTime=" + sSendTime + "";

        //System.out.println(sUrl);
        URL url = new URL(sUrl);
        BufferedReader in = null;
        long inputLine = 0L;

        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            inputLine = new Long(in.readLine()).longValue();
        } catch (Exception e) {
            inputLine = -9;
        }

        // System.out.println(sMobile+"，发送内容："+sContent+"，结果："+inputLine);

        if (inputLine > 0) {
            inputLine = 0;
        }

        return StringUtil.nullValue(map.get(inputLine + ""), "");
    }
}
