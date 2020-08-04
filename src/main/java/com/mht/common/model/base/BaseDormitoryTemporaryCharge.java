package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_temporary_charge:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryTemporaryCharge<M extends BaseDormitoryTemporaryCharge<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setChargeId(java.lang.Integer chargeId) {
		set("charge_id", chargeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getChargeId() {
		return getInt("charge_id");
	}

	/**
	*设置临客信息id 
	*/
	public M setTemporaryId(java.lang.Integer temporaryId) {
		set("temporary_id", temporaryId);
		return (M)this;
	}

	/**
	*获取临客信息id 
	*/
	public java.lang.Integer getTemporaryId() {
		return getInt("temporary_id");
	}

	/**
	*设置缴费类型 
	*/
	public M setChargeType(java.lang.Integer chargeType) {
		set("charge_type", chargeType);
		return (M)this;
	}

	/**
	*获取缴费类型 
	*/
	public java.lang.Integer getChargeType() {
		return getInt("charge_type");
	}

	/**
	*设置应收金额 
	*/
	public M setChargeAmount(java.lang.Integer chargeAmount) {
		set("charge_amount", chargeAmount);
		return (M)this;
	}

	/**
	*获取应收金额 
	*/
	public java.lang.Integer getChargeAmount() {
		return getInt("charge_amount");
	}

	/**
	*设置实收金额 
	*/
	public M setChargeReceived(java.lang.Integer chargeReceived) {
		set("charge_received", chargeReceived);
		return (M)this;
	}

	/**
	*获取实收金额 
	*/
	public java.lang.Integer getChargeReceived() {
		return getInt("charge_received");
	}

	/**
	*设置收费标准 
	*/
	public M setChargeStandard(java.lang.Integer chargeStandard) {
		set("charge_standard", chargeStandard);
		return (M)this;
	}

	/**
	*获取收费标准 
	*/
	public java.lang.Integer getChargeStandard() {
		return getInt("charge_standard");
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
	*设置创建日期 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

}
