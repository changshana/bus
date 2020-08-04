package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_black_list:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelBlackList<M extends BasePersonnelBlackList<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setBlackListId(java.lang.Integer blackListId) {
		set("black_list_id", blackListId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getBlackListId() {
		return getInt("black_list_id");
	}

	/**
	*设置姓名 
	*/
	public M setBlackName(java.lang.String blackName) {
		set("black_name", blackName);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getBlackName() {
		return getStr("black_name");
	}

	/**
	*设置身份证号 
	*/
	public M setBlackCard(java.lang.String blackCard) {
		set("black_card", blackCard);
		return (M)this;
	}

	/**
	*获取身份证号 
	*/
	public java.lang.String getBlackCard() {
		return getStr("black_card");
	}

	/**
	*设置性别 
	*/
	public M setBlackSex(java.lang.Integer blackSex) {
		set("black_sex", blackSex);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.Integer getBlackSex() {
		return getInt("black_sex");
	}

	/**
	*设置工作经历 
	*/
	public M setBlackWorkExperience(java.lang.String blackWorkExperience) {
		set("black_work_experience", blackWorkExperience);
		return (M)this;
	}

	/**
	*获取工作经历 
	*/
	public java.lang.String getBlackWorkExperience() {
		return getStr("black_work_experience");
	}

	/**
	*设置联系电话 
	*/
	public M setBlackPhone(java.lang.String blackPhone) {
		set("black_phone", blackPhone);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getBlackPhone() {
		return getStr("black_phone");
	}

	/**
	*设置邮箱 
	*/
	public M setBlackEmail(java.lang.String blackEmail) {
		set("black_email", blackEmail);
		return (M)this;
	}

	/**
	*获取邮箱 
	*/
	public java.lang.String getBlackEmail() {
		return getStr("black_email");
	}

	/**
	*设置qq 
	*/
	public M setBlackQq(java.lang.String blackQq) {
		set("black_qq", blackQq);
		return (M)this;
	}

	/**
	*获取qq 
	*/
	public java.lang.String getBlackQq() {
		return getStr("black_qq");
	}

	/**
	*设置地址 
	*/
	public M setBlackAddress(java.lang.String blackAddress) {
		set("black_address", blackAddress);
		return (M)this;
	}

	/**
	*获取地址 
	*/
	public java.lang.String getBlackAddress() {
		return getStr("black_address");
	}

	/**
	*设置拉黑原因 
	*/
	public M setBlackReason(java.lang.String blackReason) {
		set("black_reason", blackReason);
		return (M)this;
	}

	/**
	*获取拉黑原因 
	*/
	public java.lang.String getBlackReason() {
		return getStr("black_reason");
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
	*设置经办机构id 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取经办机构id 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
	}

}
