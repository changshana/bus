package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_school:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxSchool<M extends BasePxSchool<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
	}

	/**
	*设置学校名称 
	*/
	public M setSchoolName(java.lang.String schoolName) {
		set("school_name", schoolName);
		return (M)this;
	}

	/**
	*获取学校名称 
	*/
	public java.lang.String getSchoolName() {
		return getStr("school_name");
	}

	/**
	*设置学校性质 
	*/
	public M setSchoolNature(java.lang.String schoolNature) {
		set("school_nature", schoolNature);
		return (M)this;
	}

	/**
	*获取学校性质 
	*/
	public java.lang.String getSchoolNature() {
		return getStr("school_nature");
	}

	/**
	*设置法人代表 
	*/
	public M setLegalRepresentative(java.lang.String legalRepresentative) {
		set("legal_representative", legalRepresentative);
		return (M)this;
	}

	/**
	*获取法人代表 
	*/
	public java.lang.String getLegalRepresentative() {
		return getStr("legal_representative");
	}

	/**
	*设置法人联系电话 
	*/
	public M setLegalRepresentativePhone(java.lang.String legalRepresentativePhone) {
		set("legal_representative_phone", legalRepresentativePhone);
		return (M)this;
	}

	/**
	*获取法人联系电话 
	*/
	public java.lang.String getLegalRepresentativePhone() {
		return getStr("legal_representative_phone");
	}

	/**
	*设置学校负责人 
	*/
	public M setSchoolContact(java.lang.String schoolContact) {
		set("school_contact", schoolContact);
		return (M)this;
	}

	/**
	*获取学校负责人 
	*/
	public java.lang.String getSchoolContact() {
		return getStr("school_contact");
	}

	/**
	*设置联系电话 
	*/
	public M setContactPhone(java.lang.String contactPhone) {
		set("contact_phone", contactPhone);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getContactPhone() {
		return getStr("contact_phone");
	}

	/**
	*设置通讯地址 
	*/
	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	/**
	*获取通讯地址 
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
	*设置传真号码 
	*/
	public M setFaxNum(java.lang.String faxNum) {
		set("fax_num", faxNum);
		return (M)this;
	}

	/**
	*获取传真号码 
	*/
	public java.lang.String getFaxNum() {
		return getStr("fax_num");
	}

	/**
	*设置邮箱 
	*/
	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}

	/**
	*获取邮箱 
	*/
	public java.lang.String getEmail() {
		return getStr("email");
	}

	/**
	*设置学校网站 
	*/
	public M setSiteUrl(java.lang.String siteUrl) {
		set("site_url", siteUrl);
		return (M)this;
	}

	/**
	*获取学校网站 
	*/
	public java.lang.String getSiteUrl() {
		return getStr("site_url");
	}

	/**
	*设置学校规模 
	*/
	public M setScale(java.lang.String scale) {
		set("scale", scale);
		return (M)this;
	}

	/**
	*获取学校规模 
	*/
	public java.lang.String getScale() {
		return getStr("scale");
	}

	/**
	*设置培训对象 
	*/
	public M setObject(java.lang.String object) {
		set("object", object);
		return (M)this;
	}

	/**
	*获取培训对象 
	*/
	public java.lang.String getObject() {
		return getStr("object");
	}

	/**
	*设置培训形式 
	*/
	public M setMode(java.lang.String mode) {
		set("mode", mode);
		return (M)this;
	}

	/**
	*获取培训形式 
	*/
	public java.lang.String getMode() {
		return getStr("mode");
	}

	/**
	*设置职工人数 
	*/
	public M setStaffCount(java.lang.Integer staffCount) {
		set("staff_count", staffCount);
		return (M)this;
	}

	/**
	*获取职工人数 
	*/
	public java.lang.Integer getStaffCount() {
		return getInt("staff_count");
	}

	/**
	*设置场所面积 
	*/
	public M setPlaceArea(java.lang.Integer placeArea) {
		set("place_area", placeArea);
		return (M)this;
	}

	/**
	*获取场所面积 
	*/
	public java.lang.Integer getPlaceArea() {
		return getInt("place_area");
	}

	/**
	*设置培训等级 
	*/
	public M setTrainAptitudes(java.lang.String trainAptitudes) {
		set("train_aptitudes", trainAptitudes);
		return (M)this;
	}

	/**
	*获取培训等级 
	*/
	public java.lang.String getTrainAptitudes() {
		return getStr("train_aptitudes");
	}

	/**
	*设置校长 
	*/
	public M setPrincipal(java.lang.String principal) {
		set("principal", principal);
		return (M)this;
	}

	/**
	*获取校长 
	*/
	public java.lang.String getPrincipal() {
		return getStr("principal");
	}

	/**
	*设置校长电话 
	*/
	public M setPrincipalPhone(java.lang.String principalPhone) {
		set("principal_phone", principalPhone);
		return (M)this;
	}

	/**
	*获取校长电话 
	*/
	public java.lang.String getPrincipalPhone() {
		return getStr("principal_phone");
	}

	/**
	*设置招生对象 
	*/
	public M setEnrollObject(java.lang.String enrollObject) {
		set("enroll_object", enrollObject);
		return (M)this;
	}

	/**
	*获取招生对象 
	*/
	public java.lang.String getEnrollObject() {
		return getStr("enroll_object");
	}

	/**
	*设置办学层次 
	*/
	public M setEnrollLevel(java.lang.String enrollLevel) {
		set("enroll_level", enrollLevel);
		return (M)this;
	}

	/**
	*获取办学层次 
	*/
	public java.lang.String getEnrollLevel() {
		return getStr("enroll_level");
	}

	/**
	*设置支付开户银行行号 
	*/
	public M setBankNum(java.lang.String bankNum) {
		set("bank_num", bankNum);
		return (M)this;
	}

	/**
	*获取支付开户银行行号 
	*/
	public java.lang.String getBankNum() {
		return getStr("bank_num");
	}

	/**
	*设置开户银行 
	*/
	public M setBankName(java.lang.String bankName) {
		set("bank_name", bankName);
		return (M)this;
	}

	/**
	*获取开户银行 
	*/
	public java.lang.String getBankName() {
		return getStr("bank_name");
	}

	/**
	*设置支付开户银行户名 
	*/
	public M setBankAccount(java.lang.String bankAccount) {
		set("bank_account", bankAccount);
		return (M)this;
	}

	/**
	*获取支付开户银行户名 
	*/
	public java.lang.String getBankAccount() {
		return getStr("bank_account");
	}

	/**
	*设置支付开户银行账号 
	*/
	public M setBankAccountNumber(java.lang.String bankAccountNumber) {
		set("bank_account_number", bankAccountNumber);
		return (M)this;
	}

	/**
	*获取支付开户银行账号 
	*/
	public java.lang.String getBankAccountNumber() {
		return getStr("bank_account_number");
	}

	/**
	*设置学校简介 
	*/
	public M setSchoolIntro(java.lang.String schoolIntro) {
		set("school_intro", schoolIntro);
		return (M)this;
	}

	/**
	*获取学校简介 
	*/
	public java.lang.String getSchoolIntro() {
		return getStr("school_intro");
	}

	/**
	*设置学校logo(路径) 
	*/
	public M setSchoolLogoUrl(java.lang.String schoolLogoUrl) {
		set("school_logo_url", schoolLogoUrl);
		return (M)this;
	}

	/**
	*获取学校logo(路径) 
	*/
	public java.lang.String getSchoolLogoUrl() {
		return getStr("school_logo_url");
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
	*设置用户id 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取用户id 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

}
