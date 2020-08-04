package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_perm:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysPerm<M extends BaseSysPerm<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPermId(java.lang.Integer permId) {
		set("perm_id", permId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPermId() {
		return getInt("perm_id");
	}

	/**
	*设置权限代码 
	*/
	public M setPermCode(java.lang.String permCode) {
		set("perm_code", permCode);
		return (M)this;
	}

	/**
	*获取权限代码 
	*/
	public java.lang.String getPermCode() {
		return getStr("perm_code");
	}

	/**
	*设置权限名称 
	*/
	public M setPermName(java.lang.String permName) {
		set("perm_name", permName);
		return (M)this;
	}

	/**
	*获取权限名称 
	*/
	public java.lang.String getPermName() {
		return getStr("perm_name");
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

	/**
	*设置所属模块 
	*/
	public M setModuleId(java.lang.Integer moduleId) {
		set("module_id", moduleId);
		return (M)this;
	}

	/**
	*获取所属模块 
	*/
	public java.lang.Integer getModuleId() {
		return getInt("module_id");
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

}
