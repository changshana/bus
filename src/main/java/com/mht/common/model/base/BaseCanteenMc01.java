package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_mc01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenMc01<M extends BaseCanteenMc01<M>> extends Model<M> implements IBean {

	/**
	*设置采购订单id 
	*/
	public M setMcc010(java.lang.Integer mcc010) {
		set("mcc010", mcc010);
		return (M)this;
	}

	/**
	*获取采购订单id 
	*/
	public java.lang.Integer getMcc010() {
		return getInt("mcc010");
	}

	/**
	*设置订单code 
	*/
	public M setCode(java.lang.String code) {
		set("code", code);
		return (M)this;
	}

	/**
	*获取订单code 
	*/
	public java.lang.String getCode() {
		return getStr("code");
	}

	/**
	*设置第三方创建订单时传参的erpCode 
	*/
	public M setErpCode(java.lang.String erpCode) {
		set("erpCode", erpCode);
		return (M)this;
	}

	/**
	*获取第三方创建订单时传参的erpCode 
	*/
	public java.lang.String getErpCode() {
		return getStr("erpCode");
	}

	/**
	*设置租户ID 
	*/
	public M setTenantId(java.lang.String tenantId) {
		set("tenantId", tenantId);
		return (M)this;
	}

	/**
	*获取租户ID 
	*/
	public java.lang.String getTenantId() {
		return getStr("tenantId");
	}

	/**
	*设置门店ID 
	*/
	public M setBranchId(java.lang.String branchId) {
		set("branchId", branchId);
		return (M)this;
	}

	/**
	*获取门店ID 
	*/
	public java.lang.String getBranchId() {
		return getStr("branchId");
	}

	/**
	*设置门店名称 
	*/
	public M setBranchName(java.lang.String branchName) {
		set("branchName", branchName);
		return (M)this;
	}

	/**
	*获取门店名称 
	*/
	public java.lang.String getBranchName() {
		return getStr("branchName");
	}

	/**
	*设置供应商ID 
	*/
	public M setSupplierId(java.lang.String supplierId) {
		set("supplierId", supplierId);
		return (M)this;
	}

	/**
	*获取供应商ID 
	*/
	public java.lang.String getSupplierId() {
		return getStr("supplierId");
	}

	/**
	*设置供应商名称 
	*/
	public M setSupplierName(java.lang.String supplierName) {
		set("supplierName", supplierName);
		return (M)this;
	}

	/**
	*获取供应商名称 
	*/
	public java.lang.String getSupplierName() {
		return getStr("supplierName");
	}

	/**
	*设置订单状态 
	*/
	public M setStatusId(java.lang.String statusId) {
		set("statusId", statusId);
		return (M)this;
	}

	/**
	*获取订单状态 
	*/
	public java.lang.String getStatusId() {
		return getStr("statusId");
	}

	/**
	*设置订单状态说明 
	*/
	public M setStatusText(java.lang.String statusText) {
		set("statusText", statusText);
		return (M)this;
	}

	/**
	*获取订单状态说明 
	*/
	public java.lang.String getStatusText() {
		return getStr("statusText");
	}

	/**
	*设置小计 
	*/
	public M setAmount(java.lang.String amount) {
		set("amount", amount);
		return (M)this;
	}

	/**
	*获取小计 
	*/
	public java.lang.String getAmount() {
		return getStr("amount");
	}

	/**
	*设置订单创建时间 
	*/
	public M setCreatedDate(java.lang.String createdDate) {
		set("createdDate", createdDate);
		return (M)this;
	}

	/**
	*获取订单创建时间 
	*/
	public java.lang.String getCreatedDate() {
		return getStr("createdDate");
	}

	/**
	*设置修改人ID 
	*/
	public M setModifierId(java.lang.String modifierId) {
		set("modifierId", modifierId);
		return (M)this;
	}

	/**
	*获取修改人ID 
	*/
	public java.lang.String getModifierId() {
		return getStr("modifierId");
	}

	/**
	*设置修改人名称 
	*/
	public M setModifierName(java.lang.String modifierName) {
		set("modifierName", modifierName);
		return (M)this;
	}

	/**
	*获取修改人名称 
	*/
	public java.lang.String getModifierName() {
		return getStr("modifierName");
	}

	/**
	*设置修改人员ID 
	*/
	public M setModifiedEmployeeId(java.lang.String modifiedEmployeeId) {
		set("modifiedEmployeeId", modifiedEmployeeId);
		return (M)this;
	}

	/**
	*获取修改人员ID 
	*/
	public java.lang.String getModifiedEmployeeId() {
		return getStr("modifiedEmployeeId");
	}

	/**
	*设置修改人员名称 
	*/
	public M setModifiedEmployeeName(java.lang.String modifiedEmployeeName) {
		set("modifiedEmployeeName", modifiedEmployeeName);
		return (M)this;
	}

	/**
	*获取修改人员名称 
	*/
	public java.lang.String getModifiedEmployeeName() {
		return getStr("modifiedEmployeeName");
	}

	/**
	*设置租户erpcode 
	*/
	public M setTenantErpCode(java.lang.String tenantErpCode) {
		set("tenantErpCode", tenantErpCode);
		return (M)this;
	}

	/**
	*获取租户erpcode 
	*/
	public java.lang.String getTenantErpCode() {
		return getStr("tenantErpCode");
	}

	/**
	*设置供应商erpcode 
	*/
	public M setSupplierErpCode(java.lang.String supplierErpCode) {
		set("supplierErpCode", supplierErpCode);
		return (M)this;
	}

	/**
	*获取供应商erpcode 
	*/
	public java.lang.String getSupplierErpCode() {
		return getStr("supplierErpCode");
	}

	/**
	*设置门店erpcode 
	*/
	public M setBranchErpCode(java.lang.String branchErpCode) {
		set("branchErpCode", branchErpCode);
		return (M)this;
	}

	/**
	*获取门店erpcode 
	*/
	public java.lang.String getBranchErpCode() {
		return getStr("branchErpCode");
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
	*设置餐链系统采购订单主键id 
	*/
	public M setPurchaseId(java.lang.Long purchaseId) {
		set("purchaseId", purchaseId);
		return (M)this;
	}

	/**
	*获取餐链系统采购订单主键id 
	*/
	public java.lang.Long getPurchaseId() {
		return getLong("purchaseId");
	}

	/**
	*设置设置送货时间 
	*/
	public M setDeliveryTime(java.lang.String deliveryTime) {
		set("deliveryTime", deliveryTime);
		return (M)this;
	}

	/**
	*获取设置送货时间 
	*/
	public java.lang.String getDeliveryTime() {
		return getStr("deliveryTime");
	}

}
