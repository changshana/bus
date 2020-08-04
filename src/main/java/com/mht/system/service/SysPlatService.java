package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.SysPlat;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/5/2.
 */
public class SysPlatService extends CommonService {
    public static final SysPlatService me=new SysPlatService();
    public static final SysPlat dao=new SysPlat().dao();
    public Page<SysPlat> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "FROM `sys_plat`");
    }
    public List<SysPlat> getSysplatList(){
        return dao.find("select * from sys_plat");
    }
    public SysPlat findById(String id){
        return dao.findById(id);
    }
    public void save(SysPlat sysPlat){
        sysPlat.save();
    }
    public void update(SysPlat sysPlat){
        sysPlat.update();
    }
    public void delete(String id){
        Db.update("delete from `sys_plat` where plat_id="+id);
    }

    public List getSysplatByName(String plat_name,String plat_id) {
        if(plat_id.isEmpty()){
            return dao.find("select * from sys_plat where plat_name='"+plat_name+"'");
        }else{
            return dao.find("select * from sys_plat where plat_name='"+plat_name+"' and plat_id!="+plat_id);
        }
    }

    public List getSysplatById(String plat_id) {
        if(plat_id.isEmpty()){
            return dao.find("select * from sys_plat where status=1");
        }else{
            return dao.find("select * from sys_plat where status=1 and plat_id !="+plat_id);
        }
    }
    public List getUserOtherSysplatById(String plat_id,String plat_ids) {
        return dao.find("select * from sys_plat where status=1 and FIND_IN_SET(plat_id,'"+plat_ids+"')>0 and plat_id!="+plat_id);
    }
    public List<SysPlat> getUserSysplatByUserId(String user_id) {
        return dao.find("select * from sys_plat where status=1 and FIND_IN_SET(plat_id,(select plat_ids from sys_user where user_id="+user_id+"))");
    }

    public List getAllSysplat(){
        SqlPara sqlPara = Db.getSqlPara("system.findAllPlatMsg");
        return Db.find(sqlPara);
    }

}
