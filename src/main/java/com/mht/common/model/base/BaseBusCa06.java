package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ca06:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusCa06<M extends BaseBusCa06<M>> extends Model<M> implements IBean {

	/**
	*设置ID  
	*/
	public M setAca060(java.lang.Integer aca060) {
		set("aca060", aca060);
		return (M)this;
	}

	/**
	*获取ID  
	*/
	public java.lang.Integer getAca060() {
		return getInt("aca060");
	}

	/**
	*设置日期 
	*/
	public M setAca061(java.util.Date aca061) {
		set("aca061", aca061);
		return (M)this;
	}

	/**
	*获取日期 
	*/
	public java.util.Date getAca061() {
		return get("aca061");
	}

	/**
	*设置总交易单数 
	*/
	public M setAca062(java.lang.Integer aca062) {
		set("aca062", aca062);
		return (M)this;
	}

	/**
	*获取总交易单数 
	*/
	public java.lang.Integer getAca062() {
		return getInt("aca062");
	}

	/**
	*设置应结订单总金额 
	*/
	public M setAca063(java.math.BigDecimal aca063) {
		set("aca063", aca063);
		return (M)this;
	}

	/**
	*获取应结订单总金额 
	*/
	public java.math.BigDecimal getAca063() {
		return get("aca063");
	}

	/**
	*设置退款总金额 
	*/
	public M setAca064(java.math.BigDecimal aca064) {
		set("aca064", aca064);
		return (M)this;
	}

	/**
	*获取退款总金额 
	*/
	public java.math.BigDecimal getAca064() {
		return get("aca064");
	}

	/**
	*设置充值券退款总金额 
	*/
	public M setAca065(java.math.BigDecimal aca065) {
		set("aca065", aca065);
		return (M)this;
	}

	/**
	*获取充值券退款总金额 
	*/
	public java.math.BigDecimal getAca065() {
		return get("aca065");
	}

	/**
	*设置手续费总金额 
	*/
	public M setAca066(java.math.BigDecimal aca066) {
		set("aca066", aca066);
		return (M)this;
	}

	/**
	*获取手续费总金额 
	*/
	public java.math.BigDecimal getAca066() {
		return get("aca066");
	}

	/**
	*设置订单总金额 
	*/
	public M setAca067(java.math.BigDecimal aca067) {
		set("aca067", aca067);
		return (M)this;
	}

	/**
	*获取订单总金额 
	*/
	public java.math.BigDecimal getAca067() {
		return get("aca067");
	}

	/**
	*设置申请退款总金额 
	*/
	public M setAca068(java.math.BigDecimal aca068) {
		set("aca068", aca068);
		return (M)this;
	}

	/**
	*获取申请退款总金额 
	*/
	public java.math.BigDecimal getAca068() {
		return get("aca068");
	}

	/**
	*设置当日净收入 
	*/
	public M setAca069(java.math.BigDecimal aca069) {
		set("aca069", aca069);
		return (M)this;
	}

	/**
	*获取当日净收入 
	*/
	public java.math.BigDecimal getAca069() {
		return get("aca069");
	}

	/**
	*设置数据有效性 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取数据有效性 
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
