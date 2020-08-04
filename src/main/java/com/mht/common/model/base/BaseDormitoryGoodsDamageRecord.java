package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_goods_damage_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryGoodsDamageRecord<M extends BaseDormitoryGoodsDamageRecord<M>> extends Model<M> implements IBean {

	/**
	*设置损坏记录id 
	*/
	public M setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	/**
	*获取损坏记录id 
	*/
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
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
	public M setAcademyId(java.lang.Integer academyId) {
		set("academy_id", academyId);
		return (M)this;
	}

	/**
	*获取学院id 
	*/
	public java.lang.Integer getAcademyId() {
		return getInt("academy_id");
	}

	/**
	*设置专业id 
	*/
	public M setSpecialtyId(java.lang.Integer specialtyId) {
		set("specialty_id", specialtyId);
		return (M)this;
	}

	/**
	*获取专业id 
	*/
	public java.lang.Integer getSpecialtyId() {
		return getInt("specialty_id");
	}

	/**
	*设置班级id 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取班级id 
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
	*设置损坏日期 
	*/
	public M setDamageDate(java.util.Date damageDate) {
		set("damage_date", damageDate);
		return (M)this;
	}

	/**
	*获取损坏日期 
	*/
	public java.util.Date getDamageDate() {
		return get("damage_date");
	}

	/**
	*设置是否赔偿 
	*/
	public M setCompensate(java.lang.Integer compensate) {
		set("compensate", compensate);
		return (M)this;
	}

	/**
	*获取是否赔偿 
	*/
	public java.lang.Integer getCompensate() {
		return getInt("compensate");
	}

	/**
	*设置赔偿日期 
	*/
	public M setCompensateDate(java.util.Date compensateDate) {
		set("compensate_date", compensateDate);
		return (M)this;
	}

	/**
	*获取赔偿日期 
	*/
	public java.util.Date getCompensateDate() {
		return get("compensate_date");
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

}
