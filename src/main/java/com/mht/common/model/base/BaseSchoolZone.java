package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * school_zone:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSchoolZone<M extends BaseSchoolZone<M>> extends Model<M> implements IBean {

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

	/**
	*设置 
	*/
	public M setZoneName(java.lang.String zoneName) {
		set("zone_name", zoneName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getZoneName() {
		return getStr("zone_name");
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

}
