package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * return_zone_extend:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseReturnZoneExtend<M extends BaseReturnZoneExtend<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setReturnExtendId(java.lang.Integer returnExtendId) {
		set("return_extend_id", returnExtendId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getReturnExtendId() {
		return getInt("return_extend_id");
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
	*设置操作人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取操作人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置操作时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取操作时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置拒绝理由 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取拒绝理由 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置归还详情ID 
	*/
	public M setReturnId(java.lang.Integer returnId) {
		set("return_id", returnId);
		return (M)this;
	}

	/**
	*获取归还详情ID 
	*/
	public java.lang.Integer getReturnId() {
		return getInt("return_id");
	}

}
