package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa02<M extends BaseBusBa02<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
	}

	/**
	*设置名称 
	*/
	public M setAba002(java.lang.String aba002) {
		set("aba002", aba002);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getAba002() {
		return getStr("aba002");
	}

	/**
	*设置开门类型 
	*/
	public M setAaa995(java.lang.Integer aaa995) {
		set("aaa995", aaa995);
		return (M)this;
	}

	/**
	*获取开门类型 
	*/
	public java.lang.Integer getAaa995() {
		return getInt("aaa995");
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
	*设置座位数 
	*/
	public M setAba003(java.lang.Integer aba003) {
		set("aba003", aba003);
		return (M)this;
	}

	/**
	*获取座位数 
	*/
	public java.lang.Integer getAba003() {
		return getInt("aba003");
	}

	/**
	*设置列数 
	*/
	public M setAba004(java.lang.Integer aba004) {
		set("aba004", aba004);
		return (M)this;
	}

	/**
	*获取列数 
	*/
	public java.lang.Integer getAba004() {
		return getInt("aba004");
	}

	/**
	*设置行数 
	*/
	public M setAba005(java.lang.Integer aba005) {
		set("aba005", aba005);
		return (M)this;
	}

	/**
	*获取行数 
	*/
	public java.lang.Integer getAba005() {
		return getInt("aba005");
	}

}
