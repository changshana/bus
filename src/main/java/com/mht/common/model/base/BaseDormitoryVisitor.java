package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_visitor:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryVisitor<M extends BaseDormitoryVisitor<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setVisitorId(java.lang.Integer visitorId) {
		set("visitor_id", visitorId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getVisitorId() {
		return getInt("visitor_id");
	}

	/**
	*设置名称 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	*设置性别 
	*/
	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.String getSex() {
		return getStr("sex");
	}

	/**
	*设置关系 
	*/
	public M setRelationship(java.lang.String relationship) {
		set("relationship", relationship);
		return (M)this;
	}

	/**
	*获取关系 
	*/
	public java.lang.String getRelationship() {
		return getStr("relationship");
	}

	/**
	*设置访问时间 
	*/
	public M setVisitTime(java.util.Date visitTime) {
		set("visit_time", visitTime);
		return (M)this;
	}

	/**
	*获取访问时间 
	*/
	public java.util.Date getVisitTime() {
		return get("visit_time");
	}

	/**
	*设置student_id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取student_id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置site_id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取site_id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置group_id 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取group_id 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置tower_id 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取tower_id 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置floor_id 
	*/
	public M setFloorId(java.lang.Integer floorId) {
		set("floor_id", floorId);
		return (M)this;
	}

	/**
	*获取floor_id 
	*/
	public java.lang.Integer getFloorId() {
		return getInt("floor_id");
	}

	/**
	*设置room_id 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取room_id 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置访问事由 
	*/
	public M setVisitReason(java.lang.String visitReason) {
		set("visit_reason", visitReason);
		return (M)this;
	}

	/**
	*获取访问事由 
	*/
	public java.lang.String getVisitReason() {
		return getStr("visit_reason");
	}

	/**
	*设置记录人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取记录人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置记录时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取记录时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
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
	*设置状态 
	*/
	public M setStatus(java.lang.String status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.String getStatus() {
		return getStr("status");
	}

}
