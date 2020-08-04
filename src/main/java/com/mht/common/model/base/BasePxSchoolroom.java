package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_schoolroom:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxSchoolroom<M extends BasePxSchoolroom<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSchoolroomId(java.lang.Integer schoolroomId) {
		set("schoolroom_id", schoolroomId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSchoolroomId() {
		return getInt("schoolroom_id");
	}

	/**
	*设置学校id 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取学校id 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
	}

	/**
	*设置教室名称 
	*/
	public M setSchoolroomName(java.lang.String schoolroomName) {
		set("schoolroom_name", schoolroomName);
		return (M)this;
	}

	/**
	*获取教室名称 
	*/
	public java.lang.String getSchoolroomName() {
		return getStr("schoolroom_name");
	}

	/**
	*设置容纳人数 
	*/
	public M setPersonCount(java.lang.Integer personCount) {
		set("person_count", personCount);
		return (M)this;
	}

	/**
	*获取容纳人数 
	*/
	public java.lang.Integer getPersonCount() {
		return getInt("person_count");
	}

	/**
	*设置教室面积 
	*/
	public M setArea(java.lang.String area) {
		set("area", area);
		return (M)this;
	}

	/**
	*获取教室面积 
	*/
	public java.lang.String getArea() {
		return getStr("area");
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

}
