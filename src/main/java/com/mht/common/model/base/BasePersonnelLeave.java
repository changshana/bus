package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_leave:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelLeave<M extends BasePersonnelLeave<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setLeaveId(java.lang.Integer leaveId) {
		set("leave_id", leaveId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getLeaveId() {
		return getInt("leave_id");
	}

	/**
	*设置员工ID 
	*/
	public M setEmployeeInformationId(java.lang.Integer employeeInformationId) {
		set("employee_information_id", employeeInformationId);
		return (M)this;
	}

	/**
	*获取员工ID 
	*/
	public java.lang.Integer getEmployeeInformationId() {
		return getInt("employee_information_id");
	}

	/**
	*设置请假类型 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取请假类型 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	*设置开始日期 
	*/
	public M setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
		return (M)this;
	}

	/**
	*获取开始日期 
	*/
	public java.util.Date getStartTime() {
		return get("start_time");
	}

	/**
	*设置结束日期 
	*/
	public M setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
		return (M)this;
	}

	/**
	*获取结束日期 
	*/
	public java.util.Date getEndTime() {
		return get("end_time");
	}

	/**
	*设置说明 
	*/
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取说明 
	*/
	public java.lang.String getContent() {
		return getStr("content");
	}

	/**
	*设置审核状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取审核状态 
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
	*设置经办机构id 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取经办机构id 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
	}

}
