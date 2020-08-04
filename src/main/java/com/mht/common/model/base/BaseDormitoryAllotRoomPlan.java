package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_allot_room_plan:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryAllotRoomPlan<M extends BaseDormitoryAllotRoomPlan<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPlanId(java.lang.Integer planId) {
		set("plan_id", planId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPlanId() {
		return getInt("plan_id");
	}

	/**
	*设置名称 
	*/
	public M setPlanName(java.lang.String planName) {
		set("plan_name", planName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getPlanName() {
		return getStr("plan_name");
	}

	/**
	*设置内容 
	*/
	public M setPlanContent(java.lang.String planContent) {
		set("plan_content", planContent);
		return (M)this;
	}

	/**
	*获取内容 
	*/
	public java.lang.String getPlanContent() {
		return getStr("plan_content");
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

	/**
	*设置是否可删除 
	*/
	public M setFlag(java.lang.Integer flag) {
		set("flag", flag);
		return (M)this;
	}

	/**
	*获取是否可删除 
	*/
	public java.lang.Integer getFlag() {
		return getInt("flag");
	}

}
