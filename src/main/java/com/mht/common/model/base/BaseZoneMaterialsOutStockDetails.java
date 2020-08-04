package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * zone_materials_out_stock_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseZoneMaterialsOutStockDetails<M extends BaseZoneMaterialsOutStockDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsOutStockDetailsId(java.lang.Integer materialsOutStockDetailsId) {
		set("materials_out_stock_details_id", materialsOutStockDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsOutStockDetailsId() {
		return getInt("materials_out_stock_details_id");
	}

	/**
	*设置校区材料ID 
	*/
	public M setMaterialsInfoId(java.lang.Integer materialsInfoId) {
		set("materials_info_id", materialsInfoId);
		return (M)this;
	}

	/**
	*获取校区材料ID 
	*/
	public java.lang.Integer getMaterialsInfoId() {
		return getInt("materials_info_id");
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
	*设置出库材料单ID 
	*/
	public M setMaterialsOutStockBillsId(java.lang.Integer materialsOutStockBillsId) {
		set("materials_out_stock_bills_id", materialsOutStockBillsId);
		return (M)this;
	}

	/**
	*获取出库材料单ID 
	*/
	public java.lang.Integer getMaterialsOutStockBillsId() {
		return getInt("materials_out_stock_bills_id");
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
	*设置目标 
	*/
	public M setTarget(java.lang.String target) {
		set("target", target);
		return (M)this;
	}

	/**
	*获取目标 
	*/
	public java.lang.String getTarget() {
		return getStr("target");
	}

	/**
	*设置目标ID 
	*/
	public M setTargetId(java.lang.Integer targetId) {
		set("target_id", targetId);
		return (M)this;
	}

	/**
	*获取目标ID 
	*/
	public java.lang.Integer getTargetId() {
		return getInt("target_id");
	}

}
