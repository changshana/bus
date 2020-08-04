package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_health_evaluation_item:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryHealthEvaluationItem<M extends BaseDormitoryHealthEvaluationItem<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setItemId(java.lang.Integer itemId) {
		set("item_id", itemId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getItemId() {
		return getInt("item_id");
	}

	/**
	*设置检查项目 
	*/
	public M setItemName(java.lang.String itemName) {
		set("item_name", itemName);
		return (M)this;
	}

	/**
	*获取检查项目 
	*/
	public java.lang.String getItemName() {
		return getStr("item_name");
	}

	/**
	*设置检查内容 
	*/
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取检查内容 
	*/
	public java.lang.String getContent() {
		return getStr("content");
	}

	/**
	*设置评分标准（总分） 
	*/
	public M setScore(java.lang.String score) {
		set("score", score);
		return (M)this;
	}

	/**
	*获取评分标准（总分） 
	*/
	public java.lang.String getScore() {
		return getStr("score");
	}

	/**
	*设置项目类型 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取项目类型 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
	}

}
