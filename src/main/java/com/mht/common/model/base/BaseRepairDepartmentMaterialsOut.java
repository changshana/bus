package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department_materials_out:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartmentMaterialsOut<M extends BaseRepairDepartmentMaterialsOut<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRdmoId(java.lang.Integer rdmoId) {
		set("rdmo_id", rdmoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRdmoId() {
		return getInt("rdmo_id");
	}

	/**
	*设置ID 
	*/
	public M setMaterialsId(java.lang.Integer materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取ID 
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
	*设置部门材料出库单ID 
	*/
	public M setRdmobId(java.lang.Integer rdmobId) {
		set("rdmob_id", rdmobId);
		return (M)this;
	}

	/**
	*获取部门材料出库单ID 
	*/
	public java.lang.Integer getRdmobId() {
		return getInt("rdmob_id");
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
