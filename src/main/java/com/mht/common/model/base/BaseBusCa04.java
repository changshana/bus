package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ca04:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusCa04<M extends BaseBusCa04<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca040(java.lang.Integer aca040) {
		set("aca040", aca040);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca040() {
		return getInt("aca040");
	}

	/**
	*设置工号/学号 
	*/
	public M setAca041(java.lang.String aca041) {
		set("aca041", aca041);
		return (M)this;
	}

	/**
	*获取工号/学号 
	*/
	public java.lang.String getAca041() {
		return getStr("aca041");
	}

	/**
	*设置openid 
	*/
	public M setAca042(java.lang.String aca042) {
		set("aca042", aca042);
		return (M)this;
	}

	/**
	*获取openid 
	*/
	public java.lang.String getAca042() {
		return getStr("aca042");
	}

	/**
	*设置姓名 
	*/
	public M setAca043(java.lang.String aca043) {
		set("aca043", aca043);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getAca043() {
		return getStr("aca043");
	}

	/**
	*设置人员类型 
	*/
	public M setAca044(java.lang.String aca044) {
		set("aca044", aca044);
		return (M)this;
	}

	/**
	*获取人员类型 
	*/
	public java.lang.String getAca044() {
		return getStr("aca044");
	}

	/**
	*设置证件类型 
	*/
	public M setAca045(java.lang.String aca045) {
		set("aca045", aca045);
		return (M)this;
	}

	/**
	*获取证件类型 
	*/
	public java.lang.String getAca045() {
		return getStr("aca045");
	}

	/**
	*设置证件号 
	*/
	public M setAca046(java.lang.String aca046) {
		set("aca046", aca046);
		return (M)this;
	}

	/**
	*获取证件号 
	*/
	public java.lang.String getAca046() {
		return getStr("aca046");
	}

	/**
	*设置电话号码 
	*/
	public M setAca047(java.lang.String aca047) {
		set("aca047", aca047);
		return (M)this;
	}

	/**
	*获取电话号码 
	*/
	public java.lang.String getAca047() {
		return getStr("aca047");
	}

	/**
	*设置单位名称/所在班号 
	*/
	public M setAca048(java.lang.String aca048) {
		set("aca048", aca048);
		return (M)this;
	}

	/**
	*获取单位名称/所在班号 
	*/
	public java.lang.String getAca048() {
		return getStr("aca048");
	}

	/**
	*设置违约次数 
	*/
	public M setAca049(java.lang.Integer aca049) {
		set("aca049", aca049);
		return (M)this;
	}

	/**
	*获取违约次数 
	*/
	public java.lang.Integer getAca049() {
		return getInt("aca049");
	}

	/**
	*设置信息更新时间 
	*/
	public M setAaa995(java.lang.String aaa995) {
		set("aaa995", aaa995);
		return (M)this;
	}

	/**
	*获取信息更新时间 
	*/
	public java.lang.String getAaa995() {
		return getStr("aaa995");
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
