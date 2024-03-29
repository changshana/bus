package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_su01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenSu01<M extends BaseCanteenSu01<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSu010(java.lang.Integer su010) {
		set("su010", su010);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSu010() {
		return getInt("su010");
	}

	/**
	*设置供应商用户id 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取供应商用户id 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	*设置采购计划汇总id 
	*/
	public M setAca010(java.lang.Integer aca010) {
		set("aca010", aca010);
		return (M)this;
	}

	/**
	*获取采购计划汇总id 
	*/
	public java.lang.Integer getAca010() {
		return getInt("aca010");
	}

	/**
	*设置需求响应状态 
	*/
	public M setSu011(java.lang.String su011) {
		set("su011", su011);
		return (M)this;
	}

	/**
	*获取需求响应状态 
	*/
	public java.lang.String getSu011() {
		return getStr("su011");
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
