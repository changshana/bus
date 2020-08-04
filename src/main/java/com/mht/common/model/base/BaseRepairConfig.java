package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_config:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairConfig<M extends BaseRepairConfig<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setConfigId(java.lang.Integer configId) {
		set("config_id", configId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getConfigId() {
		return getInt("config_id");
	}

	/**
	*设置开启值班 
	*/
	public M setOpenDuty(java.lang.Integer openDuty) {
		set("open_duty", openDuty);
		return (M)this;
	}

	/**
	*获取开启值班 
	*/
	public java.lang.Integer getOpenDuty() {
		return getInt("open_duty");
	}

	/**
	*设置 
	*/
	public M setSendSms(java.lang.Integer sendSms) {
		set("send_sms", sendSms);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getSendSms() {
		return getInt("send_sms");
	}

	/**
	*设置 
	*/
	public M setConfigName(java.lang.String configName) {
		set("config_name", configName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getConfigName() {
		return getStr("config_name");
	}

	/**
	*设置 
	*/
	public M setNotDispatchAlert(java.lang.Double notDispatchAlert) {
		set("not_dispatch_alert", notDispatchAlert);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Double getNotDispatchAlert() {
		return getDouble("not_dispatch_alert");
	}

	/**
	*设置 
	*/
	public M setNotResultAlert(java.lang.Double notResultAlert) {
		set("not_result_alert", notResultAlert);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Double getNotResultAlert() {
		return getDouble("not_result_alert");
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

}
