package com.mht.wxPay;

import java.net.InetAddress;

public class WXPayExample {

    public static void main(String[] args) throws Exception {

        /*MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "腾讯充值中心-QQ会员充值");//名字
        data.put("out_trade_no", "20191090910595900000012");//自己生成的id
        data.put("device_info", "");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");//金额
        data.put("spbill_create_ip", "123.12.12.123");//发起请求的Ip
        data.put("notify_url", "http://www.example.com/wxpay/notify");//支付回调url
        data.put("trade_type", "JSAPI");  // 此处指定为微信小程序和公众号
        data.put("product_id", "12");//商品ID
        data.put("openid","oWJbb4i3ZkG5pnh9Qk-4ekeCgYnY");

        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        System.out.println(InetAddress.getLocalHost().getHostAddress());
    }

}