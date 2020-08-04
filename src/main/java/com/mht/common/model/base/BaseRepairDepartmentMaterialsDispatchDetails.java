package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department_materials_dispatch_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartmentMaterialsDispatchDetails<M extends BaseRepairDepartmentMaterialsDispatchDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDepartmentMaterialsDispatchDetailsId(java.lang.Integer departmentMaterialsDispatchDetailsId) {
		set("department_materials_dispatch_details_id", departmentMaterialsDispatchDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDepartmentMaterialsDispatchDetailsId() {
		return getInt("department_materials_dispatch_details_id");
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
	*设置调度批次ID 
	*/
	public M setDepartmentMaterialsDispatchBatchId(java.lang.Integer departmentMaterialsDispatchBatchId) {
		set("department_materials_dispatch_batch_id", departmentMaterialsDispatchBatchId);
		return (M)this;
	}

	/**
	*获取调度批次ID 
	*/
	public java.lang.Integer getDepartmentMaterialsDispatchBatchId() {
		return getInt("department_materials_dispatch_batch_id");
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
	*设置到货时间 
	*/
	public M setPredictArriveTime(java.lang.Integer predictArriveTime) {
		set("predict_arrive_time", predictArriveTime);
		return (M)this;
	}

	/**
	*获取到货时间 
	*/
	public java.lang.Integer getPredictArriveTime() {
		return getInt("predict_arrive_time");
	}

}
