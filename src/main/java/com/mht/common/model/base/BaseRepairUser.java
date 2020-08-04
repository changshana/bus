package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_user:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairUser<M extends BaseRepairUser<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	*设置姓名 
	*/
	public M setUserName(java.lang.String userName) {
		set("user_name", userName);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getUserName() {
		return getStr("user_name");
	}

	/**
	*设置手机号 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取手机号 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
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

	/**
	*设置用户类型 
	*/
	public M setUserType(java.lang.String userType) {
		set("user_type", userType);
		return (M)this;
	}

	/**
	*获取用户类型 
	*/
	public java.lang.String getUserType() {
		return getStr("user_type");
	}

	/**
	*设置学号/工资号/其它 
	*/
	public M setUserNo(java.lang.String userNo) {
		set("user_no", userNo);
		return (M)this;
	}

	/**
	*获取学号/工资号/其它 
	*/
	public java.lang.String getUserNo() {
		return getStr("user_no");
	}

	/**
	*设置微信OPENID 
	*/
	public M setOpenid(java.lang.String openid) {
		set("openid", openid);
		return (M)this;
	}

	/**
	*获取微信OPENID 
	*/
	public java.lang.String getOpenid() {
		return getStr("openid");
	}

}
