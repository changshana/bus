package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_seniority_allowance_standard:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelSeniorityAllowanceStandard<M extends BasePersonnelSeniorityAllowanceStandard<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setStandardId(java.lang.Integer standardId) {
		set("standard_id", standardId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getStandardId() {
		return getInt("standard_id");
	}

	/**
	*设置工作年限 
	*/
	public M setWorkExperience(java.lang.String workExperience) {
		set("work_experience", workExperience);
		return (M)this;
	}

	/**
	*获取工作年限 
	*/
	public java.lang.String getWorkExperience() {
		return getStr("work_experience");
	}

	/**
	*设置计算方式(递增或增加) 
	*/
	public M setComputeMode(java.lang.String computeMode) {
		set("compute_mode", computeMode);
		return (M)this;
	}

	/**
	*获取计算方式(递增或增加) 
	*/
	public java.lang.String getComputeMode() {
		return getStr("compute_mode");
	}

	/**
	*设置计算金额 
	*/
	public M setComputeAmount(java.lang.Integer computeAmount) {
		set("compute_amount", computeAmount);
		return (M)this;
	}

	/**
	*获取计算金额 
	*/
	public java.lang.Integer getComputeAmount() {
		return getInt("compute_amount");
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

}
