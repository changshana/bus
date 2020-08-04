package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department_materials_get_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartmentMaterialsGetDetails<M extends BaseRepairDepartmentMaterialsGetDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRdmgdId(java.lang.Integer rdmgdId) {
		set("rdmgd_id", rdmgdId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRdmgdId() {
		return getInt("rdmgd_id");
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
	*设置领取单ID 
	*/
	public M setRdmgId(java.lang.Integer rdmgId) {
		set("rdmg_id", rdmgId);
		return (M)this;
	}

	/**
	*获取领取单ID 
	*/
	public java.lang.Integer getRdmgId() {
		return getInt("rdmg_id");
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
	*设置校区材料ID 
	*/
	public M setZoneMaterialsId(java.lang.Integer zoneMaterialsId) {
		set("zone_materials_id", zoneMaterialsId);
		return (M)this;
	}

	/**
	*获取校区材料ID 
	*/
	public java.lang.Integer getZoneMaterialsId() {
		return getInt("zone_materials_id");
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
