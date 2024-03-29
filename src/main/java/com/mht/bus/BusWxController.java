package com.mht.bus;

import cn.dreampie.ValidateKit;
import com.jfinal.config.Constant;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.mht.bus.service.*;
import com.mht.bus.util.MessageUtil;
import com.mht.bus.util.wxToken.TokenThread;
import com.mht.common.CommonController;
import com.mht.common.model.*;
import com.mht.common.utils.AESUtil;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.mht.bus.BusOrderController.busBa02Service;
import static com.mht.bus.BusOrderController.busPriceService;
import static com.mht.bus.util.MessageUtil.sendMessage;
import static com.mht.system.SystemController.sysUserService;

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
    public static final BusAa04Service busAa04Service = BusAa04Service.me;
    public static final BusImgsService busImgsService = BusImgsService.me;
    public static final BusCommonService busCommonService=BusCommonService.me;


    /*登录*/
    public void login() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            //登录
            String code = cond.getStr("code");
            String openid = getOpenId(code,appid, secret);
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
            } else {
                //判断用户的账号、工号是否正确
                String aca041 = busCa04.getAca041();    //工号
                String aca043 = busCa04.getAca043();    //姓名
                String s1 = cond.getStr("aca041");
                String s2 = cond.getStr("aca043");
                res.put("openid", openid);
                if (s1 == null){
                    res.put("flag", Boolean.FALSE);
                    res.put("msg", "工号不能为空！");
                    renderJson(res);
                    return;
                }
                if (!aca041.equals(s1)){
                    res.put("flag", Boolean.FALSE);
                    res.put("msg", "工号输入错误！");
                    renderJson(res);
                    return;
                }
                if(s2 == null){
                    res.put("flag", Boolean.FALSE);
                    res.put("msg", "账户名不能为空！");
                    renderJson(res);
                    return;
                }
                if(!aca043.equals(s2)){
                    res.put("flag", Boolean.FALSE);
                    res.put("msg", "账户名输入错误！");
                    renderJson(res);
                    return;
                }
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
        } catch (Exception e) {
            res.put("flag", Boolean.FALSE);
            res.put("msg", "登陆失败！");
            e.printStackTrace();
        }
        renderJson(res);
