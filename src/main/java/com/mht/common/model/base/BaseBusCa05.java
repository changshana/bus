package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ca05:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusCa05<M extends BaseBusCa05<M>> extends Model<M> implements IBean {

	/**
	*设置班次ID 
	*/
	public M setAca050(java.lang.Integer aca050) {
		set("aca050", aca050);
		return (M)this;
	}

	/**
	*获取班次ID 
	*/
	public java.lang.Integer getAca050() {
		return getInt("aca050");
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
	*设置驾驶员ID 
	*/
	public M setAaa020(java.lang.Integer aaa020) {
		set("aaa020", aaa020);
		return (M)this;
	}

	/**
	*获取驾驶员ID 
	*/
	public java.lang.Integer getAaa020() {
		return getInt("aaa020");
	}

	/**
	*设置车辆ID 
	*/
	public M setAaa001(java.lang.Integer aaa001) {
		set("aaa001", aaa001);
		return (M)this;
	}

	/**
	*获取车辆ID 
	*/
	public java.lang.Integer getAaa001() {
		return getInt("aaa001");
	}

	/**
	*设置日期 
	*/
	public M setAca051(java.util.Date aca051) {
		set("aca051", aca051);
		return (M)this;
	}

	/**
	*获取日期 
	*/
	public java.util.Date getAca051() {
		return get("aca051");
	}

	/**
	*设置调度员电话号码 
	*/
	public M setAca052(java.lang.String aca052) {
		set("aca052", aca052);
		return (M)this;
	}

	/**
	*获取调度员电话号码 
	*/
	public java.lang.String getAca052() {
		return getStr("aca052");
	}

	/**
	*设置是否滚动车辆 
	*/
	public M setAca053(java.lang.Integer aca053) {
		set("aca053", aca053);
		return (M)this;
	}

	/**
	*获取是否滚动车辆 
	*/
	public java.lang.Integer getAca053() {
		return getInt("aca053");
	}

	/**
	*设置数据状态 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取数据状态 
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
