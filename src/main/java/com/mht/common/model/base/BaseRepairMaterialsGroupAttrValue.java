package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_group_attr_value:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsGroupAttrValue<M extends BaseRepairMaterialsGroupAttrValue<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsGroupAttrValueId(java.lang.Integer materialsGroupAttrValueId) {
		set("materials_group_attr_value_id", materialsGroupAttrValueId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsGroupAttrValueId() {
		return getInt("materials_group_attr_value_id");
	}

	/**
	*设置名称 
	*/
	public M setMaterialsGroupAttrValueName(java.lang.String materialsGroupAttrValueName) {
		set("materials_group_attr_value_name", materialsGroupAttrValueName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getMaterialsGroupAttrValueName() {
		return getStr("materials_group_attr_value_name");
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

	/**
	*设置材料ID 
	*/
	public M setMaterialsId(java.lang.String materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取材料ID 
	*/
	public java.lang.String getMaterialsId() {
		return getStr("materials_id");
	}

	/**
	*设置材料属性ID 
	*/
	public M setMaterialsGroupAttrId(java.lang.Integer materialsGroupAttrId) {
		set("materials_group_attr_id", materialsGroupAttrId);
		return (M)this;
	}

	/**
	*获取材料属性ID 
	*/
	public java.lang.Integer getMaterialsGroupAttrId() {
		return getInt("materials_group_attr_id");
	}

}
