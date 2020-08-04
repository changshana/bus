package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_recruit_plan:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelRecruitPlan<M extends BasePersonnelRecruitPlan<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRecruitPlanId(java.lang.Integer recruitPlanId) {
		set("recruit_plan_id", recruitPlanId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRecruitPlanId() {
		return getInt("recruit_plan_id");
	}

	/**
	*设置名称 
	*/
	public M setRecruitPlanName(java.lang.String recruitPlanName) {
		set("recruit_plan_name", recruitPlanName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getRecruitPlanName() {
		return getStr("recruit_plan_name");
	}

	/**
	*设置所属中心 
	*/
	public M setCenterNo(java.lang.Integer centerNo) {
		set("center_no", centerNo);
		return (M)this;
	}

	/**
	*获取所属中心 
	*/
	public java.lang.Integer getCenterNo() {
		return getInt("center_no");
	}

	/**
	*设置所属部门 
	*/
	public M setDeptNo(java.lang.Integer deptNo) {
		set("dept_no", deptNo);
		return (M)this;
	}

	/**
	*获取所属部门 
	*/
	public java.lang.Integer getDeptNo() {
		return getInt("dept_no");
	}

	/**
	*设置岗位id 
	*/
	public M setPostId(java.lang.Integer postId) {
		set("post_id", postId);
		return (M)this;
	}

	/**
	*获取岗位id 
	*/
	public java.lang.Integer getPostId() {
		return getInt("post_id");
	}

	/**
	*设置招聘形式 
	*/
	public M setRecruitType(java.lang.String recruitType) {
		set("recruit_type", recruitType);
		return (M)this;
	}

	/**
	*获取招聘形式 
	*/
	public java.lang.String getRecruitType() {
		return getStr("recruit_type");
	}

	/**
	*设置招聘渠道id 
	*/
	public M setRecruitChannelId(java.lang.String recruitChannelId) {
		set("recruit_channel_id", recruitChannelId);
		return (M)this;
	}

	/**
	*获取招聘渠道id 
	*/
	public java.lang.String getRecruitChannelId() {
		return getStr("recruit_channel_id");
	}

	/**
	*设置是否是临时岗 
	*/
	public M setIsTemporary(java.lang.Integer isTemporary) {
		set("isTemporary", isTemporary);
		return (M)this;
	}

	/**
	*获取是否是临时岗 
	*/
	public java.lang.Integer getIsTemporary() {
		return getInt("isTemporary");
	}

	/**
	*设置临时岗说明 
	*/
	public M setTemporaryJobNote(java.lang.String temporaryJobNote) {
		set("temporary_job_note", temporaryJobNote);
		return (M)this;
	}

	/**
	*获取临时岗说明 
	*/
	public java.lang.String getTemporaryJobNote() {
		return getStr("temporary_job_note");
	}

	/**
	*设置招聘原因 
	*/
	public M setRecruitReason(java.lang.String recruitReason) {
		set("recruit_reason", recruitReason);
		return (M)this;
	}

	/**
	*获取招聘原因 
	*/
	public java.lang.String getRecruitReason() {
		return getStr("recruit_reason");
	}

	/**
	*设置招聘人数 
	*/
	public M setRecruitNumber(java.lang.Integer recruitNumber) {
		set("recruit_number", recruitNumber);
		return (M)this;
	}

	/**
	*获取招聘人数 
	*/
	public java.lang.Integer getRecruitNumber() {
		return getInt("recruit_number");
	}

	/**
	*设置开始日期 
	*/
	public M setStartDate(java.util.Date startDate) {
		set("start_date", startDate);
		return (M)this;
	}

	/**
	*获取开始日期 
	*/
	public java.util.Date getStartDate() {
		return get("start_date");
	}

	/**
	*设置结束日期 
	*/
	public M setEndDate(java.util.Date endDate) {
		set("end_date", endDate);
		return (M)this;
	}

	/**
	*获取结束日期 
	*/
	public java.util.Date getEndDate() {
		return get("end_date");
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

	/**
	*设置招聘形式描述 
	*/
	public M setRecruitTypeDesc(java.lang.String recruitTypeDesc) {
		set("recruit_type_desc", recruitTypeDesc);
		return (M)this;
	}

	/**
	*获取招聘形式描述 
	*/
	public java.lang.String getRecruitTypeDesc() {
		return getStr("recruit_type_desc");
	}

	/**
	*设置招聘渠道描述 
	*/
	public M setRecruitChannelDesc(java.lang.String recruitChannelDesc) {
		set("recruit_channel_desc", recruitChannelDesc);
		return (M)this;
	}

	/**
	*获取招聘渠道描述 
	*/
	public java.lang.String getRecruitChannelDesc() {
		return getStr("recruit_channel_desc");
	}

}
