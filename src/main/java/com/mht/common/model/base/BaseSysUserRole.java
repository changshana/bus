package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_user_role:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysUserRole<M extends BaseSysUserRole<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setUserRoleId(java.lang.Integer userRoleId) {
		set("user_role_id", userRoleId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getUserRoleId() {
		return getInt("user_role_id");
	}

	/**
	*设置用户 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取用户 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

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

}
