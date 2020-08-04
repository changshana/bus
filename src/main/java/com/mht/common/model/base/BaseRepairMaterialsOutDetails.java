package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_out_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsOutDetails<M extends BaseRepairMaterialsOutDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsOutDetailsId(java.lang.Integer materialsOutDetailsId) {
		set("materials_out_details_id", materialsOutDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsOutDetailsId() {
		return getInt("materials_out_details_id");
	}

	/**
	*设置非正常出库单ID 
	*/
	public M setRmobId(java.lang.Integer rmobId) {
		set("rmob_id", rmobId);
		return (M)this;
	}

	/**
	*获取非正常出库单ID 
	*/
	public java.lang.Integer getRmobId() {
		return getInt("rmob_id");
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
