package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_aa03:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusAa03<M extends BaseBusAa03<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置图片 
	*/
	public M setAaa031(java.lang.String aaa031) {
		set("aaa031", aaa031);
		return (M)this;
	}

	/**
	*获取图片 
	*/
	public java.lang.String getAaa031() {
		return getStr("aaa031");
	}

	/**
	*设置问题描述 
	*/
	public M setAaa032(java.lang.String aaa032) {
		set("aaa032", aaa032);
		return (M)this;
	}

	/**
	*获取问题描述 
	*/
	public java.lang.String getAaa032() {
		return getStr("aaa032");
	}

	/**
	*设置阅读状态 
	*/
	public M setAaa033(java.lang.Integer aaa033) {
		set("aaa033", aaa033);
		return (M)this;
	}

	/**
	*获取阅读状态 
	*/
	public java.lang.Integer getAaa033() {
		return getInt("aaa033");
	}

	/**
	*设置电话号码 
	*/
	public M setAaa034(java.lang.String aaa034) {
		set("aaa034", aaa034);
		return (M)this;
	}

	/**
	*获取电话号码 
	*/
	public java.lang.String getAaa034() {
		return getStr("aaa034");
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
