package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_activity_evaluate:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryActivityEvaluate<M extends BaseDormitoryActivityEvaluate<M>> extends Model<M> implements IBean {

	/**
	*设置评价id 
	*/
	public M setEvaluateId(java.lang.Integer evaluateId) {
		set("evaluate_id", evaluateId);
		return (M)this;
	}

	/**
	*获取评价id 
	*/
	public java.lang.Integer getEvaluateId() {
		return getInt("evaluate_id");
	}

	/**
	*设置主题活动id 
	*/
	public M setActivityId(java.lang.Integer activityId) {
		set("activity_id", activityId);
		return (M)this;
	}

	/**
	*获取主题活动id 
	*/
	public java.lang.Integer getActivityId() {
		return getInt("activity_id");
	}

	/**
	*设置学生id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置评价内容 
	*/
	public M setEvaluateContent(java.lang.String evaluateContent) {
		set("evaluate_content", evaluateContent);
		return (M)this;
	}

	/**
	*获取评价内容 
	*/
	public java.lang.String getEvaluateContent() {
		return getStr("evaluate_content");
	}

	/**
	*设置评价时间 
	*/
	public M setEvaluateTime(java.util.Date evaluateTime) {
		set("evaluate_time", evaluateTime);
		return (M)this;
	}

	/**
	*获取评价时间 
	*/
	public java.util.Date getEvaluateTime() {
		return get("evaluate_time");
	}

	/**
	*设置回复内容 
	*/
	public M setReplyContent(java.lang.String replyContent) {
		set("reply_content", replyContent);
		return (M)this;
	}

	/**
	*获取回复内容 
	*/
	public java.lang.String getReplyContent() {
		return getStr("reply_content");
	}

	/**
	*设置回复时间 
	*/
	public M setReplyTime(java.util.Date replyTime) {
		set("reply_time", replyTime);
		return (M)this;
	}

	/**
	*获取回复时间 
	*/
	public java.util.Date getReplyTime() {
		return get("reply_time");
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
