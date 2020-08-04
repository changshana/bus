package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_ca03_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCa03Temp<M extends BaseDormitoryCa03Temp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca030(java.lang.Integer aca030) {
		set("aca030", aca030);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca030() {
		return getInt("aca030");
	}

	/**
	*设置学院名称 
	*/
	public M setAca001(java.lang.String aca001) {
		set("aca001", aca001);
		return (M)this;
	}

	/**
	*获取学院名称 
	*/
	public java.lang.String getAca001() {
		return getStr("aca001");
	}

	/**
	*设置部门名称 
	*/
	public M setAca002(java.lang.String aca002) {
		set("aca002", aca002);
		return (M)this;
	}

	/**
	*获取部门名称 
	*/
	public java.lang.String getAca002() {
		return getStr("aca002");
	}

	/**
	*设置入住人数 
	*/
	public M setAca003(java.lang.String aca003) {
		set("aca003", aca003);
		return (M)this;
	}

	/**
	*获取入住人数 
	*/
	public java.lang.String getAca003() {
		return getStr("aca003");
	}

	/**
	*设置性别 
	*/
	public M setAca004(java.lang.String aca004) {
		set("aca004", aca004);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.String getAca004() {
		return getStr("aca004");
	}

	/**
	*设置入住时间 
	*/
	public M setAca005(java.util.Date aca005) {
		set("aca005", aca005);
		return (M)this;
	}

	/**
	*获取入住时间 
	*/
	public java.util.Date getAca005() {
		return get("aca005");
	}

	/**
	*设置拟退宿时间 
	*/
	public M setAca006(java.util.Date aca006) {
		set("aca006", aca006);
		return (M)this;
	}

	/**
	*获取拟退宿时间 
	*/
	public java.util.Date getAca006() {
		return get("aca006");
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

	/**
	*设置ID 
	*/
	public M setAca020(java.lang.Integer aca020) {
		set("aca020", aca020);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca020() {
		return getInt("aca020");
	}

	/**
	*设置批次号 
	*/
	public M setTmp001(java.lang.String tmp001) {
		set("tmp001", tmp001);
		return (M)this;
	}

	/**
	*获取批次号 
	*/
	public java.lang.String getTmp001() {
		return getStr("tmp001");
	}

	/**
	*设置验证标志 
	*/
	public M setTmp002(java.lang.String tmp002) {
		set("tmp002", tmp002);
		return (M)this;
	}

	/**
	*获取验证标志 
	*/
	public java.lang.String getTmp002() {
		return getStr("tmp002");
	}

	/**
	*设置失败原因 
	*/
	public M setTmp003(java.lang.String tmp003) {
		set("tmp003", tmp003);
		return (M)this;
	}

	/**
	*获取失败原因 
	*/
	public java.lang.String getTmp003() {
		return getStr("tmp003");
	}

	/**
	*设置序号 
	*/
	public M setTmp004(java.lang.String tmp004) {
		set("tmp004", tmp004);
		return (M)this;
	}

	/**
	*获取序号 
	*/
	public java.lang.String getTmp004() {
		return getStr("tmp004");
	}

}
