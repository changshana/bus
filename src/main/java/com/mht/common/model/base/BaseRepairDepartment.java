package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartment<M extends BaseRepairDepartment<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置 
	*/
	public M setDepartmentName(java.lang.String departmentName) {
		set("department_name", departmentName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDepartmentName() {
		return getStr("department_name");
	}

	/**
	*设置 
	*/
	public M setDepartmentCode(java.lang.String departmentCode) {
		set("department_code", departmentCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDepartmentCode() {
		return getStr("department_code");
	}

	/**
	*设置 
	*/
	public M setSchoolZone(java.lang.Integer schoolZone) {
		set("school_zone", schoolZone);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getSchoolZone() {
		return getInt("school_zone");
	}

	/**
	*设置 
	*/
	public M setMasterUser(java.lang.String masterUser) {
		set("master_user", masterUser);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getMasterUser() {
		return getStr("master_user");
	}

	/**
	*设置 
	*/
	public M setMasterUserMobile(java.lang.String masterUserMobile) {
		set("master_user_mobile", masterUserMobile);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getMasterUserMobile() {
		return getStr("master_user_mobile");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setHandCode(java.lang.String handCode) {
		set("hand_code", handCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getHandCode() {
		return getStr("hand_code");
	}

	/**
	*设置 
	*/
	public M setSiteCode(java.lang.String siteCode) {
		set("site_code", siteCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getSiteCode() {
		return getStr("site_code");
	}

}
