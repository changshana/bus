package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_passport:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentPassport<M extends BaseCommentPassport<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setAccId(java.lang.Long accId) {
		set("acc_id", accId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getAccId() {
		return getLong("acc_id");
	}

	/**
	*设置 
	*/
	public M setAccBirthday(java.util.Date accBirthday) {
		set("acc_birthday", accBirthday);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getAccBirthday() {
		return get("acc_birthday");
	}

	/**
	*设置 
	*/
	public M setAccEmail(java.lang.String accEmail) {
		set("acc_email", accEmail);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccEmail() {
		return getStr("acc_email");
	}

	/**
	*设置 
	*/
	public M setAccNickname(java.lang.String accNickname) {
		set("acc_nickname", accNickname);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccNickname() {
		return getStr("acc_nickname");
	}

	/**
	*设置 
	*/
	public M setAccPassword(java.lang.String accPassword) {
		set("acc_password", accPassword);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccPassword() {
		return getStr("acc_password");
	}

	/**
	*设置 
	*/
	public M setAccPhone(java.lang.String accPhone) {
		set("acc_phone", accPhone);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccPhone() {
		return getStr("acc_phone");
	}

	/**
	*设置 
	*/
	public M setPermiss(java.lang.String permiss) {
		set("permiss", permiss);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPermiss() {
		return getStr("permiss");
	}

	/**
	*设置 
	*/
	public M setPhoto(java.lang.String photo) {
		set("photo", photo);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPhoto() {
		return getStr("photo");
	}

	/**
	*设置 
	*/
	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getSex() {
		return getStr("sex");
	}

	/**
	*设置 
	*/
	public M setState(java.lang.String state) {
		set("state", state);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getState() {
		return getStr("state");
	}

}
