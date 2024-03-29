package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_purchase_price_manege:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsPurchasePriceManege<M extends BaseMaterialsPurchasePriceManege<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPurchasePriceManegeId(java.lang.Integer purchasePriceManegeId) {
		set("purchase_price_manege_id", purchasePriceManegeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPurchasePriceManegeId() {
		return getInt("purchase_price_manege_id");
	}

	/**
	*设置金额 
	*/
	public M setPrice(java.lang.String price) {
		set("price", price);
		return (M)this;
	}

	/**
	*获取金额 
	*/
	public java.lang.String getPrice() {
		return getStr("price");
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
