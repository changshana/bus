package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_check_in_again:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCheckInAgain<M extends BaseDormitoryCheckInAgain<M>> extends Model<M> implements IBean {

	/**
	*设置重新入住流水号 
	*/
	public M setInAgainId(java.lang.Integer inAgainId) {
		set("in_again_id", inAgainId);
		return (M)this;
	}

	/**
	*获取重新入住流水号 
	*/
	public java.lang.Integer getInAgainId() {
		return getInt("in_again_id");
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
	*设置楼宇ID 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取楼宇ID 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置宿舍ID 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取宿舍ID 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置床位ID 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取床位ID 
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
	*设置入住日期 
	*/
	public M setInTime(java.util.Date inTime) {
		set("in_time", inTime);
		return (M)this;
	}

	/**
	*获取入住日期 
	*/
	public java.util.Date getInTime() {
		return get("in_time");
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
