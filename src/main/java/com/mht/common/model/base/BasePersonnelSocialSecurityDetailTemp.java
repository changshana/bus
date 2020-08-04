package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_social_security_detail_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelSocialSecurityDetailTemp<M extends BasePersonnelSocialSecurityDetailTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setTempId(java.lang.Integer tempId) {
		set("temp_id", tempId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTempId() {
		return getInt("temp_id");
	}

	/**
	*设置excel序号 
	*/
	public M setDetailNo(java.lang.Integer detailNo) {
		set("detail_no", detailNo);
		return (M)this;
	}

	/**
	*获取excel序号 
	*/
	public java.lang.Integer getDetailNo() {
		return getInt("detail_no");
	}

	/**
	*设置项目名称 
	*/
	public M setItemName(java.lang.String itemName) {
		set("item_name", itemName);
		return (M)this;
	}

	/**
	*获取项目名称 
	*/
	public java.lang.String getItemName() {
		return getStr("item_name");
	}

	/**
	*设置部门id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取部门id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置部门名称 
	*/
	public M setSiteName(java.lang.String siteName) {
		set("site_name", siteName);
		return (M)this;
	}

	/**
	*获取部门名称 
	*/
	public java.lang.String getSiteName() {
		return getStr("site_name");
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
	*设置是否导入成功（1：成功，0：失败） 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取是否导入成功（1：成功，0：失败） 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	*设置失败原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取失败原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
	}

	/**
	*设置导入批次号 
	*/
	public M setBatchNum(java.lang.String batchNum) {
		set("batch_num", batchNum);
		return (M)this;
	}

	/**
	*获取导入批次号 
	*/
	public java.lang.String getBatchNum() {
		return getStr("batch_num");
	}

	/**
	*设置缴费时间 
	*/
	public M setPayTime(java.lang.String payTime) {
		set("pay_time", payTime);
		return (M)this;
	}

	/**
	*获取缴费时间 
	*/
	public java.lang.String getPayTime() {
		return getStr("pay_time");
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
