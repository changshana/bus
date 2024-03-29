package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_group_attr:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsGroupAttr<M extends BaseRepairMaterialsGroupAttr<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsGroupAttrId(java.lang.Integer materialsGroupAttrId) {
		set("materials_group_attr_id", materialsGroupAttrId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsGroupAttrId() {
		return getInt("materials_group_attr_id");
	}

	/**
	*设置名称 
	*/
	public M setMaterialsGroupAttrName(java.lang.String materialsGroupAttrName) {
		set("materials_group_attr_name", materialsGroupAttrName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getMaterialsGroupAttrName() {
		return getStr("materials_group_attr_name");
	}

	/**
	*设置材料组ID 
	*/
	public M setRmgId(java.lang.Integer rmgId) {
		set("rmg_id", rmgId);
		return (M)this;
	}

	/**
	*获取材料组ID 
	*/
	public java.lang.Integer getRmgId() {
		return getInt("rmg_id");
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

}
