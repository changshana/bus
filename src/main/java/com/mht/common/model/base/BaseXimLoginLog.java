package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * xim_login_log:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXimLoginLog<M extends BaseXimLoginLog<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setLoginLogId(java.lang.Integer loginLogId) {
		set("login_log_id", loginLogId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getLoginLogId() {
		return getInt("login_log_id");
	}

	/**
	*设置user_id 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取user_id 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	*设置ip  
	*/
	public M setIp(java.lang.String ip) {
		set("ip", ip);
		return (M)this;
	}

	/**
	*获取ip  
	*/
	public java.lang.String getIp() {
		return getStr("ip");
	}

	/**
	*设置login_time 
	*/
	public M setLoginTime(java.util.Date loginTime) {
		set("login_time", loginTime);
		return (M)this;
	}

	/**
	*获取login_time 
	*/
	public java.util.Date getLoginTime() {
		return get("login_time");
	}

}
