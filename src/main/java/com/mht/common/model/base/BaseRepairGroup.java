package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_group:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairGroup<M extends BaseRepairGroup<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置 
	*/
	public M setGroupName(java.lang.String groupName) {
		set("group_name", groupName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getGroupName() {
		return getStr("group_name");
	}

	/**
	*设置 
	*/
	public M setGroupCode(java.lang.String groupCode) {
		set("group_code", groupCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getGroupCode() {
		return getStr("group_code");
	}

	/**
	*设置 
	*/
	public M setParent(java.lang.String parent) {
		set("parent", parent);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getParent() {
		return getStr("parent");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置 
	*/
	public M setSchoolZone(java.lang.Integer schoolZone) {
		set("school_zone", schoolZone);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getSchoolZone() {
		return getInt("school_zone");
	}

	/**
	*设置 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置 
	*/
	public M setGroupType(java.lang.Integer groupType) {
		set("group_type", groupType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGroupType() {
		return getInt("group_type");
	}

}
