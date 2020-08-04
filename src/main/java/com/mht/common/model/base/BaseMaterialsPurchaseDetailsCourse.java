package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_purchase_details_course:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsPurchaseDetailsCourse<M extends BaseMaterialsPurchaseDetailsCourse<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPurchaseDetailsCourseId(java.lang.Integer purchaseDetailsCourseId) {
		set("purchase_details_course_id", purchaseDetailsCourseId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPurchaseDetailsCourseId() {
		return getInt("purchase_details_course_id");
	}

	/**
	*设置材料采购单ID 
	*/
	public M setPurchaseBillsId(java.lang.Integer purchaseBillsId) {
		set("purchase_bills_id", purchaseBillsId);
		return (M)this;
	}

	/**
	*获取材料采购单ID 
	*/
	public java.lang.Integer getPurchaseBillsId() {
		return getInt("purchase_bills_id");
	}

	/**
	*设置审核时间 
	*/
	public M setCheckTime(java.util.Date checkTime) {
		set("check_time", checkTime);
		return (M)this;
	}

	/**
	*获取审核时间 
	*/
	public java.util.Date getCheckTime() {
		return get("check_time");
	}

	/**
	*设置提交时间 
	*/
	public M setSubmitTime(java.util.Date submitTime) {
		set("submit_time", submitTime);
		return (M)this;
	}

	/**
	*获取提交时间 
	*/
	public java.util.Date getSubmitTime() {
		return get("submit_time");
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
	*设置审核人 
	*/
	public M setCheckPerson(java.lang.String checkPerson) {
		set("check_person", checkPerson);
		return (M)this;
	}

	/**
	*获取审核人 
	*/
	public java.lang.String getCheckPerson() {
		return getStr("check_person");
	}

}
