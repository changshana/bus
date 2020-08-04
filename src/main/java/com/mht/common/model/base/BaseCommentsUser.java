package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comments_user:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentsUser<M extends BaseCommentsUser<M>> extends Model<M> implements IBean {

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
	*设置用户名称 
	*/
	public M setAccount(java.lang.String account) {
		set("account", account);
		return (M)this;
	}

	/**
	*获取用户名称 
	*/
	public java.lang.String getAccount() {
		return getStr("account");
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
	*设置部门 
	*/
	public M setDept(java.lang.Integer dept) {
		set("dept", dept);
		return (M)this;
	}

	/**
	*获取部门 
	*/
	public java.lang.Integer getDept() {
		return getInt("dept");
	}

}
