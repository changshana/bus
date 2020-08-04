package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_contract_change:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelContractChange<M extends BasePersonnelContractChange<M>> extends Model<M> implements IBean {

	/**
	*设置id 
	*/
	public M setContractChangeId(java.lang.Integer contractChangeId) {
		set("contract_change_id", contractChangeId);
		return (M)this;
	}

	/**
	*获取id 
	*/
	public java.lang.Integer getContractChangeId() {
		return getInt("contract_change_id");
	}

	/**
	*设置合同id 
	*/
	public M setContractId(java.lang.Integer contractId) {
		set("contract_id", contractId);
		return (M)this;
	}

	/**
	*获取合同id 
	*/
	public java.lang.Integer getContractId() {
		return getInt("contract_id");
	}

	/**
	*设置变更原因 
	*/
	public M setChangeReason(java.lang.String changeReason) {
		set("change_reason", changeReason);
		return (M)this;
	}

	/**
	*获取变更原因 
	*/
	public java.lang.String getChangeReason() {
		return getStr("change_reason");
	}

	/**
	*设置变更时间 
	*/
	public M setChangeTime(java.util.Date changeTime) {
		set("change_time", changeTime);
		return (M)this;
	}

	/**
	*获取变更时间 
	*/
	public java.util.Date getChangeTime() {
		return get("change_time");
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
	*设置审核日期 
	*/
	public M setAuditorDate(java.util.Date auditorDate) {
		set("auditor_date", auditorDate);
		return (M)this;
	}

	/**
	*获取审核日期 
	*/
	public java.util.Date getAuditorDate() {
		return get("auditor_date");
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
	*设置变更状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取变更状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置拒绝理由 
	*/
	public M setRefuseReson(java.lang.String refuseReson) {
		set("refuse_reson", refuseReson);
		return (M)this;
	}

	/**
	*获取拒绝理由 
	*/
	public java.lang.String getRefuseReson() {
		return getStr("refuse_reson");
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
