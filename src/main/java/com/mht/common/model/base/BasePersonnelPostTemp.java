package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostTemp<M extends BasePersonnelPostTemp<M>> extends Model<M> implements IBean {

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
	*设置名称 
	*/
	public M setPostName(java.lang.String postName) {
		set("post_name", postName);
		return (M)this;
	}

	/**
	*获取名称 
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
	public M setPostEstablishment(java.lang.String postEstablishment) {
		set("post_establishment", postEstablishment);
		return (M)this;
	}

	/**
	*获取岗位编制 
	*/
	public java.lang.String getPostEstablishment() {
		return getStr("post_establishment");
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
	*设置导入成功失败标识 
	*/
	public M setFlag(java.lang.Integer flag) {
		set("flag", flag);
		return (M)this;
	}

	/**
	*获取导入成功失败标识 
	*/
	public java.lang.Integer getFlag() {
		return getInt("flag");
	}

	/**
	*设置导入失败说明 
	*/
	public M setFlagRemark(java.lang.String flagRemark) {
		set("flag_remark", flagRemark);
		return (M)this;
	}

	/**
	*获取导入失败说明 
	*/
	public java.lang.String getFlagRemark() {
		return getStr("flag_remark");
	}

	/**
	*设置批次号 
	*/
	public M setBatchNumber(java.lang.String batchNumber) {
		set("batch_number", batchNumber);
		return (M)this;
	}

	/**
	*获取批次号 
	*/
	public java.lang.String getBatchNumber() {
		return getStr("batch_number");
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
	*设置下级部门名称 
	*/
	public M setInnerSiteName(java.lang.String innerSiteName) {
		set("inner_site_name", innerSiteName);
		return (M)this;
	}

	/**
	*获取下级部门名称 
	*/
	public java.lang.String getInnerSiteName() {
		return getStr("inner_site_name");
	}

	/**
	*设置 
	*/
	public M setPostCategoryDesc(java.lang.String postCategoryDesc) {
		set("post_category_desc", postCategoryDesc);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPostCategoryDesc() {
		return getStr("post_category_desc");
	}

	/**
	*设置 
	*/
	public M setPostTypeDesc(java.lang.String postTypeDesc) {
		set("post_type_desc", postTypeDesc);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPostTypeDesc() {
		return getStr("post_type_desc");
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
