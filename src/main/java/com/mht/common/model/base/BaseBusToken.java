package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_token:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusToken<M extends BaseBusToken<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	*设置 
	*/
	public M setToken(java.lang.String token) {
		set("token", token);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getToken() {
		return getStr("token");
	}

	/**
	*设置 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	*设置΢ 
	*/
	public M setWxOpenId(java.lang.String wxOpenId) {
		set("wx_open_id", wxOpenId);
		return (M)this;
	}

	/**
	*获取΢ 
	*/
	public java.lang.String getWxOpenId() {
		return getStr("wx_open_id");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getEndTime() {
		return get("end_time");
	}

	/**
	*设置 
	*/
	public M setUserName(java.lang.String userName) {
		set("user_name", userName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getUserName() {
		return getStr("user_name");
	}

}
