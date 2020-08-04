package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_emp_blacklist:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelEmpBlacklist<M extends BasePersonnelEmpBlacklist<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setBlacklistId(java.lang.Integer blacklistId) {
		set("blacklist_id", blacklistId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getBlacklistId() {
		return getInt("blacklist_id");
	}

	/**
	*设置员工备案ID 
	*/
	public M setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	/**
	*获取员工备案ID 
	*/
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
	}

	/**
	*设置加入黑名单原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取加入黑名单原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
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
	*设置原岗位ID 
	*/
	public M setPostId(java.lang.Integer postId) {
		set("post_id", postId);
		return (M)this;
	}

	/**
	*获取原岗位ID 
	*/
	public java.lang.Integer getPostId() {
		return getInt("post_id");
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

}
