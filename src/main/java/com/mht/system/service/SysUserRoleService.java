package com.mht.system.service;


import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.model.SysUserRole;
import com.mht.common.service.CommonService;

/**
 * @author liuxlh ， 2018/3/30.
 */
public class SysUserRoleService extends CommonService {
    public static final SysUserRoleService me=new SysUserRoleService();

    public static final SysUserRole userRoleDao=new SysUserRole().dao();

    public Page<SysUserRole> paginate(int pageNumber, int pageSize, String search_param) {
        if("".equals(search_param)){
            return  paginate(pageNumber,pageSize);
        }else{
            return userRoleDao.paginate(pageNumber, pageSize, "select *", " FROM `sys_user_role` where role_name like '%"+search_param+"%'");
        }
    }
    public Page<SysUserRole> paginate(int pageNumber, int pageSize) {
        return userRoleDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_user_role` ");
    }
    public Page<SysUserRole> paginateByUserId(int pageNumber, int pageSize, String user_id,String plat_id) {
        if("".equals(user_id)){
            return  paginate(pageNumber,pageSize,"select * FROM `sys_user_role` where plat_id="+plat_id);
        }else{
            return userRoleDao.paginate(pageNumber, pageSize,
                    "select role_id, role_name,role_code,(select count(1) from sys_role m,sys_role_perm o,sys_perm p,sys_module q  " +
                            "where m.role_id=a.role_id and m.role_id=o.role_id and o.perm_id=p.perm_id and p.module_id=q.module_id) as role_perm_count",
                    " from sys_role a where a.plat_id="+plat_id);
        }
    }
    public List getListByUserId(String user_id) {
        if("".equals(user_id)){
            return userRoleDao.find("select * FROM `sys_user_role` ");
        }else{
            return userRoleDao.find("select role_id, role_name,role_code,(select count(1) from sys_role m,sys_role_perm o,sys_perm p,sys_module q  " +
                            "where m.role_id=a.role_id and m.role_id=o.role_id and o.perm_id=p.perm_id and p.module_id=q.module_id) as role_perm_count"+
                    " from sys_role a");
        }
    }
    public List getListByUserId(String user_id,String plat_id) {
            if("".equals(user_id)){
                return userRoleDao.find("select * FROM `sys_user_role` where plat_id="+plat_id);
            }else{
                return userRoleDao.find("select role_id, role_name,role_code,(select count(1) from sys_role m,sys_role_perm o,sys_perm p,sys_module q  " +
                                "where m.role_id=a.role_id and m.role_id=o.role_id and o.perm_id=p.perm_id and p.module_id=q.module_id) as role_perm_count"+
                        " from sys_role a where a.plat_id="+plat_id);
            }
        }


    public String findUserCheckedRoleIds(String userId){
        List<Record> records = Db.find("select GROUP_CONCAT(role_id SEPARATOR ',') as role_ids from sys_user_role where user_id= " + userId);
        return records.get(0).getStr("role_ids");
    }
    public String findRoleUsers(String roleId){
        List<Record> records = Db.find("select GROUP_CONCAT(a.user_id SEPARATOR ',') as user_ids from sys_user_role a,sys_user b where b.status=1 and a.user_id=b.user_id and a.role_id= " + roleId);
        return records.get(0).getStr("user_ids");
    }

    /**
     * 保存
     */
    public void save(SysUserRole sysUserRole) {
        sysUserRole.save();
    }
    public void saveUserRole(SysUserRole sysUserRole) {
        if(Db.find("select user_role_id from sys_user_role where user_id="+sysUserRole.getUserId()+" and role_id="+sysUserRole.getRoleId()).size()<1){
            sysUserRole.save();
        }
    }

    public List findRoleByUserId(String user_id){
       List list= Db.find("select * from sys_role where role_id in(select role_id from sys_user_role where user_id=?)",user_id);
       return list;
    }

    public List findUserByRoleId(String role_id){
       List list= userRoleDao.find("select m.user_id from sys_user m,sys_user_role n where m.user_id=n.user_id and m.status=1 and n.role_id=?",role_id);
       return list;
    }
    /**
     * 取消用户角色
     */
    public void update(SysUserRole sysUserRole) {
        Db.update("delete from sys_user_role where user_id=? and role_id=?",sysUserRole.getUserId(),sysUserRole.getRoleId());
    }
}
