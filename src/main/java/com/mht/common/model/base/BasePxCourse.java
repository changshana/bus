package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_course:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxCourse<M extends BasePxCourse<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCourseId(java.lang.Integer courseId) {
		set("course_id", courseId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCourseId() {
		return getInt("course_id");
	}

	/**
	*设置学校ID 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取学校ID 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
	}

	/**
	*设置名称 
	*/
	public M setCourseName(java.lang.String courseName) {
		set("course_name", courseName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getCourseName() {
		return getStr("course_name");
	}

	/**
	*设置课程宣导信息 
	*/
	public M setCourseIntro(java.lang.String courseIntro) {
		set("course_intro", courseIntro);
		return (M)this;
	}

	/**
	*获取课程宣导信息 
	*/
	public java.lang.String getCourseIntro() {
		return getStr("course_intro");
	}

	/**
	*设置课程类型（技能培训、成教等） 
	*/
	public M setCourseType(java.lang.String courseType) {
		set("course_type", courseType);
		return (M)this;
	}

	/**
	*获取课程类型（技能培训、成教等） 
	*/
	public java.lang.String getCourseType() {
		return getStr("course_type");
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
	*设置截止时间 
	*/
	public M setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取截止时间 
	*/
	public java.util.Date getEndTime() {
		return get("end_time");
	}

	/**
	*设置联系电话 
	*/
	public M setTel(java.lang.String tel) {
		set("tel", tel);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getTel() {
		return getStr("tel");
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

}
