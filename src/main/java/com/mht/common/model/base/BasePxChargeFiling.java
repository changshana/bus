package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_charge_filing:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxChargeFiling<M extends BasePxChargeFiling<M>> extends Model<M> implements IBean {

	/**
	*设置备案id 
	*/
	public M setFilingId(java.lang.Integer filingId) {
		set("filing_id", filingId);
		return (M)this;
	}

	/**
	*获取备案id 
	*/
	public java.lang.Integer getFilingId() {
		return getInt("filing_id");
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
	*设置学员报名id 
	*/
	public M setEnrollId(java.lang.Integer enrollId) {
		set("enroll_id", enrollId);
		return (M)this;
	}

	/**
	*获取学员报名id 
	*/
	public java.lang.Integer getEnrollId() {
		return getInt("enroll_id");
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
	*设置缴费日期 
	*/
	public M setChargeDatetime(java.util.Date chargeDatetime) {
		set("charge_datetime", chargeDatetime);
		return (M)this;
	}

	/**
	*获取缴费日期 
	*/
	public java.util.Date getChargeDatetime() {
		return get("charge_datetime");
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
	*设置是否全额缴费 
	*/
	public M setIsCharge(java.lang.Integer isCharge) {
		set("is_charge", isCharge);
		return (M)this;
	}

	/**
	*获取是否全额缴费 
	*/
	public java.lang.Integer getIsCharge() {
		return getInt("is_charge");
	}

	/**
	*设置缴费单据地址 
	*/
	public M setChargeBillsAddress(java.lang.String chargeBillsAddress) {
		set("charge_bills_address", chargeBillsAddress);
		return (M)this;
	}

	/**
	*获取缴费单据地址 
	*/
	public java.lang.String getChargeBillsAddress() {
		return getStr("charge_bills_address");
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

}
