package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_love_room:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryLoveRoom<M extends BaseDormitoryLoveRoom<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setLoveRoomId(java.lang.Integer loveRoomId) {
		set("love_room_id", loveRoomId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getLoveRoomId() {
		return getInt("love_room_id");
	}

	/**
	*设置学生Id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生Id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置校区Id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取校区Id 
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
	*设置院系id 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取院系id 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
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
	*设置班级id 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取班级id 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
	}

	/**
	*设置入住时间 
	*/
	public M setCheckDate(java.util.Date checkDate) {
		set("check_date", checkDate);
		return (M)this;
	}

	/**
	*获取入住时间 
	*/
	public java.util.Date getCheckDate() {
		return get("check_date");
	}

	/**
	*设置拟退时间 
	*/
	public M setCheckedDate(java.util.Date checkedDate) {
		set("checked_date", checkedDate);
		return (M)this;
	}

	/**
	*获取拟退时间 
	*/
	public java.util.Date getCheckedDate() {
		return get("checked_date");
	}

	/**
	*设置是否陪读 
	*/
	public M setStudyCompanion(java.lang.String studyCompanion) {
		set("study_companion", studyCompanion);
		return (M)this;
	}

	/**
	*获取是否陪读 
	*/
	public java.lang.String getStudyCompanion() {
		return getStr("study_companion");
	}

	/**
	*设置入住状态 
	*/
	public M setEnrollStatus(java.lang.String enrollStatus) {
		set("enroll_status", enrollStatus);
		return (M)this;
	}

	/**
	*获取入住状态 
	*/
	public java.lang.String getEnrollStatus() {
		return getStr("enroll_status");
	}

	/**
	*设置学生入住信息表id 
	*/
	public M setInId(java.lang.Integer inId) {
		set("in_id", inId);
		return (M)this;
	}

	/**
	*获取学生入住信息表id 
	*/
	public java.lang.Integer getInId() {
		return getInt("in_id");
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
	*设置审核人 
	*/
	public M setAuditor(java.lang.String auditor) {
		set("auditor", auditor);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getAuditor() {
		return getStr("auditor");
	}

	/**
	*设置退宿时间 
	*/
	public M setCheckOutDate(java.util.Date checkOutDate) {
		set("check_out_date", checkOutDate);
		return (M)this;
	}

	/**
	*获取退宿时间 
	*/
	public java.util.Date getCheckOutDate() {
		return get("check_out_date");
	}

}
