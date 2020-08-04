package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_deploy:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentDeploy<M extends BaseCommentDeploy<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setDeployId(java.lang.Long deployId) {
		set("deploy_id", deployId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getDeployId() {
		return getLong("deploy_id");
	}

	/**
	*设置 
	*/
	public M setDeployReplyIsfilter(java.lang.Integer deployReplyIsfilter) {
		set("deploy_reply_isFilter", deployReplyIsfilter);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDeployReplyIsfilter() {
		return getInt("deploy_reply_isFilter");
	}

	/**
	*设置 
	*/
	public M setDeployReplyIssendmsg(java.lang.Integer deployReplyIssendmsg) {
		set("deploy_reply_isSendMsg", deployReplyIssendmsg);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDeployReplyIssendmsg() {
		return getInt("deploy_reply_isSendMsg");
	}

	/**
	*设置 
	*/
	public M setDeployTopicIsfilter(java.lang.Integer deployTopicIsfilter) {
		set("deploy_topic_isFilter", deployTopicIsfilter);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDeployTopicIsfilter() {
		return getInt("deploy_topic_isFilter");
	}

	/**
	*设置 
	*/
	public M setDeployTopicIssendmsg(java.lang.Integer deployTopicIssendmsg) {
		set("deploy_topic_isSendMsg", deployTopicIssendmsg);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDeployTopicIssendmsg() {
		return getInt("deploy_topic_isSendMsg");
	}

	/**
	*设置 
	*/
	public M setDeployIsfilter(java.lang.Integer deployIsfilter) {
		set("deploy_isFilter", deployIsfilter);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDeployIsfilter() {
		return getInt("deploy_isFilter");
	}

	/**
	*设置 
	*/
	public M setDeployIssendmsg(java.lang.Integer deployIssendmsg) {
		set("deploy_isSendMsg", deployIssendmsg);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDeployIssendmsg() {
		return getInt("deploy_isSendMsg");
	}

}
