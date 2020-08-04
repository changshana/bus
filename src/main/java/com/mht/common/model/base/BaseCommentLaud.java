package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_laud:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentLaud<M extends BaseCommentLaud<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setLaudId(java.lang.Long laudId) {
		set("laud_id", laudId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getLaudId() {
		return getLong("laud_id");
	}

	/**
	*设置 
	*/
	public M setAccountAccId(java.lang.Long accountAccId) {
		set("account_acc_id", accountAccId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getAccountAccId() {
		return getLong("account_acc_id");
	}

	/**
	*设置 
	*/
	public M setReplyReplyId(java.lang.Long replyReplyId) {
		set("reply_reply_id", replyReplyId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getReplyReplyId() {
		return getLong("reply_reply_id");
	}

	/**
	*设置 
	*/
	public M setTopicTopicId(java.lang.Long topicTopicId) {
		set("topic_topic_id", topicTopicId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getTopicTopicId() {
		return getLong("topic_topic_id");
	}

	/**
	*设置 
	*/
	public M setLaudState(java.lang.String laudState) {
		set("laud_state", laudState);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getLaudState() {
		return getStr("laud_state");
	}

	/**
	*设置 
	*/
	public M setReplyStepReplyId(java.lang.Long replyStepReplyId) {
		set("reply_step_reply_id", replyStepReplyId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getReplyStepReplyId() {
		return getLong("reply_step_reply_id");
	}

	/**
	*设置 
	*/
	public M setTopicStepTopicId(java.lang.Long topicStepTopicId) {
		set("topic_step_topic_id", topicStepTopicId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getTopicStepTopicId() {
		return getLong("topic_step_topic_id");
	}

}
