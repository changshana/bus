package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * tm_aa02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTmAa02<M extends BaseTmAa02<M>> extends Model<M> implements IBean {

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
	*设置餐厅ID(site_id) 
	*/
	public M setAaa001(java.lang.Integer aaa001) {
		set("aaa001", aaa001);
		return (M)this;
	}

	/**
	*获取餐厅ID(site_id) 
	*/
	public java.lang.Integer getAaa001() {
		return getInt("aaa001");
	}

	/**
	*设置进出类型 
	*/
	public M setAaa002(java.lang.Integer aaa002) {
		set("aaa002", aaa002);
		return (M)this;
	}

	/**
	*获取进出类型 
	*/
	public java.lang.Integer getAaa002() {
		return getInt("aaa002");
	}

	/**
	*设置出入时间 
	*/
	public M setAaa003(java.util.Date aaa003) {
		set("aaa003", aaa003);
		return (M)this;
	}

	/**
	*获取出入时间 
	*/
	public java.util.Date getAaa003() {
		return get("aaa003");
	}

	/**
	*设置备用字段1 
	*/
	public M setAaa004(java.lang.String aaa004) {
		set("aaa004", aaa004);
		return (M)this;
	}

	/**
	*获取备用字段1 
	*/
	public java.lang.String getAaa004() {
		return getStr("aaa004");
	}

	/**
	*设置备用字段2 
	*/
	public M setAaa005(java.lang.String aaa005) {
		set("aaa005", aaa005);
		return (M)this;
	}

	/**
	*获取备用字段2 
	*/
	public java.lang.String getAaa005() {
		return getStr("aaa005");
	}

	/**
	*设置备用字段3 
	*/
	public M setAaa006(java.lang.String aaa006) {
		set("aaa006", aaa006);
		return (M)this;
	}

	/**
	*获取备用字段3 
	*/
	public java.lang.String getAaa006() {
		return getStr("aaa006");
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
