package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_style:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryStyle<M extends BaseDormitoryStyle<M>> extends Model<M> implements IBean {

	/**
	*设置风貌ID 
	*/
	public M setStyleId(java.lang.Integer styleId) {
		set("style_id", styleId);
		return (M)this;
	}

	/**
	*获取风貌ID 
	*/
	public java.lang.Integer getStyleId() {
		return getInt("style_id");
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
	*设置风貌内容 
	*/
	public M setStyleContent(java.lang.String styleContent) {
		set("style_content", styleContent);
		return (M)this;
	}

	/**
	*获取风貌内容 
	*/
	public java.lang.String getStyleContent() {
		return getStr("style_content");
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
	*设置上次修改 
	*/
	public M setEditTime(java.util.Date editTime) {
		set("edit_time", editTime);
		return (M)this;
	}

	/**
	*获取上次修改 
	*/
	public java.util.Date getEditTime() {
		return get("edit_time");
	}

	/**
	*设置图片url 
	*/
	public M setPicUrl(java.lang.String picUrl) {
		set("picUrl", picUrl);
		return (M)this;
	}

	/**
	*获取图片url 
	*/
	public java.lang.String getPicUrl() {
		return getStr("picUrl");
	}

	/**
	*设置参与活动ID 
	*/
	public M setEvaluationActivityId(java.lang.Integer evaluationActivityId) {
		set("evaluation_activity_id", evaluationActivityId);
		return (M)this;
	}

	/**
	*获取参与活动ID 
	*/
	public java.lang.Integer getEvaluationActivityId() {
		return getInt("evaluation_activity_id");
	}

	/**
	*设置赞数 
	*/
	public M setGoodNum(java.lang.Integer goodNum) {
		set("good_num", goodNum);
		return (M)this;
	}

	/**
	*获取赞数 
	*/
	public java.lang.Integer getGoodNum() {
		return getInt("good_num");
	}

	/**
	*设置踩数 
	*/
	public M setBadNum(java.lang.Integer badNum) {
		set("bad_num", badNum);
		return (M)this;
	}

	/**
	*获取踩数 
	*/
	public java.lang.Integer getBadNum() {
		return getInt("bad_num");
	}

	/**
	*设置评比分数 
	*/
	public M setOrderCode(java.lang.Integer orderCode) {
		set("order_code", orderCode);
		return (M)this;
	}

	/**
	*获取评比分数 
	*/
	public java.lang.Integer getOrderCode() {
		return getInt("order_code");
	}

	/**
	*设置评比时间 
	*/
	public M setOrderTime(java.util.Date orderTime) {
		set("order_time", orderTime);
		return (M)this;
	}

	/**
	*获取评比时间 
	*/
	public java.util.Date getOrderTime() {
		return get("order_time");
	}

}
