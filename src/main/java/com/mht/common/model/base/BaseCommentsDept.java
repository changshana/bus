package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comments_dept:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentsDept<M extends BaseCommentsDept<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setDeptId(java.lang.Integer deptId) {
		set("dept_id", deptId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getDeptId() {
		return getInt("dept_id");
	}

	/**
	*设置部门名称 
	*/
	public M setDeptName(java.lang.String deptName) {
		set("dept_name", deptName);
		return (M)this;
	}

	/**
	*获取部门名称 
	*/
	public java.lang.String getDeptName() {
		return getStr("dept_name");
	}

	/**
	*设置部门点赞 
	*/
	public M setDeptLaud(java.lang.Integer deptLaud) {
		set("dept_laud", deptLaud);
		return (M)this;
	}

	/**
	*获取部门点赞 
	*/
	public java.lang.Integer getDeptLaud() {
		return getInt("dept_laud");
	}

	/**
	*设置部门回复时间 
	*/
	public M setDeptReplyTime(java.lang.Integer deptReplyTime) {
		set("dept_reply_time", deptReplyTime);
		return (M)this;
	}

	/**
	*获取部门回复时间 
	*/
	public java.lang.Integer getDeptReplyTime() {
		return getInt("dept_reply_time");
	}

	/**
	*设置校区 
	*/
	public M setZone(java.lang.Integer zone) {
		set("zone", zone);
		return (M)this;
	}

	/**
	*获取校区 
	*/
	public java.lang.Integer getZone() {
		return getInt("zone");
	}

	/**
	*设置所属部门人员 
	*/
	public M setPerson(java.lang.String person) {
		set("person", person);
		return (M)this;
	}

	/**
	*获取所属部门人员 
	*/
	public java.lang.String getPerson() {
		return getStr("person");
	}

}
