package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_person:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairPerson<M extends BaseRepairPerson<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setPersonId(java.lang.Integer personId) {
		set("person_id", personId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getPersonId() {
		return getInt("person_id");
	}

	/**
	*设置 
	*/
	public M setPersonName(java.lang.String personName) {
		set("person_name", personName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPersonName() {
		return getStr("person_name");
	}

	/**
	*设置 
	*/
	public M setCid(java.lang.String cid) {
		set("cid", cid);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCid() {
		return getStr("cid");
	}

	/**
	*设置 
	*/
	public M setPersonImg(java.lang.String personImg) {
		set("person_img", personImg);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPersonImg() {
		return getStr("person_img");
	}

	/**
	*设置 
	*/
	public M setPersonCode(java.lang.String personCode) {
		set("person_code", personCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPersonCode() {
		return getStr("person_code");
	}

	/**
	*设置 
	*/
	public M setPersonGroup(java.lang.Integer personGroup) {
		set("person_group", personGroup);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getPersonGroup() {
		return getInt("person_group");
	}

	/**
	*设置 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
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
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	*设置 
	*/
	public M setGender(java.lang.String gender) {
		set("gender", gender);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getGender() {
		return getStr("gender");
	}

	/**
	*设置 
	*/
	public M setGroupLeader(java.lang.Integer groupLeader) {
		set("group_leader", groupLeader);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGroupLeader() {
		return getInt("group_leader");
	}

	/**
	*设置 
	*/
	public M setPassword(java.lang.String password) {
		set("password", password);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPassword() {
		return getStr("password");
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

}
