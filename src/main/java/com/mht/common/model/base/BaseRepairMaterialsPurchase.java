package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_purchase:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsPurchase<M extends BaseRepairMaterialsPurchase<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRmpId(java.lang.Integer rmpId) {
		set("rmp_id", rmpId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRmpId() {
		return getInt("rmp_id");
	}

	/**
	*设置材料 
	*/
	public M setMaterialsId(java.lang.Integer materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取材料 
	*/
	public java.lang.Integer getMaterialsId() {
		return getInt("materials_id");
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

	/**
	*设置采购批次 
	*/
	public M setRmpbId(java.lang.Integer rmpbId) {
		set("rmpb_id", rmpbId);
		return (M)this;
	}

	/**
	*获取采购批次 
	*/
	public java.lang.Integer getRmpbId() {
		return getInt("rmpb_id");
	}

}
