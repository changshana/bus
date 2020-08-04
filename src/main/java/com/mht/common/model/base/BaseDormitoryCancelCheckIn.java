package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_cancel_check_in:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCancelCheckIn<M extends BaseDormitoryCancelCheckIn<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCancelId(java.lang.Integer cancelId) {
		set("cancel_id", cancelId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCancelId() {
		return getInt("cancel_id");
	}

	/**
	*设置学生ID 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学生ID 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置床位ID 
	*/
	public M setBedId(java.lang.Integer bedId) {
		set("bed_id", bedId);
		return (M)this;
	}

	/**
	*获取床位ID 
	*/
	public java.lang.Integer getBedId() {
		return getInt("bed_id");
	}

	/**
	*设置操作人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取操作人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置操作时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取操作时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置备注（取消原因） 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取备注（取消原因） 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}
