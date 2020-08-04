package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_ab02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryAb02<M extends BaseDormitoryAb02<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAab020(java.lang.Integer aab020) {
		set("aab020", aab020);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAab020() {
		return getInt("aab020");
	}

	/**
	*设置标题 
	*/
	public M setAab002(java.lang.String aab002) {
		set("aab002", aab002);
		return (M)this;
	}

	/**
	*获取标题 
	*/
	public java.lang.String getAab002() {
		return getStr("aab002");
	}

	/**
	*设置内容 
	*/
	public M setAab003(java.lang.String aab003) {
		set("aab003", aab003);
		return (M)this;
	}

	/**
	*获取内容 
	*/
	public java.lang.String getAab003() {
		return getStr("aab003");
	}

	/**
	*设置发布时间 
	*/
	public M setAab004(java.util.Date aab004) {
		set("aab004", aab004);
		return (M)this;
	}

	/**
	*获取发布时间 
	*/
	public java.util.Date getAab004() {
		return get("aab004");
	}

	/**
	*设置审核状态 
	*/
	public M setAaa006(java.lang.Integer aaa006) {
		set("aaa006", aaa006);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getAaa006() {
		return getInt("aaa006");
	}

	/**
	*设置发布状态 
	*/
	public M setAaa005(java.lang.Integer aaa005) {
		set("aaa005", aaa005);
		return (M)this;
	}

	/**
	*获取发布状态 
	*/
	public java.lang.Integer getAaa005() {
		return getInt("aaa005");
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
