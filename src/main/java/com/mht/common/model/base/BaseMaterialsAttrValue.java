package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_attr_value:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsAttrValue<M extends BaseMaterialsAttrValue<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAttrValueId(java.lang.Integer attrValueId) {
		set("attr_value_id", attrValueId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAttrValueId() {
		return getInt("attr_value_id");
	}

	/**
	*设置属性ID 
	*/
	public M setAttrId(java.lang.Integer attrId) {
		set("attr_id", attrId);
		return (M)this;
	}

	/**
	*获取属性ID 
	*/
	public java.lang.Integer getAttrId() {
		return getInt("attr_id");
	}

	/**
	*设置材料ID 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取材料ID 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
	}

	/**
	*设置名称 
	*/
	public M setAttrValueName(java.lang.String attrValueName) {
		set("attr_value_name", attrValueName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getAttrValueName() {
		return getStr("attr_value_name");
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

}
