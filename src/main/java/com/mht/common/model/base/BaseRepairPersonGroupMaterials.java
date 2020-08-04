package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_person_group_materials:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairPersonGroupMaterials<M extends BaseRepairPersonGroupMaterials<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setPgmId(java.lang.Integer pgmId) {
		set("pgm_id", pgmId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getPgmId() {
		return getInt("pgm_id");
	}

	/**
	*设置 
	*/
	public M setPgmName(java.lang.String pgmName) {
		set("pgm_name", pgmName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPgmName() {
		return getStr("pgm_name");
	}

	/**
	*设置 
	*/
	public M setPgmNumber(java.lang.Integer pgmNumber) {
		set("pgm_number", pgmNumber);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getPgmNumber() {
		return getInt("pgm_number");
	}

	/**
	*设置 
	*/
	public M setPgmUnit(java.lang.String pgmUnit) {
		set("pgm_unit", pgmUnit);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPgmUnit() {
		return getStr("pgm_unit");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setPgmCostPrice(java.lang.Double pgmCostPrice) {
		set("pgm_cost_price", pgmCostPrice);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Double getPgmCostPrice() {
		return getDouble("pgm_cost_price");
	}

	/**
	*设置 
	*/
	public M setPgmSellingPrice(java.lang.Double pgmSellingPrice) {
		set("pgm_selling_price", pgmSellingPrice);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Double getPgmSellingPrice() {
		return getDouble("pgm_selling_price");
	}

	/**
	*设置 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置 
	*/
	public M setTypeId(java.lang.Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTypeId() {
		return getInt("type_id");
	}

}
