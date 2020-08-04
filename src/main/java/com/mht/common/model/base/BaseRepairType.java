package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_type:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairType<M extends BaseRepairType<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setTypeId(java.lang.Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTypeId() {
		return getInt("type_id");
	}

	/**
	*设置 
	*/
	public M setTypeName(java.lang.String typeName) {
		set("type_name", typeName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTypeName() {
		return getStr("type_name");
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

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置 
	*/
	public M setTypeCode(java.lang.String typeCode) {
		set("type_code", typeCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTypeCode() {
		return getStr("type_code");
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
