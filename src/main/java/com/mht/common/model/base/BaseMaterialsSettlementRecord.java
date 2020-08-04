package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_settlement_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsSettlementRecord<M extends BaseMaterialsSettlementRecord<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSettlementRecordId(java.lang.Integer settlementRecordId) {
		set("settlement_record_id", settlementRecordId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSettlementRecordId() {
		return getInt("settlement_record_id");
	}

	/**
	*设置材料ID 
	*/
	public M setMaterialsId(java.lang.Integer materialsId) {
		set("materials_id", materialsId);
		return (M)this;
	}

	/**
	*获取材料ID 
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
	*设置单价 
	*/
	public M setPrice(java.lang.String price) {
		set("price", price);
		return (M)this;
	}

	/**
	*获取单价 
	*/
	public java.lang.String getPrice() {
		return getStr("price");
	}

	/**
	*设置总价 
	*/
	public M setSumPrice(java.lang.String sumPrice) {
		set("sum_price", sumPrice);
		return (M)this;
	}

	/**
	*获取总价 
	*/
	public java.lang.String getSumPrice() {
		return getStr("sum_price");
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
	*设置 
	*/
	public M setMaterialsManufacturersId(java.lang.Integer materialsManufacturersId) {
		set("materials_manufacturers_id", materialsManufacturersId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getMaterialsManufacturersId() {
		return getInt("materials_manufacturers_id");
	}

	/**
	*设置 
	*/
	public M setPurchaseDetailsId(java.lang.Integer purchaseDetailsId) {
		set("purchase_details_id", purchaseDetailsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getPurchaseDetailsId() {
		return getInt("purchase_details_id");
	}

}
