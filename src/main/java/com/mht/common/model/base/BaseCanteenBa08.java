package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ba08:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenBa08<M extends BaseCanteenBa08<M>> extends Model<M> implements IBean {

	/**
	*设置退货记录id 
	*/
	public M setAba080(java.lang.Integer aba080) {
		set("aba080", aba080);
		return (M)this;
	}

	/**
	*获取退货记录id 
	*/
	public java.lang.Integer getAba080() {
		return getInt("aba080");
	}

	/**
	*设置入库验收记录表id 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取入库验收记录表id 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
	}

	/**
	*设置退回理由 
	*/
	public M setAba081(java.lang.String aba081) {
		set("aba081", aba081);
		return (M)this;
	}

	/**
	*获取退回理由 
	*/
	public java.lang.String getAba081() {
		return getStr("aba081");
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
