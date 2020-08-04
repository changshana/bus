package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa08:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa08<M extends BaseCanteenAa08<M>> extends Model<M> implements IBean {

	/**
	*设置中心库ID 
	*/
	public M setAaa080(java.lang.Integer aaa080) {
		set("aaa080", aaa080);
		return (M)this;
	}

	/**
	*获取中心库ID 
	*/
	public java.lang.Integer getAaa080() {
		return getInt("aaa080");
	}

	/**
	*设置中心库名称 
	*/
	public M setAaa081(java.lang.String aaa081) {
		set("aaa081", aaa081);
		return (M)this;
	}

	/**
	*获取中心库名称 
	*/
	public java.lang.String getAaa081() {
		return getStr("aaa081");
	}

	/**
	*设置中心库供需机构（机构s） 
	*/
	public M setAaa082(java.lang.String aaa082) {
		set("aaa082", aaa082);
		return (M)this;
	}

	/**
	*获取中心库供需机构（机构s） 
	*/
	public java.lang.String getAaa082() {
		return getStr("aaa082");
	}

	/**
	*设置状态 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getAaa996() {
		return getInt("aaa996");
	}

	/**
	*设置创建用户 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getAaa997() {
		return getStr("aaa997");
	}

	/**
	*设置创建时间 
	*/
	public M setAaa998(java.util.Date aaa998) {
		set("aaa998", aaa998);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getAaa998() {
		return get("aaa998");
	}

	/**
	*设置备注 
	*/
	public M setAaa999(java.lang.String aaa999) {
		set("aaa999", aaa999);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getAaa999() {
		return getStr("aaa999");
	}

	/**
	*设置餐链系统门店主键id 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("departmentId", departmentId);
		return (M)this;
	}

	/**
	*获取餐链系统门店主键id 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("departmentId");
	}

	/**
	*设置门店AccessToken 
	*/
	public M setAccesstoken(java.lang.String accesstoken) {
		set("accesstoken", accesstoken);
		return (M)this;
	}

	/**
	*获取门店AccessToken 
	*/
	public java.lang.String getAccesstoken() {
		return getStr("accesstoken");
	}

	/**
	*设置电子秤唯一标识码（ids） 
	*/
	public M setAaa083(java.lang.String aaa083) {
		set("aaa083", aaa083);
		return (M)this;
	}

	/**
	*获取电子秤唯一标识码（ids） 
	*/
	public java.lang.String getAaa083() {
		return getStr("aaa083");
	}

	/**
	*设置机构id（隶属于机构） 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取机构id（隶属于机构） 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

}
