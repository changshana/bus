package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_goods_entry_exit:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryGoodsEntryExit<M extends BaseDormitoryGoodsEntryExit<M>> extends Model<M> implements IBean {

	/**
	*设置物品出入记录id 
	*/
	public M setExitId(java.lang.Integer exitId) {
		set("exit_id", exitId);
		return (M)this;
	}

	/**
	*获取物品出入记录id 
	*/
	public java.lang.Integer getExitId() {
		return getInt("exit_id");
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
	*设置物品携带者姓名 
	*/
	public M setCarrierName(java.lang.String carrierName) {
		set("carrierName", carrierName);
		return (M)this;
	}

	/**
	*获取物品携带者姓名 
	*/
	public java.lang.String getCarrierName() {
		return getStr("carrierName");
	}

	/**
	*设置与物品所有者关系 
	*/
	public M setRelationship(java.lang.Integer relationship) {
		set("relationship", relationship);
		return (M)this;
	}

	/**
	*获取与物品所有者关系 
	*/
	public java.lang.Integer getRelationship() {
		return getInt("relationship");
	}

	/**
	*设置物品状态(出、入) 
	*/
	public M setGoodsStatus(java.lang.Integer goodsStatus) {
		set("goods_status", goodsStatus);
		return (M)this;
	}

	/**
	*获取物品状态(出、入) 
	*/
	public java.lang.Integer getGoodsStatus() {
		return getInt("goods_status");
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
