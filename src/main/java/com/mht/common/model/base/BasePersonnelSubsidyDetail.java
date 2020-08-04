package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_subsidy_detail:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelSubsidyDetail<M extends BasePersonnelSubsidyDetail<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSubsidyDetailId(java.lang.Integer subsidyDetailId) {
		set("subsidy_detail_id", subsidyDetailId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSubsidyDetailId() {
		return getInt("subsidy_detail_id");
	}

	/**
	*设置津补贴信息ID 
	*/
	public M setSubsidyId(java.lang.Integer subsidyId) {
		set("subsidy_id", subsidyId);
		return (M)this;
	}

	/**
	*获取津补贴信息ID 
	*/
	public java.lang.Integer getSubsidyId() {
		return getInt("subsidy_id");
	}

	/**
	*设置津补贴具体项目 
	*/
	public M setSubsidyItem(java.lang.String subsidyItem) {
		set("subsidy_item", subsidyItem);
		return (M)this;
	}

	/**
	*获取津补贴具体项目 
	*/
	public java.lang.String getSubsidyItem() {
		return getStr("subsidy_item");
	}

	/**
	*设置津补贴标准id 
	*/
	public M setSubsidyStandardId(java.lang.Integer subsidyStandardId) {
		set("subsidy_standard_id", subsidyStandardId);
		return (M)this;
	}

	/**
	*获取津补贴标准id 
	*/
	public java.lang.Integer getSubsidyStandardId() {
		return getInt("subsidy_standard_id");
	}

	/**
	*设置津补贴类别 
	*/
	public M setSubsidyType(java.lang.Integer subsidyType) {
		set("subsidy_type", subsidyType);
		return (M)this;
	}

	/**
	*获取津补贴类别 
	*/
	public java.lang.Integer getSubsidyType() {
		return getInt("subsidy_type");
	}

	/**
	*设置津补贴具体项标准 
	*/
	public M setSubsidyItemStandard(java.lang.String subsidyItemStandard) {
		set("subsidy_item_standard", subsidyItemStandard);
		return (M)this;
	}

	/**
	*获取津补贴具体项标准 
	*/
	public java.lang.String getSubsidyItemStandard() {
		return getStr("subsidy_item_standard");
	}

	/**
	*设置金额 
	*/
	public M setMoney(java.math.BigDecimal money) {
		set("money", money);
		return (M)this;
	}

	/**
	*获取金额 
	*/
	public java.math.BigDecimal getMoney() {
		return get("money");
	}

	/**
	*设置发放时间 
	*/
	public M setGrantTime(java.lang.String grantTime) {
		set("grant_time", grantTime);
		return (M)this;
	}

	/**
	*获取发放时间 
	*/
	public java.lang.String getGrantTime() {
		return getStr("grant_time");
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
	*设置修改人 
	*/
	public M setUpdatePerson(java.lang.String updatePerson) {
		set("update_person", updatePerson);
		return (M)this;
	}

	/**
	*获取修改人 
	*/
	public java.lang.String getUpdatePerson() {
		return getStr("update_person");
	}

	/**
	*设置修改时间 
	*/
	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}

	/**
	*获取修改时间 
	*/
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	/**
	*设置修改理由 
	*/
	public M setUpdateReason(java.lang.String updateReason) {
		set("update_reason", updateReason);
		return (M)this;
	}

	/**
	*获取修改理由 
	*/
	public java.lang.String getUpdateReason() {
		return getStr("update_reason");
	}

	/**
	*设置 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
	}

}
