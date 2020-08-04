package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_sanitary_security_score:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitorySanitarySecurityScore<M extends BaseDormitorySanitarySecurityScore<M>> extends Model<M> implements IBean {

	/**
	*设置检查评分id 
	*/
	public M setSanitaryId(java.lang.Integer sanitaryId) {
		set("sanitary_id", sanitaryId);
		return (M)this;
	}

	/**
	*获取检查评分id 
	*/
	public java.lang.Integer getSanitaryId() {
		return getInt("sanitary_id");
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
	*设置室内卫生评分(卫生) 
	*/
	public M setSanitaryIndoor(java.lang.Integer sanitaryIndoor) {
		set("sanitary_indoor", sanitaryIndoor);
		return (M)this;
	}

	/**
	*获取室内卫生评分(卫生) 
	*/
	public java.lang.Integer getSanitaryIndoor() {
		return getInt("sanitary_indoor");
	}

	/**
	*设置室外卫生评分(卫生) 
	*/
	public M setSanitaryOutdoor(java.lang.Integer sanitaryOutdoor) {
		set("sanitary_outdoor", sanitaryOutdoor);
		return (M)this;
	}

	/**
	*获取室外卫生评分(卫生) 
	*/
	public java.lang.Integer getSanitaryOutdoor() {
		return getInt("sanitary_outdoor");
	}

	/**
	*设置安全用电评分(安全) 
	*/
	public M setSecurityElectric(java.lang.Integer securityElectric) {
		set("security_electric", securityElectric);
		return (M)this;
	}

	/**
	*获取安全用电评分(安全) 
	*/
	public java.lang.Integer getSecurityElectric() {
		return getInt("security_electric");
	}

	/**
	*设置晚归评分(安全) 
	*/
	public M setSecurityLate(java.lang.Integer securityLate) {
		set("security_late", securityLate);
		return (M)this;
	}

	/**
	*获取晚归评分(安全) 
	*/
	public java.lang.Integer getSecurityLate() {
		return getInt("security_late");
	}

	/**
	*设置贩卖评分(安全) 
	*/
	public M setSecuritySale(java.lang.Integer securitySale) {
		set("security_sale", securitySale);
		return (M)this;
	}

	/**
	*获取贩卖评分(安全) 
	*/
	public java.lang.Integer getSecuritySale() {
		return getInt("security_sale");
	}

	/**
	*设置消防通道安全评分(安全) 
	*/
	public M setSecurityFirePassage(java.lang.Integer securityFirePassage) {
		set("security_fire_passage", securityFirePassage);
		return (M)this;
	}

	/**
	*获取消防通道安全评分(安全) 
	*/
	public java.lang.Integer getSecurityFirePassage() {
		return getInt("security_fire_passage");
	}

	/**
	*设置其他安全事项评分(安全) 
	*/
	public M setSecurityOther(java.lang.Integer securityOther) {
		set("security_other", securityOther);
		return (M)this;
	}

	/**
	*获取其他安全事项评分(安全) 
	*/
	public java.lang.Integer getSecurityOther() {
		return getInt("security_other");
	}

	/**
	*设置卫生得分 
	*/
	public M setSanitaryScore(java.lang.Integer sanitaryScore) {
		set("sanitary_score", sanitaryScore);
		return (M)this;
	}

	/**
	*获取卫生得分 
	*/
	public java.lang.Integer getSanitaryScore() {
		return getInt("sanitary_score");
	}

	/**
	*设置安全得分 
	*/
	public M setSecurityScore(java.lang.Integer securityScore) {
		set("security_score", securityScore);
		return (M)this;
	}

	/**
	*获取安全得分 
	*/
	public java.lang.Integer getSecurityScore() {
		return getInt("security_score");
	}

	/**
	*设置总得分 
	*/
	public M setScore(java.lang.Integer score) {
		set("score", score);
		return (M)this;
	}

	/**
	*获取总得分 
	*/
	public java.lang.Integer getScore() {
		return getInt("score");
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
	*设置评分时间 
	*/
	public M setScoreDate(java.util.Date scoreDate) {
		set("score_date", scoreDate);
		return (M)this;
	}

	/**
	*获取评分时间 
	*/
	public java.util.Date getScoreDate() {
		return get("score_date");
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
	*设置宿舍检查ID 
	*/
	public M setInspectionActivityId(java.lang.Integer inspectionActivityId) {
		set("inspection_activity_id", inspectionActivityId);
		return (M)this;
	}

	/**
	*获取宿舍检查ID 
	*/
	public java.lang.Integer getInspectionActivityId() {
		return getInt("inspection_activity_id");
	}

}
