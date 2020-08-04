package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_allot_setting:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryAllotSetting<M extends BaseDormitoryAllotSetting<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAllotSettingId(java.lang.Integer allotSettingId) {
		set("allot_setting_id", allotSettingId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAllotSettingId() {
		return getInt("allot_setting_id");
	}

	/**
	*设置专业id 
	*/
	public M setMajorId(java.lang.Integer majorId) {
		set("major_id", majorId);
		return (M)this;
	}

	/**
	*获取专业id 
	*/
	public java.lang.Integer getMajorId() {
		return getInt("major_id");
	}

	/**
	*设置学院id 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取学院id 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置楼宇id 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取楼宇id 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置创建时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置创建用户 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
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

}
