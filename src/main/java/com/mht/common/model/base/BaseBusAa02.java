package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_aa02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusAa02<M extends BaseBusAa02<M>> extends Model<M> implements IBean {

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
	*设置姓名 
	*/
	public M setAaa002(java.lang.String aaa002) {
		set("aaa002", aaa002);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getAaa002() {
		return getStr("aaa002");
	}

	/**
	*设置性别 
	*/
	public M setAaa003(java.lang.Integer aaa003) {
		set("aaa003", aaa003);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.Integer getAaa003() {
		return getInt("aaa003");
	}

	/**
	*设置身份证 
	*/
	public M setAaa004(java.lang.String aaa004) {
		set("aaa004", aaa004);
		return (M)this;
	}

	/**
	*获取身份证 
	*/
	public java.lang.String getAaa004() {
		return getStr("aaa004");
	}

	/**
	*设置代码 
	*/
	public M setAaa005(java.lang.String aaa005) {
		set("aaa005", aaa005);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getAaa005() {
		return getStr("aaa005");
	}

	/**
	*设置地址 
	*/
	public M setAaa006(java.lang.String aaa006) {
		set("aaa006", aaa006);
		return (M)this;
	}

	/**
	*获取地址 
	*/
	public java.lang.String getAaa006() {
		return getStr("aaa006");
	}

	/**
	*设置电话 
	*/
	public M setAaa007(java.lang.String aaa007) {
		set("aaa007", aaa007);
		return (M)this;
	}

	/**
	*获取电话 
	*/
	public java.lang.String getAaa007() {
		return getStr("aaa007");
	}

	/**
	*设置密码 
	*/
	public M setAaa008(java.lang.String aaa008) {
		set("aaa008", aaa008);
		return (M)this;
	}

	/**
	*获取密码 
	*/
	public java.lang.String getAaa008() {
		return getStr("aaa008");
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

}
