package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_direction:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusDirection<M extends BaseBusDirection<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDirectionId(java.lang.Integer directionId) {
		set("direction_id", directionId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDirectionId() {
		return getInt("direction_id");
	}

	/**
	*设置名称 
	*/
	public M setDirectionName(java.lang.String directionName) {
		set("direction_name", directionName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getDirectionName() {
		return getStr("direction_name");
	}

	/**
	*设置排序 
	*/
	public M setOrderIndex(java.lang.Integer orderIndex) {
		set("order_index", orderIndex);
		return (M)this;
	}

	/**
	*获取排序 
	*/
	public java.lang.Integer getOrderIndex() {
		return getInt("order_index");
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
	*设置 
	*/
	public M setBusTypeId(java.lang.Integer busTypeId) {
		set("bus_type_id", busTypeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getBusTypeId() {
		return getInt("bus_type_id");
	}

}
