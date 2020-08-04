package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_violate_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryViolateRecord<M extends BaseDormitoryViolateRecord<M>> extends Model<M> implements IBean {

	/**
	*设置违规记录id 
	*/
	public M setViolateId(java.lang.Integer violateId) {
		set("violate_id", violateId);
		return (M)this;
	}

	/**
	*获取违规记录id 
	*/
	public java.lang.Integer getViolateId() {
		return getInt("violate_id");
	}

	/**
	*设置学生id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置学生姓名 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取学生姓名 
	*/
	public java.lang.String getName() {
		return getStr("name");
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
	*设置楼层id 
	*/
	public M setFloorId(java.lang.Integer floorId) {
		set("floor_id", floorId);
		return (M)this;
	}

	/**
	*获取楼层id 
	*/
	public java.lang.Integer getFloorId() {
		return getInt("floor_id");
	}

	/**
	*设置房间id 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取房间id 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置违规违纪项 
	*/
	public M setViolateDetail(java.lang.String violateDetail) {
		set("violate_detail", violateDetail);
		return (M)this;
	}

	/**
	*获取违规违纪项 
	*/
	public java.lang.String getViolateDetail() {
		return getStr("violate_detail");
	}

	/**
	*设置违规日期 
	*/
	public M setViolateDate(java.util.Date violateDate) {
		set("violate_date", violateDate);
		return (M)this;
	}

	/**
	*获取违规日期 
	*/
	public java.util.Date getViolateDate() {
		return get("violate_date");
	}

	/**
	*设置是否公布 
	*/
	public M setPublish(java.lang.Integer publish) {
		set("publish", publish);
		return (M)this;
	}

	/**
	*获取是否公布 
	*/
	public java.lang.Integer getPublish() {
		return getInt("publish");
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
