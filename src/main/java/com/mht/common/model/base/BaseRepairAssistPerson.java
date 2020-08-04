package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_assist_person:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairAssistPerson<M extends BaseRepairAssistPerson<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setAssistPersonId(java.lang.Integer assistPersonId) {
		set("assist_person_id", assistPersonId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAssistPersonId() {
		return getInt("assist_person_id");
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
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
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

}
