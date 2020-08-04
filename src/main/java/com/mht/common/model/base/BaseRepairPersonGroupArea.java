package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_person_group_area:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairPersonGroupArea<M extends BaseRepairPersonGroupArea<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setPersonGroupAreaId(java.lang.Integer personGroupAreaId) {
		set("person_group_area_id", personGroupAreaId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getPersonGroupAreaId() {
		return getInt("person_group_area_id");
	}

	/**
	*设置 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置 
	*/
	public M setAreaId(java.lang.Integer areaId) {
		set("area_id", areaId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAreaId() {
		return getInt("area_id");
	}

}
