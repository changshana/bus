package com.mht.bus;

import cn.dreampie.ValidateKit;
import com.alibaba.fastjson.JSON;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;
import com.jfinal.render.JsonRender;
import com.jfinal.upload.UploadFile;
import com.mht.bus.exception.BusException;
import com.mht.bus.service.*;
import com.mht.bus.util.BusStaticUtil;
import com.mht.bus.util.ConsoleTimeElement;
import com.mht.common.CommonController;
import com.mht.common.model.*;
import com.mht.common.utils.Format;
import com.mht.wxPay.MyConfig;
import com.mht.wxPay.WXPay;
import com.mht.wxPay.WXPayConstants;
import com.mht.wxPay.WXPayUtil;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.mht.bus.BusAPIController.*;


public class BusController extends CommonController {
    public static final BusBa03Service busBa03Service = BusBa03Service.me;
    public static final BusAa02Service busAa02Service = BusAa02Service.me;
    public static final BusBa02Service busBa02Service = BusBa02Service.me;
    public static final BusAa01Service busAa01Service = BusAa01Service.me;
    public static final BusCa02Service busCa02Service = BusCa02Service.me;
    public static final BusBa05Service busBa05Service = BusBa05Service.me;
    public static final BusBa01Service busBa01Service = BusBa01Service.me;
    public static final BusAa99Service busAa99Service = BusAa99Service.me;
    public static final BusBa07Service busBa07Service = BusBa07Service.me;
    public static final BusCommonService busCommonService=BusCommonService.me;

    /**
     * 获取码表中的码值列表
     */
    public void getCode() {
        Kv cond = getCond(getParaMap());
        List code = records(cond, "bus.getBusCodeList");
        renderJson(code);
    }

    public void busBa07() {
        render("busBa07.html");
    }

