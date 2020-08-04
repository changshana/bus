package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_salary_able:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelSalaryAble<M extends BasePersonnelSalaryAble<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSalaryAbleId(java.lang.Integer salaryAbleId) {
		set("salary_able_id", salaryAbleId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSalaryAbleId() {
		return getInt("salary_able_id");
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
	*设置银行卡号 
	*/
	public M setBankCard(java.lang.String bankCard) {
		set("bank_card", bankCard);
		return (M)this;
	}

	/**
	*获取银行卡号 
	*/
	public java.lang.String getBankCard() {
		return getStr("bank_card");
	}

	/**
	*设置岗位工资 
	*/
	public M setPostSalary(java.math.BigDecimal postSalary) {
		set("post_salary", postSalary);
		return (M)this;
	}

	/**
	*获取岗位工资 
	*/
	public java.math.BigDecimal getPostSalary() {
		return get("post_salary");
	}

	/**
	*设置工龄工资 
	*/
	public M setSenioritySalary(java.math.BigDecimal senioritySalary) {
		set("seniority_salary", senioritySalary);
		return (M)this;
	}

	/**
	*获取工龄工资 
	*/
	public java.math.BigDecimal getSenioritySalary() {
		return get("seniority_salary");
	}

	/**
	*设置津贴(学历、技术) 
	*/
	public M setAllowanceSalary(java.math.BigDecimal allowanceSalary) {
		set("allowance_salary", allowanceSalary);
		return (M)this;
	}

	/**
	*获取津贴(学历、技术) 
	*/
	public java.math.BigDecimal getAllowanceSalary() {
		return get("allowance_salary");
	}

	/**
	*设置绩效与加班 
	*/
	public M setPerformanceOvertime(java.math.BigDecimal performanceOvertime) {
		set("performance_overtime", performanceOvertime);
		return (M)this;
	}

	/**
	*获取绩效与加班 
	*/
	public java.math.BigDecimal getPerformanceOvertime() {
		return get("performance_overtime");
	}

	/**
	*设置应发合计 
	*/
	public M setTotal(java.math.BigDecimal total) {
		set("total", total);
		return (M)this;
	}

	/**
	*获取应发合计 
	*/
	public java.math.BigDecimal getTotal() {
		return get("total");
	}

	/**
	*设置其他 
	*/
	public M setOther(java.math.BigDecimal other) {
		set("other", other);
		return (M)this;
	}

	/**
	*获取其他 
	*/
	public java.math.BigDecimal getOther() {
		return get("other");
	}

	/**
	*设置扣款 
	*/
	public M setDeductMoney(java.math.BigDecimal deductMoney) {
		set("deduct_money", deductMoney);
		return (M)this;
	}

	/**
	*获取扣款 
	*/
	public java.math.BigDecimal getDeductMoney() {
		return get("deduct_money");
	}

	/**
	*设置社保个人缴费金额 
	*/
	public M setSocialSecurityPerson(java.math.BigDecimal socialSecurityPerson) {
		set("social_security_person", socialSecurityPerson);
		return (M)this;
	}

	/**
	*获取社保个人缴费金额 
	*/
	public java.math.BigDecimal getSocialSecurityPerson() {
		return get("social_security_person");
	}

	/**
	*设置社保单位缴费金额 
	*/
	public M setSocialSecurityUnit(java.math.BigDecimal socialSecurityUnit) {
		set("social_security_unit", socialSecurityUnit);
		return (M)this;
	}

	/**
	*获取社保单位缴费金额 
	*/
	public java.math.BigDecimal getSocialSecurityUnit() {
		return get("social_security_unit");
	}

	/**
	*设置社保扣款合计(社会保险扣款（单位）+社会保险扣款（个人）) 
	*/
	public M setSocialSecurityTotal(java.math.BigDecimal socialSecurityTotal) {
		set("social_security_total", socialSecurityTotal);
		return (M)this;
	}

	/**
	*获取社保扣款合计(社会保险扣款（单位）+社会保险扣款（个人）) 
	*/
	public java.math.BigDecimal getSocialSecurityTotal() {
		return get("social_security_total");
	}

	/**
	*设置单位支出(应发合计+社会保险扣款（单位）) 
	*/
	public M setUnitExpenditure(java.math.BigDecimal unitExpenditure) {
		set("unit_expenditure", unitExpenditure);
		return (M)this;
	}

	/**
	*获取单位支出(应发合计+社会保险扣款（单位）) 
	*/
	public java.math.BigDecimal getUnitExpenditure() {
		return get("unit_expenditure");
	}

	/**
	*设置个人所得税 
	*/
	public M setIndividualIncomeTax(java.math.BigDecimal individualIncomeTax) {
		set("individual_income_tax", individualIncomeTax);
		return (M)this;
	}

	/**
	*获取个人所得税 
	*/
	public java.math.BigDecimal getIndividualIncomeTax() {
		return get("individual_income_tax");
	}

	/**
	*设置部门扣费(水电房租) 
	*/
	public M setSectorDeductMoney(java.math.BigDecimal sectorDeductMoney) {
		set("sector_deduct_money", sectorDeductMoney);
		return (M)this;
	}

	/**
	*获取部门扣费(水电房租) 
	*/
	public java.math.BigDecimal getSectorDeductMoney() {
		return get("sector_deduct_money");
	}

	/**
	*设置实发工资 
	*/
	public M setNetSalary(java.math.BigDecimal netSalary) {
		set("net_salary", netSalary);
		return (M)this;
	}

	/**
	*获取实发工资 
	*/
	public java.math.BigDecimal getNetSalary() {
		return get("net_salary");
	}

	/**
	*设置归属项目 
	*/
	public M setOwnershipOfProject(java.lang.String ownershipOfProject) {
		set("ownership_of_project", ownershipOfProject);
		return (M)this;
	}

	/**
	*获取归属项目 
	*/
	public java.lang.String getOwnershipOfProject() {
		return getStr("ownership_of_project");
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
	*设置审核状态 
	*/
	public M setStatus(java.lang.String status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.String getStatus() {
		return getStr("status");
	}

	/**
	*设置发放时间 
	*/
	public M setTheTime(java.lang.String theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取发放时间 
	*/
	public java.lang.String getTheTime() {
		return getStr("the_time");
	}

	/**
	*设置岗位id 
	*/
	public M setPostId(java.lang.Integer postId) {
		set("post_id", postId);
		return (M)this;
	}

	/**
	*获取岗位id 
	*/
	public java.lang.Integer getPostId() {
		return getInt("post_id");
	}

	/**
	*设置养老保险个人缴费金额 
	*/
	public M setEndowmentInsurancePayPerson(java.math.BigDecimal endowmentInsurancePayPerson) {
		set("endowment_Insurance_pay_person", endowmentInsurancePayPerson);
		return (M)this;
	}

	/**
	*获取养老保险个人缴费金额 
	*/
	public java.math.BigDecimal getEndowmentInsurancePayPerson() {
		return get("endowment_Insurance_pay_person");
	}

	/**
	*设置失业保险个人缴费金额 
	*/
	public M setUnemployInsurancePayPerson(java.math.BigDecimal unemployInsurancePayPerson) {
		set("unemploy_insurance_pay_person", unemployInsurancePayPerson);
		return (M)this;
	}

	/**
	*获取失业保险个人缴费金额 
	*/
	public java.math.BigDecimal getUnemployInsurancePayPerson() {
		return get("unemploy_insurance_pay_person");
	}

	/**
	*设置医疗保险个人缴费金额 
	*/
	public M setHealthInsurancePayPerson(java.math.BigDecimal healthInsurancePayPerson) {
		set("health_insurance_pay_person", healthInsurancePayPerson);
		return (M)this;
	}

	/**
	*获取医疗保险个人缴费金额 
	*/
	public java.math.BigDecimal getHealthInsurancePayPerson() {
		return get("health_insurance_pay_person");
	}

	/**
	*设置养老保险单位缴费金额 
	*/
	public M setEndowmentInsurancePayUnit(java.math.BigDecimal endowmentInsurancePayUnit) {
		set("endowment_Insurance_pay_unit", endowmentInsurancePayUnit);
		return (M)this;
	}

	/**
	*获取养老保险单位缴费金额 
	*/
	public java.math.BigDecimal getEndowmentInsurancePayUnit() {
		return get("endowment_Insurance_pay_unit");
	}

	/**
	*设置失业保险单位缴费金额 
	*/
	public M setUnemployInsurancePayUnit(java.math.BigDecimal unemployInsurancePayUnit) {
		set("unemploy_insurance_pay_unit", unemployInsurancePayUnit);
		return (M)this;
	}

	/**
	*获取失业保险单位缴费金额 
	*/
	public java.math.BigDecimal getUnemployInsurancePayUnit() {
		return get("unemploy_insurance_pay_unit");
	}

	/**
	*设置医疗保险单位缴费金额 
	*/
	public M setHealthInsurancePayUnit(java.math.BigDecimal healthInsurancePayUnit) {
		set("health_insurance_pay_unit", healthInsurancePayUnit);
		return (M)this;
	}

	/**
	*获取医疗保险单位缴费金额 
	*/
	public java.math.BigDecimal getHealthInsurancePayUnit() {
		return get("health_insurance_pay_unit");
	}

	/**
	*设置大额医疗单位缴费 
	*/
	public M setSuppleHealthInsurancePay(java.math.BigDecimal suppleHealthInsurancePay) {
		set("supple_health_insurance_pay", suppleHealthInsurancePay);
		return (M)this;
	}

	/**
	*获取大额医疗单位缴费 
	*/
	public java.math.BigDecimal getSuppleHealthInsurancePay() {
		return get("supple_health_insurance_pay");
	}

	/**
	*设置工伤保险单位缴费金额 
	*/
	public M setInjuryInsurancePay(java.math.BigDecimal injuryInsurancePay) {
		set("injury_insurance_pay", injuryInsurancePay);
		return (M)this;
	}

	/**
	*获取工伤保险单位缴费金额 
	*/
	public java.math.BigDecimal getInjuryInsurancePay() {
		return get("injury_insurance_pay");
	}

	/**
	*设置生育保险单位缴费 
	*/
	public M setBirthInsurancePay(java.math.BigDecimal birthInsurancePay) {
		set("birth_insurance_pay", birthInsurancePay);
		return (M)this;
	}

	/**
	*获取生育保险单位缴费 
	*/
	public java.math.BigDecimal getBirthInsurancePay() {
		return get("birth_insurance_pay");
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
