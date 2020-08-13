package com.mht.bus.util;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.bus.exception.BusException;
import com.mht.bus.service.*;
import com.mht.common.model.*;
import com.mht.common.service.CommonService;
import com.sun.istack.NotNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * 常量工具类
 * @author Ranbo
 * 2019/3/30 16:17
 */
public class BusStaticUtil {
    /*支付*/
    public static final String SUCCESS="SUCCESS";//支付成功标识
    public static final String PAY_TITLE="BusPay";//支付订单号title
    public static final String REFUND_TITLE="BusRefund";//退款单号title
    public static final String REFUND_STU="四川大学校车车票退款（个人发起退款）";
    public static final String REFUND_CANCEL_BUS="四川大学校车车票退款（取消发车）";
    public static final String RESULT_FAIL="FAIL";
    public static final String CALLBACK_OK="<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>";
    public static final String CALLBACK_FAIL="<xml><return_code><![CDATA[FAIL]]></return_code><return_msg><![CDATA[报文校验不通过!]]></return_msg></xml>";
    public static final String MSG_SIGN="校园车队管理系统";
    public static final int MAX_CHOOSE_NUM=1; //最大选座数
    public static final int TICKET_PRICE_NORMAL=400; //票价（分）
    public static final int TICKET_PRICE_0=0; //票价（分）
    public static final int MAX_INVALID_COUNT=0; //最大违约次数,为0表示不限次数

    //扫码角色
    public static final String QR_SCAN_ROLE_DRIVER="dri";//司机
    public static final String QR_SCAN_ROLE_DISPATCHER="dis";//调度员

    //乘车状态
    public static final int BUS_AA99_ACA036_0=0;//未乘坐
    public static final int BUS_AA99_ACA036_1=1;//已乘坐

    //任务调度时间
    public static final String BATCH_TASK_TIME_1=" 23:55:00";

    //新增班车
    public static final String MSG_TYPE_ADD="add";
    //取消发车
    public static final String MSG_TYPE_CANCEL="cancel";

    //绑定信息更新类型
    public static final String BIND_UPDATE_ALL="all";
    public static final String BIND_UPDATE_PART="part";
    //信息分割符号
    public static final String SEPARATOR_COMMA=",";
    public static final String SEPARATOR_SEMI=";";
    //信息有效性
    public static final int VALID=1;
    public static final int INVALID=0;

    //车票支付状态
    public static final int PAY_STATE_UNPAID=0;//未支付
    public static final int PAY_STATE_PAID=1;//已经支付
    public static final int PAY_STATE_NO_REQUIRED=2;//不需要支付
    public static final int PAY_STATE_REFUND_PART=3;//部分退款
    public static final int PAY_STATE_REFUND_ALL=4;//全部退款


    public static final int WEEKDAY=1;//周一到周五
    public static final int WEEKEND=2;//周六周日

    //业务service
    public static final BusCa07Service ca07Service= BusCa07Service.me;
    public static final BusAa02Service aa02Service=BusAa02Service.me;
    public static final BusCa08Service ca08Service=BusCa08Service.me;
    public static final BusCa05Service ca05Service=BusCa05Service.me;
    public static final CommonService commonService=CommonService.me;
    public static final BusCommonService busCommonService = BusCommonService.me;
    //短信发送客户端
    private static final SMSClient smsClient = null;//new SMSClient();

