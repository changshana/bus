package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_aa02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryAa02<M extends BaseDormitoryAa02<M>> extends Model<M> implements IBean {

	/**
	*设置类别ID 
	*/
	public M setAaa020(java.lang.Integer aaa020) {
		set("aaa020", aaa020);
		return (M)this;
	}

	/**
	*获取类别ID 
	*/
	public java.lang.Integer getAaa020() {
		return getInt("aaa020");
	}

	/**
	*设置类别名称 
	*/
	public M setAaa021(java.lang.String aaa021) {
		set("aaa021", aaa021);
		return (M)this;
	}

	/**
	*获取类别名称 
	*/
	public java.lang.String getAaa021() {
		return getStr("aaa021");
	}

	/**
	*设置类别代码 
	*/
	public M setAaa022(java.lang.String aaa022) {
		set("aaa022", aaa022);
		return (M)this;
	}

	/**
	*获取类别代码 
	*/
	public java.lang.String getAaa022() {
		return getStr("aaa022");
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
