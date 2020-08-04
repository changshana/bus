package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_temporary_out_room:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryTemporaryOutRoom<M extends BaseDormitoryTemporaryOutRoom<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setOutId(java.lang.Integer outId) {
		set("out_id", outId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getOutId() {
		return getInt("out_id");
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
	*设置临客退宿类型 
	*/
	public M setCheckoutType(java.lang.Integer checkoutType) {
		set("checkOut_type", checkoutType);
		return (M)this;
	}

	/**
	*获取临客退宿类型 
	*/
	public java.lang.Integer getCheckoutType() {
		return getInt("checkOut_type");
	}

	/**
	*设置退宿日期 
	*/
	public M setCheckoutDate(java.util.Date checkoutDate) {
		set("checkOut_date", checkoutDate);
		return (M)this;
	}

	/**
	*获取退宿日期 
	*/
	public java.util.Date getCheckoutDate() {
		return get("checkOut_date");
	}

	/**
	*设置押金（退还） 
	*/
	public M setDepositReturned(java.lang.Integer depositReturned) {
		set("deposit_returned", depositReturned);
		return (M)this;
	}

	/**
	*获取押金（退还） 
	*/
	public java.lang.Integer getDepositReturned() {
		return getInt("deposit_returned");
	}

	/**
	*设置租金（补交/退还） 
	*/
	public M setRentReturned(java.lang.Integer rentReturned) {
		set("rent_returned", rentReturned);
		return (M)this;
	}

	/**
	*获取租金（补交/退还） 
	*/
	public java.lang.Integer getRentReturned() {
		return getInt("rent_returned");
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
