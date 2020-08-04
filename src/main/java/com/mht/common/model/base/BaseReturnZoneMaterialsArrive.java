package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * return_zone_materials_arrive:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseReturnZoneMaterialsArrive<M extends BaseReturnZoneMaterialsArrive<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setZoneMaterialsArriveId(java.lang.Integer zoneMaterialsArriveId) {
		set("zone_materials_arrive_id", zoneMaterialsArriveId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getZoneMaterialsArriveId() {
		return getInt("zone_materials_arrive_id");
	}

	/**
	*设置归还详情ID 
	*/
	public M setZoneMaterialsDetailsId(java.lang.Integer zoneMaterialsDetailsId) {
		set("zone_materials_details_id", zoneMaterialsDetailsId);
		return (M)this;
	}

	/**
	*获取归还详情ID 
	*/
	public java.lang.Integer getZoneMaterialsDetailsId() {
		return getInt("zone_materials_details_id");
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
