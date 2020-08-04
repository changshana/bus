package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa04:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa04<M extends BaseCanteenAa04<M>> extends Model<M> implements IBean {

	/**
	*设置菜谱基础信息ID 
	*/
	public M setAaa040(java.lang.Integer aaa040) {
		set("aaa040", aaa040);
		return (M)this;
	}

	/**
	*获取菜谱基础信息ID 
	*/
	public java.lang.Integer getAaa040() {
		return getInt("aaa040");
	}

	/**
	*设置菜谱类别 
	*/
	public M setAaa060(java.lang.Integer aaa060) {
		set("aaa060", aaa060);
		return (M)this;
	}

	/**
	*获取菜谱类别 
	*/
	public java.lang.Integer getAaa060() {
		return getInt("aaa060");
	}

	/**
	*设置菜谱名称 
	*/
	public M setAaa041(java.lang.String aaa041) {
		set("aaa041", aaa041);
		return (M)this;
	}

	/**
	*获取菜谱名称 
	*/
	public java.lang.String getAaa041() {
		return getStr("aaa041");
	}

	/**
	*设置拼音码 
	*/
	public M setAaa042(java.lang.String aaa042) {
		set("aaa042", aaa042);
		return (M)this;
	}

	/**
	*获取拼音码 
	*/
	public java.lang.String getAaa042() {
		return getStr("aaa042");
	}

	/**
	*设置制作方式 
	*/
	public M setAaa043(java.lang.String aaa043) {
		set("aaa043", aaa043);
		return (M)this;
	}

	/**
	*获取制作方式 
	*/
	public java.lang.String getAaa043() {
		return getStr("aaa043");
	}

	/**
	*设置单位 
	*/
	public M setAaa044(java.lang.String aaa044) {
		set("aaa044", aaa044);
		return (M)this;
	}

	/**
	*获取单位 
	*/
	public java.lang.String getAaa044() {
		return getStr("aaa044");
	}

	/**
	*设置菜谱图片 
	*/
	public M setAaa045(java.lang.String aaa045) {
		set("aaa045", aaa045);
		return (M)this;
	}

	/**
	*获取菜谱图片 
	*/
	public java.lang.String getAaa045() {
		return getStr("aaa045");
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
