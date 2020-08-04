package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_role_site:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysRoleSite<M extends BaseSysRoleSite<M>> extends Model<M> implements IBean {

	/**
	*设置角色ID 
	*/
	public M setRoleId(java.lang.Integer roleId) {
		set("role_id", roleId);
		return (M)this;
	}

	/**
	*获取角色ID 
	*/
	public java.lang.Integer getRoleId() {
		return getInt("role_id");
	}

	/**
	*设置上级机构ID 
	*/
	public M setParentSiteId(java.lang.Integer parentSiteId) {
		set("parent_site_id", parentSiteId);
		return (M)this;
	}

	/**
	*获取上级机构ID 
	*/
	public java.lang.Integer getParentSiteId() {
		return getInt("parent_site_id");
	}

	/**
	*设置机构ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取机构ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

}
