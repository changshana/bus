package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_mc02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenMc02<M extends BaseCanteenMc02<M>> extends Model<M> implements IBean {

	/**
	*设置采购明细单id 
	*/
	public M setMcc020(java.lang.Integer mcc020) {
		set("mcc020", mcc020);
		return (M)this;
	}

	/**
	*获取采购明细单id 
	*/
	public java.lang.Integer getMcc020() {
		return getInt("mcc020");
	}

	/**
	*设置餐链系统采购订单ID 
	*/
	public M setDocumentId(java.lang.String documentId) {
		set("documentId", documentId);
		return (M)this;
	}

	/**
	*获取餐链系统采购订单ID 
	*/
	public java.lang.String getDocumentId() {
		return getStr("documentId");
	}

	/**
	*设置部门ID 
	*/
	public M setDepartmentId(java.lang.String departmentId) {
		set("departmentId", departmentId);
		return (M)this;
	}

	/**
	*获取部门ID 
	*/
	public java.lang.String getDepartmentId() {
		return getStr("departmentId");
	}

	/**
	*设置部门名称 
	*/
	public M setDepartmentName(java.lang.String departmentName) {
		set("departmentName", departmentName);
		return (M)this;
	}

	/**
	*获取部门名称 
	*/
	public java.lang.String getDepartmentName() {
		return getStr("departmentName");
	}

	/**
	*设置物料ID 
	*/
	public M setMaterialId(java.lang.String materialId) {
		set("materialId", materialId);
		return (M)this;
	}

	/**
	*获取物料ID 
	*/
	public java.lang.String getMaterialId() {
		return getStr("materialId");
	}

	/**
	*设置物料名称 
	*/
	public M setMaterialName(java.lang.String materialName) {
		set("materialName", materialName);
		return (M)this;
	}

	/**
	*获取物料名称 
	*/
	public java.lang.String getMaterialName() {
		return getStr("materialName");
	}

	/**
	*设置采购单位ID 
	*/
	public M setUnitId(java.lang.String unitId) {
		set("unitId", unitId);
		return (M)this;
	}

	/**
	*获取采购单位ID 
	*/
	public java.lang.String getUnitId() {
		return getStr("unitId");
	}

	/**
	*设置采购单位名称 
	*/
	public M setUnitName(java.lang.String unitName) {
		set("unitName", unitName);
		return (M)this;
	}

	/**
	*获取采购单位名称 
	*/
	public java.lang.String getUnitName() {
		return getStr("unitName");
	}

	/**
	*设置采购数量 (采购单位) 
	*/
	public M setPurchaseQuantity(java.lang.String purchaseQuantity) {
		set("purchaseQuantity", purchaseQuantity);
		return (M)this;
	}

	/**
	*获取采购数量 (采购单位) 
	*/
	public java.lang.String getPurchaseQuantity() {
		return getStr("purchaseQuantity");
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
	*设置收货单位id 
	*/
	public M setSecondUnitId(java.lang.String secondUnitId) {
		set("secondUnitId", secondUnitId);
		return (M)this;
	}

	/**
	*获取收货单位id 
	*/
	public java.lang.String getSecondUnitId() {
		return getStr("secondUnitId");
	}

	/**
	*设置收货单位名称 
	*/
	public M setSecondUnitName(java.lang.String secondUnitName) {
		set("secondUnitName", secondUnitName);
		return (M)this;
	}

	/**
	*获取收货单位名称 
	*/
	public java.lang.String getSecondUnitName() {
		return getStr("secondUnitName");
	}

	/**
	*设置采购数量按比例转换后的收货数量 
	*/
	public M setSecondQuantity(java.lang.String secondQuantity) {
		set("secondQuantity", secondQuantity);
		return (M)this;
	}

	/**
	*获取采购数量按比例转换后的收货数量 
	*/
	public java.lang.String getSecondQuantity() {
		return getStr("secondQuantity");
	}

	/**
	*设置已收货数量 
	*/
	public M setReceiptedQuantity(java.lang.String receiptedQuantity) {
		set("receiptedQuantity", receiptedQuantity);
		return (M)this;
	}

	/**
	*获取已收货数量 
	*/
	public java.lang.String getReceiptedQuantity() {
		return getStr("receiptedQuantity");
	}

	/**
	*设置金额小计 
	*/
	public M setAmount(java.lang.String amount) {
		set("amount", amount);
		return (M)this;
	}

	/**
	*获取金额小计 
	*/
	public java.lang.String getAmount() {
		return getStr("amount");
	}

	/**
	*设置部门erpcode 
	*/
	public M setDepartmentErpCode(java.lang.String departmentErpCode) {
		set("departmentErpCode", departmentErpCode);
		return (M)this;
	}

	/**
	*获取部门erpcode 
	*/
	public java.lang.String getDepartmentErpCode() {
		return getStr("departmentErpCode");
	}

	/**
	*设置商品erpcode 
	*/
	public M setMaterialErpCode(java.lang.String materialErpCode) {
		set("materialErpCode", materialErpCode);
		return (M)this;
	}

	/**
	*获取商品erpcode 
	*/
	public java.lang.String getMaterialErpCode() {
		return getStr("materialErpCode");
	}

	/**
	*设置状态 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getAaa996() {
		return getInt("aaa996");
	}

	/**
	*设置创建用户 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getAaa997() {
		return getStr("aaa997");
	}

	/**
	*设置创建时间 
	*/
	public M setAaa998(java.util.Date aaa998) {
		set("aaa998", aaa998);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getAaa998() {
		return get("aaa998");
	}

	/**
	*设置备注 
	*/
	public M setAaa999(java.lang.String aaa999) {
		set("aaa999", aaa999);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getAaa999() {
		return getStr("aaa999");
	}

	/**
	*设置业务系统采购订单id 
	*/
	public M setMcc010(java.lang.Integer mcc010) {
		set("mcc010", mcc010);
		return (M)this;
	}

	/**
	*获取业务系统采购订单id 
	*/
	public java.lang.Integer getMcc010() {
		return getInt("mcc010");
	}

	/**
	*设置餐链系统采购订单明细主键id 
	*/
	public M setOrderDetailId(java.lang.String orderDetailId) {
		set("orderDetailId", orderDetailId);
		return (M)this;
	}

	/**
	*获取餐链系统采购订单明细主键id 
	*/
	public java.lang.String getOrderDetailId() {
		return getStr("orderDetailId");
	}

	/**
	*设置设置订单详情erpcode(aca020)  
	*/
	public M setErpCode(java.lang.String erpCode) {
		set("erpCode", erpCode);
		return (M)this;
	}

	/**
	*获取设置订单详情erpcode(aca020)  
	*/
	public java.lang.String getErpCode() {
		return getStr("erpCode");
	}

}
