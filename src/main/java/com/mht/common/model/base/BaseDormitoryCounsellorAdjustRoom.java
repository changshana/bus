package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_counsellor_adjust_room:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCounsellorAdjustRoom<M extends BaseDormitoryCounsellorAdjustRoom<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAdjustId(java.lang.Integer adjustId) {
		set("adjust_id", adjustId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAdjustId() {
		return getInt("adjust_id");
	}

	/**
	*设置辅导员ID 
	*/
	public M setCounsellorId(java.lang.Integer counsellorId) {
		set("counsellor_id", counsellorId);
		return (M)this;
	}

	/**
	*获取辅导员ID 
	*/
	public java.lang.Integer getCounsellorId() {
		return getInt("counsellor_id");
	}

	/**
	*设置调宿前床位ID 
	*/
	public M setBeforeBedId(java.lang.Integer beforeBedId) {
		set("before_bed_id", beforeBedId);
		return (M)this;
	}

	/**
	*获取调宿前床位ID 
	*/
	public java.lang.Integer getBeforeBedId() {
		return getInt("before_bed_id");
	}

	/**
	*设置调宿后床位ID 
	*/
	public M setAfterBedId(java.lang.Integer afterBedId) {
		set("after_bed_id", afterBedId);
		return (M)this;
	}

	/**
	*获取调宿后床位ID 
	*/
	public java.lang.Integer getAfterBedId() {
		return getInt("after_bed_id");
	}

	/**
	*设置入住状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取入住状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
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

}
