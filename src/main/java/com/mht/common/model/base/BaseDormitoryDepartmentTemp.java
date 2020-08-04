package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_department_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryDepartmentTemp<M extends BaseDormitoryDepartmentTemp<M>> extends Model<M> implements IBean {

	/**
	*设置临时数据ID 
	*/
	public M setTempId(java.lang.Integer tempId) {
		set("temp_id", tempId);
		return (M)this;
	}

	/**
	*获取临时数据ID 
	*/
	public java.lang.Integer getTempId() {
		return getInt("temp_id");
	}

	/**
	*设置院系名称 
	*/
	public M setDepartmentName(java.lang.String departmentName) {
		set("department_name", departmentName);
		return (M)this;
	}

	/**
	*获取院系名称 
	*/
	public java.lang.String getDepartmentName() {
		return getStr("department_name");
	}

	/**
	*设置院系代码 
	*/
	public M setDepartmentCode(java.lang.String departmentCode) {
		set("department_code", departmentCode);
		return (M)this;
	}

	/**
	*获取院系代码 
	*/
	public java.lang.String getDepartmentCode() {
		return getStr("department_code");
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
	*设置创建时间 
	*/
	public M setCreatime(java.util.Date creatime) {
		set("creatime", creatime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreatime() {
		return get("creatime");
	}

	/**
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置批次号 
	*/
	public M setBatchNum(java.lang.String batchNum) {
		set("batch_num", batchNum);
		return (M)this;
	}

	/**
	*获取批次号 
	*/
	public java.lang.String getBatchNum() {
		return getStr("batch_num");
	}

	/**
	*设置是否校验成功（1：成功，0：失败） 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取是否校验成功（1：成功，0：失败） 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	*设置失败原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取失败原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
	}

}
