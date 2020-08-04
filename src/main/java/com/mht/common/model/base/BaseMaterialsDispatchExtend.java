package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_dispatch_extend:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsDispatchExtend<M extends BaseMaterialsDispatchExtend<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setExtendId(java.lang.Integer extendId) {
		set("extend_id", extendId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getExtendId() {
		return getInt("extend_id");
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
	*设置审核人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置审核时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取审核时间 
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
	*设置调度ID 
	*/
	public M setDispatchId(java.lang.Integer dispatchId) {
		set("dispatch_id", dispatchId);
		return (M)this;
	}

	/**
	*获取调度ID 
	*/
	public java.lang.Integer getDispatchId() {
		return getInt("dispatch_id");
	}

}
