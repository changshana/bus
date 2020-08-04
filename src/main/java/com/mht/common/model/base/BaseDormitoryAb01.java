package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_ab01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryAb01<M extends BaseDormitoryAb01<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAab001(java.lang.Integer aab001) {
		set("aab001", aab001);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAab001() {
		return getInt("aab001");
	}

	/**
	*设置电表编号 
	*/
	public M setAab002(java.lang.String aab002) {
		set("aab002", aab002);
		return (M)this;
	}

	/**
	*获取电表编号 
	*/
	public java.lang.String getAab002() {
		return getStr("aab002");
	}

	/**
	*设置房间号 
	*/
	public M setAab003(java.lang.String aab003) {
		set("aab003", aab003);
		return (M)this;
	}

	/**
	*获取房间号 
	*/
	public java.lang.String getAab003() {
		return getStr("aab003");
	}

	/**
	*设置能耗 
	*/
	public M setAab004(java.lang.String aab004) {
		set("aab004", aab004);
		return (M)this;
	}

	/**
	*获取能耗 
	*/
	public java.lang.String getAab004() {
		return getStr("aab004");
	}

	/**
	*设置抄表日期 
	*/
	public M setAab005(java.util.Date aab005) {
		set("aab005", aab005);
		return (M)this;
	}

	/**
	*获取抄表日期 
	*/
	public java.util.Date getAab005() {
		return get("aab005");
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
