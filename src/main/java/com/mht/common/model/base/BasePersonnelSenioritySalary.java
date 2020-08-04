package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_seniority_salary:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelSenioritySalary<M extends BasePersonnelSenioritySalary<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSenioritySalaryId(java.lang.Integer senioritySalaryId) {
		set("seniority_salary_id", senioritySalaryId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSenioritySalaryId() {
		return getInt("seniority_salary_id");
	}

	/**
	*设置员工ID 
	*/
	public M setStaffInfoId(java.lang.Integer staffInfoId) {
		set("staff_info_id", staffInfoId);
		return (M)this;
	}

	/**
	*获取员工ID 
	*/
	public java.lang.Integer getStaffInfoId() {
		return getInt("staff_info_id");
	}

	/**
	*设置工龄 
	*/
	public M setWorkYear(java.lang.String workYear) {
		set("work_year", workYear);
		return (M)this;
	}

	/**
	*获取工龄 
	*/
	public java.lang.String getWorkYear() {
		return getStr("work_year");
	}

	/**
	*设置发放年月 
	*/
	public M setGrantTime(java.lang.String grantTime) {
		set("grant_time", grantTime);
		return (M)this;
	}

	/**
	*获取发放年月 
	*/
	public java.lang.String getGrantTime() {
		return getStr("grant_time");
	}

	/**
	*设置金额 
	*/
	public M setGrantAmount(java.math.BigDecimal grantAmount) {
		set("grant_amount", grantAmount);
		return (M)this;
	}

	/**
	*获取金额 
	*/
	public java.math.BigDecimal getGrantAmount() {
		return get("grant_amount");
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
	*设置审核人 
	*/
	public M setAuditor(java.lang.String auditor) {
		set("auditor", auditor);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getAuditor() {
		return getStr("auditor");
	}

	/**
	*设置审核时间 
	*/
	public M setAuditTime(java.util.Date auditTime) {
		set("audit_time", auditTime);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.util.Date getAuditTime() {
		return get("audit_time");
	}

	/**
	*设置审核理由 
	*/
	public M setAuditReason(java.lang.String auditReason) {
		set("audit_reason", auditReason);
		return (M)this;
	}

	/**
	*获取审核理由 
	*/
	public java.lang.String getAuditReason() {
		return getStr("audit_reason");
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

}
