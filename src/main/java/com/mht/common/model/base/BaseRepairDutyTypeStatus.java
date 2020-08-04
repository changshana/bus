package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_duty_type_status:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDutyTypeStatus<M extends BaseRepairDutyTypeStatus<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setDutyTypeStatusId(java.lang.Integer dutyTypeStatusId) {
		set("duty_type_status_id", dutyTypeStatusId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDutyTypeStatusId() {
		return getInt("duty_type_status_id");
	}

	/**
	*设置 
	*/
	public M setDutyTypeStatusName(java.lang.String dutyTypeStatusName) {
		set("duty_type_status_name", dutyTypeStatusName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDutyTypeStatusName() {
		return getStr("duty_type_status_name");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

}
