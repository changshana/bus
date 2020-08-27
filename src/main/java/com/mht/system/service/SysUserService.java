package com.mht.system.service;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;
import com.mht.common.model.SysUser;
import com.mht.common.service.CommonService;

import java.util.List;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SysUserService extends CommonService {

    public static final SysUserService me=new SysUserService();

    public static final SysUser userDao=new SysUser().dao();

    public SysUser findById(int id) {
        return userDao.findById(id);
    }

    public void deleteById(int id) {
        userDao.deleteById(id);
    }

    public List findUserByLoginName(String login_name) {
        List userList= Db.find("select * from sys_user where login_name=? and status=1",login_name);
        return userList;
    }
    public List<SysUser> findUser(String login_name, String password) {
        List<SysUser> userList= userDao.find("select * from sys_user where login_name=? and password=? and status=1",login_name,password);
        return userList;
    }

    public List<SysUser> findUserBySite(String parent_site_id) {
        List<SysUser> userList= userDao.find("select * from sys_user where status=1 and site_id is null and parent_site_id="+parent_site_id);
        return userList;
    }

    public SysUser findOne() {
        List<SysUser> sysUsers = userDao.find("select * from sys_user limit 1");
        if (sysUsers.size() == 0) {
            return new SysUser();
        }
        return sysUsers.get(0);
    }

    /**
     * 保存
     */
    public void save(SysUser sysUser) {
        sysUser.save();
    }

    /**
     * 更新
     */
    public void update(SysUser sysUser) {
        sysUser.update();
    }


    /**
     * 删除
     */
    public void delete(int userId) {
        Db.update("delete from sys_user where user_id=?", userId);
    }



    /**
     * 更新status
     */
    public void update(String status,String tableName,String tableId,String id) {
        Db.update("update "+tableName+" set status="+status+" where "+tableId+"="+id);
    }



    public List findUserPerm(String userId){
        //sql待优化  利用函数
        List userPermList= Db.find("select base1.module_id,base1.module_name,base1.parent_module_id,base1.page from (select x.module_id,x.module_name,x.parent_module_id,x.page from sys_module x,(select m.module_id,m.module_name,m.parent_module_id,n.perm_id,n.perm_name from sys_module m,sys_perm n  where m.module_id=n.module_id and m.status='1' and n.perm_id in (select b.perm_id from sys_user a,sys_user_perm b where a.user_id=b.user_id and b.perm_value>0 and a.user_id="+userId+")) y where y.parent_module_id=x.module_id and x.`status`='1'\n" +
                "union \n" +
                "select x.module_id,x.module_name,x.parent_module_id,x.page from sys_module x,(select m.module_id,m.module_name,m.parent_module_id,n.perm_id,n.perm_name from sys_module m,sys_perm n  where m.module_id=n.module_id and m.status='1'  and n.perm_id in (select b.perm_id from sys_user a,sys_user_perm b where a.user_id=b.user_id and b.perm_value>0 and a.user_id="+userId+")) y where y.module_id=x.module_id and x.`status`='1'\n" +
                "union \n" +
                "select x.module_id,x.module_name,x.parent_module_id,x.page from sys_module x,(select m.module_id,m.module_name,m.parent_module_id,n.perm_id,n.perm_name from sys_module m,sys_perm n  where m.module_id=n.module_id and m.status='1' and n.perm_id in (select c.perm_id from sys_user_role a,sys_role b,sys_role_perm c where a.role_id=b.role_id and b.role_id=c.role_id and c.perm_value > 0 and a.user_id="+userId+")) y where y.parent_module_id=x.module_id and x.`status`='1'\n" +
                "union \n" +
                "select x.module_id,x.module_name,x.parent_module_id,x.page from sys_module x,(select m.module_id,m.module_name,m.parent_module_id,n.perm_id,n.perm_name from sys_module m,sys_perm n  where m.module_id=n.module_id and m.status='1'  and n.perm_id in (select c.perm_id from sys_user_role a,sys_role b,sys_role_perm c where a.role_id=b.role_id and b.role_id=c.role_id and c.perm_value > 0 and a.user_id="+userId+")) y where y.module_id=x.module_id and x.`status`='1') base1," +
                "sys_module base2 where base1.module_id=base2.module_id order by base2.order_code");
        return userPermList;
    }
    public List findUserPerm(String user_id,String plat_id){
        Kv cond= Kv.by("user_id",user_id).set("plat_id",plat_id);
        SqlPara sqlPara = Db.getSqlPara("system.findUserPermList", cond);
        return Db.find(sqlPara);
    }

    public Page<SysUser> paginateUserAboutRole(int pageNumber, int pageSize, String roleId, String flag) {
        if("no".equals(flag)){
            return userDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_user`  where status=1 and user_id not in (select user_id from sys_user_role where role_id="+roleId+")");
        }else{
            return userDao.paginate(pageNumber, pageSize, "select a.*", "FROM `sys_user` a,sys_user_role b where a.user_id=b.user_id and a.status=1 and b.role_id= "+roleId);
        }
    }
    public List userListAboutRole(String roleId, String flag,String plat_id,String session_plat_id) {
        if("no".equals(flag)){
            if("0".equals(session_plat_id)){
                return userDao.find("select * FROM `sys_user`  where status=1 and FIND_IN_SET("+plat_id+",plat_ids) and user_id not in (select user_id from sys_user_role where role_id="+roleId+")");
            }else{
                return userDao.find("select * FROM `sys_user`  where status=1 and plat_ids="+plat_id+" and user_id not in (select user_id from sys_user_role where role_id="+roleId+")");
            }
        }else{
            return userDao.find("select a.* FROM `sys_user` a,sys_user_role b where a.user_id=b.user_id and a.status=1 and b.role_id= "+roleId);
        }
    }

    public SysUser checkName(String aca043) {
        SysUser sysUser = userDao.findFirst("select * from sys_user where login_name = ?" , aca043);
        return sysUser;
    }

    public int findByName(String aca043) {
        SysUser sysUser = userDao.findFirst("select * from sys_user where login_name = ?" , aca043);
        return sysUser.getUserId();
    }
}
