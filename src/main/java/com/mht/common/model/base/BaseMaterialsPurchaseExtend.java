package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_purchase_extend:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsPurchaseExtend<M extends BaseMaterialsPurchaseExtend<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPurchaseExtendId(java.lang.Integer purchaseExtendId) {
		set("purchase_extend_id", purchaseExtendId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPurchaseExtendId() {
		return getInt("purchase_extend_id");
	}

	/**
	*设置详情ID 
	*/
	public M setPurchaseDetailsId(java.lang.Integer purchaseDetailsId) {
		set("purchase_details_id", purchaseDetailsId);
		return (M)this;
	}

	/**
	*获取详情ID 
	*/
	public java.lang.Integer getPurchaseDetailsId() {
		return getInt("purchase_details_id");
	}

	/**
	*设置材料单价 
	*/
	public M setMaterialsPrice(java.lang.Double materialsPrice) {
		set("materials_price", materialsPrice);
		return (M)this;
	}

	/**
	*获取材料单价 
	*/
	public java.lang.Double getMaterialsPrice() {
		return getDouble("materials_price");
	}

	/**
	*设置材料厂商ID 
	*/
	public M setMaterialsManufacturersId(java.lang.Integer materialsManufacturersId) {
		set("materials_manufacturers_id", materialsManufacturersId);
		return (M)this;
	}

	/**
	*获取材料厂商ID 
	*/
	public java.lang.Integer getMaterialsManufacturersId() {
		return getInt("materials_manufacturers_id");
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
	*设置预估到达时间 
	*/
	public M setEstimateTime(java.util.Date estimateTime) {
		set("estimate_time", estimateTime);
		return (M)this;
	}

	/**
	*获取预估到达时间 
	*/
	public java.util.Date getEstimateTime() {
		return get("estimate_time");
	}

	/**
	*设置到达时间 
	*/
	public M setArriveTime(java.util.Date arriveTime) {
		set("arrive_time", arriveTime);
		return (M)this;
	}

	/**
	*获取到达时间 
	*/
	public java.util.Date getArriveTime() {
		return get("arrive_time");
	}

	/**
	*设置提交审核时间 
	*/
	public M setSubmitCheckTime(java.util.Date submitCheckTime) {
		set("submit_check_time", submitCheckTime);
		return (M)this;
	}

	/**
	*获取提交审核时间 
	*/
	public java.util.Date getSubmitCheckTime() {
		return get("submit_check_time");
	}

	/**
	*设置原始数量 
	*/
	public M setOriginalNumber(java.lang.String originalNumber) {
		set("original_number", originalNumber);
		return (M)this;
	}

	/**
	*获取原始数量 
	*/
	public java.lang.String getOriginalNumber() {
		return getStr("original_number");
	}

	/**
	*设置确认时间 
	*/
	public M setAffirmTime(java.util.Date affirmTime) {
		set("affirm_time", affirmTime);
		return (M)this;
	}

	/**
	*获取确认时间 
	*/
	public java.util.Date getAffirmTime() {
		return get("affirm_time");
	}

}
