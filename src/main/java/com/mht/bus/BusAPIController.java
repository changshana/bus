package com.mht.bus;

import cn.dreampie.ValidateKit;
import com.google.gson.Gson;
import com.jfinal.kit.Kv;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.*;
import com.mht.bus.service.*;
import com.mht.bus.exception.BusException;
import com.mht.bus.util.BusStaticUtil;
import com.mht.common.CommonController;
import com.mht.common.model.*;
import com.mht.wxPay.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Ranbo
 * 2019/3/18 14:39
 */
public class BusAPIController extends CommonController {

    private static final String APPID="wx3b93735a3e04b33d";
    private static final String SECRET="64001f7bd40619e9950ab313e4f9c93e";
    public static final BusCa04Service busCa04Service = BusCa04Service.me;
    public static final BusPayinfoService busPayinfoService=BusPayinfoService.me;
    public static final BusCa03Service ca03Service=BusCa03Service.me;
    public static final BusCa05Service ca05Service=BusCa05Service.me;
    public static final BusCommonService busCommonService=BusCommonService.me;

    //共享数据表名字
    public static final String BKS="t_zhdhq_share_bks_jbxx";
    public static final String JZG="t_zhdhq_share_jzg_jbxx";
    public static final String YJS="t_zhdhq_share_yjs_jbxx";

