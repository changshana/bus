package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.SysUserPerm;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SysUserPermService extends CommonService {

    public static final SysUserPermService me=new SysUserPermService();

    public static final SysUserPerm userPermDao=new SysUserPerm().dao();


    public Page<SysUserPerm> paginate(int pageNumber, int pageSize,String user_id) {
        return userPermDao.paginate(pageNumber, pageSize, "select *", "FROM `sys_user_perm` where user_id="+user_id);
    }

    public SysUserPerm findById(int id) {
        return userPermDao.findById(id);
    }

    public void deleteById(int id) {
        userPermDao.deleteById(id);
    }


    public SysUserPerm findOne() {
        List<SysUserPerm> sysPerms = userPermDao.find("select * from sys_user_perm limit 1");
        if (sysPerms.size() == 0) {
            return new SysUserPerm();
        }
        return sysPerms.get(0);
    }
    public SysUserPerm findByUserIdAndPermId(int userId,long permId) {
        List<SysUserPerm> sysPerms = userPermDao.find("select * from sys_user_perm where user_id="+userId+" and perm_id="+permId);
        if (sysPerms.size() == 0) {
            return new SysUserPerm();
        }
        return sysPerms.get(0);
    }

    /**
     * 保存
     */
    public void save(SysUserPerm sysPerm) {
        sysPerm.save();
    }

    /**
     * 更新
     */
    public void update(SysUserPerm sysPerm) {
        sysPerm.update();
    }


    /**
     * 删除
     */
    public void delete(int userPermId) {
        Db.update("delete from sys_userPerm where user_perm_id=?", userPermId);
    }



}
