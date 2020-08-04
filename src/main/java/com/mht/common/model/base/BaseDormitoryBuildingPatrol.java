package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_building_patrol:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryBuildingPatrol<M extends BaseDormitoryBuildingPatrol<M>> extends Model<M> implements IBean {

	/**
	*设置巡视记录id 
	*/
	public M setPatrolId(java.lang.Integer patrolId) {
		set("patrol_id", patrolId);
		return (M)this;
	}

	/**
	*获取巡视记录id 
	*/
	public java.lang.Integer getPatrolId() {
		return getInt("patrol_id");
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
	*设置巡视人 
	*/
	public M setPatrolPerson(java.lang.String patrolPerson) {
		set("patrol_person", patrolPerson);
		return (M)this;
	}

	/**
	*获取巡视人 
	*/
	public java.lang.String getPatrolPerson() {
		return getStr("patrol_person");
	}

	/**
	*设置巡视时间 
	*/
	public M setPatrolDate(java.util.Date patrolDate) {
		set("patrol_date", patrolDate);
		return (M)this;
	}

	/**
	*获取巡视时间 
	*/
	public java.util.Date getPatrolDate() {
		return get("patrol_date");
	}

	/**
	*设置备注 
	*/
	public M setNote(java.lang.String note) {
		set("note", note);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getNote() {
		return getStr("note");
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
