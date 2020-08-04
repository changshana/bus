package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_log:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxLog<M extends BasePxLog<M>> extends Model<M> implements IBean {

	/**
	*设置培训日志id 
	*/
	public M setTrainLogId(java.lang.Integer trainLogId) {
		set("train_log_id", trainLogId);
		return (M)this;
	}

	/**
	*获取培训日志id 
	*/
	public java.lang.Integer getTrainLogId() {
		return getInt("train_log_id");
	}

	/**
	*设置培训学校编号 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取培训学校编号 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
	}

	/**
	*设置班级ID 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取班级ID 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
	}

	/**
	*设置教师id 
	*/
	public M setTeacherId(java.lang.Integer teacherId) {
		set("teacher_id", teacherId);
		return (M)this;
	}

	/**
	*获取教师id 
	*/
	public java.lang.Integer getTeacherId() {
		return getInt("teacher_id");
	}

	/**
	*设置上课时间 
	*/
	public M setAttendStartTime(java.util.Date attendStartTime) {
		set("attend_start_time", attendStartTime);
		return (M)this;
	}

	/**
	*获取上课时间 
	*/
	public java.util.Date getAttendStartTime() {
		return get("attend_start_time");
	}

	/**
	*设置上课地点 
	*/
	public M setAttendStartAddress(java.lang.String attendStartAddress) {
		set("attend_start_address", attendStartAddress);
		return (M)this;
	}

	/**
	*获取上课地点 
	*/
	public java.lang.String getAttendStartAddress() {
		return getStr("attend_start_address");
	}

	/**
	*设置上课时数 
	*/
	public M setClassTime(java.lang.Integer classTime) {
		set("class_time", classTime);
		return (M)this;
	}

	/**
	*获取上课时数 
	*/
	public java.lang.Integer getClassTime() {
		return getInt("class_time");
	}

	/**
	*设置实到人数 
	*/
	public M setFactStudents(java.lang.Integer factStudents) {
		set("fact_students", factStudents);
		return (M)this;
	}

	/**
	*获取实到人数 
	*/
	public java.lang.Integer getFactStudents() {
		return getInt("fact_students");
	}

	/**
	*设置授课形式 
	*/
	public M setTeachingForm(java.lang.String teachingForm) {
		set("teaching_form", teachingForm);
		return (M)this;
	}

	/**
	*获取授课形式 
	*/
	public java.lang.String getTeachingForm() {
		return getStr("teaching_form");
	}

	/**
	*设置培训内容提要 
	*/
	public M setTrainContent(java.lang.String trainContent) {
		set("train_content", trainContent);
		return (M)this;
	}

	/**
	*获取培训内容提要 
	*/
	public java.lang.String getTrainContent() {
		return getStr("train_content");
	}

	/**
	*设置学习进度 
	*/
	public M setStudySchedule(java.lang.String studySchedule) {
		set("study_schedule", studySchedule);
		return (M)this;
	}

	/**
	*获取学习进度 
	*/
	public java.lang.String getStudySchedule() {
		return getStr("study_schedule");
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

}
