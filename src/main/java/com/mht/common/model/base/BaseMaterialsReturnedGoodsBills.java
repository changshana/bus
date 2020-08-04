package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_returned_goods_bills:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsReturnedGoodsBills<M extends BaseMaterialsReturnedGoodsBills<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setReturnedGoodsBillsId(java.lang.Integer returnedGoodsBillsId) {
		set("returned_goods_bills_id", returnedGoodsBillsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getReturnedGoodsBillsId() {
		return getInt("returned_goods_bills_id");
	}

	/**
	*设置代码 
	*/
	public M setReturnedGoodsBillsCode(java.lang.String returnedGoodsBillsCode) {
		set("returned_goods_bills_code", returnedGoodsBillsCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getReturnedGoodsBillsCode() {
		return getStr("returned_goods_bills_code");
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
	*设置一级机构 
	*/
	public M setSiteCode(java.lang.String siteCode) {
		set("site_code", siteCode);
		return (M)this;
	}

	/**
	*获取一级机构 
	*/
	public java.lang.String getSiteCode() {
		return getStr("site_code");
	}

	/**
	*设置二级机构 
	*/
	public M setHandCode(java.lang.String handCode) {
		set("hand_code", handCode);
		return (M)this;
	}

	/**
	*获取二级机构 
	*/
	public java.lang.String getHandCode() {
		return getStr("hand_code");
	}

	/**
	*设置名称 
	*/
	public M setReturnedGoodsBillsName(java.lang.String returnedGoodsBillsName) {
		set("returned_goods_bills_name", returnedGoodsBillsName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getReturnedGoodsBillsName() {
		return getStr("returned_goods_bills_name");
	}

}
