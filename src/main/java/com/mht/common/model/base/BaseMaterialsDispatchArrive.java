package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_dispatch_arrive:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsDispatchArrive<M extends BaseMaterialsDispatchArrive<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDispatchArriveId(java.lang.Integer dispatchArriveId) {
		set("dispatch_arrive_id", dispatchArriveId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDispatchArriveId() {
		return getInt("dispatch_arrive_id");
	}

	/**
	*设置调度详情ID 
	*/
	public M setDispatchDetailsId(java.lang.Integer dispatchDetailsId) {
		set("dispatch_details_id", dispatchDetailsId);
		return (M)this;
	}

	/**
	*获取调度详情ID 
	*/
	public java.lang.Integer getDispatchDetailsId() {
		return getInt("dispatch_details_id");
	}

	/**
	*设置数量 
	*/
	public M setNumber(java.lang.String number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.String getNumber() {
		return getStr("number");
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

}
