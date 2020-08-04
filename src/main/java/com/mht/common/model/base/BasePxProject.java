package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_project:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxProject<M extends BasePxProject<M>> extends Model<M> implements IBean {

	/**
	*设置项目id 
	*/
	public M setProjectId(java.lang.Integer projectId) {
		set("project_id", projectId);
		return (M)this;
	}

	/**
	*获取项目id 
	*/
	public java.lang.Integer getProjectId() {
		return getInt("project_id");
	}

	/**
	*设置项目编号 
	*/
	public M setProjectNum(java.lang.String projectNum) {
		set("project_num", projectNum);
		return (M)this;
	}

	/**
	*获取项目编号 
	*/
	public java.lang.String getProjectNum() {
		return getStr("project_num");
	}

	/**
	*设置项目名称 
	*/
	public M setProjectName(java.lang.String projectName) {
		set("project_name", projectName);
		return (M)this;
	}

	/**
	*获取项目名称 
	*/
	public java.lang.String getProjectName() {
		return getStr("project_name");
	}

	/**
	*设置招生对象 
	*/
	public M setEnrollObject(java.lang.String enrollObject) {
		set("enroll_object", enrollObject);
		return (M)this;
	}

	/**
	*获取招生对象 
	*/
	public java.lang.String getEnrollObject() {
		return getStr("enroll_object");
	}

	/**
	*设置项目层次 
	*/
	public M setProjectLevel(java.lang.String projectLevel) {
		set("project_level", projectLevel);
		return (M)this;
	}

	/**
	*获取项目层次 
	*/
	public java.lang.String getProjectLevel() {
		return getStr("project_level");
	}

	/**
	*设置上课形式 
	*/
	public M setTeachingStyle(java.lang.String teachingStyle) {
		set("teaching_style", teachingStyle);
		return (M)this;
	}

	/**
	*获取上课形式 
	*/
	public java.lang.String getTeachingStyle() {
		return getStr("teaching_style");
	}

	/**
	*设置开始时间 
	*/
	public M setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
		return (M)this;
	}

	/**
	*获取开始时间 
	*/
	public java.util.Date getStartTime() {
		return get("start_time");
	}

	/**
	*设置结束时间 
	*/
	public M setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取结束时间 
	*/
	public java.util.Date getEndTime() {
		return get("end_time");
	}

	/**
	*设置实际开始时间 
	*/
	public M setActualStartTime(java.util.Date actualStartTime) {
		set("actual_start_time", actualStartTime);
		return (M)this;
	}

	/**
	*获取实际开始时间 
	*/
	public java.util.Date getActualStartTime() {
		return get("actual_start_time");
	}

	/**
	*设置证书设置id 
	*/
	public M setCertificateSettingId(java.lang.Integer certificateSettingId) {
		set("certificate_setting_id", certificateSettingId);
		return (M)this;
	}

	/**
	*获取证书设置id 
	*/
	public java.lang.Integer getCertificateSettingId() {
		return getInt("certificate_setting_id");
	}

	/**
	*设置证书发放类型 
	*/
	public M setCertificateType(java.lang.String certificateType) {
		set("certificate_type", certificateType);
		return (M)this;
	}

	/**
	*获取证书发放类型 
	*/
	public java.lang.String getCertificateType() {
		return getStr("certificate_type");
	}

	/**
	*设置学员人数 
	*/
	public M setStudentCount(java.lang.Integer studentCount) {
		set("student_count", studentCount);
		return (M)this;
	}

	/**
	*获取学员人数 
	*/
	public java.lang.Integer getStudentCount() {
		return getInt("student_count");
	}

	/**
	*设置学员来源 
	*/
	public M setStudentSource(java.lang.String studentSource) {
		set("student_source", studentSource);
		return (M)this;
	}

	/**
	*获取学员来源 
	*/
	public java.lang.String getStudentSource() {
		return getStr("student_source");
	}

	/**
	*设置项目负责人 
	*/
	public M setProjectLeader(java.lang.String projectLeader) {
		set("project_leader", projectLeader);
		return (M)this;
	}

	/**
	*获取项目负责人 
	*/
	public java.lang.String getProjectLeader() {
		return getStr("project_leader");
	}

	/**
	*设置联系电话 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
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
	*设置培训学校id 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取培训学校id 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
	}

}
