package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_duty_person:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDutyPerson<M extends BaseRepairDutyPerson<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setRdpId(java.lang.Integer rdpId) {
		set("rdp_id", rdpId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRdpId() {
		return getInt("rdp_id");
	}

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
	public M setRdgId(java.lang.Integer rdgId) {
		set("rdg_id", rdgId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRdgId() {
		return getInt("rdg_id");
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
	public M setDutyTypeId(java.lang.Integer dutyTypeId) {
		set("duty_type_id", dutyTypeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDutyTypeId() {
		return getInt("duty_type_id");
	}

}
