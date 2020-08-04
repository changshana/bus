package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * zone_materials_out_stock_bills:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseZoneMaterialsOutStockBills<M extends BaseZoneMaterialsOutStockBills<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsOutStockBillsId(java.lang.Integer materialsOutStockBillsId) {
		set("materials_out_stock_bills_id", materialsOutStockBillsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsOutStockBillsId() {
		return getInt("materials_out_stock_bills_id");
	}

	/**
	*设置名称 
	*/
	public M setMaterialsOutStockBillsName(java.lang.String materialsOutStockBillsName) {
		set("materials_out_stock_bills_name", materialsOutStockBillsName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getMaterialsOutStockBillsName() {
		return getStr("materials_out_stock_bills_name");
	}

	/**
	*设置代码 
	*/
	public M setMaterialsOutStockBillsCode(java.lang.String materialsOutStockBillsCode) {
		set("materials_out_stock_bills_code", materialsOutStockBillsCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getMaterialsOutStockBillsCode() {
		return getStr("materials_out_stock_bills_code");
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
	*设置类型 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取类型 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
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
	*设置一级机构 
	*/
	public M setSiteCode(java.lang.String siteCode) {
		set("site_code", siteCode);
		return (M)this;
	}

	/**
	*获取一级机构 
	*/
	public java.lang.String getSiteCode() {
		return getStr("site_code");
	}

	/**
	*设置二级机构 
	*/
	public M setHandCode(java.lang.String handCode) {
		set("hand_code", handCode);
		return (M)this;
	}

	/**
	*获取二级机构 
	*/
	public java.lang.String getHandCode() {
		return getStr("hand_code");
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
	public M setTergetId(java.lang.Integer tergetId) {
		set("terget_id", tergetId);
		return (M)this;
	}

	/**
	*获取目标ID 
	*/
	public java.lang.Integer getTergetId() {
		return getInt("terget_id");
	}

}
