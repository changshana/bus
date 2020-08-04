package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * car_pass:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCarPass<M extends BaseCarPass<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPassId(java.lang.Integer passId) {
		set("pass_id", passId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPassId() {
		return getInt("pass_id");
	}

	/**
	*设置名称 
	*/
	public M setPassName(java.lang.String passName) {
		set("pass_name", passName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getPassName() {
		return getStr("pass_name");
	}

	/**
	*设置编号 
	*/
	public M setPassCode(java.lang.String passCode) {
		set("pass_code", passCode);
		return (M)this;
	}

	/**
	*获取编号 
	*/
	public java.lang.String getPassCode() {
		return getStr("pass_code");
	}

	/**
	*设置排序 
	*/
	public M setOrderCode(java.lang.Integer orderCode) {
		set("order_code", orderCode);
		return (M)this;
	}

	/**
	*获取排序 
	*/
	public java.lang.Integer getOrderCode() {
		return getInt("order_code");
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
	*设置班车 
	*/
	public M setRouteId(java.lang.Integer routeId) {
		set("route_id", routeId);
		return (M)this;
	}

	/**
	*获取班车 
	*/
	public java.lang.Integer getRouteId() {
		return getInt("route_id");
	}

	/**
	*设置 
	*/
	public M setLocation(java.lang.String location) {
		set("location", location);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getLocation() {
		return getStr("location");
	}

}
