package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_check_out:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCheckOut<M extends BaseDormitoryCheckOut<M>> extends Model<M> implements IBean {

	/**
	*设置退宿流水号 
	*/
	public M setOutId(java.lang.Integer outId) {
		set("out_id", outId);
		return (M)this;
	}

	/**
	*获取退宿流水号 
	*/
	public java.lang.Integer getOutId() {
		return getInt("out_id");
	}

	/**
	*设置学生ID 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生ID 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置退宿原因 
	*/
	public M setOutReason(java.lang.Integer outReason) {
		set("out_reason", outReason);
		return (M)this;
	}

	/**
	*获取退宿原因 
	*/
	public java.lang.Integer getOutReason() {
		return getInt("out_reason");
	}

	/**
	*设置退宿原因描述 
	*/
	public M setOutReasonDesc(java.lang.String outReasonDesc) {
		set("out_reason_desc", outReasonDesc);
		return (M)this;
	}

	/**
	*获取退宿原因描述 
	*/
	public java.lang.String getOutReasonDesc() {
		return getStr("out_reason_desc");
	}

	/**
	*设置退宿日期 
	*/
	public M setOutDate(java.util.Date outDate) {
		set("out_date", outDate);
		return (M)this;
	}

	/**
	*获取退宿日期 
	*/
	public java.util.Date getOutDate() {
		return get("out_date");
	}

	/**
	*设置退宿类型 
	*/
	public M setOutType(java.lang.Integer outType) {
		set("out_type", outType);
		return (M)this;
	}

	/**
	*获取退宿类型 
	*/
	public java.lang.Integer getOutType() {
		return getInt("out_type");
	}

	/**
	*设置退宿类型描述(暂时退宿/永久退宿/中途退宿) 
	*/
	public M setOutTypeDesc(java.lang.String outTypeDesc) {
		set("out_type_desc", outTypeDesc);
		return (M)this;
	}

	/**
	*获取退宿类型描述(暂时退宿/永久退宿/中途退宿) 
	*/
	public java.lang.String getOutTypeDesc() {
		return getStr("out_type_desc");
	}

	/**
	*设置预计重新入住日期 
	*/
	public M setExpectedInDate(java.util.Date expectedInDate) {
		set("expected_in_date", expectedInDate);
		return (M)this;
	}

	/**
	*获取预计重新入住日期 
	*/
	public java.util.Date getExpectedInDate() {
		return get("expected_in_date");
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
	*设置退宿审核状态 
	*/
	public M setOutApprovalStatus(java.lang.String outApprovalStatus) {
		set("out_approval_status", outApprovalStatus);
		return (M)this;
	}

	/**
	*获取退宿审核状态 
	*/
	public java.lang.String getOutApprovalStatus() {
		return getStr("out_approval_status");
	}

	/**
	*设置辅导员审核状态 
	*/
	public M setCounselorApprovalStatus(java.lang.String counselorApprovalStatus) {
		set("counselor_approval_status", counselorApprovalStatus);
		return (M)this;
	}

	/**
	*获取辅导员审核状态 
	*/
	public java.lang.String getCounselorApprovalStatus() {
		return getStr("counselor_approval_status");
	}

	/**
	*设置宿管审核状态 
	*/
	public M setDormApprovalStatus(java.lang.String dormApprovalStatus) {
		set("dorm_approval_status", dormApprovalStatus);
		return (M)this;
	}

	/**
	*获取宿管审核状态 
	*/
	public java.lang.String getDormApprovalStatus() {
		return getStr("dorm_approval_status");
	}

	/**
	*设置物业审核状态 
	*/
	public M setPropertyApprovalStatus(java.lang.String propertyApprovalStatus) {
		set("property_approval_status", propertyApprovalStatus);
		return (M)this;
	}

	/**
	*获取物业审核状态 
	*/
	public java.lang.String getPropertyApprovalStatus() {
		return getStr("property_approval_status");
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
	*设置上传的审核材料 
	*/
	public M setUploadMaterials(java.lang.String uploadMaterials) {
		set("upload_materials", uploadMaterials);
		return (M)this;
	}

	/**
	*获取上传的审核材料 
	*/
	public java.lang.String getUploadMaterials() {
		return getStr("upload_materials");
	}

	/**
	*设置审核日期 
	*/
	public M setApprovalTime(java.util.Date approvalTime) {
		set("approval_time", approvalTime);
		return (M)this;
	}

	/**
	*获取审核日期 
	*/
	public java.util.Date getApprovalTime() {
		return get("approval_time");
	}

	/**
	*设置审核备注 
	*/
	public M setApprovalRemark(java.lang.String approvalRemark) {
		set("approval_remark", approvalRemark);
		return (M)this;
	}

	/**
	*获取审核备注 
	*/
	public java.lang.String getApprovalRemark() {
		return getStr("approval_remark");
	}

	/**
	*设置原入住日期 
	*/
	public M setOldCheckInDate(java.lang.String oldCheckInDate) {
		set("old_check_in_date", oldCheckInDate);
		return (M)this;
	}

	/**
	*获取原入住日期 
	*/
	public java.lang.String getOldCheckInDate() {
		return getStr("old_check_in_date");
	}

	/**
	*设置原入住床位 
	*/
	public M setOldCheckInBedId(java.lang.Integer oldCheckInBedId) {
		set("old_check_in_bed_id", oldCheckInBedId);
		return (M)this;
	}

	/**
	*获取原入住床位 
	*/
	public java.lang.Integer getOldCheckInBedId() {
		return getInt("old_check_in_bed_id");
	}

	/**
	*设置入住状态 
	*/
	public M setEnrollStatus(java.lang.String enrollStatus) {
		set("enroll_status", enrollStatus);
		return (M)this;
	}

	/**
	*获取入住状态 
	*/
	public java.lang.String getEnrollStatus() {
		return getStr("enroll_status");
	}

}
