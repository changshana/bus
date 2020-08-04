package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_zone_materials:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairZoneMaterials<M extends BaseRepairZoneMaterials<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setZoneMaterialsId(java.lang.Integer zoneMaterialsId) {
		set("zone_materials_id", zoneMaterialsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getZoneMaterialsId() {
		return getInt("zone_materials_id");
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
	public M setMaterialsId(java.lang.Integer materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getMaterialsId() {
		return getInt("materials_id");
	}

	/**
	*设置 
	*/
	public M setNumber(java.lang.Integer number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getNumber() {
		return getInt("number");
	}

	/**
	*设置 
	*/
	public M setZoneId(java.lang.Integer zoneId) {
		set("zone_id", zoneId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getZoneId() {
		return getInt("zone_id");
	}

}
