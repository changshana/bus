package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_annual_bonus_apply:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelAnnualBonusApply<M extends BasePersonnelAnnualBonusApply<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApplyId(java.lang.Integer applyId) {
		set("apply_id", applyId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApplyId() {
		return getInt("apply_id");
	}

	/**
	*设置员工id 
	*/
	public M setStaffInfoId(java.lang.Integer staffInfoId) {
		set("staff_info_id", staffInfoId);
		return (M)this;
	}

	/**
	*获取员工id 
	*/
	public java.lang.Integer getStaffInfoId() {
		return getInt("staff_info_id");
	}

	/**
	*设置发放年月（YYYYMM） 
	*/
	public M setGrantTime(java.lang.String grantTime) {
		set("grant_time", grantTime);
		return (M)this;
	}

	/**
	*获取发放年月（YYYYMM） 
	*/
	public java.lang.String getGrantTime() {
		return getStr("grant_time");
	}

	/**
	*设置发放金额 
	*/
	public M setGrantSum(java.math.BigDecimal grantSum) {
		set("grant_sum", grantSum);
		return (M)this;
	}

	/**
	*获取发放金额 
	*/
	public java.math.BigDecimal getGrantSum() {
		return get("grant_sum");
	}

	/**
	*设置说明 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取说明 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
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
	*设置审核状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取审核状态 
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
