package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba07:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa07<M extends BaseBusBa07<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba070(java.lang.Integer aba070) {
		set("aba070", aba070);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba070() {
		return getInt("aba070");
	}

	/**
	*设置名称 
	*/
	public M setAba071(java.lang.String aba071) {
		set("aba071", aba071);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getAba071() {
		return getStr("aba071");
	}

	/**
	*设置经纬度 
	*/
	public M setAba072(java.lang.String aba072) {
		set("aba072", aba072);
		return (M)this;
	}

	/**
	*获取经纬度 
	*/
	public java.lang.String getAba072() {
		return getStr("aba072");
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
