package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_floor:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryFloor<M extends BaseDormitoryFloor<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setFloorId(java.lang.Integer floorId) {
		set("floor_id", floorId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getFloorId() {
		return getInt("floor_id");
	}

	/**
	*设置楼层号 
	*/
	public M setFloorNum(java.lang.String floorNum) {
		set("floor_num", floorNum);
		return (M)this;
	}

	/**
	*获取楼层号 
	*/
	public java.lang.String getFloorNum() {
		return getStr("floor_num");
	}

	/**
	*设置所属楼宇 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取所属楼宇 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置所属组团id 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取所属组团id 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置所属校区id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取所属校区id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置楼层房间数 
	*/
	public M setRoomCount(java.lang.Integer roomCount) {
		set("room_count", roomCount);
		return (M)this;
	}

	/**
	*获取楼层房间数 
	*/
	public java.lang.Integer getRoomCount() {
		return getInt("room_count");
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
	*设置住宿标准 
	*/
	public M setAccommodationStandard(java.lang.String accommodationStandard) {
		set("accommodation_standard", accommodationStandard);
		return (M)this;
	}

	/**
	*获取住宿标准 
	*/
	public java.lang.String getAccommodationStandard() {
		return getStr("accommodation_standard");
	}

	/**
	*设置楼层导航图片 
	*/
	public M setNaviImgUrl(java.lang.String naviImgUrl) {
		set("navi_img_url", naviImgUrl);
		return (M)this;
	}

	/**
	*获取楼层导航图片 
	*/
	public java.lang.String getNaviImgUrl() {
		return getStr("navi_img_url");
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
