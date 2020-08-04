package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa15:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa15<M extends BaseCanteenAa15<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa150(java.lang.Integer aaa150) {
		set("aaa150", aaa150);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa150() {
		return getInt("aaa150");
	}

	/**
	*设置供货商id 
	*/
	public M setAaa200(java.lang.Integer aaa200) {
		set("aaa200", aaa200);
		return (M)this;
	}

	/**
	*获取供货商id 
	*/
	public java.lang.Integer getAaa200() {
		return getInt("aaa200");
	}

	/**
	*设置餐厅id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取餐厅id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
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

}
