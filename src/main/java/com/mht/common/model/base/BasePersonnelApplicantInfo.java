package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_applicant_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelApplicantInfo<M extends BasePersonnelApplicantInfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApplicantInfoId(java.lang.Integer applicantInfoId) {
		set("applicant_info_id", applicantInfoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApplicantInfoId() {
		return getInt("applicant_info_id");
	}

	/**
	*设置姓名 
	*/
	public M setPersonName(java.lang.String personName) {
		set("person_name", personName);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getPersonName() {
		return getStr("person_name");
	}

	/**
	*设置证件号 
	*/
	public M setIdentityCard(java.lang.String identityCard) {
		set("identity_card", identityCard);
		return (M)this;
	}

	/**
	*获取证件号 
	*/
	public java.lang.String getIdentityCard() {
		return getStr("identity_card");
	}

	/**
	*设置性别 
	*/
	public M setSex(java.lang.Integer sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.Integer getSex() {
		return getInt("sex");
	}

	/**
	*设置工作经历 
	*/
	public M setExperience(java.lang.String experience) {
		set("experience", experience);
		return (M)this;
	}

	/**
	*获取工作经历 
	*/
	public java.lang.String getExperience() {
		return getStr("experience");
	}

	/**
	*设置电话号码 
	*/
	public M setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
		return (M)this;
	}

	/**
	*获取电话号码 
	*/
	public java.lang.String getTelephone() {
		return getStr("telephone");
	}

	/**
	*设置邮箱 
	*/
	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}

	/**
	*获取邮箱 
	*/
	public java.lang.String getEmail() {
		return getStr("email");
	}

	/**
	*设置QQ号码 
	*/
	public M setQq(java.lang.String qq) {
		set("qq", qq);
		return (M)this;
	}

	/**
	*获取QQ号码 
	*/
	public java.lang.String getQq() {
		return getStr("qq");
	}

	/**
	*设置地址 
	*/
	public M setAddr(java.lang.String addr) {
		set("addr", addr);
		return (M)this;
	}

	/**
	*获取地址 
	*/
	public java.lang.String getAddr() {
		return getStr("addr");
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
	*设置是否黑名单 
	*/
	public M setIsForbid(java.lang.Integer isForbid) {
		set("isForbid", isForbid);
		return (M)this;
	}

	/**
	*获取是否黑名单 
	*/
	public java.lang.Integer getIsForbid() {
		return getInt("isForbid");
	}

	/**
	*设置黑名单理由 
	*/
	public M setForbidReason(java.lang.String forbidReason) {
		set("forbidReason", forbidReason);
		return (M)this;
	}

	/**
	*获取黑名单理由 
	*/
	public java.lang.String getForbidReason() {
		return getStr("forbidReason");
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
	*设置是否被锁定 
	*/
	public M setLockingStatus(java.lang.Integer lockingStatus) {
		set("lockingStatus", lockingStatus);
		return (M)this;
	}

	/**
	*获取是否被锁定 
	*/
	public java.lang.Integer getLockingStatus() {
		return getInt("lockingStatus");
	}

	/**
	*设置被锁定部门id 
	*/
	public M setLockingSiteId(java.lang.Integer lockingSiteId) {
		set("locking_site_id", lockingSiteId);
		return (M)this;
	}

	/**
	*获取被锁定部门id 
	*/
	public java.lang.Integer getLockingSiteId() {
		return getInt("locking_site_id");
	}

	/**
	*设置经办机构id 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取经办机构id 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
	}

}
