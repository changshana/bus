package com.mht.bus;

import com.jfinal.config.Constant;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Record;
import com.mht.bus.service.BusAa02Service;
import com.mht.bus.service.BusCa04Service;
import com.mht.bus.service.BusOrderService;
import com.mht.bus.service.BusTokenService;
import com.mht.bus.util.WxUtil;
import com.mht.common.CommonController;
import com.mht.common.model.BusAa02;
import com.mht.common.model.BusCa04;
import com.mht.common.model.BusOrder;
import com.mht.common.model.BusToken;
import com.mht.common.utils.Format;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Package: com.mht.bus
 * Description： TODO
 * Author: 作者
 * Date: Created in 2020/7/21 9:31
 * Company: 公司
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 * Modified By:
 */
public class BusWxController extends CommonController {
    public static String appid = Constant.appid;
    public static String secret = Constant.secret;

    public static final BusCa04Service busCa04Service = BusCa04Service.me;
    public static final BusTokenService busTokenService = BusTokenService.me;
    public static final BusOrderService busOrderService = BusOrderService.me;
    public static final BusAa02Service busAa02Service = BusAa02Service.me;

    /*登录*/
    public void login() {
        Map res = new HashMap();
        Kv cond = getCond(getParaMap());
        //登录
        String code = cond.getStr("code");
//        String openid = cond.getStr("openid");
        String openid = WxUtil.getOpenId(appid, secret, code);
        if (null == openid) {
            res.put("flag", Boolean.FALSE);
            res.put("msg", "获取微信OpenId失败！");
            res.put("openid", openid);
            renderJson(res);
            return;
        }
        cond.set("aca042", openid);
        BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
        if (busCa04 == null) {
            res.put("flag", Boolean.FALSE);
            res.put("msg", "用户未绑定微信,请注册！");
            renderJson(res);
            return;
        }
        //更新用户登录时间
        SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        busCa04.setAaa995(slf.format(new Date()));
        busCa04Service.update(busCa04);
        BusToken busToken = new BusToken();
        busToken.setToken(UUID.randomUUID().toString());
        busToken.setUserId(busCa04.getAca040());
        busToken.setWxOpenId(busCa04.getAca042());
        busToken.setCreateTime(new Date());
        busToken.setUserName(busCa04.getAca043());
        busTokenService.save(busToken);     //存储登录记录
        res.put("flag", Boolean.TRUE);
        res.put("msg", "登录成功！");
//        res.put("data", busToken);
        res.put("openid", openid);
        renderJson(res);
//        UserToken userToken = userTokenService.bind(user);
//        return RestResponse.ok(userToken.getToken());
    }


    /*注册*/
    public void register() {
        Map res = new HashMap();
        Kv cond = getCond(getParaMap());
        //2. 得到code
        String code = cond.getStr("code");
//        String openid = cond.getStr("openid");
        //3. 得到openID
        String openid = WxUtil.getOpenId(appid, secret, code);  //aca042
        if (null == openid) {
//            return RestResponse.fail(4, "获取微信OpenId失败");
            res.put("flag", Boolean.FALSE);
            res.put("msg", "获取微信OpenId失败！");
            renderJson(res);
            return;
        }
        //4. 注册进用户表 ca04
        String aca041 = cond.getStr("aca041");  //工号
        String aca043 = cond.getStr("aca043");  //姓名
        String aca044 = cond.getStr("aca044");  //人员类型
        BusCa04 ca04 = new BusCa04();
        ca04.setAca041(aca041);
        ca04.setAca043(aca043);
        ca04.setAca042(openid);
        ca04.setAca044(aca044);
        ca04.setAca049(0);//违约次数为0
        ca04.setAaa998(new Date());//创建时间
        ca04.setAaa996(1);//状态  默认为1
        busCa04Service.save(ca04);
//        UserEventLog userEventLog = new UserEventLog(user.getId(), user.getUserName(), user.getRealName(), new Date());
//        userEventLog.setContent("欢迎 " + user.getUserName() + " 注册来到系统");
//        eventPublisher.publishEvent(new UserEvent(userEventLog));
        res.put("flag", Boolean.TRUE);
        res.put("msg", "注册成功！");
        res.put("openid", openid);
        renderJson(res);
    }


