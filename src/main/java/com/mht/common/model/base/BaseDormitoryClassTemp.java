package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_class_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryClassTemp<M extends BaseDormitoryClassTemp<M>> extends Model<M> implements IBean {

	/**
	*设置临时id 
	*/
	public M setTempId(java.lang.Integer tempId) {
		set("temp_id", tempId);
		return (M)this;
	}

	/**
	*获取临时id 
	*/
	public java.lang.Integer getTempId() {
		return getInt("temp_id");
	}

	/**
	*设置班级名称 
	*/
	public M setClassName(java.lang.String className) {
		set("class_name", className);
		return (M)this;
	}

	/**
	*获取班级名称 
	*/
	public java.lang.String getClassName() {
		return getStr("class_name");
	}

	/**
	*设置班级代码 
	*/
	public M setClassCode(java.lang.String classCode) {
		set("class_code", classCode);
		return (M)this;
	}

	/**
	*获取班级代码 
	*/
	public java.lang.String getClassCode() {
		return getStr("class_code");
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
	*设置学习周期（学制） 
	*/
	public M setCycle(java.lang.Integer cycle) {
		set("cycle", cycle);
		return (M)this;
	}

	/**
	*获取学习周期（学制） 
	*/
	public java.lang.Integer getCycle() {
		return getInt("cycle");
	}

	/**
	*设置入学年份 
	*/
	public M setEnrollYear(java.util.Date enrollYear) {
		set("enroll_year", enrollYear);
		return (M)this;
	}

	/**
	*获取入学年份 
	*/
	public java.util.Date getEnrollYear() {
		return get("enroll_year");
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
	*设置校验成功失败标识 
	*/
	public M setType(java.lang.String type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取校验成功失败标识 
	*/
	public java.lang.String getType() {
		return getStr("type");
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
	*设置失败原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取失败原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
	}

	/**
	*设置导入批次号 
	*/
	public M setBatchNum(java.lang.String batchNum) {
		set("batch_num", batchNum);
		return (M)this;
	}

	/**
	*获取导入批次号 
	*/
	public java.lang.String getBatchNum() {
		return getStr("batch_num");
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

	/**
	*设置专业名称 
	*/
	public M setMajorName(java.lang.String majorName) {
		set("major_name", majorName);
		return (M)this;
	}

	/**
	*获取专业名称 
	*/
	public java.lang.String getMajorName() {
		return getStr("major_name");
	}

	/**
	*设置院系名称 
	*/
	public M setDepartmentName(java.lang.String departmentName) {
		set("department_name", departmentName);
		return (M)this;
	}

	/**
	*获取院系名称 
	*/
	public java.lang.String getDepartmentName() {
		return getStr("department_name");
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
	*设置院校ID 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取院校ID 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置毕业状态 
	*/
	public M setGraduateStatusDesc(java.lang.String graduateStatusDesc) {
		set("graduate_status_desc", graduateStatusDesc);
		return (M)this;
	}

	/**
	*获取毕业状态 
	*/
	public java.lang.String getGraduateStatusDesc() {
		return getStr("graduate_status_desc");
	}

	/**
	*设置学生类型 
	*/
	public M setStudentTypeDesc(java.lang.String studentTypeDesc) {
		set("student_type_desc", studentTypeDesc);
		return (M)this;
	}

	/**
	*获取学生类型 
	*/
	public java.lang.String getStudentTypeDesc() {
		return getStr("student_type_desc");
	}

}
