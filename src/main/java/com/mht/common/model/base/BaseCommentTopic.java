package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_topic:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentTopic<M extends BaseCommentTopic<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setTopicId(java.lang.Long topicId) {
		set("topic_id", topicId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getTopicId() {
		return getLong("topic_id");
	}

	/**
	*设置 
	*/
	public M setTopicClick(java.lang.Long topicClick) {
		set("topic_click", topicClick);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getTopicClick() {
		return getLong("topic_click");
	}

	/**
	*设置 
	*/
	public M setTopicDate(java.lang.String topicDate) {
		set("topic_date", topicDate);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTopicDate() {
		return getStr("topic_date");
	}

	/**
	*设置 
	*/
	public M setTopicLaud(java.lang.String topicLaud) {
		set("topic_laud", topicLaud);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTopicLaud() {
		return getStr("topic_laud");
	}

	/**
	*设置 
	*/
	public M setTopicReplycount(java.lang.Long topicReplycount) {
		set("topic_replyCount", topicReplycount);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getTopicReplycount() {
		return getLong("topic_replyCount");
	}

	/**
	*设置 
	*/
	public M setTopicState(java.lang.String topicState) {
		set("topic_state", topicState);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTopicState() {
		return getStr("topic_state");
	}

	/**
	*设置 
	*/
	public M setTopicText(java.lang.String topicText) {
		set("topic_text", topicText);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTopicText() {
		return getStr("topic_text");
	}

	/**
	*设置 
	*/
	public M setTopicTitle(java.lang.String topicTitle) {
		set("topic_title", topicTitle);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTopicTitle() {
		return getStr("topic_title");
	}

	/**
	*设置 
	*/
	public M setTopicUpdate(java.lang.String topicUpdate) {
		set("topic_update", topicUpdate);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTopicUpdate() {
		return getStr("topic_update");
	}

	/**
	*设置 
	*/
	public M setSysaccountsAccId(java.lang.Long sysaccountsAccId) {
		set("sysAccounts_acc_id", sysaccountsAccId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSysaccountsAccId() {
		return getLong("sysAccounts_acc_id");
	}

	/**
	*设置 
	*/
	public M setSyscategoriesCategoryId(java.lang.Long syscategoriesCategoryId) {
		set("sysCategories_category_id", syscategoriesCategoryId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSyscategoriesCategoryId() {
		return getLong("sysCategories_category_id");
	}

	/**
	*设置 
	*/
	public M setSysdeptDeptId(java.lang.Long sysdeptDeptId) {
		set("sysDept_dept_id", sysdeptDeptId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSysdeptDeptId() {
		return getLong("sysDept_dept_id");
	}

	/**
	*设置 
	*/
	public M setSysproservicesProsId(java.lang.Long sysproservicesProsId) {
		set("sysProservices_pros_id", sysproservicesProsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSysproservicesProsId() {
		return getLong("sysProservices_pros_id");
	}

	/**
	*设置 
	*/
	public M setExtend(java.lang.String extend) {
		set("extend", extend);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getExtend() {
		return getStr("extend");
	}

	/**
	*设置 
	*/
	public M setReplyPerson(java.lang.String replyPerson) {
		set("reply_person", replyPerson);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getReplyPerson() {
		return getStr("reply_person");
	}

	/**
	*设置 
	*/
	public M setTopicStep(java.lang.Long topicStep) {
		set("topic_step", topicStep);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getTopicStep() {
		return getLong("topic_step");
	}

	/**
	*设置 
	*/
	public M setTopicZd(java.lang.String topicZd) {
		set("topic_zd", topicZd);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTopicZd() {
		return getStr("topic_zd");
	}

	/**
	*设置 
	*/
	public M setZone(java.lang.String zone) {
		set("zone", zone);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getZone() {
		return getStr("zone");
	}

	/**
	*设置 
	*/
	public M setCate(java.lang.String cate) {
		set("cate", cate);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCate() {
		return getStr("cate");
	}

}
