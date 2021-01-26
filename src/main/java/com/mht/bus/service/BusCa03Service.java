package com.mht.bus.service;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.bus.exception.BusException;
import com.mht.bus.util.BusStaticUtil;
import com.mht.common.model.*;
import com.mht.common.service.CommonService;
import com.mht.wxPay.MyConfig;
import com.mht.wxPay.WXPay;
import com.mht.wxPay.WXPayConstants;
import com.mht.wxPay.WXPayUtil;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Ranbo
 * 2018/12/19 15:42
 */
public class BusCa03Service extends CommonService {
    public static final BusCa05Service busCa05Service=BusCa05Service.me;
    public static final BusCa03Service me=new BusCa03Service();
    public static final BusCa03 dao=new BusCa03().dao();
    public Page<BusCa03> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `bus_ca03`");
    }
    public BusCa03 findById(String id){
        return dao.findById(id);
    }
    private int save(BusCa03 busCa03){
        synchronized (BusCa03Service.class){
            BusCa03 busCa03_1=dao.findFirst("select * from bus_ca03 where aba032=? and aba041=? and aca050=? and aaa996=? ",busCa03.getAba032(),busCa03.getAba041(),busCa03.getAca050(),BusStaticUtil.VALID);
            if(ValidateKit.isNullOrEmpty(busCa03_1)){
                busCa03.save();
                return busCa03.getAca030();
            }else{
                return 0;
            }
        }
    }

    /**
     * 选座
     * @param aca050 班次ID
     * @param aba032 日期
     * @param type 人员类型
     * @param aba041 座位号，多个用","隔开
     * @param price 车票单价
     * @param sysUser 用户信息（管理后台锁定座位时用）
     * @param ca04 绑定人员信息
     * @return
     */
    public Map chooseSeat(String aca050, Date aba032, int type, String aba041, int price,SysUser sysUser,BusCa04 ca04){
        Map res=new HashMap();
        boolean flag=Db.tx(()->{
            String[] seatArray = aba041.split(",");
            StringBuffer chooseId=new StringBuffer();
            for (String seatNo : seatArray) {
                //组装信息
                BusCa03 busCa03 = new BusCa03();
                if(!ValidateKit.isNullOrEmpty(ca04)){
                    busCa03.setAca031(ca04.getAca041());
                }
                busCa03.setAca050(Integer.parseInt(aca050));
                busCa03.setAba041(Integer.parseInt(seatNo));
                busCa03.setAba032(aba032);
                busCa03.setAca044(type);//人员类型
                if (type==0) {//后台锁定座位
                    busCa03.setAaa996(1);//数据有效
                    busCa03.setAca035(BusStaticUtil.PAY_STATE_NO_REQUIRED);//不需要支付
                    if(!ValidateKit.isNullOrEmpty(sysUser)){
                        busCa03.setAaa997(sysUser.getUserName());
                    }
                    busCa03.setAaa999("管理员锁定座位");
                    busCa03.setAca036(BusStaticUtil.BUS_AA99_ACA036_1);
                }else{//选座
                    if(price>0){//需要付款
                        busCa03.setAca035(BusStaticUtil.PAY_STATE_UNPAID);//未支付
                        //总价
                        res.put("totalPrice",price*seatArray.length);
                    }else{
                        busCa03.setAca035(BusStaticUtil.PAY_STATE_NO_REQUIRED);//不需要支付
                    }
                    busCa03.setAaa996(1);//数据有效
                    busCa03.setAaa997(ca04.getAca043());
                    if(type==3) {//教职工选座 或者 临时人员
                        busCa03.setAaa999("教职工选座");
                    }else if(type==6){
                        busCa03.setAaa999("临时人员选座");
                    }else if(type==1 || type==2){//学生选座
                        busCa03.setAaa999("学生选座");
                    }
                    busCa03.setAca036(BusStaticUtil.BUS_AA99_ACA036_0);
                }
                busCa03.setAaa998(Calendar.getInstance().getTime());
                int aca030 =save(busCa03);
                if (aca030==0) {//表示该座位已被别人选择
                    res.put("msg",seatNo+"号座位已经被其他人选择，请刷新后重试！");
                    return false;
                }else{
                    //组装选座ID aca030
                    chooseId.append(aca030).append(",");
                }
            }
            res.put("chooseId",chooseId.toString());
            res.put("msg","操作成功!");
            return true;
        });
        res.put("flag",flag);
        return res;
    }

    /**
     * 下单后更新选座信息
     * @param chooseId 选座表IDs ，“,”分隔
     * @param tradeNo  内部交易单号 out_trade_no
     * @param flag     下单结果标志 false 失败 true 成功
     */
    public void updateOutTradeNo(String chooseId,String tradeNo,boolean flag){
        if(!ValidateKit.isNullOrEmpty(chooseId)){
            for(String aca030:chooseId.split(",")){
                if(flag){
                    Db.update("update bus_ca03 set out_trade_no=? where aca030 =?",tradeNo,aca030);
                }else{
                    Db.update("delete from bus_ca03 where aca030 =?",aca030);
                }

            }
        }
    }

    /**
     * 删除选座信息
     * @param chooseIds 选座表IDs ，“,”分隔
     */
    public void deleteCa03ByIds(String chooseIds){
        if(!ValidateKit.isNullOrEmpty(chooseIds)){
            for(String aca030:chooseIds.split(",")){
                Db.update("delete from bus_ca03 where aca030 =?",aca030);
            }
        }
    }

    /**
     * 取消座位
     * @param aba041Str
     * @param aca050
     */
    public String cancelChooseSeat(String aba041Str,String aca050,String aca031){
        String[] aba041Arr=aba041Str.split(",");
        String msg="";
        for(String aba041:aba041Arr){
            BusCa03 busCa03=dao.findFirst("select * from bus_ca03 where aba041=? and aca050=?",aba041,aca050);
            if(ValidateKit.isNullOrEmpty(busCa03)){
                msg=msg+"【"+aba041+"】号座位已取消，无需重复取消！<br/>";
            }else{
                if(!ValidateKit.isNullOrEmpty(aca031)){//退款
                    boolean b=refund(busCa03.getOutTradeNo(),BusStaticUtil.REFUND_STU);
                    msg=msg+"【"+aba041+"】号座位已取消成功！<br/>";
                }
                dao.deleteById(busCa03.getAca030());
            }
        }

        return msg;
    }

    /**
     * 取消发车
     * @param cond
     */
    public boolean cancelBus(Kv cond){
        return Db.tx(()->{
            //1.检查车辆信息是否已被取消
            BusCa05 ca05=busCa05Service.findById(cond.getStr("aca050"));
            if(ValidateKit.isNullOrEmpty(ca05) || ca05.getAaa996()==BusStaticUtil.INVALID){
                //表示该车已取消
                return false;
            }
            //2.退款
            SqlPara sqlPara=dao.getSqlPara("bus.getCa03ListForCancel",cond);
            List<BusCa03> ca03List=dao.find(sqlPara);
            for(BusCa03 ca03:ca03List){
                //判断该乘客是否已付款
                if(ca03.getAaa996()==1 && ca03.getAca035()!=0 && ca03.getAca035()!=2 && ca03.getAca035()!=4){
                    //退款
                    boolean b=refund(ca03.getOutTradeNo(),BusStaticUtil.REFUND_CANCEL_BUS);
                }
            }
            //3.选座信息置为无效
            cond.put("aaa996",BusStaticUtil.INVALID);//无效
            cond.put("aca035",BusStaticUtil.PAY_STATE_REFUND_ALL);//已退款
            cond.put("aaa999",BusStaticUtil.REFUND_CANCEL_BUS);
            updateSql("bus.cancelBus",cond);
            //4.车次置为无效
            BusCa05 busCa05=busCa05Service.findById(cond.getStr("aca050"));
            if(!ValidateKit.isNullOrEmpty(busCa05)){
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                BusStaticUtil.sendMsgToDriver(String.valueOf(busCa05.getAaa020()),String.valueOf(busCa05.getAba050()),sdf.format(busCa05.getAca051()),BusStaticUtil.MSG_TYPE_CANCEL);
            }
            updateSql("bus.updateBusCa05",cond);
            return true;
        });
    }

    public static final BusPayinfoService payinfoService=BusPayinfoService.me;

    /**
     * 退款
     * @param out_trade_no
     * @param refund_desc
     * @return
     */
    private boolean refund(String out_trade_no,String refund_desc){
        boolean flag=Boolean.TRUE;
        try{
            BusPayinfo payinfo=BusPayinfo.dao.findFirst("select * from bus_payinfo where out_trade_no=?",out_trade_no);
            if(!ValidateKit.isNullOrEmpty(payinfo)){
                int price=payinfo.getPrice().intValue();
                int totalFee=payinfo.getFee().intValue();
                int refund_fee=payinfo.getRefundFee()==null?0:payinfo.getRefundFee().intValue();
                String feeType=payinfo.getFeeType();
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
                reqData.put("total_fee",String.valueOf(totalFee));
                reqData.put("refund_fee",String.valueOf(price));
                reqData.put("refund_fee_type",feeType);
                reqData.put("refund_desc", refund_desc);
                reqData.put("notify_url","");
                Map<String,String> res=wxpay.refund(reqData);
                if(BusStaticUtil.SUCCESS.equals(res.get("return_code"))){
                    if(BusStaticUtil.SUCCESS.equals(res.get("result_code"))){//退款成功
                        flag=Boolean.TRUE;
                        if(totalFee-price-refund_fee==0){
                            payinfo.setPayState(BusStaticUtil.PAY_STATE_REFUND_ALL);//已退完
                        }else{
                            payinfo.setPayState(BusStaticUtil.PAY_STATE_REFUND_PART);//部分退款
                        }
                        payinfo.setOutRefundNo(res.get("out_refund_no"));
                        payinfo.setRefundFee(new BigDecimal(refund_fee+price));
                        payinfo.setRefundFeeType(feeType);
                        payinfo.setRemark(payinfo.getRemark()+refund_desc+":￥"+price/100.0+"元；<br/>");
                        payinfoService.update(payinfo);
                        //res.get("return_msg")
                    }else if(BusStaticUtil.RESULT_FAIL.equals(res.get("result_code"))){//退款失败
                        flag=Boolean.FALSE;
                        //res.get("return_msg")
                    }
                }else{

                }
            }else{
                flag=Boolean.FALSE;
            }
        }catch (Exception e){
            e.printStackTrace();
            flag=Boolean.FALSE;
        }
        return flag;
    }

    public void update(BusCa03 busCa03){
        busCa03.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
    public void deleteBatch(String ids){
        if(!ValidateKit.isNullOrEmpty(ids)){
            for(String id:ids.split(",")){
                if(!ValidateKit.isNullOrEmpty(id)){
                     delete(id);
                }
            }
        }
    }
    public void evaluate(String aca030,int aca032,int aca033,String aca034){
        BusCa03 busCa03=dao.findById(aca030);
        busCa03.setAca032(aca032);
        busCa03.setAca033(aca033);
        busCa03.setAca034(aca034);
        busCa03.update();
    }

    /**
     * 处理小程序发起的支付回调
     * @param out_trade_no
     * @param flag
     * @return
     */
    public String handelPay(String out_trade_no,String flag){
        String msg="";
        if("1".equals(flag)){//支付成功
            Db.update("update bus_ca03 set aca035=? where out_trade_no=?",BusStaticUtil.PAY_STATE_PAID,out_trade_no);
            msg="订单已支付！";
        }else if("0".equals(flag)){
            Db.update("delete from bus_ca03 where aca035=? and out_trade_no=?",BusStaticUtil.PAY_STATE_UNPAID,out_trade_no);
            msg="订单支付失败，已取消！";
        }
        return msg;
    }

    public Page<BusCa03> paginate1(int pageNumber, int pageSize, Kv cond) {
        SqlPara sqlPara = Db.getSqlPara("bus.getBusCa03List", cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
}