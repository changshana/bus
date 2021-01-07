package com.mht.bus.service;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.DbKit;
import com.jfinal.plugin.activerecord.DbPro;
import com.jfinal.plugin.activerecord.Record;
import com.mht.bus.util.BusStaticUtil;
import com.mht.common.model.BusCa04;
import com.mht.common.model.BusCa05;
import com.mht.common.service.CommonService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 校车的公共service
 */
public class BusCommonService extends CommonService {
    public static final BusCommonService me=new BusCommonService();
    public static final BusCa04Service ca04Service=new BusCa04Service();
    private static final BusCa03Service busCa03Service=BusCa03Service.me;
    private static final BusCa05Service busCa05Service=BusCa05Service.me;

    //更新校车绑定信息

    /**
     *
     * @param type 更新类型，参照BusStaticUtil类
     * @param ids 需要更新的ID，“,”分割
     * @return 返回处理结果
     */
    public Map updateBindInfo(String type, String ids){
        Map<String,Object> res=new HashMap<>();
        if(BusStaticUtil.BIND_UPDATE_ALL.equals(type)){//全部更新
            //更新绑定表中的全部信息
            res=ca04Service.checkData();
            return res;
        }
        if(BusStaticUtil.BIND_UPDATE_PART.equals(type)){//局部更新信息
            if(ids!=null && ids.length()>0){
                List<BusCa04> ca04List=ca04Service.dao.find("select * from bus_ca04 where FIND_IN_SET(aca040,?)>0",ids);
                Record record=null;
                int success=0,fail=0;
                for(BusCa04 ca04:ca04List){
                    try{
                        record=getOriginPersonInfo(ca04.getAca044(),ca04.getAca041());
                        ca04=assembleInfo(ca04,record);
                        ca04Service.update(ca04);
                        success++;
                    }catch (Exception e){
                        fail++;
                        continue;
                    }
                }
                res.put("flag",Boolean.TRUE);
                res.put("total",success);
                res.put("msg","数据更新完毕！");
            }else{
                res.put("flag",Boolean.TRUE);
                res.put("total",0);
                res.put("msg","数据更新完毕！");
            }
        }
        return res;
    }

    /**
     * 组装信息
     * @param ca04
     * @param info
     * @return
     */
    public BusCa04 assembleInfo(BusCa04 ca04,Record info){
        if(ValidateKit.isNullOrEmpty(info)){//该记录原始信息记录已经不存在了
            ca04.setAaa996(BusStaticUtil.INVALID);
        }else{//更新信息
            switch (ca04.getAca044()){
                case "1"://本科生
                    ca04.setAca041(info.get("account"));
                    ca04.setAca043(info.get("name"));
                    ca04.setAca045(info.get("ZJLXMC"));
                    ca04.setAca046(info.get("idCard"));
                    ca04.setAca048(info.get("SZBH"));
                    ca04.setAaa995(info.get("SJC"));
                    ca04.setAaa996(BusStaticUtil.VALID);
                    break;
                case "2"://研究生
                    ca04.setAca041(info.get("account"));
                    ca04.setAca043(info.get("name"));
                    ca04.setAca045(info.get("ZJLXMC"));
                    ca04.setAca046(info.get("idCard"));
                    ca04.setAca047(info.get("SJ"));
                    ca04.setAca048(info.get("SZNJ"));
                    ca04.setAaa995(info.get("SJC"));
                    ca04.setAaa996(BusStaticUtil.VALID);
                    break;
                case "3"://教职工
                    ca04.setAca041(info.get("account"));
                    ca04.setAca043(info.get("name"));
                    ca04.setAca045(info.get("ZJLXMC"));
                    ca04.setAca046(info.get("idCard"));
                    ca04.setAca047(info.get("SJ"));
                    ca04.setAca048(info.get("DWMC"));
                    ca04.setAaa995(info.get("SJC"));
                    ca04.setAaa996(BusStaticUtil.VALID);
                    break;
                case "4"://驾驶员
                    ca04.setAca041(info.get("account"));
                    ca04.setAca043(info.get("name"));
                    ca04.setAca045(info.get("居民身份证"));
                    ca04.setAca046(info.get("idCard"));
                    ca04.setAca047(info.get("aaa007"));
                    ca04.setAaa995(info.get("aaa998"));
                    ca04.setAaa996(BusStaticUtil.VALID);
                    break;
                case "5"://调度员
                    ca04.setAca041(info.get("account"));
                    ca04.setAca043(info.get("name"));
                    ca04.setAca045(info.get("居民身份证"));
                    ca04.setAca046(info.get("idCard"));
                    ca04.setAca047(info.get("aaa042"));
                    ca04.setAaa995(info.get("aaa998"));
                    ca04.setAaa996(BusStaticUtil.VALID);
                    break;
                case "6"://临时绑定人员
                    ca04.setAca041(info.get("account"));
                    ca04.setAca043(info.get("name"));
                    ca04.setAca045(info.get("居民身份证"));
                    ca04.setAca046(info.get("idCard"));
                    ca04.setAca047(info.get("aca083"));
                    ca04.setAaa995(info.get("aaa998"));
                    ca04.setAaa996(BusStaticUtil.VALID);
                    break;
            }
        }
        return ca04;
    }

