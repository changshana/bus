package com.mht.bus.service;

import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.BusBa04;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/12/18.
 */
public class BusBa04Service extends CommonService {
    public static final BusBa04Service me=new BusBa04Service();
    public static final BusBa04 dao=new BusBa04().dao();
    public Page<BusBa04> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `bus_ba04`");
    }
    public BusBa04 findById(String id){
        return dao.findById(id);
    }
    public void save(BusBa04 busBa04){
        busBa04.save();
    }
    public void update(BusBa04 busBa04){
        busBa04.update();
    }
    public void delete(String id){
        dao.deleteById(id);
    }

    public void saveBusSeatPlan(Kv cond){
        JSONArray seatPointsArr=new JSONObject(cond).getJSONArray("seatPoints");
        BusBa04 busBa04=new BusBa04();
        Db.update(Db.getSqlPara("bus.deleteBusSeatPlan",cond));
        for (int i=0;i<seatPointsArr.size();i++){
            busBa04.put((Map)seatPointsArr.get(i));
            busBa04.setAba020(Integer.valueOf(cond.getStr("aba020")));
//            busBa04.setAba041(Integer.valueOf(((Map)seatPointsArr.get(i)).get("aba041").toString()));
//            busBa04.setAba042(((Map)seatPointsArr.get(i)).get("aba042").toString());
//            busBa04.setAba043(((Map)seatPointsArr.get(i)).get("aba043").toString());
            busBa04.setAba044("1");//座位状态-空位
            busBa04.setAaa996(1);
            busBa04.setAaa997(cond.getStr("aaa997"));
            busBa04.setAaa998(cond.getAs("aaa998"));
            busBa04.save();
            busBa04.setAba040(null);
        }

    }
}
