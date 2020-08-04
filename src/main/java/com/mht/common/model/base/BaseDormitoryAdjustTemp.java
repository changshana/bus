package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_adjust_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryAdjustTemp<M extends BaseDormitoryAdjustTemp<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setTempId(java.lang.Integer tempId) {
		set("temp_id", tempId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTempId() {
		return getInt("temp_id");
	}

	/**
	*设置调宿学生id 
	*/
	public M setOldStudentId(java.lang.Integer oldStudentId) {
		set("old_student_id", oldStudentId);
		return (M)this;
	}

	/**
	*获取调宿学生id 
	*/
	public java.lang.Integer getOldStudentId() {
		return getInt("old_student_id");
	}

	/**
	*设置调宿学生学号 
	*/
	public M setOldStudentNum(java.lang.String oldStudentNum) {
		set("old_student_num", oldStudentNum);
		return (M)this;
	}

	/**
	*获取调宿学生学号 
	*/
	public java.lang.String getOldStudentNum() {
		return getStr("old_student_num");
	}

	/**
	*设置调宿学生床位信息 
	*/
	public M setOldStudentBed(java.lang.String oldStudentBed) {
		set("old_student_bed", oldStudentBed);
		return (M)this;
	}

	/**
	*获取调宿学生床位信息 
	*/
	public java.lang.String getOldStudentBed() {
		return getStr("old_student_bed");
	}

	/**
	*设置被调宿学生床位 
	*/
	public M setNewStudentBed(java.lang.String newStudentBed) {
		set("new_student_bed", newStudentBed);
		return (M)this;
	}

	/**
	*获取被调宿学生床位 
	*/
	public java.lang.String getNewStudentBed() {
		return getStr("new_student_bed");
	}

	/**
	*设置调宿床位id 
	*/
	public M setOldBedId(java.lang.Integer oldBedId) {
		set("old_bed_id", oldBedId);
		return (M)this;
	}

	/**
	*获取调宿床位id 
	*/
	public java.lang.Integer getOldBedId() {
		return getInt("old_bed_id");
	}

	/**
	*设置被调宿床位id 
	*/
	public M setNewBedId(java.lang.Integer newBedId) {
		set("new_bed_id", newBedId);
		return (M)this;
	}

	/**
	*获取被调宿床位id 
	*/
	public java.lang.Integer getNewBedId() {
		return getInt("new_bed_id");
	}

	/**
	*设置调宿日期 
	*/
	public M setAdjustDate(java.util.Date adjustDate) {
		set("adjust_date", adjustDate);
		return (M)this;
	}

	/**
	*获取调宿日期 
	*/
	public java.util.Date getAdjustDate() {
		return get("adjust_date");
	}

	/**
	*设置调宿原因 
	*/
	public M setAdjustReason(java.lang.String adjustReason) {
		set("adjust_reason", adjustReason);
		return (M)this;
	}

	/**
	*获取调宿原因 
	*/
	public java.lang.String getAdjustReason() {
		return getStr("adjust_reason");
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

	/**
	*设置临时表状态 
	*/
	public M setTempType(java.lang.Integer tempType) {
		set("temp_type", tempType);
		return (M)this;
	}

	/**
	*获取临时表状态 
	*/
	public java.lang.Integer getTempType() {
		return getInt("temp_type");
	}

	/**
	*设置未通过原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取未通过原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
	}

	/**
	*设置调宿人姓名 
	*/
	public M setOldStudentName(java.lang.String oldStudentName) {
		set("old_student_name", oldStudentName);
		return (M)this;
	}

	/**
	*获取调宿人姓名 
	*/
	public java.lang.String getOldStudentName() {
		return getStr("old_student_name");
	}

	/**
	*设置被调宿学生id 
	*/
	public M setNewStudentId(java.lang.Integer newStudentId) {
		set("new_student_id", newStudentId);
		return (M)this;
	}

	/**
	*获取被调宿学生id 
	*/
	public java.lang.Integer getNewStudentId() {
		return getInt("new_student_id");
	}

}
