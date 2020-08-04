package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_key_borrow:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryKeyBorrow<M extends BaseDormitoryKeyBorrow<M>> extends Model<M> implements IBean {

	/**
	*设置借用id 
	*/
	public M setBorrowId(java.lang.Integer borrowId) {
		set("borrow_id", borrowId);
		return (M)this;
	}

	/**
	*获取借用id 
	*/
	public java.lang.Integer getBorrowId() {
		return getInt("borrow_id");
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
	*设置借用人id 
	*/
	public M setPersonId(java.lang.Integer personId) {
		set("person_id", personId);
		return (M)this;
	}

	/**
	*获取借用人id 
	*/
	public java.lang.Integer getPersonId() {
		return getInt("person_id");
	}

	/**
	*设置借用人类型 
	*/
	public M setPersonType(java.lang.Integer personType) {
		set("person_type", personType);
		return (M)this;
	}

	/**
	*获取借用人类型 
	*/
	public java.lang.Integer getPersonType() {
		return getInt("person_type");
	}

	/**
	*设置借用日期时间 
	*/
	public M setBorrowDate(java.util.Date borrowDate) {
		set("borrow_date", borrowDate);
		return (M)this;
	}

	/**
	*获取借用日期时间 
	*/
	public java.util.Date getBorrowDate() {
		return get("borrow_date");
	}

	/**
	*设置是否归还 
	*/
	public M setReturnStatus(java.lang.Integer returnStatus) {
		set("return_status", returnStatus);
		return (M)this;
	}

	/**
	*获取是否归还 
	*/
	public java.lang.Integer getReturnStatus() {
		return getInt("return_status");
	}

	/**
	*设置归还日期 
	*/
	public M setReturnDate(java.util.Date returnDate) {
		set("return_date", returnDate);
		return (M)this;
	}

	/**
	*获取归还日期 
	*/
	public java.util.Date getReturnDate() {
		return get("return_date");
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
