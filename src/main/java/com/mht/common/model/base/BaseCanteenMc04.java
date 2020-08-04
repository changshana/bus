package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_mc04:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenMc04<M extends BaseCanteenMc04<M>> extends Model<M> implements IBean {

	/**
	*设置收货单明细id 
	*/
	public M setMcc040(java.lang.Integer mcc040) {
		set("mcc040", mcc040);
		return (M)this;
	}

	/**
	*获取收货单明细id 
	*/
	public java.lang.Integer getMcc040() {
		return getInt("mcc040");
	}

	/**
	*设置收货单ID 
	*/
	public M setMcc030(java.lang.Integer mcc030) {
		set("mcc030", mcc030);
		return (M)this;
	}

	/**
	*获取收货单ID 
	*/
	public java.lang.Integer getMcc030() {
		return getInt("mcc030");
	}

	/**
	*设置档口id 
	*/
	public M setDepartmentId(java.lang.String departmentId) {
		set("departmentId", departmentId);
		return (M)this;
	}

	/**
	*获取档口id 
	*/
	public java.lang.String getDepartmentId() {
		return getStr("departmentId");
	}

	/**
	*设置档口名称 
	*/
	public M setDepartmentName(java.lang.String departmentName) {
		set("departmentName", departmentName);
		return (M)this;
	}

	/**
	*获取档口名称 
	*/
	public java.lang.String getDepartmentName() {
		return getStr("departmentName");
	}

	/**
	*设置收货人id 
	*/
	public M setReceiverId(java.lang.String receiverId) {
		set("receiverId", receiverId);
		return (M)this;
	}

	/**
	*获取收货人id 
	*/
	public java.lang.String getReceiverId() {
		return getStr("receiverId");
	}

	/**
	*设置收货人名称 
	*/
	public M setReceiverName(java.lang.String receiverName) {
		set("receiverName", receiverName);
		return (M)this;
	}

	/**
	*获取收货人名称 
	*/
	public java.lang.String getReceiverName() {
		return getStr("receiverName");
	}

	/**
	*设置物料id 
	*/
	public M setMaterialId(java.lang.String materialId) {
		set("materialId", materialId);
		return (M)this;
	}

	/**
	*获取物料id 
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
	*设置收货单位id 
	*/
	public M setUnitId(java.lang.String unitId) {
		set("unitId", unitId);
		return (M)this;
	}

	/**
	*获取收货单位id 
	*/
	public java.lang.String getUnitId() {
		return getStr("unitId");
	}

	/**
	*设置收货单位名称 
	*/
	public M setUnitName(java.lang.String unitName) {
		set("unitName", unitName);
		return (M)this;
	}

	/**
	*获取收货单位名称 
	*/
	public java.lang.String getUnitName() {
		return getStr("unitName");
	}

	/**
	*设置收货数量 
	*/
	public M setQuantity(java.lang.String quantity) {
		set("quantity", quantity);
		return (M)this;
	}

	/**
	*获取收货数量 
	*/
	public java.lang.String getQuantity() {
		return getStr("quantity");
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
	*设置计量单位ID（库存） 
	*/
	public M setUnitIdOfInventory(java.lang.String unitIdOfInventory) {
		set("unitIdOfInventory", unitIdOfInventory);
		return (M)this;
	}

	/**
	*获取计量单位ID（库存） 
	*/
	public java.lang.String getUnitIdOfInventory() {
		return getStr("unitIdOfInventory");
	}

	/**
	*设置计量单位名称（库存） 
	*/
	public M setUnitNameOfInventory(java.lang.String unitNameOfInventory) {
		set("unitNameOfInventory", unitNameOfInventory);
		return (M)this;
	}

	/**
	*获取计量单位名称（库存） 
	*/
	public java.lang.String getUnitNameOfInventory() {
		return getStr("unitNameOfInventory");
	}

	/**
	*设置数量（库存） 
	*/
	public M setQuantityOfInventory(java.lang.String quantityOfInventory) {
		set("quantityOfInventory", quantityOfInventory);
		return (M)this;
	}

	/**
	*获取数量（库存） 
	*/
	public java.lang.String getQuantityOfInventory() {
		return getStr("quantityOfInventory");
	}

	/**
	*设置计量单位ID（订单） 
	*/
	public M setUnitIdOfOrder(java.lang.String unitIdOfOrder) {
		set("unitIdOfOrder", unitIdOfOrder);
		return (M)this;
	}

	/**
	*获取计量单位ID（订单） 
	*/
	public java.lang.String getUnitIdOfOrder() {
		return getStr("unitIdOfOrder");
	}

	/**
	*设置计量单位名称（订单） 
	*/
	public M setUnitNameOfOrder(java.lang.String unitNameOfOrder) {
		set("unitNameOfOrder", unitNameOfOrder);
		return (M)this;
	}

	/**
	*获取计量单位名称（订单） 
	*/
	public java.lang.String getUnitNameOfOrder() {
		return getStr("unitNameOfOrder");
	}

	/**
	*设置数量（订单） 
	*/
	public M setQuantityOfOrder(java.lang.String quantityOfOrder) {
		set("quantityOfOrder", quantityOfOrder);
		return (M)this;
	}

	/**
	*获取数量（订单） 
	*/
	public java.lang.String getQuantityOfOrder() {
		return getStr("quantityOfOrder");
	}

	/**
	*设置收货日期 
	*/
	public M setReceiptedDate(java.lang.String receiptedDate) {
		set("receiptedDate", receiptedDate);
		return (M)this;
	}

	/**
	*获取收货日期 
	*/
	public java.lang.String getReceiptedDate() {
		return getStr("receiptedDate");
	}

	/**
	*设置明细状态ID 
	*/
	public M setStatusId(java.lang.String statusId) {
		set("statusId", statusId);
		return (M)this;
	}

	/**
	*获取明细状态ID 
	*/
	public java.lang.String getStatusId() {
		return getStr("statusId");
	}

	/**
	*设置状态名称 
	*/
	public M setStatusText(java.lang.String statusText) {
		set("statusText", statusText);
		return (M)this;
	}

	/**
	*获取状态名称 
	*/
	public java.lang.String getStatusText() {
		return getStr("statusText");
	}

	/**
	*设置备注 
	*/
	public M setNote(java.lang.String note) {
		set("note", note);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getNote() {
		return getStr("note");
	}

	/**
	*设置#档口erpcode 
	*/
	public M setDepartmentErpCode(java.lang.String departmentErpCode) {
		set("departmentErpCode", departmentErpCode);
		return (M)this;
	}

	/**
	*获取#档口erpcode 
	*/
	public java.lang.String getDepartmentErpCode() {
		return getStr("departmentErpCode");
	}

	/**
	*设置物料erpcode 
	*/
	public M setMaterialErpCode(java.lang.String materialErpCode) {
		set("materialErpCode", materialErpCode);
		return (M)this;
	}

	/**
	*获取物料erpcode 
	*/
	public java.lang.String getMaterialErpCode() {
		return getStr("materialErpCode");
	}

	/**
	*设置采购单明细单erpcode 
	*/
	public M setOrderDetailErpCode(java.lang.String orderDetailErpCode) {
		set("orderDetailErpCode", orderDetailErpCode);
		return (M)this;
	}

	/**
	*获取采购单明细单erpcode 
	*/
	public java.lang.String getOrderDetailErpCode() {
		return getStr("orderDetailErpCode");
	}

	/**
	*设置采购单明细单Id 
	*/
	public M setOrderDetailId(java.lang.String orderDetailId) {
		set("orderDetailId", orderDetailId);
		return (M)this;
	}

	/**
	*获取采购单明细单Id 
	*/
	public java.lang.String getOrderDetailId() {
		return getStr("orderDetailId");
	}

	/**
	*设置收货图片数量 
	*/
	public M setImgCount(java.lang.String imgCount) {
		set("imgCount", imgCount);
		return (M)this;
	}

	/**
	*获取收货图片数量 
	*/
	public java.lang.String getImgCount() {
		return getStr("imgCount");
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

}
