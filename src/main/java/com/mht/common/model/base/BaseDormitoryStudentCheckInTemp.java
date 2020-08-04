package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_student_check_in_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryStudentCheckInTemp<M extends BaseDormitoryStudentCheckInTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCheckInTempId(java.lang.Integer checkInTempId) {
		set("check_in_temp_id", checkInTempId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCheckInTempId() {
		return getInt("check_in_temp_id");
	}

	/**
	*设置校区 
	*/
	public M setSiteName(java.lang.String siteName) {
		set("site_name", siteName);
		return (M)this;
	}

	/**
	*获取校区 
	*/
	public java.lang.String getSiteName() {
		return getStr("site_name");
	}

	/**
	*设置组团 
	*/
	public M setGroupName(java.lang.String groupName) {
		set("group_name", groupName);
		return (M)this;
	}

	/**
	*获取组团 
	*/
	public java.lang.String getGroupName() {
		return getStr("group_name");
	}

	/**
	*设置宿舍 
	*/
	public M setTowerName(java.lang.String towerName) {
		set("tower_name", towerName);
		return (M)this;
	}

	/**
	*获取宿舍 
	*/
	public java.lang.String getTowerName() {
		return getStr("tower_name");
	}

	/**
	*设置楼层 
	*/
	public M setFloorName(java.lang.String floorName) {
		set("floor_name", floorName);
		return (M)this;
	}

	/**
	*获取楼层 
	*/
	public java.lang.String getFloorName() {
		return getStr("floor_name");
	}

	/**
	*设置房间 
	*/
	public M setRoomName(java.lang.String roomName) {
		set("room_name", roomName);
		return (M)this;
	}

	/**
	*获取房间 
	*/
	public java.lang.String getRoomName() {
		return getStr("room_name");
	}

	/**
	*设置床位 
	*/
	public M setBedName(java.lang.String bedName) {
		set("bed_name", bedName);
		return (M)this;
	}

	/**
	*获取床位 
	*/
	public java.lang.String getBedName() {
		return getStr("bed_name");
	}

	/**
	*设置房间编码 
	*/
	public M setRoomCode(java.lang.String roomCode) {
		set("room_code", roomCode);
		return (M)this;
	}

	/**
	*获取房间编码 
	*/
	public java.lang.String getRoomCode() {
		return getStr("room_code");
	}

	/**
	*设置名称 
	*/
	public M setStudentName(java.lang.String studentName) {
		set("student_name", studentName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getStudentName() {
		return getStr("student_name");
	}

	/**
	*设置学号 
	*/
	public M setStudentNumber(java.lang.String studentNumber) {
		set("student_number", studentNumber);
		return (M)this;
	}

	/**
	*获取学号 
	*/
	public java.lang.String getStudentNumber() {
		return getStr("student_number");
	}

	/**
	*设置性别 
	*/
	public M setSexName(java.lang.String sexName) {
		set("sex_name", sexName);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.String getSexName() {
		return getStr("sex_name");
	}

	/**
	*设置类别 
	*/
	public M setTypeName(java.lang.String typeName) {
		set("type_name", typeName);
		return (M)this;
	}

	/**
	*获取类别 
	*/
	public java.lang.String getTypeName() {
		return getStr("type_name");
	}

	/**
	*设置学院 
	*/
	public M setCollegeName(java.lang.String collegeName) {
		set("college_name", collegeName);
		return (M)this;
	}

	/**
	*获取学院 
	*/
	public java.lang.String getCollegeName() {
		return getStr("college_name");
	}

	/**
	*设置专业 
	*/
	public M setMajorName(java.lang.String majorName) {
		set("major_name", majorName);
		return (M)this;
	}

	/**
	*获取专业 
	*/
	public java.lang.String getMajorName() {
		return getStr("major_name");
	}

	/**
	*设置年级 
	*/
	public M setGradeName(java.lang.String gradeName) {
		set("grade_name", gradeName);
		return (M)this;
	}

	/**
	*获取年级 
	*/
	public java.lang.String getGradeName() {
		return getStr("grade_name");
	}

	/**
	*设置班级 
	*/
	public M setClassName(java.lang.String className) {
		set("class_name", className);
		return (M)this;
	}

	/**
	*获取班级 
	*/
	public java.lang.String getClassName() {
		return getStr("class_name");
	}

	/**
	*设置民族 
	*/
	public M setNationName(java.lang.String nationName) {
		set("nation_name", nationName);
		return (M)this;
	}

	/**
	*获取民族 
	*/
	public java.lang.String getNationName() {
		return getStr("nation_name");
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
	*设置组团 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取组团 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置楼栋id 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取楼栋id 
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
	*设置房间id 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取房间id 
	*/
	public java.lang.Integer getBedId() {
		return getInt("bed_id");
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
	*设置学生类型 
	*/
	public M setTypeId(java.lang.Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}

	/**
	*获取学生类型 
	*/
	public java.lang.Integer getTypeId() {
		return getInt("type_id");
	}

	/**
	*设置学院id 
	*/
	public M setCollegeId(java.lang.Integer collegeId) {
		set("college_id", collegeId);
		return (M)this;
	}

	/**
	*获取学院id 
	*/
	public java.lang.Integer getCollegeId() {
		return getInt("college_id");
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
	*设置民族id 
	*/
	public M setNationId(java.lang.Integer nationId) {
		set("nation_id", nationId);
		return (M)this;
	}

	/**
	*获取民族id 
	*/
	public java.lang.Integer getNationId() {
		return getInt("nation_id");
	}

	/**
	*设置代码 
	*/
	public M setBatchNumber(java.lang.String batchNumber) {
		set("batch_number", batchNumber);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getBatchNumber() {
		return getStr("batch_number");
	}

}
