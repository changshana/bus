package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_approval:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryApproval<M extends BaseDormitoryApproval<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApprovalId(java.lang.Integer approvalId) {
		set("approval_id", approvalId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApprovalId() {
		return getInt("approval_id");
	}

	/**
	*设置业务流水id 
	*/
	public M setOperationId(java.lang.Integer operationId) {
		set("operation_id", operationId);
		return (M)this;
	}

	/**
	*获取业务流水id 
	*/
	public java.lang.Integer getOperationId() {
		return getInt("operation_id");
	}

	/**
	*设置审核状态 
	*/
	public M setApprovalStatus(java.lang.Integer approvalStatus) {
		set("approval_status", approvalStatus);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getApprovalStatus() {
		return getInt("approval_status");
	}

	/**
	*设置审核时间 
	*/
	public M setApprovalDate(java.util.Date approvalDate) {
		set("approval_date", approvalDate);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.util.Date getApprovalDate() {
		return get("approval_date");
	}

	/**
	*设置审核人 
	*/
	public M setApprovalPerson(java.lang.String approvalPerson) {
		set("approval_person", approvalPerson);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getApprovalPerson() {
		return getStr("approval_person");
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
	*设置审核业务类型 
	*/
	public M setApprovalType(java.lang.String approvalType) {
		set("approval_type", approvalType);
		return (M)this;
	}

	/**
	*获取审核业务类型 
	*/
	public java.lang.String getApprovalType() {
		return getStr("approval_type");
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

}
