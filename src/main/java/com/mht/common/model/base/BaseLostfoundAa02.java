package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * lostfound_aa02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseLostfoundAa02<M extends BaseLostfoundAa02<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa020(java.lang.Integer aaa020) {
		set("aaa020", aaa020);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa020() {
		return getInt("aaa020");
	}

	/**
	*设置标题 
	*/
	public M setAaa021(java.lang.String aaa021) {
		set("aaa021", aaa021);
		return (M)this;
	}

	/**
	*获取标题 
	*/
	public java.lang.String getAaa021() {
		return getStr("aaa021");
	}

	/**
	*设置物品描述 
	*/
	public M setAaa022(java.lang.String aaa022) {
		set("aaa022", aaa022);
		return (M)this;
	}

	/**
	*获取物品描述 
	*/
	public java.lang.String getAaa022() {
		return getStr("aaa022");
	}

	/**
	*设置联系人 
	*/
	public M setAaa023(java.lang.String aaa023) {
		set("aaa023", aaa023);
		return (M)this;
	}

	/**
	*获取联系人 
	*/
	public java.lang.String getAaa023() {
		return getStr("aaa023");
	}

	/**
	*设置联系电话 
	*/
	public M setAaa024(java.lang.String aaa024) {
		set("aaa024", aaa024);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getAaa024() {
		return getStr("aaa024");
	}

	/**
	*设置校区 
	*/
	public M setAaa025(java.lang.Integer aaa025) {
		set("aaa025", aaa025);
		return (M)this;
	}

	/**
	*获取校区 
	*/
	public java.lang.Integer getAaa025() {
		return getInt("aaa025");
	}

	/**
	*设置状态 
	*/
	public M setAaa026(java.lang.Integer aaa026) {
		set("aaa026", aaa026);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getAaa026() {
		return getInt("aaa026");
	}

	/**
	*设置数据状态 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取数据状态 
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
