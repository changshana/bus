package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_promote:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPromote<M extends BasePersonnelPromote<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPromoteId(java.lang.Integer promoteId) {
		set("promote_id", promoteId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPromoteId() {
		return getInt("promote_id");
	}

	/**
	*设置员工证件号 
	*/
	public M setCertificatesNum(java.lang.String certificatesNum) {
		set("certificates_num", certificatesNum);
		return (M)this;
	}

	/**
	*获取员工证件号 
	*/
	public java.lang.String getCertificatesNum() {
		return getStr("certificates_num");
	}

	/**
	*设置晋升年份 
	*/
	public M setTheYear(java.lang.String theYear) {
		set("the_year", theYear);
		return (M)this;
	}

	/**
	*获取晋升年份 
	*/
	public java.lang.String getTheYear() {
		return getStr("the_year");
	}

	/**
	*设置晋升之前等级 
	*/
	public M setBeforePostLevel(java.lang.String beforePostLevel) {
		set("before_post_level", beforePostLevel);
		return (M)this;
	}

	/**
	*获取晋升之前等级 
	*/
	public java.lang.String getBeforePostLevel() {
		return getStr("before_post_level");
	}

	/**
	*设置晋升之后等级 
	*/
	public M setAfterPostLevel(java.lang.String afterPostLevel) {
		set("after_post_level", afterPostLevel);
		return (M)this;
	}

	/**
	*获取晋升之后等级 
	*/
	public java.lang.String getAfterPostLevel() {
		return getStr("after_post_level");
	}

	/**
	*设置晋升之前岗位工资 
	*/
	public M setBeforePostWage(java.lang.String beforePostWage) {
		set("before_post_wage", beforePostWage);
		return (M)this;
	}

	/**
	*获取晋升之前岗位工资 
	*/
	public java.lang.String getBeforePostWage() {
		return getStr("before_post_wage");
	}

	/**
	*设置晋升之后岗位工资 
	*/
	public M setAfterPostWage(java.lang.String afterPostWage) {
		set("after_post_wage", afterPostWage);
		return (M)this;
	}

	/**
	*获取晋升之后岗位工资 
	*/
	public java.lang.String getAfterPostWage() {
		return getStr("after_post_wage");
	}

	/**
	*设置晋升之前工龄工资 
	*/
	public M setBeforeSeniorityWage(java.lang.String beforeSeniorityWage) {
		set("before_seniority_wage", beforeSeniorityWage);
		return (M)this;
	}

	/**
	*获取晋升之前工龄工资 
	*/
	public java.lang.String getBeforeSeniorityWage() {
		return getStr("before_seniority_wage");
	}

	/**
	*设置晋升之后工龄工资 
	*/
	public M setAfterSeniorityWage(java.lang.String afterSeniorityWage) {
		set("after_seniority_wage", afterSeniorityWage);
		return (M)this;
	}

	/**
	*获取晋升之后工龄工资 
	*/
	public java.lang.String getAfterSeniorityWage() {
		return getStr("after_seniority_wage");
	}

	/**
	*设置来校时间 
	*/
	public M setEnterTime(java.util.Date enterTime) {
		set("enter_time", enterTime);
		return (M)this;
	}

	/**
	*获取来校时间 
	*/
	public java.util.Date getEnterTime() {
		return get("enter_time");
	}

	/**
	*设置后勤连续工作年限 
	*/
	public M setContinuityJobDate(java.lang.Integer continuityJobDate) {
		set("continuity_job_date", continuityJobDate);
		return (M)this;
	}

	/**
	*获取后勤连续工作年限 
	*/
	public java.lang.Integer getContinuityJobDate() {
		return getInt("continuity_job_date");
	}

	/**
	*设置历年后勤评优情况 
	*/
	public M setAssessment(java.lang.String assessment) {
		set("assessment", assessment);
		return (M)this;
	}

	/**
	*获取历年后勤评优情况 
	*/
	public java.lang.String getAssessment() {
		return getStr("assessment");
	}

	/**
	*设置评优次数 
	*/
	public M setAssessmentCount(java.lang.Integer assessmentCount) {
		set("assessment_count", assessmentCount);
		return (M)this;
	}

	/**
	*获取评优次数 
	*/
	public java.lang.Integer getAssessmentCount() {
		return getInt("assessment_count");
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
	*设置数据有效状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取数据有效状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置晋升说明 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取晋升说明 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置审核状态 
	*/
	public M setApprovalStatus(java.lang.Integer approvalStatus) {
		set("approval_status", approvalStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getApprovalStatus() {
		return getInt("approval_status");
	}

	/**
	*设置审核时间 
	*/
	public M setApprovalDate(java.lang.String approvalDate) {
		set("approval_date", approvalDate);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.lang.String getApprovalDate() {
		return getStr("approval_date");
	}

	/**
	*设置审核人 
	*/
	public M setApprovalPerson(java.lang.String approvalPerson) {
		set("approval_person", approvalPerson);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getApprovalPerson() {
		return getStr("approval_person");
	}

	/**
	*设置审核备注 
	*/
	public M setApprovalRemark(java.lang.String approvalRemark) {
		set("approval_remark", approvalRemark);
		return (M)this;
	}

	/**
	*获取审核备注 
	*/
	public java.lang.String getApprovalRemark() {
		return getStr("approval_remark");
	}

}
