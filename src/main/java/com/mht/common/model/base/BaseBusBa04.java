package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba04:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa04<M extends BaseBusBa04<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba040(java.lang.Integer aba040) {
		set("aba040", aba040);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba040() {
		return getInt("aba040");
	}

	/**
	*设置车辆类型id 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取车辆类型id 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
	}

	/**
	*设置座位号码 
	*/
	public M setAba041(java.lang.Integer aba041) {
		set("aba041", aba041);
		return (M)this;
	}

	/**
	*获取座位号码 
	*/
	public java.lang.Integer getAba041() {
		return getInt("aba041");
	}

	/**
	*设置座位X坐标 
	*/
	public M setAba042(java.lang.String aba042) {
		set("aba042", aba042);
		return (M)this;
	}

	/**
	*获取座位X坐标 
	*/
	public java.lang.String getAba042() {
		return getStr("aba042");
	}

	/**
	*设置座位Y坐标 
	*/
	public M setAba043(java.lang.String aba043) {
		set("aba043", aba043);
		return (M)this;
	}

	/**
	*获取座位Y坐标 
	*/
	public java.lang.String getAba043() {
		return getStr("aba043");
	}

	/**
	*设置座位状态(空、已选、锁定) 
	*/
	public M setAba044(java.lang.String aba044) {
		set("aba044", aba044);
		return (M)this;
	}

	/**
	*获取座位状态(空、已选、锁定) 
	*/
	public java.lang.String getAba044() {
		return getStr("aba044");
	}

	/**
	*设置方格号 
	*/
	public M setAba045(java.lang.Integer aba045) {
		set("aba045", aba045);
		return (M)this;
	}

	/**
	*获取方格号 
	*/
	public java.lang.Integer getAba045() {
		return getInt("aba045");
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
