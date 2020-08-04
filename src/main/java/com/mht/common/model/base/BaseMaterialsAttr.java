package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_attr:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsAttr<M extends BaseMaterialsAttr<M>> extends Model<M> implements IBean {

	/**
	*设置录入方式 
	*/
	public M setEnteringMeansId(java.lang.Integer enteringMeansId) {
		set("entering_means_id", enteringMeansId);
		return (M)this;
	}

	/**
	*获取录入方式 
	*/
	public java.lang.Integer getEnteringMeansId() {
		return getInt("entering_means_id");
	}

	/**
	*设置ID 
	*/
	public M setAttrId(java.lang.Integer attrId) {
		set("attr_id", attrId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAttrId() {
		return getInt("attr_id");
	}

	/**
	*设置名称 
	*/
	public M setAttrName(java.lang.String attrName) {
		set("attr_name", attrName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getAttrName() {
		return getStr("attr_name");
	}

	/**
	*设置材料类型 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取材料类型 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
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

}
