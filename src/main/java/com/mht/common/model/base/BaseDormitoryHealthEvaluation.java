package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_health_evaluation:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryHealthEvaluation<M extends BaseDormitoryHealthEvaluation<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setEvaluationId(java.lang.Integer evaluationId) {
		set("evaluation_id", evaluationId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getEvaluationId() {
		return getInt("evaluation_id");
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
	*设置时间 
	*/
	public M setTime(java.util.Date time) {
		set("time", time);
		return (M)this;
	}

	/**
	*获取时间 
	*/
	public java.util.Date getTime() {
		return get("time");
	}

}
