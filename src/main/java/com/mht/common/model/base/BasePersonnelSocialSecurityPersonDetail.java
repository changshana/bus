package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_social_security_person_detail:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelSocialSecurityPersonDetail<M extends BasePersonnelSocialSecurityPersonDetail<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDetailId(java.lang.Integer detailId) {
		set("detail_id", detailId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDetailId() {
		return getInt("detail_id");
	}

	/**
	*设置员工id 
	*/
	public M setStaffInfoId(java.lang.Integer staffInfoId) {
		set("staff_info_id", staffInfoId);
		return (M)this;
	}

	/**
	*获取员工id 
	*/
	public java.lang.Integer getStaffInfoId() {
		return getInt("staff_info_id");
	}

	/**
	*设置养老保险缴费（单位） 
	*/
	public M setEndowmentInsurancePayUnit(java.math.BigDecimal endowmentInsurancePayUnit) {
		set("endowment_Insurance_pay_unit", endowmentInsurancePayUnit);
		return (M)this;
	}

	/**
	*获取养老保险缴费（单位） 
	*/
	public java.math.BigDecimal getEndowmentInsurancePayUnit() {
		return get("endowment_Insurance_pay_unit");
	}

	/**
	*设置失业保险缴费(单位) 
	*/
	public M setUnemployInsurancePayUnit(java.math.BigDecimal unemployInsurancePayUnit) {
		set("unemploy_insurance_pay_unit", unemployInsurancePayUnit);
		return (M)this;
	}

	/**
	*获取失业保险缴费(单位) 
	*/
	public java.math.BigDecimal getUnemployInsurancePayUnit() {
		return get("unemploy_insurance_pay_unit");
	}

	/**
	*设置医疗保险缴费（单位） 
	*/
	public M setHealthInsurancePayUnit(java.math.BigDecimal healthInsurancePayUnit) {
		set("health_insurance_pay_unit", healthInsurancePayUnit);
		return (M)this;
	}

	/**
	*获取医疗保险缴费（单位） 
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
	*设置养老保险缴费（个人） 
	*/
	public M setEndowmentInsurancePayPerson(java.math.BigDecimal endowmentInsurancePayPerson) {
		set("endowment_Insurance_pay_person", endowmentInsurancePayPerson);
		return (M)this;
	}

	/**
	*获取养老保险缴费（个人） 
	*/
	public java.math.BigDecimal getEndowmentInsurancePayPerson() {
		return get("endowment_Insurance_pay_person");
	}

	/**
	*设置失业保险缴费(个人) 
	*/
	public M setUnemployInsurancePayPerson(java.math.BigDecimal unemployInsurancePayPerson) {
		set("unemploy_insurance_pay_person", unemployInsurancePayPerson);
		return (M)this;
	}

	/**
	*获取失业保险缴费(个人) 
	*/
	public java.math.BigDecimal getUnemployInsurancePayPerson() {
		return get("unemploy_insurance_pay_person");
	}

	/**
	*设置医疗保险缴费（个人） 
	*/
	public M setHealthInsurancePayPerson(java.math.BigDecimal healthInsurancePayPerson) {
		set("health_insurance_pay_person", healthInsurancePayPerson);
		return (M)this;
	}

	/**
	*获取医疗保险缴费（个人） 
	*/
	public java.math.BigDecimal getHealthInsurancePayPerson() {
		return get("health_insurance_pay_person");
	}

	/**
	*设置单位合计 
	*/
	public M setUnitSum(java.math.BigDecimal unitSum) {
		set("unit_sum", unitSum);
		return (M)this;
	}

	/**
	*获取单位合计 
	*/
	public java.math.BigDecimal getUnitSum() {
		return get("unit_sum");
	}

	/**
	*设置个人合计 
	*/
	public M setPersonSum(java.math.BigDecimal personSum) {
		set("person_sum", personSum);
		return (M)this;
	}

	/**
	*获取个人合计 
	*/
	public java.math.BigDecimal getPersonSum() {
		return get("person_sum");
	}

	/**
	*设置总合计 
	*/
	public M setSum(java.math.BigDecimal sum) {
		set("sum", sum);
		return (M)this;
	}

	/**
	*获取总合计 
	*/
	public java.math.BigDecimal getSum() {
		return get("sum");
	}

	/**
	*设置社保年月 
	*/
	public M setPayTime(java.lang.String payTime) {
		set("pay_time", payTime);
		return (M)this;
	}

	/**
	*获取社保年月 
	*/
	public java.lang.String getPayTime() {
		return getStr("pay_time");
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

}
