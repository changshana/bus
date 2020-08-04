package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sms_verify_code:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSmsVerifyCode<M extends BaseSmsVerifyCode<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setVerifyCodeId(java.lang.Integer verifyCodeId) {
		set("verify_code_id", verifyCodeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getVerifyCodeId() {
		return getInt("verify_code_id");
	}

	/**
	*设置代码 
	*/
	public M setVerifyCode(java.lang.String verifyCode) {
		set("verify_code", verifyCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getVerifyCode() {
		return getStr("verify_code");
	}

	/**
	*设置手机号 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取手机号 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	/**
	*设置创建时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置过期时间 
	*/
	public M setExpireTime(java.util.Date expireTime) {
		set("expire_time", expireTime);
		return (M)this;
	}

	/**
	*获取过期时间 
	*/
	public java.util.Date getExpireTime() {
		return get("expire_time");
	}

}
