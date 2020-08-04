package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_group:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsGroup<M extends BaseRepairMaterialsGroup<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMgId(java.lang.Integer mgId) {
		set("mg_id", mgId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMgId() {
		return getInt("mg_id");
	}

	/**
	*设置名称 
	*/
	public M setMgName(java.lang.String mgName) {
		set("mg_name", mgName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getMgName() {
		return getStr("mg_name");
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
	*设置材料类型ID 
	*/
	public M setRmcId(java.lang.Integer rmcId) {
		set("rmc_id", rmcId);
		return (M)this;
	}

	/**
	*获取材料类型ID 
	*/
	public java.lang.Integer getRmcId() {
		return getInt("rmc_id");
	}

}
