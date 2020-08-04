package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_standard:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryStandard<M extends BaseDormitoryStandard<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setStandardId(java.lang.Integer standardId) {
		set("standard_id", standardId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getStandardId() {
		return getInt("standard_id");
	}

	/**
	*设置收费标准 
	*/
	public M setChargeStandard(java.lang.String chargeStandard) {
		set("charge_standard", chargeStandard);
		return (M)this;
	}

	/**
	*获取收费标准 
	*/
	public java.lang.String getChargeStandard() {
		return getStr("charge_standard");
	}

	/**
	*设置收费金额 
	*/
	public M setChargeMoney(java.lang.String chargeMoney) {
		set("charge_money", chargeMoney);
		return (M)this;
	}

	/**
	*获取收费金额 
	*/
	public java.lang.String getChargeMoney() {
		return getStr("charge_money");
	}

	/**
	*设置住宿标准适用对象 
	*/
	public M setStandardType(java.lang.Integer standardType) {
		set("standard_type", standardType);
		return (M)this;
	}

	/**
	*获取住宿标准适用对象 
	*/
	public java.lang.Integer getStandardType() {
		return getInt("standard_type");
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

}
