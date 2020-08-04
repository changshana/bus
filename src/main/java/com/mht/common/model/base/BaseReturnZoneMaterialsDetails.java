package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * return_zone_materials_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseReturnZoneMaterialsDetails<M extends BaseReturnZoneMaterialsDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setZoneMaterialsDetailsId(java.lang.Integer zoneMaterialsDetailsId) {
		set("zone_materials_details_id", zoneMaterialsDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getZoneMaterialsDetailsId() {
		return getInt("zone_materials_details_id");
	}

	/**
	*设置归还校区单ID 
	*/
	public M setZoneMaterialsBillsId(java.lang.Integer zoneMaterialsBillsId) {
		set("zone_materials_bills_id", zoneMaterialsBillsId);
		return (M)this;
	}

	/**
	*获取归还校区单ID 
	*/
	public java.lang.Integer getZoneMaterialsBillsId() {
		return getInt("zone_materials_bills_id");
	}

	/**
	*设置部门材料ID 
	*/
	public M setMaterialsInfoId(java.lang.Integer materialsInfoId) {
		set("materials_info_id", materialsInfoId);
		return (M)this;
	}

	/**
	*获取部门材料ID 
	*/
	public java.lang.Integer getMaterialsInfoId() {
		return getInt("materials_info_id");
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
	*设置 
	*/
	public M setInfoNames(java.lang.String infoNames) {
		set("info_names", infoNames);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getInfoNames() {
		return getStr("info_names");
	}

}
