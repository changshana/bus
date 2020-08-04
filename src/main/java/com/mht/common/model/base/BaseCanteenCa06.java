package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca06:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa06<M extends BaseCanteenCa06<M>> extends Model<M> implements IBean {

	/**
	*设置出库记录ID 
	*/
	public M setAca060(java.lang.Integer aca060) {
		set("aca060", aca060);
		return (M)this;
	}

	/**
	*获取出库记录ID 
	*/
	public java.lang.Integer getAca060() {
		return getInt("aca060");
	}

	/**
	*设置出库验收id 
	*/
	public M setAba030(java.lang.Integer aba030) {
		set("aba030", aba030);
		return (M)this;
	}

	/**
	*获取出库验收id 
	*/
	public java.lang.Integer getAba030() {
		return getInt("aba030");
	}

	/**
	*设置出库数量 
	*/
	public M setAca061(java.lang.String aca061) {
		set("aca061", aca061);
		return (M)this;
	}

	/**
	*获取出库数量 
	*/
	public java.lang.String getAca061() {
		return getStr("aca061");
	}

	/**
	*设置单据号 
	*/
	public M setAca062(java.lang.String aca062) {
		set("aca062", aca062);
		return (M)this;
	}

	/**
	*获取单据号 
	*/
	public java.lang.String getAca062() {
		return getStr("aca062");
	}

	/**
	*设置出库价 
	*/
	public M setAca063(java.math.BigDecimal aca063) {
		set("aca063", aca063);
		return (M)this;
	}

	/**
	*获取出库价 
	*/
	public java.math.BigDecimal getAca063() {
		return get("aca063");
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
	*设置出库餐厅id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取出库餐厅id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置审核状态 
	*/
	public M setAca064(java.lang.Integer aca064) {
		set("aca064", aca064);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getAca064() {
		return getInt("aca064");
	}

	/**
	*设置退货状态（1已退回） 
	*/
	public M setAca065(java.lang.String aca065) {
		set("aca065", aca065);
		return (M)this;
	}

	/**
	*获取退货状态（1已退回） 
	*/
	public java.lang.String getAca065() {
		return getStr("aca065");
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
