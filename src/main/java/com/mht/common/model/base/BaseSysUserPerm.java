package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_user_perm:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysUserPerm<M extends BaseSysUserPerm<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setUserPermId(java.lang.Integer userPermId) {
		set("user_perm_id", userPermId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getUserPermId() {
		return getInt("user_perm_id");
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
	*设置权限ID 
	*/
	public M setPermId(java.lang.Integer permId) {
		set("perm_id", permId);
		return (M)this;
	}

	/**
	*获取权限ID 
	*/
	public java.lang.Integer getPermId() {
		return getInt("perm_id");
	}

	/**
	*设置权限值 
	*/
	public M setPermValue(java.lang.Integer permValue) {
		set("perm_value", permValue);
		return (M)this;
	}

	/**
	*获取权限值 
	*/
	public java.lang.Integer getPermValue() {
		return getInt("perm_value");
	}

}
