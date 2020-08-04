package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pub_country:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePubCountry<M extends BasePubCountry<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setCountryId(java.lang.Integer countryId) {
		set("country_id", countryId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getCountryId() {
		return getInt("country_id");
	}

	/**
	*设置 
	*/
	public M setCountryCode(java.lang.String countryCode) {
		set("country_code", countryCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCountryCode() {
		return getStr("country_code");
	}

	/**
	*设置 
	*/
	public M setCountryName(java.lang.String countryName) {
		set("country_name", countryName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCountryName() {
		return getStr("country_name");
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

}
