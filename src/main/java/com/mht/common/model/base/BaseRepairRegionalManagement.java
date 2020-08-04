package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_regional_management:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairRegionalManagement<M extends BaseRepairRegionalManagement<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setRegionalId(java.lang.Integer regionalId) {
		set("regional_id", regionalId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRegionalId() {
		return getInt("regional_id");
	}

	/**
	*设置 
	*/
	public M setRegionalName(java.lang.String regionalName) {
		set("regional_name", regionalName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRegionalName() {
		return getStr("regional_name");
	}

	/**
	*设置 
	*/
	public M setGroups(java.lang.Integer groups) {
		set("groups", groups);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGroups() {
		return getInt("groups");
	}

	/**
	*设置 
	*/
	public M setRegionalStatus(java.lang.Integer regionalStatus) {
		set("regional_status", regionalStatus);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRegionalStatus() {
		return getInt("regional_status");
	}

	/**
	*设置 
	*/
	public M setSchool(java.lang.Integer school) {
		set("school", school);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getSchool() {
		return getInt("school");
	}

	/**
	*设置 
	*/
	public M setParentRegionalId(java.lang.Integer parentRegionalId) {
		set("parent_regional_id", parentRegionalId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getParentRegionalId() {
		return getInt("parent_regional_id");
	}

}
