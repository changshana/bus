package com.mht.bus.util.wxToken;

import com.jfinal.config.Constant;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.json.HTTPTokener;
import org.json.JSONObject;

/**
 * Package: com.mht.bus.util.wxToken
 * Description： TODO
 * Author: 作者
 * Date: Created in 2020/8/31 9:27
 * Company: 公司
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 * Modified By:
 */
public class TokenThread implements Runnable {

    public static String appId = "wx9bd39c7ee3f7315c";
    public static String appSecret = "bdef4a40fca943d9b15e57a3fd4f5cc0";
    //注意是静态的，可以全局存储访问
    public static AccessToken accessToken = null;

    @Override
    public void run() {
        while (true) {
            try {
                accessToken = this.getAccessToken(); //调用getAccessToken获取access_token
                if (null != accessToken) {
                    System.out.println(accessToken.getAccessToken());
                    Thread.sleep(7000 * 1000); //获取到access_token 休眠7000秒
                } else {
                    Thread.sleep(1000 * 3); //access_token为空 休眠3秒
                }
            } catch (Exception e) {
                System.out.println("发生异常：" + e.getMessage());
                e.printStackTrace();
                try {
                    Thread.sleep(1000 * 10); //发生异常休眠1秒
                } catch (Exception e1) {

                }
            }
        }
    }


    /**
     * 获取access_token
     *
     * @return
     */
    public AccessToken getAccessToken() {
        //微信jssdk获取jsapi_ticket时获取access_tokend的请求路径 https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET
        //此处获取的access_token和网页授权时获取的access_token的不同
        String jsticket = "";
        String url = "https://api.weixin.qq.com/cgi-bin/token";
        String param = "grant_type=client_credential&appid=" + "wx9bd39c7ee3f7315c" + "&secret=" + "bdef4a40fca943d9b15e57a3fd4f5cc0";
        try {
            jsticket = Httprequests.sendGet(url, param);
//            jsticket = Http.methodGet("https://api.weixin.qq.com/cgi-bin/token", "grant_type=client_credential&appid=" + this.appId + "&secret=" + this.appSecret + "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        JSONObject ticket = new JSONObject(jsticket);
        AccessToken token = new AccessToken();
        token.setAccessToken(ticket.getString("access_token"));
        return token;
    }

}
