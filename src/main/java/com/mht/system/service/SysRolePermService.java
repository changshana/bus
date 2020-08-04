package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.SysRolePerm;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SysRolePermService extends CommonService {

    public static final SysRolePermService me=new SysRolePermService();

    public static final SysRolePerm rolePermDao=new SysRolePerm().dao();


    public Page<SysRolePerm> paginate(int pageNumber, int pageSize,String role_id) {
        return rolePermDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_role_perm` where role_id="+role_id);
    }

    public SysRolePerm findById(int id) {
        return rolePermDao.findById(id);
    }

    public void deleteById(int id) {
        rolePermDao.deleteById(id);
    }


    public SysRolePerm findOne() {
        List<SysRolePerm> sysPerms = rolePermDao.find("select * from sys_role_perm limit 1");
        if (sysPerms.size() == 0) {
            return new SysRolePerm();
        }
        return sysPerms.get(0);
    }
    public SysRolePerm findByRoleIdAndPermId(int roleId,long permId) {
        List<SysRolePerm> sysPerms = rolePermDao.find("select * from sys_role_perm where role_id="+roleId+" and perm_id="+permId);
        if (sysPerms.size() == 0) {
            return new SysRolePerm();
        }
        return sysPerms.get(0);
    }


    /**
     * 保存
     */
    public void save(SysRolePerm sysPerm) {
        sysPerm.save();
    }

    /**
     * 更新
     */
    public void update(SysRolePerm sysPerm) {
        sysPerm.update();
    }


    /**
     * 删除
     */
    public void delete(int rolePermId) {
        Db.update("delete from sys_role_perm where role_perm_id=?", rolePermId);
    }



}
