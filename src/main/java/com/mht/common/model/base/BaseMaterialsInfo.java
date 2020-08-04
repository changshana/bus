package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsInfo<M extends BaseMaterialsInfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
	}

	/**
	*设置名称 
	*/
	public M setInfoName(java.lang.String infoName) {
		set("info_name", infoName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getInfoName() {
		return getStr("info_name");
	}

	/**
	*设置代码 
	*/
	public M setInfoCode(java.lang.String infoCode) {
		set("info_code", infoCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getInfoCode() {
		return getStr("info_code");
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
	*设置类型ID 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取类型ID 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
	}

	/**
	*设置分组iD 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取分组iD 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置提醒 
	*/
	public M setAlert(java.lang.Integer alert) {
		set("alert", alert);
		return (M)this;
	}

	/**
	*获取提醒 
	*/
	public java.lang.Integer getAlert() {
		return getInt("alert");
	}

	/**
	*设置品牌 
	*/
	public M setTrademark(java.lang.String trademark) {
		set("trademark", trademark);
		return (M)this;
	}

	/**
	*获取品牌 
	*/
	public java.lang.String getTrademark() {
		return getStr("trademark");
	}

	/**
	*设置型号 
	*/
	public M setModel(java.lang.String model) {
		set("model", model);
		return (M)this;
	}

	/**
	*获取型号 
	*/
	public java.lang.String getModel() {
		return getStr("model");
	}

	/**
	*设置规格 
	*/
	public M setSpecification(java.lang.String specification) {
		set("specification", specification);
		return (M)this;
	}

	/**
	*获取规格 
	*/
	public java.lang.String getSpecification() {
		return getStr("specification");
	}

}
