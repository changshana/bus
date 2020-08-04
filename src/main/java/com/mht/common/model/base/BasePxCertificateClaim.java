package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_certificate_claim:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxCertificateClaim<M extends BasePxCertificateClaim<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCertificateClaimId(java.lang.Integer certificateClaimId) {
		set("certificate_claim_id", certificateClaimId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCertificateClaimId() {
		return getInt("certificate_claim_id");
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
	*设置学员ID 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学员ID 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置领取时间 
	*/
	public M setClaimTime(java.util.Date claimTime) {
		set("claim_time", claimTime);
		return (M)this;
	}

	/**
	*获取领取时间 
	*/
	public java.util.Date getClaimTime() {
		return get("claim_time");
	}

	/**
	*设置审核状态 
	*/
	public M setAuditStatus(java.lang.Integer auditStatus) {
		set("audit_status", auditStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getAuditStatus() {
		return getInt("audit_status");
	}

	/**
	*设置审核不通过原因 
	*/
	public M setAuditReason(java.lang.String auditReason) {
		set("audit_reason", auditReason);
		return (M)this;
	}

	/**
	*获取审核不通过原因 
	*/
	public java.lang.String getAuditReason() {
		return getStr("audit_reason");
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