//        UserToken userToken = userTokenService.bind(user);
//        return RestResponse.ok(userToken.getToken());
    }
    /*注册*/
    public void register() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            //2. 得到code
            String code = cond.getStr("code");
            //3. 得到openID
            String openid = getOpenId(code,appid, secret);
            if (null == openid) {
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

            //注册进sys_user
//            SysUser sysUser = new SysUser();
            SysUser user = sysUserService.checkName(aca043);
            if(user == null){
                SysUser sysUser = new SysUser();
                sysUser.setLoginName(aca043);   //登录名
                sysUser.setUserName(aca043);    //用户名
                sysUser.setSiteId(392);          //教学点代码      默认值
                sysUser.setPlatIds("0,9");       //系统平台编号    默认值
//                if (ValidateKit.isNullOrEmpty(sysUser.getStatus())) {
                sysUser.setStatus(1);            //默认为1  有效账号
//                }
                sysUser.setPassword(AESUtil.AESEncode("123456"));   //设置密码为默认值123456
                if (ValidateKit.isNullOrEmpty(sysUser.getUserId())) {
                    sysUser.setCreateTime(getNowDate());
                    sysUserService.save(sysUser);
                }
            }else {
                res.put("flag", Boolean.FALSE);
                res.put("msg", "注册名重复！");
                renderJson(res);
                return;
            }
            int sysUserId = sysUserService.findByName(aca043);

            ca04.setAza001(sysUserId);  //存储sys_user关联id
            busCa04Service.save(ca04);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "注册成功！");
            res.put("openid", openid);
            if(aca044 == "驾驶员"){
                BusAa02 busAa02 = new BusAa02();
                busAa02.setAaa002(aca043);  //姓名
                busAa02.setAaa003(1);
                busAa02.setAaa004("123456");
                busAa02.setAaa996(1);
                busAa02.setAaa998(new Date());
                busAa02.setAza021("C1");
                busAa02Service.save(busAa02);
            }
            if(aca044 == "管理员"){
                BusAa04 busAa04 = new BusAa04();
                busAa04.setAaa041(aca043);  //姓名
                busAa04.setAaa042("15181716179");
                busAa04.setAaa043("123456");
                busAa04.setAaa996(1);
                busAa04.setAaa998(new Date());
                busAa04Service.save(busAa04);
            }
        } catch (Exception e) {
            res.put("flag", Boolean.FALSE);
            res.put("msg", "注册失败！");
            e.printStackTrace();
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
//        String appid=getPara("appid");
//        String secret=getPara("secret");
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
                        List<Record> records= Db.find("select * from bus_ca04 where aca041=? and aca044=? and aca042!=? and aaa996=1",aca041,aca044,openid);
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


    /*未分页的驾驶员列表  返回给微信端 只返回该时段能用的驾驶员*/
    public void getBusAa02All() {
        try {
            Kv cond = getCond(getParaMap());
            List<Record> records = busAa02Service.records(cond, "bus.getBusAa02List1");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 计算费用
     * @param sm        预估里程
     * @param busType   车辆类型
     * @param isSingle  单双程
     * @return
     */
    private static Integer getPrice(Integer sm,Integer busType,String isSingle){
        Integer price = 0;  //最终费用
        if(Integer.parseInt(isSingle) != 1){
            sm = sm * 2;
        }
        BusBa02 busBa02 = busBa02Service.findById(busType + "");
        String aba002 = busBa02.getAba002();
        //总里程价格表（费用单位：元）：≤50公里   450；51-100公里   900；101-150公里  1200
        // ；151-200公里  1400；201-300公里  1800；301-400公里  2100；401-500公里  2400。
        if("考斯特".equals(aba002)){
            if(sm <= 50 * 1000){
                price = 450;
            }else if (sm >50 * 1000 && sm<=100 * 1000){
                price = 900;
            }
            else if (sm >100 * 1000 && sm<=150 * 1000){
                price = 1200;
            }
            else if (sm >150 * 1000 && sm<=200 * 1000){
                price = 1400;
            }
            else if (sm >200 * 1000 && sm<=300 * 1000){
                price = 1800;
            }
            else if (sm >300 * 1000 && sm<=400 * 1000){
                price = 2100;
            }
            else if (sm >400 * 1000 && sm<=500 * 1000){
                price = 2400;
            }
            else {
                price = 10000;
            }
        }
        //总里程价格表（费用单位：元）：≤50公里   700；51-100公里   900；101-150公里  1100
        // ；151-200公里  1300；201-300公里  1600；301-400公里  1850；401-500公里  2100。
        if("大巴（37座）".equals(aba002)){
            if(sm <= 50 * 1000){
                price = 700;
            }else if (sm >50 * 1000 && sm<=100 * 1000){
                price = 900;
            }
            else if (sm >100 * 1000 && sm<=150 * 1000){
                price = 1100;
            }
            else if (sm >150 * 1000 && sm<=200 * 1000){
                price = 1300;
            }
            else if (sm >200 * 1000 && sm<=300 * 1000){
                price = 1600;
            }
            else if (sm >300 * 1000 && sm<=400 * 1000){
                price = 1850;
            }
            else if (sm >400 * 1000 && sm<=500 * 1000){
                price = 2100;
            }
            else {
                price = 10000;
            }
        }
        //总里程价格表（费用单位：元）：≤50公里   900；51-100公里   1200；101-150公里  1300；
        // 151-200公里  1500；201-300公里  1900；301-400公里  2250；401-500公里  2600。
        if("大巴（47座）".equals(aba002)){
            if(sm <= 50 * 1000){
                price = 900;
            }else if (sm >50 * 1000 && sm<=100 * 1000){
                price = 1200;
            }
            else if (sm >100 * 1000 && sm<=150 * 1000){
                price = 1300;
            }
            else if (sm >150 * 1000 && sm<=200 * 1000){
                price = 1500;
            }
            else if (sm >200 * 1000 && sm<=300 * 1000){
                price = 1900;
            }
            else if (sm >300 * 1000 && sm<=400 * 1000){
                price = 2250;
            }
            else if (sm >400 * 1000 && sm<=500 * 1000){
                price = 2600;
            }
            else {
                price = 10000;
            }
        }
        //总里程价格表（费用单位：元）：≤50公里   1100；51-100公里   1300；101-150公里  1500
        // ；151-200公里  1700；201-300公里  2100；301-400公里  2500；401-500公里  2900。
        if("大巴（54座）".equals(aba002)){
            if(sm <= 50){
                price = 1100;
            }else if (sm >50 && sm<=100){
                price = 1300;
            }
            else if (sm >100 && sm<=150){
                price = 1500;
            }
            else if (sm >150 && sm<=200){
                price = 1700;
            }
            else if (sm >200 && sm<=300){
                price = 2100;
            }
            else if (sm >300 && sm<=400){
                price = 2500;
            }
            else if (sm >400 && sm<=500){
                price = 2900;
            }
            else {
                price = 10000;
            }
        }

        //BusPrice busPrice = busPriceService.findFirst();
//        Integer aaa002 = busPrice.getAaa002();
//        Integer aaa003 = busPrice.getAaa003();
//        Integer aaa004 = busPrice.getAaa004();
//        Integer aaa005 = busPrice.getAaa005();
//        Integer aaa006 = busPrice.getAaa006();
//        if(m <= aaa002){
//            return aaa003;
//        }
//        else if(m > aaa002 && m <= aaa005){
//            return (m - aaa002) * aaa004 + aaa003;
//        }else {
//            return (aaa005 - aaa002)*aaa004 + aaa003 + (m- aaa005)*aaa006;
//        }
        return price;
    }

    //预约之前返回预估费用  通过里程计算  这里就是预估费用的计费规则接口
    public void estimatedCost(){
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String mileage = cond.getStr("mileage");
            String carType = cond.getStr("carType");
            String oneTwoWay = cond.getStr("oneTwoWay");
            int anInt = Integer.parseInt(mileage);
            Integer price = getPrice(anInt,Integer.parseInt(carType),oneTwoWay);//预估费用
            res.put("flag", Boolean.TRUE);
            res.put("msg", "预估费用！");
            res.put("cost", price);
        } catch (Exception e) {
            res.put("flag", Boolean.FALSE);
            e.printStackTrace();
        }
        renderJson(res);
    }


    /*微信端预约*/
    public void orderBus() throws ParseException {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String dateTime = cond.getStr("dateTime");      //时间
            String dateEnd = cond.getStr("dateEnd");      //预计归还时间

            String isUrgency = cond.getStr("isUrgency");    //是否为紧急用车（0为紧急用车，1为正常用车）
            Integer carTypeId = Integer.parseInt(cond.getStr("carType"));   //车型id
//            Integer driverId = Integer.parseInt(cond.getStr("driver"));     //驾驶员id
            String disTime = cond.getStr("disTime");        //预估时长
//            String car = cond.getStr("car");    //车辆id
            String start = cond.getStr("start");            //出发地点+经纬度
            String end = cond.getStr("end");                //终点+经纬度
            String remarks = cond.getStr("remarks");        //备注
            String mileage = cond.getStr("mileage");        //预估里程
            String personType = cond.getStr("userType");    //人员类型
            String username = cond.getStr("username");      //用户名
            String openid = cond.getStr("openId");          //openid
            //预约界面增加人数、联系人电话
            String number = cond.getStr("number");          //乘车人数
            String phone = cond.getStr("phone");            //预约联系人电话
            String isSingle = cond.getStr("oneTwoWay");      //单双程  1为单程，2为往返

            //个人用车还是公家用车
//            Integer aza219 = Integer.parseInt(cond.getStr("aza219"));
            BusOrder busOrder = new BusOrder();
//            busOrder.setAza219(aza219);  //应取上面的aza219的值 待修改
            SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            busOrder.setAba032(slf.parse(dateTime));
            busOrder.setAza207(carTypeId);
//            busOrder.setAza208(driverId);
            busOrder.setAza220(number);
            busOrder.setAza221(phone);
            busOrder.setAza222(Integer.parseInt(isUrgency));
//            if (car != null){
//                Integer carId = Integer.parseInt(car);        //车辆id
//                busOrder.setAza201(carId);
//            }
//            else {
                busOrder.setAza201(null);
//            }
            if(Integer.parseInt(isSingle) == 2){
                if(dateEnd != null){
                    busOrder.setAba033(slf.parse(dateEnd)); //预计归还时间
                }
            }
            busOrder.setAza204(start);
            busOrder.setAza205(end);
            busOrder.setAaa999(remarks);
            int i = Integer.parseInt(mileage) / 1000;
            BigDecimal decimal = new BigDecimal(i);
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
            busOrder.setAaa997(username);               //设置用户名字
            busOrder.setAba041(busCa04.getAca040());    //设置用户id
            busOrder.setAaa998(new Date());             //设置创建时间
            busOrder.setAca035(0);                      //支付状态（0未支付，1已支付）
            busOrder.setOutTradeNo("");                 /*商户订单号  这里需要支付后才会有订单号  暂未获取*/

            int anInt = Integer.parseInt(mileage);
            Integer price = getPrice(anInt,carTypeId,isSingle);/*预估费用  值来自于费用计算规则*/
            BigDecimal bigDecimal = new BigDecimal(price);
            busOrder.setAza202(bigDecimal);
            busOrder.setAaa996(0);  //开车状态（0为等待发车，1为正在行驶，2为行程结束）
            busOrder.setAca036(0);  //乘坐状态（0为未乘坐，1为正在乘坐，2为乘坐结束）
            busOrder.setAza206(0);  //订单状态（0为待审核，1为审核通过，2为不通过）
            busOrder.setAza210(0);  //默认驾驶员未确认订单收到（0未收到，1收到）
            busOrder.setAza209(Integer.parseInt(disTime));  //预估时长
            busOrder.setAca050(1);
            busOrder.setAca035(0);  //订单支付状态  0为未支付，1为已支付

            busOrderService.save(busOrder);

            /*得到所有管理员的openid*/
            List<Record> records = busOrderService.records(cond, "bus.getAllManageOpenid");
            /*得到accessToken*/
//            String accessToken = getProperties();
            String accessToken = TokenThread.accessToken.getAccessToken();
            res.put("msg", "下单成功，订单正在审核，请等待！");
            res.put("flag", Boolean.TRUE);
            res.put("openids",records);
            res.put("accessToken",accessToken);
            res.put("busOrder",busOrder);
        } catch (Exception e) {
            res.put("msg", "下单失败，请联系管理员！");
            res.put("flag", Boolean.FALSE);
            e.printStackTrace();
        }
        renderJson(res);
    }


    /*******************************通用订单中心***********************************/
    /*待审核订单*/
    public void toBeReviewed() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            cond.set("openid", openid);
            List<Record> records = busOrderService.records(cond, "bus.getToBeReviewed");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*审核通过的订单*/
    public void approved() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            cond.set("aca031", openid);
            List<Record> records = busOrderService.records(cond, "bus.getApprovedOrder");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*正在进行的订单*/
    public void ordersInProgress() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            cond.set("openid", openid);
            List<Record> records = busOrderService.records(cond, "bus.getOrdersInProgress");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*已完成的订单*/
    public void overOrder() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            cond.set("openid", openid);
            List<Record> records = busOrderService.records(cond, "bus.getOverOrder");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*取消订单 修改订单状态为无效*/
    public void cancelOrder() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String aca030 = cond.getStr("aca030");  //订单id
            BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
            busOrder.setAca050(0);
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "取消订单！");
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "取消未成功！");
        }
        renderJson(res);
    }

    /*******************************通用个人中心***********************************/
    /*订单数     订单审核通过数即为订单数*/
    public void orders() {
        try {
            Map res = new HashMap();
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            Integer orders = busOrderService.findOrders(openid);
            res.put("订单数", orders);
            renderJson(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*进行中*/
    public void orderProcessing() {
        try {
            Map res = new HashMap();
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            Integer integer = busOrderService.findOrderProcessing(openid);
            res.put("进行中的订单", integer);
            renderJson(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*我的评价*/
    public void myEvaluate() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            cond.set("aca031", openid);
            List<Record> records = busOrderService.records(cond, "bus.findMyEvaluate");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*个人资料*/
    public void personalData() {
        try {
            Map res = new HashMap();
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
            res.put("个人资料", busCa04);
            renderJson(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dataUpdate() {
        Map res = new HashMap();
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "修改失败！");
        }
        renderJson(res);
    }


    /************************管理员处理订单***********************************/
    /*查看所有 待审核订单*/
    public void toBeReviewedManage() {
        try {
            List<Record> records = busOrderService.records("bus.getToBeReviewedManage");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*管理员审核订单 订单状态（0为待审核，1为审核通过，2为不通过） 审核通过派车；审核未通过告知原因 */
    public void checkOrder() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String aza206 = cond.getStr("aza206"); //订单审核状态
            String aca030 = cond.getStr("aca030"); //订单id
            String openid = cond.getStr("openid"); //openid         小程序用这个
            String price = cond.getStr("price"); //   管理员定价
            Integer operatorId = null;
            operatorId = busCa04Service.findByOpenId1(openid).getAca040();
            BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
            busOrder.setAza206(Integer.parseInt(aza206));
            busOrder.setAza211(operatorId);
            busOrder.setAza217(new BigDecimal(price));
            busOrderService.update(busOrder);
            Integer checkCode = busOrder.getAza206();
            if (checkCode == 1) {
                res.put("msg", "审核通过");
                res.put("flag", Boolean.TRUE);
                //查询管理员电话

                //审核通过后给申请人发短信
                sendMessage("15181716179","订单审核已通过，请及时支付");
            } else {
                res.put("msg", "审核未通过");
                res.put("flag", Boolean.FALSE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    /*查询某时段可以被分配的驾驶员   暂不使用该接口  用查询所有代替*/
    public void findDriverByDate() {
        try {
            Kv cond = getCond(getParaMap());
            List<Record> records = busOrderService.records(cond, "bus.findDriverByDate");  //拿到某时段能发车的驾驶员信息
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*修改某订单驾驶员*/
    public void updateDriver() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            Integer aca030 = Integer.parseInt(cond.getStr("aca030")); //订单id
            Integer aza208 = Integer.parseInt(cond.getStr("aza208")); //驾驶员id
            BusOrder busOrder = busOrderService.findById(aca030);
            busOrder.setAza208(aza208);
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "驾驶员分配成功！");
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "分配失败！");
        }
        renderJson(res);
    }

    /*修改某订单车辆*/
    public void updateBus() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            Integer aca030 = Integer.parseInt(cond.getStr("aca030")); //订单id
            Integer busId = Integer.parseInt(cond.getStr("busId")); //车辆id
            BusOrder busOrder = busOrderService.findById(aca030);
            busOrder.setAza201(busId);
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "车辆分配成功！");
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "分配失败！");
        }
        renderJson(res);
    }

    /*管理员已审核订单*/
    public void findOrderBySimple() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
            cond.set("aza211", busCa04.getAca040());
            List<Record> records = busOrderService.records(cond, "bus.findOrderBySimple");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /************************驾驶员查看需要处理的订单*********************************/
    /*驾驶员待处理订单*/
    public void findOrderByDriver() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            BusCa04 busCa04 = busCa04Service.findByOpenId1(openid); //根据openid查询身份证号
            String aca046 = busCa04.getAca046();    //身份证号
            BusAa02 busAa02 = busAa02Service.findByAca046(aca046);  //通过身份证号查询驾驶员id 也就是表id
            cond.set("aza208", busAa02.getAaa020());
            List<Record> records = busOrderService.records(cond, "bus.findOrderByDriver");  //驾驶员待处理订单
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*驾驶员进行中的订单*/
    public void findOrderProcess() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            BusCa04 busCa04 = busCa04Service.findByOpenId1(openid); //根据openid查询身份证号
            String aca046 = busCa04.getAca046();    //身份证号
            BusAa02 busAa02 = busAa02Service.findByAca046(aca046);  //通过身份证号查询驾驶员id 也就是表id
            cond.set("aza208", busAa02.getAaa020());
            List<Record> records = busOrderService.records(cond, "bus.findOrderProcess");  //驾驶员待处理订单
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*驾驶员已完成订单*/
    public void findOrderOver() {
        try {
            Kv cond = getCond(getParaMap());
            String openid = cond.getStr("openid");
            BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
            String aca046 = busCa04.getAca046();    // 身份证号
            BusAa02 busAa02 = busAa02Service.findByAca046(aca046);
            cond.set("aza208", busAa02.getAaa020());
            List<Record> records = busOrderService.records(cond, "bus.findOrderOver");  //驾驶员已完成订单
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*驾驶员确认收到订单*/
    public void confirmOrder() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            Integer aca030 = Integer.parseInt(cond.getStr("aca030")); //订单id
            String openid = cond.getStr("openid");
            BusOrder busOrder = busOrderService.findById(aca030);
            busOrder.setAza210(1);
            busOrderService.update(busOrder);
            BusCa04 busCa04 = busCa04Service.findByOpenId1(openid);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "驾驶员：" + busCa04.getAca043() + ",工号：" + busCa04.getAca041() + "确认收到订单！");
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
        }
        renderJson(res);
    }

    /*********************************开始发车******************************************/
    /*驾驶员id*/
    public void driverIdList() {
        try {
            Kv cond = getCond(getParaMap());
            List<Record> records = busAa02Service.records(cond, "bus.getDriverIdList");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*车辆id*/
    public void busIdList() {
        try {
            Kv cond = getCond(getParaMap());
            List<Record> records = busAa02Service.records(cond, "bus.busIdList");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*驾驶员确认发车  行驶状态aaa996*/
    public void driverStart() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String aca030 = cond.getStr("aca030");  //订单id
//            String aza201 = cond.getStr("aza201");  //车辆id
            String aza208 = cond.getStr("aza208");  //驾驶员id
//            String aza202 = cond.getStr("aza202");  //预估费用
//            String aza203 = cond.getStr("aza203");  //预估里程
//            String aza209 = cond.getStr("aza209");  //预估时长
            String aza212 = cond.getStr("aza212");  //起点里程  最后会与结束里程进行计算
            BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));

            String storePath = cond.getStr("storePath");        //数据库存储路径
            BusImgs busImgs = new BusImgs();
            busImgs.setAaa002(busOrder.getAca030());
            busImgs.setAaa003(storePath);
            busImgs.setAaa004("行程开始");
            busImgsService.save(busImgs);
            busOrder.setAca036(1);  //乘坐状态
            busOrder.setAaa996(1);  //发车状态
//            busOrder.setAza202(new BigDecimal(aza202));
//            busOrder.setAza203(new BigDecimal(aza203));
//            busOrder.setAza209(Integer.parseInt(aza209));
            busOrder.setAza212(new BigDecimal(aza212));
//            busOrder.setAza201(Integer.parseInt(aza201));
            busOrder.setAza208(Integer.parseInt(aza208));
            SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            busOrder.setAza214(slf.format(new Date())); //实际发车时间
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "驾驶员确认行程开始");

        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    /*用户确认行程开始  乘坐状态aca036*/
    public void rideStart() {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String aca030 = cond.getStr("aca030");  //订单id
            BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
            Integer aaa996 = busOrder.getAaa996();
            if(aaa996 != 1){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "驾驶员未确认行程开始！");
                renderJson(res);
                return;
            }
            busOrder.setAca036(1);  //乘坐状态
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "用户确认行程开始");
            res.put("Start", busOrder.getAza212());
        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    //用户确认行程开始时应看到订单的里程数  并且只有驾驶员点确认开始了用户才能点确认
    public void orderStateStart(){
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String aca030 = cond.getStr("aca030");  //订单idres.put("flag", Boolean.TRUE);
            BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
            Integer aaa996 = busOrder.getAaa996();
            Integer aca036 = busOrder.getAca036();
            if(aaa996 != 1){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "驾驶员未确认行程开始！");
            }
            else {
                res.put("Start", busOrder.getAza212());
                res.put("msg", "起点驾驶员里程数！");
            }
        } catch (Exception e) {
            res.put("flag", Boolean.FALSE);
            res.put("msg", "系统错误！");
            e.printStackTrace();
        }
        renderJson(res);
    }

    //用户确认行程结束时应看到订单的里程数  并且只有驾驶员点确认结束了用户才能点确认
//    public void orderStateEnd(){
//        Map res = new HashMap();
//        try {
//            Kv cond = getCond(getParaMap());
//            String aca030 = cond.getStr("aca030");  //订单idres.put("flag", Boolean.TRUE);
//            BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
//            Integer aaa996 = busOrder.getAaa996();
//            Integer aca036 = busOrder.getAca036();
//            if(aca036 == 1 && aaa996 != 2){
//                res.put("flag", Boolean.FALSE);
//                res.put("msg", "驾驶员未确认行程结束！");
//            }else {
//                res.put("End", busOrder.getAza213());
//                res.put("msg", "终点驾驶员里程数！");
//            }
//        } catch (Exception e) {
//            res.put("flag", Boolean.FALSE);
//            res.put("msg", "系统错误！");
//            e.printStackTrace();
//        }
//        renderJson(res);
//    }

    /*********************************行程结束******************************************/


    /*驾驶员确认到达终点  行驶状态aaa996*/
    public void driverEnd() throws ParseException {
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String aca030 = cond.getStr("aca030");  //订单id
            BusOrder order = busOrderService.findById(Integer.parseInt(aca030));
            //判断驾驶员是否点了开始
            if(order.getAza214() == null){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "驾驶员请先确认行程开始！");
                renderJson(res);
                return;
            }
            BigDecimal aza212 = order.getAza212();       //起点里程
            String aza213 = cond.getStr("aza213");  //终点里程   需要驾驶员输入
            Double actualMileage = Double.parseDouble(aza213) - aza212.doubleValue(); //实际里程
            SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String aza214 = order.getAza214();
            Date dateStart = slf.parse(aza214); //实际发车时间
            Date dateEnd = new Date();          //实际行程结束时间
            Integer aza209 = Math.toIntExact((dateEnd.getTime() - dateStart.getTime()) / (1000 * 60));  //实际时长（分钟）

            BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));

            String storePath = cond.getStr("storePath");        //上传图片的数据库存储路径
            BusImgs busImgs = busImgsService.findByAaa002(busOrder.getAca030());
            busImgs.setAaa005(storePath);
            busImgs.setAaa006("行程结束");
            busImgsService.update(busImgs);

            busOrder.setAca036(2);  //乘坐状态
            busOrder.setAaa996(2);                                              //发车状态
            busOrder.setAza218(new BigDecimal(actualMileage/1000));                  //实际里程