    public void deleteBusBa07() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busBa07Service.delete(id);
        }
        renderJson();
    }

    public void getBusBa07List() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = CommonController.getCond(paraMap);
        SqlPara sqlPara = Db.getSqlPara("bus.getBusBa07List", cond);
        renderJson(Format.layuiPage(Db.paginate(getParaToInt("page"), getParaToInt("limit"), sqlPara)));
    }

    public void siteLocation() {
        render("siteLocation.html");
    }

    public void saveBusBa07() {
        BusBa07 busBa07 = new BusBa07();
        busBa07.setAba071(getPara("name"));
        busBa07.setAba072(getPara("location"));
        busBa07.setAaa996(1);
        busBa07.setAaa997(getUserInfo().getUserName());
        busBa07.setAaa998(getNowDate());
        busBa07Service.save(busBa07);
        redirect("/bus/siteLocation");
    }


    public void findApproach() {
        String aba030 = getPara("aba030");
        renderJson("approach", busBa01Service.dao.find("select a.*,aba072 from bus_ba01 a  left join bus_ba07 b on a.aba070=b.aba070 where a.aaa996=1 and  aba030=?",aba030));
    }


    public void busMap() {
        String aba050 = getPara("aba050");
        Record busBa05 = Db.findFirst("select *,left(b.aba051,5) as startTime,left(b.aba052,5) as endTime  from bus_ba05 b where b.aba050=" + aba050);
        setAttr("bus_ba05", busBa05);
        setAttr("bus_ba03", Db.findFirst("select *,(select aba071 from bus_ba07 d where b.aba007=d.aba070) as `start`,\n" +
                "(select aba071 from bus_ba07 d where b.aba008=d.aba070) as `end`," +
                "(select aba072 from bus_ba07 d where b.aba007=d.aba070) as `startLongitude`," +
                "(select aba072 from bus_ba07 d where b.aba008=d.aba070) as `endLongitude`" +
                "from bus_ba03 b where aba030=?",busBa05.get("aba030")));
        setAttr("bus_ba01", busBa01Service.dao.find("select * from bus_ba01 where aaa996=1 and  aba030=?" , busBa05.get("aba030")));
        render("busMap.html");
    }

    public void busMapPreview() {
        String aba030 = getPara("aba030");
        setAttr("bus_ba03", Db.findFirst("select *,(select aba071 from bus_ba07 d where b.aba007=d.aba070) as `start`,\n" +
                "(select aba071 from bus_ba07 d where b.aba008=d.aba070) as `end`," +
                "(select aba072 from bus_ba07 d where b.aba007=d.aba070) as `startLongitude`," +
                "(select aba072 from bus_ba07 d where b.aba008=d.aba070) as `endLongitude`" +
                "from bus_ba03 b where aba030=?", aba030));
        setAttr("bus_ba01", busBa01Service.dao.find("select * from bus_ba01 where aaa996=1 and  aba030=?" , aba030));
        render("busMapPreview.html");
    }

    public void busBa05() {
        String aba030=getPara("aba030");
        setAttr("aba030",aba030);
        if(!ValidateKit.isNullOrEmpty(aba030)){
            setAttr("aba020",busBa03Service.findById(aba030).getAba020());
        }
        setAttr("busBa02", Db.find("select * from bus_aa99 where aaa002='aba060' and aaa996=1"));
        setAttr("dateType", Db.find("select * from bus_aa99 where 1=1 and aaa002='aba055' and aaa003='发车时间' and aaa996=1"));
        render("busBa05.html");
    }

    public void getBusBa05List() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = CommonController.getCond(paraMap);
        if (!ValidateKit.isNullOrEmpty(getPara("date"))) {
            String begin = getPara("date").substring(0, 10);
            String end = getPara("date").substring(13, getPara("date").length());
            cond.set("begin", "'" + begin + "'").set("end", "'" + end + "'");
        }
        SqlPara sqlPara = Db.getSqlPara("bus.getBusBa05List", cond);
        renderJson(Format.layuiPage(Db.paginate(getParaToInt("page"), getParaToInt("limit"), sqlPara)));
    }

    public void addOrUpdateBusBa05() {
        String aba050 = getPara("aba050", "");
        String aba020 = getPara("aba020", "");
        String aba030 = getPara("aba030", "");
        BusBa05 busBa05 = getModel(BusBa05.class, "busBa05");
        if (!aba050.isEmpty()) {
            busBa05 = busBa05Service.findById(aba050);
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            String timeStart = format.format(busBa05.getAba051());
            String timeEnd = format.format(busBa05.getAba052());
            setAttr("timeStart", timeStart);
            setAttr("timeEnd", timeEnd);
        }
        setAttr("getBusBa02List", commonService.records("bus.getBusBa02List"));
        setAttr("busBa05", busBa05);
        setAttr("aba020", aba020);
        setAttr("aba030", aba030);
        setAttr("busBa03", Db.find("select a.*,(select aba071 from bus_ba07 d where a.aba007=d.aba070) as `start`,(select aba071 from bus_ba07 d where a.aba008=d.aba070) as `end`  from bus_ba03 a "));
        setAttr("dateType", Db.find("select * from bus_aa99 where 1=1 and aaa002='aba055' and aaa003='发车时间' and aaa996=1"));
        render("busBa05Detail.html");
    }

    public void getBa03ForAddBa05() {
        Kv cond = getCond(getParaMap());
        renderJson(commonService.records(cond, "bus.getBa03ForAddBa05"));
    }

    public void saveBusBa05() {
        BusBa05 busBa05 = getModel(BusBa05.class, "busBa05");
        if (busBa05.getAba050() == null) {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            busBa05.setAaa997(getUserInfo().getUserName());
            busBa05.setAaa998(getNowDate());
            if (ValidateKit.isNullOrEmpty(busBa05.getAaa996())) {
                busBa05.setAaa996(0);
            }
            if (ValidateKit.isNullOrEmpty(busBa05.getAba056())) {
                busBa05.setAba056(0);
            }
            busBa05Service.save(busBa05);
        } else {
            if (ValidateKit.isNullOrEmpty(busBa05.getAaa996())) {
                busBa05.setAaa996(0);
            }
            if (ValidateKit.isNullOrEmpty(busBa05.getAba056())) {
                busBa05.setAba056(0);
            }
            busBa05Service.update(busBa05);
        }
        redirect("/bus/busBa05?aba030="+busBa05.getAba030());
    }

    public void changeAaa056() {
        BusBa05 busBa05 = BusBa05Service.dao.findById(getPara("id"));
        busBa05.setAba056(getParaToInt("status"));
        busBa05.update();
    }

    public void deleteBusBa05() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busBa05Service.delete(id);
        }
        renderJson();
    }


    public void busBa03() {
        String aba020=getPara("aba020");
        setAttr("aba020",aba020);
        List<Record> busBa02List = Db.find("select * from bus_ba02 where aaa996=1");
        setAttr("aba060List", Db.find("select * from bus_aa99 where aaa002='aba060' and aaa996=1"));
        render("busBa03.html");
    }

    public void getBusBa03List() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = CommonController.getCond(paraMap);
        SqlPara sqlPara = Db.getSqlPara("bus.getBusBa03List", cond);
        renderJson(Format.layuiPage(Db.paginate(getParaToInt("page"), getParaToInt("limit"), sqlPara)));
    }

    public void addOrUpdateBusBa03() {
        String aba030 = getPara("aba030", "");
        BusBa03 busBa03 = getModel(BusBa03.class, "busBa03");
        if (!aba030.isEmpty()) {
            busBa03 = busBa03Service.findById(aba030);
        }
        setAttr("busBa02", Db.find("select * from bus_aa99 where aaa002='aba060' and aaa003='车辆类型' and aaa996=1"));
        setAttr("busBa03", busBa03);
        setAttr("busBa07", Db.find("select * from bus_ba07 where aaa996=1"));
        render("busBa03Detail.html");
    }

    public void saveBusBa03() {
        BusBa03 busBa03 = getModel(BusBa03.class, "busBa03");
        if (busBa03.getAba030() == null) {
            busBa03.setAaa997(getUserInfo().getUserName());
            busBa03.setAaa998(getNowDate());
            if (ValidateKit.isNullOrEmpty(busBa03.getAaa996())) {
                busBa03.setAaa996(0);
            }
            busBa03Service.save(busBa03);
        } else {
            if (ValidateKit.isNullOrEmpty(busBa03.getAaa996())) {
                busBa03.setAaa996(0);
            }
            busBa03Service.update(busBa03);
        }
        redirect("/bus/busBa03");
    }

    public void deleteBusBa03() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busBa03Service.delete(id);
        }
        renderJson();
    }

    public void busBa01() {
        setAttr("aba030", getPara("aba030"));
        render("busBa01.html");
    }

    public void getBusBa01List() {
        renderJson(Format.layuiPage(busBa01Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), getParaToInt("aba030"))));
    }

    public void addOrUpdateBusBa01() {
        String aba001 = getPara("aba001", "");
        BusBa01 busBa01 = getModel(BusBa01.class, "busBa01");
        if (!aba001.isEmpty()) {
            busBa01 = busBa01Service.findById(aba001);
        }
        setAttr("aba030", getPara("aba030"));
        setAttr("busBa01", busBa01);
        setAttr("busBa07", Db.find("select * from bus_ba07 where aaa996=1"));
        render("busBa01Detail.html");
    }

    public void saveBusBa01() {
        BusBa01 busBa01 = getModel(BusBa01.class, "busBa01");
        if (busBa01.getAba001() == null) {
            busBa01.setAaa997(getUserInfo().getUserName());
            busBa01.setAaa998(getNowDate());
            if (ValidateKit.isNullOrEmpty(busBa01.getAaa996())) {
                busBa01.setAaa996(0);
            }
            busBa01Service.save(busBa01);
        } else {
            if (ValidateKit.isNullOrEmpty(busBa01.getAaa996())) {
                busBa01.setAaa996(0);
            }
            busBa01Service.update(busBa01);
        }
        redirect("/bus/busBa01?aba030=" + busBa01.getAba030());
    }

    public void deleteBusBa01() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busBa01Service.delete(id);
        }
        renderJson();
    }


    /**
     * 人员信息开始
     */
    public void busAa02() {
        render("busAa02.html");
    }

    public void getBusAa02List() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busAa02Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }

    public void addOrUpdateBusAa02() {
        String aaa020 = getPara("aaa020", "");
        BusAa02 busAa02 = getModel(BusAa02.class, "busAa02");
        if (!aaa020.isEmpty()) {
            busAa02 = busAa02Service.findById(aaa020);
        }
        setAttr("busAa02", busAa02);
        render("busAa02Detail.html");
    }

    public void saveBusAa02() {
        BusAa02 busAa02 = getModel(BusAa02.class, "busAa02");
        if (busAa02.getAaa020() == null) {
            busAa02.setAaa996(1);
            busAa02.setAaa997(getUserInfo().getUserName());
            busAa02.setAaa998(getNowTimeStamp());
            busAa02Service.save(busAa02);
        } else {
            busAa02Service.update(busAa02);
        }
        redirect("/bus/busAa02");
    }

    public void deleteBusAa02() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busAa02Service.delete(id);
        }
        renderJson();
    }
    /**人员信息结束*/
    /**
     * 车辆类型开始
     */
    public void busBa02() {
        render("busBa02.html");
    }

    public void getBusAa99List() {
        renderJson(Format.layuiPage(busAa99Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10))));
    }

    public void busSettingList() {
        setAttr("aaa004", getPara("aaa004"));
        render("busSettingList.html");
    }

    public void getBusBa02List() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busBa02Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }

    public void addOrUpdateBusBa02() {
        String aba020 = getPara("aba020", "");
        String aaa004 = getPara("aaa004", "");
        BusBa02 busBa02 = getModel(BusBa02.class, "busBa02");
        if (!aba020.isEmpty()) {
            busBa02 = busBa02Service.findById(aba020);
            aaa004 = busBa02.getAaa995().toString();
        }
        setAttr("busBa02", busBa02);
        setAttr("aaa004", aaa004);
        render("busBa02Detail.html");
    }

    public void saveBusBa02() {
        BusBa02 busBa02 = getModel(BusBa02.class, "busBa02");
        if (busBa02.getAba020() == null) {
            busBa02.setAaa996(1);
            busBa02.setAaa997(getUserInfo().getUserName());
            busBa02.setAaa998(getNowTimeStamp());
            busBa02Service.save(busBa02);
        } else {
            busBa02Service.update(busBa02);
        }
        redirect("/bus/busBa02");
    }

    public void deleteBusBa02() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busBa02Service.updateStatus(id);
        }
        renderJson();
    }
    /**车辆类型结束*/
    /**
     * 车辆信息管理开始
     */
    public void busAa01() {
        render("busAa01.html");
    }

    public void getBusAa01List() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busAa01Service.paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }

    public void addOrUpdateBusAa01() {
        String aaa001 = getPara("aaa001", "");
        BusAa01 busAa01 = getModel(BusAa01.class, "busAa01");
        if (!aaa001.isEmpty()) {
            busAa01 = busAa01Service.findById(aaa001);
        }
        setAttr("ba02List",Db.find("select aba020 as id , aba002 as  name from bus_ba02 where aaa996=1"));
        setAttr("busAa01", busAa01);
        render("busAa01Detail.html");
    }

    public void saveBusAa01() {
        BusAa01 busAa01 = getModel(BusAa01.class, "busAa01");
        if (ValidateKit.isNullOrEmpty(busAa01.getAaa001())) {
            busAa01.setAaa996(1);
            busAa01.setAaa997(getUserInfo().getUserName());
            busAa01.setAaa998(getNowTimeStamp());
            busAa01Service.save(busAa01);
        } else {
            busAa01Service.update(busAa01);
        }
        redirect("/bus/busAa01");
    }

    public void deleteBusAa01() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busAa01Service.delete(id);
        }
        renderJson();
    }

    public void busInfoPerson() {
        setAttr("aaa020", getPara("aaa020"));
        render("busInfoPerson.html");
    }

    public void getBusInfoPersonExistence() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busAa02Service.busInfoPersonExistencePaginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }

    public void getBusInfoPerson() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busAa02Service.busInfoPersonPaginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }

    /**
     * 绑定车辆信息到驾驶员
     */
    public void changeBusInfoPerson() {
        String aaa020Str = getPara("aaa020");
        String flag = getPara("flag");
        String bus_ids = getPara("bus_ids");
        Map res=new HashMap();
        if (!ValidateKit.isNullOrEmpty(aaa020Str) && !ValidateKit.isNullOrEmpty(bus_ids)) {
            int aaa020=Integer.parseInt(aaa020Str);
            String busIdArr[] = bus_ids.split(",");
            if ("add".equals(flag)) {
                //查询是否已有绑定信息
                Kv cond=new Kv();
                cond.put("aaa020",Integer.parseInt(aaa020Str));
                List<Record> ca02List=records(cond,"bus.checkCa02BindInfo");
                if(ca02List.size()>0){
                    res.put("flag",Boolean.FALSE);
                    res.put("msg","该驾驶员存在已绑定的班车信息！");
                }else{
                    for (String aaa001 : busIdArr) {
                        BusCa02 bsCa02 = new BusCa02();
                        bsCa02.setAaa020(aaa020);
                        bsCa02.setAaa001(Integer.parseInt(aaa001));
                        bsCa02.save();
                        res.put("flag",Boolean.TRUE);
                        res.put("msg","绑定成功！");
                    }
                }
            } else if ("del".equals(flag)) {
                for (String aaa001 : busIdArr) {
                    busCa02Service.delBusAndPerson( aaa020,aaa001);
                }
                res.put("flag",Boolean.TRUE);
                res.put("msg","解绑成功！");
            }
        }
        renderJson(res);
    }

    /*public void getBusInfoTimeExistence() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busAa02Service.busInfoTimeExistencePaginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }

    public void getBusInfoTime() {
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = getCond(paraMap);
        renderJson(Format.layuiPage(busAa02Service.busInfoTimePaginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond)));
    }*/

    /**车辆信息管理结束*/

    /**************liuxlh start*****************/

    /**************在线选座设置 start*****************/
    public static final BusBa04Service busBa04Service = BusBa04Service.me;

    public void busBa04() {
        render("busBa04.html");
    }

    public void getBusBa04List() {
        Kv cond = getCond(getParaMap());
        cond.set("aaa995", "2");//学生班车才能预约
        renderJson(Format.layuiPage(paginate(getParaToInt("page", 1), getParaToInt("limit", 10), cond, "bus.getBusBa04List")));
    }

    public void addOrUpdateBusBa04() {
        Kv cond = getCond(getParaMap());
//        setAttr("busAa01",busAa01Service.findById(cond.getStr("aaa001")));
        setAttr("busBa02", busBa02Service.findById(cond.getStr("aba020")));
        setAttr("ba02s", records(cond, "bus.getBusBa02List"));
        setAttr("type", cond.getStr("type"));
        render("busBa04Detail.html");
    }

    public void busSeatList() {
        renderJson(records(getCond(getParaMap()), "bus.findBusSeatsByAaa001"));
    }

    public void clearBusBa04() {
        boolean flag = true;
        try {
            Kv cond = getCond(getParaMap());
            Db.update(Db.getSqlPara("bus.deleteBusSeatPlan", cond));
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        renderJson(flag);
    }

    public void saveBusBa04() {
        boolean flag = true;
        try {
            Kv cond = getCond(getParaMap());
            cond.set("aaa996", 1);
            cond.set("aaa997", getUserInfo().getUserName());
            cond.set("aaa998", getNowDate());
            busBa04Service.saveBusSeatPlan(cond);
        } catch (Exception e) {
            e.printStackTrace();
        }
        renderJson(flag);
    }

    public void deleteBusBa04() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busBa04Service.delete(id);
        }
        renderJson();

    }
    /**************在线选座设置 end*****************/

    /**************liuxlh end*****************/


    /**************zhangy start*****************/
    /**************选座时间设置 start*****************/
    private static final BusBa06Service busBa06Service = BusBa06Service.me;

    public void busBa06() {
        /*System.out.println("*************");
        System.out.println(busBa06Service.checkTime(1, 1));
        System.out.println("*************");*/
        render("busBa06.html");
    }

    public void getBusBa06List() {
        Map<String, String[]> paraMap = getParaMap();
        renderJson(Format.layuiPage(paginate(getParaToInt("page", 1), getParaToInt("limit", 10), getCond(paraMap), "bus.getBusBa06List")));
    }

    public void addOrUpdateBusBa06() {
        String aba060 = getPara("aba060", "");
        BusBa06 busBa06 = getModel(BusBa06.class, "busBa06");
        if (!aba060.isEmpty()) {
            busBa06 = busBa06Service.findById(aba060);
        }
        setAttr("busBa06", busBa06);
        render("busBa06Detail.html");
    }

    public void saveBusBa06() {
        BusBa06 busBa06 = getModel(BusBa06.class, "busBa06");
        if (busBa06.getAba060() == null) {
            busBa06.setAba997(getUserInfo().getUserName());
            busBa06.setAba998(getNowDate());
            busBa06Service.save(busBa06);
        } else {
            busBa06Service.update(busBa06);
        }
        redirect("/bus/busBa06");
    }

    public void deleteBusBa06() {
        String ids = getPara("ids");
        String[] arr = ids.split(",");
        for (String id : arr) {
            busBa06Service.delete(id);
        }
        renderJson();
    }

    public void changeStatus() {
        busBa06Service.changeStatus(getParaToInt("status"), getParaToInt("id"));
        renderJson();
    }

    public void busBa0605() {
        setAttr("aba060", getPara("aba060"));
        render("busBa0605.html");
    }

    public void getBusTimeExist() {
        Map<String, String[]> paraMap = getParaMap();
        renderJson(Format.layuiPage(paginate(getParaToInt("page", 1), getParaToInt("limit", 10), getCond(paraMap), "bus.getBusTimeExist")));
    }

    public void getBusTimeNotExist() {
        Map<String, String[]> paraMap = getParaMap();
        renderJson(Format.layuiPage(paginate(getParaToInt("page", 1), getParaToInt("limit", 10), getCond(paraMap), "bus.getBusTimeNotExist")));
    }

    public void changeBusTime() {
        Integer aba060 = getParaToInt("aba060");
        String opt = getPara("opt");
        String ids = getPara("ids");
        if (!ValidateKit.isNullOrEmpty(aba060) && !ValidateKit.isNullOrEmpty(ids)) {
            String id[] = ids.split(",");
            if ("add".equals(opt)) {
                for (String aba050 : id) {
                    BusBa05 busBa05 = busBa05Service.findById(aba050);
                    busBa05.setAba060(aba060);
                    busBa05.update();
                }
            } else if ("delete".equals(opt)) {
                for (String aba050 : id) {
                    BusBa05 busBa05 = busBa05Service.findById(aba050);
                    busBa05.setAba060(null);
                    busBa05.update();
                }
            }
        }
        renderJson();
    }
    /*************选座时间设置   end*****************/
    /**************zhangy end*****************/

    /*************车次选择/浏览************************/
    /*
     *
     * */
    //车次选择列表页
    public void busMassage() {
        setAttr("getBusAa99List", commonService.records("bus.getBusAa99List"));
        render("busMassageList.html");
    }

    //获取校车类型信息
    public void getbusType() {
        renderJson(commonService.records("bus.getBusAa99List"));
    }

    //获取车辆类型对应的路线
    public void getBusBa03ByType() {
        String aaa004 = getPara("aaa004");
        Kv cond = new Kv();
        cond.set("aba020", aaa004);
        renderJson(commonService.records(cond, "bus.getBusBa03List"));
    }

    //具体发车时间选择列表页
    public void busStartTimeMassage() {
        String type_id = getPara("type_id", "");
        String aba030Id = getPara("aba030Id", "");
        Kv cond = new Kv();
        Kv cond1 = new Kv();
        cond.set("aba030Id", aba030Id);
        cond.set("type_id", type_id);
        cond.set("type", 1);//周一到周五
        cond1.set("aba030Id", aba030Id);
        cond1.set("type_id", type_id);
        cond1.set("type", 2);//周六周日
        String time = getPara("time", "");
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        if (!ValidateKit.isNullOrEmpty(time)) {
            try {
                calendar.setTime(sdf.parse(time));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        time = sdf.format(calendar.getTime());
        setAttr("time", time);
        String[] weekArr = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        String week = weekArr[calendar.get(Calendar.DAY_OF_WEEK) - 1];
        setAttr("week", week);
        List list1 = commonService.records(cond1, "bus.getBusBa05List");
        if (!ValidateKit.isNullOrEmpty(list1)) {
            setAttr("getBusBaSunday", list1);
        } else {
            setAttr("getBusBaSunday", null);
        }
        List list = commonService.records(cond, "bus.getBusBa05List");
        if (!ValidateKit.isNullOrEmpty(list)) {
            setAttr("getBusBaFrist", list);
        } else {
            setAttr("getBusBaFrist", null);
        }
        render("busStartTimeMassage.html");
    }


    /**************engine start*****************/

    public void toBusDetail() {
        String aca050=getPara("aca050");
        String openid=getPara("openid");
        try{
            if(ValidateKit.isNullOrEmpty(aca050) || ValidateKit.isNullOrEmpty(openid)){

            }else{
                //获取登录人信息
                BusCa04 ca04=busCa04Service.getBusCa04ByAca042(openid);
                if(ValidateKit.isNullOrEmpty(ca04)){
                    setAttr("ca04",new BusCa04());
                }else{
                    setAttr("ca04",ca04);
                }
                //车辆信息
                Kv cond=getCond(getParaMap());
                Record busInfo=record(cond,"bus.getBusInfoByAca050");
                String[] weekArr = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(busInfo.getDate("aca051"));
                String week = weekArr[calendar.get(Calendar.DAY_OF_WEEK) - 1];
                setAttr("week",week);
                setAttr("busInfo",busInfo);
                if(ValidateKit.isNullOrEmpty(ca04)){
                    setAttr("price",0);
                }else{
                    setAttr("price",BusStaticUtil.getPrice(ca04));
                }
                setAttr("max_count",BusStaticUtil.MAX_CHOOSE_NUM);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        render("busDetail.html");
    }

    public static final BusCa03Service busCa03Service = BusCa03Service.me;
    //选择座位
    public void chooseSeat() {
        Map res = new HashMap();
        String aca040 = getPara("aca040");//绑定人员信息ID
        String aca050 = getPara("aca050");//校车班次ID
        String aba032 = getPara("aba032");//选座日期
        String aba041 = getPara("aba041");//座位号,多个用","隔开
        int type = getParaToInt("type",0);//0 后台 3教职工 其他：学生
        try {
            //1.参数检查
            if((type!=0 && ValidateKit.isNullOrEmpty(aca040)) ||
                    ValidateKit.isNullOrEmpty(aca050) ||
                    ValidateKit.isNullOrEmpty(aba032) ||
                    ValidateKit.isNullOrEmpty(aba041) || aba041.split(",").length==0
            ) {
                res.put("flag", Boolean.FALSE);
                res.put("msg", "参数错误，请求非法！");
                renderJson(res);
                return;
            }else{
                //2.检查该班次是否存在
                BusCa05 ca05=ca05Service.findById(aca050);
                if(ValidateKit.isNullOrEmpty(ca05) || ca05.getAaa996()==BusStaticUtil.INVALID){
                    //班次失效
                    res.put("flag", Boolean.FALSE);
                    res.put("msg", "该班次不存在或已取消发车！");
                    renderJson(res);
                    return;
                }
            }
            //3.超时判断
            if(isExpire(aca050,0)){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "已超过规定的可选座时间！");
                renderJson(res);
                return;
            }else{
                SimpleDateFormat sdf_yyyyMMdd=new SimpleDateFormat("yyyy-MM-dd");
                if(type!=0){//非管理端锁定座位
                    //4.1查询人员绑定信息
                    BusCa04 ca04=busCa04Service.findById(aca040);
                    if(ValidateKit.isNullOrEmpty(ca04)){
                        //未查询到该人员信息
                        res.put("flag", Boolean.FALSE);
                        res.put("msg", "未查询到您的绑定信息或绑定信息已失效，无法选座！");
                        renderJson(res);
                        return;
                    }
                    //4.2判断该人员是否被锁定
                    if(BusStaticUtil.MAX_INVALID_COUNT>0 && ca04.getAca049()>=BusStaticUtil.MAX_INVALID_COUNT){
                        res.put("flag", Boolean.FALSE);
                        res.put("msg", "该人员爽约次数已达到"+BusStaticUtil.MAX_INVALID_COUNT+"次，账号已经被锁定，请联系管理员解锁账号！");
                        renderJson(res);
                        return;
                    }
                    //5.判断当前预约（非管理端锁定座位）是否符合规则
                    String aca031=ca04.getAca041();//顾客绑定账号
                    //5.1检查当前预约车次是否符合“前车预约满再预约后车”
                    String busId=String.valueOf(BusStaticUtil.checkBusSeatAvailable(Integer.parseInt(aca050),aba041.split(",").length));
                    if(!busId.equals(aca050)){
                        //不符合规则，自动跳转
                        res.put("flag", Boolean.FALSE);
                        res.put("msg", "按照预约规则，在同一路线同一时刻下的班车，尽量选择排列靠前的班车！<span style='color:red;'>5秒后将自动跳往系统选择的班车（同一路线同一时刻的其他班车）。</span>");
                        res.put("redirect_url","bus/toBusDetail?aca050="+busId+"&openid="+ca04.getAca042());
                        renderJson(res);
                        return;
                    }
                    //5.2检查当前预约是否符合“同一路线的同一时刻只能预约一个班次”
                    if(BusStaticUtil.existSeatInfo(Integer.parseInt(aca050),aca031,type)){
                        //同一路线的同一时刻已经预约有其他的车辆的座位了
                        res.put("flag", Boolean.FALSE);
                        res.put("msg", "当前路线的当前发车时刻已经预订有其他的车辆的座位了！<span style='color:red;'>无法再次预订座位！</span>");
                        renderJson(res);
                        return;
                    }
                    //6.处理预约请求-个人选座
                    res=ca03Service.chooseSeat(aca050,sdf_yyyyMMdd.parse(aba032),type,aba041,BusStaticUtil.getPrice(ca04),getUserInfo(),ca04);
                }else{
                    //6.处理预约请求-后台锁定座位
                    res=ca03Service.chooseSeat(aca050,sdf_yyyyMMdd.parse(aba032),type,aba041,0,getUserInfo(),null);
                }
            }
        }catch (BusException e){
            e.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg",e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            res.put("flag", Boolean.FALSE);
            res.put("msg", "服务器繁忙，请稍候再试！");
        }
        renderJson(res);
    }


    /**
     * 评价
     */
    public void evaluate(){
        String aca030=getPara("aca030");
        int aca032=getParaToInt("aca032");
        int aca033=getParaToInt("aca033");
        String aca034=getPara("aca034");
        Map res=new HashMap();
        if(!ValidateKit.isNullOrEmpty(aca030)){
            try{
                busCa03Service.evaluate(aca030,aca032,aca033,aca034);
                res.put("flag",Boolean.TRUE);
                res.put("msg","已评价，感谢您的支持！");
            }catch (Exception e){
                e.printStackTrace();
                res.put("flag",Boolean.FALSE);
                res.put("msg","系统繁忙，稍后再试");
            }
        }else{
            res.put("flag",Boolean.FALSE);
            res.put("msg","参数错误，非法请求！");
        }
        renderJson(res);
    }

    public void cancelChooseSeat() {
        Map res = new HashMap();
        String ticketId=getPara("ticketid");
        BusCa03 ca03=new BusCa03();
        if(!ValidateKit.isNullOrEmpty(ticketId)){//查询信息
            ca03=busCa03Service.findById(ticketId);
            if(ValidateKit.isNullOrEmpty(ca03)){
                res.put("flag", Boolean.FALSE);
                res.put("msg", "车票信息不存在！");
                renderJson(res);
                return;
            }
        }
        String aba041Str = getPara("aba041",String.valueOf(ca03.getAba041()));//座位号
        String aca050 = getPara("aca050",String.valueOf(ca03.getAca050()));//列车时刻ID
        String aca031 = getPara("aca031",ca03.getAca031());//选座位学生
        if(isExpire(aca050,5)){
            res.put("flag", Boolean.FALSE);
            res.put("msg", "已超过规定的可退票时间！");
        }else{
            if (!(ValidateKit.isNullOrEmpty(aba041Str) || ValidateKit.isNullOrEmpty(aca050))) {
                String msg = busCa03Service.cancelChooseSeat(aba041Str, aca050,aca031);
                res.put("flag", Boolean.TRUE);
                res.put("msg", msg);
            } else {
                res.put("flag", Boolean.FALSE);
                res.put("msg", "服务器繁忙，稍后再试！");
            }
        }
        renderJson(res);
    }
    /**
     * 判断当前时间是否超过了规定的时间
     * @param aca050 车次编号
     * @param min 分钟数
     * @return false 未超时 true 已超时
     */
    public boolean isExpire(String aca050,int min){
        boolean flag=Boolean.TRUE;
        Kv cond=new Kv();
        if(ValidateKit.isNullOrEmpty(aca050)){
            flag=Boolean.TRUE;
        }else{
            cond.put("aca050",Integer.parseInt(aca050));
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date=Calendar.getInstance().getTime();
            String dateTimeStr=sdf.format(date);
            cond.put("dateTimeStr",dateTimeStr);
            Record record=record(cond,"bus.getMinutesDiff");
            if(ValidateKit.isNullOrEmpty(record)){
                flag=Boolean.TRUE;
            }else{
                if(record.getInt("diff")>=min){
                    flag=Boolean.FALSE;
                }else{
                    flag=Boolean.TRUE;
                }
            }
        }
        return flag;
    }

    /**
     * 获取座位信息
     */
    public void getSeatInfo() {
        String aba020 = getPara("id");
        String time = getPara("time");
        String aca050 = getPara("aca050");
        List ba04List = new ArrayList();
        if (!ValidateKit.isNullOrEmpty(aba020)) {
            Kv cond = new Kv();
            cond.put("aba020", aba020);
            cond.put("time", time);
            cond.put("aca050", aca050);
            ba04List = records(cond, "bus.getSeatInfoByAba020");
        }
        renderJson(ba04List);
    }
    /**
     * 取消发车
     */
    public void cancelBus(){
        Map res=new HashMap();
        Kv cond=new Kv();
        cond.put("aca050",Integer.parseInt(getPara("aca050","0")));
        if(!ValidateKit.isNullOrEmpty(getUserInfo())){
            cond.put("aaa997",getUserInfo().getUserName());
        }else{
            cond.put("aaa997","手机端取消发车");
        }
        cond.put("aaa998",getNowTimeStamp());
        try{
            busCa03Service.cancelBus(cond);
            res.put("flag",Boolean.TRUE);
            res.put("msg","取消发车成功！");
        }catch (Exception e) {
            res.put("flag",Boolean.FALSE);
            res.put("msg","取消发车失败！");
        }
        renderJson(res);
    }


    /**
     * 后台-车辆选座信息
     */
    public void toSeatChooseInfo(){
        Kv cond=getCond(getParaMap());
        setAttr("date",getPara("date",new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())));
        if(ValidateKit.isNullOrEmpty(cond)){

        }else{
            Record busInfo=record(cond,"bus.getBusInfoByAca050");
            setAttr("busInfo",busInfo);
        }
        render("seatChooseInfo.html");
    }
    public void busLogin(){
        render("busLogin.html");
    }

    public void busResetPwd(){

        render("busResetPwd.html");
    }

    public void toMyTicket() {
        Kv cond=getCond(getParaMap());
        setAttr("ticketList", commonService.records(cond, "bus.getBusTicket"));
        setAttr("now",new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
        render("ticket.html");
    }

    public void changeDate() {
        int amount = getParaToInt("amount", 0);
        String aba050 = getPara("aba050", "0");
        String value = getPara("value");
        Map res = new HashMap();
        if (!(ValidateKit.isNullOrEmpty(amount) || ValidateKit.isNullOrEmpty(value))) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Date date = sdf.parse(value);
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.DATE, amount);
                date = cal.getTime();
                Kv cond = new Kv();
                cond.put("time", date);
                BusBa05 busBa05 = busBa05Service.findById(aba050);
                if (!ValidateKit.isNullOrEmpty(busBa05)) {
                    cond.put("aba030", busBa05.getAba030());
                }
                String[] weekArr = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
                if (cal.get(Calendar.DAY_OF_WEEK) == 1 || cal.get(Calendar.DAY_OF_WEEK) == 7) {
                    cond.put("aba055", 2);
                } else {
                    cond.put("aba055", 1);
                }
                res.put("time", sdf.format(date));
                if (sdf.format(date).equals(sdf.format(new Date()))) {
                    res.put("isToday", Boolean.TRUE);
                }
                res.put("week", weekArr[cal.get(Calendar.DAY_OF_WEEK) - 1]);
                res.put("aba050", aba050);
                res.put("ba05List", records(cond, "bus.getBa05ListByDate"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        renderJson(res);
    }
    /**************caoyang end*****************/


    /**
     * 校车路线设置
     */
    public void busLineSetting() {
        List<Record> records = records(Kv.by("code_table", "bus_aa99").set("code_type", "aba060"), "bus.getBusCodeList");
        List<Record> aba020List = new ArrayList();
        List<Record> aba020s = new ArrayList();
        for (Record record : records) {
            aba020s = records(Kv.by("aba020", record.get("aaa004")), "bus.busLineList");
            record.set("busLineList", aba020s);
            record.set("rowspan", "<td rowspan=\"" + (aba020s.size() + 1) + "\">" + record.get("aaa005") + "</td>");
            aba020List.add(record);
        }
        setAttr("aba020List", aba020List);
        render("busLineSetting.html");
    }

    /**
     * 校车路线管理
     */
    public void lineManager() {
        setAttr("busBa07", records("bus.getBusBa07"));
        setAttr("aba020", getPara("aba020"));
        render("lineManager.html");
    }

    /**
     * 车票视图
     */
    public void busTicket() {
        Kv cond = getCond(getParaMap());
        setAttr("busTicket", commonService.record(cond, "bus.getBusTicket"));
        render("busTicket.html");
    }

    /**
     * 校车时刻表管理
     */
    public void timeManager() {
        setAttr("busBa07", records("bus.getBusBa07"));
        setAttr("aba030", getPara("aba030"));
        render("timeManager.html");
    }

    /**
     * 保存路线信息
     */
    public void saveBusBa03New() {
        BusBa03 busBa03 = getModel(BusBa03.class, "busBa03");
        if (ValidateKit.isNullOrEmpty(busBa03.getAaa996())) {
            busBa03.setAaa996(0);
        }
        if (busBa03.getAba030() == null) {
            busBa03.setAaa997(getUserInfo().getUserName());
            busBa03.setAaa998(getNowDate());
            busBa03Service.save(busBa03);
        } else {
            busBa03Service.update(busBa03);
        }
        renderJson();
    }

    /**
     * 更新人员绑定信息
     */
    public void updateBindInfo(){
        String type=getPara("type");
        String ids=getPara("ids");
        Map res=busCommonService.updateBindInfo(type,ids);
        renderJson(res);
    }

    public void getBusBa03ListNew() {
        renderJson(Format.listTolayuiPage(records(getCond(getParaMap()), "bus.busLineList")));
    }

    public void getBusBa05ListNew() {
        renderJson(Format.listTolayuiPage(records(getCond(getParaMap()), "bus.lineTimeList")));
    }

    /****************************************************意见反馈**********************************************************/
    public static final BusAa03Service busAa03Service= BusAa03Service.me;
    public void busAa03(){
        render("busAa03.html");
    }
    public void getBusAa03List(){
        Kv cond=getCond(getParaMap());
        renderJson(Format.layuiPage(busAa03Service.paginate(getParaToInt("page", 1),getParaToInt("limit", 10),cond)));
    }
    public void addOrUpdateBusAa03(){
        String aaa030=getPara("aaa030","");
        BusAa03 busAa03=getModel(BusAa03.class,"busAa03");
        if(!aaa030.isEmpty()){
            busAa03=busAa03Service.findById(aaa030);
        }
        setAttr("busAa03",busAa03);
        render("busAa03Detail.html");
    }
    public void saveBusAa03(){
        BusAa03 busAa03=getModel(BusAa03.class,"busAa03");
        if(!ValidateKit.isNullOrEmpty(getUserInfo())){
            busAa03.setAaa997(getUserInfo().getUserName());
            busAa03.setAaa998(getNowTimeStamp());
        }
        if(busAa03.getAaa030()==null){
            busAa03Service.save(busAa03);
        }else{
            busAa03Service.update(busAa03);
        }
        redirect("/bus/busAa03");
    }
    public void deleteBusAa03(){
        String ids=getPara("ids");
        String[] arr=ids.split(",");
        for(String id:arr){
            busAa03Service.delete(id);
        }
        renderJson();
    }

    /**
     * 修改阅读状态
     */
    public void changeAaa033(){
        String ids=getPara("ids");
        int aaa033=getParaToInt("aaa033");
        String[] arr=ids.split(",");
        for(String id:arr){
            busAa03Service.changeAaa033(id,aaa033);
        }
        renderJson();
    }
    /*************************************排队等待*************************************/
    public static final BusBa08Service busBa08Service= BusBa08Service.me;
    public void busBa08(){
        render("busBa08.html");
    }
    public void getBusBa08DistinctList(){
        Kv cond=getCond(getParaMap());
         Page page=busBa08Service.paginate(getParaToInt("page", 1),getParaToInt("limit", 10),cond);
        renderJson(Format.layuiPage(page));
    }
    public void toBusBa08List(){
        setAttr("aba050",getPara("aba050"));
        setAttr("aaa998",getPara("aaa998"));
        render("busBa08List.html");
    }

    public void getBusBa08List(){
        Kv cond=getCond(getParaMap());
        Page page=busBa08Service.paginateList(getParaToInt("page", 1),getParaToInt("limit", 10),cond);
        renderJson(Format.layuiPage(page));
    }
    public void addOrUpdateBusBa08(){
        String aba080=getPara("aba080","");
        BusBa08 busBa08=getModel(BusBa08.class,"busBa08");
        if(!aba080.isEmpty()){
            busBa08=busBa08Service.findById(aba080);
        }
        setAttr("busBa08",busBa08);
        render("busBa08Detail.html");
    }
    public void saveBusBa08(){
        BusBa08 busBa08=getModel(BusBa08.class,"busBa08");
        busBa08.setAaa998(getNowTimeStamp());
        busBa08.setAaa996(1);
        if(busBa08.getAba080()==null){
            busBa08Service.save(busBa08);
        }else{
            busBa08Service.update(busBa08);
        }
        redirect("/bus/busBa08");
    }
    public void deleteBusBa08(){
        String ids=getPara("ids");
        String[] arr=ids.split(",");
        for(String id:arr){
            busBa08Service.delete(id);
        }
        renderJson();
    }

    /**
     * 等车排队
     */
    public void waitInLine(){
        String aba050=getPara("aba050");
        String aba081=getPara("aba081");
        String aaa997=getPara("aaa997");
        String aaa996=getPara("aaa996","1");
        Map res=new HashMap();
        try{
            BusBa08 busBa08=new BusBa08();
            busBa08.setAba050(Integer.parseInt(aba050));
            busBa08.setAba081(Integer.parseInt(aba081));
            busBa08.setAaa997(aaa997);
            busBa08.setAaa996(Integer.parseInt(aaa996));
            busBa08.setAaa998(getNowTimeStamp());
            busBa08Service.save(busBa08);
            res.put("flag",Boolean.TRUE);
            res.put("msg","已成功提交");
        }catch (Exception e){
            res.put("flag",Boolean.FALSE);
            res.put("msg","系统繁忙，稍后再试");
        }
        renderJson(res);
    }

    /**
     *意见反馈
     */
    public void toSuggest(){
        render("suggest.html");
    }

    public void addSuggest(){
        String aaa031=getPara("aaa031");//图片
        String aaa032=getPara("aaa032");//问题描述
        String aaa034=getPara("aaa034");//电话号码
        Map res=new HashMap();
        try{
            if(!(ValidateKit.isNullOrEmpty(aaa032)||ValidateKit.isNullOrEmpty(aaa034))){
                BusAa03 busAa03=new BusAa03();
                busAa03.setAaa031(aaa031);
                busAa03.setAaa032(aaa032);
                busAa03.setAaa034(aaa034);
                busAa03.setAaa033(0);
                busAa03.setAaa996(1);
                busAa03.setAaa998(getNowTimeStamp());
                busAa03Service.save(busAa03);
                res.put("flag",Boolean.TRUE);
                res.put("msg","操作成功，感谢您的意见反馈！");
            }else{
                res.put("flag",Boolean.FALSE);
                res.put("msg","哦，一不小心就出错了...");
            }
        }catch (Exception e){
            res.put("flag",Boolean.FALSE);
            res.put("msg","系统繁忙吧，稍后再试！");
        }
        renderJson(res);
    }

    public void uploadCleanImg(){
        Map res=new HashMap();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
        String dateStr=sdf.format(Calendar.getInstance().getTime());
        UploadFile uploadFile=getFile("image","/bus/"+dateStr);
        String fileName=uploadFile.getFileName();
        String storeName="bus"+System.currentTimeMillis()+fileName.substring(fileName.lastIndexOf("."));
        String filePath=uploadFile.getFile().getParent();
        String storePath="/bus/" + dateStr + "/" +storeName;
        File newFile=new File(filePath+File.separator+storeName);
        uploadFile.getFile().renameTo(newFile);
        if(newFile.exists()){
            res.put("flag",Boolean.TRUE);
            //数据库存储路径
            res.put("storePath",storePath);
            //文件名
            res.put("fileName",fileName);
        }else{
            res.put("flag",Boolean.FALSE);
        }
        renderJson(res);
    }

    /**
     * kindeditor编辑器内上传图片，音频等文件
     */
    public void uploadKindeditorFile(){
        Map result = new HashMap();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
        String dateStr=sdf.format(Calendar.getInstance().getTime());
        UploadFile uploadFile=getFile("imgFile","busKindEditorFile/"+dateStr);
        if (uploadFile != null) {
            String fileName=uploadFile.getFileName();
            String storeName="bus_"+System.currentTimeMillis()+fileName.substring(fileName.lastIndexOf("."));
            String filePath=uploadFile.getFile().getParent();
            File newFile=new File(filePath+File.separator+storeName);
            uploadFile.getFile().renameTo(newFile);
            result.put("error", 0);
            String url=getRequest().getContextPath()+File.separator+"upload"+File.separator+"busKindEditorFile"+File.separator+dateStr+File.separator+storeName;
            result.put("url",url);
        } else {
            result.put("error", 1);
            result.put("message", "请选择文件");
        }
        render(new JsonRender(JSON.toJSONString(result)).forIE());
    }

    /**************************司机里程数****************************/

    public static final BusBa09Service busBa09Service= BusBa09Service.me;
    public void busBa09(){
        render("busBa09.html");
    }
    public void getBusBa09List(){
        renderJson(Format.layuiPage(busBa09Service.paginate(getParaToInt("page", 1),getParaToInt("limit", 10))));
    }
    public void addOrUpdateBusBa09(){
        String aba090=getPara("aba090","");
        BusBa09 busBa09=getModel(BusBa09.class,"busBa09");
        if(!aba090.isEmpty()){
            busBa09=busBa09Service.findById(aba090);
        }
        setAttr("busBa09",busBa09);
        render("busBa09Detail.html");
    }
    public void saveBusBa09(){
        Map res=new HashMap();
        try{
            BusBa09 busBa09=getModel(BusBa09.class,"busBa09");
            busBa09.setAaa996(1);
            busBa09.setAaa998(getNowTimeStamp());
            if(busBa09.getAba090()==null){
                busBa09Service.save(busBa09);
            }else{
                busBa09Service.update(busBa09);
            }
            res.put("flag",Boolean.TRUE);
            res.put("msg","提交成功，请等待审核！");
        }catch (Exception e){
            res.put("flag",Boolean.FALSE);
            res.put("msg","提交失败，请稍后重试！");
        }
        renderJson(res);
        redirect("/bus/busBa09");
    }
    public void deleteBusBa09(){
        String ids=getPara("ids");
        String[] arr=ids.split(",");
        for(String id:arr){
            busBa09Service.delete(id);
        }
        renderJson();
    }

    public void toBusBa09ListPage(){
        render("busBa09ListPage.html");
    }
    public void toBusBa09DetailPage(){
        Kv cond=getCond(getParaMap());
        Record ba09=record(cond,"bus.getBusBa09ListData");
        setAttr("ba09",ba09);
        render("busBa09DetailPage.html");
    }
    public void toBusBa09AddPage(){
        String timeStr=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        setAttr("time",timeStr);
        render("busBa09AddPage.html");
    }
    public void getBusBa09ListData(){
        String aba093=getPara("aba093");
        Kv cond=new Kv();
        cond.put("aba093",aba093);
        List ba09List=records(cond,"bus.getBusBa09ListData");
        renderJson(ba09List);
    }
    public void auditBa09(){
        Map res=new HashMap();
        try{
            String aba090=getPara("aba090");
            int aba093=getParaToInt("aba093");
            String aaa999=getPara("aaa999");
            BusBa09 busBa09=busBa09Service.findById(aba090);
            busBa09.setAba093(aba093);
            busBa09.setAaa999(aaa999);
            busBa09.setAba094("管理员A");
            busBa09.setAba095(getNowTimeStamp());
            busBa09Service.update(busBa09);
            res.put("flag",Boolean.TRUE);
            res.put("msg","操作成功！");
        }catch (Exception e){
            res.put("flag",Boolean.FALSE);
            res.put("msg","操作失败，请稍后重试！");
        }
        renderJson(res);
    }

    /*************************手动排班***************************/
    public static final BusCa05Service busCa05Service=BusCa05Service.me;
    public void busCa05(){
        String aba055=getPara("date");
        if(ValidateKit.isNullOrEmpty("date")){
            setAttr("date",new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
        }
        Kv cond=new Kv();
        cond.put("aaa996",1);
        /*List<Record> ba03List=records(cond,"bus.getBusBa03List");
        setAttr("ba03List",ba03List);*/
        //查询司机列表
        List<Record> aa02List=records(cond,"bus.getBusAa02SelectList");
        setAttr("aa02List",aa02List);
        //查询校车列表
        List<Record> aa01List=records(cond,"bus.getBusAa01List");
        setAttr("aa01List",aa01List);
        render("busCa05.html");
    }

    public void addOrUpdateBusCa05(){
        BusCa05 busCa05=getModel(BusCa05.class,"busCa05");
        if(!ValidateKit.isNullOrEmpty(busCa05.getAca050())){
            busCa05=busCa05Service.findById(String.valueOf(busCa05.getAca050()));
        }
        setAttr("busCa05",busCa05);
        //查询司机列表
        Kv cond=getCond(getParaMap());
        List<Record> aa02List=records(cond,"bus.getBusAa02SelectList");
        setAttr("aa02List",aa02List);
        //查询校车列表
        List<Record> aa01List=records(cond,"bus.getBusAa01List");
        setAttr("aa01List",aa01List);
        render("busCa05Detail.html");
    }
    //加载路线信息
    public void getBa03List(){
        Map res=new HashMap();
        try{
            Kv cond=getCond(getParaMap());
            List<Record> data=records(cond,"bus.getBusBa03List");
            res.put("data",data);
            res.put("msg","路线数据加载成功!");
            res.put("flag",Boolean.TRUE);
        }catch (Exception e){
            e.printStackTrace();
            res.put("msg","路线数据加载失败!");
            res.put("flag",Boolean.FALSE);
        }
        renderJson(res);
    }
    public void getBa050ListByAba030(){
        Kv cond=getCond(getParaMap());
        cond.put("aba055",BusStaticUtil.aba055(getPara("date",new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()))));
        List<Record> ba05List=records(cond,"bus.getBa050ListByAba030");
        renderJson(ba05List);
    }

    /**
     * 新增班次
     */
    public void saveBusCa05(){
        Map res=new HashMap();
        try{
            SysUser sysUser=getUserInfo();
            BusCa05 busCa05=getModel(BusCa05.class,"busCa05");
            if(ValidateKit.isNullOrEmpty(busCa05)){
                res.put("msg","参数缺失!");
                res.put("flag",Boolean.FALSE);
                renderJson(res);
                return;
            }
            String aaa020Str=getPara("aaa020");
            String aaa001Str=getPara("aaa001");
            if(ValidateKit.isNullOrEmpty(aaa020Str) || ValidateKit.isNullOrEmpty(aaa001Str)){
                res.put("msg","请选择发车的班车信息!");
                res.put("flag",Boolean.FALSE);
                renderJson(res);
                return;
            }
            String[] aaa020Arr=aaa020Str.split(",");
            String[] aaa001Arr=aaa001Str.split(",");
            Integer aca050=busCa05.getAca050();
            for(int i=0;i<aaa001Arr.length && i<aaa020Arr.length;i++){
                if(ValidateKit.isNullOrEmpty(aaa020Arr[i]) || ValidateKit.isNullOrEmpty(aaa001Arr[i])){
                    continue;
                }else{
                    busCa05.setAca050(aca050);
                    busCa05.setAaa001(Integer.parseInt(aaa001Arr[i]));
                    busCa05.setAaa020(Integer.parseInt(aaa020Arr[i]));
                    if(ValidateKit.isNullOrEmpty(busCa05.getAca050())){
                        busCa05.setAaa996(1);
                        busCa05.setAaa997(sysUser.getUserName());
                        busCa05.setAaa998(getNowTimeStamp());
                        busCa05.setAca052(sysUser.getMobile());
                        busCa05Service.save(busCa05);
                        if(busCa05.getAca053()==1){
                            //添加定时扫描车辆选座情况到延时任务队列
                            BusStaticUtil.addCheckTask(busCa05.getAca050());
                        }
                        res.put("flag",Boolean.TRUE);
                        res.put("msg","添加成功！");
                        //发送短信告知司机
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                        BusStaticUtil.sendMsgToDriver(String.valueOf(busCa05.getAaa020()),String.valueOf(busCa05.getAba050()),sdf.format(busCa05.getAca051()),BusStaticUtil.MSG_TYPE_ADD);
                    }else{
                        busCa05.setAaa996(1);
                        busCa05.setAaa997(sysUser.getUserName());
                        busCa05.setAaa998(getNowTimeStamp());
                        busCa05Service.update(busCa05);
                        res.put("flag",Boolean.TRUE);
                        res.put("msg","修改成功！");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg","服务器繁忙，稍后再试！");
        }
        renderJson(res);
    }
    public void getCa05ListByAba050(){
        Kv cond=getCond(getParaMap());
        List<Record> ca05List=records(cond,"bus.getCa05ListByAba050");
        renderJson(ca05List);
    }

    public void deleteAca050(){
        String aca050=getPara("aca050");
        Kv cond=getCond(getParaMap());
        Map res=new HashMap();
        try {
            if(!ValidateKit.isNullOrEmpty(aca050)){
                List<Record> ca03List=records(cond,"bus.checkCa03ByAca050");
                if(ca03List.size()>0){
                    res.put("msg","次车次已经存在有效的选座，无法删除！");
                    res.put("flag",Boolean.FALSE);
                }else{
                    BusCa05 busCa05=busCa05Service.findById(aca050);
                    if(!ValidateKit.isNullOrEmpty(busCa05)){
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                        BusStaticUtil.sendMsgToDriver(String.valueOf(busCa05.getAaa020()),String.valueOf(busCa05.getAba050()),sdf.format(busCa05.getAca051()),BusStaticUtil.MSG_TYPE_CANCEL);
                        busCa05Service.delete(aca050);
                    }
                    res.put("msg","已删除！");
                    res.put("flag",Boolean.TRUE);
                }
            }
        }catch (Exception e){
            res.put("msg","服务器繁忙，稍后再试！");
            res.put("flag",Boolean.FALSE);
        }
        renderJson(res);
    }

    /******************************司机页面*****************************************/
    public void toDriverPage(){
        String openid=getPara("openid");
        BusCa04 ca04=busCa04Service.getBusCa04ByAca042(openid);
        setAttr("ca04",ca04);
        render("driverPage.html");
    }
    /*获取司机开车班次*/
    public void getDriverInfoList(){
        String openid=getPara("openid");
        String date=getPara("date",new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
        Map res=new HashMap();
        try{
            if(ValidateKit.isNullOrEmpty(openid)){
                res.put("flag",Boolean.FALSE);
                res.put("msg","当前账号未绑定，请先绑定后再试！");
            }else{
                BusCa04 ca04=busCa04Service.getBusCa04ByAca042(openid);
                if(ValidateKit.isNullOrEmpty(ca04)){
                    res.put("flag",Boolean.FALSE);
                    res.put("msg","没有查到该账号的绑定记录，请先绑定！");
                }else{
                    Kv cond=new Kv();
                    cond.put("aaa007",ca04.getAca041());
                    cond.put("date",date);
                    List<Record> infoList=records(cond,"bus.getCa05ListForDriver");
                    res.put("infoList",infoList);
                    res.put("flag",Boolean.TRUE);
                    res.put("msg","数据加载成功！");
                }
            }
        }catch (Exception er){
            er.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg","服务器出错了，稍后再试！");
        }
        renderJson(res);
    }
    /*司机班次详情*/
    public void toDriverDetail(){
        String aca050=getPara("aca050");
        try{
            if(ValidateKit.isNullOrEmpty(aca050)){

            }else{
                //车辆信息
                Kv cond=getCond(getParaMap());
                Record busInfo=record(cond,"bus.getBusInfoByAca050");
                String[] weekArr = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(busInfo.getDate("aca051"));
                String week = weekArr[calendar.get(Calendar.DAY_OF_WEEK) - 1];
                setAttr("week",week);
                setAttr("busInfo",busInfo);
                setAttr("role",BusStaticUtil.QR_SCAN_ROLE_DRIVER);
            }
        }catch (Exception e){

        }
        render("driverDetail.html");
    }
    /*获取选座详情*/
    public void getInfoByAca030(){
        String aca030=getPara("aca030");
        Map res=new HashMap();
        try{
            if(!ValidateKit.isNullOrEmpty(aca030)){
                Record ca03=record(getCond(getParaMap()),"bus.getInfoByAca030");
                if(!ValidateKit.isNullOrEmpty(ca03)){
                    res.put("ca03",ca03);
                    res.put("flag",Boolean.TRUE);
                    res.put("msg","数据加载成功！");
                }else{
                    res.put("flag",Boolean.FALSE);
                    res.put("msg","该座位可能已退票！");
                }
            }else{
                res.put("flag",Boolean.FALSE);
                res.put("msg","该座位可能已退票1111！");
            }
        }catch (Exception e){
            e.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg","服务器繁忙，稍后再试！");
        }
        renderJson(res);
    }
    /*********************************消息管理*******************************/
    public static final BusCa01Service busCa01Service= BusCa01Service.me;
    public void busCa01(){
        render("busCa01.html");
    }
    public void getBusCa01List(){
        Kv cond=getCond(getParaMap());
        renderJson(Format.layuiPage(busCa01Service.paginate(getParaToInt("page", 1),getParaToInt("limit", 10),cond)));
    }
    public void addOrUpdateBusCa01(){
        String aca010=getPara("aca010","");
        BusCa01 busCa01=getModel(BusCa01.class,"busCa01");
        if(!aca010.isEmpty()){
            busCa01=busCa01Service.findById(aca010);
        }
        setAttr("busCa01",busCa01);
        render("busCa01Detail.html");
    }
    public void saveBusCa01(){
        BusCa01 busCa01=getModel(BusCa01.class,"busCa01");
        SysUser sysUser=getUserInfo();
        busCa01.setAaa997(sysUser.getUserName());
        busCa01.setAaa998(getNowTimeStamp());
        if(busCa01.getAca010()==null){
            busCa01Service.save(busCa01);
        }else{
            busCa01Service.update(busCa01);
        }
        redirect("/bus/busCa01");
    }
    public void deleteBusCa01(){
        String ids=getPara("ids");
        String[] arr=ids.split(",");
        for(String id:arr){
            busCa01Service.delete(id);
        }
        renderJson();
    }

    public void message(){
        render("message.html");
    }

    public void getMessageList(){
        Kv cond=getCond(getParaMap());
        List<Record> ca01List=records(cond,"bus.getCa01ListForPhone");
        for(Record record:ca01List){
            String describe=htmlFilter(record.getStr("content"));
            record.set("describe",describe);
        }
        renderJson(ca01List);
    }

    public void toMessageDetail(){
        Kv cond=getCond(getParaMap());
        Record ca01=record(cond,"bus.getCa01ListForPhone");
        setAttr("ca01",ca01);
        render("messageDetail.html");
    }

    public static String htmlFilter(String htmlStr){
        if(ValidateKit.isNullOrEmpty(htmlStr)){
            return "";
        }else{
            String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式
            String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式
            String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式

            Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE);
            Matcher m_script=p_script.matcher(htmlStr);
            htmlStr=m_script.replaceAll(""); //过滤script标签

            Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE);
            Matcher m_style=p_style.matcher(htmlStr);
            htmlStr=m_style.replaceAll(""); //过滤style标签

            Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE);
            Matcher m_html=p_html.matcher(htmlStr);
            htmlStr=m_html.replaceAll(""); //过滤html标签
            return htmlStr.trim().substring(0,(htmlStr.trim().length()>50?50:htmlStr.trim().length()))+"...";
        }
    }
    /*********************************统计分析*******************************/

    public void busStatistical(){
        //查询司机列表
        List<Record> aa02List=records("bus.getBusAa02SelectList");
        setAttr("aa02List",aa02List);
        setAttr("aca033List",Db.find("select aaa004 as id ,aaa005 as name from bus_aa99 where aaa002='aca033' and aaa996=1"));
        render("busStatistical.html");
    }
    /*获取统计数据*/
    public void getBusStatisticData(){
        Map res=new HashMap();
        Kv cond=getCond(getParaMap());
        String dateArea=cond.getStr("dateArea");
        if(ValidateKit.isNullOrEmpty(dateArea)){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal=Calendar.getInstance();
            String end=sdf.format(cal.getTime());
            cond.put("end",end);
            cal.add(Calendar.DAY_OF_YEAR,-15);
            String start=sdf.format(cal.getTime());
            cond.put("start",start);
            res.put("dateArea",start+" ~ "+end);
        }else{
            String[] dateAreaArr=dateArea.split("~");
            cond.put("end",dateAreaArr[1].trim());
            cond.put("start",dateAreaArr[0].trim());
        }
        List<Record> ca05List=records(cond,"bus.getCa05Statistic");
        res.put("ca05List",ca05List);
        renderJson(res);
    }
    public void getCa03List(){
        Map res=new HashMap();
        Kv cond=getCond(getParaMap());
        String dateArea=cond.getStr("dateArea");
        if(ValidateKit.isNullOrEmpty(dateArea)){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal=Calendar.getInstance();
            String end=sdf.format(cal.getTime());
            cond.put("end",end);
            cal.add(Calendar.DAY_OF_YEAR,-15);
            String start=sdf.format(cal.getTime());
            res.put("dateArea",start+" ~ "+end);
            cond.put("start",start);
        }else{
            String[] dateAreaArr=dateArea.split("~");
            cond.put("start",dateAreaArr[0].trim());
            cond.put("end",dateAreaArr[1].trim());
        }
        List<Record> ca03List=records(cond,"bus.getCa03Statistic");
        res.put("ca03List",ca03List);
        renderJson(res);
    }
    public void getAca033List(){
        Kv cond=getCond(getParaMap());
        List<Record> evaluateList=records(cond,"bus.getCa03EvaluateList");
        renderJson(evaluateList);
    }

    /*********************************调度员 开始**********************************/
    public static final BusAa04Service busAa04Service= BusAa04Service.me;
    public void busAa04(){
        render("busAa04.html");
    }
    public void getBusAa04List(){
        Kv cond=getCond(getParaMap());
        renderJson(Format.layuiPage(busAa04Service.paginate(getParaToInt("page", 1),getParaToInt("limit", 10),cond)));
    }
    public void addOrUpdateBusAa04(){
        String aaa040=getPara("aaa040","");
        BusAa04 busAa04=getModel(BusAa04.class,"busAa04");
        if(!aaa040.isEmpty()){
            busAa04=busAa04Service.findById(aaa040);
        }
        setAttr("busAa04",busAa04);
        render("busAa04Detail.html");
    }
    public void saveBusAa04(){
        BusAa04 busAa04=getModel(BusAa04.class,"busAa04");
        if(busAa04.getAaa040()==null){
            busAa04.setAaa997(getUserInfo().getUserName());
            busAa04.setAaa998(getNowTimeStamp());
            busAa04Service.save(busAa04);
        }else{
            busAa04Service.update(busAa04);
        }
        redirect("/bus/busAa04");
    }
    public void deleteBusAa04(){
        String ids=getPara("ids");
        String[] arr=ids.split(",");
        for(String id:arr){
            busAa04Service.delete(id);
        }
        renderJson();
    }
    /**
     * 调度员手机端页面
     */
    public void toDispatcherPage(){
        String aca050=getPara("scheduleId");
        String openid=getPara("openid");
        try{
            if(!(ValidateKit.isNullOrEmpty(aca050) || ValidateKit.isNullOrEmpty(openid))){
                //登录人信息
                BusCa04 ca04=busCa04Service.getBusCa04ByAca042(openid);
                if(ValidateKit.isNullOrEmpty(ca04)){
                    ca04=new BusCa04();
                }
                setAttr("ca04",ca04);
                //车辆信息
                Kv cond=new Kv();
                cond.put("aca050",aca050);
                Record busInfo=record(cond,"bus.getBusInfoByAca050");
                String[] weekArr = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(busInfo.getDate("aca051"));
                String week = weekArr[calendar.get(Calendar.DAY_OF_WEEK) - 1];
                setAttr("busInfo",busInfo);
                setAttr("week",week);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        render("dispatcherPage.html");
    }
    /*********************************调度员 结束**********************************/

    /*********************************对账单 开始**********************************/
    public void busCa06(){
        render("busCa06.html");
    }

    public void getBusCa06List(){
        Kv cond=getCond(getParaMap());
        String range=getPara("range");
        if(!ValidateKit.isNullOrEmpty(range) && !"~".equals(range.trim()) && range.length()==19){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
            String[] rangeArr=range.split("~");
            try {
                Date begin=sdf.parse(rangeArr[0].trim());
                Date end=sdf.parse(rangeArr[1].trim());
                cond.put("begin",begin);
                cond.put("end",end);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        Page page=paginate(getParaToInt("page", 1), getParaToInt("limit", 10),cond,"bus.getCa06List");
        renderJson(Format.layuiPage(generateData(page)));
    }

    public static Page<Record> generateData(Page page){
        List<Record> dataList=page.getList();
        Page datePage=null;
        if(dataList.size()==0){
            datePage=page;
        }else{
            Record total=new Record();
            total.set("aca061","总计");
            BigDecimal aca062=new BigDecimal("0.00");
            BigDecimal aca063=new BigDecimal("0.00");
            BigDecimal aca064=new BigDecimal("0.00");
            BigDecimal aca065=new BigDecimal("0.00");
            BigDecimal aca066=new BigDecimal("0.00");
            BigDecimal aca067=new BigDecimal("0.00");
            BigDecimal aca068=new BigDecimal("0.00");
            BigDecimal aca069=new BigDecimal("0.00");
            for(Record data:dataList){
                if(!ValidateKit.isNullOrEmpty(data.get("aca062"))){
                    aca062=aca062.add(new BigDecimal(data.getStr("aca062")));
                }
                if(!ValidateKit.isNullOrEmpty(data.get("aca063"))){
                    aca063=aca063.add(new BigDecimal(data.getStr("aca063")));
                }
                if(!ValidateKit.isNullOrEmpty(data.get("aca064"))){
                    aca064=aca064.add(new BigDecimal(data.getStr("aca064")));
                }
                if(!ValidateKit.isNullOrEmpty(data.get("aca065"))){
                    aca065=aca065.add(new BigDecimal(data.getStr("aca065")));
                }
                if(!ValidateKit.isNullOrEmpty(data.get("aca066"))){
                    aca066=aca066.add(new BigDecimal(data.getStr("aca066")));
                }
                if(!ValidateKit.isNullOrEmpty(data.get("aca067"))){
                    aca067=aca067.add(new BigDecimal(data.getStr("aca067")));
                }
                if(!ValidateKit.isNullOrEmpty(data.get("aca068"))){
                    aca068=aca068.add(new BigDecimal(data.getStr("aca068")));
                }
                if(!ValidateKit.isNullOrEmpty(data.get("aca069"))){
                    aca069=aca069.add(new BigDecimal(data.getStr("aca069")));
                }
            }
            total.set("aca062",aca062.toString());
            total.set("aca063",aca063.toString());
            total.set("aca064",aca064.toString());
            total.set("aca065",aca065.toString());
            total.set("aca066",aca066.toString());
            total.set("aca067",aca067.toString());
            total.set("aca068",aca068.toString());
            total.set("aca069",aca069.toString());
            total.set("aaa997","-");
            total.set("aaa998","-");
            dataList.add(total);
            datePage=new Page<Record>(dataList, page.getPageNumber(), page.getPageSize(), page.getTotalPage(), page.getTotalRow());
        }
        return datePage;
    }
    public void generateCa06Data(){
        Map res=new HashMap();
        try{
            String range=getPara("range");
            if(!ValidateKit.isNullOrEmpty(range) && !"~".equals(range.trim()) && range.length()==19){
                SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
                String[] rangeArr=range.split("~");
                Date begin=sdf.parse(rangeArr[0].trim());
                Date end=sdf.parse(rangeArr[1].trim());
                for(Date i=begin;!(i.equals(end));i.setTime(i.getTime()+24*60*60*1000)){
                    getBillByDate(sdf.format(i));
                }
                res.put("flag",Boolean.TRUE);
                res.put("msg","数据加载完成！");
            }else{
                res.put("flag",Boolean.FALSE);
                res.put("msg","参数错误！");
            }
        }catch (Exception e){

        }
        renderJson(res);
    }
    public String formatData(String data){
        String res="";
        if(ValidateKit.isNullOrEmpty(data)){
            res="";
        }else{
            res=data.replaceAll("\"","").replaceAll("`","").trim();
        }
        return res;
    }
    /**
     * 拉取对账单数据
     * @param dateStr 需要查询的日期，String格式，例：20190605
     */
    public boolean getBillByDate(String dateStr){
        boolean flag=Boolean.TRUE;
        try {
            Date date=new SimpleDateFormat("yyyyMMdd").parse(dateStr);
            MyConfig myConfig = new MyConfig();
            WXPay wxpay = new WXPay(myConfig);
            Map<String,String> reqData=new HashMap();
            reqData.put("appid",myConfig.getAppID());
            reqData.put("mch_id",myConfig.getMchID());
            reqData.put("nonce_str", WXPayUtil.generateNonceStr());
            reqData.put("sign_type", WXPayConstants.MD5);
            reqData.put("bill_date",dateStr);
            reqData.put("bill_type","ALL");
            reqData.put("sign",WXPayUtil.generateSignature(reqData,myConfig.getKey(),WXPayConstants.SignType.MD5));
            Map resData= wxpay.downloadBill(reqData);
            if("SUCCESS".equals(resData.get("return_code"))){
                if(!ValidateKit.isNullOrEmpty(resData.get("data"))){
                    String[] dataArr=String.valueOf(resData.get("data")).split("\r\n");
                    String[] data=dataArr[dataArr.length-1].split(",");
                    BusCa06 dao=BusCa06.dao;
                    //判断是否已有数据
                    BusCa06 ca06=dao.findFirst("select * from bus_ca06 where aca061=? and aaa996=1",date);
                    if(!ValidateKit.isNullOrEmpty(ca06) && ca06.getAca060()>0){//已有,则更新
                        ca06.setAca061(date);
                        ca06.setAca062(Integer.valueOf(formatData(data[0])));
                        ca06.setAca063(new BigDecimal(formatData(data[1])));
                        ca06.setAca064(new BigDecimal(formatData(data[2])));
                        ca06.setAca065(new BigDecimal(formatData(data[3])));
                        ca06.setAca066(new BigDecimal(formatData(data[4])));
                        BigDecimal aca067=new BigDecimal(formatData(data[5]));
                        BigDecimal aca068=new BigDecimal(formatData(data[6]));
                        ca06.setAca067(aca067);
                        ca06.setAca068(aca068);
                        ca06.setAca069(aca067.subtract(aca068));
                        ca06.setAaa996(1);
                        SysUser sysUser=getUserInfo();
                        if(!ValidateKit.isNullOrEmpty(sysUser)){
                            ca06.setAaa997(sysUser.getUserName());
                        }
                        ca06.setAaa998(getNowTimeStamp());
                        ca06.update();
                    }else{//没有则新增
                        ca06=new BusCa06();
                        ca06.setAca061(date);
                        ca06.setAca062(Integer.valueOf(formatData(data[0])));
                        ca06.setAca063(new BigDecimal(formatData(data[1])));
                        ca06.setAca064(new BigDecimal(formatData(data[2])));
                        ca06.setAca065(new BigDecimal(formatData(data[3])));
                        ca06.setAca066(new BigDecimal(formatData(data[4])));
                        BigDecimal aca067=new BigDecimal(formatData(data[5]));
                        BigDecimal aca068=new BigDecimal(formatData(data[6]));
                        ca06.setAca067(aca067);
                        ca06.setAca068(aca068);
                        ca06.setAca069(aca067.subtract(aca068));
                        ca06.setAaa996(1);
                        SysUser sysUser=getUserInfo();
                        if(!ValidateKit.isNullOrEmpty(sysUser)){
                            ca06.setAaa997(sysUser.getUserName());
                        }
                        ca06.setAaa998(getNowTimeStamp());
                        ca06.save();
                    }
                    flag= Boolean.TRUE;
                }
            }else{
                flag= Boolean.FALSE;
            }
        }catch (Exception e) {
            e.printStackTrace();
            flag= Boolean.FALSE;
        }
        return flag;
    }
    /*********************************对账单 结束**********************************/

    /*********************************查看绑定信息 开始 ****************************/

    public void toCa04(){
        setAttr("pTypeList",Db.find("select aaa004 as id,aaa005 as name from bus_aa99 where aaa996=1 and aaa002='aca044'"));
        setAttr("effective",Db.find("select aaa004 as id,aaa005 as name from bus_aa99 where aaa996=1 and aaa002='aaa996'"));
        render("busCa04.html");
    }

    public void getBusCa04List(){
        Kv cond=getCond(getParaMap());
        cond.put("max_count",BusStaticUtil.MAX_INVALID_COUNT);
        renderJson(Format.layuiPage(busCa04Service.paginate(getParaToInt("page", 1),getParaToInt("limit", 10),cond)));
    }

    public void deleteBusCa04(){
        String ids=getPara("ids");
        String[] arr=ids.split(",");
        for(String id:arr){
            busCa04Service.delete(id);
        }
        renderJson();
    }

    /**
     * 比对两边数据
     * 将失效的数据剔除
     */
    public void checkData(){
        Map res=busCa04Service.checkData();
        renderJson(res);
    }
    //解锁账号
    public void unLockBusCa04(){
        String aca040=getPara("aca040");
        Map res=new HashMap();
        try{
            Db.update("update bus_ca04 set aca049=? where aca040=?",0,aca040);
            res.put("flag",Boolean.TRUE);
            res.put("msg","账号已解锁！");
        }catch (Exception e){
            e.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg","账号解锁失败，请稍后再试！");
        }
        renderJson(res);
    }
    /*********************************查看绑定信息 结束****************************/
    /*********************************节假日管理 开始****************************/
    public static final BusCa07Service busCa07Service= BusCa07Service.me;
    public void busCa07(){
        render("busCa07.html");
    }
    public void getBusCa07List(){
        Kv cond=getCond(getParaMap());
        renderJson(Format.layuiPage(busCa07Service.paginate(getParaToInt("page", 1),getParaToInt("limit", 10),cond)));
    }
    public void addOrUpdateBusCa07(){
        String aca070=getPara("aca070","");
        BusCa07 busCa07=getModel(BusCa07.class,"busCa07");
        if(!aca070.isEmpty()){
            busCa07=busCa07Service.findById(aca070);
        }
        setAttr("aba055List",Db.find("select aaa004 as id,aaa005 as name,aaa004+0 as value from bus_aa99 where aaa996=1 and aaa002='aba055' "));
        setAttr("busCa07",busCa07);
        render("busCa07Detail.html");
    }
    public void saveBusCa07(){
        BusCa07 busCa07=getModel(BusCa07.class,"busCa07");
        SysUser user=getUserInfo();
        if(busCa07.getAca070()==null){
            if(!ValidateKit.isNullOrEmpty(user)){
                busCa07.setAaa997(user.getUserName());
            }
            busCa07.setAaa998(getNowTimeStamp());
            busCa07Service.save(busCa07);
        }else{
            busCa07Service.update(busCa07);
        }
        redirect("/bus/busCa07");
    }
    public void deleteBusCa07(){
        String ids=getPara("ids");
        String[] arr=ids.split(",");
        for(String id:arr){
            busCa07Service.delete(id);
        }
        renderJson();
    }
    /*********************************节假日管理 结束****************************/
    /*********************************临时人员管理  开始****************************/
    public static final BusCa08Service busCa08Service= BusCa08Service.me;
    public void busCa08(){
        render("busCa08.html");
    }
    public void getBusCa08List(){
        Kv cond=getCond(getParaMap());
        renderJson(Format.layuiPage(busCa08Service.paginate(getParaToInt("page", 1),getParaToInt("limit", 10),cond)));
    }
    public void addOrUpdateBusCa08(){
        String aca080=getPara("aca080","");
        BusCa08 busCa08=getModel(BusCa08.class,"busCa08");
        if(!aca080.isEmpty()){
            busCa08=busCa08Service.findById(aca080);
        }
        setAttr("busCa08",busCa08);
        render("busCa08Detail.html");
    }
    public void saveBusCa08(){
        BusCa08 busCa08=getModel(BusCa08.class,"busCa08");
        SysUser user=getUserInfo();
        if(busCa08.getAca080()==null){
            if(!ValidateKit.isNullOrEmpty(user)){
                busCa08.setAaa997(user.getUserName());
            }
            busCa08.setAaa998(getNowTimeStamp());
            busCa08Service.save(busCa08);
        }else{
            busCa08Service.update(busCa08);
        }
        redirect("/bus/busCa08");
    }
    public void deleteBusCa08(){
        String ids=getPara("ids");
        String[] arr=ids.split(",");
        for(String id:arr){
            busCa08Service.delete(id);
        }
        renderJson();
    }
    /*********************************临时人员管理  结束****************************/
    /*********************************选座情况查询  开始****************************/
    public void toSeatStatistic(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Calendar cld = Calendar.getInstance(Locale.CHINA);
        cld.setFirstDayOfWeek(Calendar.MONDAY);//以周一为首日
        cld.setTimeInMillis(System.currentTimeMillis());//当前时间
        cld.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);//周一
        setAttr("mon",df.format(cld.getTime()));
        cld.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);//周日
        setAttr("sun",df.format(cld.getTime()));
        render("seatStatistic.html");
    }

    public void getSeatStatisticList(){
        Map<String, String[]> paraMap = getParaMap();
        Kv cond = CommonController.getCond(paraMap);
        SqlPara sqlPara = Db.getSqlPara("bus.getSeatStatisticList", cond);
        renderJson(Format.layuiPage(Db.paginate(getParaToInt("page"), getParaToInt("limit"), sqlPara)));
    }
    /*********************************选座情况查询  结束****************************/
    /*********************************查询首页统计数据  结束****************************/
    //跳往班车预约主页
    public void toBusConsole(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Calendar cld = Calendar.getInstance(Locale.CHINA);
        cld.set(Calendar.DAY_OF_MONTH, cld.getActualMinimum(Calendar.DAY_OF_MONTH));//本月第一天
        setAttr("dateStart",df.format(cld.getTime()));
        cld.set(Calendar.DAY_OF_MONTH, cld.getActualMaximum(Calendar.DAY_OF_MONTH));//本月最后一天
        setAttr("dateEnd",df.format(cld.getTime()));
        render("busConsole.html");
    }
    //获取班车预约主页统计数据
    public void getBusConsoleData(){
        String dateStart=getPara("dateStart");
        String dateEnd=getPara("dateEnd");
        Map res=new HashMap();
        if(ValidateKit.isNullOrEmpty(dateStart) || ValidateKit.isNullOrEmpty(dateEnd)){
            res.put("flag",Boolean.FALSE);
            res.put("msg","参数错误！");
            renderJson(res);
            return;
        }
        try{
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
            Kv cond=new Kv();
            cond.put("dateStart",df.parse(dateStart));
            cond.put("dateEnd",df.parse(dateEnd));
            //1.获取当前时间内的发车信息
            List<Record> timeList=records(cond,"bus.getConsoleTimeList");
            Map<String,Integer> map=new HashMap();
            List<ConsoleTimeElement> list=new ArrayList();
            for(Record record:timeList){
                if(map.containsKey(record.getStr("time"))){//已存在
                    list.get(map.get(record.getStr("time"))).addConsole(record);
                }else{//不存在
                    map.put(record.getStr("time"),list.size());
                    list.add(new ConsoleTimeElement(record));
                }
            }
            //2.排序
            list.sort(new Comparator<ConsoleTimeElement>() {
                @Override
                public int compare(ConsoleTimeElement o1, ConsoleTimeElement o2) {
                    return o1.compareTo(o2);
                }
            });
            //3.组装echarts数据
            List<Map> series=new ArrayList<>();
            int[] stuArr=new int[list.size()];
            int[] teaArr=new int[list.size()];
            int[] tempArr=new int[list.size()];
            int[] lockArr=new int[list.size()];
            List<String> xAxisData=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                xAxisData.add(list.get(i).getTime());
                stuArr[i]=list.get(i).getStudentChoose();
                teaArr[i]=list.get(i).getTeacherChoose();
                tempArr[i]=list.get(i).getTempChoose();
                lockArr[i]=list.get(i).getManagerLock();
            }
            String[] legend=new String[]{"学生","教师","临时人员","后台锁定"};
            for(String str:legend){
               Map seriesMap=new HashMap();
                seriesMap.put("name",str);
                seriesMap.put("type","bar");
                series.add(seriesMap);
            }
            series.get(0).put("data",stuArr);
            series.get(1).put("data",teaArr);
            series.get(2).put("data",tempArr);
            series.get(3).put("data",lockArr);
            //查询发车数和选座人数
            Record record=record(cond,"bus.getConsoleBusInfo");
            res.put("series",series);
            res.put("xAxisData",xAxisData);
            res.put("legend",legend);
            res.put("data",record);
            res.put("dateStart",dateStart);
            res.put("dateEnd",dateEnd);
            res.put("flag",Boolean.TRUE);
            res.put("msg","数据加载成功！");
        }catch (Exception e){
            e.printStackTrace();
            res.put("flag",Boolean.FALSE);
            res.put("msg","数据加载失败，请稍后重试！");
        }
        renderJson(res);
    }
    /*********************************查询首页统计数据  结束****************************/
}



