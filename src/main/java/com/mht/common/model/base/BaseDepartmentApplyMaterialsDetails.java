package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * department_apply_materials_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDepartmentApplyMaterialsDetails<M extends BaseDepartmentApplyMaterialsDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApplyMaterialsDetailsId(java.lang.Integer applyMaterialsDetailsId) {
		set("apply_materials_details_id", applyMaterialsDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApplyMaterialsDetailsId() {
		return getInt("apply_materials_details_id");
	}

	/**
	*设置部门材料申请单ID 
	*/
	public M setApplyMaterialsBillsId(java.lang.Integer applyMaterialsBillsId) {
		set("apply_materials_bills_id", applyMaterialsBillsId);
		return (M)this;
	}

	/**
	*获取部门材料申请单ID 
	*/
	public java.lang.Integer getApplyMaterialsBillsId() {
		return getInt("apply_materials_bills_id");
	}

	/**
	*设置校区材料ID 
	*/
	public M setMaterialsInfoId(java.lang.Integer materialsInfoId) {
		set("materials_info_id", materialsInfoId);
		return (M)this;
	}

	/**
	*获取校区材料ID 
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

	/**
	*设置材料名字 
	*/
	public M setInfoNames(java.lang.String infoNames) {
		set("info_names", infoNames);
		return (M)this;
	}

	/**
	*获取材料名字 
	*/
	public java.lang.String getInfoNames() {
		return getStr("info_names");
	}

	/**
	*设置到货数量 
	*/
	public M setArrivalCount(java.lang.String arrivalCount) {
		set("arrival_count", arrivalCount);
		return (M)this;
	}

	/**
	*获取到货数量 
	*/
	public java.lang.String getArrivalCount() {
		return getStr("arrival_count");
	}

	/**
	*设置材料总价 
	*/
	public M setSumPrice(java.lang.Double sumPrice) {
		set("sumPrice", sumPrice);
		return (M)this;
	}

	/**
	*获取材料总价 
	*/
	public java.lang.Double getSumPrice() {
		return getDouble("sumPrice");
	}

}
