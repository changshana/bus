package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_student_check_in:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryStudentCheckIn<M extends BaseDormitoryStudentCheckIn<M>> extends Model<M> implements IBean {

	/**
	*设置学生入住ID 
	*/
	public M setInId(java.lang.Integer inId) {
		set("in_id", inId);
		return (M)this;
	}

	/**
	*获取学生入住ID 
	*/
	public java.lang.Integer getInId() {
		return getInt("in_id");
	}

	/**
	*设置学生编号 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生编号 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置所属校区id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取所属校区id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置所属组团id 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取所属组团id 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置所属楼宇id 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取所属楼宇id 
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
	*设置入住状态 
	*/
	public M setEnrollStatus(java.lang.Integer enrollStatus) {
		set("enroll_status", enrollStatus);
		return (M)this;
	}

	/**
	*获取入住状态 
	*/
	public java.lang.Integer getEnrollStatus() {
		return getInt("enroll_status");
	}

	/**
	*设置缴费状态 
	*/
	public M setPayStatus(java.lang.Integer payStatus) {
		set("pay_status", payStatus);
		return (M)this;
	}

	/**
	*获取缴费状态 
	*/
	public java.lang.Integer getPayStatus() {
		return getInt("pay_status");
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
	*设置入住方式(分房/选房) 
	*/
	public M setEnrollWay(java.lang.String enrollWay) {
		set("enroll_way", enrollWay);
		return (M)this;
	}

	/**
	*获取入住方式(分房/选房) 
	*/
	public java.lang.String getEnrollWay() {
		return getStr("enroll_way");
	}

	/**
	*设置选房来源 
	*/
	public M setSource(java.lang.Integer source) {
		set("source", source);
		return (M)this;
	}

	/**
	*获取选房来源 
	*/
	public java.lang.Integer getSource() {
		return getInt("source");
	}

	/**
	*设置入住日期 
	*/
	public M setEnrollDate(java.util.Date enrollDate) {
		set("enroll_date", enrollDate);
		return (M)this;
	}

	/**
	*获取入住日期 
	*/
	public java.util.Date getEnrollDate() {
		return get("enroll_date");
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
	*设置创建日期 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
