package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_counselor_visite:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCounselorVisite<M extends BaseDormitoryCounselorVisite<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setVisiteId(java.lang.Integer visiteId) {
		set("visite_id", visiteId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getVisiteId() {
		return getInt("visite_id");
	}

	/**
	*设置人员类别 
	*/
	public M setPersonType(java.lang.Integer personType) {
		set("person_type", personType);
		return (M)this;
	}

	/**
	*获取人员类别 
	*/
	public java.lang.Integer getPersonType() {
		return getInt("person_type");
	}

	/**
	*设置人员姓名 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取人员姓名 
	*/
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	*设置到访时间 
	*/
	public M setVisiteTime(java.util.Date visiteTime) {
		set("visite_time", visiteTime);
		return (M)this;
	}

	/**
	*获取到访时间 
	*/
	public java.util.Date getVisiteTime() {
		return get("visite_time");
	}

	/**
	*设置学院年级 
	*/
	public M setDepartmentClass(java.lang.String departmentClass) {
		set("department_class", departmentClass);
		return (M)this;
	}

	/**
	*获取学院年级 
	*/
	public java.lang.String getDepartmentClass() {
		return getStr("department_class");
	}

	/**
	*设置校区id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取校区id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置组团id 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取组团id 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置楼宇id 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取楼宇id 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
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
