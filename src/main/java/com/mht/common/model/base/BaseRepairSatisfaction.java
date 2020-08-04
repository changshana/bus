package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_satisfaction:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairSatisfaction<M extends BaseRepairSatisfaction<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setRsId(java.lang.Integer rsId) {
		set("rs_id", rsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRsId() {
		return getInt("rs_id");
	}

	/**
	*设置 
	*/
	public M setRsName(java.lang.String rsName) {
		set("rs_name", rsName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRsName() {
		return getStr("rs_name");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

}
