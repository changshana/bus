package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_person_bills:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairPersonBills<M extends BaseRepairPersonBills<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPersonBillsId(java.lang.Integer personBillsId) {
		set("person_bills_id", personBillsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPersonBillsId() {
		return getInt("person_bills_id");
	}

	/**
	*设置人员 
	*/
	public M setPersonId(java.lang.Integer personId) {
		set("person_id", personId);
		return (M)this;
	}

	/**
	*获取人员 
	*/
	public java.lang.Integer getPersonId() {
		return getInt("person_id");
	}

	/**
	*设置报修单 
	*/
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取报修单 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
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
	*设置 
	*/
	public M setCreatorName(java.lang.String creatorName) {
		set("creator_name", creatorName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreatorName() {
		return getStr("creator_name");
	}

}
