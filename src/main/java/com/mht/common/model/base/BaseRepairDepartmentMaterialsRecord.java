package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department_materials_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartmentMaterialsRecord<M extends BaseRepairDepartmentMaterialsRecord<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDepartmentMaterialsRecordId(java.lang.Integer departmentMaterialsRecordId) {
		set("department_materials_record_id", departmentMaterialsRecordId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDepartmentMaterialsRecordId() {
		return getInt("department_materials_record_id");
	}

	/**
	*设置名称 
	*/
	public M setDepartmentMaterialsRecordName(java.lang.String departmentMaterialsRecordName) {
		set("department_materials_record_name", departmentMaterialsRecordName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getDepartmentMaterialsRecordName() {
		return getStr("department_materials_record_name");
	}

	/**
	*设置数量 
	*/
	public M setNumber(java.lang.String number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.String getNumber() {
		return getStr("number");
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
	*设置材料ID 
	*/
	public M setMaterialsId(java.lang.Integer materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取材料ID 
	*/
	public java.lang.Integer getMaterialsId() {
		return getInt("materials_id");
	}

	/**
	*设置部门ID 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取部门ID 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置目标ID 
	*/
	public M setGoalId(java.lang.Integer goalId) {
		set("goal_id", goalId);
		return (M)this;
	}

	/**
	*获取目标ID 
	*/
	public java.lang.Integer getGoalId() {
		return getInt("goal_id");
	}

	/**
	*设置目标类型 
	*/
	public M setGoalType(java.lang.Integer goalType) {
		set("goal_type", goalType);
		return (M)this;
	}

	/**
	*获取目标类型 
	*/
	public java.lang.Integer getGoalType() {
		return getInt("goal_type");
	}

}