    /**
     * @param driverId 驾驶员id
     * @param timeId 时刻表id
     * @param Date 发车日期
     */
    public static void sendMsgToDriver(String driverId,String timeId,String Date,String type){
        try{
            new Thread(()->{
                try{
                    BusAa02 aa02=aa02Service.findById(driverId);
                    Kv cond=new Kv().set("aba050",Integer.parseInt(timeId));
                    SqlPara sqlPara = Db.getSqlPara("bus.getInfoByAba050", cond);
                    Record busInfo=Db.findFirst(sqlPara);
                    if(!(ValidateKit.isNullOrEmpty(aa02) || ValidateKit.isNullOrEmpty(busInfo))){
                        StringBuffer contentBuffer=new StringBuffer();
                        if(MSG_TYPE_ADD.equals(type)){
                            contentBuffer.append("驾驶员您好！新增【班车】信息如下，发车时间：【").append(Date).append(" ").append(busInfo.getStr("startTime")).append("】");
                            contentBuffer.append("发车路线：【").append(busInfo.getStr("startPoint")).append(" ------ ").append(busInfo.getStr("endPoint")).append("】");
                            contentBuffer.append("请于发车前 15 分钟到达发车地点！");
                        }else if(MSG_TYPE_CANCEL.equals(type)){
                            contentBuffer.append("驾驶员您好！原定于时间为：【").append(Date).append(" ").append(busInfo.getStr("startTime")).append("】");
                            contentBuffer.append("发车路线为：【").append(busInfo.getStr("startPoint")).append(" ------ ").append(busInfo.getStr("endPoint")).append("】");
                            contentBuffer.append("的班车【已取消发车】，特此通知！");
                        }
                        String mobile=aa02.getAaa007();
                        if (!ValidateKit.isNullOrEmpty(mobile) && mobile.length() == 11 && smsClient != null) {
                            String res = smsClient.sendSMS(mobile, contentBuffer.toString(), "", MSG_SIGN);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @param aca050 班次号
     */
    public static void sendCancelBusMsgToDispatcher(Integer aca050){
        new Thread(()->{
            try{
                Record info=commonService.record(new Kv().set("aca050",aca050) ,"bus.getBusInfoByAca050");
                if(!ValidateKit.isNullOrEmpty(info)){
                    StringBuffer content= new StringBuffer("调度员您好，");
                    content.append("车牌号为【").append(info.getStr("aaa005")).append("】，")
                            .append("发车时间为【").append(info.getStr("aca051")).append(" ").append(info.getStr("aba051")).append("】，")
                            .append("驾驶员为【").append(info.getStr("driver"));
                    if(!ValidateKit.isNullOrEmpty(info.getStr("driver_phone"))){
                        content.append("( ").append(info.getStr("driver_phone")).append(" )");
                    }
                    content.append("】，");
                    content.append("的班次由于超过发车时间无人预约，已经由系统自动取消发车，特此通知！");
                    String mobile=info.get("mobile");
                    if (!ValidateKit.isNullOrEmpty(mobile) && mobile.length() == 11 && smsClient != null) {
                        String res = smsClient.sendSMS(mobile, content.toString(), "", MSG_SIGN);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }

    /**
     * 判断aba055的值
     *
     * @param date 日期
     * @return java.lang.Integer
     * @apiNote 首先判断日期是否在bus_ca07节假日表中，若未在，按照正常流程判断；若在，取表中aba055的值
     */
    public static Integer aba055(String date) {
        int aba055=1;
        Calendar calendar = Calendar.getInstance();
        try {
            Date time = CommonService.getDateWithFormat("yyyy-MM-dd", date);
            BusCa07 ca07=BusCa07Service.dao.findFirst("select * from bus_ca07 where aca071=? and aaa996=1",time);
            if(ValidateKit.isNullOrEmpty(ca07)){//不在节假日列表里
                calendar.setTime(time);
                if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
                    aba055=WEEKEND;//周六周日
                }else{
                    aba055=WEEKDAY;//周一至周五
                }
            }else{//在节假日列表里
                aba055=ca07.getAba055();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aba055;
    }
    public static final String TEACHER="teacher";
    public static final String STUDENT="student";
    public static final String ALL="all";
    public static final String LOGIN_FAIL="login_fail";

    //根据人员类型返回查询车次类型
    public static String parseType(BusCa04 ca04) throws BusException {
        String result="";
        if(ValidateKit.isNullOrEmpty(ca04)){
            throw new BusException("值不能为空！");
        }
        int type=Integer.parseInt(ca04.getAca044());
        if(type==6){
            BusCa08 ca08=ca08Service.getCa08ByAccount(ca04.getAca046(),ca04.getAca041());
            if(ValidateKit.isNullOrEmpty(ca08)){//临时人员信息失效
                throw new BusException("登录人员信息不存在！");
            }else{
                type=Integer.parseInt(ca08.getAca044());
            }
        }
        switch (type){
            case 1:
                result=STUDENT;
                break;
            case 2:
                result=STUDENT;
                break;
            case 3:
                result=TEACHER;
                break;
            default:
                result=ALL;
                break;

        }
        return result;
    }

    /**
     * 根据人员类型返回车票价格
     * @param ca04 人员信息
     * @return 车票价格 单位：分，若按返回值为0，表示不需要支付
     */
    public static int getPrice(BusCa04 ca04) throws BusException {
        int price=0;
        int type=Integer.parseInt(ca04.getAca044());
        if(type==6){//临时人员
            BusCa08 ca08=ca08Service.getCa08ByAccount(ca04.getAca046(),ca04.getAca041());
            if(ValidateKit.isNullOrEmpty(ca08)){//临时人员信息失效
                throw new BusException("登录人员信息不存在！");
            }else{
                //临时人员购票时类型为：临时人员表中的人员类型
                type=Integer.parseInt(ca08.getAca044());
            }
        }
        switch (type){
            case 0:
                price=TICKET_PRICE_0;
                break;
            case 1:
                price= TICKET_PRICE_NORMAL;
                break;
            case 2:
                price= TICKET_PRICE_NORMAL;
                break;
            case 3:
                price= TICKET_PRICE_0;//教职工不付款
                break;
            default:
                price=TICKET_PRICE_NORMAL;
                break;
        }
        return price;
    }

    /**
     * 添加定时任务到任务队列
     * @param aca050
     */
    public static void addCheckTask(Integer aca050){
        Record info=commonService.record(new Kv().set("aca050",aca050) ,"bus.getBusInfoByAca050");
        if(!ValidateKit.isNullOrEmpty(info)){
            String timeStr=info.getStr("aca051")+" "+info.getStr("aba051");
            BusScheduleUtil.getInstance().addTask(()->{
                //调度任务
                busCommonService.handleBusCheck(aca050);
            },BusScheduleUtil.getInstance().getDefaultDelay(timeStr), TimeUnit.MILLISECONDS);
        }
    }

    /**
     * 检查当前选座是否符合规则
     * 规则如下：
     * 同一日期 同一路线 同一发车路线下 若当前车的前一辆车剩余可选座位可以满足当前的选座需求，则返回false,否则返回true
     * @param aca050 班次ID
     * @return  可用的班次ID
     */
    public static int checkBusSeatAvailable(int aca050,int num){
        boolean flag=Boolean.TRUE;//默认当前车可选
        BusCa05 ca05=ca05Service.dao.findFirst("select * from bus_ca05 where aaa996=? and aca050=?",BusStaticUtil.VALID,aca050);
        if(ValidateKit.isNullOrEmpty(ca05)){
           throw new RuntimeException("当前车次已取消！");
        }else{
            Kv cond=new Kv();
            cond.put("aca051",ca05.getAca051());//发车日期
            cond.put("aba050",ca05.getAba050());//发车时刻
            List<Record> busInfoList=commonService.records(cond,"bus.getCheckBusSeatAvailable");
            if(ValidateKit.isNullOrEmpty(busInfoList)){//返回空集
                throw new RuntimeException("当前车次已取消！");
            }else{
                //1. 如果当前是第一辆车，则直接返回班次号
                if(aca050==busInfoList.get(0).getInt("aca050")){
                    return aca050;
                }
                int busId=0;//车次ID
                int choose=0;//已选座位数
                int total=0;//座位总数
                //2.找到第一辆符合情况的车
                for(int i=0;i<busInfoList.size();i++){
                    busId=busInfoList.get(i).get("aca050");
                    choose=Integer.parseInt(busInfoList.get(i).getStr("choose"));
                    total=Integer.parseInt(busInfoList.get(i).getStr("total"));
                    //TODO 可能的规则调整
                    if(total-choose-num<0){//不符合情况
                        continue;
                    }else{
                        aca050=busId;
                        break;
                    }
                }
            }
        }
        return aca050;
    }

    /**
     * 检查当前人员在 同一路线的同一时刻下是否已经有预约成功的座位
     * @param aca050 班次ID
     * @param aca031 人员id
     * @param type 人员类型
     * @return 返回是否存在当期时刻下其他班车的座位信息
     */
    public static boolean existSeatInfo(@NotNull int aca050,@NotNull String aca031,@NotNull int type){
        boolean b=Boolean.FALSE;//默认没有
        if(ValidateKit.isNullOrEmpty(aca050) || ValidateKit.isNullOrEmpty(aca031) || ValidateKit.isNullOrEmpty(type)){
            throw new RuntimeException("参数缺失！");
        }
        Kv cond=new Kv();
        cond.put("aca050",aca050);
        cond.put("aca031",aca031);
        cond.put("type",type);
        List<Record> seatInfo=commonService.records(cond,"bus.getSeatInfoByLine");
        if(seatInfo!=null && seatInfo.size()>0){
            //表示已存在其他的班车座位
            b=Boolean.TRUE;
        }
        return  b;
    }

    /**
     * 添加校车每月底的锁定次数重置任务
     */
    public static void addBusLockedRefreshTask(){
        new Thread(()->{
            try{
                System.out.println("***************************初始化月底违约次数重置任务 开始***************************");
                SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cld = Calendar.getInstance(Locale.CHINA);
                //设置当月最后一天
                cld.set(Calendar.DAY_OF_MONTH,cld.getActualMaximum(Calendar.DAY_OF_MONTH));
                //当月最后一天的23:55
                String last=ymd.format(cld.getTime())+BusStaticUtil.BATCH_TASK_TIME_1;
                SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //计算首次延时
                long delay=ymdhms.parse(last).getTime()-System.currentTimeMillis();
                if(delay<=0){//表明启动时已经超过了23:55
                    delay=10;
                }
                //2.每隔一天检测当日是否是最后一天
                BusScheduleUtil.getInstance().addTask(() -> {
                    try{
                        Calendar calendar=Calendar.getInstance(Locale.CHINA);
                        calendar.set(Calendar.DAY_OF_MONTH,cld.getActualMaximum(Calendar.DAY_OF_MONTH));
                        String lastDay=ymd.format(calendar.getTime());
                        if(ymd.format(Calendar.getInstance(Locale.CHINA).getTime()).equals(lastDay)){
                            System.out.println("***************************清理违约次数 开始***************************");
                            Db.update("update bus_ca04 set aca049=0");
                            System.out.println("***************************清理违约次数 结束***************************");
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }, delay, 24*60*60*1000, TimeUnit.MILLISECONDS);
                System.out.println("***************************初始化月底违约次数重置任务 结束***************************");
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }

    /**
     * 初始化校车任务调度池
     */
    public static void initBusCheck(){
        new Thread(()->{
            try{
                System.out.println("***************************初始化校车任务调度池 开始***************************");
                List<Record> list=commonService.records("bus.getBusInitTaskList");
                for(Record record:list){
                    if(!ValidateKit.isNullOrEmpty(record)){
                        addCheckTask(record.getInt("aca050"));
                    }
                }
                System.out.println("***************************初始化校车任务调度池 结束***************************");
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }

}
