package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * student_return_school_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseStudentReturnSchoolInfo<M extends BaseStudentReturnSchoolInfo<M>> extends Model<M> implements IBean {

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

	/**
	*设置名称 
	*/
	public M setStudentName(java.lang.String studentName) {
		set("student_name", studentName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getStudentName() {
		return getStr("student_name");
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
	*设置年纪 
	*/
	public M setGrade(java.lang.String grade) {
		set("grade", grade);
		return (M)this;
	}

	/**
	*获取年纪 
	*/
	public java.lang.String getGrade() {
		return getStr("grade");
	}

	/**
	*设置返回时间 
	*/
	public M setReturnTime(java.util.Date returnTime) {
		set("return_time", returnTime);
		return (M)this;
	}

	/**
	*获取返回时间 
	*/
	public java.util.Date getReturnTime() {
		return get("return_time");
	}

	/**
	*设置所在地址 
	*/
	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	/**
	*获取所在地址 
	*/
	public java.lang.String getAddress() {
		return getStr("address");
	}

	/**
	*设置交通方式 
	*/
	public M setMeansTransportation(java.lang.String meansTransportation) {
		set("means_transportation", meansTransportation);
		return (M)this;
	}

	/**
	*获取交通方式 
	*/
	public java.lang.String getMeansTransportation() {
		return getStr("means_transportation");
	}

	/**
	*设置现象 
	*/
	public M setOneselfPhenomenon(java.lang.String oneselfPhenomenon) {
		set("oneself_phenomenon", oneselfPhenomenon);
		return (M)this;
	}

	/**
	*获取现象 
	*/
	public java.lang.String getOneselfPhenomenon() {
		return getStr("oneself_phenomenon");
	}

	/**
	*设置接触者现象 
	*/
	public M setContactPhenomenon(java.lang.String contactPhenomenon) {
		set("contact_phenomenon", contactPhenomenon);
		return (M)this;
	}

	/**
	*获取接触者现象 
	*/
	public java.lang.String getContactPhenomenon() {
		return getStr("contact_phenomenon");
	}

	/**
	*设置旅游 
	*/
	public M setTravel(java.lang.String travel) {
		set("travel", travel);
		return (M)this;
	}

	/**
	*获取旅游 
	*/
	public java.lang.String getTravel() {
		return getStr("travel");
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
	*设置学号 
	*/
	public M setStudentNumber(java.lang.String studentNumber) {
		set("student_number", studentNumber);
		return (M)this;
	}

	/**
	*获取学号 
	*/
	public java.lang.String getStudentNumber() {
		return getStr("student_number");
	}

}
