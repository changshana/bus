package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_class:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsClass<M extends BaseRepairMaterialsClass<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMcId(java.lang.Integer mcId) {
		set("mc_id", mcId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMcId() {
		return getInt("mc_id");
	}

	/**
	*设置名称 
	*/
	public M setMcName(java.lang.String mcName) {
		set("mc_name", mcName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getMcName() {
		return getStr("mc_name");
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
