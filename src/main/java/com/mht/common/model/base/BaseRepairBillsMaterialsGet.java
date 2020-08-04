package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_bills_materials_get:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairBillsMaterialsGet<M extends BaseRepairBillsMaterialsGet<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setRbmgId(java.lang.Integer rbmgId) {
		set("rbmg_id", rbmgId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRbmgId() {
		return getInt("rbmg_id");
	}

	/**
	*设置 
	*/
	public M setMaterialsId(java.lang.Integer materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getMaterialsId() {
		return getInt("materials_id");
	}

	/**
	*设置 
	*/
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
	}

	/**
	*设置 
	*/
	public M setNumber(java.lang.String number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getNumber() {
		return getStr("number");
	}

	/**
	*设置 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
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

}
