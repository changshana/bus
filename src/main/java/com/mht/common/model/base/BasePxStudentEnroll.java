package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_student_enroll:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxStudentEnroll<M extends BasePxStudentEnroll<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setEnrollId(java.lang.Integer enrollId) {
		set("enroll_id", enrollId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getEnrollId() {
		return getInt("enroll_id");
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
	*设置班级id 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取班级id 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
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

	/**
	*设置入学日期 
	*/
	public M setEnrollDate(java.util.Date enrollDate) {
		set("enroll_date", enrollDate);
		return (M)this;
	}

	/**
	*获取入学日期 
	*/
	public java.util.Date getEnrollDate() {
		return get("enroll_date");
	}

}
