package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.model.SysRole;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SysRoleService extends CommonService {

    public static final SysRoleService me=new SysRoleService();

    public static final SysRole roleDao=new SysRole().dao();


    public Page<SysRole> paginate(int pageNumber, int pageSize) {
        return roleDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_role` ");
    }
    public Page<SysRole> paginate(int pageNumber, int pageSize,String search_param) {
        if("".equals(search_param)){
            return  roleDao.paginate(pageNumber, pageSize, "select a.*, (select count(1) as num from sys_user_role m,sys_user n where n.status=1 and m.user_id=n.user_id and  m.role_id=a.role_id) as user_count," +
                            " (select count(1) from sys_role_perm c,sys_perm d,sys_module e where c.role_id=a.role_id and c.perm_id=d.perm_id and d.module_id=e.module_id and e.status=1 and c.perm_value>0) as perm_count ",
                    " FROM sys_role a order by a.order_code");
        }else{
            return roleDao.paginate(pageNumber, pageSize, "select a.*, (select count(1) as num from sys_user_role m,sys_user n where n.status=1 and m.user_id=n.user_id and  m.role_id=a.role_id) as user_count," +
                            " (select count(1) from sys_role_perm c,sys_perm d,sys_module e where c.role_id=a.role_id and c.perm_id=d.perm_id and d.module_id=e.module_id and e.status=1 and c.perm_value>0) as perm_count ",
                    " FROM sys_role a where a.role_name like '%"+search_param+"%' order by a.order_code");
        }
    }
    public Page<SysRole> paginate(int pageNumber, int pageSize,String search_param,String plat_id) {
        if("".equals(search_param)){
            return  roleDao.paginate(pageNumber, pageSize, "select a.*, (select count(1) as num from sys_user_role m,sys_user n where n.status=1 and m.user_id=n.user_id and  m.role_id=a.role_id) as user_count," +
                            " (select count(1) from sys_role_perm c,sys_perm d,sys_module e where c.role_id=a.role_id and c.perm_id=d.perm_id and d.module_id=e.module_id and e.status=1 and c.perm_value>0) as perm_count ",
                    " FROM sys_role a where a.plat_id="+plat_id+" order by a.order_code");
        }else{
            return roleDao.paginate(pageNumber, pageSize, "select a.*, (select count(1) as num from sys_user_role m,sys_user n where n.status=1 and m.user_id=n.user_id and  m.role_id=a.role_id) as user_count," +
                            " (select count(1) from sys_role_perm c,sys_perm d,sys_module e where c.role_id=a.role_id and c.perm_id=d.perm_id and d.module_id=e.module_id and e.status=1 and c.perm_value>0) as perm_count ",
                    " FROM sys_role a where a.role_name like '%"+search_param+"%' and a.plat_id="+plat_id+" order by a.order_code");
        }
    }

    public SysRole findById(int id) {
        return roleDao.findById(id);
    }

    public void deleteById(int id) {
        roleDao.deleteById(id);
    }


    public SysRole findOne() {
        List<SysRole> sysRoles = roleDao.find("select * from sys_role limit 1");
        if (sysRoles.size() == 0) {
            return new SysRole();
        }
        return sysRoles.get(0);
    }

    public void updateOrderCode(Integer roleId,Integer orderCode){
        Db.update("update sys_role set order_code="+orderCode+" where role_id="+roleId);
    }

    public Record findMaxOrderCode(){
        return Db.find("select max(order_code) as max_order_code from sys_role").get(0);
    }

    /**
     * 保存
     */
    public void save(SysRole sysRole) {
        sysRole.save();
    }

    /**
     * 更新
     */
    public void update(SysRole sysRole) {
        sysRole.update();
    }


    /**
     * 删除
     */
    public void delete(int roleId) {
        Db.update("delete from sys_role where role_id=?", roleId);
    }



}
