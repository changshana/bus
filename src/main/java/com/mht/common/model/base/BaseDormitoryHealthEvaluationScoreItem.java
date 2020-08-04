package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_health_evaluation_score_item:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryHealthEvaluationScoreItem<M extends BaseDormitoryHealthEvaluationScoreItem<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	*设置宿舍卫生评比分数ID 
	*/
	public M setScoreId(java.lang.Integer scoreId) {
		set("score_id", scoreId);
		return (M)this;
	}

	/**
	*获取宿舍卫生评比分数ID 
	*/
	public java.lang.Integer getScoreId() {
		return getInt("score_id");
	}

	/**
	*设置检查项目ID 
	*/
	public M setItemId(java.lang.Integer itemId) {
		set("item_id", itemId);
		return (M)this;
	}

	/**
	*获取检查项目ID 
	*/
	public java.lang.Integer getItemId() {
		return getInt("item_id");
	}

	/**
	*设置检查项目得分 
	*/
	public M setItemScore(java.lang.String itemScore) {
		set("item_score", itemScore);
		return (M)this;
	}

	/**
	*获取检查项目得分 
	*/
	public java.lang.String getItemScore() {
		return getStr("item_score");
	}

}
