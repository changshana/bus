package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_firehydrant:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryFirehydrant<M extends BaseDormitoryFirehydrant<M>> extends Model<M> implements IBean {

	/**
	*设置器材id 
	*/
	public M setFirehydrantId(java.lang.Integer firehydrantId) {
		set("firehydrant_id", firehydrantId);
		return (M)this;
	}

	/**
	*获取器材id 
	*/
	public java.lang.Integer getFirehydrantId() {
		return getInt("firehydrant_id");
	}

	/**
	*设置区域id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取区域id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置组团id 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取组团id 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置宿舍楼id 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取宿舍楼id 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置楼层 
	*/
	public M setFloorId(java.lang.Integer floorId) {
		set("floor_id", floorId);
		return (M)this;
	}

	/**
	*获取楼层 
	*/
	public java.lang.Integer getFloorId() {
		return getInt("floor_id");
	}

	/**
	*设置器材名称 
	*/
	public M setHydrantName(java.lang.String hydrantName) {
		set("hydrant_name", hydrantName);
		return (M)this;
	}

	/**
	*获取器材名称 
	*/
	public java.lang.String getHydrantName() {
		return getStr("hydrant_name");
	}

	/**
	*设置放置地点 
	*/
	public M setLocation(java.lang.String location) {
		set("location", location);
		return (M)this;
	}

	/**
	*获取放置地点 
	*/
	public java.lang.String getLocation() {
		return getStr("location");
	}

	/**
	*设置生产日期 
	*/
	public M setProductionDate(java.util.Date productionDate) {
		set("production_date", productionDate);
		return (M)this;
	}

	/**
	*获取生产日期 
	*/
	public java.util.Date getProductionDate() {
		return get("production_date");
	}

	/**
	*设置过期时间 
	*/
	public M setExpiryDate(java.util.Date expiryDate) {
		set("expiry_date", expiryDate);
		return (M)this;
	}

	/**
	*获取过期时间 
	*/
	public java.util.Date getExpiryDate() {
		return get("expiry_date");
	}

	/**
	*设置备注 
	*/
	public M setHydrantNote(java.lang.String hydrantNote) {
		set("hydrant_note", hydrantNote);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getHydrantNote() {
		return getStr("hydrant_note");
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

}
