package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba06:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa06<M extends BaseBusBa06<M>> extends Model<M> implements IBean {

	/**
	*设置预约时间ID 
	*/
	public M setAba060(java.lang.Integer aba060) {
		set("aba060", aba060);
		return (M)this;
	}

	/**
	*获取预约时间ID 
	*/
	public java.lang.Integer getAba060() {
		return getInt("aba060");
	}

	/**
	*设置预约时间名称 
	*/
	public M setAba061(java.lang.String aba061) {
		set("aba061", aba061);
		return (M)this;
	}

	/**
	*获取预约时间名称 
	*/
	public java.lang.String getAba061() {
		return getStr("aba061");
	}

	/**
	*设置预约开始时间数目 
	*/
	public M setAba062(java.lang.Integer aba062) {
		set("aba062", aba062);
		return (M)this;
	}

	/**
	*获取预约开始时间数目 
	*/
	public java.lang.Integer getAba062() {
		return getInt("aba062");
	}

	/**
	*设置预约开始时间单位 
	*/
	public M setAba063(java.lang.Integer aba063) {
		set("aba063", aba063);
		return (M)this;
	}

	/**
	*获取预约开始时间单位 
	*/
	public java.lang.Integer getAba063() {
		return getInt("aba063");
	}

	/**
	*设置预约结束时间数目 
	*/
	public M setAba064(java.lang.Integer aba064) {
		set("aba064", aba064);
		return (M)this;
	}

	/**
	*获取预约结束时间数目 
	*/
	public java.lang.Integer getAba064() {
		return getInt("aba064");
	}

	/**
	*设置预约结束时间单位 
	*/
	public M setAba065(java.lang.Integer aba065) {
		set("aba065", aba065);
		return (M)this;
	}

	/**
	*获取预约结束时间单位 
	*/
	public java.lang.Integer getAba065() {
		return getInt("aba065");
	}

	/**
	*设置状态 
	*/
	public M setAba996(java.lang.Integer aba996) {
		set("aba996", aba996);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getAba996() {
		return getInt("aba996");
	}

	/**
	*设置创建用户 
	*/
	public M setAba997(java.lang.String aba997) {
		set("aba997", aba997);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getAba997() {
		return getStr("aba997");
	}

	/**
	*设置创建时间 
	*/
	public M setAba998(java.util.Date aba998) {
		set("aba998", aba998);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getAba998() {
		return get("aba998");
	}

	/**
	*设置备注 
	*/
	public M setAba999(java.lang.String aba999) {
		set("aba999", aba999);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getAba999() {
		return getStr("aba999");
	}

}
