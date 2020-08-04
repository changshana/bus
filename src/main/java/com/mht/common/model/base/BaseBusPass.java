package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_pass:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusPass<M extends BaseBusPass<M>> extends Model<M> implements IBean {

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
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取班车 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
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
