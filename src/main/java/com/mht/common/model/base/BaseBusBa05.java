package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba05:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa05<M extends BaseBusBa05<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba050(java.lang.Integer aba050) {
		set("aba050", aba050);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba050() {
		return getInt("aba050");
	}

	/**
	*设置开始时间 
	*/
	public M setAba051(java.util.Date aba051) {
		set("aba051", aba051);
		return (M)this;
	}

	/**
	*获取开始时间 
	*/
	public java.util.Date getAba051() {
		return get("aba051");
	}

	/**
	*设置结束时间 
	*/
	public M setAba052(java.util.Date aba052) {
		set("aba052", aba052);
		return (M)this;
	}

	/**
	*获取结束时间 
	*/
	public java.util.Date getAba052() {
		return get("aba052");
	}

	/**
	*设置车辆路线ID 
	*/
	public M setAba030(java.lang.Integer aba030) {
		set("aba030", aba030);
		return (M)this;
	}

	/**
	*获取车辆路线ID 
	*/
	public java.lang.Integer getAba030() {
		return getInt("aba030");
	}

	/**
	*设置时间 
	*/
	public M setAba053(java.util.Date aba053) {
		set("aba053", aba053);
		return (M)this;
	}

	/**
	*获取时间 
	*/
	public java.util.Date getAba053() {
		return get("aba053");
	}

	/**
	*设置预约设置ID 
	*/
	public M setAba060(java.lang.Integer aba060) {
		set("aba060", aba060);
		return (M)this;
	}

	/**
	*获取预约设置ID 
	*/
	public java.lang.Integer getAba060() {
		return getInt("aba060");
	}

	/**
	*设置班次号 
	*/
	public M setAba054(java.lang.String aba054) {
		set("aba054", aba054);
		return (M)this;
	}

	/**
	*获取班次号 
	*/
	public java.lang.String getAba054() {
		return getStr("aba054");
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
	*设置时间类型 
	*/
	public M setAba055(java.lang.Integer aba055) {
		set("aba055", aba055);
		return (M)this;
	}

	/**
	*获取时间类型 
	*/
	public java.lang.Integer getAba055() {
		return getInt("aba055");
	}

	/**
	*设置是否可预约 
	*/
	public M setAba056(java.lang.Integer aba056) {
		set("aba056", aba056);
		return (M)this;
	}

	/**
	*获取是否可预约 
	*/
	public java.lang.Integer getAba056() {
		return getInt("aba056");
	}

}
