package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_role_perm:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysRolePerm<M extends BaseSysRolePerm<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRolePermId(java.lang.Integer rolePermId) {
		set("role_perm_id", rolePermId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRolePermId() {
		return getInt("role_perm_id");
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
	*设置权值 
	*/
	public M setPermValue(java.lang.Integer permValue) {
		set("perm_value", permValue);
		return (M)this;
	}

	/**
	*获取权值 
	*/
	public java.lang.Integer getPermValue() {
		return getInt("perm_value");
	}

}
