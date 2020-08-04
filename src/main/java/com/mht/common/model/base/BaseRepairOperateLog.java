package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_operate_log:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairOperateLog<M extends BaseRepairOperateLog<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setLogId(java.lang.Integer logId) {
		set("log_id", logId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getLogId() {
		return getInt("log_id");
	}

	/**
	*设置 
	*/
	public M setLogType(java.lang.String logType) {
		set("log_type", logType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getLogType() {
		return getStr("log_type");
	}

	/**
	*设置 
	*/
	public M setOperator(java.lang.String operator) {
		set("operator", operator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getOperator() {
		return getStr("operator");
	}

	/**
	*设置 
	*/
	public M setOperateTime(java.util.Date operateTime) {
		set("operate_time", operateTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getOperateTime() {
		return get("operate_time");
	}

	/**
	*设置 
	*/
	public M setOperateIp(java.lang.String operateIp) {
		set("operate_ip", operateIp);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getOperateIp() {
		return getStr("operate_ip");
	}

	/**
	*设置 
	*/
	public M setOperateType(java.lang.String operateType) {
		set("operate_type", operateType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getOperateType() {
		return getStr("operate_type");
	}

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}
