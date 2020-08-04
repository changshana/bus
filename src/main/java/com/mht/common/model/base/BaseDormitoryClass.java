package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_class:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryClass<M extends BaseDormitoryClass<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
	}

	/**
	*设置名称 
	*/
	public M setClassName(java.lang.String className) {
		set("class_name", className);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getClassName() {
		return getStr("class_name");
	}

	/**
	*设置代码 
	*/
	public M setClassCode(java.lang.String classCode) {
		set("class_code", classCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getClassCode() {
		return getStr("class_code");
	}

	/**
	*设置专业ID 
	*/
	public M setMajorId(java.lang.Integer majorId) {
		set("major_id", majorId);
		return (M)this;
	}

	/**
	*获取专业ID 
	*/
	public java.lang.Integer getMajorId() {
		return getInt("major_id");
	}

	/**
	*设置学生人数 
	*/
	public M setStudentCount(java.lang.Integer studentCount) {
		set("student_count", studentCount);
		return (M)this;
	}

	/**
	*获取学生人数 
	*/
	public java.lang.Integer getStudentCount() {
		return getInt("student_count");
	}

	/**
	*设置毕业状态 
	*/
	public M setGraduateStatus(java.lang.Integer graduateStatus) {
		set("graduate_status", graduateStatus);
		return (M)this;
	}

	/**
	*获取毕业状态 
	*/
	public java.lang.Integer getGraduateStatus() {
		return getInt("graduate_status");
	}

	/**
	*设置学习周期(学制) 
	*/
	public M setCycle(java.lang.String cycle) {
		set("cycle", cycle);
		return (M)this;
	}

	/**
	*获取学习周期(学制) 
	*/
	public java.lang.String getCycle() {
		return getStr("cycle");
	}

	/**
	*设置入学年份 
	*/
	public M setEnrollYear(java.lang.String enrollYear) {
		set("enroll_year", enrollYear);
		return (M)this;
	}

	/**
	*获取入学年份 
	*/
	public java.lang.String getEnrollYear() {
		return getStr("enroll_year");
	}

	/**
	*设置学生类型 
	*/
	public M setStudentType(java.lang.Integer studentType) {
		set("student_type", studentType);
		return (M)this;
	}

	/**
	*获取学生类型 
	*/
	public java.lang.Integer getStudentType() {
		return getInt("student_type");
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
	*设置辅导员工号 
	*/
	public M setJobNum(java.lang.String jobNum) {
		set("job_num", jobNum);
		return (M)this;
	}

	/**
	*获取辅导员工号 
	*/
	public java.lang.String getJobNum() {
		return getStr("job_num");
	}

}
