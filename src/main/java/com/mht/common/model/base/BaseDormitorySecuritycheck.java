package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_securitycheck:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitorySecuritycheck<M extends BaseDormitorySecuritycheck<M>> extends Model<M> implements IBean {

	/**
	*设置安全检查记录id 
	*/
	public M setCheckId(java.lang.Integer checkId) {
		set("check_id", checkId);
		return (M)this;
	}

	/**
	*获取安全检查记录id 
	*/
	public java.lang.Integer getCheckId() {
		return getInt("check_id");
	}

	/**
	*设置检查人 
	*/
	public M setCheckPeople(java.lang.String checkPeople) {
		set("check_people", checkPeople);
		return (M)this;
	}

	/**
	*获取检查人 
	*/
	public java.lang.String getCheckPeople() {
		return getStr("check_people");
	}

	/**
	*设置区域id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取区域id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置组团id 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取组团id 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置宿舍楼id 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取宿舍楼id 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置楼层 
	*/
	public M setFloorId(java.lang.Integer floorId) {
		set("floor_id", floorId);
		return (M)this;
	}

	/**
	*获取楼层 
	*/
	public java.lang.Integer getFloorId() {
		return getInt("floor_id");
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
	*设置检查时间 
	*/
	public M setSecurityCheckDate(java.util.Date securityCheckDate) {
		set("security_check_date", securityCheckDate);
		return (M)this;
	}

	/**
	*获取检查时间 
	*/
	public java.util.Date getSecurityCheckDate() {
		return get("security_check_date");
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
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置是否存在安全隐患 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取是否存在安全隐患 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

}
