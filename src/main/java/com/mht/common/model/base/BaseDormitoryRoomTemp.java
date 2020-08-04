package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_room_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryRoomTemp<M extends BaseDormitoryRoomTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

	/**
	*设置 
	*/
	public M setRoomUpdateId(java.lang.Integer roomUpdateId) {
		set("room_update_id", roomUpdateId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRoomUpdateId() {
		return getInt("room_update_id");
	}

	/**
	*设置房间号 
	*/
	public M setRoomNum(java.lang.String roomNum) {
		set("room_num", roomNum);
		return (M)this;
	}

	/**
	*获取房间号 
	*/
	public java.lang.String getRoomNum() {
		return getStr("room_num");
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
	*设置学校名称 
	*/
	public M setSiteName(java.lang.String siteName) {
		set("site_name", siteName);
		return (M)this;
	}

	/**
	*获取学校名称 
	*/
	public java.lang.String getSiteName() {
		return getStr("site_name");
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
	*设置使用类型(学生宿舍/教师宿舍等) 
	*/
	public M setUseType(java.lang.Integer useType) {
		set("use_type", useType);
		return (M)this;
	}

	/**
	*获取使用类型(学生宿舍/教师宿舍等) 
	*/
	public java.lang.Integer getUseType() {
		return getInt("use_type");
	}

	/**
	*设置使用类型名称 
	*/
	public M setUseName(java.lang.String useName) {
		set("use_name", useName);
		return (M)this;
	}

	/**
	*获取使用类型名称 
	*/
	public java.lang.String getUseName() {
		return getStr("use_name");
	}

	/**
	*设置居住类型(本科生/研究生) 
	*/
	public M setAccommodationType(java.lang.Integer accommodationType) {
		set("accommodation_type", accommodationType);
		return (M)this;
	}

	/**
	*获取居住类型(本科生/研究生) 
	*/
	public java.lang.Integer getAccommodationType() {
		return getInt("accommodation_type");
	}

	/**
	*设置居住类型名称 
	*/
	public M setAccommodationTypeName(java.lang.String accommodationTypeName) {
		set("accommodation_type_name", accommodationTypeName);
		return (M)this;
	}

	/**
	*获取居住类型名称 
	*/
	public java.lang.String getAccommodationTypeName() {
		return getStr("accommodation_type_name");
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
	*设置住宿标准名称 
	*/
	public M setAccommodationStandardName(java.lang.String accommodationStandardName) {
		set("accommodation_standard_name", accommodationStandardName);
		return (M)this;
	}

	/**
	*获取住宿标准名称 
	*/
	public java.lang.String getAccommodationStandardName() {
		return getStr("accommodation_standard_name");
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
	*设置性别名称 
	*/
	public M setSexDesc(java.lang.String sexDesc) {
		set("sex_desc", sexDesc);
		return (M)this;
	}

	/**
	*获取性别名称 
	*/
	public java.lang.String getSexDesc() {
		return getStr("sex_desc");
	}

	/**
	*设置住宿人数 
	*/
	public M setAccommodationCount(java.lang.Integer accommodationCount) {
		set("accommodation_count", accommodationCount);
		return (M)this;
	}

	/**
	*获取住宿人数 
	*/
	public java.lang.Integer getAccommodationCount() {
		return getInt("accommodation_count");
	}

	/**
	*设置宿舍电话 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取宿舍电话 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	/**
	*设置是否参与文明评比 
	*/
	public M setIsRating(java.lang.Integer isRating) {
		set("is_rating", isRating);
		return (M)this;
	}

	/**
	*获取是否参与文明评比 
	*/
	public java.lang.Integer getIsRating() {
		return getInt("is_rating");
	}

	/**
	*设置是否参与文明评比名称 
	*/
	public M setIsRatingName(java.lang.String isRatingName) {
		set("is_rating_name", isRatingName);
		return (M)this;
	}

	/**
	*获取是否参与文明评比名称 
	*/
	public java.lang.String getIsRatingName() {
		return getStr("is_rating_name");
	}

	/**
	*设置房间图片url 
	*/
	public M setRoomImgUrl(java.lang.String roomImgUrl) {
		set("room_img_url", roomImgUrl);
		return (M)this;
	}

	/**
	*获取房间图片url 
	*/
	public java.lang.String getRoomImgUrl() {
		return getStr("room_img_url");
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

	/**
	*设置批次号 
	*/
	public M setBatchNumber(java.lang.String batchNumber) {
		set("batch_number", batchNumber);
		return (M)this;
	}

	/**
	*获取批次号 
	*/
	public java.lang.String getBatchNumber() {
		return getStr("batch_number");
	}

	/**
	*设置验证失败原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取验证失败原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
	}

	/**
	*设置临时数据类型（1：成功  0：失败） 
	*/
	public M setTempType(java.lang.Integer tempType) {
		set("temp_type", tempType);
		return (M)this;
	}

	/**
	*获取临时数据类型（1：成功  0：失败） 
	*/
	public java.lang.Integer getTempType() {
		return getInt("temp_type");
	}

}
