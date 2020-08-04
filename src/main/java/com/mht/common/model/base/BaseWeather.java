package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * weather:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWeather<M extends BaseWeather<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setWeatherId(java.lang.Integer weatherId) {
		set("weather_id", weatherId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getWeatherId() {
		return getInt("weather_id");
	}

	/**
	*设置省 
	*/
	public M setRegion(java.lang.String region) {
		set("region", region);
		return (M)this;
	}

	/**
	*获取省 
	*/
	public java.lang.String getRegion() {
		return getStr("region");
	}

	/**
	*设置省份ID 
	*/
	public M setRegionId(java.lang.String regionId) {
		set("region_id", regionId);
		return (M)this;
	}

	/**
	*获取省份ID 
	*/
	public java.lang.String getRegionId() {
		return getStr("region_id");
	}

	/**
	*设置城市 
	*/
	public M setCity(java.lang.String city) {
		set("city", city);
		return (M)this;
	}

	/**
	*获取城市 
	*/
	public java.lang.String getCity() {
		return getStr("city");
	}

	/**
	*设置城市id 
	*/
	public M setCityId(java.lang.String cityId) {
		set("city_id", cityId);
		return (M)this;
	}

	/**
	*获取城市id 
	*/
	public java.lang.String getCityId() {
		return getStr("city_id");
	}

	/**
	*设置天气数据JSON 
	*/
	public M setWeatherData(java.lang.String weatherData) {
		set("weather_data", weatherData);
		return (M)this;
	}

	/**
	*获取天气数据JSON 
	*/
	public java.lang.String getWeatherData() {
		return getStr("weather_data");
	}

	/**
	*设置添加时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取添加时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置更新时间 
	*/
	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}

	/**
	*获取更新时间 
	*/
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
