package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_dispatch_batch:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsDispatchBatch<M extends BaseRepairMaterialsDispatchBatch<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsDispatchBatchId(java.lang.Integer materialsDispatchBatchId) {
		set("materials_dispatch_batch_id", materialsDispatchBatchId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsDispatchBatchId() {
		return getInt("materials_dispatch_batch_id");
	}

	/**
	*设置名称 
	*/
	public M setMaterialsDispatchBatchName(java.lang.String materialsDispatchBatchName) {
		set("materials_dispatch_batch_name", materialsDispatchBatchName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getMaterialsDispatchBatchName() {
		return getStr("materials_dispatch_batch_name");
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

	/**
	*设置代码 
	*/
	public M setMaterialsDispatchBatchCode(java.lang.String materialsDispatchBatchCode) {
		set("materials_dispatch_batch_code", materialsDispatchBatchCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getMaterialsDispatchBatchCode() {
		return getStr("materials_dispatch_batch_code");
	}

}
