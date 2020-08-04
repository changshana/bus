package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_class_graduation:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxClassGraduation<M extends BasePxClassGraduation<M>> extends Model<M> implements IBean {

	/**
	*设置班级结业id 
	*/
	public M setGraduationId(java.lang.Integer graduationId) {
		set("graduation_id", graduationId);
		return (M)this;
	}

	/**
	*获取班级结业id 
	*/
	public java.lang.Integer getGraduationId() {
		return getInt("graduation_id");
	}

	/**
	*设置培训学校编号ID 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取培训学校编号ID 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
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
	*设置培训项目名称 
	*/
	public M setTrainPlanName(java.lang.String trainPlanName) {
		set("train_plan_name", trainPlanName);
		return (M)this;
	}

	/**
	*获取培训项目名称 
	*/
	public java.lang.String getTrainPlanName() {
		return getStr("train_plan_name");
	}

	/**
	*设置培训班名称 
	*/
	public M setTrainClassName(java.lang.String trainClassName) {
		set("train_class_name", trainClassName);
		return (M)this;
	}

	/**
	*获取培训班名称 
	*/
	public java.lang.String getTrainClassName() {
		return getStr("train_class_name");
	}

	/**
	*设置结业人数 
	*/
	public M setGraduationSum(java.lang.Integer graduationSum) {
		set("graduation_sum", graduationSum);
		return (M)this;
	}

	/**
	*获取结业人数 
	*/
	public java.lang.Integer getGraduationSum() {
		return getInt("graduation_sum");
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
	*设置审核状态 
	*/
	public M setAuditingStatus(java.lang.Integer auditingStatus) {
		set("auditing_status", auditingStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getAuditingStatus() {
		return getInt("auditing_status");
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
	*设置不通过原因 
	*/
	public M setFallReason(java.lang.String fallReason) {
		set("fall_reason", fallReason);
		return (M)this;
	}

	/**
	*获取不通过原因 
	*/
	public java.lang.String getFallReason() {
		return getStr("fall_reason");
	}

	/**
	*设置结业时间 
	*/
	public M setGraduationTime(java.util.Date graduationTime) {
		set("graduation_time", graduationTime);
		return (M)this;
	}

	/**
	*获取结业时间 
	*/
	public java.util.Date getGraduationTime() {
		return get("graduation_time");
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

}
