package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_payinfo:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusPayinfo<M extends BaseBusPayinfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPayinfoId(java.lang.Integer payinfoId) {
		set("payInfo_id", payinfoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPayinfoId() {
		return getInt("payInfo_id");
	}

	/**
	*设置商户订单号 
	*/
	public M setOutTradeNo(java.lang.String outTradeNo) {
		set("out_trade_no", outTradeNo);
		return (M)this;
	}

	/**
	*获取商户订单号 
	*/
	public java.lang.String getOutTradeNo() {
		return getStr("out_trade_no");
	}

	/**
	*设置微信openid 
	*/
	public M setOpenid(java.lang.String openid) {
		set("openid", openid);
		return (M)this;
	}

	/**
	*获取微信openid 
	*/
	public java.lang.String getOpenid() {
		return getStr("openid");
	}

	/**
	*设置微信支付单号 
	*/
	public M setTransactionId(java.lang.String transactionId) {
		set("transaction_id", transactionId);
		return (M)this;
	}

	/**
	*获取微信支付单号 
	*/
	public java.lang.String getTransactionId() {
		return getStr("transaction_id");
	}

	/**
	*设置单价 
	*/
	public M setPrice(java.lang.Integer price) {
		set("price", price);
		return (M)this;
	}

	/**
	*获取单价 
	*/
	public java.lang.Integer getPrice() {
		return getInt("price");
	}

	/**
	*设置支付金额 
	*/
	public M setFee(java.lang.Integer fee) {
		set("fee", fee);
		return (M)this;
	}

	/**
	*获取支付金额 
	*/
	public java.lang.Integer getFee() {
		return getInt("fee");
	}

	/**
	*设置支付币种 
	*/
	public M setFeeType(java.lang.String feeType) {
		set("fee_type", feeType);
		return (M)this;
	}

	/**
	*获取支付币种 
	*/
	public java.lang.String getFeeType() {
		return getStr("fee_type");
	}

	/**
	*设置下单时间 
	*/
	public M setTimeStart(java.util.Date timeStart) {
		set("time_start", timeStart);
		return (M)this;
	}

	/**
	*获取下单时间 
	*/
	public java.util.Date getTimeStart() {
		return get("time_start");
	}

	/**
	*设置支付结束时间 
	*/
	public M setTimeEnd(java.util.Date timeEnd) {
		set("time_end", timeEnd);
		return (M)this;
	}

	/**
	*获取支付结束时间 
	*/
	public java.util.Date getTimeEnd() {
		return get("time_end");
	}

	/**
	*设置支付状态 
	*/
	public M setPayState(java.lang.Integer payState) {
		set("pay_state", payState);
		return (M)this;
	}

	/**
	*获取支付状态 
	*/
	public java.lang.Integer getPayState() {
		return getInt("pay_state");
	}

	/**
	*设置退款单号 
	*/
	public M setOutRefundNo(java.lang.String outRefundNo) {
		set("out_refund_no", outRefundNo);
		return (M)this;
	}

	/**
	*获取退款单号 
	*/
	public java.lang.String getOutRefundNo() {
		return getStr("out_refund_no");
	}

	/**
	*设置退款金额 
	*/
	public M setRefundFee(java.lang.Integer refundFee) {
		set("refund_fee", refundFee);
		return (M)this;
	}

	/**
	*获取退款金额 
	*/
	public java.lang.Integer getRefundFee() {
		return getInt("refund_fee");
	}

	/**
	*设置退款币种 
	*/
	public M setRefundFeeType(java.lang.String refundFeeType) {
		set("refund_fee_type", refundFeeType);
		return (M)this;
	}

	/**
	*获取退款币种 
	*/
	public java.lang.String getRefundFeeType() {
		return getStr("refund_fee_type");
	}

	/**
	*设置数据状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取数据状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
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
