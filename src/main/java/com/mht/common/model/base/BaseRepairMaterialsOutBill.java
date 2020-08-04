package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_out_bill:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsOutBill<M extends BaseRepairMaterialsOutBill<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRmobId(java.lang.Integer rmobId) {
		set("rmob_id", rmobId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRmobId() {
		return getInt("rmob_id");
	}

	/**
	*设置名称 
	*/
	public M setRmobName(java.lang.String rmobName) {
		set("rmob_name", rmobName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getRmobName() {
		return getStr("rmob_name");
	}

	/**
	*设置代码 
	*/
	public M setBillCode(java.lang.String billCode) {
		set("bill_code", billCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getBillCode() {
		return getStr("bill_code");
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
	*设置校区ID 
	*/
	public M setZoneId(java.lang.Integer zoneId) {
		set("zone_id", zoneId);
		return (M)this;
	}

	/**
	*获取校区ID 
	*/
	public java.lang.Integer getZoneId() {
		return getInt("zone_id");
	}

}
