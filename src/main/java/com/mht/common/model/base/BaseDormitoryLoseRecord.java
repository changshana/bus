package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_lose_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryLoseRecord<M extends BaseDormitoryLoseRecord<M>> extends Model<M> implements IBean {

	/**
	*设置物品丢失记录id 
	*/
	public M setLoseId(java.lang.Integer loseId) {
		set("lose_id", loseId);
		return (M)this;
	}

	/**
	*获取物品丢失记录id 
	*/
	public java.lang.Integer getLoseId() {
		return getInt("lose_id");
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
	*设置学生学号id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生学号id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置学院id 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取学院id 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置专业ID 
	*/
	public M setMajorId(java.lang.Integer majorId) {
		set("major_id", majorId);
		return (M)this;
	}

	/**
	*获取专业ID 
	*/
	public java.lang.Integer getMajorId() {
		return getInt("major_id");
	}

	/**
	*设置班级ID 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取班级ID 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
	}

	/**
	*设置物品名称 
	*/
	public M setGoodsName(java.lang.String goodsName) {
		set("goods_name", goodsName);
		return (M)this;
	}

	/**
	*获取物品名称 
	*/
	public java.lang.String getGoodsName() {
		return getStr("goods_name");
	}

	/**
	*设置单位（物品量词） 
	*/
	public M setGoodsMeasure(java.lang.String goodsMeasure) {
		set("goods_measure", goodsMeasure);
		return (M)this;
	}

	/**
	*获取单位（物品量词） 
	*/
	public java.lang.String getGoodsMeasure() {
		return getStr("goods_measure");
	}

	/**
	*设置数量 
	*/
	public M setGoodsAmount(java.lang.Integer goodsAmount) {
		set("goods_amount", goodsAmount);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.Integer getGoodsAmount() {
		return getInt("goods_amount");
	}

	/**
	*设置丢失日期 
	*/
	public M setLoseDate(java.util.Date loseDate) {
		set("lose_date", loseDate);
		return (M)this;
	}

	/**
	*获取丢失日期 
	*/
	public java.util.Date getLoseDate() {
		return get("lose_date");
	}

	/**
	*设置是否找回 
	*/
	public M setGetBack(java.lang.Integer getBack) {
		set("get_back", getBack);
		return (M)this;
	}

	/**
	*获取是否找回 
	*/
	public java.lang.Integer getGetBack() {
		return getInt("get_back");
	}

	/**
	*设置找回日期 
	*/
	public M setGetbackDate(java.util.Date getbackDate) {
		set("getBack_date", getbackDate);
		return (M)this;
	}

	/**
	*获取找回日期 
	*/
	public java.util.Date getGetbackDate() {
		return get("getBack_date");
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
