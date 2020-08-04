package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_audit:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxAudit<M extends BasePxAudit<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAuditId(java.lang.Integer auditId) {
		set("audit_id", auditId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAuditId() {
		return getInt("audit_id");
	}

	/**
	*设置业务流水号 
	*/
	public M setOperationId(java.lang.Integer operationId) {
		set("operation_id", operationId);
		return (M)this;
	}

	/**
	*获取业务流水号 
	*/
	public java.lang.Integer getOperationId() {
		return getInt("operation_id");
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
	*设置审核时间 
	*/
	public M setAuditDate(java.util.Date auditDate) {
		set("audit_date", auditDate);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.util.Date getAuditDate() {
		return get("audit_date");
	}

	/**
	*设置审核人 
	*/
	public M setAuditPerson(java.lang.String auditPerson) {
		set("audit_person", auditPerson);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getAuditPerson() {
		return getStr("audit_person");
	}

	/**
	*设置审核备注 
	*/
	public M setAuditRemark(java.lang.String auditRemark) {
		set("audit_remark", auditRemark);
		return (M)this;
	}

	/**
	*获取审核备注 
	*/
	public java.lang.String getAuditRemark() {
		return getStr("audit_remark");
	}

	/**
	*设置审核业务类型 
	*/
	public M setAuditType(java.lang.Integer auditType) {
		set("audit_type", auditType);
		return (M)this;
	}

	/**
	*获取审核业务类型 
	*/
	public java.lang.Integer getAuditType() {
		return getInt("audit_type");
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

}
