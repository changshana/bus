package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_major_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryMajorTemp<M extends BaseDormitoryMajorTemp<M>> extends Model<M> implements IBean {

	/**
	*设置临时id 
	*/
	public M setTempId(java.lang.Integer tempId) {
		set("temp_id", tempId);
		return (M)this;
	}

	/**
	*获取临时id 
	*/
	public java.lang.Integer getTempId() {
		return getInt("temp_id");
	}

	/**
	*设置专业名称 
	*/
	public M setMajorName(java.lang.String majorName) {
		set("major_name", majorName);
		return (M)this;
	}

	/**
	*获取专业名称 
	*/
	public java.lang.String getMajorName() {
		return getStr("major_name");
	}

	/**
	*设置专业代码 
	*/
	public M setMajorCode(java.lang.String majorCode) {
		set("major_code", majorCode);
		return (M)this;
	}

	/**
	*获取专业代码 
	*/
	public java.lang.String getMajorCode() {
		return getStr("major_code");
	}

	/**
	*设置所属院系id 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取所属院系id 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
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

	/**
	*设置导入批次号 
	*/
	public M setBatchNumber(java.lang.String batchNumber) {
		set("batch_number", batchNumber);
		return (M)this;
	}

	/**
	*获取导入批次号 
	*/
	public java.lang.String getBatchNumber() {
		return getStr("batch_number");
	}

}
