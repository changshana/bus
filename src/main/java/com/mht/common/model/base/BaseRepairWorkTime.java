package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_work_time:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairWorkTime<M extends BaseRepairWorkTime<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setWorkTimeId(java.lang.Integer workTimeId) {
		set("work_time_id", workTimeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getWorkTimeId() {
		return getInt("work_time_id");
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
