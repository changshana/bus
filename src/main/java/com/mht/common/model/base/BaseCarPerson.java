package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * car_person:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCarPerson<M extends BaseCarPerson<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPersonId(java.lang.Integer personId) {
		set("person_id", personId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPersonId() {
		return getInt("person_id");
	}

	/**
	*设置名称 
	*/
	public M setPersonName(java.lang.String personName) {
		set("person_name", personName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getPersonName() {
		return getStr("person_name");
	}

	/**
	*设置性别 
	*/
	public M setSex(java.lang.Integer sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.Integer getSex() {
		return getInt("sex");
	}

	/**
	*设置身份证 
	*/
	public M setIdentity(java.lang.String identity) {
		set("identity", identity);
		return (M)this;
	}

	/**
	*获取身份证 
	*/
	public java.lang.String getIdentity() {
		return getStr("identity");
	}

	/**
	*设置代码 
	*/
	public M setPersonCode(java.lang.String personCode) {
		set("person_code", personCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getPersonCode() {
		return getStr("person_code");
	}

	/**
	*设置住址 
	*/
	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	/**
	*获取住址 
	*/
	public java.lang.String getAddress() {
		return getStr("address");
	}

	/**
	*设置电话 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取电话 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置备注 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置密码 
	*/
	public M setPassword(java.lang.String password) {
		set("password", password);
		return (M)this;
	}

	/**
	*获取密码 
	*/
	public java.lang.String getPassword() {
		return getStr("password");
	}

}
