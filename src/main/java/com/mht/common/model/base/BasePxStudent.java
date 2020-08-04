package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_student:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxStudent<M extends BasePxStudent<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
	}

	/**
	*设置身份证号 
	*/
	public M setIdentityCard(java.lang.String identityCard) {
		set("identity_card", identityCard);
		return (M)this;
	}

	/**
	*获取身份证号 
	*/
	public java.lang.String getIdentityCard() {
		return getStr("identity_card");
	}

	/**
	*设置姓名 
	*/
	public M setStudentName(java.lang.String studentName) {
		set("student_name", studentName);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getStudentName() {
		return getStr("student_name");
	}

	/**
	*设置性别 
	*/
	public M setSex(java.lang.Integer sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.Integer getSex() {
		return getInt("sex");
	}

	/**
	*设置出生日期 
	*/
	public M setBirthDatetime(java.util.Date birthDatetime) {
		set("birth_datetime", birthDatetime);
		return (M)this;
	}

	/**
	*获取出生日期 
	*/
	public java.util.Date getBirthDatetime() {
		return get("birth_datetime");
	}

	/**
	*设置民族 
	*/
	public M setNation(java.lang.Integer nation) {
		set("nation", nation);
		return (M)this;
	}

	/**
	*获取民族 
	*/
	public java.lang.Integer getNation() {
		return getInt("nation");
	}

	/**
	*设置联系电话 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置家庭住址 
	*/
	public M setHomeAddress(java.lang.String homeAddress) {
		set("home_address", homeAddress);
		return (M)this;
	}

	/**
	*获取家庭住址 
	*/
	public java.lang.String getHomeAddress() {
		return getStr("home_address");
	}

	/**
	*设置邮编 
	*/
	public M setZipCode(java.lang.String zipCode) {
		set("zip_code", zipCode);
		return (M)this;
	}

	/**
	*获取邮编 
	*/
	public java.lang.String getZipCode() {
		return getStr("zip_code");
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
	*设置文化程度 
	*/
	public M setEducation(java.lang.Integer education) {
		set("education", education);
		return (M)this;
	}

	/**
	*获取文化程度 
	*/
	public java.lang.Integer getEducation() {
		return getInt("education");
	}

	/**
	*设置头像地址 
	*/
	public M setPortrait(java.lang.String portrait) {
		set("portrait", portrait);
		return (M)this;
	}

	/**
	*获取头像地址 
	*/
	public java.lang.String getPortrait() {
		return getStr("portrait");
	}

	/**
	*设置用户id（用户表sys_user中个人id） 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取用户id（用户表sys_user中个人id） 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	*设置是否已采集指纹(右)：0：是，1：否 
	*/
	public M setIsFingerprintRight(java.lang.String isFingerprintRight) {
		set("is_fingerprint_right", isFingerprintRight);
		return (M)this;
	}

	/**
	*获取是否已采集指纹(右)：0：是，1：否 
	*/
	public java.lang.String getIsFingerprintRight() {
		return getStr("is_fingerprint_right");
	}

	/**
	*设置个人指纹编码(右) 
	*/
	public M setFingerprintRight(java.lang.String fingerprintRight) {
		set("fingerprint_right", fingerprintRight);
		return (M)this;
	}

	/**
	*获取个人指纹编码(右) 
	*/
	public java.lang.String getFingerprintRight() {
		return getStr("fingerprint_right");
	}

	/**
	*设置是否已采集指纹(左)：0：是，1：否 
	*/
	public M setIsFingerprintLeft(java.lang.String isFingerprintLeft) {
		set("is_fingerprint_left", isFingerprintLeft);
		return (M)this;
	}

	/**
	*获取是否已采集指纹(左)：0：是，1：否 
	*/
	public java.lang.String getIsFingerprintLeft() {
		return getStr("is_fingerprint_left");
	}

	/**
	*设置个人指纹编码(左) 
	*/
	public M setFingerprintLeft(java.lang.String fingerprintLeft) {
		set("fingerprint_left", fingerprintLeft);
		return (M)this;
	}

	/**
	*获取个人指纹编码(左) 
	*/
	public java.lang.String getFingerprintLeft() {
		return getStr("fingerprint_left");
	}

	/**
	*设置是否结业 
	*/
	public M setIsGraduate(java.lang.Integer isGraduate) {
		set("is_graduate", isGraduate);
		return (M)this;
	}

	/**
	*获取是否结业 
	*/
	public java.lang.Integer getIsGraduate() {
		return getInt("is_graduate");
	}

	/**
	*设置是否申请证书 
	*/
	public M setIsCertificate(java.lang.Integer isCertificate) {
		set("is_certificate", isCertificate);
		return (M)this;
	}

	/**
	*获取是否申请证书 
	*/
	public java.lang.Integer getIsCertificate() {
		return getInt("is_certificate");
	}

	/**
	*设置婚姻状况 
	*/
	public M setMaritalStatus(java.lang.Integer maritalStatus) {
		set("marital_status", maritalStatus);
		return (M)this;
	}

	/**
	*获取婚姻状况 
	*/
	public java.lang.Integer getMaritalStatus() {
		return getInt("marital_status");
	}

	/**
	*设置政治面貌 
	*/
	public M setPoliticsStatus(java.lang.Integer politicsStatus) {
		set("politics_status", politicsStatus);
		return (M)this;
	}

	/**
	*获取政治面貌 
	*/
	public java.lang.Integer getPoliticsStatus() {
		return getInt("politics_status");
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

}
