package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_dispatch_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsDispatchDetails<M extends BaseRepairMaterialsDispatchDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsDispatchDetailsId(java.lang.Integer materialsDispatchDetailsId) {
		set("materials_dispatch_details_id", materialsDispatchDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsDispatchDetailsId() {
		return getInt("materials_dispatch_details_id");
	}

	/**
	*设置校区材料ID 
	*/
	public M setZoneMaterialsId(java.lang.Integer zoneMaterialsId) {
		set("zone_materials_id", zoneMaterialsId);
		return (M)this;
	}

	/**
	*获取校区材料ID 
	*/
	public java.lang.Integer getZoneMaterialsId() {
		return getInt("zone_materials_id");
	}

	/**
	*设置数量 
	*/
	public M setNumber(java.lang.Integer number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.Integer getNumber() {
		return getInt("number");
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
	*设置调度批次ID 
	*/
	public M setMaterialsDisptchBatchId(java.lang.Integer materialsDisptchBatchId) {
		set("materials_disptch_batch_id", materialsDisptchBatchId);
		return (M)this;
	}

	/**
	*获取调度批次ID 
	*/
	public java.lang.Integer getMaterialsDisptchBatchId() {
		return getInt("materials_disptch_batch_id");
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
