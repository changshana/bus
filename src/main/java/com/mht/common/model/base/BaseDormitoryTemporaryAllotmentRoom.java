package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_temporary_allotment_room:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryTemporaryAllotmentRoom<M extends BaseDormitoryTemporaryAllotmentRoom<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAllotmentId(java.lang.Integer allotmentId) {
		set("allotment_id", allotmentId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAllotmentId() {
		return getInt("allotment_id");
	}

	/**
	*设置临客信息id 
	*/
	public M setTemporaryId(java.lang.Integer temporaryId) {
		set("temporary_id", temporaryId);
		return (M)this;
	}

	/**
	*获取临客信息id 
	*/
	public java.lang.Integer getTemporaryId() {
		return getInt("temporary_id");
	}

	/**
	*设置床位id 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取床位id 
	*/
	public java.lang.Integer getBedId() {
		return getInt("bed_id");
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
	*设置创建日期 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

}