    /**
     *
     * @param type 人员类型
     * @param account 账户
     * @param identity 证件号
     * @return 人员信息
     */
    public Record getOriginPersonInfo(String type,String account,String identity){
        Record record=new Record();
        DbPro shareDb= Db.use("share");
        switch (type){
//            case "1"://本科生
//                record=shareDb.findFirst("select XH as account,XM as name,ZJH as idCard,ZJLXMC,SZBH,SJC from t_zhdhq_share_bks_jbxx where XH=? and ZJH=?",account,identity);
//                break;
//            case "2"://研究生
//                record=shareDb.findFirst("select XH as account,XM as name,ZJH as idCard,ZJLXMC,SZNJ,SJC,SJ from t_zhdhq_share_yjs_jbxx where XH=? and ZJH=?",account,identity);
//                break;
//            case "3"://教职工
//                record=shareDb.findFirst("select GH as account,XM as name,ZJH as idCard,ZJLXMC,SJ,DWMC,CLRQ as SJC from t_zhdhq_share_jzg_jbxx where GH=? and ZJH=?",account,identity);
//                break;
            case "4"://驾驶员
                record=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select aaa007 as account,aaa002 as name,aaa004 as idCard,DATE_FORMAT(aaa998,'%Y-%m-%d %H:%i:%s') as aaa998 from bus_aa02 where aaa996=1 and aaa007=? and aaa004=?",account,identity);
                break;
            case "3"://调度员
                record=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select aaa042 as account,aaa041 as name,aaa043 as idCard,DATE_FORMAT(aaa998,'%Y-%m-%d %H:%i:%s') as aaa998 from bus_aa04 where aaa042=? and aaa043=? and aaa996=1",account,identity);
                break;
            case "5"://临时绑定人员
                /*Kv cond=new Kv();
                cond.put("aca081",account);
                cond.put("aca084",identity);
                cond.put("aaa996",1);
                record=record(cond,"bus.getBusCa08List");*/
                record=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select a.aca081 as account,a.aca082 as name,a.aca084 as idCard,a.aca083,DATE_FORMAT(a.aaa998,'%Y-%m-%d %H:%i:%s') as aaa998 from bus_ca08 a where a.aca081=? and a.aca084=? and aaa996=1",account,identity);
                break;
            case "1"://临时人员中的教职工
                /*Kv cond=new Kv();
                cond.put("aca081",account);
                cond.put("aca084",identity);
                cond.put("aaa996",1);
                record=record(cond,"bus.getBusCa08List");*/
                record=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select a.aca081 as account,a.aca082 as name,a.aca084 as idCard,a.aca083,DATE_FORMAT(a.aaa998,'%Y-%m-%d %H:%i:%s') as aaa998 from bus_ca08 a where a.aca081=? and a.aca084=? and aaa996=1",account,identity);
                break;
            case "2"://临时人员中的学生
                /*Kv cond=new Kv();
                cond.put("aca081",account);
                cond.put("aca084",identity);
                cond.put("aaa996",1);
                record=record(cond,"bus.getBusCa08List");*/
                record=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select a.aca081 as account,a.aca082 as name,a.aca084 as idCard,a.aca083,DATE_FORMAT(a.aaa998,'%Y-%m-%d %H:%i:%s') as aaa998 from bus_ca08 a where a.aca081=? and a.aca084=? and aaa996=1",account,identity);
                break;
        }
        Db.use(DbKit.MAIN_CONFIG_NAME);
        return record;
    }

