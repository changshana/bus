package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_master_user:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsMasterUser<M extends BaseRepairMaterialsMasterUser<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRmmuId(java.lang.Integer rmmuId) {
		set("rmmu_id", rmmuId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRmmuId() {
		return getInt("rmmu_id");
	}

	/**
	*设置名称 
	*/
	public M setRmmuName(java.lang.String rmmuName) {
		set("rmmu_name", rmmuName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getRmmuName() {
		return getStr("rmmu_name");
	}

	/**
	*设置联系方式 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取联系方式 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
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
	*设置校区ID 
	*/
	public M setZoneId(java.lang.Integer zoneId) {
		set("zone_id", zoneId);
		return (M)this;
	}

	/**
	*获取校区ID 
	*/
	public java.lang.Integer getZoneId() {
		return getInt("zone_id");
	}

}
