package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa11:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa11<M extends BaseCanteenAa11<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa100(java.lang.Integer aaa100) {
		set("aaa100", aaa100);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa100() {
		return getInt("aaa100");
	}

	/**
	*设置现场名称 
	*/
	public M setAaa101(java.lang.String aaa101) {
		set("aaa101", aaa101);
		return (M)this;
	}

	/**
	*获取现场名称 
	*/
	public java.lang.String getAaa101() {
		return getStr("aaa101");
	}

	/**
	*设置现场用途 
	*/
	public M setAaa102(java.lang.String aaa102) {
		set("aaa102", aaa102);
		return (M)this;
	}

	/**
	*获取现场用途 
	*/
	public java.lang.String getAaa102() {
		return getStr("aaa102");
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
