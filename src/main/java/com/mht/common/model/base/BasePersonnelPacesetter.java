package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_pacesetter:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPacesetter<M extends BasePersonnelPacesetter<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPacesetterId(java.lang.Integer pacesetterId) {
		set("pacesetter_id", pacesetterId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPacesetterId() {
		return getInt("pacesetter_id");
	}

	/**
	*设置员工ID 
	*/
	public M setEmployeeInformationId(java.lang.Integer employeeInformationId) {
		set("employee_information_id", employeeInformationId);
		return (M)this;
	}

	/**
	*获取员工ID 
	*/
	public java.lang.Integer getEmployeeInformationId() {
		return getInt("employee_information_id");
	}

	/**
	*设置审核状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置标兵事迹 
	*/
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取标兵事迹 
	*/
	public java.lang.String getContent() {
		return getStr("content");
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
	*设置评定年份 
	*/
	public M setTheYear(java.lang.String theYear) {
		set("the_year", theYear);
		return (M)this;
	}

	/**
	*获取评定年份 
	*/
	public java.lang.String getTheYear() {
		return getStr("the_year");
	}

	/**
	*设置评定时间 
	*/
	public M setTheTime(java.util.Date theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取评定时间 
	*/
	public java.util.Date getTheTime() {
		return get("the_time");
	}

	/**
	*设置标兵类型 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取标兵类型 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	*设置数据有效状态 
	*/
	public M setDataStatus(java.lang.Integer dataStatus) {
		set("data_status", dataStatus);
		return (M)this;
	}

	/**
	*获取数据有效状态 
	*/
	public java.lang.Integer getDataStatus() {
		return getInt("data_status");
	}

}