    /*未分页的驾驶员列表  返回给微信端 只返回该时段能用的驾驶员*/
    public void getBusAa02All() {
        Kv cond = getCond(getParaMap());
        List<Record> records = busAa02Service.records(cond, "bus.getBusAa02List");
        renderJson(records);
    }

    /*微信端预约*/
    public void orderBus() throws ParseException {
        Kv cond = getCond(getParaMap());
        String dateTime = cond.getStr("dateTime");  //时间
        Integer carTypeId = Integer.parseInt(cond.getStr("carType"));   //车型id
        Integer carId = Integer.parseInt(cond.getStr("car"));   //车辆id
        Integer driverId = Integer.parseInt(cond.getStr("driver"));   //驾驶员id
        String start = cond.getStr("start");  //出发地点+经纬度
        String end = cond.getStr("end");  //终点+经纬度
        String remarks = cond.getStr("remarks");  //备注
//        String code = cond.getStr("code");  //code  用来获取用户信息
        String mileage = cond.getStr("mileage");  //里程
        String personType = cond.getStr("userType");//人员类型
        String username = cond.getStr("username");//用户名
        String openid = cond.getStr("openId");//openid
        BusOrder busOrder = new BusOrder();
        SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        busOrder.setAba032(slf.parse(dateTime));
        busOrder.setAza207(carTypeId);
        busOrder.setAza201(carId);
        busOrder.setAza208(driverId);
        busOrder.setAza204(start);
        busOrder.setAza205(end);
        busOrder.setAaa999(remarks);
        BigDecimal decimal = new BigDecimal(mileage);
        busOrder.setAza203(decimal);
        if ("校内用户".equals(personType)) {
            busOrder.setAca044(1);
        }
        if ("校外用户".equals(personType)) {
            busOrder.setAca044(2);
        }
        if ("驾驶员".equals(personType)) {
            busOrder.setAca044(3);
        }
        if ("管理员".equals(personType)) {
            busOrder.setAca044(4);
        }
        busOrder.setAca031(openid);
        BusCa04 busCa04 = busCa04Service.getBusCa04ByAca042(openid);
        busOrder.setAaa997(username);    //设置用户名字
        busOrder.setAba041(busCa04.getAca040());    //设置用户id
        busOrder.setAaa998(new Date());             //设置创建时间
        busOrder.setAca035(0);  //支付状态（0未支付，1已支付）
        busOrder.setOutTradeNo("");             /*商户订单号  这里需要支付后才会有订单号  暂未获取*/

        int estimatedCost = Integer.parseInt(mileage) / 4;    /*预估费用  这里的费用计算     待定*/
        BigDecimal bigDecimal = new BigDecimal(estimatedCost);
        busOrder.setAza202(bigDecimal);
        busOrder.setAaa996(0);  //开车状态（0为等待发车，1为正在行驶，2为行程结束）
        busOrder.setAca036(0);  //乘坐状态（0为未乘坐，1为正在乘坐，2为乘坐结束）
        busOrder.setAza206(0);  //订单状态（0为待审核，1为审核通过，2为不通过）
        busOrder.setAza210(0);  //驾驶员未确认订单收到（0未收到，1收到）
        busOrder.setAza209(Integer.parseInt(mileage)/4);        //预估时长来自于计算  待定
        busOrder.setAca050(1);
        busOrderService.save(busOrder);
        Map res = new HashMap();
        res.put("msg", "下单成功，订单正在审核，请等待！");
        res.put("flag", Boolean.TRUE);
        renderJson(res);
    }

    /*******************************通用订单中心***********************************/
    /*待审核订单*/
    public void toBeReviewed() {
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        cond.set("openid", openid);
        List<Record> records = busOrderService.records(cond, "bus.getToBeReviewed");
        renderJson(records);
    }

    /*审核通过的订单*/
    public void approved(){
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        cond.set("aca031", openid);
        List<Record> records = busOrderService.records(cond, "bus.getApprovedOrder");
        renderJson(records);
    }

    /*正在进行的订单*/
    public void ordersInProgress() {
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        cond.set("openid", openid);
        List<Record> records = busOrderService.records(cond, "bus.getOrdersInProgress");
        renderJson(records);
    }

    /*已完成的订单*/
    public void overOrder() {
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        cond.set("openid", openid);
        List<Record> records = busOrderService.records(cond, "bus.getOverOrder");
        renderJson(records);
    }

