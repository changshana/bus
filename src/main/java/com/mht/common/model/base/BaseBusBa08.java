package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba08:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa08<M extends BaseBusBa08<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba080(java.lang.Integer aba080) {
		set("aba080", aba080);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba080() {
		return getInt("aba080");
	}

	/**
	*设置时刻表ID 
	*/
	public M setAba050(java.lang.Integer aba050) {
		set("aba050", aba050);
		return (M)this;
	}

	/**
	*获取时刻表ID 
	*/
	public java.lang.Integer getAba050() {
		return getInt("aba050");
	}

	/**
	*设置排队人数 
	*/
	public M setAba081(java.lang.Integer aba081) {
		set("aba081", aba081);
		return (M)this;
	}

	/**
	*获取排队人数 
	*/
	public java.lang.Integer getAba081() {
		return getInt("aba081");
	}

	/**
	*设置是否增派车辆 
	*/
	public M setAba082(java.lang.Integer aba082) {
		set("aba082", aba082);
		return (M)this;
	}

	/**
	*获取是否增派车辆 
	*/
	public java.lang.Integer getAba082() {
		return getInt("aba082");
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
