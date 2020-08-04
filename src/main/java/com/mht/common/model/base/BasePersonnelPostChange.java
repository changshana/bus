package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_change:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostChange<M extends BasePersonnelPostChange<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPostChangeId(java.lang.Integer postChangeId) {
		set("post_change_id", postChangeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPostChangeId() {
		return getInt("post_change_id");
	}

	/**
	*设置人员Id 
	*/
	public M setEmployeeId(java.lang.Integer employeeId) {
		set("employee_id", employeeId);
		return (M)this;
	}

	/**
	*获取人员Id 
	*/
	public java.lang.Integer getEmployeeId() {
		return getInt("employee_id");
	}

	/**
	*设置原岗位 
	*/
	public M setBeforePost(java.lang.Integer beforePost) {
		set("before_post", beforePost);
		return (M)this;
	}

	/**
	*获取原岗位 
	*/
	public java.lang.Integer getBeforePost() {
		return getInt("before_post");
	}

	/**
	*设置现岗位 
	*/
	public M setAfterPost(java.lang.Integer afterPost) {
		set("after_post", afterPost);
		return (M)this;
	}

	/**
	*获取现岗位 
	*/
	public java.lang.Integer getAfterPost() {
		return getInt("after_post");
	}

	/**
	*设置原级别 
	*/
	public M setBeforeLevel(java.lang.Integer beforeLevel) {
		set("before_level", beforeLevel);
		return (M)this;
	}

	/**
	*获取原级别 
	*/
	public java.lang.Integer getBeforeLevel() {
		return getInt("before_level");
	}

	/**
	*设置现级别 
	*/
	public M setAfterLevel(java.lang.String afterLevel) {
		set("after_level", afterLevel);
		return (M)this;
	}

	/**
	*获取现级别 
	*/
	public java.lang.String getAfterLevel() {
		return getStr("after_level");
	}

	/**
	*设置调岗类型 
	*/
	public M setTransferType(java.lang.String transferType) {
		set("transfer_type", transferType);
		return (M)this;
	}

	/**
	*获取调岗类型 
	*/
	public java.lang.String getTransferType() {
		return getStr("transfer_type");
	}

	/**
	*设置书面意见 
	*/
	public M setWrittenOpinion(java.lang.String writtenOpinion) {
		set("written_opinion", writtenOpinion);
		return (M)this;
	}

	/**
	*获取书面意见 
	*/
	public java.lang.String getWrittenOpinion() {
		return getStr("written_opinion");
	}

	/**
	*设置调出部门意见 
	*/
	public M setOutDeptOption(java.lang.String outDeptOption) {
		set("out_dept_option", outDeptOption);
		return (M)this;
	}

	/**
	*获取调出部门意见 
	*/
	public java.lang.String getOutDeptOption() {
		return getStr("out_dept_option");
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
	*设置调入部门意见 
	*/
	public M setInDeptOption(java.lang.String inDeptOption) {
		set("in_dept_option", inDeptOption);
		return (M)this;
	}

	/**
	*获取调入部门意见 
	*/
	public java.lang.String getInDeptOption() {
		return getStr("in_dept_option");
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
	*设置岗位聘任年月(到此岗位时间) 
	*/
	public M setPostEngageDate(java.lang.String postEngageDate) {
		set("post_engage_date", postEngageDate);
		return (M)this;
	}

	/**
	*获取岗位聘任年月(到此岗位时间) 
	*/
	public java.lang.String getPostEngageDate() {
		return getStr("post_engage_date");
	}

	/**
	*设置岗位工资 
	*/
	public M setPostWage(java.lang.String postWage) {
		set("post_wage", postWage);
		return (M)this;
	}

	/**
	*获取岗位工资 
	*/
	public java.lang.String getPostWage() {
		return getStr("post_wage");
	}

	/**
	*设置工龄工资 
	*/
	public M setSeniorityWage(java.lang.String seniorityWage) {
		set("seniority_wage", seniorityWage);
		return (M)this;
	}

	/**
	*获取工龄工资 
	*/
	public java.lang.String getSeniorityWage() {
		return getStr("seniority_wage");
	}

	/**
	*设置技术或学历津贴 
	*/
	public M setAllowance(java.lang.String allowance) {
		set("allowance", allowance);
		return (M)this;
	}

	/**
	*获取技术或学历津贴 
	*/
	public java.lang.String getAllowance() {
		return getStr("allowance");
	}

	/**
	*设置岗位年限 
	*/
	public M setPostYears(java.lang.String postYears) {
		set("post_years", postYears);
		return (M)this;
	}

	/**
	*获取岗位年限 
	*/
	public java.lang.String getPostYears() {
		return getStr("post_years");
	}

	/**
	*设置后勤连续工作年限 
	*/
	public M setContinuityJobDate(java.lang.String continuityJobDate) {
		set("continuity_job_date", continuityJobDate);
		return (M)this;
	}

	/**
	*获取后勤连续工作年限 
	*/
	public java.lang.String getContinuityJobDate() {
		return getStr("continuity_job_date");
	}

}
