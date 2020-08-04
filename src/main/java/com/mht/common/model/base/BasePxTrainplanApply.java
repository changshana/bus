package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_trainplan_apply:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxTrainplanApply<M extends BasePxTrainplanApply<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setTrainplanApplyId(java.lang.Integer trainplanApplyId) {
		set("trainPlan_apply_id", trainplanApplyId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTrainplanApplyId() {
		return getInt("trainPlan_apply_id");
	}

	/**
	*设置学校id 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取学校id 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
	}

	/**
	*设置培训期号 
	*/
	public M setTrainStage(java.lang.String trainStage) {
		set("train_stage", trainStage);
		return (M)this;
	}

	/**
	*获取培训期号 
	*/
	public java.lang.String getTrainStage() {
		return getStr("train_stage");
	}

	/**
	*设置培训等级 
	*/
	public M setTrainLevel(java.lang.String trainLevel) {
		set("train_level", trainLevel);
		return (M)this;
	}

	/**
	*获取培训等级 
	*/
	public java.lang.String getTrainLevel() {
		return getStr("train_level");
	}

	/**
	*设置培训计划名称 
	*/
	public M setPlanName(java.lang.String planName) {
		set("plan_name", planName);
		return (M)this;
	}

	/**
	*获取培训计划名称 
	*/
	public java.lang.String getPlanName() {
		return getStr("plan_name");
	}

	/**
	*设置培训人数 
	*/
	public M setTrainPeopleNumber(java.lang.Integer trainPeopleNumber) {
		set("train_people_number", trainPeopleNumber);
		return (M)this;
	}

	/**
	*获取培训人数 
	*/
	public java.lang.Integer getTrainPeopleNumber() {
		return getInt("train_people_number");
	}

	/**
	*设置培训开始时间 
	*/
	public M setTrainStartTime(java.util.Date trainStartTime) {
		set("train_start_time", trainStartTime);
		return (M)this;
	}

	/**
	*获取培训开始时间 
	*/
	public java.util.Date getTrainStartTime() {
		return get("train_start_time");
	}

	/**
	*设置培训结束时间 
	*/
	public M setTrainEndTime(java.util.Date trainEndTime) {
		set("train_end_time", trainEndTime);
		return (M)this;
	}

	/**
	*获取培训结束时间 
	*/
	public java.util.Date getTrainEndTime() {
		return get("train_end_time");
	}

	/**
	*设置培训地区 
	*/
	public M setTrainArea(java.lang.Integer trainArea) {
		set("train_area", trainArea);
		return (M)this;
	}

	/**
	*获取培训地区 
	*/
	public java.lang.Integer getTrainArea() {
		return getInt("train_area");
	}

	/**
	*设置培训性质 
	*/
	public M setTrainProperty(java.lang.String trainProperty) {
		set("train_property", trainProperty);
		return (M)this;
	}

	/**
	*获取培训性质 
	*/
	public java.lang.String getTrainProperty() {
		return getStr("train_property");
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
