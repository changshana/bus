package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comments_topic:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentsTopic<M extends BaseCommentsTopic<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setTopicId(java.lang.Integer topicId) {
		set("topic_id", topicId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTopicId() {
		return getInt("topic_id");
	}

	/**
	*设置点击量 
	*/
	public M setClickLen(java.lang.Integer clickLen) {
		set("click_len", clickLen);
		return (M)this;
	}

	/**
	*获取点击量 
	*/
	public java.lang.Integer getClickLen() {
		return getInt("click_len");
	}

	/**
	*设置创建时间 
	*/
	public M setTopicData(java.util.Date topicData) {
		set("topic_data", topicData);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getTopicData() {
		return get("topic_data");
	}

	/**
	*设置点赞数 
	*/
	public M setLaud(java.lang.Integer laud) {
		set("laud", laud);
		return (M)this;
	}

	/**
	*获取点赞数 
	*/
	public java.lang.Integer getLaud() {
		return getInt("laud");
	}

	/**
	*设置状态 
	*/
	public M setState(java.lang.Integer state) {
		set("state", state);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getState() {
		return getInt("state");
	}

	/**
	*设置李艳内容 
	*/
	public M setTopicText(java.lang.String topicText) {
		set("topic_text", topicText);
		return (M)this;
	}

	/**
	*获取李艳内容 
	*/
	public java.lang.String getTopicText() {
		return getStr("topic_text");
	}

	/**
	*设置标题 
	*/
	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}

	/**
	*获取标题 
	*/
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	*设置更新时间 
	*/
	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}

	/**
	*获取更新时间 
	*/
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	/**
	*设置操作人 
	*/
	public M setUser(java.lang.Integer user) {
		set("user", user);
		return (M)this;
	}

	/**
	*获取操作人 
	*/
	public java.lang.Integer getUser() {
		return getInt("user");
	}

	/**
	*设置部门 
	*/
	public M setDept(java.lang.String dept) {
		set("dept", dept);
		return (M)this;
	}

	/**
	*获取部门 
	*/
	public java.lang.String getDept() {
		return getStr("dept");
	}

	/**
	*设置扩展 
	*/
	public M setExtend(java.lang.String extend) {
		set("extend", extend);
		return (M)this;
	}

	/**
	*获取扩展 
	*/
	public java.lang.String getExtend() {
		return getStr("extend");
	}

	/**
	*设置回复人 
	*/
	public M setReplyPerson(java.lang.Integer replyPerson) {
		set("reply_person", replyPerson);
		return (M)this;
	}

	/**
	*获取回复人 
	*/
	public java.lang.Integer getReplyPerson() {
		return getInt("reply_person");
	}

	/**
	*设置踩 
	*/
	public M setStep(java.lang.Integer step) {
		set("step", step);
		return (M)this;
	}

	/**
	*获取踩 
	*/
	public java.lang.Integer getStep() {
		return getInt("step");
	}

	/**
	*设置置顶 
	*/
	public M setSetTop(java.util.Date setTop) {
		set("set_top", setTop);
		return (M)this;
	}

	/**
	*获取置顶 
	*/
	public java.util.Date getSetTop() {
		return get("set_top");
	}

	/**
	*设置校区 
	*/
	public M setZone(java.lang.Integer zone) {
		set("zone", zone);
		return (M)this;
	}

	/**
	*获取校区 
	*/
	public java.lang.Integer getZone() {
		return getInt("zone");
	}

	/**
	*设置回复内容 
	*/
	public M setReplyText(java.lang.String replyText) {
		set("reply_text", replyText);
		return (M)this;
	}

	/**
	*获取回复内容 
	*/
	public java.lang.String getReplyText() {
		return getStr("reply_text");
	}

}
