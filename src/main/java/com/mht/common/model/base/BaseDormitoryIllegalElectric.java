package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_illegal_electric:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryIllegalElectric<M extends BaseDormitoryIllegalElectric<M>> extends Model<M> implements IBean {

	/**
	*设置违章电器登记id 
	*/
	public M setElectricId(java.lang.Integer electricId) {
		set("electric_id", electricId);
		return (M)this;
	}

	/**
	*获取违章电器登记id 
	*/
	public java.lang.Integer getElectricId() {
		return getInt("electric_id");
	}

	/**
	*设置学生id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置学生姓名 
	*/
	public M setStudentName(java.lang.String studentName) {
		set("student_name", studentName);
		return (M)this;
	}

	/**
	*获取学生姓名 
	*/
	public java.lang.String getStudentName() {
		return getStr("student_name");
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
	*设置电器名称 
	*/
	public M setElectricName(java.lang.String electricName) {
		set("electric_name", electricName);
		return (M)this;
	}

	/**
	*获取电器名称 
	*/
	public java.lang.String getElectricName() {
		return getStr("electric_name");
	}

	/**
	*设置数量 
	*/
	public M setAmount(java.lang.Integer amount) {
		set("amount", amount);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.Integer getAmount() {
		return getInt("amount");
	}

	/**
	*设置电器品牌 
	*/
	public M setBrand(java.lang.String brand) {
		set("brand", brand);
		return (M)this;
	}

	/**
	*获取电器品牌 
	*/
	public java.lang.String getBrand() {
		return getStr("brand");
	}

	/**
	*设置额定功率 
	*/
	public M setRatedPower(java.lang.String ratedPower) {
		set("rated_power", ratedPower);
		return (M)this;
	}

	/**
	*获取额定功率 
	*/
	public java.lang.String getRatedPower() {
		return getStr("rated_power");
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
