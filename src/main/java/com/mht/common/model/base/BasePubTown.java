package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pub_town:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePubTown<M extends BasePubTown<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setTownId(java.lang.Integer townId) {
		set("town_id", townId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTownId() {
		return getInt("town_id");
	}

	/**
	*设置 
	*/
	public M setTownCode(java.lang.String townCode) {
		set("town_code", townCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTownCode() {
		return getStr("town_code");
	}

	/**
	*设置 
	*/
	public M setTownName(java.lang.String townName) {
		set("town_name", townName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTownName() {
		return getStr("town_name");
	}

	/**
	*设置 
	*/
	public M setShortName(java.lang.String shortName) {
		set("short_name", shortName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getShortName() {
		return getStr("short_name");
	}

	/**
	*设置 
	*/
	public M setType(java.lang.String type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getType() {
		return getStr("type");
	}

	/**
	*设置 
	*/
	public M setCityCode(java.lang.String cityCode) {
		set("city_code", cityCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCityCode() {
		return getStr("city_code");
	}

}
