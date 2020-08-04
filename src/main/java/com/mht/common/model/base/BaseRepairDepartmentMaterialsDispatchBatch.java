package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department_materials_dispatch_batch:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartmentMaterialsDispatchBatch<M extends BaseRepairDepartmentMaterialsDispatchBatch<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDepartmentMaterialsDispatchBatchId(java.lang.Integer departmentMaterialsDispatchBatchId) {
		set("department_materials_dispatch_batch_id", departmentMaterialsDispatchBatchId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDepartmentMaterialsDispatchBatchId() {
		return getInt("department_materials_dispatch_batch_id");
	}

	/**
	*设置名称 
	*/
	public M setDepartmentMaterialsDispatchBatchName(java.lang.String departmentMaterialsDispatchBatchName) {
		set("department_materials_dispatch_batch_name", departmentMaterialsDispatchBatchName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getDepartmentMaterialsDispatchBatchName() {
		return getStr("department_materials_dispatch_batch_name");
	}

	/**
	*设置代码 
	*/
	public M setDepartmentMaterialsDispatchBatchCode(java.lang.String departmentMaterialsDispatchBatchCode) {
		set("department_materials_dispatch_batch_code", departmentMaterialsDispatchBatchCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getDepartmentMaterialsDispatchBatchCode() {
		return getStr("department_materials_dispatch_batch_code");
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
	*设置校区ID 
	*/
	public M setZoneId(java.lang.Integer zoneId) {
		set("zone_id", zoneId);
		return (M)this;
	}

	/**
	*获取校区ID 
	*/
	public java.lang.Integer getZoneId() {
		return getInt("zone_id");
	}

}
