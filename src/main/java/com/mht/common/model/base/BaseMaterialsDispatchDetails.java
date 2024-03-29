package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_dispatch_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsDispatchDetails<M extends BaseMaterialsDispatchDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDispatchDetailsId(java.lang.Integer dispatchDetailsId) {
		set("dispatch_details_id", dispatchDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDispatchDetailsId() {
		return getInt("dispatch_details_id");
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
	*设置名称 
	*/
	public M setDispatchDetailsName(java.lang.String dispatchDetailsName) {
		set("dispatch_details_name", dispatchDetailsName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getDispatchDetailsName() {
		return getStr("dispatch_details_name");
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
	*设置调度单ID 
	*/
	public M setDispatchBillsId(java.lang.Integer dispatchBillsId) {
		set("dispatch_bills_id", dispatchBillsId);
		return (M)this;
	}

	/**
	*获取调度单ID 
	*/
	public java.lang.Integer getDispatchBillsId() {
		return getInt("dispatch_bills_id");
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
