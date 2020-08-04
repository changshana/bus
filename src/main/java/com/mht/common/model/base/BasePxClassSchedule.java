package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_class_schedule:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxClassSchedule<M extends BasePxClassSchedule<M>> extends Model<M> implements IBean {

	/**
	*设置上课信息ID 
	*/
	public M setScheduleId(java.lang.Integer scheduleId) {
		set("schedule_id", scheduleId);
		return (M)this;
	}

	/**
	*获取上课信息ID 
	*/
	public java.lang.Integer getScheduleId() {
		return getInt("schedule_id");
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
	*设置教室id 
	*/
	public M setSchoolroomId(java.lang.Integer schoolroomId) {
		set("schoolroom_id", schoolroomId);
		return (M)this;
	}

	/**
	*获取教室id 
	*/
	public java.lang.Integer getSchoolroomId() {
		return getInt("schoolroom_id");
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
	*设置学期 
	*/
	public M setTrainTeam(java.lang.String trainTeam) {
		set("train_team", trainTeam);
		return (M)this;
	}

	/**
	*获取学期 
	*/
	public java.lang.String getTrainTeam() {
		return getStr("train_team");
	}

	/**
	*设置第几周 
	*/
	public M setTrainWeek(java.lang.String trainWeek) {
		set("train_week", trainWeek);
		return (M)this;
	}

	/**
	*获取第几周 
	*/
	public java.lang.String getTrainWeek() {
		return getStr("train_week");
	}

	/**
	*设置本周开始时间 
	*/
	public M setWeekTime(java.util.Date weekTime) {
		set("week_time", weekTime);
		return (M)this;
	}

	/**
	*获取本周开始时间 
	*/
	public java.util.Date getWeekTime() {
		return get("week_time");
	}

	/**
	*设置上课日期 
	*/
	public M setAttendTime(java.util.Date attendTime) {
		set("attend_time", attendTime);
		return (M)this;
	}

	/**
	*获取上课日期 
	*/
	public java.util.Date getAttendTime() {
		return get("attend_time");
	}

	/**
	*设置第几节课 
	*/
	public M setSectionLessons(java.lang.Integer sectionLessons) {
		set("section_lessons", sectionLessons);
		return (M)this;
	}

	/**
	*获取第几节课 
	*/
	public java.lang.Integer getSectionLessons() {
		return getInt("section_lessons");
	}

	/**
	*设置课程id 
	*/
	public M setCourseId(java.lang.Integer courseId) {
		set("course_id", courseId);
		return (M)this;
	}

	/**
	*获取课程id 
	*/
	public java.lang.Integer getCourseId() {
		return getInt("course_id");
	}

	/**
	*设置上课开始时间 
	*/
	public M setAttendStartTime(java.lang.String attendStartTime) {
		set("attend_start_time", attendStartTime);
		return (M)this;
	}

	/**
	*获取上课开始时间 
	*/
	public java.lang.String getAttendStartTime() {
		return getStr("attend_start_time");
	}

	/**
	*设置上课结束时间 
	*/
	public M setAttendEndTime(java.lang.String attendEndTime) {
		set("attend_end_time", attendEndTime);
		return (M)this;
	}

	/**
	*获取上课结束时间 
	*/
	public java.lang.String getAttendEndTime() {
		return getStr("attend_end_time");
	}

	/**
	*设置课程表ID 
	*/
	public M setSyllabusId(java.lang.Integer syllabusId) {
		set("syllabus_id", syllabusId);
		return (M)this;
	}

	/**
	*获取课程表ID 
	*/
	public java.lang.Integer getSyllabusId() {
		return getInt("syllabus_id");
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
