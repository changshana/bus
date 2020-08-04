package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_teacher:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxTeacher<M extends BasePxTeacher<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setTeacherId(java.lang.Integer teacherId) {
		set("teacher_id", teacherId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTeacherId() {
		return getInt("teacher_id");
	}

	/**
	*设置学校id 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取学校id 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
	}

	/**
	*设置教师身份证号 
	*/
	public M setIdentityCard(java.lang.String identityCard) {
		set("identity_card", identityCard);
		return (M)this;
	}

	/**
	*获取教师身份证号 
	*/
	public java.lang.String getIdentityCard() {
		return getStr("identity_card");
	}

	/**
	*设置姓名 
	*/
	public M setTeacherName(java.lang.String teacherName) {
		set("teacher_name", teacherName);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getTeacherName() {
		return getStr("teacher_name");
	}

	/**
	*设置性别 
	*/
	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.String getSex() {
		return getStr("sex");
	}

	/**
	*设置学历 
	*/
	public M setEducation(java.lang.String education) {
		set("education", education);
		return (M)this;
	}

	/**
	*获取学历 
	*/
	public java.lang.String getEducation() {
		return getStr("education");
	}

	/**
	*设置政治面貌 
	*/
	public M setPoliticalStatus(java.lang.String politicalStatus) {
		set("political_status", politicalStatus);
		return (M)this;
	}

	/**
	*获取政治面貌 
	*/
	public java.lang.String getPoliticalStatus() {
		return getStr("political_status");
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
	*设置工作性质（全职、兼职） 
	*/
	public M setJobNature(java.lang.String jobNature) {
		set("job_nature", jobNature);
		return (M)this;
	}

	/**
	*获取工作性质（全职、兼职） 
	*/
	public java.lang.String getJobNature() {
		return getStr("job_nature");
	}

	/**
	*设置职业资格名称 
	*/
	public M setQualificationsName(java.lang.String qualificationsName) {
		set("qualifications_name", qualificationsName);
		return (M)this;
	}

	/**
	*获取职业资格名称 
	*/
	public java.lang.String getQualificationsName() {
		return getStr("qualifications_name");
	}

	/**
	*设置职业资格等级 
	*/
	public M setQualificationsLevel(java.lang.String qualificationsLevel) {
		set("qualifications_level", qualificationsLevel);
		return (M)this;
	}

	/**
	*获取职业资格等级 
	*/
	public java.lang.String getQualificationsLevel() {
		return getStr("qualifications_level");
	}

	/**
	*设置教师类型(固定师资、聘用师资) 
	*/
	public M setTeacherType(java.lang.String teacherType) {
		set("teacher_type", teacherType);
		return (M)this;
	}

	/**
	*获取教师类型(固定师资、聘用师资) 
	*/
	public java.lang.String getTeacherType() {
		return getStr("teacher_type");
	}

	/**
	*设置从教开始日期 
	*/
	public M setStartTeachingDatetime(java.util.Date startTeachingDatetime) {
		set("start_teaching_datetime", startTeachingDatetime);
		return (M)this;
	}

	/**
	*获取从教开始日期 
	*/
	public java.util.Date getStartTeachingDatetime() {
		return get("start_teaching_datetime");
	}

	/**
	*设置个人简介 
	*/
	public M setTeacherInto(java.lang.String teacherInto) {
		set("teacher_into", teacherInto);
		return (M)this;
	}

	/**
	*获取个人简介 
	*/
	public java.lang.String getTeacherInto() {
		return getStr("teacher_into");
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
	*设置用户id 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取用户id 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

}
