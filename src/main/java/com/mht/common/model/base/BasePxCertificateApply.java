package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_certificate_apply:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxCertificateApply<M extends BasePxCertificateApply<M>> extends Model<M> implements IBean {

	/**
	*设置申请id 
	*/
	public M setApplyId(java.lang.Integer applyId) {
		set("apply_id", applyId);
		return (M)this;
	}

	/**
	*获取申请id 
	*/
	public java.lang.Integer getApplyId() {
		return getInt("apply_id");
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
	*设置证书号 
	*/
	public M setCertificateNum(java.lang.String certificateNum) {
		set("certificate_num", certificateNum);
		return (M)this;
	}

	/**
	*获取证书号 
	*/
	public java.lang.String getCertificateNum() {
		return getStr("certificate_num");
	}

	/**
	*设置证书名称 
	*/
	public M setCertificateName(java.lang.String certificateName) {
		set("certificate_name", certificateName);
		return (M)this;
	}

	/**
	*获取证书名称 
	*/
	public java.lang.String getCertificateName() {
		return getStr("certificate_name");
	}

	/**
	*设置证书发放类型 
	*/
	public M setCertificateType(java.lang.String certificateType) {
		set("certificate_type", certificateType);
		return (M)this;
	}

	/**
	*获取证书发放类型 
	*/
	public java.lang.String getCertificateType() {
		return getStr("certificate_type");
	}

	/**
	*设置申请时间 
	*/
	public M setApplyTime(java.util.Date applyTime) {
		set("apply_time", applyTime);
		return (M)this;
	}

	/**
	*获取申请时间 
	*/
	public java.util.Date getApplyTime() {
		return get("apply_time");
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
	*设置审核不通过原因 
	*/
	public M setNoauditReason(java.lang.String noauditReason) {
		set("noaudit_reason", noauditReason);
		return (M)this;
	}

	/**
	*获取审核不通过原因 
	*/
	public java.lang.String getNoauditReason() {
		return getStr("noaudit_reason");
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
