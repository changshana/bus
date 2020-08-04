package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_out_storage:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsOutStorage<M extends BaseMaterialsOutStorage<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setOutStorageId(java.lang.Integer outStorageId) {
		set("out_storage_id", outStorageId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getOutStorageId() {
		return getInt("out_storage_id");
	}

	/**
	*设置名称 
	*/
	public M setOutStorageName(java.lang.String outStorageName) {
		set("out_storage_name", outStorageName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getOutStorageName() {
		return getStr("out_storage_name");
	}

	/**
	*设置代码 
	*/
	public M setOutStorageCode(java.lang.String outStorageCode) {
		set("out_storage_code", outStorageCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getOutStorageCode() {
		return getStr("out_storage_code");
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
	*设置出入库类型 
	*/
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取出入库类型 
	*/
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	*设置材料ID 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取材料ID 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
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
	*设置目标 
	*/
	public M setTarget(java.lang.Integer target) {
		set("target", target);
		return (M)this;
	}

	/**
	*获取目标 
	*/
	public java.lang.Integer getTarget() {
		return getInt("target");
	}

}