    /*取消订单 修改订单状态为无效*/
    public void cancelOrder(){
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
        String aca030 = cond.getStr("aca030");  //订单id
        BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
        busOrder.setAca050(0);
        busOrderService.update(busOrder);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "取消订单！");
        renderJson(res);
    }
    /*******************************通用个人中心***********************************/
    /*订单数     订单审核通过数即为订单数*/
    public void orders() {
        Map res = new HashMap();
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        Integer orders = busOrderService.findOrders(openid);
        res.put("订单数", orders);
        renderJson(res);
    }

    /*进行中*/
    public void orderProcessing() {
        Map res = new HashMap();
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        Integer integer = busOrderService.findOrderProcessing(openid);
        res.put("进行中的订单", integer);
        renderJson(res);
    }

    /*我的评价*/
    /*我的收藏*/
    /*钱包*/
    /*个人资料*/
    public void personalData() {
        Map res = new HashMap();
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
        res.put("个人资料", busCa04);
        renderJson(res);
    }

    public void dataUpdate() {
        Map res = new HashMap();
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        String aca043 = cond.getStr("aca043");  //姓名
        String aca046 = cond.getStr("aca046");  //身份证号
        String aca047 = cond.getStr("aca047");  //电话号码
        String aaa999 = cond.getStr("aaa999");  //备注
        BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
        busCa04.setAca043(aca043);
        busCa04.setAca045("居民身份证");
        busCa04.setAca046(aca046);
        busCa04.setAca047(aca047);
        busCa04.setAaa999(aaa999);
        SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        busCa04.setAaa995(slf.format(new Date()));  //更新操作时间
        busCa04Service.update(busCa04);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "修改成功！");
        renderJson(res);
    }
    /*意见反馈*/
    /*通知信息*/



    /************************微信端车队主管管理订单***********************************/
    /*查看所有 待审核订单*/
    public void toBeReviewedManage() {
        List<Record> records = busOrderService.records("bus.getToBeReviewedManage");
        renderJson(records);
    }

    /*管理员审核订单 订单状态（0为待审核，1为审核通过，2为不通过） 审核通过派车；审核未通过告知原因 */
    public void checkOrder() {
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
//        String aca031 = cond.getStr("openid");
        String aza206 = cond.getStr("aza206"); //订单审核状态
        String aca030 = cond.getStr("aca030"); //订单id
        String aza211 = cond.getStr("aza211"); //操作员id        网页端用这个
        String openid = cond.getStr("openid"); //openid         小程序用这个
        Integer operatorId = null;
        if(aza211 == null){
            operatorId = busCa04Service.findByOpenId1(openid).getAca040();
        }
        else {
            operatorId = Integer.parseInt(aza211);
        }
//        BusOrder busOrder = busOrderService.findByOpenid(aca031);
        BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
        busOrder.setAza206(Integer.parseInt(aza206));
        busOrder.setAza211(operatorId);
        busOrderService.update(busOrder);
        Integer checkCode = busOrder.getAza206();
        if (checkCode == 1) {
            res.put("msg", "审核通过");
            res.put("flag", Boolean.TRUE);
        } else {
            res.put("msg", "审核未通过");
            res.put("flag", Boolean.FALSE);
        }
        renderJson(res);
    }

    /*查询某时段可以被分配的驾驶员   暂不使用该接口  用查询所有代替*/
    public void findDriverByDate() {
        Kv cond = getCond(getParaMap());
        List<Record> records = busOrderService.records(cond, "bus.findDriverByDate");  //拿到某时段能发车的驾驶员信息
        renderJson(records);
    }


    /*修改某订单驾驶员*/
    public void updateDriver() {
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
        Integer aca030 = Integer.parseInt(cond.getStr("aca030")); //订单id
        Integer aza208 = Integer.parseInt(cond.getStr("aza208")); //驾驶员id
        BusOrder busOrder = busOrderService.findById(aca030);
        busOrder.setAza208(aza208);
        busOrderService.update(busOrder);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "驾驶员重新分配成功！");
        renderJson(res);
    }

    /*管理员已审核订单*/
    public void findOrderBySimple() {
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
        cond.set("aza211", busCa04.getAca040());
        List<Record> records = busOrderService.records(cond, "bus.findOrderBySimple");
        renderJson(records);
    }




    /************************驾驶员查看需要处理的订单*********************************/
    /*驾驶员待处理订单*/
    public void findOrderByDriver() {
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        BusCa04 busCa04 = busCa04Service.findByOpenId1(openid); //根据openid查询身份证号
        String aca046 = busCa04.getAca046();    //身份证号
        BusAa02 busAa02 = busAa02Service.findByAca046(aca046);  //通过身份证号查询驾驶员id 也就是表id
        cond.set("aza208", busAa02.getAaa020());
        List<Record> records = busOrderService.records(cond, "bus.findOrderByDriver");  //驾驶员待处理订单
        renderJson(records);
    }

    /*驾驶员进行中的订单*/
    public void findOrderProcess() {
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        BusCa04 busCa04 = busCa04Service.findByOpenId1(openid); //根据openid查询身份证号
        String aca046 = busCa04.getAca046();    //身份证号
        BusAa02 busAa02 = busAa02Service.findByAca046(aca046);  //通过身份证号查询驾驶员id 也就是表id
        cond.set("aza208", busAa02.getAaa020());
        List<Record> records = busOrderService.records(cond, "bus.findOrderProcess");  //驾驶员待处理订单
        renderJson(records);
    }

    /*驾驶员已完成订单*/
    public void findOrderOver() {
        Kv cond = getCond(getParaMap());
        String openid = cond.getStr("openid");
        BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
        String aca046 = busCa04.getAca046();    //身份证号
        BusAa02 busAa02 = busAa02Service.findByAca046(aca046);
        cond.set("aza208", busAa02.getAaa020());
        List<Record> records = busOrderService.records(cond, "bus.findOrderOver");  //驾驶员已完成订单
        renderJson(records);
    }


    /*驾驶员确认收到订单*/
        public void confirmOrder() {
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
        Integer aca030 = Integer.parseInt(cond.getStr("aca030")); //订单id
        String openid = cond.getStr("openid");
        BusOrder busOrder = busOrderService.findById(aca030);
        busOrder.setAza210(1);
        busOrderService.update(busOrder);
        BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "驾驶员：" + busCa04.getAca043() + ",工号：" + busCa04.getAca041() + "确认收到订单！");
        renderJson(res);
    }

    /*********************************开始发车******************************************/
    /*驾驶员id*/
    public void driverIdList(){
        Kv cond = getCond(getParaMap());
        List<Record> records = busAa02Service.records(cond, "bus.getDriverIdList");
        renderJson(records);
    }

    /*车辆id*/
    public void busIdList(){
        Kv cond = getCond(getParaMap());
        List<Record> records = busAa02Service.records(cond, "bus.busIdList");
        renderJson(records);
    }

    /*用户确认行程开始  乘坐状态aca036*/
    public void rideStart() {
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
        String aca030 = cond.getStr("aca030");  //订单id
        String aza201 = cond.getStr("aza201");  //车辆id
        String aza208 = cond.getStr("aza208");  //驾驶员id
        String aza202 = cond.getStr("aza202");  //里程
        String aza203 = cond.getStr("aza203");  //预估费用
        String aza209 = cond.getStr("aza203");  //预估时长
        String aza212 = cond.getStr("aza212");  //起点里程  最后会与结束里程进行计算    需要用户输入
        BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
        busOrder.setAca036(1);  //乘坐状态
        busOrder.setAza202(new BigDecimal(aza202));
        busOrder.setAza203(new BigDecimal(aza203));
        busOrder.setAza209(Integer.parseInt(aza209));
        busOrder.setAza212(new BigDecimal(aza212));
        busOrder.setAza201(Integer.parseInt(aza201));
        busOrder.setAza208(Integer.parseInt(aza208));
        SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        busOrder.setAza214(slf.format(new Date())); //实际发车时间
        busOrderService.update(busOrder);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "用户确认行程开始");
        renderJson(res);
    }

    /*驾驶员确认发车  行驶状态aaa996*/
    public void driverStart() {
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
        String aca030 = cond.getStr("aca030");  //订单id
        String aza201 = cond.getStr("aza201");  //车辆id
        String aza208 = cond.getStr("aza208");  //驾驶员id
        String aza202 = cond.getStr("aza202");  //里程
        String aza203 = cond.getStr("aza203");  //预估费用
        String aza209 = cond.getStr("aza203");  //预估时长
        String aza212 = cond.getStr("aza212");  //起点里程  最后会与结束里程进行计算    需要用户输入
        BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
        busOrder.setAaa996(1);  //发车状态
        busOrder.setAza202(new BigDecimal(aza202));
        busOrder.setAza203(new BigDecimal(aza203));
        busOrder.setAza209(Integer.parseInt(aza209));
        busOrder.setAza212(new BigDecimal(aza212));
        busOrder.setAza201(Integer.parseInt(aza201));
        busOrder.setAza208(Integer.parseInt(aza208));
        busOrderService.update(busOrder);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "驾驶员确认行程开始");
        renderJson(res);
    }
    /*********************************行程结束******************************************/
    /*用户确认行程结束  乘坐状态aca036*/
    public void rideEnd() throws ParseException {
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
        String aca030 = cond.getStr("aca030");  //订单id
        BusOrder order = busOrderService.findById(Integer.parseInt(aca030));
        BigDecimal aza212 = order.getAza212();  //起点里程
        String aza213 = cond.getStr("aza213");  //终点里程   需要用户输入
        Double actualMileage = Double.parseDouble(aza213) - aza212.doubleValue(); //实际里程
        SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String aza214 = order.getAza214();  //起点时间
        Date dateStart = slf.parse(aza214); //实际发车时间
        Date dateEnd = new Date();          //实际行程结束时间
        Integer aza209 = Math.toIntExact((dateEnd.getTime() - dateStart.getTime()) / (1000 * 60));  //实际时长（分钟）

        BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
        busOrder.setAca036(2);  //乘坐状态
        busOrder.setAza218(new BigDecimal(actualMileage));   //实际里程
        busOrder.setAza217(new BigDecimal(actualMileage/4));    //实际费用
        busOrder.setAza216(aza209); //实际时长
        busOrder.setAza215(slf.format(dateEnd));    //实际结束时间

        busOrderService.update(busOrder);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "用户确认行程结束");
        res.put("data", busOrder);
        renderJson(res);
    }

    /*驾驶员确认到达终点  行驶状态aaa996*/
    public void driverEnd() throws ParseException {
        Kv cond = getCond(getParaMap());
        Map res = new HashMap();
        String aca030 = cond.getStr("aca030");  //订单id
        BusOrder order = busOrderService.findById(Integer.parseInt(aca030));
        BigDecimal aza212 = order.getAza212();  //起点里程
        String aza213 = cond.getStr("aza213");  //终点里程   需要用户输入
        Double actualMileage = Double.parseDouble(aza213) - aza212.doubleValue(); //实际里程
        SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String aza214 = order.getAza214();
        Date dateStart = slf.parse(aza214); //实际发车时间
        Date dateEnd = new Date();          //实际行程结束时间
        Integer aza209 = Math.toIntExact((dateEnd.getTime() - dateStart.getTime()) / (1000 * 60));  //实际时长（分钟）

        BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
        busOrder.setAaa996(2);  //发车状态
        busOrder.setAza218(new BigDecimal(actualMileage));   //实际里程
        busOrder.setAza217(new BigDecimal(actualMileage/4));    //实际费用
        busOrder.setAza216(aza209); //实际时长
        busOrder.setAza215(slf.format(dateEnd));    //实际结束时间

        busOrderService.update(busOrder);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "驾驶员确认行程结束");
        res.put("data", busOrder);
        renderJson(res);
    }



    /*********************************评价功能******************************************/
    /*用户对驾驶员的评价*/
    public void evaluate() {
        Map res = new HashMap();
        Kv cond = getCond(getParaMap());
        //拿到订单id  添加评价
        Integer aca030 = Integer.parseInt(cond.getStr("aca030")); //订单id
        Integer aca032 = Integer.parseInt(cond.getStr("aca032"));//评价星级 1、2、3、4、5星  参考 美团订单
        Integer aca033 = null;  //评价类型  差评 星级小于3   1； 一般 3  2；  好评  大于3    3
        String aca034 = cond.getStr("aca034");  //评价备注
        BusOrder busOrder = busOrderService.findById(aca030);
        busOrder.setAca032(aca032);
        if (aca032 > 3) {
            aca033 = 1;
        } else if (aca032 == 3) {
            aca033 = 2;
        } else {
            aca033 = 3;
        }
        busOrder.setAca033(aca033);
        busOrder.setAca034(aca034);
        busOrderService.update(busOrder);
        res.put("flag", Boolean.TRUE);
        res.put("msg", "评价成功！");
        renderJson(res);
    }
}
