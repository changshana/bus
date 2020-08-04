package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_contract_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelContractTemp<M extends BasePersonnelContractTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setContractId(java.lang.Integer contractId) {
		set("contract_id", contractId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getContractId() {
		return getInt("contract_id");
	}

	/**
	*设置人员id 
	*/
	public M setEmployeeId(java.lang.Integer employeeId) {
		set("employee_id", employeeId);
		return (M)this;
	}

	/**
	*获取人员id 
	*/
	public java.lang.Integer getEmployeeId() {
		return getInt("employee_id");
	}

	/**
	*设置合同类型 
	*/
	public M setContractType(java.lang.String contractType) {
		set("contract_type", contractType);
		return (M)this;
	}

	/**
	*获取合同类型 
	*/
	public java.lang.String getContractType() {
		return getStr("contract_type");
	}

	/**
	*设置合同编号 
	*/
	public M setContractNum(java.lang.String contractNum) {
		set("contract_num", contractNum);
		return (M)this;
	}

	/**
	*获取合同编号 
	*/
	public java.lang.String getContractNum() {
		return getStr("contract_num");
	}

	/**
	*设置合同起始日期 
	*/
	public M setContractStart(java.lang.String contractStart) {
		set("contract_start", contractStart);
		return (M)this;
	}

	/**
	*获取合同起始日期 
	*/
	public java.lang.String getContractStart() {
		return getStr("contract_start");
	}

	/**
	*设置合同终止日期 
	*/
	public M setContractEnd(java.lang.String contractEnd) {
		set("contract_end", contractEnd);
		return (M)this;
	}

	/**
	*获取合同终止日期 
	*/
	public java.lang.String getContractEnd() {
		return getStr("contract_end");
	}

	/**
	*设置存档位置 
	*/
	public M setArchivingPosition(java.lang.String archivingPosition) {
		set("archiving_position", archivingPosition);
		return (M)this;
	}

	/**
	*获取存档位置 
	*/
	public java.lang.String getArchivingPosition() {
		return getStr("archiving_position");
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
	public M setCreationTime(java.util.Date creationTime) {
		set("creation_time", creationTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreationTime() {
		return get("creation_time");
	}

	/**
	*设置期限 
	*/
	public M setTerm(java.lang.Integer term) {
		set("term", term);
		return (M)this;
	}

	/**
	*获取期限 
	*/
	public java.lang.Integer getTerm() {
		return getInt("term");
	}

	/**
	*设置合同终止状态 
	*/
	public M setOverStatus(java.lang.Integer overStatus) {
		set("over_status", overStatus);
		return (M)this;
	}

	/**
	*获取合同终止状态 
	*/
	public java.lang.Integer getOverStatus() {
		return getInt("over_status");
	}

	/**
	*设置错误原因 
	*/
	public M setErrorReason(java.lang.String errorReason) {
		set("error_reason", errorReason);
		return (M)this;
	}

	/**
	*获取错误原因 
	*/
	public java.lang.String getErrorReason() {
		return getStr("error_reason");
	}

	/**
	*设置 
	*/
	public M setTempType(java.lang.Integer tempType) {
		set("temp_type", tempType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTempType() {
		return getInt("temp_type");
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
	*设置身份证号 
	*/
	public M setIdCard(java.lang.String idCard) {
		set("idCard", idCard);
		return (M)this;
	}

	/**
	*获取身份证号 
	*/
	public java.lang.String getIdCard() {
		return getStr("idCard");
	}

	/**
	*设置批次号 
	*/
	public M setNubmerCard(java.lang.String nubmerCard) {
		set("nubmerCard", nubmerCard);
		return (M)this;
	}

	/**
	*获取批次号 
	*/
	public java.lang.String getNubmerCard() {
		return getStr("nubmerCard");
	}

	/**
	*设置员工姓名 
	*/
	public M setEmployeeName(java.lang.String employeeName) {
		set("employee_name", employeeName);
		return (M)this;
	}

	/**
	*获取员工姓名 
	*/
	public java.lang.String getEmployeeName() {
		return getStr("employee_name");
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
	*设置合同年限 
	*/
	public M setContractYear(java.lang.String contractYear) {
		set("contract_year", contractYear);
		return (M)this;
	}

	/**
	*获取合同年限 
	*/
	public java.lang.String getContractYear() {
		return getStr("contract_year");
	}

}
