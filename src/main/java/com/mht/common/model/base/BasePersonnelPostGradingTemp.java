package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_grading_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostGradingTemp<M extends BasePersonnelPostGradingTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPostGradingId(java.lang.Integer postGradingId) {
		set("post_grading_id", postGradingId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPostGradingId() {
		return getInt("post_grading_id");
	}

	/**
	*设置员工id 
	*/
	public M setEmployeeId(java.lang.Integer employeeId) {
		set("employee_id", employeeId);
		return (M)this;
	}

	/**
	*获取员工id 
	*/
	public java.lang.Integer getEmployeeId() {
		return getInt("employee_id");
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
	*设置岗位 
	*/
	public M setAfterPostId(java.lang.String afterPostId) {
		set("after_post_id", afterPostId);
		return (M)this;
	}

	/**
	*获取岗位 
	*/
	public java.lang.String getAfterPostId() {
		return getStr("after_post_id");
	}

	/**
	*设置岗位序列 
	*/
	public M setAfterSequence(java.lang.String afterSequence) {
		set("after_sequence", afterSequence);
		return (M)this;
	}

	/**
	*获取岗位序列 
	*/
	public java.lang.String getAfterSequence() {
		return getStr("after_sequence");
	}

	/**
	*设置岗位类别 
	*/
	public M setAfterPostType(java.lang.String afterPostType) {
		set("after_post_type", afterPostType);
		return (M)this;
	}

	/**
	*获取岗位类别 
	*/
	public java.lang.String getAfterPostType() {
		return getStr("after_post_type");
	}

	/**
	*设置到此岗位时间 
	*/
	public M setComePostDate(java.lang.String comePostDate) {
		set("come_post_date", comePostDate);
		return (M)this;
	}

	/**
	*获取到此岗位时间 
	*/
	public java.lang.String getComePostDate() {
		return getStr("come_post_date");
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
	*设置岗位级别 
	*/
	public M setAfterPost(java.lang.String afterPost) {
		set("after_post", afterPost);
		return (M)this;
	}

	/**
	*获取岗位级别 
	*/
	public java.lang.String getAfterPost() {
		return getStr("after_post");
	}

	/**
	*设置岗位工资 
	*/
	public M setPostMoney(java.lang.String postMoney) {
		set("post_money", postMoney);
		return (M)this;
	}

	/**
	*获取岗位工资 
	*/
	public java.lang.String getPostMoney() {
		return getStr("post_money");
	}

	/**
	*设置来集团工作时间 
	*/
	public M setContinuityDate(java.lang.String continuityDate) {
		set("continuity_date", continuityDate);
		return (M)this;
	}

	/**
	*获取来集团工作时间 
	*/
	public java.lang.String getContinuityDate() {
		return getStr("continuity_date");
	}

	/**
	*设置集团工作年限 
	*/
	public M setContinuityJobDate(java.lang.String continuityJobDate) {
		set("continuity_job_date", continuityJobDate);
		return (M)this;
	}

	/**
	*获取集团工作年限 
	*/
	public java.lang.String getContinuityJobDate() {
		return getStr("continuity_job_date");
	}

	/**
	*设置工龄工资 
	*/
	public M setSeniorityMoney(java.lang.String seniorityMoney) {
		set("seniority_money", seniorityMoney);
		return (M)this;
	}

	/**
	*获取工龄工资 
	*/
	public java.lang.String getSeniorityMoney() {
		return getStr("seniority_money");
	}

	/**
	*设置技术或学历津贴 
	*/
	public M setTechnologyMoney(java.lang.String technologyMoney) {
		set("technology_money", technologyMoney);
		return (M)this;
	}

	/**
	*获取技术或学历津贴 
	*/
	public java.lang.String getTechnologyMoney() {
		return getStr("technology_money");
	}

	/**
	*设置学历 
	*/
	public M setEducation(java.lang.String education) {
		set("education", education);
		return (M)this;
	}

	/**
	*获取学历 
	*/
	public java.lang.String getEducation() {
		return getStr("education");
	}

	/**
	*设置技术等级 
	*/
	public M setTechnologyGrade(java.lang.String technologyGrade) {
		set("technology_grade", technologyGrade);
		return (M)this;
	}

	/**
	*获取技术等级 
	*/
	public java.lang.String getTechnologyGrade() {
		return getStr("technology_grade");
	}

	/**
	*设置评优 
	*/
	public M setAppraising(java.lang.String appraising) {
		set("appraising", appraising);
		return (M)this;
	}

	/**
	*获取评优 
	*/
	public java.lang.String getAppraising() {
		return getStr("appraising");
	}

	/**
	*设置其他 
	*/
	public M setOther(java.lang.String other) {
		set("other", other);
		return (M)this;
	}

	/**
	*获取其他 
	*/
	public java.lang.String getOther() {
		return getStr("other");
	}

	/**
	*设置原岗位类别 
	*/
	public M setBeforePostType(java.lang.String beforePostType) {
		set("before_post_type", beforePostType);
		return (M)this;
	}

	/**
	*获取原岗位类别 
	*/
	public java.lang.String getBeforePostType() {
		return getStr("before_post_type");
	}

	/**
	*设置原岗位级别 
	*/
	public M setBeforePost(java.lang.String beforePost) {
		set("before_post", beforePost);
		return (M)this;
	}

	/**
	*获取原岗位级别 
	*/
	public java.lang.String getBeforePost() {
		return getStr("before_post");
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

}
