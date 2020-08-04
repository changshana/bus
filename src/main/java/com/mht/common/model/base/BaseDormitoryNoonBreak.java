package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_noon_break:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryNoonBreak<M extends BaseDormitoryNoonBreak<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setBreakId(java.lang.Integer breakId) {
		set("break_id", breakId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getBreakId() {
		return getInt("break_id");
	}

	/**
	*设置姓名 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getName() {
		return getStr("name");
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
	*设置工号 
	*/
	public M setJobNum(java.lang.String jobNum) {
		set("job_num", jobNum);
		return (M)this;
	}

	/**
	*获取工号 
	*/
	public java.lang.String getJobNum() {
		return getStr("job_num");
	}

	/**
	*设置身份证号 
	*/
	public M setIdentityCard(java.lang.String identityCard) {
		set("identity_card", identityCard);
		return (M)this;
	}

	/**
	*获取身份证号 
	*/
	public java.lang.String getIdentityCard() {
		return getStr("identity_card");
	}

	/**
	*设置申请日期 
	*/
	public M setApplyTime(java.util.Date applyTime) {
		set("apply_time", applyTime);
		return (M)this;
	}

	/**
	*获取申请日期 
	*/
	public java.util.Date getApplyTime() {
		return get("apply_time");
	}

	/**
	*设置入住日期 
	*/
	public M setInTime(java.util.Date inTime) {
		set("in_time", inTime);
		return (M)this;
	}

	/**
	*获取入住日期 
	*/
	public java.util.Date getInTime() {
		return get("in_time");
	}

	/**
	*设置申请床位id 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取申请床位id 
	*/
	public java.lang.Integer getBedId() {
		return getInt("bed_id");
	}

	/**
	*设置住宿状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取住宿状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置审核状态 
	*/
	public M setAuditStatus(java.lang.Integer auditStatus) {
		set("audit_status", auditStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getAuditStatus() {
		return getInt("audit_status");
	}

	/**
	*设置审核不通过原因 
	*/
	public M setAuditReason(java.lang.String auditReason) {
		set("audit_reason", auditReason);
		return (M)this;
	}

	/**
	*获取审核不通过原因 
	*/
	public java.lang.String getAuditReason() {
		return getStr("audit_reason");
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
	*设置申请原因 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取申请原因 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
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
