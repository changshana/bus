package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_style_like_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryStyleLikeRecord<M extends BaseDormitoryStyleLikeRecord<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setStyleLikeRecordId(java.lang.Integer styleLikeRecordId) {
		set("style_like_record_id", styleLikeRecordId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getStyleLikeRecordId() {
		return getInt("style_like_record_id");
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
	*设置宿舍评比内容id 
	*/
	public M setStyleId(java.lang.Integer styleId) {
		set("style_id", styleId);
		return (M)this;
	}

	/**
	*获取宿舍评比内容id 
	*/
	public java.lang.Integer getStyleId() {
		return getInt("style_id");
	}

	/**
	*设置点赞类型 
	*/
	public M setLikeType(java.lang.String likeType) {
		set("like_type", likeType);
		return (M)this;
	}

	/**
	*获取点赞类型 
	*/
	public java.lang.String getLikeType() {
		return getStr("like_type");
	}

	/**
	*设置创建用户 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置创建时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
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

	/**
	*设置备注 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置活动id 
	*/
	public M setEvaluationActivityId(java.lang.Integer evaluationActivityId) {
		set("evaluation_activity_id", evaluationActivityId);
		return (M)this;
	}

	/**
	*获取活动id 
	*/
	public java.lang.Integer getEvaluationActivityId() {
		return getInt("evaluation_activity_id");
	}

}
