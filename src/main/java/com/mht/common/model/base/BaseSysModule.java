package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_module:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysModule<M extends BaseSysModule<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setModuleId(java.lang.Integer moduleId) {
		set("module_id", moduleId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getModuleId() {
		return getInt("module_id");
	}

	/**
	*设置名称 
	*/
	public M setModuleName(java.lang.String moduleName) {
		set("module_name", moduleName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getModuleName() {
		return getStr("module_name");
	}

	/**
	*设置模块代码 
	*/
	public M setModuleCode(java.lang.String moduleCode) {
		set("module_code", moduleCode);
		return (M)this;
	}

	/**
	*获取模块代码 
	*/
	public java.lang.String getModuleCode() {
		return getStr("module_code");
	}

	/**
	*设置页面 
	*/
	public M setPage(java.lang.String page) {
		set("page", page);
		return (M)this;
	}

	/**
	*获取页面 
	*/
	public java.lang.String getPage() {
		return getStr("page");
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
	*设置父模板ID 
	*/
	public M setParentModuleId(java.lang.Integer parentModuleId) {
		set("parent_module_id", parentModuleId);
		return (M)this;
	}

	/**
	*获取父模板ID 
	*/
	public java.lang.Integer getParentModuleId() {
		return getInt("parent_module_id");
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
