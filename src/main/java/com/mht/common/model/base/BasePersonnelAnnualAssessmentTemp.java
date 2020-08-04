package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_annual_assessment_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelAnnualAssessmentTemp<M extends BasePersonnelAnnualAssessmentTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAnnualAssessmentTempId(java.lang.Integer annualAssessmentTempId) {
		set("annual_assessment_temp_id", annualAssessmentTempId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAnnualAssessmentTempId() {
		return getInt("annual_assessment_temp_id");
	}

	/**
	*设置导入标识 
	*/
	public M setFlag(java.lang.Integer flag) {
		set("flag", flag);
		return (M)this;
	}

	/**
	*获取导入标识 
	*/
	public java.lang.Integer getFlag() {
		return getInt("flag");
	}

	/**
	*设置导入备注 
	*/
	public M setFlagRemark(java.lang.String flagRemark) {
		set("flag_remark", flagRemark);
		return (M)this;
	}

	/**
	*获取导入备注 
	*/
	public java.lang.String getFlagRemark() {
		return getStr("flag_remark");
	}

	/**
	*设置导入批次号 
	*/
	public M setBatchNumber(java.lang.String batchNumber) {
		set("batch_number", batchNumber);
		return (M)this;
	}

	/**
	*获取导入批次号 
	*/
	public java.lang.String getBatchNumber() {
		return getStr("batch_number");
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
	*设置考核结果 
	*/
	public M setAssessmentResult(java.lang.String assessmentResult) {
		set("assessment_result", assessmentResult);
		return (M)this;
	}

	/**
	*获取考核结果 
	*/
	public java.lang.String getAssessmentResult() {
		return getStr("assessment_result");
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
	*设置职工号 
	*/
	public M setJobNum(java.lang.String jobNum) {
		set("job_num", jobNum);
		return (M)this;
	}

	/**
	*获取职工号 
	*/
	public java.lang.String getJobNum() {
		return getStr("job_num");
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
	*设置证件号 
	*/
	public M setNum(java.lang.String num) {
		set("num", num);
		return (M)this;
	}

	/**
	*获取证件号 
	*/
	public java.lang.String getNum() {
		return getStr("num");
	}

	/**
	*设置机构中心 
	*/
	public M setCenter(java.lang.String center) {
		set("center", center);
		return (M)this;
	}

	/**
	*获取机构中心 
	*/
	public java.lang.String getCenter() {
		return getStr("center");
	}

	/**
	*设置所属部门 
	*/
	public M setDepartment(java.lang.String department) {
		set("department", department);
		return (M)this;
	}

	/**
	*获取所属部门 
	*/
	public java.lang.String getDepartment() {
		return getStr("department");
	}

	/**
	*设置岗位 
	*/
	public M setPost(java.lang.String post) {
		set("post", post);
		return (M)this;
	}

	/**
	*获取岗位 
	*/
	public java.lang.String getPost() {
		return getStr("post");
	}

	/**
	*设置考核结果值 
	*/
	public M setAssessmentResultValue(java.lang.Integer assessmentResultValue) {
		set("assessment_result_value", assessmentResultValue);
		return (M)this;
	}

	/**
	*获取考核结果值 
	*/
	public java.lang.Integer getAssessmentResultValue() {
		return getInt("assessment_result_value");
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
	*设置考核截止年月 
	*/
	public M setEndTime(java.lang.String endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取考核截止年月 
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
	*设置序号 
	*/
	public M setIndex(java.lang.String index) {
		set("index", index);
		return (M)this;
	}

	/**
	*获取序号 
	*/
	public java.lang.String getIndex() {
		return getStr("index");
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
	*设置合同类型值 
	*/
	public M setContractValue(java.lang.Integer contractValue) {
		set("contract_value", contractValue);
		return (M)this;
	}

	/**
	*获取合同类型值 
	*/
	public java.lang.Integer getContractValue() {
		return getInt("contract_value");
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
