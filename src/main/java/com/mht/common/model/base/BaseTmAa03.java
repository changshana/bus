package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * tm_aa03:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTmAa03<M extends BaseTmAa03<M>> extends Model<M> implements IBean {

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
	*设置账号 
	*/
	public M setAaa031(java.lang.String aaa031) {
		set("aaa031", aaa031);
		return (M)this;
	}

	/**
	*获取账号 
	*/
	public java.lang.String getAaa031() {
		return getStr("aaa031");
	}

	/**
	*设置密码 
	*/
	public M setAaa032(java.lang.String aaa032) {
		set("aaa032", aaa032);
		return (M)this;
	}

	/**
	*获取密码 
	*/
	public java.lang.String getAaa032() {
		return getStr("aaa032");
	}

	/**
	*设置姓名 
	*/
	public M setAaa033(java.lang.String aaa033) {
		set("aaa033", aaa033);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getAaa033() {
		return getStr("aaa033");
	}

	/**
	*设置联系电话 
	*/
	public M setAaa034(java.lang.String aaa034) {
		set("aaa034", aaa034);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getAaa034() {
		return getStr("aaa034");
	}

	/**
	*设置备用字段1 
	*/
	public M setAaa035(java.lang.String aaa035) {
		set("aaa035", aaa035);
		return (M)this;
	}

	/**
	*获取备用字段1 
	*/
	public java.lang.String getAaa035() {
		return getStr("aaa035");
	}

	/**
	*设置备用字段2 
	*/
	public M setAaa036(java.lang.String aaa036) {
		set("aaa036", aaa036);
		return (M)this;
	}

	/**
	*获取备用字段2 
	*/
	public java.lang.String getAaa036() {
		return getStr("aaa036");
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

	/**
	*设置餐厅ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取餐厅ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置userId 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取userId 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

}
