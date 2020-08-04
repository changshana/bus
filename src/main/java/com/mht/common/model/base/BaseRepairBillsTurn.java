package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_bills_turn:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairBillsTurn<M extends BaseRepairBillsTurn<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setBillsTurnId(java.lang.Integer billsTurnId) {
		set("bills_turn_id", billsTurnId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getBillsTurnId() {
		return getInt("bills_turn_id");
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
	*设置源组ID 
	*/
	public M setSrcGroupId(java.lang.Integer srcGroupId) {
		set("src_group_id", srcGroupId);
		return (M)this;
	}

	/**
	*获取源组ID 
	*/
	public java.lang.Integer getSrcGroupId() {
		return getInt("src_group_id");
	}

	/**
	*设置源值班组ID 
	*/
	public M setSrcDutyGroupId(java.lang.Integer srcDutyGroupId) {
		set("src_duty_group_id", srcDutyGroupId);
		return (M)this;
	}

	/**
	*获取源值班组ID 
	*/
	public java.lang.Integer getSrcDutyGroupId() {
		return getInt("src_duty_group_id");
	}

	/**
	*设置转单人 
	*/
	public M setSrcUser(java.lang.String srcUser) {
		set("src_user", srcUser);
		return (M)this;
	}

	/**
	*获取转单人 
	*/
	public java.lang.String getSrcUser() {
		return getStr("src_user");
	}

	/**
	*设置转单人姓名 
	*/
	public M setSrcUserName(java.lang.String srcUserName) {
		set("src_user_name", srcUserName);
		return (M)this;
	}

	/**
	*获取转单人姓名 
	*/
	public java.lang.String getSrcUserName() {
		return getStr("src_user_name");
	}

	/**
	*设置目标组ID 
	*/
	public M setDistGroupId(java.lang.Integer distGroupId) {
		set("dist_group_id", distGroupId);
		return (M)this;
	}

	/**
	*获取目标组ID 
	*/
	public java.lang.Integer getDistGroupId() {
		return getInt("dist_group_id");
	}

	/**
	*设置目标值班组ID 
	*/
	public M setDistDutyGroupId(java.lang.Integer distDutyGroupId) {
		set("dist_duty_group_id", distDutyGroupId);
		return (M)this;
	}

	/**
	*获取目标值班组ID 
	*/
	public java.lang.Integer getDistDutyGroupId() {
		return getInt("dist_duty_group_id");
	}

	/**
	*设置目标用户 
	*/
	public M setDistUser(java.lang.String distUser) {
		set("dist_user", distUser);
		return (M)this;
	}

	/**
	*获取目标用户 
	*/
	public java.lang.String getDistUser() {
		return getStr("dist_user");
	}

	/**
	*设置目标用户姓名 
	*/
	public M setDistUserName(java.lang.String distUserName) {
		set("dist_user_name", distUserName);
		return (M)this;
	}

	/**
	*获取目标用户姓名 
	*/
	public java.lang.String getDistUserName() {
		return getStr("dist_user_name");
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
