package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_apply:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostApply<M extends BasePersonnelPostApply<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApplyId(java.lang.Integer applyId) {
		set("apply_id", applyId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApplyId() {
		return getInt("apply_id");
	}

	/**
	*设置岗位名称 
	*/
	public M setPostName(java.lang.String postName) {
		set("post_name", postName);
		return (M)this;
	}

	/**
	*获取岗位名称 
	*/
	public java.lang.String getPostName() {
		return getStr("post_name");
	}

	/**
	*设置部门ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取部门ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置岗位序列 
	*/
	public M setPostCategory(java.lang.Integer postCategory) {
		set("post_category", postCategory);
		return (M)this;
	}

	/**
	*获取岗位序列 
	*/
	public java.lang.Integer getPostCategory() {
		return getInt("post_category");
	}

	/**
	*设置岗位类别 
	*/
	public M setPostType(java.lang.Integer postType) {
		set("post_type", postType);
		return (M)this;
	}

	/**
	*获取岗位类别 
	*/
	public java.lang.Integer getPostType() {
		return getInt("post_type");
	}

	/**
	*设置岗位编制 
	*/
	public M setPostEstablishment(java.lang.Integer postEstablishment) {
		set("post_establishment", postEstablishment);
		return (M)this;
	}

	/**
	*获取岗位编制 
	*/
	public java.lang.Integer getPostEstablishment() {
		return getInt("post_establishment");
	}

	/**
	*设置入职条件 
	*/
	public M setEntryRequirement(java.lang.String entryRequirement) {
		set("entry_requirement", entryRequirement);
		return (M)this;
	}

	/**
	*获取入职条件 
	*/
	public java.lang.String getEntryRequirement() {
		return getStr("entry_requirement");
	}

	/**
	*设置岗位职责 
	*/
	public M setPostStatement(java.lang.String postStatement) {
		set("post_statement", postStatement);
		return (M)this;
	}

	/**
	*获取岗位职责 
	*/
	public java.lang.String getPostStatement() {
		return getStr("post_statement");
	}

	/**
	*设置工作细则 
	*/
	public M setWorkingRule(java.lang.String workingRule) {
		set("working_rule", workingRule);
		return (M)this;
	}

	/**
	*获取工作细则 
	*/
	public java.lang.String getWorkingRule() {
		return getStr("working_rule");
	}

	/**
	*设置服务标准 
	*/
	public M setServiceStandard(java.lang.String serviceStandard) {
		set("service_standard", serviceStandard);
		return (M)this;
	}

	/**
	*获取服务标准 
	*/
	public java.lang.String getServiceStandard() {
		return getStr("service_standard");
	}

	/**
	*设置行为规范 
	*/
	public M setBehavioralNorms(java.lang.String behavioralNorms) {
		set("behavioral_norms", behavioralNorms);
		return (M)this;
	}

	/**
	*获取行为规范 
	*/
	public java.lang.String getBehavioralNorms() {
		return getStr("behavioral_norms");
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
	*设置内设机构 
	*/
	public M setInnerSiteId(java.lang.Integer innerSiteId) {
		set("inner_site_id", innerSiteId);
		return (M)this;
	}

	/**
	*获取内设机构 
	*/
	public java.lang.Integer getInnerSiteId() {
		return getInt("inner_site_id");
	}

	/**
	*设置岗位聘任年月 
	*/
	public M setPostEngageDate(java.lang.String postEngageDate) {
		set("post_engage_date", postEngageDate);
		return (M)this;
	}

	/**
	*获取岗位聘任年月 
	*/
	public java.lang.String getPostEngageDate() {
		return getStr("post_engage_date");
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
