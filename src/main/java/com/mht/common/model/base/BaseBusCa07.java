package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ca07:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusCa07<M extends BaseBusCa07<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca070(java.lang.Integer aca070) {
		set("aca070", aca070);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca070() {
		return getInt("aca070");
	}

	/**
	*设置日期 
	*/
	public M setAca071(java.util.Date aca071) {
		set("aca071", aca071);
		return (M)this;
	}

	/**
	*获取日期 
	*/
	public java.util.Date getAca071() {
		return get("aca071");
	}

	/**
	*设置发车时间类型 
	*/
	public M setAba055(java.lang.Integer aba055) {
		set("aba055", aba055);
		return (M)this;
	}

	/**
	*获取发车时间类型 
	*/
	public java.lang.Integer getAba055() {
		return getInt("aba055");
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