    /**
     *
     * @param type 人员类型
     * @param account 账户
     * @return
     */
    public Record getOriginPersonInfo(String type,String account){
        Record record=new Record();
        DbPro shareDb= Db.use("share");
        switch (type){
            case "1"://本科生
                record=shareDb.findFirst("select XH as account,XM as name,ZJH as idCard,ZJLXMC,SZBH,SJC from t_zhdhq_share_bks_jbxx where XH=?",account);
                break;
            case "2"://研究生
                record=shareDb.findFirst("select XH as account,XM as name,ZJH as idCard,ZJLXMC,SZNJ,SJC,SJ from t_zhdhq_share_yjs_jbxx where XH=?",account);
                break;
            case "3"://教职工
                record=shareDb.findFirst("select GH as account,XM as name,ZJH as idCard,ZJLXMC,SJ,DWMC,CLRQ as SJC from t_zhdhq_share_jzg_jbxx where GH=?",account);
                break;
            case "4"://驾驶员
                record=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select aaa007 as account,aaa002 as name,aaa004 as idCard,DATE_FORMAT(aaa998,'%Y-%m-%d %H:%i:%s') as aaa998 from bus_aa02 where aaa996=1 and aaa007=?",account);
                break;
            case "5"://调度员
                record=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select aaa042 as account,aaa041 as name,aaa043 as idCard,DATE_FORMAT(aaa998,'%Y-%m-%d %H:%i:%s') as aaa998  from bus_aa04 where aaa042=? and aaa996=1",account);
                break;
            case "6"://临时绑定人员
                record=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select a.aca081 as account,a.aca082 as name,a.aca084 as idCard,a.aca083,DATE_FORMAT(a.aaa998,'%Y-%m-%d %H:%i:%s') as aaa998 from bus_ca08 a where a.aca081=? and aaa996=1",account);
                break;
        }
        Db.use(DbKit.MAIN_CONFIG_NAME);
        return record;
    }

    /**
     * 检查车辆状态 若过了发车时间仍然没有人预约座位，那么则取消发车
     * @param aca050
     */

    public void handleBusCheck(Integer aca050){
        try{
            Db.tx(()->{
                synchronized (BusCommonService.class){
                    BusCa05 ca05=busCa05Service.findById(String.valueOf(aca050));
                    if(ValidateKit.isNullOrEmpty(ca05) || ca05.getAca053()==0 || ca05.getAaa996()==BusStaticUtil.INVALID){
                        //不是滚动班次或班次已取消
                        return false;
                    }
                    Kv cond=new Kv();
                    cond.put("aca050",aca050);
                    cond.put("aaa997","自动取消发车！");
                    cond.put("aaa998", new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Calendar.getInstance().getTime()));
                    //1.判断当前车辆的选座总数
                    //查询当前车次预约的座位数，计算后台锁定。 //and aca044!=0
                    Record num=record(new Kv().set("aca050",aca050),"bus.getCa03ChooseNum");
                    if(!ValidateKit.isNullOrEmpty(num) && num.getInt("count")==0){
                        //2.该车无人预约，取消该车
                        if(busCa03Service.cancelBus(cond)){
                            //3.发送短信给调度人员
                            BusStaticUtil.sendCancelBusMsgToDispatcher(aca050);
                        }
                    }
                    return true;
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }catch(Throwable t){
            t.printStackTrace();
        }

    }
}
