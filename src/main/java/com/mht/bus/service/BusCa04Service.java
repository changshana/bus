package com.mht.bus.service;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.*;
import com.mht.common.model.BusCa04;
import com.mht.common.service.CommonService;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther Ranbo
 * 2019/3/18 15:31
 */
public class BusCa04Service extends CommonService {
    public static final BusCa04Service me=new BusCa04Service();
    public static final BusCommonService busCommonService=BusCommonService.me;
    public static final BusCa04 dao=new BusCa04().dao();
    public final static int PER=3000;
    public Page<BusCa04> paginate(int pageNumber, int pageSize,Kv cond) {
        SqlPara sqlPara=dao.getSqlPara("bus.getCa04List",cond);
        return dao.paginate(pageNumber, pageSize, sqlPara);
    }
    public BusCa04 findById(String id){
        return dao.findById(id);
    }
    public void save(BusCa04 busCa04){
        busCa04.save();
    }
    public void update(BusCa04 busCa04){
        busCa04.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }
    public BusCa04 getBusCa04ByAca042(String aca042){
        BusCa04 ca04=dao.findFirst("select * from bus_ca04 where aca042=? and aaa996=1 order by aca040 desc",aca042);
        return ca04;
    }

    public BusCa04 getBusCa04ByAca041(String aca041,String aca044){
        BusCa04 ca04=dao.findFirst("select * from bus_ca04 where aca041=? and aca044=? and aaa996=1 order by aca040 desc",aca041,aca044);
        return ca04;
    }

    /**
     * 微信绑定无效数据清理
     * @return
     */
    public Map checkData(){
        Map res=new HashMap();
        ExecutorService service=null;
        try{
            //查询数据
            Db.update("delete from bus_ca04 where aaa996!=1");
            Record record= Db.findFirst("select count(*) as total from bus_ca04");
            int total=Integer.valueOf(record.getStr("total"));
            int num=total/PER+(total%PER==0?0:1);
            CountDownLatch latch=new CountDownLatch(num);
            service= Executors.newFixedThreadPool(num);
            System.out.println("开始数据清洗...");
            for(int i=0;i<num;i++){
                final int start=i*PER;
                service.submit(()->{
                    try{
                        System.out.println("线程"+Thread.currentThread().getName()+"正在执行..."+start+","+PER);
                        List<BusCa04> dataList=dao.find("select * from bus_ca04 limit ?,?",start,PER);
                        if(!ValidateKit.isNullOrEmpty(dataList) && dataList.size()>0){
                            //进行处理
                            Record data=null;
                            for(BusCa04 ca04:dataList){
                            /*DbPro shareDb=Db.use("share");
                            String type=ca04.getAca044();
                            Record data=null;
                            boolean flag=true;
                            switch (type){
                                case "1"://本科生
                                    data=shareDb.findFirst("select XH as account,XM as name,ZJH as idCard from t_zhdhq_share_bks_jbxx where XH=?",ca04.getAca041());
                                    break;
                                case "2"://研究生
                                    data=shareDb.findFirst("select XH as account,XM as name,ZJH as idCard from t_zhdhq_share_yjs_jbxx where XH=?",ca04.getAca041());
                                    break;
                                case "3"://教职工
                                    data=shareDb.findFirst("select GH as account,XM as name,ZJH as idCard from t_zhdhq_share_jzg_jbxx where GH=?",ca04.getAca041());
                                    break;
                                case "4"://驾驶员
                                    flag=false;
                                    //data=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select aaa007 as account,aaa002 as name,aaa004 as idCard from bus_aa02 where aaa007=?",ca04.getAca041());
                                    break;
                                case "5"://调度员
                                    flag=false;
                                    //data=Db.use(DbKit.MAIN_CONFIG_NAME).findFirst("select aaa042 as account,aaa041 as name,aaa043 as idCard from bus_aa04 where aaa042=? and aaa996=1",ca04.getAca041());
                                    break;

                            }
                            if(ValidateKit.isNullOrEmpty(data) && flag){
                                //未查询到与绑定信息对应的人员信息，删除此失效绑定信息
                                ca04.setAaa996(0);
                                ca04.update();
                            }*/
                                data=busCommonService.getOriginPersonInfo(ca04.getAca044(),ca04.getAca041());
                                ca04=busCommonService.assembleInfo(ca04,data);
                                update(ca04);
                            }
                        }
                        System.out.println("线程"+Thread.currentThread().getName()+"执行完毕...");
                        latch.countDown();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                });
            }
            System.out.println("正在等待数据清洗完毕...");
            latch.await();
            System.out.println("数据清洗完毕。");
            Db.update("delete from bus_ca04 where aaa996!=1");
            res.put("flag",Boolean.TRUE);
            res.put("total",total);
            res.put("msg","数据清理完毕！");
        }catch (Exception e){
            res.put("flag",Boolean.FALSE);
            res.put("msg","部分数据清理失败，请稍后重试！");
            e.printStackTrace();
        }finally {
            if(service!=null){
                System.out.println("停止数据清洗线程池");
                service.shutdown();
            }
        }
        return res;
    }

    public BusCa04 findByOpenId(String openid) {
        BusCa04 busCa04 = dao.findById(openid);
        return busCa04;
    }
//        BusCa04 ca04=dao.findFirst("select * from bus_ca04 where aca042=? and aaa996=1 order by aca040 desc",aca042);
    public BusCa04 findByOpenId1(String aca042) {
        BusCa04 ca04 = dao.findFirst("select * from bus_ca04 where aca042=? and aaa996=1",aca042);
        return ca04;
    }


}
