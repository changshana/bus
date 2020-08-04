package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_dept:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentDept<M extends BaseCommentDept<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setDeptId(java.lang.Long deptId) {
		set("dept_id", deptId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getDeptId() {
		return getLong("dept_id");
	}

	/**
	*设置 
	*/
	public M setDeptLaud(java.lang.Integer deptLaud) {
		set("dept_laud", deptLaud);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDeptLaud() {
		return getInt("dept_laud");
	}

	/**
	*设置 
	*/
	public M setDeptName(java.lang.String deptName) {
		set("dept_name", deptName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDeptName() {
		return getStr("dept_name");
	}

	/**
	*设置 
	*/
	public M setDeptReplycountall(java.lang.Long deptReplycountall) {
		set("dept_replycountAll", deptReplycountall);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getDeptReplycountall() {
		return getLong("dept_replycountAll");
	}

	/**
	*设置 
	*/
	public M setDeptReplycount(java.lang.Integer deptReplycount) {
		set("dept_replycount", deptReplycount);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDeptReplycount() {
		return getInt("dept_replycount");
	}

	/**
	*设置 
	*/
	public M setDeptReplydate(java.lang.Long deptReplydate) {
		set("dept_replydate", deptReplydate);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getDeptReplydate() {
		return getLong("dept_replydate");
	}

	/**
	*设置 
	*/
	public M setDeptTopcount(java.lang.Long deptTopcount) {
		set("dept_topCount", deptTopcount);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getDeptTopcount() {
		return getLong("dept_topCount");
	}

	/**
	*设置 
	*/
	public M setSysproserviceProsId(java.lang.Long sysproserviceProsId) {
		set("sysProservice_pros_id", sysproserviceProsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSysproserviceProsId() {
		return getLong("sysProservice_pros_id");
	}

	/**
	*设置 
	*/
	public M setProId(java.lang.String proId) {
		set("proId", proId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getProId() {
		return getStr("proId");
	}

	/**
	*设置 
	*/
	public M setDeptStep(java.lang.String deptStep) {
		set("dept_step", deptStep);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDeptStep() {
		return getStr("dept_step");
	}

}