//            Integer price = getPrice(actualMileage.intValue());
//            busOrder.setAza217(new BigDecimal(price));                          //实际费用
            busOrder.setAza216(aza209);                                         //实际时长
            busOrder.setAza215(slf.format(dateEnd));                            //实际结束时间
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "驾驶员确认行程结束");
            res.put("data", busOrder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    /*用户确认行程结束  乘坐状态aca036*/
//    public void rideEnd() throws ParseException {
//        Map res = new HashMap();
//        try {
//            Kv cond = getCond(getParaMap());
//            String aca030 = cond.getStr("aca030");  //订单id
//            BusOrder order = busOrderService.findById(Integer.parseInt(aca030));
//            //判断用户是否点了开始
//            if(order.getAza214() == null){
//                res.put("flag", Boolean.FALSE);
//                res.put("msg", "用户请先确认行程开始！");
//                renderJson(res);
//                return;
//            }
//            BusOrder busOrder = busOrderService.findById(Integer.parseInt(aca030));
//            Integer aca036 = busOrder.getAca036();
//            Integer aaa996 = busOrder.getAaa996();
//            if(aca036 == 1 && aaa996 != 2){
//                res.put("flag", Boolean.FALSE);
//                res.put("msg", "驾驶员未确认行程结束！");
//                renderJson(res);
//                return;
//            }
//            busOrder.setAca036(2);  //乘坐状态
//            busOrderService.update(busOrder);
//            res.put("flag", Boolean.TRUE);
//            res.put("msg", "用户确认行程结束");
//            res.put("data", busOrder);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        renderJson(res);
//    }

    /*********************************评价功能******************************************/
    /*用户对驾驶员的评价*/
    public void evaluate() {
        Map res = new HashMap();
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    //由于确认订单时输入错误，需要返单
    public void fanDan(){
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String orderId = cond.getStr("orderId");
            BusOrder busOrder = busOrderService.findById(Integer.parseInt(orderId));
            busOrder.setAca036(0);
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "返单成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    //申请取消  管理员同意之后  将订单状态设置为2  并填写取消理由
    public void  cancelRequest(){
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String id = cond.getStr("orderId");
            String reason = cond.getStr("reason");
            BusOrder busOrder = busOrderService.findById(Integer.parseInt(id));
            busOrder.setAca050(2);
            busOrder.setAza223(reason);
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "订单取消申请已发出，请等待！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    //管理员处理已审核的订单,未发车，但是用户要取消
    //改为订单是否被取消（0取消，1使用），2为管理员同意订单后未发车，取消的订单的状态，3为管理员审核通过的取消的订单
    public void  cancelRequestCheck(){
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String id = cond.getStr("orderId");
            String check = cond.getStr("check");
            BusOrder busOrder = busOrderService.findById(Integer.parseInt(id));
            int i = Integer.parseInt(check);
            String str = "";
            if(i == 3){
                str = "管理员同意取消订单";
            }
            else {
                str = "管理员不同意取消订单";
            }
            busOrder.setAca050(i);
            busOrderService.update(busOrder);
            res.put("flag", Boolean.TRUE);
            res.put("msg", str);

        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    //待取消订单列表  已审核通过  但是未发车  要取消的订单
    public void cancelOrderList(){
        try {
            Kv cond = getCond(getParaMap());
            List<Record> records = busOrderService.records(cond, "bus.findCancelOrderList");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //根据时间查询可选车辆状态
    public void getBusStateList() throws ParseException {
        Kv cond = getCond(getParaMap());
        String date = cond.getStr("date");
        String dateEnd = cond.getStr("dateEnd");
//        SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        //加两小时
//        long time = slf.parse(date).getTime() + 2 * 60 * 60 * 1000;
//        String dateEnd = slf.format(time);
        cond.set("dateEnd",dateEnd);
        List<Record> records = busOrderService.records(cond, "bus.getBusStateList");
        renderJson(records);
    }

    //查询未支付但是审核通过的订单
    public void  nonPayment(){
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            List<Record> records = busOrderService.records(cond, "bus.getNonPaymentOrder");
            res.put("flag", Boolean.TRUE);
            res.put("msg", "未付款订单");
            res.put("data",records);
        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(res);
    }

    //假支付
    public void  payment(){
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            String orderId = cond.getStr("orderId");
            BusOrder byId = busOrderService.findById(Integer.parseInt(orderId));
            byId.setOutTradeNo("11111111");
            byId.setAca035(1);
            busOrderService.update(byId);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "支付成功！");
        } catch (Exception e) {
            res.put("flag", Boolean.FALSE);
            res.put("msg", "支付异常！");
            e.printStackTrace();
        }
        renderJson(res);
    }

    //注册用的 用户角色/人员类型
    public void  userRole (){
        List<Record> records = busOrderService.records("bus.getUserRole");
        renderJson(records);
    }

    //登录用的 用户角色/人员类型
    public void  userRoleLogin (){
        List<Record> records = busOrderService.records("bus.getUserRoleLogin");
        renderJson(records);
    }


    public static final BusCa08Service busCa08Service= BusCa08Service.me;
    public void saveBusCa08(){
        Map res = new HashMap();
        BusCa08 busCa08=new BusCa08();
        Kv cond = getCond(getParaMap());
        busCa08.setAca081(cond.getStr("aca081"));
        busCa08.setAca082(cond.getStr("aca082"));
        busCa08.setAca083(cond.getStr("aca083"));
        busCa08.setAca084(cond.getStr("aca084"));
        busCa08.setAca044(cond.getStr("aca044"));
        SysUser user=getUserInfo();
        if(busCa08.getAca080()==null){
            if(!ValidateKit.isNullOrEmpty(user)){
                busCa08.setAaa997(user.getUserName());
            }
            busCa08.setAaa996(1);
            busCa08.setAaa997("小程序注册");
            busCa08.setAaa998(getNowTimeStamp());
            busCa08Service.save(busCa08);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "注册成功！");
        }else{
//            busCa08Service.update(busCa08);
            res.put("flag", Boolean.FALSE);
            res.put("msg", "注册失败！");
        }
//        redirect("/bus/busCa08");
        renderJson(res);
    }

    //返回车辆提前预约所需时间
    public void  getAdvanceRes (){
        BusPrice busPrice = BusPrice.dao.findFirst("select * from bus_price");
        if(busPrice.getAaa007() == null){
            busPrice.setAaa007(24);
        }
        if(busPrice.getAaa008() == null){
            busPrice.setAaa008(48);
        }
        renderJson(busPrice);
}


    public static final BusInvoiceService busInvoiceService= BusInvoiceService.me;
    //发票记录
    public void invoice(){
        Map res = new HashMap();
        try {
            Kv cond = getCond(getParaMap());
            BusInvoice busInvoice = new BusInvoice();
            busInvoice.setAaa002(Integer.parseInt(cond.getStr("orderId")));   //订单id
            busInvoice.setAaa003(cond.getStr("aaa003"));    //发票抬头
            busInvoice.setAaa004(cond.getStr("aaa004"));    //用户邮箱
            busInvoice.setAaa005(0);
            busInvoiceService.save(busInvoice);
            res.put("flag", Boolean.TRUE);
            res.put("msg", "开票申请已提交！");
        }
        catch (Exception e){
            res.put("flag", Boolean.FALSE);
            res.put("msg", "提交申请失败，请联系管理员！");
            e.printStackTrace();
        }
        renderJson(res);
    }

    public void wechatMes(){
        renderJson("请升级新版微信客户端！！");
    }

   /* public static void main(String[] args) throws Exception {
        String message = sendMessage("15181716179,15181716179", "校车部门测试");
        System.out.println(message);
    }*/

    public void  test() throws Exception {
        String message = sendMessage("15181716179,15181716179", "校车部门测试");
        System.out.println(message);
        renderJson(message);
    }
}
