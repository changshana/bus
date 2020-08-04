package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_inspection_activity:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryInspectionActivity<M extends BaseDormitoryInspectionActivity<M>> extends Model<M> implements IBean {

	/**
	*设置宿舍检查ID 
	*/
	public M setInspectionActivityId(java.lang.Integer inspectionActivityId) {
		set("inspection_activity_id", inspectionActivityId);
		return (M)this;
	}

	/**
	*获取宿舍检查ID 
	*/
	public java.lang.Integer getInspectionActivityId() {
		return getInt("inspection_activity_id");
	}

	/**
	*设置检查标题 
	*/
	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}

	/**
	*获取检查标题 
	*/
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	*设置检查校区ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取检查校区ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置检查频率 
	*/
	public M setFrequency(java.lang.Integer frequency) {
		set("frequency", frequency);
		return (M)this;
	}

	/**
	*获取检查频率 
	*/
	public java.lang.Integer getFrequency() {
		return getInt("frequency");
	}

	/**
	*设置检查时间 
	*/
	public M setTheTime(java.util.Date theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取检查时间 
	*/
	public java.util.Date getTheTime() {
		return get("the_time");
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
