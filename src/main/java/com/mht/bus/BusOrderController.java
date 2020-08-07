package com.mht.bus;

import cn.dreampie.ValidateKit;
import com.jfinal.config.Constant;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.rest.API;
import com.mht.bus.service.*;
import com.mht.bus.util.WxUtil;
import com.mht.common.CommonController;
import com.mht.common.model.BusAa01;
import com.mht.common.model.BusBa02;
import com.mht.common.model.BusCa04;
import com.mht.common.model.BusOrder;
import com.mht.common.utils.Format;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BusOrderController extends CommonController {

    public static final BusAa01Service busAa01Service = BusAa01Service.me;
    public static final BusAa02Service busAa02Service = BusAa02Service.me;
    public static final BusCa03Service busCa03Service = BusCa03Service.me;
    public static final BusCa04Service busCa04Service = BusCa04Service.me;
    public static final BusOrderService busOrderService = BusOrderService.me;
    public static final BusBa02Service busBa02Service = BusBa02Service.me;

    public static String appid = "wxd80120cbfe499af5";
    public static String secret = "80375d057fce3c824a0c5b13ed42d52f";


    /*车辆预约*/
    public void busOrder() {
        render("busAaaOrder.html");
    }

    /*车型管理*/
    public void busTypeManage() {
        render("busAaaTypeManage.html");
    }

    /*车辆管理*/
    public void busManage() {
        render("busAaaManage.html");
    }

    /*订单管理*/
    public void busOrderManage() {
        render("busAaaOrderManage.html");
    }

    /*人员管理*/
    public void personManage() {
        render("busAaaPersonManage.html");
    }

    /*增加或者修改车辆信息*/
    public void addOrUpdateBus() {
        BusAa01 busAa01 = getModel(BusAa01.class, "busAa01");
        String aaa001 = getPara("aaa001", "");
        if (!aaa001.isEmpty()) {
            busAa01 = busAa01Service.findById(aaa001);
        }
        setAttr("ba02List", Db.find("select aba020 as id , aba002 as  name from bus_ba02 where aaa996=1"));
        setAttr("busAa01", busAa01);
        render("busAaaManageDetail.html");
    }


    /*车辆表   保存信息到BusAa01 和 BusImg*/
    public void saveBusAa01() {
        Kv cond = getCond(getParaMap());
        BusAa01 busAa01 = getModel(BusAa01.class, "busAa01");
        busAa01.setAaa009(Constant.IMG_ADDRESS + cond.getStr("fileName"));
        if (ValidateKit.isNullOrEmpty(busAa01.getAaa001())) {
            busAa01.setAaa996(1);
            busAa01.setAaa997(getUserInfo().getUserName());
            busAa01.setAaa998(getNowTimeStamp());
//            busAa01.setAaa008((long) 2);   //公车
            busAa01Service.save(busAa01);
        } else {
            busAa01Service.update(busAa01);
        }
        redirect("/busOrder/busManage");
    }

    /*车型信息  未分页，返回所有*/
    public void getBusBa02All() {
//        List<BusBa02> list = busAa02Service.findAll();
        Kv cond = getCond(getParaMap());
        List<Record> records = busAa02Service.records(cond, "bus.getBusBa02All");
        renderJson(records);
    }

    /*车辆信息*/
    public void getBusOrderAa01List() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busAa01Service.paginate1(getParaToInt("page", 1), getParaToInt("limit", 30), cond)));
    }

    public void findImgByAaa001() {
        Kv cond = getCond(getParaMap());
        BusAa01 b = busAa01Service.findById(cond.getStr("aaa001"));
        renderJson(b.getAaa009());
    }


    /********************驾驶员管理**************************8*/
    public void busAaaDriver() {
        render("busAaaDriver.html");
    }

    /*驾驶员列表*/
    public void getBusAa02List() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busAa02Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }

