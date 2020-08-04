package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_bills_extend:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairBillsExtend<M extends BaseRepairBillsExtend<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setBillsExtendId(java.lang.Integer billsExtendId) {
		set("bills_extend_id", billsExtendId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getBillsExtendId() {
		return getInt("bills_extend_id");
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
	public M setProcessingTime(java.util.Date processingTime) {
		set("processing_time", processingTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getProcessingTime() {
		return get("processing_time");
	}

	/**
	*设置 
	*/
	public M setMaterialsPrepareTime(java.util.Date materialsPrepareTime) {
		set("materials_prepare_time", materialsPrepareTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getMaterialsPrepareTime() {
		return get("materials_prepare_time");
	}

	/**
	*设置 
	*/
	public M setRepairDatetime(java.util.Date repairDatetime) {
		set("repair_datetime", repairDatetime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getRepairDatetime() {
		return get("repair_datetime");
	}

	/**
	*设置 
	*/
	public M setHangUpTime(java.util.Date hangUpTime) {
		set("hang_up_time", hangUpTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getHangUpTime() {
		return get("hang_up_time");
	}

	/**
	*设置 
	*/
	public M setHangUpRemark(java.lang.String hangUpRemark) {
		set("hang_up_remark", hangUpRemark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getHangUpRemark() {
		return getStr("hang_up_remark");
	}

	/**
	*设置 
	*/
	public M setHangUpPersonName(java.lang.String hangUpPersonName) {
		set("hang_up_person_name", hangUpPersonName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getHangUpPersonName() {
		return getStr("hang_up_person_name");
	}

}
