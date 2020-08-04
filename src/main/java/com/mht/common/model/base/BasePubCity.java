package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pub_city:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePubCity<M extends BasePubCity<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setCityId(java.lang.Integer cityId) {
		set("city_id", cityId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getCityId() {
		return getInt("city_id");
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

	/**
	*设置 
	*/
	public M setCityName(java.lang.String cityName) {
		set("city_name", cityName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCityName() {
		return getStr("city_name");
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
	public M setProvinceCode(java.lang.String provinceCode) {
		set("province_code", provinceCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getProvinceCode() {
		return getStr("province_code");
	}

}
