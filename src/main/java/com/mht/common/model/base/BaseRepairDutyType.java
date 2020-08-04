package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_duty_type:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDutyType<M extends BaseRepairDutyType<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDutyTypeId(java.lang.Integer dutyTypeId) {
		set("duty_type_id", dutyTypeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDutyTypeId() {
		return getInt("duty_type_id");
	}

	/**
	*设置名称 
	*/
	public M setDutyTypeName(java.lang.String dutyTypeName) {
		set("duty_type_name", dutyTypeName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getDutyTypeName() {
		return getStr("duty_type_name");
	}

	/**
	*设置开始时间 
	*/
	public M setBeginTime(java.lang.String beginTime) {
		set("begin_time", beginTime);
		return (M)this;
	}

	/**
	*获取开始时间 
	*/
	public java.lang.String getBeginTime() {
		return getStr("begin_time");
	}

	/**
	*设置结束时间 
	*/
	public M setEndTime(java.lang.String endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取结束时间 
	*/
	public java.lang.String getEndTime() {
		return getStr("end_time");
	}

	/**
	*设置 
	*/
	public M setCrossDay(java.lang.Integer crossDay) {
		set("cross_day", crossDay);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getCrossDay() {
		return getInt("cross_day");
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
