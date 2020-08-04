package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_bed:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryBed<M extends BaseDormitoryBed<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getBedId() {
		return getInt("bed_id");
	}

	/**
	*设置床位号 
	*/
	public M setBedNum(java.lang.Integer bedNum) {
		set("bed_num", bedNum);
		return (M)this;
	}

	/**
	*获取床位号 
	*/
	public java.lang.Integer getBedNum() {
		return getInt("bed_num");
	}

	/**
	*设置校区id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取校区id 
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
	*设置楼宇id 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取楼宇id 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置楼层id 
	*/
	public M setFloorId(java.lang.Integer floorId) {
		set("floor_id", floorId);
		return (M)this;
	}

	/**
	*获取楼层id 
	*/
	public java.lang.Integer getFloorId() {
		return getInt("floor_id");
	}

	/**
	*设置房间id 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取房间id 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置住宿性别 
	*/
	public M setSex(java.lang.Integer sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取住宿性别 
	*/
	public java.lang.Integer getSex() {
		return getInt("sex");
	}

	/**
	*设置床位类型 
	*/
	public M setBedType(java.lang.Integer bedType) {
		set("bed_type", bedType);
		return (M)this;
	}

	/**
	*获取床位类型 
	*/
	public java.lang.Integer getBedType() {
		return getInt("bed_type");
	}

	/**
	*设置床位信息 
	*/
	public M setBedInfo(java.lang.Integer bedInfo) {
		set("bed_info", bedInfo);
		return (M)this;
	}

	/**
	*获取床位信息 
	*/
	public java.lang.Integer getBedInfo() {
		return getInt("bed_info");
	}

	/**
	*设置入住状态 
	*/
	public M setInStatus(java.lang.Integer inStatus) {
		set("in_status", inStatus);
		return (M)this;
	}

	/**
	*获取入住状态 
	*/
	public java.lang.Integer getInStatus() {
		return getInt("in_status");
	}

	/**
	*设置授权状态 
	*/
	public M setAuthStatus(java.lang.Integer authStatus) {
		set("auth_status", authStatus);
		return (M)this;
	}

	/**
	*获取授权状态 
	*/
	public java.lang.Integer getAuthStatus() {
		return getInt("auth_status");
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
