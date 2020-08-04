package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_annual_assessment:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelAnnualAssessment<M extends BasePersonnelAnnualAssessment<M>> extends Model<M> implements IBean {

	/**
	*设置年度审核ID 
	*/
	public M setAnnualAssessmentId(java.lang.Integer annualAssessmentId) {
		set("annual_assessment_id", annualAssessmentId);
		return (M)this;
	}

	/**
	*获取年度审核ID 
	*/
	public java.lang.Integer getAnnualAssessmentId() {
		return getInt("annual_assessment_id");
	}

	/**
	*设置员工ID 
	*/
	public M setEmployeeInformationId(java.lang.Integer employeeInformationId) {
		set("employee_information_id", employeeInformationId);
		return (M)this;
	}

	/**
	*获取员工ID 
	*/
	public java.lang.Integer getEmployeeInformationId() {
		return getInt("employee_information_id");
	}

	/**
	*设置合同类型 
	*/
	public M setContract(java.lang.String contract) {
		set("contract", contract);
		return (M)this;
	}

	/**
	*获取合同类型 
	*/
	public java.lang.String getContract() {
		return getStr("contract");
	}

	/**
	*设置考核开始年月 
	*/
	public M setStartTime(java.lang.String startTime) {
		set("start_time", startTime);
		return (M)this;
	}

	/**
	*获取考核开始年月 
	*/
	public java.lang.String getStartTime() {
		return getStr("start_time");
	}

	/**
	*设置考核截至年月 
	*/
	public M setEndTime(java.lang.String endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取考核截至年月 
	*/
	public java.lang.String getEndTime() {
		return getStr("end_time");
	}

	/**
	*设置考核年份 
	*/
	public M setTheTime(java.lang.String theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取考核年份 
	*/
	public java.lang.String getTheTime() {
		return getStr("the_time");
	}

	/**
	*设置考核结果 
	*/
	public M setAssessmentResult(java.lang.Integer assessmentResult) {
		set("assessment_result", assessmentResult);
		return (M)this;
	}

	/**
	*获取考核结果 
	*/
	public java.lang.Integer getAssessmentResult() {
		return getInt("assessment_result");
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
	*设置审核状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
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
	*设置数据有效状态 
	*/
	public M setDataStatus(java.lang.Integer dataStatus) {
		set("data_status", dataStatus);
		return (M)this;
	}

	/**
	*获取数据有效状态 
	*/
	public java.lang.Integer getDataStatus() {
		return getInt("data_status");
	}

}
