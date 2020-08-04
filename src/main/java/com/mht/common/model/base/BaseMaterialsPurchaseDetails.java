package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_purchase_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsPurchaseDetails<M extends BaseMaterialsPurchaseDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPurchaseDetailsId(java.lang.Integer purchaseDetailsId) {
		set("purchase_details_id", purchaseDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPurchaseDetailsId() {
		return getInt("purchase_details_id");
	}

	/**
	*设置名称 
	*/
	public M setPurchaseDetailsName(java.lang.String purchaseDetailsName) {
		set("purchase_details_name", purchaseDetailsName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getPurchaseDetailsName() {
		return getStr("purchase_details_name");
	}

	/**
	*设置材料ID 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取材料ID 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
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
	*设置材料采购单ID 
	*/
	public M setPurchaseBillsId(java.lang.Integer purchaseBillsId) {
		set("purchase_bills_id", purchaseBillsId);
		return (M)this;
	}

	/**
	*获取材料采购单ID 
	*/
	public java.lang.Integer getPurchaseBillsId() {
		return getInt("purchase_bills_id");
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
	*设置结账状态 
	*/
	public M setAccountStatus(java.lang.Integer accountStatus) {
		set("account_status", accountStatus);
		return (M)this;
	}

	/**
	*获取结账状态 
	*/
	public java.lang.Integer getAccountStatus() {
		return getInt("account_status");
	}

}
