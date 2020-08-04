package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_counsellor_check_in:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCounsellorCheckIn<M extends BaseDormitoryCounsellorCheckIn<M>> extends Model<M> implements IBean {

	/**
	*设置入住id 
	*/
	public M setInId(java.lang.Integer inId) {
		set("in_id", inId);
		return (M)this;
	}

	/**
	*获取入住id 
	*/
	public java.lang.Integer getInId() {
		return getInt("in_id");
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
	*设置组团Id 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取组团Id 
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
	*设置床位号id 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取床位号id 
	*/
	public java.lang.Integer getBedId() {
		return getInt("bed_id");
	}

	/**
	*设置辅导员id 
	*/
	public M setCounsellorId(java.lang.Integer counsellorId) {
		set("counsellor_id", counsellorId);
		return (M)this;
	}

	/**
	*获取辅导员id 
	*/
	public java.lang.Integer getCounsellorId() {
		return getInt("counsellor_id");
	}

	/**
	*设置入住状态 
	*/
	public M setCheckinStatus(java.lang.Integer checkinStatus) {
		set("checkIn_status", checkinStatus);
		return (M)this;
	}

	/**
	*获取入住状态 
	*/
	public java.lang.Integer getCheckinStatus() {
		return getInt("checkIn_status");
	}

	/**
	*设置入住日期 
	*/
	public M setCheckinTime(java.util.Date checkinTime) {
		set("checkIn_time", checkinTime);
		return (M)this;
	}

	/**
	*获取入住日期 
	*/
	public java.util.Date getCheckinTime() {
		return get("checkIn_time");
	}

	/**
	*设置退宿日期 
	*/
	public M setCheckoutTime(java.util.Date checkoutTime) {
		set("checkOut_time", checkoutTime);
		return (M)this;
	}

	/**
	*获取退宿日期 
	*/
	public java.util.Date getCheckoutTime() {
		return get("checkOut_time");
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
	*设置辅导员申请信息id 
	*/
	public M setCounsellorInfoId(java.lang.Integer counsellorInfoId) {
		set("counsellor_info_id", counsellorInfoId);
		return (M)this;
	}

	/**
	*获取辅导员申请信息id 
	*/
	public java.lang.Integer getCounsellorInfoId() {
		return getInt("counsellor_info_id");
	}

}
