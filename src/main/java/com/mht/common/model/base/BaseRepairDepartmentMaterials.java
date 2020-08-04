package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department_materials:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartmentMaterials<M extends BaseRepairDepartmentMaterials<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRdmId(java.lang.Integer rdmId) {
		set("rdm_id", rdmId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRdmId() {
		return getInt("rdm_id");
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
	public M setMaterialsId(java.lang.Integer materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取材料ID 
	*/
	public java.lang.Integer getMaterialsId() {
		return getInt("materials_id");
	}

	/**
	*设置数量 
	*/
	public M setNumber(java.lang.String number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.String getNumber() {
		return getStr("number");
	}

	/**
	*设置部门ID 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取部门ID 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

}
