package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_activity_room_apply:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryActivityRoomApply<M extends BaseDormitoryActivityRoomApply<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRoomApplyId(java.lang.Integer roomApplyId) {
		set("room_apply_id", roomApplyId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRoomApplyId() {
		return getInt("room_apply_id");
	}

	/**
	*设置申请单位 
	*/
	public M setApplyCompany(java.lang.String applyCompany) {
		set("apply_company", applyCompany);
		return (M)this;
	}

	/**
	*获取申请单位 
	*/
	public java.lang.String getApplyCompany() {
		return getStr("apply_company");
	}

	/**
	*设置申请用途 
	*/
	public M setRoomApplyDescribe(java.lang.String roomApplyDescribe) {
		set("room_apply_describe", roomApplyDescribe);
		return (M)this;
	}

	/**
	*获取申请用途 
	*/
	public java.lang.String getRoomApplyDescribe() {
		return getStr("room_apply_describe");
	}

	/**
	*设置活动室信息id 
	*/
	public M setRoomInfoId(java.lang.Integer roomInfoId) {
		set("room_info_id", roomInfoId);
		return (M)this;
	}

	/**
	*获取活动室信息id 
	*/
	public java.lang.Integer getRoomInfoId() {
		return getInt("room_info_id");
	}

	/**
	*设置负责人 
	*/
	public M setDormitoryPerson(java.lang.String dormitoryPerson) {
		set("dormitory_person", dormitoryPerson);
		return (M)this;
	}

	/**
	*获取负责人 
	*/
	public java.lang.String getDormitoryPerson() {
		return getStr("dormitory_person");
	}

	/**
	*设置负责人电话 
	*/
	public M setDormitoryPhone(java.lang.String dormitoryPhone) {
		set("dormitory_phone", dormitoryPhone);
		return (M)this;
	}

	/**
	*获取负责人电话 
	*/
	public java.lang.String getDormitoryPhone() {
		return getStr("dormitory_phone");
	}

	/**
	*设置日常管理人 
	*/
	public M setDailyPerson(java.lang.String dailyPerson) {
		set("daily_person", dailyPerson);
		return (M)this;
	}

	/**
	*获取日常管理人 
	*/
	public java.lang.String getDailyPerson() {
		return getStr("daily_person");
	}

	/**
	*设置管理人电话 
	*/
	public M setDailyPhone(java.lang.String dailyPhone) {
		set("daily_phone", dailyPhone);
		return (M)this;
	}

	/**
	*获取管理人电话 
	*/
	public java.lang.String getDailyPhone() {
		return getStr("daily_phone");
	}

	/**
	*设置审核状态 
	*/
	public M setExamineStatus(java.lang.String examineStatus) {
		set("examine_status", examineStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.String getExamineStatus() {
		return getStr("examine_status");
	}

	/**
	*设置审核人 
	*/
	public M setAuditor(java.lang.String auditor) {
		set("auditor", auditor);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getAuditor() {
		return getStr("auditor");
	}

	/**
	*设置审核状态 
	*/
	public M setSecretaryStatus(java.lang.String secretaryStatus) {
		set("secretary_status", secretaryStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.String getSecretaryStatus() {
		return getStr("secretary_status");
	}

	/**
	*设置领导名字 
	*/
	public M setSecretaryAuditor(java.lang.String secretaryAuditor) {
		set("secretary_auditor", secretaryAuditor);
		return (M)this;
	}

	/**
	*获取领导名字 
	*/
	public java.lang.String getSecretaryAuditor() {
		return getStr("secretary_auditor");
	}

	/**
	*设置检查信息 
	*/
	public M setInspectInfo(java.lang.String inspectInfo) {
		set("inspect_info", inspectInfo);
		return (M)this;
	}

	/**
	*获取检查信息 
	*/
	public java.lang.String getInspectInfo() {
		return getStr("inspect_info");
	}

	/**
	*设置检查人 
	*/
	public M setInspectPerson(java.lang.String inspectPerson) {
		set("inspect_person", inspectPerson);
		return (M)this;
	}

	/**
	*获取检查人 
	*/
	public java.lang.String getInspectPerson() {
		return getStr("inspect_person");
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
	*设置申请人id 
	*/
	public M setApplyId(java.lang.Integer applyId) {
		set("apply_id", applyId);
		return (M)this;
	}

	/**
	*获取申请人id 
	*/
	public java.lang.Integer getApplyId() {
		return getInt("apply_id");
	}

	/**
	*设置申请人类别 
	*/
	public M setApplyType(java.lang.String applyType) {
		set("apply_type", applyType);
		return (M)this;
	}

	/**
	*获取申请人类别 
	*/
	public java.lang.String getApplyType() {
		return getStr("apply_type");
	}

	/**
	*设置活动室类型 
	*/
	public M setActivityType(java.lang.String activityType) {
		set("activity_type", activityType);
		return (M)this;
	}

	/**
	*获取活动室类型 
	*/
	public java.lang.String getActivityType() {
		return getStr("activity_type");
	}

	/**
	*设置开始时间 
	*/
	public M setApplyStartTime(java.util.Date applyStartTime) {
		set("apply_start_time", applyStartTime);
		return (M)this;
	}

	/**
	*获取开始时间 
	*/
	public java.util.Date getApplyStartTime() {
		return get("apply_start_time");
	}

	/**
	*设置结束时间 
	*/
	public M setApplyEndTime(java.util.Date applyEndTime) {
		set("apply_end_time", applyEndTime);
		return (M)this;
	}

	/**
	*获取结束时间 
	*/
	public java.util.Date getApplyEndTime() {
		return get("apply_end_time");
	}

}
