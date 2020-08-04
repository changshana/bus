package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_rule_category:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelRuleCategory<M extends BasePersonnelRuleCategory<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRuleCategoryId(java.lang.Integer ruleCategoryId) {
		set("rule_category_id", ruleCategoryId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRuleCategoryId() {
		return getInt("rule_category_id");
	}

	/**
	*设置名称 
	*/
	public M setRuleCategoryName(java.lang.String ruleCategoryName) {
		set("rule_category_name", ruleCategoryName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getRuleCategoryName() {
		return getStr("rule_category_name");
	}

	/**
	*设置代码 
	*/
	public M setRuleCategoryCode(java.lang.String ruleCategoryCode) {
		set("rule_category_code", ruleCategoryCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getRuleCategoryCode() {
		return getStr("rule_category_code");
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
