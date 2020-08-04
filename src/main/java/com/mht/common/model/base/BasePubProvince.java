package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pub_province:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePubProvince<M extends BasePubProvince<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setProvinceId(java.lang.Integer provinceId) {
		set("province_id", provinceId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getProvinceId() {
		return getInt("province_id");
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

	/**
	*设置 
	*/
	public M setProvinceName(java.lang.String provinceName) {
		set("province_name", provinceName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getProvinceName() {
		return getStr("province_name");
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
	public M setArea(java.lang.String area) {
		set("area", area);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getArea() {
		return getStr("area");
	}

	/**
	*设置 
	*/
	public M setFullName(java.lang.String fullName) {
		set("full_name", fullName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFullName() {
		return getStr("full_name");
	}

	/**
	*设置 
	*/
	public M setIntro(java.lang.String intro) {
		set("intro", intro);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getIntro() {
		return getStr("intro");
	}

}
