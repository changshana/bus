package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa98:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa98<M extends BaseCanteenAa98<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa980(java.lang.Integer aaa980) {
		set("aaa980", aaa980);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa980() {
		return getInt("aaa980");
	}

	/**
	*设置业务流水号 
	*/
	public M setAaa981(java.lang.Integer aaa981) {
		set("aaa981", aaa981);
		return (M)this;
	}

	/**
	*获取业务流水号 
	*/
	public java.lang.Integer getAaa981() {
		return getInt("aaa981");
	}

	/**
	*设置审核业务类型 
	*/
	public M setAaa982(java.lang.String aaa982) {
		set("aaa982", aaa982);
		return (M)this;
	}

	/**
	*获取审核业务类型 
	*/
	public java.lang.String getAaa982() {
		return getStr("aaa982");
	}

	/**
	*设置审核状态 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getAaa996() {
		return getInt("aaa996");
	}

	/**
	*设置审核人 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getAaa997() {
		return getStr("aaa997");
	}

	/**
	*设置审核时间 
	*/
	public M setAaa998(java.util.Date aaa998) {
		set("aaa998", aaa998);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.util.Date getAaa998() {
		return get("aaa998");
	}

	/**
	*设置审核备注 
	*/
	public M setAaa999(java.lang.String aaa999) {
		set("aaa999", aaa999);
		return (M)this;
	}

	/**
	*获取审核备注 
	*/
	public java.lang.String getAaa999() {
		return getStr("aaa999");
	}

}
