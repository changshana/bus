package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * wx_access_token:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWxAccessToken<M extends BaseWxAccessToken<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setAccessToken(java.lang.String accessToken) {
		set("access_token", accessToken);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccessToken() {
		return getStr("access_token");
	}

	/**
	*设置 
	*/
	public M setRefreshToken(java.lang.String refreshToken) {
		set("refresh_token", refreshToken);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRefreshToken() {
		return getStr("refresh_token");
	}

	/**
	*设置 
	*/
	public M setOpenid(java.lang.String openid) {
		set("openid", openid);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getOpenid() {
		return getStr("openid");
	}

	/**
	*设置 
	*/
	public M setExpiresTime(java.lang.Long expiresTime) {
		set("expires_time", expiresTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getExpiresTime() {
		return getLong("expires_time");
	}

	/**
	*设置 
	*/
	public M setAccessTokenId(java.lang.Integer accessTokenId) {
		set("access_token_id", accessTokenId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAccessTokenId() {
		return getInt("access_token_id");
	}

}
