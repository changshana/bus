package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.model.SysModule;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SysModuleService extends CommonService {

    public static final SysModuleService me=new SysModuleService();

    public static final SysModule moduleDao=new SysModule().dao();


    public Page<SysModule> paginate(int pageNumber, int pageSize,String parent_module_id,String status) {
        String filter="";
        if(!"".equals(status)){
            filter+=" and status="+status;
        }
        if("".equals(parent_module_id)){
            return moduleDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_module` where parent_module_id is null "+filter+" order by order_code,module_id");
        }else{
            return moduleDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_module` where parent_module_id="+parent_module_id+filter+" order by order_code,module_id");
        }

    }
    public List getModuleList(String parent_module_id,String status) {
        String filter="";
        if(!"".equals(status)){
            filter+=" and a.status="+status;
        }
        if("".equals(parent_module_id)){
            return moduleDao.find("select a.* ,(select count(1) from sys_perm where module_id=a.module_id) as perm_count FROM `sys_module` a where a.parent_module_id is null "+filter+" order by a.order_code,a.module_id");
        }else{
            return moduleDao.find("select a.* ,(select count(1) from sys_perm where module_id=a.module_id) as perm_count FROM `sys_module` a where a.parent_module_id="+parent_module_id+filter+" order by a.order_code,a.module_id");
        }

    }
    public List getModuleList(String parent_module_id,String status,String plat_id) {
        String filter="";
        if(!"".equals(status)){
            filter+=" and status="+status;
        }
        if("".equals(parent_module_id)){
            return moduleDao.find("select * FROM `sys_module`  where parent_module_id is null "+filter+" and plat_id="+plat_id+" order by order_code,module_id");
        }else{
            return moduleDao.find("select * FROM `sys_module`  where parent_module_id="+parent_module_id+filter+" order by order_code,module_id");
        }
    }

    public List findChildModuleByParentId(String module_id){
        List list= moduleDao.find("select module_id from sys_module where parent_module_id=?",module_id);
        return list;
    }

    public SysModule findById(int id) {
        return moduleDao.findById(id);
    }
    public Record findMaxOrderCode() {
        return Db.find("select max(order_code) as max_order_code from sys_module").get(0);
    }

    public void deleteById(int id) {
        moduleDao.deleteById(id);
    }


    public SysModule findOne() {
        List<SysModule> sysModules = moduleDao.find("select * from sys_module limit 1");
        if (sysModules.size() == 0) {
            return new SysModule();
        }
        return sysModules.get(0);
    }

    /**
     * 保存
     */
    public void save(SysModule sysModule) {
        sysModule.save();
    }

    /**
     * 更新
     */
    public void update(SysModule sysModule) {
        sysModule.update();
    }

    public void updateOrderCode(Integer moduleId,Integer orderCode){
        Db.update("update sys_module set order_code="+orderCode+" where module_id="+moduleId);
    }

    /**
     * 删除
     */
    public void delete(int moduleId) {
        Db.update("delete from sys_module where module_id=? or parent_module_id=?", moduleId,moduleId);
    }


}
