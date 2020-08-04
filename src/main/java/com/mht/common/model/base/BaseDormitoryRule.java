package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_rule:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryRule<M extends BaseDormitoryRule<M>> extends Model<M> implements IBean {

	/**
	*设置条款id 
	*/
	public M setRuleId(java.lang.Integer ruleId) {
		set("rule_id", ruleId);
		return (M)this;
	}

	/**
	*获取条款id 
	*/
	public java.lang.Integer getRuleId() {
		return getInt("rule_id");
	}

	/**
	*设置条款名称 
	*/
	public M setRuleName(java.lang.String ruleName) {
		set("rule_name", ruleName);
		return (M)this;
	}

	/**
	*获取条款名称 
	*/
	public java.lang.String getRuleName() {
		return getStr("rule_name");
	}

	/**
	*设置条款内容 
	*/
	public M setRuleContent(java.lang.String ruleContent) {
		set("rule_content", ruleContent);
		return (M)this;
	}

	/**
	*获取条款内容 
	*/
	public java.lang.String getRuleContent() {
		return getStr("rule_content");
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

}
