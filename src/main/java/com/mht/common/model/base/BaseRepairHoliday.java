package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_holiday:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairHoliday<M extends BaseRepairHoliday<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setHolidayId(java.lang.Integer holidayId) {
		set("holiday_id", holidayId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getHolidayId() {
		return getInt("holiday_id");
	}

	/**
	*设置名称 
	*/
	public M setHolidayName(java.lang.String holidayName) {
		set("holiday_name", holidayName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getHolidayName() {
		return getStr("holiday_name");
	}

	/**
	*设置开始日期 
	*/
	public M setBeginDate(java.util.Date beginDate) {
		set("begin_date", beginDate);
		return (M)this;
	}

	/**
	*获取开始日期 
	*/
	public java.util.Date getBeginDate() {
		return get("begin_date");
	}

	/**
	*设置结束日期 
	*/
	public M setEndDate(java.util.Date endDate) {
		set("end_date", endDate);
		return (M)this;
	}

	/**
	*获取结束日期 
	*/
	public java.util.Date getEndDate() {
		return get("end_date");
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
	*设置创建用户 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

}