    public void getBusCodeList(){
        Map res=new HashMap();
        try {
            Kv cond=getCond(getParaMap());
            List<Record> list=records(cond,"bus.getAPICodeList");
            res.put("msg","数据加载成功！");
            res.put("data",list);
            res.put("flag",Boolean.TRUE);
        }catch (Exception e){
            e.printStackTrace();
            res.put("msg","数据加载失败！");
            res.put("flag",Boolean.FALSE);
        }

        renderJson(res);
    }
    /**
     * 关联微信
     */
    public void associateWx(){
        String aca041=getPara("account");//登录账号
        String js_code=getPara("js_code");//用于获取微信OpenId
        String aca044=getPara("type");//人员类型
        String appid=getPara("appid");
        String secret=getPara("secret");
        String idcard=getPara("idcard","");
        Map res=new HashMap();
        try{
            if(ValidateKit.isNullOrEmpty(aca044)){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "人员类型不能为空！");
                renderJson(res);
                return;
            }
            if(ValidateKit.isNullOrEmpty(idcard)){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "证件号不能为空！");
                renderJson(res);
                return;
            }
            //判断此账号是否已绑定账号
            if(ValidateKit.isNullOrEmpty(aca041)){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "登录账号不能为空");
                renderJson(res);
                return;
            }
            if(ValidateKit.isNullOrEmpty(js_code) || ValidateKit.isNullOrEmpty(appid) || ValidateKit.isNullOrEmpty(secret) ){
                res.put("msg", "获取微信授权信息失败！");
                res.put("flag", Boolean.FALSE);
                renderJson(res);
                return;
            }else{
                //查询该人员是否存在
                Record personInfo=busCommonService.getOriginPersonInfo(aca044,aca041,idcard);
                if(ValidateKit.isNullOrEmpty(personInfo)){
                    res.put("msg","未查询到有效的人员信息！");
                    res.put("flag",Boolean.FALSE);
                    renderJson(res);
                    return;
                }else{
                    //获取openid
                    String openid=null;
                    openid=getOpenId(js_code,appid,secret);
                    if(ValidateKit.isNullOrEmpty(openid)){
                        res.put("flag", Boolean.FALSE);
                        res.put("msg", "获取openid失败！");
                        renderJson(res);
                        return;
                    }else{
                        List<Record> records=Db.find("select * from bus_ca04 where aca041=? and aca044=? and aca042!=? and aaa996=1",aca041,aca044,openid);
                        if(!ValidateKit.isNullOrEmpty(records) && records.size()>0){
                            res.put("flag", Boolean.FALSE);
                            res.put("msg", "此账号已被其他微信绑定！");
                            renderJson(res);
                            return;
                        }
                        BusCa04 ca04=busCa04Service.getBusCa04ByAca042(openid);
                        if(ValidateKit.isNullOrEmpty(ca04)){//新绑定的账号
                            ca04=new BusCa04();
                            /*ca04.setAca041(aca041);
                            ca04.setAca042(openid);
                            ca04.setAca043(personInfo.getStr("name"));
                            ca04.setAca044(aca044);
                            ca04.setAaa996(1);
                            ca04.setAaa997(personInfo.getStr("name"));
                            ca04.setAaa998(getNowTimeStamp());
                            ca04.setAaa999("微信绑定");*/
                            ca04.setAca044(aca044);
                            ca04.setAca042(openid);
                            ca04.setAca049(0);//违约次数为0
                            ca04=busCommonService.assembleInfo(ca04,personInfo);
                            busCa04Service.save(ca04);
                        }else{//以前绑定过的账号
                            if(aca041.equalsIgnoreCase(ca04.getAca041()) && aca044.equals(ca04.getAca044()+"")) {//是同一个人
                                ca04.setAca042(openid);
                                ca04=busCommonService.assembleInfo(ca04,personInfo);
                                busCa04Service.update(ca04);
                            }else{
                                res.put("msg","该微信已绑定其他有效的账号("+ca04.getAca041()+")！");
                                res.put("flag",Boolean.FALSE);
                                renderJson(res);
                                return;
                            }

                        }
                        Map data=new HashMap();
                        data.put("name",ca04.getAca043());
                        data.put("openid",ca04.getAca042());
                        data.put("idcard",personInfo.getStr("idCard"));
                        data.put("type",aca044);

                        res.put("flag", Boolean.TRUE);
                        res.put("data", data);
                        res.put("msg", "身份信息验证成功！");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "哦豁，一不小心就出错了");
        }
        renderJson(res);
    }
    /**
     * 获取openId
     * 方法体说明：向远程接口发起请求，返回字节流类型结果
     */
    public  String  getOpenId(String js_code,String appid,String secret){
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
     * 获取可预约车次列表
     */
    public void getBusAvailableList(){
        Map res=new HashMap();
        try{
            String openid=getPara("token");
            if(ValidateKit.isNullOrEmpty(openid)){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "参数缺失！");
                renderJson(res);
                return;
            }
            BusCa04 ca04=busCa04Service.getBusCa04ByAca042(openid);
            if(ValidateKit.isNullOrEmpty(ca04)){//绑定信息失效
                res.put("flag", Boolean.FALSE);
                res.put("msg", "绑定信息失效，请重新绑定！");
                renderJson(res);
                return;
            }
            //获取人员类型
            Integer type=Integer.parseInt(ca04.getAca044());
            Kv cond=new Kv();
            //查询该人员可预约的线路
            cond.put("bus_type",BusStaticUtil.parseType(ca04));
            List<Record> ba03List=records(cond,"bus.getBusBa03List");
            if(ValidateKit.isNullOrEmpty(ba03List)){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "当前人员暂无可预约线路！");
                renderJson(res);
                return;
            }
            //查询车次列表
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeStr=sdf.format(calendar.getTime());
            //cond.put("type",type.intValue());
            cond.put("datime",timeStr);
            sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dateStr=sdf.format(calendar.getTime());
            cond.put("date",dateStr);
            //日期增加一天
            calendar.add(Calendar.DAY_OF_MONTH,1);
            cond.put("tomorrow",sdf.format(calendar.getTime()));
            List<Record> busList=records(cond,"bus.getBusAvailableList");
            List<Record> tomorrowList=records(cond,"bus.getTomorrowList");
            if(!ValidateKit.isNullOrEmpty(tomorrowList)){
                busList.addAll(tomorrowList);
            }
            res.put("flag", Boolean.TRUE);
            res.put("data",busList);
            res.put("length",busList.size());
            res.put("msg", "加载成功！");
        }catch (BusException e){
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "加载车次列表失败，稍后再试！");
        }
        renderJson(res);
    }

    /**
     * 获取车票列表
     */
    public void getMyTicketList(){
        String openid=getPara("openid");
        Map res=new HashMap();
        if(ValidateKit.isNullOrEmpty(openid)){
            res.put("flag", Boolean.FALSE);
            res.put("msg", "微信授权登录失效，请重新授权");
        }else{
            try {
                //根据Openid查询绑定记录
                BusCa04 ca04=busCa04Service.getBusCa04ByAca042(openid);
                if(ValidateKit.isNullOrEmpty(ca04)){
                    res.put("flag", Boolean.FALSE);
                    res.put("msg", "此微信号暂未绑定账号或绑定信息失效，请先绑定信息！");
                }else{
                    //查询车票不验证人员有效信息
                    Kv cond=new Kv();
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String timeStr=sdf.format(calendar.getTime());
                    cond.put("dateTime",timeStr);
                    sdf=new SimpleDateFormat("yyyy-MM-dd");
                    String dateStr=sdf.format(calendar.getTime());
                    cond.put("date",dateStr);
                    cond.put("aca031",ca04.getAca041());
                    List<Record> tickets=records(cond,"bus.getMyTicketList");
                    //返回信息
                    res.put("flag", Boolean.TRUE);
                    res.put("data",tickets);
                    res.put("length",tickets.size());
                    res.put("msg", "加载成功！");
                }
            }catch (Exception e){
                e.printStackTrace();
                res.put("flag", Boolean.FALSE);
                res.put("msg", "哦豁，一不小心就出错了");
            }
        }
        renderJson(res);
    }

    //获取车票详细信息
    public void getTicketInfo(){
        Map res=new HashMap();
        try{
            String ticketId=getPara("ticketid");
            if(ValidateKit.isNullOrEmpty(ticketId)){
                res.put("flag",Boolean.FALSE);
                res.put("msg","参数缺失！");
            }else{
                Kv cond = new Kv().set("aca030",ticketId);
                Record data=commonService.record(cond, "bus.getBusTicket");
                if(BusStaticUtil.MAX_INVALID_COUNT>0){
                    data.set("QRTip","注：每月约车不乘坐超过"+BusStaticUtil.MAX_INVALID_COUNT+"次，将锁定账号，该月无法再次预约,下月初解锁！");
                }else{
                    data.set("QRTip","注：当前期间不计违约次数，请约车后按时乘坐！");
                }
                res.put("data",data);
                res.put("flag",Boolean.TRUE);
                res.put("msg","数据加载成功！");
            }
        }catch (Exception e){
            res.put("flag",Boolean.FALSE);
            res.put("msg","服务器错误，稍后再试！");
        }
        renderJson(res);
    }

    public static final BusOrderService busOrderService = BusOrderService.me;
    /**
     * 统一下单
     * @apiNote
     */
    public void unifiedOrder(){
        Map res=new HashMap();
        String openId=getPara("openid");
        int orderId=Integer.parseInt(getPara("orderId"));   //订单ID
        String total_fee = getPara("total_fee");           //费用
        BigDecimal bigDecimal = new BigDecimal(total_fee);
        try{
            //1.查询下单人员信息
            BusCa04 ca04=busCa04Service.getBusCa04ByAca042(openId);
            if(ValidateKit.isNullOrEmpty(openId) || ValidateKit.isNullOrEmpty(ca04)){
                res.put("flag",Boolean.FALSE);
                res.put("msg","账号绑定失效，请重新绑定！");
//                ca03Service.deleteCa03ByIds(chooseId);
            }else if(ValidateKit.isNullOrEmpty(total_fee)){
                res.put("flag",Boolean.FALSE);
//                ca03Service.deleteCa03ByIds(chooseId);
            }else{
                //生成订单号
                String out_trade_no= getNo(BusStaticUtil.PAY_TITLE,ca04.getAca040());
                //MyConfig config = new MyConfig();
                //WXPay wxpay = new WXPay(config);
                WXPay wxPay=WXPay.getInstance();
                Map<String, String> data = new HashMap<String, String>();
                data.put("body", "校车车票支付");//名字
                data.put("out_trade_no",out_trade_no);//商户系统内部单号
                data.put("device_info", "");
                data.put("fee_type", "CNY");
                data.put("total_fee", total_fee);//金额
                data.put("spbill_create_ip", InetAddress.getLocalHost().getHostAddress());//发起请求的Ip
                data.put("notify_url", PropKit.get("plat_url")+"/busAPI/callBack");//支付回调url
                data.put("trade_type", "JSAPI");  // 此处指定为微信小程序和公众号
                data.put("product_id", "1");//1表示车票
                data.put("openid",openId);
                //下单
                Map<String, String> resp = wxPay.unifiedOrder(data);
                if(resp!=null && (BusStaticUtil.SUCCESS.equals(resp.get("return_code")))){//检查通信是否成功
                    if(BusStaticUtil.SUCCESS.equals(resp.get("result_code"))){//下单成功
                        BusPayinfo payinfo=new BusPayinfo();
                        payinfo.setOutTradeNo(out_trade_no);
                        payinfo.setOpenid(openId);
//                        payinfo.setPrice(BusStaticUtil.getPrice(ca04));
                        payinfo.setPrice(bigDecimal);
                        payinfo.setFee(bigDecimal);
                        payinfo.setFeeType("CNY");
                        payinfo.setTimeStart(getNowTimeStamp());
                        payinfo.setPayState(0);//表示已下单
                        payinfo.setRefundFee(new BigDecimal(0));//退款金额
                        payinfo.setRemark("订单支付总金额：￥"+(total_fee)+"元；<br/>");
                        busPayinfoService.save(payinfo);            //支付详情

                        //busOrder中存记录
                        BusOrder busOrder = busOrderService.findById(orderId);
                        busOrder.setAca035(1);
                        busOrder.setOutTradeNo(out_trade_no);
                        busOrder.setAza217(bigDecimal);
                        busOrderService.update(busOrder);

                        //out_trade_no存入选座表
//                        ca03Service.updateOutTradeNo(chooseId,out_trade_no,true);
                        Map paySign=getPaySign(resp, MyConfig.getInstance(),out_trade_no);
                        res.put("flag",Boolean.TRUE);
                        res.put("msg","获取成功！");
                        res.put("data",paySign);
                    }else{//下单失败
//                        ca03Service.updateOutTradeNo(chooseId,out_trade_no,false);
                        res.put("flag",Boolean.FALSE);
                        res.put("msg",resp.get("err_code")+" ; "+resp.get("err_code_des"));
                    }
                }else{//通信失败
                    //失败删除选坐信息
//                    ca03Service.updateOutTradeNo(chooseId,out_trade_no,false);
                    res.put("flag",Boolean.FALSE);
                    res.put("msg","网络错误，下单失败！");
                }
            }
        }catch (Exception e){
            //下单异常删除选座信息
//            ca03Service.deleteCa03ByIds(chooseId);
            e.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg","下单失败！"+e.getMessage());
        }finally {
            renderJson(res);
        }

    }
    /*封装签名数据*/
    public Map getPaySign(Map<String, String> result,MyConfig config,String out_trade_no){
        System.out.println(result);
        Map signInfo=null;
        try{
            if (BusStaticUtil.SUCCESS.equals(result.get("return_code")) && result.get("return_code").equals(result.get("result_code"))) {
                String t=String.valueOf(System.currentTimeMillis()/1000);
                signInfo=new HashMap();
                signInfo.put("appId",result.get("appid"));
                signInfo.put("timeStamp",t);
                signInfo.put("nonceStr",result.get("nonce_str"));
                signInfo.put("package","prepay_id="+result.get("prepay_id"));
                signInfo.put("signType", WXPayConstants.MD5);
                String sign1=WXPayUtil.generateSignature(signInfo,config.getKey());
                signInfo.put("paySign", sign1);
                signInfo.put("mch_id",result.get("mch_id"));
                signInfo.put("out_trade_no",out_trade_no);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return signInfo;
    }

    /*订单查询*/
/*
    {"nonce_str":"DXjOYlkJoaCCnW7h",
    "out_trade_no":"uestcBusPay1553840783109",
    "trade_state":"NOTPAY",
    "appid":"wx29054383ddde26ed",
    "sign":"6FC7068FBE025842E4DF0E61307A0188",
    "trade_state_desc":"订单未支付",
    "return_msg":"OK",
    "result_code":"SUCCESS",
    "mch_id":"1487919942",
    "return_code":"SUCCESS"
    }
*/
    public void orderQuery(){
        String out_trade_no=getPara("out_trade_no","uestcBusPay1557912255227");//内部交易单号
        Map res=new HashMap();
        try{
            MyConfig config=new MyConfig();
            WXPay wxpay = new WXPay(config);
            Map<String,String> reqData=new HashMap<>();
            reqData.put("out_trade_no",out_trade_no);
            reqData.put("mch_id",config.getMchID());
            reqData.put("appid",config.getAppID());
            reqData.put("nonce_str",WXPayUtil.generateNonceStr());
            reqData.put("sign_type",WXPayConstants.MD5);
            reqData.put("sign",WXPayUtil.generateSignature(reqData,config.getKey(),WXPayConstants.SignType.MD5));
            res=wxpay.orderQuery(reqData);
        }catch (Exception e){
            e.printStackTrace();
        }
        renderJson(res);
    }

    /**
     *微信服务器发起的支付回调
     */
    public void callBack(){
        try{
            //1.获取微信支付服务器回调xml
            HttpServletRequest request=getRequest();
            HttpServletResponse response=getResponse();
            String inputLine="",notifyXml="";
            while ((inputLine = request.getReader().readLine()) != null) {
                notifyXml += inputLine;
            }
            request.getReader().close();
            //2.解析xml->map
            Map<String, String> notifyMap = WXPayUtil.xmlToMap(notifyXml);
            String result_code = notifyMap.get("result_code");//业务结果
            String return_code = notifyMap.get("return_code");//返回状态吗
            String out_trade_no = notifyMap.get("out_trade_no");//商户订单号
            String openid = notifyMap.get("openid");//微信openid
            BusPayinfo payinfo=busPayinfoService.dao.findFirst("select * from bus_payinfo where openid=? and out_trade_no=?",openid,out_trade_no);
            if (BusStaticUtil.SUCCESS.equals(return_code) && BusStaticUtil.SUCCESS.equals(result_code)) //支付成功
            {
                String resXml = "";
                if(ValidateKit.isNullOrEmpty(payinfo)){
                    //未查到此订单
                    resXml=BusStaticUtil.CALLBACK_OK;
                }else{
                    if(payinfo.getPayState()==0){//未处理
                        if (handlePayCallBack(notifyMap,payinfo)) {
                            resXml = BusStaticUtil.CALLBACK_OK;
                        } else {
                            resXml = BusStaticUtil.CALLBACK_FAIL;
                        }
                    }else{//已处理
                        resXml=BusStaticUtil.CALLBACK_OK;
                    }
                    BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
                    out.write(resXml.getBytes());
                    out.flush();
                    out.close();
                }
            }else{
                //失败后删除选座位信息
                payinfo.delete();
//                Db.update("delete from bus_ca03 where aca035=0 and out_trade_no =?",out_trade_no);
                BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
                out.write(BusStaticUtil.CALLBACK_OK.getBytes());
                out.flush();
                out.close();
            }
        }catch (Exception er){
            er.printStackTrace();
        }
        renderNull();
    }

    /**
     * 获取内部商品单号
     * @param type 人员类型
     * @param no 人员ID
     * @return out_trade_no
     */
    public String getNo(String type,int no){
        synchronized (ca03Service){
            return type+System.currentTimeMillis()+no;
        }
    }

    /**
     * 处理支付返回数据
     * @param data
     * @param payinfo
     * @return
     * @throws ParseException
     */
    public boolean  handlePayCallBack(Map<String,String> data,BusPayinfo payinfo) throws ParseException {
        boolean flag=Boolean.TRUE;
        //核对金额是否正确
        if(!ValidateKit.isNullOrEmpty(data)){
            if(!data.get("total_fee").equals(String.valueOf(payinfo.getFee()))){
                //虚假订单,不予处理
                flag=Boolean.TRUE;
            }else{
                String out_trade_no = data.get("out_trade_no");//out_trade_no
                //更新选座信息表
//                Db.update("update bus_ca03 set aca035=1 where aca035=0 and out_trade_no=?",out_trade_no);
                payinfo.setTimeEnd(new SimpleDateFormat("yyyyMMddHHmmss").parse(data.get("time_end")));//支付完成时间
                payinfo.setTransactionId(data.get("transaction_id"));//微信支付订单号
                payinfo.setPayState(BusStaticUtil.PAY_STATE_PAID);//支付成功
                payinfo.setStatus(BusStaticUtil.VALID);//有效数据
                payinfo.setCreateTime(getNowTimeStamp());
                busPayinfoService.update(payinfo);
                flag=Boolean.TRUE;
            }
        }else{
            flag=Boolean.FALSE;
        }
        return flag;
    }


    /**
     * @apiNote 修改选座表支付状态
     * 由微信小程序发起
     */
    public void handlePay(){
        Map res=new HashMap();
        try{
            String out_trade_no=getPara("out_trade_no");//交易单号
            String flag=getPara("flag");//支付状态
            if(ValidateKit.isNullOrEmpty(out_trade_no)){
                res.put("flag",Boolean.FALSE);
                res.put("msg","参数缺失");
            }else{
                String msg=ca03Service.handelPay(out_trade_no,flag);
                res.put("flag",Boolean.TRUE);
                res.put("msg",msg);
            }
        }catch (Exception e){
            res.put("flag",Boolean.FALSE);
            res.put("msg","服务器繁忙，稍后再试！");
        }
        renderJson(res);
    }

    /**
     * 退款
     */
    public void refund(){
        Map res=new HashMap();
        try{
            String out_trade_no=getPara("out_trade_no","20190109091059590000001");
            BusPayinfo payinfo=BusPayinfo.dao.findFirst("select * from bus_payinfo where out_trade_no=?",out_trade_no);
            if(!ValidateKit.isNullOrEmpty(payinfo)){
                MyConfig config=new MyConfig();
                WXPay wxpay = new WXPay(config);
                Map<String,String> reqData=new HashMap<>();
                reqData.put("out_trade_no",out_trade_no);
                reqData.put("mch_id",config.getMchID());
                reqData.put("appid",config.getAppID());
                reqData.put("nonce_str", WXPayUtil.generateNonceStr());
                reqData.put("sign_type", WXPayConstants.MD5);
                reqData.put("sign",WXPayUtil.generateSignature(reqData,config.getKey(),WXPayConstants.SignType.MD5));
                reqData.put("out_refund_no", BusStaticUtil.REFUND_TITLE+System.currentTimeMillis());
                reqData.put("total_fee","1");
                reqData.put("refund_fee","1");
                reqData.put("refund_fee_type",String.valueOf(payinfo.getFeeType()));
                reqData.put("refund_desc", BusStaticUtil.REFUND_STU);
                reqData.put("notify_url","");
                //res=wxpay.refund(reqData);
            }else{

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        renderJson(res);
    }

    /**
     * 退款查询
     */
    public void refundQuery(){
        Map res=new HashMap();
        try{
            String out_trade_no=getPara("out_trade_no");
            BusPayinfo payinfo=BusPayinfo.dao.findFirst("select * from bus_payinfo where out_trade_no=?",out_trade_no);
            if(!ValidateKit.isNullOrEmpty(payinfo)){
                MyConfig config=new MyConfig();
                WXPay wxpay = new WXPay(config);
                Map<String,String> reqData=new HashMap<>();
                reqData.put("out_trade_no",out_trade_no);
                reqData.put("mch_id",config.getMchID());
                reqData.put("appid",config.getAppID());
                reqData.put("nonce_str", WXPayUtil.generateNonceStr());
                reqData.put("sign_type", WXPayConstants.MD5);
                reqData.put("sign",WXPayUtil.generateSignature(reqData,config.getKey(),WXPayConstants.SignType.MD5));
                Map data=wxpay.refundQuery(reqData);
                if(BusStaticUtil.SUCCESS.equals(data.get("return_code"))){
                    if(BusStaticUtil.SUCCESS.equals(data.get("result_code"))){//退款成功
                        res.put("refund_fee",res.get("refund_fee"));
                        res.put("return_msg",res.get("return_msg"));
                    }else if(BusStaticUtil.RESULT_FAIL.equals(data.get("result_code"))){//退款失败
                        res.put("refund_fee",res.get("refund_fee"));
                        res.put("return_msg",res.get("err_code_des"));
                    }
                }else{

                }
            }else{

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        renderJson(res);
    }

    /**
     * 评价
     */
    public void evaluate(){
        Map res=new HashMap();
        try{
            String aca030=getPara("ticketid");
            int aca032=getParaToInt("rate");
            int aca033=getParaToInt("rateType");
            String aca034=getPara("rateRemark");
            if(!ValidateKit.isNullOrEmpty(aca030)){
                ca03Service.evaluate(aca030,aca032,aca033,aca034);
                res.put("msg","已评价，感谢您的支持！");
                res.put("flag",Boolean.TRUE);
                res.put("data",new HashMap());
            }else{
                res.put("flag",Boolean.FALSE);
                res.put("msg","参数不足");
            }
        }catch (Exception e){
            e.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg","系统繁忙，稍后再试");
        }
        renderJson(res);
    }

    /*************************手机端调度员 开始**************************/

    /**
     * 获取路线列表
     */
    public void getDispatchInfo(){
        Map res=new HashMap();
        try{
            Date date=getParaToDate("date",Calendar.getInstance().getTime());
            String type=getPara("type");
            if(ValidateKit.isNullOrEmpty(type)){
                res.put("flag", Boolean.FALSE);
                res.put("msg","缺失参数！");
            }
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dateStr=sdf.format(date);
            Kv cond=getCond(getParaMap());
            cond.put("aba055",BusStaticUtil.aba055(dateStr));
            List<Record> routList=records(getCond(getParaMap()),"bus.getRoutList");
            List<Record> timeList=null;
            for(Record record:routList){
                cond.put("routId",record.getInt("routId"));
                cond.put("now",new Date());
                cond.put("dateStr",dateStr);
                timeList=records(cond,"bus.getTimeList");
                record.set("timeList",timeList);
            }
            List<Record> driverList=records(getCond(getParaMap()),"bus.getDriverList");
            Map data=new HashMap();
            data.put("routList",routList);
            data.put("driverList",driverList);
            res.put("data",data);
            res.put("msg","数据加载成功！");
            res.put("flag", Boolean.TRUE);
        }catch (Exception er){
            er.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg","线路信息获取失败！");
        }
        renderJson(res);
    }

    /**
     * 获取发车时间列表
     */
    public void getTimeList(){
        Map res=new HashMap();
        try{
            Date date=getParaToDate("date",Calendar.getInstance().getTime());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dateStr=sdf.format(date);
            Kv cond=getCond(getParaMap());
            cond.put("aba055",BusStaticUtil.aba055(dateStr));
            cond.put("now",new Date());
            cond.put("dateStr",dateStr);
            List<Record> routList=records(cond,"bus.getTimeList");
            res.put("data",routList);
            res.put("flag", Boolean.TRUE);
            res.put("msg","数据加载成功！");
        }catch (Exception er){
            er.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg","数据加载失败！");
        }
        renderJson(res);
    }

     /**
     * 获取司机列表
     */
    public void getDriverList(){
        Map res=new HashMap();
        try{
            List<Record> driverList=records(getCond(getParaMap()),"bus.getDriverList");
            res.put("data",driverList);
            res.put("flag", Boolean.TRUE);
            res.put("msg","数据加载成功！");
        }catch (Exception er){
            er.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg","数据加载失败！");
        }
        renderJson(res);
    }

    /**
     *新增班次
     */
    //TODO 新增班车时上传openid
    public void addBus(){
        Map res=new HashMap();
        String aba050=getPara("timeId");
        String driverId=getPara("driverId");
        String aca051=getPara("date");
        String openid=getPara("openid");
        String roll=getPara("roll");//是否滚动
        try{
            if(ValidateKit.isNullOrEmpty(aba050) ||
                    ValidateKit.isNullOrEmpty(driverId)||
                    ValidateKit.isNullOrEmpty(aca051)){
                res.put("flag",Boolean.FALSE);
                res.put("msg","参数缺失！");
            }else if(ValidateKit.isNullOrEmpty(openid)){//登录失效
                res.put("flag",Boolean.FALSE);
                res.put("msg","登录失效，请重新登录！");
            }else{
                int count=0;
                for(String aaa020:driverId.split(",")){
                    //根据司机查询绑定的车辆ID
                    Kv cond=new Kv().set("aaa020",Integer.parseInt(aaa020));
                    Record ca02=Db.findFirst("select aaa001 from bus_ca02 where aaa020=?",aaa020);
                    if(!ValidateKit.isNullOrEmpty(ca02) && !ValidateKit.isNullOrEmpty(ca02.getStr("aaa001"))){
                        BusCa05 ca05=new BusCa05();
                        ca05.setAba050(Integer.parseInt(aba050));
                        ca05.setAaa020(Integer.parseInt(aaa020));
                        ca05.setAaa001(Integer.parseInt(ca02.getStr("aaa001")));
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                        ca05.setAca051(sdf.parse(aca051));
                        ca05.setAca053(Integer.parseInt(roll));
                        ca05.setAaa996(BusStaticUtil.VALID);
                        ca05.setAaa998(getNowTimeStamp());
                        ca05.setAaa999("调度员新增班次！");
                        //查询调度员电话号码
                        cond.put("openid",openid);
                        Record record=record(cond,"bus.getDispatcherPhone");
                        if(!ValidateKit.isNullOrEmpty(record)){
                            ca05.setAca052(record.get("aaa042"));
                        }
                        ca05Service.save(ca05);
                        //发送短信通知司机
                        BusStaticUtil.sendMsgToDriver(aaa020,aba050,aca051,BusStaticUtil.MSG_TYPE_ADD);
                        if(Integer.parseInt(roll)==1){
                            //添加定时扫描车辆选座情况到延时任务队列
                            BusStaticUtil.addCheckTask(ca05.getAca050());
                        }
                        count++;
                    }
                }
                res.put("flag",Boolean.TRUE);
                res.put("msg","成功添加"+count+"班校车！");
            }
        }catch (Exception er){
            er.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg","服务器繁忙，稍后再试！");
        }
        renderJson(res);
    }
    /**
     * 获取调度员车次列表
     */
    public void getDispatcherBusList(){
        Map res=new HashMap();
        try{
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Kv cond=getCond(getParaMap());
            String dateStr=sdf.format(calendar.getTime());
            cond.put("date",dateStr);
            List<Record> dispatchList=records(cond,"bus.getDispatcherBusList");
            res.put("flag", Boolean.TRUE);
            res.put("data",dispatchList);
            res.put("length",dispatchList.size());
            res.put("msg", "加载成功！");
        }catch (Exception e){
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "加载失败，稍后再试！");
        }
        renderJson(res);
    }

    /**
     * 根据车票生成二维码
     */
    public void generateQrCode(){
        String aca030=getPara("ticketId");
        renderQrCode("测试信息",200,200);
    }

    /**
     * 解析二维码
     */
    public void handleQRCodeInfo(){
        String ticketId=getPara("ticketId");//车票ID
        String role=getPara("role");//扫码角色
        String busId=getPara("busId");//班次ID
        String openid=getPara("openid");//扫码人openid,预留作为扫码人身份判断的标准
        Map res=new HashMap();
        try{
            //0.参数判断
            if(ValidateKit.isNullOrEmpty(role) || ValidateKit.isNullOrEmpty(ticketId)){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "参数错误！");
                renderJson(res);
                return;
            }
            if(BusStaticUtil.QR_SCAN_ROLE_DRIVER.equals(role) && ValidateKit.isNullOrEmpty(busId)){
                //驾驶员扫码班次不能为空
                res.put("flag", Boolean.FALSE);
                res.put("msg", "参数错误，未获取到合法的班次信息！");
                renderJson(res);
                return;
            }
            //1.判断当前车票是否有效
            //TODO 判断车票过期
            BusCa03 ca03=ca03Service.findById(ticketId);
            if(ValidateKit.isNullOrEmpty(ca03) || ca03.getAaa996()==BusStaticUtil.INVALID){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "车票不存在或已过期！");
                renderJson(res);
                return;
            }
            //2.若为驾驶员扫码，需判断当前人员是否是本车乘客
            if(BusStaticUtil.QR_SCAN_ROLE_DRIVER.equals(role)){
                //判断当前人员是否是本车乘客
                if(Integer.parseInt(busId)!=ca03.getAca050()){
                    res.put("flag", Boolean.FALSE);
                    res.put("msg", "当前乘客不是本车乘客！");
                    renderJson(res);
                    return;
                }
            }
            //3.更新车票信息
            if(BusStaticUtil.QR_SCAN_ROLE_DISPATCHER.equals(role)){
                //调度员扫码
                boolean b=Db.tx(()-> Db.update("update bus_ca03 set aca036=?,aaa996=? where aca030=?",BusStaticUtil.BUS_AA99_ACA036_1,BusStaticUtil.INVALID,Integer.parseInt(ticketId))==1);
                res.put("flag", Boolean.TRUE);
                res.put("msg", "车票识别成功！");
            }else if(BusStaticUtil.QR_SCAN_ROLE_DRIVER.equals(role)){
                //司机扫码
                boolean b=Db.tx(()-> Db.update("update bus_ca03 set aca036=? where aaa996=? and aca030=?",BusStaticUtil.BUS_AA99_ACA036_1,BusStaticUtil.VALID,Integer.parseInt(ticketId))==1);
                res.put("flag", Boolean.TRUE);
                res.put("msg", "车票识别成功！");
            }else{
                res.put("flag", Boolean.FALSE);
                res.put("msg", "角色信息错误！");
            }
        }catch (Exception e){
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "车票识别失败，稍后再试！");
        }
        renderJson(res);
    }
    /*************************手机端调度员 结束**************************/
}
