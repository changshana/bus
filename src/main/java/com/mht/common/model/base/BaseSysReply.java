package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_reply:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysReply<M extends BaseSysReply<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setReplyId(java.lang.Long replyId) {
		set("reply_id", replyId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getReplyId() {
		return getLong("reply_id");
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
	public M setIsExamine(java.lang.Integer isExamine) {
		set("is_examine", isExamine);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getIsExamine() {
		return getInt("is_examine");
	}

	/**
	*设置 
	*/
	public M setReplyDate(java.lang.String replyDate) {
		set("reply_date", replyDate);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getReplyDate() {
		return getStr("reply_date");
	}

	/**
	*设置 
	*/
	public M setReplyIsofficial(java.lang.Integer replyIsofficial) {
		set("reply_isofficial", replyIsofficial);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getReplyIsofficial() {
		return getInt("reply_isofficial");
	}

	/**
	*设置 
	*/
	public M setReplyLaud(java.lang.Integer replyLaud) {
		set("reply_laud", replyLaud);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getReplyLaud() {
		return getInt("reply_laud");
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
	public M setReplyState(java.lang.String replyState) {
		set("replyState", replyState);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getReplyState() {
		return getStr("replyState");
	}

	/**
	*设置 
	*/
	public M setReplyStep(java.lang.Integer replyStep) {
		set("reply_step", replyStep);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getReplyStep() {
		return getInt("reply_step");
	}

	/**
	*设置 
	*/
	public M setReplyText(java.lang.String replyText) {
		set("reply_text", replyText);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getReplyText() {
		return getStr("reply_text");
	}

	/**
	*设置 
	*/
	public M setReplyTime(java.lang.Long replyTime) {
		set("reply_time", replyTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getReplyTime() {
		return getLong("reply_time");
	}

	/**
	*设置 
	*/
	public M setSysaccountAccId(java.lang.Long sysaccountAccId) {
		set("sysAccount_acc_id", sysaccountAccId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSysaccountAccId() {
		return getLong("sysAccount_acc_id");
	}

	/**
	*设置 
	*/
	public M setSystopicTopicId(java.lang.Long systopicTopicId) {
		set("sysTopic_topic_id", systopicTopicId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSystopicTopicId() {
		return getLong("sysTopic_topic_id");
	}

}
