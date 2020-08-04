package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_apply_audit_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostApplyAuditRecord<M extends BasePersonnelPostApplyAuditRecord<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
	}

	/**
	*设置申请记录ID 
	*/
	public M setApplyId(java.lang.Integer applyId) {
		set("apply_id", applyId);
		return (M)this;
	}

	/**
	*获取申请记录ID 
	*/
	public java.lang.Integer getApplyId() {
		return getInt("apply_id");
	}

	/**
	*设置审核时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置审核人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
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
	*设置审核备注 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取审核备注 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置审核类型（eg:增岗增编） 
	*/
	public M setType(java.lang.String type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取审核类型（eg:增岗增编） 
	*/
	public java.lang.String getType() {
		return getStr("type");
	}

	/**
	*设置创建时间 
	*/
	public M setOtherTime(java.util.Date otherTime) {
		set("other_time", otherTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getOtherTime() {
		return get("other_time");
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
