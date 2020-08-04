package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_group:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryGroup<M extends BaseDormitoryGroup<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置名称 
	*/
	public M setGroupName(java.lang.String groupName) {
		set("group_name", groupName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getGroupName() {
		return getStr("group_name");
	}

	/**
	*设置组团标志 
	*/
	public M setFlag(java.lang.String flag) {
		set("flag", flag);
		return (M)this;
	}

	/**
	*获取组团标志 
	*/
	public java.lang.String getFlag() {
		return getStr("flag");
	}

	/**
	*设置所属校区 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取所属校区 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置楼宇数量 
	*/
	public M setTowerNum(java.lang.Integer towerNum) {
		set("tower_num", towerNum);
		return (M)this;
	}

	/**
	*获取楼宇数量 
	*/
	public java.lang.Integer getTowerNum() {
		return getInt("tower_num");
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

}
