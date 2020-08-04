package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba09:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa09<M extends BaseBusBa09<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba090(java.lang.Integer aba090) {
		set("aba090", aba090);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba090() {
		return getInt("aba090");
	}

	/**
	*设置司机ID 
	*/
	public M setAaa020(java.lang.Integer aaa020) {
		set("aaa020", aaa020);
		return (M)this;
	}

	/**
	*获取司机ID 
	*/
	public java.lang.Integer getAaa020() {
		return getInt("aaa020");
	}

	/**
	*设置里程数 
	*/
	public M setAba091(java.lang.String aba091) {
		set("aba091", aba091);
		return (M)this;
	}

	/**
	*获取里程数 
	*/
	public java.lang.String getAba091() {
		return getStr("aba091");
	}

	/**
	*设置图片url 
	*/
	public M setAba092(java.lang.String aba092) {
		set("aba092", aba092);
		return (M)this;
	}

	/**
	*获取图片url 
	*/
	public java.lang.String getAba092() {
		return getStr("aba092");
	}

	/**
	*设置审核状态 
	*/
	public M setAba093(java.lang.Integer aba093) {
		set("aba093", aba093);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getAba093() {
		return getInt("aba093");
	}

	/**
	*设置审核人 
	*/
	public M setAba094(java.lang.String aba094) {
		set("aba094", aba094);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getAba094() {
		return getStr("aba094");
	}

	/**
	*设置审核时间 
	*/
	public M setAba095(java.util.Date aba095) {
		set("aba095", aba095);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.util.Date getAba095() {
		return get("aba095");
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
