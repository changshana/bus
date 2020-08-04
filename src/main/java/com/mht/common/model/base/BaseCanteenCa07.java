package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca07:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa07<M extends BaseCanteenCa07<M>> extends Model<M> implements IBean {

	/**
	*设置出库记录详情ID 
	*/
	public M setAca070(java.lang.Integer aca070) {
		set("aca070", aca070);
		return (M)this;
	}

	/**
	*获取出库记录详情ID 
	*/
	public java.lang.Integer getAca070() {
		return getInt("aca070");
	}

	/**
	*设置出库记录id 
	*/
	public M setAca060(java.lang.Integer aca060) {
		set("aca060", aca060);
		return (M)this;
	}

	/**
	*获取出库记录id 
	*/
	public java.lang.Integer getAca060() {
		return getInt("aca060");
	}

	/**
	*设置库存id 
	*/
	public M setAaa070(java.lang.Integer aaa070) {
		set("aaa070", aaa070);
		return (M)this;
	}

	/**
	*获取库存id 
	*/
	public java.lang.Integer getAaa070() {
		return getInt("aaa070");
	}

	/**
	*设置出库数量 
	*/
	public M setAca071(java.lang.String aca071) {
		set("aca071", aca071);
		return (M)this;
	}

	/**
	*获取出库数量 
	*/
	public java.lang.String getAca071() {
		return getStr("aca071");
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
