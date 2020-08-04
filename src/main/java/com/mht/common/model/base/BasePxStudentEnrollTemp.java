package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_student_enroll_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxStudentEnrollTemp<M extends BasePxStudentEnrollTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setTempId(java.lang.Integer tempId) {
		set("temp_id", tempId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTempId() {
		return getInt("temp_id");
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
	*设置性别码值 
	*/
	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取性别码值 
	*/
	public java.lang.String getSex() {
		return getStr("sex");
	}

	/**
	*设置性别名称 
	*/
	public M setSexName(java.lang.String sexName) {
		set("sex_name", sexName);
		return (M)this;
	}

	/**
	*获取性别名称 
	*/
	public java.lang.String getSexName() {
		return getStr("sex_name");
	}

	/**
	*设置出生日期 
	*/
	public M setBirthDatetime(java.lang.String birthDatetime) {
		set("birth_datetime", birthDatetime);
		return (M)this;
	}

	/**
	*获取出生日期 
	*/
	public java.lang.String getBirthDatetime() {
		return getStr("birth_datetime");
	}

	/**
	*设置民族名称 
	*/
	public M setNationName(java.lang.String nationName) {
		set("nation_name", nationName);
		return (M)this;
	}

	/**
	*获取民族名称 
	*/
	public java.lang.String getNationName() {
		return getStr("nation_name");
	}

	/**
	*设置民族 
	*/
	public M setNation(java.lang.String nation) {
		set("nation", nation);
		return (M)this;
	}

	/**
	*获取民族 
	*/
	public java.lang.String getNation() {
		return getStr("nation");
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
	public M setEducation(java.lang.String education) {
		set("education", education);
		return (M)this;
	}

	/**
	*获取文化程度 
	*/
	public java.lang.String getEducation() {
		return getStr("education");
	}

	/**
	*设置文化程度名称 
	*/
	public M setEducationName(java.lang.String educationName) {
		set("education_name", educationName);
		return (M)this;
	}

	/**
	*获取文化程度名称 
	*/
	public java.lang.String getEducationName() {
		return getStr("education_name");
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
	*设置结业状态名称 
	*/
	public M setGraduateNmae(java.lang.String graduateNmae) {
		set("graduate_nmae", graduateNmae);
		return (M)this;
	}

	/**
	*获取结业状态名称 
	*/
	public java.lang.String getGraduateNmae() {
		return getStr("graduate_nmae");
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
	*设置婚姻状况名称 
	*/
	public M setMaritalStatusName(java.lang.String maritalStatusName) {
		set("marital_status_name", maritalStatusName);
		return (M)this;
	}

	/**
	*获取婚姻状况名称 
	*/
	public java.lang.String getMaritalStatusName() {
		return getStr("marital_status_name");
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
	*设置政治面貌名称 
	*/
	public M setPoliticsStatusName(java.lang.String politicsStatusName) {
		set("politics_status_name", politicsStatusName);
		return (M)this;
	}

	/**
	*获取政治面貌名称 
	*/
	public java.lang.String getPoliticsStatusName() {
		return getStr("politics_status_name");
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

	/**
	*设置学校id 
	*/
	public M setSchoolId(java.lang.String schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取学校id 
	*/
	public java.lang.String getSchoolId() {
		return getStr("school_id");
	}

	/**
	*设置班级id 
	*/
	public M setClassId(java.lang.String classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取班级id 
	*/
	public java.lang.String getClassId() {
		return getStr("class_id");
	}

	/**
	*设置错误原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取错误原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
	}

	/**
	*设置验证结果 
	*/
	public M setTempType(java.lang.Integer tempType) {
		set("temp_type", tempType);
		return (M)this;
	}

	/**
	*获取验证结果 
	*/
	public java.lang.Integer getTempType() {
		return getInt("temp_type");
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
	*设置班级名称 
	*/
	public M setClassName(java.lang.String className) {
		set("class_name", className);
		return (M)this;
	}

	/**
	*获取班级名称 
	*/
	public java.lang.String getClassName() {
		return getStr("class_name");
	}

}
