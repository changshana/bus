package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.model.SysPerm;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SysPermService extends CommonService {

    public static final SysPermService me=new SysPermService();

    public static final SysPerm permDao=new SysPerm().dao();

    public Page<SysPerm> paginate(int pageNumber, int pageSize) {
        return permDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_perm` order by perm_id desc");
    }
    public Page<SysPerm> paginate(int pageNumber, int pageSize,String moduleId) {
        if("".equals(moduleId)){
            return  paginate(pageNumber,pageSize);
        }else{
            return permDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_perm` where module_id="+moduleId+" order by perm_id desc");
        }
    }
    public Page paginate(int pageNumber, int pageSize,String moduleId,String userId,String roleId) {
        if("".equals(moduleId)){
            return null;
        }
        if(!"".equals(userId)){
            return permDao.paginate(pageNumber, pageSize, "select m.*,(select perm_value from sys_user_perm where perm_id=m.perm_id and user_id="+userId+") as user_perm_value", "FROM `sys_perm` m,`sys_module` n where m.module_id=n.module_id and n.status=1 and m.module_id="+moduleId+" order by m.perm_id");
        }
        if(!"".equals(roleId)){
            return permDao.paginate(pageNumber, pageSize, "select m.*,(select perm_value from sys_role_perm where perm_id=m.perm_id and role_id="+roleId+") as user_perm_value", "FROM `sys_perm` m,`sys_module` n where m.module_id=n.module_id and n.status=1 and  m.module_id="+moduleId+" order by m.perm_id");
        }
        return paginate(pageNumber,pageSize,moduleId);
    }
    public List getPermList(String moduleId,String userId,String roleId) {
        if("".equals(moduleId)){
            return null;
        }
        if(!"".equals(userId)){
            return permDao.find("select m.*,(select perm_value from sys_user_perm where perm_id=m.perm_id and user_id="+userId+") as user_perm_value FROM `sys_perm` m,`sys_module` n where m.module_id=n.module_id and n.status=1 and m.module_id="+moduleId+" order by m.perm_id");
        }
        if(!"".equals(roleId)){
            return permDao.find("select m.*,(select perm_value from sys_role_perm where perm_id=m.perm_id and role_id="+roleId+") as user_perm_value FROM `sys_perm` m,`sys_module` n where m.module_id=n.module_id and n.status=1 and  m.module_id="+moduleId+" order by m.perm_id");
        }
        return permDao.find("select * FROM `sys_perm` order by perm_id desc");
    }

    public Record findById(int id) {
        List<Record> sysPerms=Db.find("select m.*,m.perm_value&1 as perm_value_1,m.perm_value&2 as perm_value_2,m.perm_value&4 as perm_value_4,m.perm_value&8 as perm_value_8,m.perm_value&16 as perm_value_16,m.perm_value&32 as perm_value_32 from sys_perm m where m.perm_id="+id+" limit 1");
        if (sysPerms.size() == 0) {
            return new Record();
        }
        return sysPerms.get(0);
    }
    public List<SysPerm> findByModuleId(int id) {
        List<SysPerm> sysPerms=permDao.find("select m.* from sys_perm m,sys_module n where n.status=1 and m.module_id=n.module_id and m.module_id="+id);
        return sysPerms;
    }

    public void deleteById(int id) {
        permDao.deleteById(id);
    }


    public SysPerm findOne() {
        List<SysPerm> sysPerms = permDao.find("select * from sys_perm limit 1");
        if (sysPerms.size() == 0) {
            return new SysPerm();
        }
        return sysPerms.get(0);
    }

    /**
     * 保存
     */
    public void save(SysPerm sysPerm) {
        sysPerm.save();
    }

    /**
     * 更新
     */
    public void update(SysPerm sysPerm) {
        sysPerm.update();
    }


    /**
     * 删除
     */
    public void delete(int permId) {
        Db.update("delete from sys_perm where perm_id=?", permId);
    }


    public void addPermToModule(String module_id) {
        List<Record> records = Db.find("select perm_id from sys_perm where module_id=" + module_id);
        if(records.size()==0){
            Record sys_module = Db.findById("sys_module","module_id", module_id);
            SysPerm sysPerm=new SysPerm();
            sysPerm.setModuleId(Integer.parseInt(module_id));
            sysPerm.setPermName(sys_module.getStr("module_name"));
            sysPerm.setPermCode(sys_module.getStr("module_code"));
            sysPerm.setPermValue(63);
            sysPerm.save();
        }
    }
}
