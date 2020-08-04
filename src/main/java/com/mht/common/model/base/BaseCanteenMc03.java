package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_mc03:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenMc03<M extends BaseCanteenMc03<M>> extends Model<M> implements IBean {

	/**
	*设置收货单id 
	*/
	public M setMcc030(java.lang.Integer mcc030) {
		set("mcc030", mcc030);
		return (M)this;
	}

	/**
	*获取收货单id 
	*/
	public java.lang.Integer getMcc030() {
		return getInt("mcc030");
	}

	/**
	*设置租户id 
	*/
	public M setTenantId(java.lang.String tenantId) {
		set("tenantId", tenantId);
		return (M)this;
	}

	/**
	*获取租户id 
	*/
	public java.lang.String getTenantId() {
		return getStr("tenantId");
	}

	/**
	*设置门店id 
	*/
	public M setBranchId(java.lang.String branchId) {
		set("branchId", branchId);
		return (M)this;
	}

	/**
	*获取门店id 
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
	*设置供应商id 
	*/
	public M setSupplierId(java.lang.String supplierId) {
		set("supplierId", supplierId);
		return (M)this;
	}

	/**
	*获取供应商id 
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
	*设置发送人 
	*/
	public M setSender(java.lang.String sender) {
		set("sender", sender);
		return (M)this;
	}

	/**
	*获取发送人 
	*/
	public java.lang.String getSender() {
		return getStr("sender");
	}

	/**
	*设置状态id 
	*/
	public M setStatusId(java.lang.String statusId) {
		set("statusId", statusId);
		return (M)this;
	}

	/**
	*获取状态id 
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
	*设置总计 
	*/
	public M setAmount(java.lang.String amount) {
		set("amount", amount);
		return (M)this;
	}

	/**
	*获取总计 
	*/
	public java.lang.String getAmount() {
		return getStr("amount");
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
	*设置收货时间 
	*/
	public M setReceiverDate(java.lang.String receiverDate) {
		set("receiverDate", receiverDate);
		return (M)this;
	}

	/**
	*获取收货时间 
	*/
	public java.lang.String getReceiverDate() {
		return getStr("receiverDate");
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
	*设置餐链系统收货订单主键id 
	*/
	public M setDocumentId(java.lang.String documentId) {
		set("documentId", documentId);
		return (M)this;
	}

	/**
	*获取餐链系统收货订单主键id 
	*/
	public java.lang.String getDocumentId() {
		return getStr("documentId");
	}

}
