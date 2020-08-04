package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ba03:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenBa03<M extends BaseCanteenBa03<M>> extends Model<M> implements IBean {

	/**
	*设置出库验收记录ID 
	*/
	public M setAba030(java.lang.Integer aba030) {
		set("aba030", aba030);
		return (M)this;
	}

	/**
	*获取出库验收记录ID 
	*/
	public java.lang.Integer getAba030() {
		return getInt("aba030");
	}

	/**
	*设置出库数量 
	*/
	public M setAba031(java.lang.String aba031) {
		set("aba031", aba031);
		return (M)this;
	}

	/**
	*获取出库数量 
	*/
	public java.lang.String getAba031() {
		return getStr("aba031");
	}

	/**
	*设置餐厅id（出库餐厅） 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取餐厅id（出库餐厅） 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置 
	*/
	public M setAba050(java.lang.Integer aba050) {
		set("aba050", aba050);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAba050() {
		return getInt("aba050");
	}

	/**
	*设置原料id 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取原料id 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置单据号 
	*/
	public M setAba032(java.lang.String aba032) {
		set("aba032", aba032);
		return (M)this;
	}

	/**
	*获取单据号 
	*/
	public java.lang.String getAba032() {
		return getStr("aba032");
	}

	/**
	*设置出库价 
	*/
	public M setAba033(java.math.BigDecimal aba033) {
		set("aba033", aba033);
		return (M)this;
	}

	/**
	*获取出库价 
	*/
	public java.math.BigDecimal getAba033() {
		return get("aba033");
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
