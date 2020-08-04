package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * xim_menu:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXimMenu<M extends BaseXimMenu<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setQaMenuId(java.lang.Integer qaMenuId) {
		set("qa_menu_id", qaMenuId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getQaMenuId() {
		return getInt("qa_menu_id");
	}

	/**
	*设置菜单名称 
	*/
	public M setQaMenuName(java.lang.String qaMenuName) {
		set("qa_menu_name", qaMenuName);
		return (M)this;
	}

	/**
	*获取菜单名称 
	*/
	public java.lang.String getQaMenuName() {
		return getStr("qa_menu_name");
	}

	/**
	*设置菜单代码 
	*/
	public M setQaMenuCode(java.lang.String qaMenuCode) {
		set("qa_menu_code", qaMenuCode);
		return (M)this;
	}

	/**
	*获取菜单代码 
	*/
	public java.lang.String getQaMenuCode() {
		return getStr("qa_menu_code");
	}

	/**
	*设置状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
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
	*设置图标 
	*/
	public M setIcon(java.lang.String icon) {
		set("icon", icon);
		return (M)this;
	}

	/**
	*获取图标 
	*/
	public java.lang.String getIcon() {
		return getStr("icon");
	}

	/**
	*设置父菜单ID 
	*/
	public M setParentQaMenuId(java.lang.Integer parentQaMenuId) {
		set("parent_qa_menu_id", parentQaMenuId);
		return (M)this;
	}

	/**
	*获取父菜单ID 
	*/
	public java.lang.Integer getParentQaMenuId() {
		return getInt("parent_qa_menu_id");
	}

	/**
	*设置标识码 
	*/
	public M setKeycode(java.lang.String keycode) {
		set("keycode", keycode);
		return (M)this;
	}

	/**
	*获取标识码 
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
	*设置角色类型 
	*/
	public M setRoleType(java.lang.String roleType) {
		set("roleType", roleType);
		return (M)this;
	}

	/**
	*获取角色类型 
	*/
	public java.lang.String getRoleType() {
		return getStr("roleType");
	}

}
