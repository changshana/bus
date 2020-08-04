package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ca01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusCa01<M extends BaseBusCa01<M>> extends Model<M> implements IBean {

	/**
	*设置消息ID 
	*/
	public M setAca010(java.lang.Integer aca010) {
		set("aca010", aca010);
		return (M)this;
	}

	/**
	*获取消息ID 
	*/
	public java.lang.Integer getAca010() {
		return getInt("aca010");
	}

	/**
	*设置消息标题 
	*/
	public M setAaa999(java.lang.String aaa999) {
		set("aaa999", aaa999);
		return (M)this;
	}

	/**
	*获取消息标题 
	*/
	public java.lang.String getAaa999() {
		return getStr("aaa999");
	}

	/**
	*设置消息内容 
	*/
	public M setAca011(java.lang.String aca011) {
		set("aca011", aca011);
		return (M)this;
	}

	/**
	*获取消息内容 
	*/
	public java.lang.String getAca011() {
		return getStr("aca011");
	}

	/**
	*设置消息时间 
	*/
	public M setAca012(java.util.Date aca012) {
		set("aca012", aca012);
		return (M)this;
	}

	/**
	*获取消息时间 
	*/
	public java.util.Date getAca012() {
		return get("aca012");
	}

	/**
	*设置数据有效性 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取数据有效性 
	*/
	public java.lang.Integer getAaa996() {
		return getInt("aaa996");
	}

	/**
	*设置创建人 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取创建人 
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

}
