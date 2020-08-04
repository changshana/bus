package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_tower_facilities:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryTowerFacilities<M extends BaseDormitoryTowerFacilities<M>> extends Model<M> implements IBean {

	/**
	*设置楼宇设施id 
	*/
	public M setFacilityId(java.lang.Integer facilityId) {
		set("facility_id", facilityId);
		return (M)this;
	}

	/**
	*获取楼宇设施id 
	*/
	public java.lang.Integer getFacilityId() {
		return getInt("facility_id");
	}

	/**
	*设置所属区域 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取所属区域 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置所属组团 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取所属组团 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
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
	*设置所属楼层 
	*/
	public M setFloorId(java.lang.Integer floorId) {
		set("floor_id", floorId);
		return (M)this;
	}

	/**
	*获取所属楼层 
	*/
	public java.lang.Integer getFloorId() {
		return getInt("floor_id");
	}

	/**
	*设置所属房间 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取所属房间 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置桌子(张) 
	*/
	public M setDeskNum(java.lang.Integer deskNum) {
		set("desk_num", deskNum);
		return (M)this;
	}

	/**
	*获取桌子(张) 
	*/
	public java.lang.Integer getDeskNum() {
		return getInt("desk_num");
	}

	/**
	*设置普通床(张) 
	*/
	public M setNormalBed(java.lang.Integer normalBed) {
		set("normal_bed", normalBed);
		return (M)this;
	}

	/**
	*获取普通床(张) 
	*/
	public java.lang.Integer getNormalBed() {
		return getInt("normal_bed");
	}

	/**
	*设置上下床(张) 
	*/
	public M setBunkBed(java.lang.Integer bunkBed) {
		set("bunk_bed", bunkBed);
		return (M)this;
	}

	/**
	*获取上下床(张) 
	*/
	public java.lang.Integer getBunkBed() {
		return getInt("bunk_bed");
	}

	/**
	*设置双门柜(个) 
	*/
	public M setTwoDoorCabinet(java.lang.Integer twoDoorCabinet) {
		set("two_door_cabinet", twoDoorCabinet);
		return (M)this;
	}

	/**
	*获取双门柜(个) 
	*/
	public java.lang.Integer getTwoDoorCabinet() {
		return getInt("two_door_cabinet");
	}

	/**
	*设置四门柜(个) 
	*/
	public M setFourDoorCabinet(java.lang.Integer fourDoorCabinet) {
		set("four_door_cabinet", fourDoorCabinet);
		return (M)this;
	}

	/**
	*获取四门柜(个) 
	*/
	public java.lang.Integer getFourDoorCabinet() {
		return getInt("four_door_cabinet");
	}

	/**
	*设置六门柜(个) 
	*/
	public M setSixDoorCabinet(java.lang.Integer sixDoorCabinet) {
		set("six_door_cabinet", sixDoorCabinet);
		return (M)this;
	}

	/**
	*获取六门柜(个) 
	*/
	public java.lang.Integer getSixDoorCabinet() {
		return getInt("six_door_cabinet");
	}

	/**
	*设置热水器(个) 
	*/
	public M setCalorifier(java.lang.Integer calorifier) {
		set("calorifier", calorifier);
		return (M)this;
	}

	/**
	*获取热水器(个) 
	*/
	public java.lang.Integer getCalorifier() {
		return getInt("calorifier");
	}

	/**
	*设置空调(台) 
	*/
	public M setAirConditioner(java.lang.Integer airConditioner) {
		set("air_conditioner", airConditioner);
		return (M)this;
	}

	/**
	*获取空调(台) 
	*/
	public java.lang.Integer getAirConditioner() {
		return getInt("air_conditioner");
	}

	/**
	*设置其他 
	*/
	public M setOther(java.lang.String other) {
		set("other", other);
		return (M)this;
	}

	/**
	*获取其他 
	*/
	public java.lang.String getOther() {
		return getStr("other");
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
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置创建日期 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
