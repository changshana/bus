package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_evaluation_activity:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryEvaluationActivity<M extends BaseDormitoryEvaluationActivity<M>> extends Model<M> implements IBean {

	/**
	*设置评比活动ID 
	*/
	public M setEvaluationActivityId(java.lang.Integer evaluationActivityId) {
		set("evaluation_activity_id", evaluationActivityId);
		return (M)this;
	}

	/**
	*获取评比活动ID 
	*/
	public java.lang.Integer getEvaluationActivityId() {
		return getInt("evaluation_activity_id");
	}

	/**
	*设置活动标题 
	*/
	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}

	/**
	*获取活动标题 
	*/
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	*设置评比校区ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取评比校区ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置评比频率 
	*/
	public M setFrequency(java.lang.Integer frequency) {
		set("frequency", frequency);
		return (M)this;
	}

	/**
	*获取评比频率 
	*/
	public java.lang.Integer getFrequency() {
		return getInt("frequency");
	}

	/**
	*设置评比时间 
	*/
	public M setTheTime(java.util.Date theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取评比时间 
	*/
	public java.util.Date getTheTime() {
		return get("the_time");
	}

	/**
	*设置评比内容 
	*/
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取评比内容 
	*/
	public java.lang.String getContent() {
		return getStr("content");
	}

	/**
	*设置宣传图url 
	*/
	public M setPicUrl(java.lang.String picUrl) {
		set("picUrl", picUrl);
		return (M)this;
	}

	/**
	*获取宣传图url 
	*/
	public java.lang.String getPicUrl() {
		return getStr("picUrl");
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
	*设置是否添加违规信息 
	*/
	public M setIsViolate(java.lang.Integer isViolate) {
		set("is_violate", isViolate);
		return (M)this;
	}

	/**
	*获取是否添加违规信息 
	*/
	public java.lang.Integer getIsViolate() {
		return getInt("is_violate");
	}

	/**
	*设置是否添加违规电器信息 
	*/
	public M setIsElectric(java.lang.Integer isElectric) {
		set("is_electric", isElectric);
		return (M)this;
	}

	/**
	*获取是否添加违规电器信息 
	*/
	public java.lang.Integer getIsElectric() {
		return getInt("is_electric");
	}

	/**
	*设置是否添加晚归信息 
	*/
	public M setIsLate(java.lang.Integer isLate) {
		set("is_late", isLate);
		return (M)this;
	}

	/**
	*获取是否添加晚归信息 
	*/
	public java.lang.Integer getIsLate() {
		return getInt("is_late");
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

}
