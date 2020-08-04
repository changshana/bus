package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * zone_materials_out_stock_arrive:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseZoneMaterialsOutStockArrive<M extends BaseZoneMaterialsOutStockArrive<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsOutStockArriveId(java.lang.Integer materialsOutStockArriveId) {
		set("materials_out_stock_arrive_id", materialsOutStockArriveId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsOutStockArriveId() {
		return getInt("materials_out_stock_arrive_id");
	}

	/**
	*设置材料出库单详情ID 
	*/
	public M setMaterialsOutStockDetailsId(java.lang.Integer materialsOutStockDetailsId) {
		set("materials_out_stock_details_id", materialsOutStockDetailsId);
		return (M)this;
	}

	/**
	*获取材料出库单详情ID 
	*/
	public java.lang.Integer getMaterialsOutStockDetailsId() {
		return getInt("materials_out_stock_details_id");
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

}
