package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_tower:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryTower<M extends BaseDormitoryTower<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置名称 
	*/
	public M setTowerName(java.lang.String towerName) {
		set("tower_name", towerName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getTowerName() {
		return getStr("tower_name");
	}

	/**
	*设置所属组团ID 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取所属组团ID 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置所属校区ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取所属校区ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置建造时间 
	*/
	public M setAddTime(java.util.Date addTime) {
		set("add_time", addTime);
		return (M)this;
	}

	/**
	*获取建造时间 
	*/
	public java.util.Date getAddTime() {
		return get("add_time");
	}

	/**
	*设置建筑面积 
	*/
	public M setArea(java.lang.String area) {
		set("area", area);
		return (M)this;
	}

	/**
	*获取建筑面积 
	*/
	public java.lang.String getArea() {
		return getStr("area");
	}

	/**
	*设置楼层数 
	*/
	public M setLevel(java.lang.Integer level) {
		set("level", level);
		return (M)this;
	}

	/**
	*获取楼层数 
	*/
	public java.lang.Integer getLevel() {
		return getInt("level");
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
	*设置楼宇标志 
	*/
	public M setFlag(java.lang.String flag) {
		set("flag", flag);
		return (M)this;
	}

	/**
	*获取楼宇标志 
	*/
	public java.lang.String getFlag() {
		return getStr("flag");
	}

}
