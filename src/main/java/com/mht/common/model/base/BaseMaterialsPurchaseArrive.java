package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_purchase_arrive:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsPurchaseArrive<M extends BaseMaterialsPurchaseArrive<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPurchaseArriveId(java.lang.Integer purchaseArriveId) {
		set("purchase_arrive_id", purchaseArriveId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPurchaseArriveId() {
		return getInt("purchase_arrive_id");
	}

	/**
	*设置详情ID 
	*/
	public M setPurchaseDetailsId(java.lang.Integer purchaseDetailsId) {
		set("purchase_details_id", purchaseDetailsId);
		return (M)this;
	}

	/**
	*获取详情ID 
	*/
	public java.lang.Integer getPurchaseDetailsId() {
		return getInt("purchase_details_id");
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

}
