package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_feedback_template:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairFeedbackTemplate<M extends BaseRepairFeedbackTemplate<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setFeedbackTemplateId(java.lang.Integer feedbackTemplateId) {
		set("feedback_template_id", feedbackTemplateId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFeedbackTemplateId() {
		return getInt("feedback_template_id");
	}

	/**
	*设置 
	*/
	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	*设置 
	*/
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getContent() {
		return getStr("content");
	}

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
	}

}
