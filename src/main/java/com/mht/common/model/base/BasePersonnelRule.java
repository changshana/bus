package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_rule:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelRule<M extends BasePersonnelRule<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRuleId(java.lang.Integer ruleId) {
		set("rule_id", ruleId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRuleId() {
		return getInt("rule_id");
	}

	/**
	*设置规章制度分类ID 
	*/
	public M setRuleCategoryId(java.lang.Integer ruleCategoryId) {
		set("rule_category_id", ruleCategoryId);
		return (M)this;
	}

	/**
	*获取规章制度分类ID 
	*/
	public java.lang.Integer getRuleCategoryId() {
		return getInt("rule_category_id");
	}

	/**
	*设置标题 
	*/
	public M setRuleTitle(java.lang.String ruleTitle) {
		set("rule_title", ruleTitle);
		return (M)this;
	}

	/**
	*获取标题 
	*/
	public java.lang.String getRuleTitle() {
		return getStr("rule_title");
	}

	/**
	*设置公告类型 
	*/
	public M setRuleType(java.lang.Integer ruleType) {
		set("rule_type", ruleType);
		return (M)this;
	}

	/**
	*获取公告类型 
	*/
	public java.lang.Integer getRuleType() {
		return getInt("rule_type");
	}

	/**
	*设置内容 
	*/
	public M setRuleContent(java.lang.String ruleContent) {
		set("rule_content", ruleContent);
		return (M)this;
	}

	/**
	*获取内容 
	*/
	public java.lang.String getRuleContent() {
		return getStr("rule_content");
	}

	/**
	*设置发布状态 
	*/
	public M setRulePublishStatus(java.lang.Integer rulePublishStatus) {
		set("rule_publish_status", rulePublishStatus);
		return (M)this;
	}

	/**
	*获取发布状态 
	*/
	public java.lang.Integer getRulePublishStatus() {
		return getInt("rule_publish_status");
	}

	/**
	*设置发布日期 
	*/
	public M setRulePublishDatetime(java.util.Date rulePublishDatetime) {
		set("rule_publish_datetime", rulePublishDatetime);
		return (M)this;
	}

	/**
	*获取发布日期 
	*/
	public java.util.Date getRulePublishDatetime() {
		return get("rule_publish_datetime");
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
