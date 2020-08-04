package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa16:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa16<M extends BaseCanteenAa16<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa160(java.lang.Integer aaa160) {
		set("aaa160", aaa160);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa160() {
		return getInt("aaa160");
	}

	/**
	*设置上报部门 
	*/
	public M setAaa161(java.lang.String aaa161) {
		set("aaa161", aaa161);
		return (M)this;
	}

	/**
	*获取上报部门 
	*/
	public java.lang.String getAaa161() {
		return getStr("aaa161");
	}

	/**
	*设置报告名称 
	*/
	public M setAaa162(java.lang.String aaa162) {
		set("aaa162", aaa162);
		return (M)this;
	}

	/**
	*获取报告名称 
	*/
	public java.lang.String getAaa162() {
		return getStr("aaa162");
	}

	/**
	*设置报告内容 
	*/
	public M setAaa163(java.lang.String aaa163) {
		set("aaa163", aaa163);
		return (M)this;
	}

	/**
	*获取报告内容 
	*/
	public java.lang.String getAaa163() {
		return getStr("aaa163");
	}

	/**
	*设置审核状态 
	*/
	public M setAaa989(java.lang.String aaa989) {
		set("aaa989", aaa989);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.String getAaa989() {
		return getStr("aaa989");
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
