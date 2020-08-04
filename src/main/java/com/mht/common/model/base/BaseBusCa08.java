package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ca08:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusCa08<M extends BaseBusCa08<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca080(java.lang.Integer aca080) {
		set("aca080", aca080);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca080() {
		return getInt("aca080");
	}

	/**
	*设置账号 
	*/
	public M setAca081(java.lang.String aca081) {
		set("aca081", aca081);
		return (M)this;
	}

	/**
	*获取账号 
	*/
	public java.lang.String getAca081() {
		return getStr("aca081");
	}

	/**
	*设置姓名 
	*/
	public M setAca082(java.lang.String aca082) {
		set("aca082", aca082);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getAca082() {
		return getStr("aca082");
	}

	/**
	*设置手机号码 
	*/
	public M setAca083(java.lang.String aca083) {
		set("aca083", aca083);
		return (M)this;
	}

	/**
	*获取手机号码 
	*/
	public java.lang.String getAca083() {
		return getStr("aca083");
	}

	/**
	*设置证件号码 
	*/
	public M setAca084(java.lang.String aca084) {
		set("aca084", aca084);
		return (M)this;
	}

	/**
	*获取证件号码 
	*/
	public java.lang.String getAca084() {
		return getStr("aca084");
	}

	/**
	*设置临时人员类型 
	*/
	public M setAca044(java.lang.String aca044) {
		set("aca044", aca044);
		return (M)this;
	}

	/**
	*获取临时人员类型 
	*/
	public java.lang.String getAca044() {
		return getStr("aca044");
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
