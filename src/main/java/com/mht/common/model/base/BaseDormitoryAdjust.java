package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_adjust:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryAdjust<M extends BaseDormitoryAdjust<M>> extends Model<M> implements IBean {

	/**
	*设置调宿ID 
	*/
	public M setAdjustId(java.lang.Integer adjustId) {
		set("adjust_id", adjustId);
		return (M)this;
	}

	/**
	*获取调宿ID 
	*/
	public java.lang.Integer getAdjustId() {
		return getInt("adjust_id");
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
	*设置调前床位id 
	*/
	public M setBeforeBedId(java.lang.Integer beforeBedId) {
		set("before_bed_id", beforeBedId);
		return (M)this;
	}

	/**
	*获取调前床位id 
	*/
	public java.lang.Integer getBeforeBedId() {
		return getInt("before_bed_id");
	}

	/**
	*设置调后床位id 
	*/
	public M setAfterBedId(java.lang.Integer afterBedId) {
		set("after_bed_id", afterBedId);
		return (M)this;
	}

	/**
	*获取调后床位id 
	*/
	public java.lang.Integer getAfterBedId() {
		return getInt("after_bed_id");
	}

	/**
	*设置调宿日期 
	*/
	public M setAdjustDate(java.util.Date adjustDate) {
		set("adjust_date", adjustDate);
		return (M)this;
	}

	/**
	*获取调宿日期 
	*/
	public java.util.Date getAdjustDate() {
		return get("adjust_date");
	}

	/**
	*设置调宿原因 
	*/
	public M setAdjustReason(java.lang.String adjustReason) {
		set("adjust_reason", adjustReason);
		return (M)this;
	}

	/**
	*获取调宿原因 
	*/
	public java.lang.String getAdjustReason() {
		return getStr("adjust_reason");
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
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置创建日期 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
