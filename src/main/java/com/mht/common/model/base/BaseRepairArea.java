package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_area:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairArea<M extends BaseRepairArea<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setAreaId(java.lang.Integer areaId) {
		set("area_id", areaId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAreaId() {
		return getInt("area_id");
	}

	/**
	*设置 
	*/
	public M setSchoolZone(java.lang.Integer schoolZone) {
		set("school_zone", schoolZone);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getSchoolZone() {
		return getInt("school_zone");
	}

	/**
	*设置 
	*/
	public M setAreaCode(java.lang.String areaCode) {
		set("area_code", areaCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAreaCode() {
		return getStr("area_code");
	}

	/**
	*设置 
	*/
	public M setAreaName(java.lang.String areaName) {
		set("area_name", areaName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAreaName() {
		return getStr("area_name");
	}

	/**
	*设置 
	*/
	public M setParent(java.lang.String parent) {
		set("parent", parent);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getParent() {
		return getStr("parent");
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

}
