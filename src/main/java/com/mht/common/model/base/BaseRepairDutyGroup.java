package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_duty_group:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDutyGroup<M extends BaseRepairDutyGroup<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setRdgId(java.lang.Integer rdgId) {
		set("rdg_id", rdgId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRdgId() {
		return getInt("rdg_id");
	}

	/**
	*设置 
	*/
	public M setRdgName(java.lang.String rdgName) {
		set("rdg_name", rdgName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRdgName() {
		return getStr("rdg_name");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置 
	*/
	public M setTheTime(java.util.Date theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getTheTime() {
		return get("the_time");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setZoneId(java.lang.Integer zoneId) {
		set("zone_id", zoneId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getZoneId() {
		return getInt("zone_id");
	}

	/**
	*设置 
	*/
	public M setMasterUserMobile(java.lang.String masterUserMobile) {
		set("master_user_mobile", masterUserMobile);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getMasterUserMobile() {
		return getStr("master_user_mobile");
	}

	/**
	*设置 
	*/
	public M setMasterUser(java.lang.String masterUser) {
		set("master_user", masterUser);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getMasterUser() {
		return getStr("master_user");
	}

	/**
	*设置 
	*/
	public M setDutyTypeId(java.lang.Integer dutyTypeId) {
		set("duty_type_id", dutyTypeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDutyTypeId() {
		return getInt("duty_type_id");
	}

}
