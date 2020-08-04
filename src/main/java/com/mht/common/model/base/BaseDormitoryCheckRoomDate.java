package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_check_room_date:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCheckRoomDate<M extends BaseDormitoryCheckRoomDate<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCheckId(java.lang.Integer checkId) {
		set("check_id", checkId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCheckId() {
		return getInt("check_id");
	}

	/**
	*设置校区ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取校区ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置学院ID 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取学院ID 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置开始时间 
	*/
	public M setBeginTime(java.util.Date beginTime) {
		set("begin_time", beginTime);
		return (M)this;
	}

	/**
	*获取开始时间 
	*/
	public java.util.Date getBeginTime() {
		return get("begin_time");
	}

	/**
	*设置截止时间 
	*/
	public M setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取截止时间 
	*/
	public java.util.Date getEndTime() {
		return get("end_time");
	}

	/**
	*设置状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
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

	/**
	*设置备注 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}
