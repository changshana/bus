package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_work_injury_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelWorkInjuryRecord<M extends BasePersonnelWorkInjuryRecord<M>> extends Model<M> implements IBean {

	/**
	*设置备案ID 
	*/
	public M setWorkInjuryRecordId(java.lang.Integer workInjuryRecordId) {
		set("work_injury_record_id", workInjuryRecordId);
		return (M)this;
	}

	/**
	*获取备案ID 
	*/
	public java.lang.Integer getWorkInjuryRecordId() {
		return getInt("work_injury_record_id");
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
	*设置事件日期 
	*/
	public M setTheTime(java.util.Date theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取事件日期 
	*/
	public java.util.Date getTheTime() {
		return get("the_time");
	}

	/**
	*设置事件内容 
	*/
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取事件内容 
	*/
	public java.lang.String getContent() {
		return getStr("content");
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