//    public void getImage(){
//        String accessToken = getAccessToken();
//        String url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="+accessToken+"&openid="+"oPGrE5DFS2vSAggLIidVjoD82Hvk"+"&lang=zh_CN";
//        HttpUtil.get(url);
//    }
//
//
//    public static String getAccessToken() {
//        String appId="wx148d26cb07543413";
//        String appSecret="304a830a5b9584b940f3342f7dfff96d";
//        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
//                + appId + "&secret=" + appSecret;
////        LOGGER.info("request user info from url: {" + url + "}");
//        JsonObject accessTokenInfo = null;
//        try {
//            DefaultHttpClient httpClient = new DefaultHttpClient();
//            HttpGet httpGet = new HttpGet(url);
//            HttpResponse httpResponse = httpClient.execute(httpGet);
//            HttpEntity httpEntity = httpResponse.getEntity();
//            String response = EntityUtils.toString(httpEntity, "utf-8");
//            //LOGGER.error("获取Token-------------------"+response);
//            Gson token_gson = new Gson();
//
//            accessTokenInfo = token_gson.fromJson(response, JsonObject.class);
////            LOGGER.info("get accessTokenInfo success. [result={" + accessTokenInfo + "}]");
//            return accessTokenInfo.get("access_token").toString().replaceAll("\"", "");
//        } catch (Exception ex) {
////            LOGGER.error("fail to request wechat user info. [error={" + ex + "}]");
//            return "";
//        }
//    }

    /*车队主管管理*/
    /*订单管理*/
    /*系统设置
     *首页*/

    /*订单列表*/
    public void getBusCa03List() {
        Kv cond = getCond(getParaMap());
        renderJson(Format.layuiPage(
                busCa03Service.paginate1(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }

    /*用户列表*/
    public void getBusCa04List() {
        Kv cond = getCond(getParaMap());
        renderJson(Format.layuiPage(
                busCa04Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)
        ));
    }


    /*****************************车辆预约、订单管理模块*******************************/

    /* 查看所有车辆 并展示状态
     * 预约之前会进行一个筛选 在车辆展示界面进行筛选  筛选完毕进入预约  筛选条件有 核载人数 车型 价格 时间
     * */
    public void getAllBus() {
        Map<String, Object> result = new HashMap<>();
        Kv cond = getCond(getParaMap());
        //查询总条数
        List<Record> count = busAa01Service.records(cond, "bus.getAllBus");
        //查询公车信息
        Page page = busAa01Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), "bus.getAllBus");
        List<Record> records = page.getList();
        //添加公车预约状态
        cond.set("date", new Date());    //设置当前时间
        List<Record> recordBookeds = busAa01Service.records(cond, "bus.getBookedBus");  //查询已被预约的公车
        for (Record record : records) {
            record.set("appointmentStatus", "未预约"); //增加预约状态
            Integer aaa001A = record.getInt("aaa001"); //班车的id
            for (Record recordBooked : recordBookeds) {
                Integer aaa001B = recordBooked.getInt("aaa001");//班车的id
                if (aaa001A.equals(aaa001B)) {
                    record.set("appointmentStatus", "已预约"); //增加预约状态
                }
            }
        }
        result.put("count", count.size());
        result.put("data", records);
        renderJson(result);    //返回数据
    }

    /*返回所有车型*/
    public void findAllBusType(){
        Kv cond = getCond(getParaMap());
        List<Record> records = busBa02Service.records(cond, "bus.findAllBusType");
        renderJson(records);
    }

    /*点击车辆进入预约 预约车辆 */
    public void orderBus() throws ParseException {
        Map<String, Object> result = new HashMap<>();
        BusOrder busOrder = getModel(BusOrder.class, "busOrder");
        String openid = "oLao_5Wv2ob3SCQGn1o8I6DSvdCU"; //暂时默认为zhz的订单
        busOrder.setAca031(openid);
        BusCa04 busCa04 = busCa04Service.getBusCa04ByAca042(openid);
        busOrder.setAaa997(busCa04.getAca043());    //设置用户名字
        busOrder.setAba041(busCa04.getAca040());    //设置用户id
        busOrder.setAaa998(new Date());             //设置创建时间
        busOrder.setAca035(0);  //支付状态（0未支付，1已支付）
        busOrder.setOutTradeNo("");             /*商户订单号  这里需要支付后才会有订单号  暂未获取*/

        Double estimatedCost =  busOrder.getAza203().doubleValue() / 4;    /*预估费用  这里的费用计算     待定*/
        BigDecimal bigDecimal = new BigDecimal(estimatedCost);
        busOrder.setAza202(bigDecimal);

        busOrder.setAaa996(0);  //开车状态（0为等待发车，1为正在行驶，2为行程结束）
        busOrder.setAca036(0);  //乘坐状态（0为未乘坐，1为正在乘坐，2为乘坐结束）
        busOrder.setAza206(0);  //订单状态（0为待审核，1为审核通过，2为不通过）
        busOrderService.save(busOrder);
        result.put("msg", "添加成功！");
        result.put("flag", Boolean.TRUE);
        result.put("code", 2);
        redirect("/busOrder/busOrder");
        return;
    }

    /*取消车辆预约   取消时需判断是个人预约还是公车预约，涉及退款问题，需要进一步修改*/
    public void deleteBus() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busOrderService.delete(id);
        }
        renderJson();
    }

    /*展示预约车订单  暂时未做条件查询  待修改*/
    public void getBusOrderList() {
        Kv cond = getCond(getParaMap());
        renderJson(Format.layuiPage(
                busOrderService.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)
        ));
    }


}


