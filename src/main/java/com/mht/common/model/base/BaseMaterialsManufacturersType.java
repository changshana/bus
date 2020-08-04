package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_manufacturers_type:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsManufacturersType<M extends BaseMaterialsManufacturersType<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setManufacturersTypeId(java.lang.Integer manufacturersTypeId) {
		set("manufacturers_type_id", manufacturersTypeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getManufacturersTypeId() {
		return getInt("manufacturers_type_id");
	}

	/**
	*设置名称 
	*/
	public M setManufacturersTypeName(java.lang.String manufacturersTypeName) {
		set("manufacturers_type_name", manufacturersTypeName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getManufacturersTypeName() {
		return getStr("manufacturers_type_name");
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
