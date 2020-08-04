package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_counsellor_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCounsellorInfo<M extends BaseDormitoryCounsellorInfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCounsellorInfoId(java.lang.Integer counsellorInfoId) {
		set("counsellor_info_id", counsellorInfoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCounsellorInfoId() {
		return getInt("counsellor_info_id");
	}

	/**
	*设置联系电话 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
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
	*设置微信标识 
	*/
	public M setOpenId(java.lang.String openId) {
		set("open_id", openId);
		return (M)this;
	}

	/**
	*获取微信标识 
	*/
	public java.lang.String getOpenId() {
		return getStr("open_id");
	}

	/**
	*设置申请入住时间 
	*/
	public M setApplyDate(java.util.Date applyDate) {
		set("apply_date", applyDate);
		return (M)this;
	}

	/**
	*获取申请入住时间 
	*/
	public java.util.Date getApplyDate() {
		return get("apply_date");
	}

	/**
	*设置区域 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取区域 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置组团 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取组团 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置楼宇 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取楼宇 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置审核状态 
	*/
	public M setApprovalStatus(java.lang.String approvalStatus) {
		set("approval_status", approvalStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.String getApprovalStatus() {
		return getStr("approval_status");
	}

	/**
	*设置审核失败原因 
	*/
	public M setApprovalReason(java.lang.String approvalReason) {
		set("approval_reason", approvalReason);
		return (M)this;
	}

	/**
	*获取审核失败原因 
	*/
	public java.lang.String getApprovalReason() {
		return getStr("approval_reason");
	}

	/**
	*设置辅导员对应信息id 
	*/
	public M setCounsellorId(java.lang.Integer counsellorId) {
		set("counsellor_id", counsellorId);
		return (M)this;
	}

	/**
	*获取辅导员对应信息id 
	*/
	public java.lang.Integer getCounsellorId() {
		return getInt("counsellor_id");
	}

	/**
	*设置拟退宿时间 
	*/
	public M setRetirementDate(java.util.Date retirementDate) {
		set("retirement_date", retirementDate);
		return (M)this;
	}

	/**
	*获取拟退宿时间 
	*/
	public java.util.Date getRetirementDate() {
		return get("retirement_date");
	}

	/**
	*设置介绍人 
	*/
	public M setIntroducer(java.lang.String introducer) {
		set("introducer", introducer);
		return (M)this;
	}

	/**
	*获取介绍人 
	*/
	public java.lang.String getIntroducer() {
		return getStr("introducer");
	}

	/**
	*设置介绍人联系方式 
	*/
	public M setIntroducerPhone(java.lang.String introducerPhone) {
		set("introducer_phone", introducerPhone);
		return (M)this;
	}

	/**
	*获取介绍人联系方式 
	*/
	public java.lang.String getIntroducerPhone() {
		return getStr("introducer_phone");
	}

	/**
	*设置分房状态 
	*/
	public M setHouseStatus(java.lang.String houseStatus) {
		set("house_status", houseStatus);
		return (M)this;
	}

	/**
	*获取分房状态 
	*/
	public java.lang.String getHouseStatus() {
		return getStr("house_status");
	}

}
