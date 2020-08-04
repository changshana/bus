package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_certificate:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelCertificate<M extends BasePersonnelCertificate<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setCertificateId(java.lang.Integer certificateId) {
		set("certificate_id", certificateId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getCertificateId() {
		return getInt("certificate_id");
	}

	/**
	*设置员工id 
	*/
	public M setEmployeeId(java.lang.Integer employeeId) {
		set("employee_id", employeeId);
		return (M)this;
	}

	/**
	*获取员工id 
	*/
	public java.lang.Integer getEmployeeId() {
		return getInt("employee_id");
	}

	/**
	*设置证书类型id 
	*/
	public M setCertificateName(java.lang.Integer certificateName) {
		set("certificate_name", certificateName);
		return (M)this;
	}

	/**
	*获取证书类型id 
	*/
	public java.lang.Integer getCertificateName() {
		return getInt("certificate_name");
	}

	/**
	*设置证书起始时间 
	*/
	public M setCertificateStartDate(java.util.Date certificateStartDate) {
		set("certificate_start_date", certificateStartDate);
		return (M)this;
	}

	/**
	*获取证书起始时间 
	*/
	public java.util.Date getCertificateStartDate() {
		return get("certificate_start_date");
	}

	/**
	*设置证书有效期 
	*/
	public M setCertificateEndDate(java.util.Date certificateEndDate) {
		set("certificate_end_date", certificateEndDate);
		return (M)this;
	}

	/**
	*获取证书有效期 
	*/
	public java.util.Date getCertificateEndDate() {
		return get("certificate_end_date");
	}

	/**
	*设置是否享受补贴 
	*/
	public M setIssubsidy(java.lang.String issubsidy) {
		set("issubsidy", issubsidy);
		return (M)this;
	}

	/**
	*获取是否享受补贴 
	*/
	public java.lang.String getIssubsidy() {
		return getStr("issubsidy");
	}

	/**
	*设置补贴金额 
	*/
	public M setSubsidy(java.lang.String subsidy) {
		set("subsidy", subsidy);
		return (M)this;
	}

	/**
	*获取补贴金额 
	*/
	public java.lang.String getSubsidy() {
		return getStr("subsidy");
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
	public M setCreatorTime(java.util.Date creatorTime) {
		set("creator_time", creatorTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreatorTime() {
		return get("creator_time");
	}

	/**
	*设置拒绝理由 
	*/
	public M setRefusal(java.lang.String refusal) {
		set("refusal", refusal);
		return (M)this;
	}

	/**
	*获取拒绝理由 
	*/
	public java.lang.String getRefusal() {
		return getStr("refusal");
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
	*设置审核状态 
	*/
	public M setAuditStatus(java.lang.String auditStatus) {
		set("audit_status", auditStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.String getAuditStatus() {
		return getStr("audit_status");
	}

	/**
	*设置审核时间 
	*/
	public M setAuditorDate(java.util.Date auditorDate) {
		set("auditor_date", auditorDate);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.util.Date getAuditorDate() {
		return get("auditor_date");
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
