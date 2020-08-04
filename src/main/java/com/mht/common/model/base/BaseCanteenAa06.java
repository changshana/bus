package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa06:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa06<M extends BaseCanteenAa06<M>> extends Model<M> implements IBean {

	/**
	*设置菜谱类别ID 
	*/
	public M setAaa060(java.lang.Integer aaa060) {
		set("aaa060", aaa060);
		return (M)this;
	}

	/**
	*获取菜谱类别ID 
	*/
	public java.lang.Integer getAaa060() {
		return getInt("aaa060");
	}

	/**
	*设置类别名称 
	*/
	public M setAaa061(java.lang.String aaa061) {
		set("aaa061", aaa061);
		return (M)this;
	}

	/**
	*获取类别名称 
	*/
	public java.lang.String getAaa061() {
		return getStr("aaa061");
	}

	/**
	*设置首字母 
	*/
	public M setAaa062(java.lang.String aaa062) {
		set("aaa062", aaa062);
		return (M)this;
	}

	/**
	*获取首字母 
	*/
	public java.lang.String getAaa062() {
		return getStr("aaa062");
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
