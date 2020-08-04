package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_health_evaluation_score:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryHealthEvaluationScore<M extends BaseDormitoryHealthEvaluationScore<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setScoreId(java.lang.Integer scoreId) {
		set("score_id", scoreId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getScoreId() {
		return getInt("score_id");
	}

	/**
	*设置楼宇 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取楼宇 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置宿舍ID 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取宿舍ID 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置宿舍号 
	*/
	public M setRoomNum(java.lang.String roomNum) {
		set("room_num", roomNum);
		return (M)this;
	}

	/**
	*获取宿舍号 
	*/
	public java.lang.String getRoomNum() {
		return getStr("room_num");
	}

	/**
	*设置总分 
	*/
	public M setTotalScore(java.lang.String totalScore) {
		set("total_score", totalScore);
		return (M)this;
	}

	/**
	*获取总分 
	*/
	public java.lang.String getTotalScore() {
		return getStr("total_score");
	}

	/**
	*设置安全得分 
	*/
	public M setSafetyScore(java.lang.String safetyScore) {
		set("safety_score", safetyScore);
		return (M)this;
	}

	/**
	*获取安全得分 
	*/
	public java.lang.String getSafetyScore() {
		return getStr("safety_score");
	}

	/**
	*设置卫生得分 
	*/
	public M setHealthScore(java.lang.String healthScore) {
		set("health_score", healthScore);
		return (M)this;
	}

	/**
	*获取卫生得分 
	*/
	public java.lang.String getHealthScore() {
		return getStr("health_score");
	}

	/**
	*设置评比ID 
	*/
	public M setEvaluationId(java.lang.Integer evaluationId) {
		set("evaluation_id", evaluationId);
		return (M)this;
	}

	/**
	*获取评比ID 
	*/
	public java.lang.Integer getEvaluationId() {
		return getInt("evaluation_id");
	}

}
