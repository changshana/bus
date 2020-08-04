package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_pay_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxPayRecord<M extends BasePxPayRecord<M>> extends Model<M> implements IBean {

	/**
	*设置缴费记录id 
	*/
	public M setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	/**
	*获取缴费记录id 
	*/
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
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
	*设置学员id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学员id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置班级id 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取班级id 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
	}

	/**
	*设置缴费金额 
	*/
	public M setChargeMoney(java.lang.Double chargeMoney) {
		set("charge_money", chargeMoney);
		return (M)this;
	}

	/**
	*获取缴费金额 
	*/
	public java.lang.Double getChargeMoney() {
		return getDouble("charge_money");
	}

	/**
	*设置缴费凭证 
	*/
	public M setChargeProof(java.lang.String chargeProof) {
		set("charge_proof", chargeProof);
		return (M)this;
	}

	/**
	*获取缴费凭证 
	*/
	public java.lang.String getChargeProof() {
		return getStr("charge_proof");
	}

	/**
	*设置缴费时间 
	*/
	public M setChargeTime(java.util.Date chargeTime) {
		set("charge_time", chargeTime);
		return (M)this;
	}

	/**
	*获取缴费时间 
	*/
	public java.util.Date getChargeTime() {
		return get("charge_time");
	}

	/**
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
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

	/**
	*设置收费人姓名 
	*/
	public M setChargePerson(java.lang.String chargePerson) {
		set("charge_person", chargePerson);
		return (M)this;
	}

	/**
	*获取收费人姓名 
	*/
	public java.lang.String getChargePerson() {
		return getStr("charge_person");
	}

}
