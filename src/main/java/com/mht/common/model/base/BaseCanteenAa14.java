package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa14:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa14<M extends BaseCanteenAa14<M>> extends Model<M> implements IBean {

	/**
	*设置人员ID 
	*/
	public M setAaa140(java.lang.Integer aaa140) {
		set("aaa140", aaa140);
		return (M)this;
	}

	/**
	*获取人员ID 
	*/
	public java.lang.Integer getAaa140() {
		return getInt("aaa140");
	}

	/**
	*设置人员名称 
	*/
	public M setAaa141(java.lang.String aaa141) {
		set("aaa141", aaa141);
		return (M)this;
	}

	/**
	*获取人员名称 
	*/
	public java.lang.String getAaa141() {
		return getStr("aaa141");
	}

	/**
	*设置部门id 
	*/
	public M setAaa142(java.lang.Long aaa142) {
		set("aaa142", aaa142);
		return (M)this;
	}

	/**
	*获取部门id 
	*/
	public java.lang.Long getAaa142() {
		return getLong("aaa142");
	}

	/**
	*设置usercode 
	*/
	public M setAaa145(java.lang.String aaa145) {
		set("aaa145", aaa145);
		return (M)this;
	}

	/**
	*获取usercode 
	*/
	public java.lang.String getAaa145() {
		return getStr("aaa145");
	}

	/**
	*设置密码 
	*/
	public M setAaa143(java.lang.String aaa143) {
		set("aaa143", aaa143);
		return (M)this;
	}

	/**
	*获取密码 
	*/
	public java.lang.String getAaa143() {
		return getStr("aaa143");
	}

	/**
	*设置mobile 
	*/
	public M setAaa144(java.lang.String aaa144) {
		set("aaa144", aaa144);
		return (M)this;
	}

	/**
	*获取mobile 
	*/
	public java.lang.String getAaa144() {
		return getStr("aaa144");
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
	*设置餐链系统人员主键id 
	*/
	public M setEmployeeId(java.lang.Long employeeId) {
		set("employeeId", employeeId);
		return (M)this;
	}

	/**
	*获取餐链系统人员主键id 
	*/
	public java.lang.Long getEmployeeId() {
		return getLong("employeeId");
	}

}
