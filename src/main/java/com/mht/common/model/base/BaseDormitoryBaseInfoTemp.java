package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_base_info_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryBaseInfoTemp<M extends BaseDormitoryBaseInfoTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setBaseInfoTempId(java.lang.Integer baseInfoTempId) {
		set("base_info_temp_id", baseInfoTempId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getBaseInfoTempId() {
		return getInt("base_info_temp_id");
	}

	/**
	*设置序号 
	*/
	public M setNo(java.lang.String no) {
		set("no", no);
		return (M)this;
	}

	/**
	*获取序号 
	*/
	public java.lang.String getNo() {
		return getStr("no");
	}

	/**
	*设置校验状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取校验状态 
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
	*设置批次号 
	*/
	public M setBatchNum(java.lang.String batchNum) {
		set("batch_num", batchNum);
		return (M)this;
	}

	/**
	*获取批次号 
	*/
	public java.lang.String getBatchNum() {
		return getStr("batch_num");
	}

	/**
	*设置校区ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取校区ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置校区名称 
	*/
	public M setSiteName(java.lang.String siteName) {
		set("site_name", siteName);
		return (M)this;
	}

	/**
	*获取校区名称 
	*/
	public java.lang.String getSiteName() {
		return getStr("site_name");
	}

	/**
	*设置组团ID 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取组团ID 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置组团名称 
	*/
	public M setGroupName(java.lang.String groupName) {
		set("group_name", groupName);
		return (M)this;
	}

	/**
	*获取组团名称 
	*/
	public java.lang.String getGroupName() {
		return getStr("group_name");
	}

	/**
	*设置组团代码 
	*/
	public M setGroupCode(java.lang.String groupCode) {
		set("group_code", groupCode);
		return (M)this;
	}

	/**
	*获取组团代码 
	*/
	public java.lang.String getGroupCode() {
		return getStr("group_code");
	}

	/**
	*设置楼宇ID 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取楼宇ID 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置楼宇名称 
	*/
	public M setTowerName(java.lang.String towerName) {
		set("tower_name", towerName);
		return (M)this;
	}

	/**
	*获取楼宇名称 
	*/
	public java.lang.String getTowerName() {
		return getStr("tower_name");
	}

	/**
	*设置楼宇代码 
	*/
	public M setTowerCode(java.lang.String towerCode) {
		set("tower_code", towerCode);
		return (M)this;
	}

	/**
	*获取楼宇代码 
	*/
	public java.lang.String getTowerCode() {
		return getStr("tower_code");
	}

	/**
	*设置楼层ID 
	*/
	public M setFloorId(java.lang.Integer floorId) {
		set("floor_id", floorId);
		return (M)this;
	}

	/**
	*获取楼层ID 
	*/
	public java.lang.Integer getFloorId() {
		return getInt("floor_id");
	}

	/**
	*设置楼层名称 
	*/
	public M setFloorName(java.lang.String floorName) {
		set("floor_name", floorName);
		return (M)this;
	}

	/**
	*获取楼层名称 
	*/
	public java.lang.String getFloorName() {
		return getStr("floor_name");
	}

	/**
	*设置楼层代码 
	*/
	public M setFloorCode(java.lang.String floorCode) {
		set("floor_code", floorCode);
		return (M)this;
	}

	/**
	*获取楼层代码 
	*/
	public java.lang.String getFloorCode() {
		return getStr("floor_code");
	}

	/**
	*设置房间ID 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取房间ID 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置房间号 
	*/
	public M setRoomName(java.lang.String roomName) {
		set("room_name", roomName);
		return (M)this;
	}

	/**
	*获取房间号 
	*/
	public java.lang.String getRoomName() {
		return getStr("room_name");
	}

	/**
	*设置居住类型 
	*/
	public M setResideType(java.lang.String resideType) {
		set("reside_type", resideType);
		return (M)this;
	}

	/**
	*获取居住类型 
	*/
	public java.lang.String getResideType() {
		return getStr("reside_type");
	}

	/**
	*设置居住类型描述 
	*/
	public M setResideTypeDesc(java.lang.String resideTypeDesc) {
		set("reside_type_desc", resideTypeDesc);
		return (M)this;
	}

	/**
	*获取居住类型描述 
	*/
	public java.lang.String getResideTypeDesc() {
		return getStr("reside_type_desc");
	}

	/**
	*设置学生类型 
	*/
	public M setStudentType(java.lang.String studentType) {
		set("student_type", studentType);
		return (M)this;
	}

	/**
	*获取学生类型 
	*/
	public java.lang.String getStudentType() {
		return getStr("student_type");
	}

	/**
	*设置学生类型描述 
	*/
	public M setStudentTypeDesc(java.lang.String studentTypeDesc) {
		set("student_type_desc", studentTypeDesc);
		return (M)this;
	}

	/**
	*获取学生类型描述 
	*/
	public java.lang.String getStudentTypeDesc() {
		return getStr("student_type_desc");
	}

	/**
	*设置住宿性别 
	*/
	public M setSexType(java.lang.String sexType) {
		set("sex_type", sexType);
		return (M)this;
	}

	/**
	*获取住宿性别 
	*/
	public java.lang.String getSexType() {
		return getStr("sex_type");
	}

	/**
	*设置住宿性别描述 
	*/
	public M setSexTypeDesc(java.lang.String sexTypeDesc) {
		set("sex_type_desc", sexTypeDesc);
		return (M)this;
	}

	/**
	*获取住宿性别描述 
	*/
	public java.lang.String getSexTypeDesc() {
		return getStr("sex_type_desc");
	}

	/**
	*设置住宿标准 
	*/
	public M setStandardType(java.lang.String standardType) {
		set("standard_type", standardType);
		return (M)this;
	}

	/**
	*获取住宿标准 
	*/
	public java.lang.String getStandardType() {
		return getStr("standard_type");
	}

	/**
	*设置住宿标准描述 
	*/
	public M setStandardTypeDesc(java.lang.String standardTypeDesc) {
		set("standard_type_desc", standardTypeDesc);
		return (M)this;
	}

	/**
	*获取住宿标准描述 
	*/
	public java.lang.String getStandardTypeDesc() {
		return getStr("standard_type_desc");
	}

	/**
	*设置床位ID 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取床位ID 
	*/
	public java.lang.Integer getBedId() {
		return getInt("bed_id");
	}

	/**
	*设置床位号 
	*/
	public M setBedNum(java.lang.String bedNum) {
		set("bed_num", bedNum);
		return (M)this;
	}

	/**
	*获取床位号 
	*/
	public java.lang.String getBedNum() {
		return getStr("bed_num");
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
	*设置使用类型 
	*/
	public M setUseType(java.lang.Integer useType) {
		set("use_type", useType);
		return (M)this;
	}

	/**
	*获取使用类型 
	*/
	public java.lang.Integer getUseType() {
		return getInt("use_type");
	}

	/**
	*设置使用类型描述 
	*/
	public M setUseTypeDesc(java.lang.String useTypeDesc) {
		set("use_type_desc", useTypeDesc);
		return (M)this;
	}

	/**
	*获取使用类型描述 
	*/
	public java.lang.String getUseTypeDesc() {
		return getStr("use_type_desc");
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
	*设置床位类型描述 
	*/
	public M setBedTypeDesc(java.lang.String bedTypeDesc) {
		set("bed_type_desc", bedTypeDesc);
		return (M)this;
	}

	/**
	*获取床位类型描述 
	*/
	public java.lang.String getBedTypeDesc() {
		return getStr("bed_type_desc");
	}

}
