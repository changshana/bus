package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * teacher_return_school_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTeacherReturnSchoolInfo<M extends BaseTeacherReturnSchoolInfo<M>> extends Model<M> implements IBean {

	/**
	*设置名称 
	*/
	public M setTeacherName(java.lang.String teacherName) {
		set("teacher_name", teacherName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getTeacherName() {
		return getStr("teacher_name");
	}

	/**
	*设置名称 
	*/
	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getSex() {
		return getStr("sex");
	}

	/**
	*设置籍贯 
	*/
	public M setNative(java.lang.String _native) {
		set("native", _native);
		return (M)this;
	}

	/**
	*获取籍贯 
	*/
	public java.lang.String getNative() {
		return getStr("native");
	}

	/**
	*设置身份证 
	*/
	public M setIdentity(java.lang.String identity) {
		set("identity", identity);
		return (M)this;
	}

	/**
	*获取身份证 
	*/
	public java.lang.String getIdentity() {
		return getStr("identity");
	}

	/**
	*设置岗位 
	*/
	public M setStation(java.lang.String station) {
		set("station", station);
		return (M)this;
	}

	/**
	*获取岗位 
	*/
	public java.lang.String getStation() {
		return getStr("station");
	}

	/**
	*设置离校时间 
	*/
	public M setLeaveSchoolTime(java.util.Date leaveSchoolTime) {
		set("leave_school_time", leaveSchoolTime);
		return (M)this;
	}

	/**
	*获取离校时间 
	*/
	public java.util.Date getLeaveSchoolTime() {
		return get("leave_school_time");
	}

	/**
	*设置返校时间 
	*/
	public M setReturnSchoolTime(java.util.Date returnSchoolTime) {
		set("return_school_time", returnSchoolTime);
		return (M)this;
	}

	/**
	*获取返校时间 
	*/
	public java.util.Date getReturnSchoolTime() {
		return get("return_school_time");
	}

	/**
	*设置离校轨迹 
	*/
	public M setLeaveSchoolTrack(java.lang.String leaveSchoolTrack) {
		set("leave_school_track", leaveSchoolTrack);
		return (M)this;
	}

	/**
	*获取离校轨迹 
	*/
	public java.lang.String getLeaveSchoolTrack() {
		return getStr("leave_school_track");
	}

	/**
	*设置返校交通过程 
	*/
	public M setReturnSchoolTrafficCourse(java.lang.String returnSchoolTrafficCourse) {
		set("return_school_traffic_course", returnSchoolTrafficCourse);
		return (M)this;
	}

	/**
	*获取返校交通过程 
	*/
	public java.lang.String getReturnSchoolTrafficCourse() {
		return getStr("return_school_traffic_course");
	}

	/**
	*设置家人症状 
	*/
	public M setFamilySymptom(java.lang.String familySymptom) {
		set("family_symptom", familySymptom);
		return (M)this;
	}

	/**
	*获取家人症状 
	*/
	public java.lang.String getFamilySymptom() {
		return getStr("family_symptom");
	}

	/**
	*设置家人接触武汉 
	*/
	public M setFamilyContactWuhan(java.lang.String familyContactWuhan) {
		set("family_contact_wuhan", familyContactWuhan);
		return (M)this;
	}

	/**
	*获取家人接触武汉 
	*/
	public java.lang.String getFamilyContactWuhan() {
		return getStr("family_contact_wuhan");
	}

	/**
	*设置家人接触野生动物 
	*/
	public M setFamilyContactWildlife(java.lang.String familyContactWildlife) {
		set("family_contact_wildlife", familyContactWildlife);
		return (M)this;
	}

	/**
	*获取家人接触野生动物 
	*/
	public java.lang.String getFamilyContactWildlife() {
		return getStr("family_contact_wildlife");
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
	*设置ID 
	*/
	public M setReturnSchoolInfoId(java.lang.Integer returnSchoolInfoId) {
		set("return_school_info_id", returnSchoolInfoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getReturnSchoolInfoId() {
		return getInt("return_school_info_id");
	}

}
