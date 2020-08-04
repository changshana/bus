package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_mc06:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenMc06<M extends BaseCanteenMc06<M>> extends Model<M> implements IBean {

	/**
	*设置收货单明细id 
	*/
	public M setMcc060(java.lang.Integer mcc060) {
		set("mcc060", mcc060);
		return (M)this;
	}

	/**
	*获取收货单明细id 
	*/
	public java.lang.Integer getMcc060() {
		return getInt("mcc060");
	}

	/**
	*设置收货单ID 
	*/
	public M setMcc050(java.lang.Integer mcc050) {
		set("mcc050", mcc050);
		return (M)this;
	}

	/**
	*获取收货单ID 
	*/
	public java.lang.Integer getMcc050() {
		return getInt("mcc050");
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
	public M setAaa030(java.lang.String aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取物料id 
	*/
	public java.lang.String getAaa030() {
		return getStr("aaa030");
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
	*设置收货明细状态ID（1:完成收货,2:缺货） 
	*/
	public M setStatusId(java.lang.String statusId) {
		set("statusId", statusId);
		return (M)this;
	}

	/**
	*获取收货明细状态ID（1:完成收货,2:缺货） 
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
	*设置收货图片 
	*/
	public M setImg(java.lang.String img) {
		set("img", img);
		return (M)this;
	}

	/**
	*获取收货图片 
	*/
	public java.lang.String getImg() {
		return getStr("img");
	}

	/**
	*设置采购单详情id 
	*/
	public M setAca020(java.lang.String aca020) {
		set("aca020", aca020);
		return (M)this;
	}

	/**
	*获取采购单详情id 
	*/
	public java.lang.String getAca020() {
		return getStr("aca020");
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
	*设置生产日期 
	*/
	public M setAba021(java.util.Date aba021) {
		set("aba021", aba021);
		return (M)this;
	}

	/**
	*获取生产日期 
	*/
	public java.util.Date getAba021() {
		return get("aba021");
	}

	/**
	*设置保质日期 
	*/
	public M setAba033(java.util.Date aba033) {
		set("aba033", aba033);
		return (M)this;
	}

	/**
	*获取保质日期 
	*/
	public java.util.Date getAba033() {
		return get("aba033");
	}

}
