package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_aa04:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusAa04<M extends BaseBusAa04<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa040(java.lang.Integer aaa040) {
		set("aaa040", aaa040);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa040() {
		return getInt("aaa040");
	}

	/**
	*设置姓名 
	*/
	public M setAaa041(java.lang.String aaa041) {
		set("aaa041", aaa041);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getAaa041() {
		return getStr("aaa041");
	}

	/**
	*设置手机号码 
	*/
	public M setAaa042(java.lang.String aaa042) {
		set("aaa042", aaa042);
		return (M)this;
	}

	/**
	*获取手机号码 
	*/
	public java.lang.String getAaa042() {
		return getStr("aaa042");
	}

	/**
	*设置身份证号 
	*/
	public M setAaa043(java.lang.String aaa043) {
		set("aaa043", aaa043);
		return (M)this;
	}

	/**
	*获取身份证号 
	*/
	public java.lang.String getAaa043() {
		return getStr("aaa043");
	}

	/**
	*设置有效性 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取有效性 
	*/
	public java.lang.Integer getAaa996() {
		return getInt("aaa996");
	}

	/**
	*设置创建人 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取创建人 
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
