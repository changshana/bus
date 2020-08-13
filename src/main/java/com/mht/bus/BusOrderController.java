package com.mht.bus;

import cn.dreampie.ValidateKit;
import com.jfinal.config.Constant;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mht.bus.service.*;
import com.mht.common.CommonController;
import com.mht.common.model.BusAa01;
import com.mht.common.model.BusCa04;
import com.mht.common.model.BusOrder;
import com.mht.common.utils.Format;

import java.math.BigDecimal;
import java.text.ParseException;
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
        try {
            BusAa01 busAa01 = getModel(BusAa01.class, "busAa01");
            String aaa001 = getPara("aaa001", "");
            if (!aaa001.isEmpty()) {
                busAa01 = busAa01Service.findById(aaa001);
            }
            setAttr("ba02List", Db.find("select aba020 as id , aba002 as  name from bus_ba02 where aaa996=1"));
            setAttr("busAa01", busAa01);
            render("busAaaManageDetail.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*车辆表   保存信息到BusAa01 和 BusImg*/
    public void saveBusAa01() {
        try {
            Kv cond = getCond(getParaMap());
            BusAa01 busAa01 = getModel(BusAa01.class, "busAa01");
            busAa01.setAaa009(cond.getStr("fileName"));
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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*车型信息  未分页，返回所有*/
    public void getBusBa02All() {
        try {
            Kv cond = getCond(getParaMap());
            List<Record> records = busAa02Service.records(cond, "bus.getBusBa02All");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        List<BusBa02> list = busAa02Service.findAll();

    }

    /*车辆信息*/
    public void getBusOrderAa01List() {
        try {
            Map<String, String[]> paraMap = getParaMap();
            Kv cond = getCond(paraMap);
            Map<String, Object> map = Format.layuiPage(busAa01Service.paginate1(getParaToInt("page", 1),
                    getParaToInt("limit", 30), cond));
            List<BusAa01> data = (List<BusAa01>) map.get("data");
            for (BusAa01 busAa01 : data) {
                String aaa009 = busAa01.getAaa009();
                busAa01.setAaa009(Constant.IMG_ADDRESS+aaa009);
            }
            renderJson(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findImgByAaa001() {
        try {
            Kv cond = getCond(getParaMap());
            BusAa01 b = busAa01Service.findById(cond.getStr("aaa001"));
            renderJson(b.getAaa009());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /********************驾驶员管理**************************8*/
    public void busAaaDriver() {
        render("busAaaDriver.html");
    }

    /*驾驶员列表*/
    public void getBusAa02List() {
        try {
            Map<String, String[]> paraMap = getParaMap();
            Kv cond = getCond(paraMap);
            renderJson(Format.layuiPage(busAa02Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*车队主管管理*/
    /*订单管理*/
    /*首页*/

    /*订单列表*/
    public void getBusCa03List() {
        try {
            Kv cond = getCond(getParaMap());
            renderJson(Format.layuiPage(
                    busCa03Service.paginate1(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*用户列表*/
    public void getBusCa04List() {
        try {
            Kv cond = getCond(getParaMap());
            renderJson(Format.layuiPage(
                    busCa04Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*****************************车辆预约、订单管理模块*******************************/

    /* 查看所有车辆 并展示状态
     * 预约之前会进行一个筛选 在车辆展示界面进行筛选  筛选完毕进入预约  筛选条件有 核载人数 车型 价格 时间
     * */
    public void getAllBus() {
        Map<String, Object> result = new HashMap<>();
        try {
            Kv cond = getCond(getParaMap());
            //查询总条数
            List<Record> count = busAa01Service.records(cond, "bus.getAllBus");
            //查询公车信息
            Page page = busAa01Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond, "bus.getAllBus");
            List<Record> records = page.getList();
            //添加公车预约状态
            cond.set("date", new Date());    //设置当前时间
            List<Record> recordBookeds = busAa01Service.records(cond, "bus.getBookedBus");  //查询已被预约的公车
            for (Record record : records) {
                String aaa009 = record.getStr("aaa009");
                record.set("aaa009",Constant.IMG_ADDRESS+aaa009);
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        Kv cond = getCond(getParaMap());
        //查询总条数
        List<Record> count = busAa01Service.records(cond, "bus.getAllBus");
        //查询公车信息
        Page page = busAa01Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond, "bus.getAllBus");
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
    public void findAllBusType() {
        try {
            Kv cond = getCond(getParaMap());
            List<Record> records = busBa02Service.records(cond, "bus.findAllBusType");
            renderJson(records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*点击车辆进入预约 预约车辆 */
    public void orderBus() throws ParseException {
        Map<String, Object> result = new HashMap<>();
        try {
            BusOrder busOrder = getModel(BusOrder.class, "busOrder");
            String openid = "oLao_5Wv2ob3SCQGn1o8I6DSvdCU"; //暂时默认为zhz的订单
            busOrder.setAca031(openid);
            BusCa04 busCa04 = busCa04Service.getBusCa04ByAca042(openid);
            busOrder.setAaa997(busCa04.getAca043());    //设置用户名字
            busOrder.setAba041(busCa04.getAca040());    //设置用户id
            busOrder.setAaa998(new Date());             //设置创建时间
            busOrder.setAca035(0);  //支付状态（0未支付，1已支付）
            busOrder.setOutTradeNo("");             /*商户订单号  这里需要支付后才会有订单号  暂未获取*/

            Double estimatedCost = busOrder.getAza203().doubleValue() / 4;    /*预估费用  这里的费用计算     待定*/
            BigDecimal bigDecimal = new BigDecimal(estimatedCost);
            busOrder.setAza202(bigDecimal);

            busOrder.setAaa996(0);  //开车状态（0为等待发车，1为正在行驶，2为行程结束）
            busOrder.setAca036(0);  //乘坐状态（0为未乘坐，1为正在乘坐，2为乘坐结束）
            busOrder.setAza206(0);  //订单状态（0为待审核，1为审核通过，2为不通过）
            busOrderService.save(busOrder);
            result.put("msg", "预约成功！");
            result.put("flag", Boolean.TRUE);
        } catch (Exception e) {
            result.put("msg", "预约失败！");
            result.put("flag", Boolean.TRUE);
            e.printStackTrace();
        }
//        redirect("/busOrder/busOrder");
        renderJson(result);
    }


    public void deleteBus() {
        Map<String, Object> result = new HashMap<>();
        try {
            String ids = getPara("ids");
            String[] arr = ids.split(",");
            for (String id : arr) {
                busOrderService.delete(id);
            }
            result.put("msg", "删除成功！");
            result.put("flag", Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", "删除失败！");
            result.put("flag", Boolean.FALSE);
        }
        renderJson();
    }

    /*展示预约车订单  暂时未做条件查询  待修改*/
    public void getBusOrderList() {
        try {
            Kv cond = getCond(getParaMap());
            renderJson(Format.layuiPage(
                    busOrderService.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*跳往网页端下单*/
    public void addOrder() {
        render("addOrder.html");
    }

    /**
     * 选择车辆
     */
    public void toBusChoose() {
        setAttr("ba02List", Db.find("select aba020 as id , aba002 as  name from bus_ba02 where aaa996=1"));
        render("chooseBus.html");
    }

    public void toDriverChoose() {
        render("chooseDriver.html");
    }

}


