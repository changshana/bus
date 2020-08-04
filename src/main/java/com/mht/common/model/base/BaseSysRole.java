package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_role:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysRole<M extends BaseSysRole<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRoleId(java.lang.Integer roleId) {
		set("role_id", roleId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRoleId() {
		return getInt("role_id");
	}

	/**
	*设置角色名称 
	*/
	public M setRoleName(java.lang.String roleName) {
		set("role_name", roleName);
		return (M)this;
	}

	/**
	*获取角色名称 
	*/
	public java.lang.String getRoleName() {
		return getStr("role_name");
	}

	/**
	*设置角色代码 
	*/
	public M setRoleCode(java.lang.String roleCode) {
		set("role_code", roleCode);
		return (M)this;
	}

	/**
	*获取角色代码 
	*/
	public java.lang.String getRoleCode() {
		return getStr("role_code");
	}

	/**
	*设置备注 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置标志码 
	*/
	public M setKeycode(java.lang.String keycode) {
		set("keycode", keycode);
		return (M)this;
	}

	/**
	*获取标志码 
	*/
	public java.lang.String getKeycode() {
		return getStr("keycode");
	}

	/**
	*设置排序号 
	*/
	public M setOrderCode(java.lang.Integer orderCode) {
		set("order_code", orderCode);
		return (M)this;
	}

	/**
	*获取排序号 
	*/
	public java.lang.Integer getOrderCode() {
		return getInt("order_code");
	}

	/**
	*设置系统平台编号 
	*/
	public M setPlatId(java.lang.Integer platId) {
		set("plat_id", platId);
		return (M)this;
	}

	/**
	*获取系统平台编号 
	*/
	public java.lang.Integer getPlatId() {
		return getInt("plat_id");
	}

}
