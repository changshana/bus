package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * property_ba02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePropertyBa02<M extends BasePropertyBa02<M>> extends Model<M> implements IBean {

	/**
	*设置场地锁定ID 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取场地锁定ID 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
	}

	/**
	*设置锁定日期 
	*/
	public M setAba021(java.util.Date aba021) {
		set("aba021", aba021);
		return (M)this;
	}

	/**
	*获取锁定日期 
	*/
	public java.util.Date getAba021() {
		return get("aba021");
	}

	/**
	*设置开始时间 
	*/
	public M setAba022(java.util.Date aba022) {
		set("aba022", aba022);
		return (M)this;
	}

	/**
	*获取开始时间 
	*/
	public java.util.Date getAba022() {
		return get("aba022");
	}

	/**
	*设置结束时间 
	*/
	public M setAba023(java.util.Date aba023) {
		set("aba023", aba023);
		return (M)this;
	}

	/**
	*获取结束时间 
	*/
	public java.util.Date getAba023() {
		return get("aba023");
	}

	/**
	*设置场地ID 
	*/
	public M setAaa010(java.lang.Integer aaa010) {
		set("aaa010", aaa010);
		return (M)this;
	}

	/**
	*获取场地ID 
	*/
	public java.lang.Integer getAaa010() {
		return getInt("aaa010");
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
