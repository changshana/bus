package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_retire_management:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelRetireManagement<M extends BasePersonnelRetireManagement<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRetireManagementId(java.lang.Integer retireManagementId) {
		set("retire_management_id", retireManagementId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRetireManagementId() {
		return getInt("retire_management_id");
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
	*设置离退日期 
	*/
	public M setTheTime(java.util.Date theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取离退日期 
	*/
	public java.util.Date getTheTime() {
		return get("the_time");
	}

	/**
	*设置离退类型 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取离退类型 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
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
	*设置经办机构id 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取经办机构id 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
	}

	/**
	*设置合同变更原因 
	*/
	public M setReason(java.lang.Integer reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取合同变更原因 
	*/
	public java.lang.Integer getReason() {
		return getInt("reason");
	}

}
