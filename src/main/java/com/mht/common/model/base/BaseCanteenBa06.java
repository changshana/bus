package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ba06:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenBa06<M extends BaseCanteenBa06<M>> extends Model<M> implements IBean {

	/**
	*设置入库验收ID 
	*/
	public M setAba060(java.lang.Integer aba060) {
		set("aba060", aba060);
		return (M)this;
	}

	/**
	*获取入库验收ID 
	*/
	public java.lang.Integer getAba060() {
		return getInt("aba060");
	}

	/**
	*设置需求汇总ID 
	*/
	public M setAca010(java.lang.Integer aca010) {
		set("aca010", aca010);
		return (M)this;
	}

	/**
	*获取需求汇总ID 
	*/
	public java.lang.Integer getAca010() {
		return getInt("aca010");
	}

	/**
	*设置入库验收单据号 
	*/
	public M setAba061(java.lang.String aba061) {
		set("aba061", aba061);
		return (M)this;
	}

	/**
	*获取入库验收单据号 
	*/
	public java.lang.String getAba061() {
		return getStr("aba061");
	}

	/**
	*设置入库验收时间 
	*/
	public M setAba062(java.util.Date aba062) {
		set("aba062", aba062);
		return (M)this;
	}

	/**
	*获取入库验收时间 
	*/
	public java.util.Date getAba062() {
		return get("aba062");
	}

	/**
	*设置入库验收处理人 
	*/
	public M setAba063(java.lang.String aba063) {
		set("aba063", aba063);
		return (M)this;
	}

	/**
	*获取入库验收处理人 
	*/
	public java.lang.String getAba063() {
		return getStr("aba063");
	}

	/**
	*设置验收确认时间 
	*/
	public M setAba064(java.util.Date aba064) {
		set("aba064", aba064);
		return (M)this;
	}

	/**
	*获取验收确认时间 
	*/
	public java.util.Date getAba064() {
		return get("aba064");
	}

	/**
	*设置验收确认状态 
	*/
	public M setAba065(java.lang.String aba065) {
		set("aba065", aba065);
		return (M)this;
	}

	/**
	*获取验收确认状态 
	*/
	public java.lang.String getAba065() {
		return getStr("aba065");
	}

	/**
	*设置机构id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取机构id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
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
