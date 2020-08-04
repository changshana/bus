package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_purchase_batch:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsPurchaseBatch<M extends BaseRepairMaterialsPurchaseBatch<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRmpbId(java.lang.Integer rmpbId) {
		set("rmpb_id", rmpbId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRmpbId() {
		return getInt("rmpb_id");
	}

	/**
	*设置代码 
	*/
	public M setBatchCode(java.lang.String batchCode) {
		set("batch_code", batchCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getBatchCode() {
		return getStr("batch_code");
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
	*设置名称 
	*/
	public M setRmpbName(java.lang.String rmpbName) {
		set("rmpb_name", rmpbName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getRmpbName() {
		return getStr("rmpb_name");
	}

	/**
	*设置实际到达时间 
	*/
	public M setPredictArriveTime(java.util.Date predictArriveTime) {
		set("predict_arrive_time", predictArriveTime);
		return (M)this;
	}

	/**
	*获取实际到达时间 
	*/
	public java.util.Date getPredictArriveTime() {
		return get("predict_arrive_time");
	}

	/**
	*设置预估到达间 
	*/
	public M setEstimateArriveTime(java.util.Date estimateArriveTime) {
		set("estimate_arrive_time", estimateArriveTime);
		return (M)this;
	}

	/**
	*获取预估到达间 
	*/
	public java.util.Date getEstimateArriveTime() {
		return get("estimate_arrive_time");
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
