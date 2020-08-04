package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_device_maintenance:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryDeviceMaintenance<M extends BaseDormitoryDeviceMaintenance<M>> extends Model<M> implements IBean {

	/**
	*设置维修登记id 
	*/
	public M setMaintenanceId(java.lang.Integer maintenanceId) {
		set("maintenance_id", maintenanceId);
		return (M)this;
	}

	/**
	*获取维修登记id 
	*/
	public java.lang.Integer getMaintenanceId() {
		return getInt("maintenance_id");
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
	*设置维修人 
	*/
	public M setRepairman(java.lang.String repairman) {
		set("repairman", repairman);
		return (M)this;
	}

	/**
	*获取维修人 
	*/
	public java.lang.String getRepairman() {
		return getStr("repairman");
	}

	/**
	*设置联系电话 
	*/
	public M setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getTelephone() {
		return getStr("telephone");
	}

	/**
	*设置维修内容 
	*/
	public M setRepairContent(java.lang.String repairContent) {
		set("repair_content", repairContent);
		return (M)this;
	}

	/**
	*获取维修内容 
	*/
	public java.lang.String getRepairContent() {
		return getStr("repair_content");
	}

	/**
	*设置维修状态 
	*/
	public M setRepairStatus(java.lang.Integer repairStatus) {
		set("repair_status", repairStatus);
		return (M)this;
	}

	/**
	*获取维修状态 
	*/
	public java.lang.Integer getRepairStatus() {
		return getInt("repair_status");
	}

	/**
	*设置开始日期 
	*/
	public M setStartDate(java.util.Date startDate) {
		set("start_date", startDate);
		return (M)this;
	}

	/**
	*获取开始日期 
	*/
	public java.util.Date getStartDate() {
		return get("start_date");
	}

	/**
	*设置结束日期 
	*/
	public M setEndDate(java.util.Date endDate) {
		set("end_date", endDate);
		return (M)this;
	}

	/**
	*获取结束日期 
	*/
	public java.util.Date getEndDate() {
		return get("end_date");
	}

	/**
	*设置备注 
	*/
	public M setNote(java.lang.String note) {
		set("note", note);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getNote() {
		return getStr("note");
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

}
