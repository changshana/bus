package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_recruit_channel:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelRecruitChannel<M extends BasePersonnelRecruitChannel<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRecruitChannelId(java.lang.Integer recruitChannelId) {
		set("recruit_channel_id", recruitChannelId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRecruitChannelId() {
		return getInt("recruit_channel_id");
	}

	/**
	*设置渠道名称 
	*/
	public M setRecruitChannelName(java.lang.String recruitChannelName) {
		set("recruit_channel_name", recruitChannelName);
		return (M)this;
	}

	/**
	*获取渠道名称 
	*/
	public java.lang.String getRecruitChannelName() {
		return getStr("recruit_channel_name");
	}

	/**
	*设置相关单位 
	*/
	public M setAssociateCompany(java.lang.String associateCompany) {
		set("associate_company", associateCompany);
		return (M)this;
	}

	/**
	*获取相关单位 
	*/
	public java.lang.String getAssociateCompany() {
		return getStr("associate_company");
	}

	/**
	*设置联系人 
	*/
	public M setContactPerson(java.lang.String contactPerson) {
		set("contact_person", contactPerson);
		return (M)this;
	}

	/**
	*获取联系人 
	*/
	public java.lang.String getContactPerson() {
		return getStr("contact_person");
	}

	/**
	*设置联系电话 
	*/
	public M setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getTelephone() {
		return getStr("telephone");
	}

	/**
	*设置传真号码 
	*/
	public M setFaxNumber(java.lang.String faxNumber) {
		set("fax_number", faxNumber);
		return (M)this;
	}

	/**
	*获取传真号码 
	*/
	public java.lang.String getFaxNumber() {
		return getStr("fax_number");
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
	*设置联系qq 
	*/
	public M setQq(java.lang.String qq) {
		set("qq", qq);
		return (M)this;
	}

	/**
	*获取联系qq 
	*/
	public java.lang.String getQq() {
		return getStr("qq");
	}

	/**
	*设置电子邮箱 
	*/
	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}

	/**
	*获取电子邮箱 
	*/
	public java.lang.String getEmail() {
		return getStr("email");
	}

	/**
	*设置地址 
	*/
	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	/**
	*获取地址 
	*/
	public java.lang.String getAddress() {
		return getStr("address");
	}

	/**
	*设置邮政编码 
	*/
	public M setZipCode(java.lang.String zipCode) {
		set("zip_code", zipCode);
		return (M)this;
	}

	/**
	*获取邮政编码 
	*/
	public java.lang.String getZipCode() {
		return getStr("zip_code");
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
