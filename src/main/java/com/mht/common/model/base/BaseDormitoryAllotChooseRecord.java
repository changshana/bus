package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_allot_choose_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryAllotChooseRecord<M extends BaseDormitoryAllotChooseRecord<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
	}

	/**
	*设置学生ID 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生ID 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置校区id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取校区id 
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
	*设置宿舍id 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取宿舍id 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置床位id 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取床位id 
	*/
	public java.lang.Integer getBedId() {
		return getInt("bed_id");
	}

	/**
	*设置申请时间 
	*/
	public M setApplyDate(java.util.Date applyDate) {
		set("apply_date", applyDate);
		return (M)this;
	}

	/**
	*获取申请时间 
	*/
	public java.util.Date getApplyDate() {
		return get("apply_date");
	}

	/**
	*设置审核状态 
	*/
	public M setApprovalStatus(java.lang.Integer approvalStatus) {
		set("approval_status", approvalStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getApprovalStatus() {
		return getInt("approval_status");
	}

	/**
	*设置审核日期 
	*/
	public M setApprovalDate(java.util.Date approvalDate) {
		set("approval_date", approvalDate);
		return (M)this;
	}

	/**
	*获取审核日期 
	*/
	public java.util.Date getApprovalDate() {
		return get("approval_date");
	}

	/**
	*设置审核人 
	*/
	public M setApprovalPerson(java.lang.String approvalPerson) {
		set("approval_person", approvalPerson);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getApprovalPerson() {
		return getStr("approval_person");
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
	*设置分房方式(1：在线选房  2：直接分房) 
	*/
	public M setEnrollWay(java.lang.Integer enrollWay) {
		set("enroll_way", enrollWay);
		return (M)this;
	}

	/**
	*获取分房方式(1：在线选房  2：直接分房) 
	*/
	public java.lang.Integer getEnrollWay() {
		return getInt("enroll_way");
	}

	/**
	*设置信息来源 
	*/
	public M setSource(java.lang.Integer source) {
		set("source", source);
		return (M)this;
	}

	/**
	*获取信息来源 
	*/
	public java.lang.Integer getSource() {
		return getInt("source");
	}

}
