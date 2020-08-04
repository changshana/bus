package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_verification_phone:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairVerificationPhone<M extends BaseRepairVerificationPhone<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setVerificationPhoneId(java.lang.Integer verificationPhoneId) {
		set("verification_phone_id", verificationPhoneId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getVerificationPhoneId() {
		return getInt("verification_phone_id");
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
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置 
	*/
	public M setIp(java.lang.String ip) {
		set("ip", ip);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getIp() {
		return getStr("ip");
	}

}
