package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_student_graduation:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxStudentGraduation<M extends BasePxStudentGraduation<M>> extends Model<M> implements IBean {

	/**
	*设置学员结业id 
	*/
	public M setStuGraduationId(java.lang.Integer stuGraduationId) {
		set("stu_graduation_id", stuGraduationId);
		return (M)this;
	}

	/**
	*获取学员结业id 
	*/
	public java.lang.Integer getStuGraduationId() {
		return getInt("stu_graduation_id");
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
	*设置学员id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学员id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置中途是否退学 
	*/
	public M setMidwayDropOut(java.lang.Integer midwayDropOut) {
		set("midway_drop_out", midwayDropOut);
		return (M)this;
	}

	/**
	*获取中途是否退学 
	*/
	public java.lang.Integer getMidwayDropOut() {
		return getInt("midway_drop_out");
	}

	/**
	*设置培训是否合格 
	*/
	public M setTrainPass(java.lang.Integer trainPass) {
		set("train_pass", trainPass);
		return (M)this;
	}

	/**
	*获取培训是否合格 
	*/
	public java.lang.Integer getTrainPass() {
		return getInt("train_pass");
	}

	/**
	*设置理论成绩 
	*/
	public M setTheoryScore(java.lang.String theoryScore) {
		set("theory_score", theoryScore);
		return (M)this;
	}

	/**
	*获取理论成绩 
	*/
	public java.lang.String getTheoryScore() {
		return getStr("theory_score");
	}

	/**
	*设置技能成绩 
	*/
	public M setSkillScore(java.lang.String skillScore) {
		set("skill_score", skillScore);
		return (M)this;
	}

	/**
	*获取技能成绩 
	*/
	public java.lang.String getSkillScore() {
		return getStr("skill_score");
	}

	/**
	*设置缺勤课时 
	*/
	public M setAbsenceHour(java.lang.Integer absenceHour) {
		set("absence_hour", absenceHour);
		return (M)this;
	}

	/**
	*获取缺勤课时 
	*/
	public java.lang.Integer getAbsenceHour() {
		return getInt("absence_hour");
	}

	/**
	*设置培训结束时间 
	*/
	public M setTrainEndTime(java.util.Date trainEndTime) {
		set("train_end_time", trainEndTime);
		return (M)this;
	}

	/**
	*获取培训结束时间 
	*/
	public java.util.Date getTrainEndTime() {
		return get("train_end_time");
	}

	/**
	*设置结业状态 
	*/
	public M setGraduationStatus(java.lang.Integer graduationStatus) {
		set("graduation_status", graduationStatus);
		return (M)this;
	}

	/**
	*获取结业状态 
	*/
	public java.lang.Integer getGraduationStatus() {
		return getInt("graduation_status");
	}

	/**
	*设置考勤天数 
	*/
	public M setAttendanceDay(java.lang.Integer attendanceDay) {
		set("attendance_day", attendanceDay);
		return (M)this;
	}

	/**
	*获取考勤天数 
	*/
	public java.lang.Integer getAttendanceDay() {
		return getInt("attendance_day");
	}

	/**
	*设置结业时间 
	*/
	public M setGraduationDatetime(java.util.Date graduationDatetime) {
		set("graduation_datetime", graduationDatetime);
		return (M)this;
	}

	/**
	*获取结业时间 
	*/
	public java.util.Date getGraduationDatetime() {
		return get("graduation_datetime");
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
	*设置结业证书编号 
	*/
	public M setStuGraduationNumber(java.lang.String stuGraduationNumber) {
		set("stu_graduation_number", stuGraduationNumber);
		return (M)this;
	}

	/**
	*获取结业证书编号 
	*/
	public java.lang.String getStuGraduationNumber() {
		return getStr("stu_graduation_number");
	}

}
