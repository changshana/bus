package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.mht.common.model.SysRoleSite;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SysRoleSiteService extends CommonService {
    public static final SysRoleSiteService me=new SysRoleSiteService();

    public static final SysRoleSite roleSiteDao=new SysRoleSite().dao();

    public List getRoleSiteList(String parent_site_id,String role_id){
        if("".equals(parent_site_id)){
            return roleSiteDao.find("select a.*,(select count(1) from sys_role_site where  parent_site_id=a.site_id and role_id="+role_id+") as role_site_count,(select count(1) from site_info where parent_site_id=a.site_id and status=1) as child_site_count FROM `site_info` a where a.parent_site_id is null "+" and a.status=1 order by a.create_time,a.site_id");
        }else{
            return roleSiteDao.find("select a.*,(select count(1) from sys_role_site where role_id="+role_id+" and site_id=a.site_id ) as check_flag FROM `site_info` a where a.parent_site_id="+parent_site_id+" and a.status=1 order by a.create_time,a.site_id");
        }
    }
    public String getRoleSitesByParentSite(String parent_site_id,String role_id){
        return Db.find("select GROUP_CONCAT(site_id SEPARATOR ',') as site_ids from sys_role_site where role_id="+role_id+" and parent_site_id="+parent_site_id).get(0).get("site_ids");
    }

    public void save(SysRoleSite sysRoleSite){
        sysRoleSite.save();
    }

    public List findRoleSite(SysRoleSite sysRoleSite){
        return Db.find("select * from sys_role_site where role_id="+sysRoleSite.getRoleId()+" and parent_site_id="+sysRoleSite.getParentSiteId()+" and site_id="+sysRoleSite.getSiteId());
    }


    /**
     * 更新
     */
    public void update(SysRoleSite sysRoleSite) {
        Db.update("delete from sys_role_site where role_id="+sysRoleSite.getRoleId()+" and parent_site_id="+sysRoleSite.getParentSiteId()+" and site_id="+sysRoleSite.getSiteId());
    }
    /**
     * 更新
     */
    public void updateAll(SysRoleSite sysRoleSite) {
        Db.update("delete from sys_role_site where role_id="+sysRoleSite.getRoleId()+" and parent_site_id="+sysRoleSite.getParentSiteId());
    }





}
