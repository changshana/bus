package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_bb01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryBb01<M extends BaseDormitoryBb01<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAbb001(java.lang.Integer abb001) {
		set("abb001", abb001);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAbb001() {
		return getInt("abb001");
	}

	/**
	*设置单价 
	*/
	public M setAbb002(java.lang.String abb002) {
		set("abb002", abb002);
		return (M)this;
	}

	/**
	*获取单价 
	*/
	public java.lang.String getAbb002() {
		return getStr("abb002");
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
