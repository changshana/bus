package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_social_security_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelSocialSecurityTemp<M extends BasePersonnelSocialSecurityTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSocialSecurityId(java.lang.Integer socialSecurityId) {
		set("social_security_id", socialSecurityId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSocialSecurityId() {
		return getInt("social_security_id");
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
	*设置保险类型 
	*/
	public M setInsuranceType(java.lang.String insuranceType) {
		set("insurance_type", insuranceType);
		return (M)this;
	}

	/**
	*获取保险类型 
	*/
	public java.lang.String getInsuranceType() {
		return getStr("insurance_type");
	}

	/**
	*设置经费来源 
	*/
	public M setFundsSource(java.lang.String fundsSource) {
		set("funds_source", fundsSource);
		return (M)this;
	}

	/**
	*获取经费来源 
	*/
	public java.lang.String getFundsSource() {
		return getStr("funds_source");
	}

	/**
	*设置社保保险(个人编码) 
	*/
	public M setCardNum(java.lang.String cardNum) {
		set("card_num", cardNum);
		return (M)this;
	}

	/**
	*获取社保保险(个人编码) 
	*/
	public java.lang.String getCardNum() {
		return getStr("card_num");
	}

	/**
	*设置参保时间 
	*/
	public M setInsuredDate(java.util.Date insuredDate) {
		set("insured_date", insuredDate);
		return (M)this;
	}

	/**
	*获取参保时间 
	*/
	public java.util.Date getInsuredDate() {
		return get("insured_date");
	}

	/**
	*设置参保终止日期 
	*/
	public M setInsuredEndDate(java.util.Date insuredEndDate) {
		set("insured_end_date", insuredEndDate);
		return (M)this;
	}

	/**
	*获取参保终止日期 
	*/
	public java.util.Date getInsuredEndDate() {
		return get("insured_end_date");
	}

	/**
	*设置社保关系 
	*/
	public M setInsuredRelation(java.lang.String insuredRelation) {
		set("insured_relation", insuredRelation);
		return (M)this;
	}

	/**
	*获取社保关系 
	*/
	public java.lang.String getInsuredRelation() {
		return getStr("insured_relation");
	}

	/**
	*设置参保状态 
	*/
	public M setInsuredStatus(java.lang.String insuredStatus) {
		set("insured_status", insuredStatus);
		return (M)this;
	}

	/**
	*获取参保状态 
	*/
	public java.lang.String getInsuredStatus() {
		return getStr("insured_status");
	}

	/**
	*设置参保地 
	*/
	public M setInsuredMechanism(java.lang.String insuredMechanism) {
		set("insured_mechanism", insuredMechanism);
		return (M)this;
	}

	/**
	*获取参保地 
	*/
	public java.lang.String getInsuredMechanism() {
		return getStr("insured_mechanism");
	}

	/**
	*设置人员缴费类型 
	*/
	public M setPaymentType(java.lang.String paymentType) {
		set("payment_type", paymentType);
		return (M)this;
	}

	/**
	*获取人员缴费类型 
	*/
	public java.lang.String getPaymentType() {
		return getStr("payment_type");
	}

	/**
	*设置申报工资 
	*/
	public M setSocialMoney(java.lang.String socialMoney) {
		set("social_money", socialMoney);
		return (M)this;
	}

	/**
	*获取申报工资 
	*/
	public java.lang.String getSocialMoney() {
		return getStr("social_money");
	}

	/**
	*设置保障部参保时间（已舍弃字段） 
	*/
	public M setDeptInsuredDate(java.util.Date deptInsuredDate) {
		set("dept_insured_date", deptInsuredDate);
		return (M)this;
	}

	/**
	*获取保障部参保时间（已舍弃字段） 
	*/
	public java.util.Date getDeptInsuredDate() {
		return get("dept_insured_date");
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
	*设置人员姓名 
	*/
	public M setEmployeeName(java.lang.String employeeName) {
		set("employee_name", employeeName);
		return (M)this;
	}

	/**
	*获取人员姓名 
	*/
	public java.lang.String getEmployeeName() {
		return getStr("employee_name");
	}

	/**
	*设置部门姓名 
	*/
	public M setDeptName(java.lang.String deptName) {
		set("dept_name", deptName);
		return (M)this;
	}

	/**
	*获取部门姓名 
	*/
	public java.lang.String getDeptName() {
		return getStr("dept_name");
	}

	/**
	*设置成功状态 
	*/
	public M setImportStatus(java.lang.Integer importStatus) {
		set("import_status", importStatus);
		return (M)this;
	}

	/**
	*获取成功状态 
	*/
	public java.lang.Integer getImportStatus() {
		return getInt("import_status");
	}

	/**
	*设置经办机构id(已舍弃字段) 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取经办机构id(已舍弃字段) 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
	}

	/**
	*设置申请日期 
	*/
	public M setAuditorDate(java.util.Date auditorDate) {
		set("auditor_date", auditorDate);
		return (M)this;
	}

	/**
	*获取申请日期 
	*/
	public java.util.Date getAuditorDate() {
		return get("auditor_date");
	}

	/**
	*设置文化程度 
	*/
	public M setCulture(java.lang.String culture) {
		set("culture", culture);
		return (M)this;
	}

	/**
	*获取文化程度 
	*/
	public java.lang.String getCulture() {
		return getStr("culture");
	}

}
