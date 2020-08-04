package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterials<M extends BaseRepairMaterials<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsId(java.lang.Integer materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsId() {
		return getInt("materials_id");
	}

	/**
	*设置名称 
	*/
	public M setMaterialsName(java.lang.String materialsName) {
		set("materials_name", materialsName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getMaterialsName() {
		return getStr("materials_name");
	}

	/**
	*设置代码 
	*/
	public M setMaterialsCode(java.lang.String materialsCode) {
		set("materials_code", materialsCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getMaterialsCode() {
		return getStr("materials_code");
	}

	/**
	*设置单位 
	*/
	public M setUnit(java.lang.String unit) {
		set("unit", unit);
		return (M)this;
	}

	/**
	*获取单位 
	*/
	public java.lang.String getUnit() {
		return getStr("unit");
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
	*设置单价 
	*/
	public M setPrice(java.lang.String price) {
		set("price", price);
		return (M)this;
	}

	/**
	*获取单价 
	*/
	public java.lang.String getPrice() {
		return getStr("price");
	}

	/**
	*设置材料分组ID 
	*/
	public M setRmgId(java.lang.Integer rmgId) {
		set("rmg_id", rmgId);
		return (M)this;
	}

	/**
	*获取材料分组ID 
	*/
	public java.lang.Integer getRmgId() {
		return getInt("rmg_id");
	}

	/**
	*设置材料类型ID 
	*/
	public M setRmcId(java.lang.Integer rmcId) {
		set("rmc_id", rmcId);
		return (M)this;
	}

	/**
	*获取材料类型ID 
	*/
	public java.lang.Integer getRmcId() {
		return getInt("rmc_id");
	}

}
