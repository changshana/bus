package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_activity:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryActivity<M extends BaseDormitoryActivity<M>> extends Model<M> implements IBean {

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
	*设置主题活动名称 
	*/
	public M setActivityName(java.lang.String activityName) {
		set("activity_name", activityName);
		return (M)this;
	}

	/**
	*获取主题活动名称 
	*/
	public java.lang.String getActivityName() {
		return getStr("activity_name");
	}

	/**
	*设置活动主办方 
	*/
	public M setActivitySponsor(java.lang.String activitySponsor) {
		set("activity_sponsor", activitySponsor);
		return (M)this;
	}

	/**
	*获取活动主办方 
	*/
	public java.lang.String getActivitySponsor() {
		return getStr("activity_sponsor");
	}

	/**
	*设置活动地址 
	*/
	public M setActivityAddr(java.lang.String activityAddr) {
		set("activity_addr", activityAddr);
		return (M)this;
	}

	/**
	*获取活动地址 
	*/
	public java.lang.String getActivityAddr() {
		return getStr("activity_addr");
	}

	/**
	*设置开始时间 
	*/
	public M setBeginTime(java.util.Date beginTime) {
		set("begin_time", beginTime);
		return (M)this;
	}

	/**
	*获取开始时间 
	*/
	public java.util.Date getBeginTime() {
		return get("begin_time");
	}

	/**
	*设置结束时间 
	*/
	public M setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取结束时间 
	*/
	public java.util.Date getEndTime() {
		return get("end_time");
	}

	/**
	*设置联系人 
	*/
	public M setContact(java.lang.String contact) {
		set("contact", contact);
		return (M)this;
	}

	/**
	*获取联系人 
	*/
	public java.lang.String getContact() {
		return getStr("contact");
	}

	/**
	*设置联系电话 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
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
