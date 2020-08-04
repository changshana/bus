package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_bills_owner:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairBillsOwner<M extends BaseRepairBillsOwner<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setBillsOwnerId(java.lang.Integer billsOwnerId) {
		set("bills_owner_id", billsOwnerId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getBillsOwnerId() {
		return getInt("bills_owner_id");
	}

	/**
	*设置报修单ID 
	*/
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取报修单ID 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
	}

	/**
	*设置值班组ID 
	*/
	public M setRdgId(java.lang.Integer rdgId) {
		set("rdg_id", rdgId);
		return (M)this;
	}

	/**
	*获取值班组ID 
	*/
	public java.lang.Integer getRdgId() {
		return getInt("rdg_id");
	}

	/**
	*设置班组ID 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取班组ID 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
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

}
