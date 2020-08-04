package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_returned_goods_details:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsReturnedGoodsDetails<M extends BaseMaterialsReturnedGoodsDetails<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setReturnedGoodsDetailsId(java.lang.Integer returnedGoodsDetailsId) {
		set("returned_goods_details_id", returnedGoodsDetailsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getReturnedGoodsDetailsId() {
		return getInt("returned_goods_details_id");
	}

	/**
	*设置退还表id 
	*/
	public M setReturnedGoodsBillsId(java.lang.Integer returnedGoodsBillsId) {
		set("returned_goods_bills_id", returnedGoodsBillsId);
		return (M)this;
	}

	/**
	*获取退还表id 
	*/
	public java.lang.Integer getReturnedGoodsBillsId() {
		return getInt("returned_goods_bills_id");
	}

	/**
	*设置校区材料ID 
	*/
	public M setMaterialsInfoId(java.lang.Integer materialsInfoId) {
		set("materials_info_id", materialsInfoId);
		return (M)this;
	}

	/**
	*获取校区材料ID 
	*/
	public java.lang.Integer getMaterialsInfoId() {
		return getInt("materials_info_id");
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
	*设置状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
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

	/**
	*设置厂商ID 
	*/
	public M setManufacturersId(java.lang.Integer manufacturersId) {
		set("manufacturers_id", manufacturersId);
		return (M)this;
	}

	/**
	*获取厂商ID 
	*/
	public java.lang.Integer getManufacturersId() {
		return getInt("manufacturers_id");
	}

	/**
	*设置金额 
	*/
	public M setPrice(java.lang.Double price) {
		set("price", price);
		return (M)this;
	}

	/**
	*获取金额 
	*/
	public java.lang.Double getPrice() {
		return getDouble("price");
	}

}
