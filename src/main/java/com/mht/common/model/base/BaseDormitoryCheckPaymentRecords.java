package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_check_payment_records:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCheckPaymentRecords<M extends BaseDormitoryCheckPaymentRecords<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
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
	*设置缴费学年 
	*/
	public M setYear(java.lang.String year) {
		set("year", year);
		return (M)this;
	}

	/**
	*获取缴费学年 
	*/
	public java.lang.String getYear() {
		return getStr("year");
	}

	/**
	*设置缴费金额 
	*/
	public M setMoney(java.lang.String money) {
		set("money", money);
		return (M)this;
	}

	/**
	*获取缴费金额 
	*/
	public java.lang.String getMoney() {
		return getStr("money");
	}

	/**
	*设置收费方式 
	*/
	public M setPayType(java.lang.Integer payType) {
		set("pay_type", payType);
		return (M)this;
	}

	/**
	*获取收费方式 
	*/
	public java.lang.Integer getPayType() {
		return getInt("pay_type");
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

}
