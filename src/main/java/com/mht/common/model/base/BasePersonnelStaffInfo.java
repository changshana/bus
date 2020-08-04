package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_staff_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelStaffInfo<M extends BasePersonnelStaffInfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setStaffInfoId(java.lang.Integer staffInfoId) {
		set("staff_info_id", staffInfoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getStaffInfoId() {
		return getInt("staff_info_id");
	}

	/**
	*设置职工号 
	*/
	public M setJobNum(java.lang.String jobNum) {
		set("job_num", jobNum);
		return (M)this;
	}

	/**
	*获取职工号 
	*/
	public java.lang.String getJobNum() {
		return getStr("job_num");
	}

	/**
	*设置姓名 
	*/
	public M setEmployeeName(java.lang.String employeeName) {
		set("employee_name", employeeName);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getEmployeeName() {
		return getStr("employee_name");
	}

	/**
	*设置证件号 
	*/
	public M setCertificatesNum(java.lang.String certificatesNum) {
		set("certificates_num", certificatesNum);
		return (M)this;
	}

	/**
	*获取证件号 
	*/
	public java.lang.String getCertificatesNum() {
		return getStr("certificates_num");
	}

	/**
	*设置姓名拼音首字母 
	*/
	public M setInitials(java.lang.String initials) {
		set("initials", initials);
		return (M)this;
	}

	/**
	*获取姓名拼音首字母 
	*/
	public java.lang.String getInitials() {
		return getStr("initials");
	}

	/**
	*设置曾用名 
	*/
	public M setUsedName(java.lang.String usedName) {
		set("used_name", usedName);
		return (M)this;
	}

	/**
	*获取曾用名 
	*/
	public java.lang.String getUsedName() {
		return getStr("used_name");
	}

	/**
	*设置性别 
	*/
	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取性别 
	*/
	public java.lang.String getSex() {
		return getStr("sex");
	}

	/**
	*设置出生日期 
	*/
	public M setBirthDate(java.util.Date birthDate) {
		set("birth_date", birthDate);
		return (M)this;
	}

	/**
	*获取出生日期 
	*/
	public java.util.Date getBirthDate() {
		return get("birth_date");
	}

	/**
	*设置民族 
	*/
	public M setRace(java.lang.Integer race) {
		set("race", race);
		return (M)this;
	}

	/**
	*获取民族 
	*/
	public java.lang.Integer getRace() {
		return getInt("race");
	}

	/**
	*设置国家或地区 
	*/
	public M setCountry(java.lang.Integer country) {
		set("country", country);
		return (M)this;
	}

	/**
	*获取国家或地区 
	*/
	public java.lang.Integer getCountry() {
		return getInt("country");
	}

	/**
	*设置出生地 
	*/
	public M setBirthRegion(java.lang.String birthRegion) {
		set("birth_region", birthRegion);
		return (M)this;
	}

	/**
	*获取出生地 
	*/
	public java.lang.String getBirthRegion() {
		return getStr("birth_region");
	}

	/**
	*设置籍贯 
	*/
	public M setNativePlace(java.lang.String nativePlace) {
		set("native_place", nativePlace);
		return (M)this;
	}

	/**
	*获取籍贯 
	*/
	public java.lang.String getNativePlace() {
		return getStr("native_place");
	}

	/**
	*设置证件类型 
	*/
	public M setCertificatesType(java.lang.String certificatesType) {
		set("certificates_type", certificatesType);
		return (M)this;
	}

	/**
	*获取证件类型 
	*/
	public java.lang.String getCertificatesType() {
		return getStr("certificates_type");
	}

	/**
	*设置婚姻状况 
	*/
	public M setMarriage(java.lang.String marriage) {
		set("marriage", marriage);
		return (M)this;
	}

	/**
	*获取婚姻状况 
	*/
	public java.lang.String getMarriage() {
		return getStr("marriage");
	}

	/**
	*设置政治面貌 
	*/
	public M setPoliticalOutlook(java.lang.String politicalOutlook) {
		set("political_outlook", politicalOutlook);
		return (M)this;
	}

	/**
	*获取政治面貌 
	*/
	public java.lang.String getPoliticalOutlook() {
		return getStr("political_outlook");
	}

	/**
	*设置参加党派时间 
	*/
	public M setJoinClanDate(java.util.Date joinClanDate) {
		set("join_clan_date", joinClanDate);
		return (M)this;
	}

	/**
	*获取参加党派时间 
	*/
	public java.util.Date getJoinClanDate() {
		return get("join_clan_date");
	}

	/**
	*设置健康证 
	*/
	public M setHealthCard(java.lang.String healthCard) {
		set("health_card", healthCard);
		return (M)this;
	}

	/**
	*获取健康证 
	*/
	public java.lang.String getHealthCard() {
		return getStr("health_card");
	}

	/**
	*设置参加工作时间 
	*/
	public M setJobDate(java.util.Date jobDate) {
		set("job_date", jobDate);
		return (M)this;
	}

	/**
	*获取参加工作时间 
	*/
	public java.util.Date getJobDate() {
		return get("job_date");
	}

	/**
	*设置现居地 
	*/
	public M setLivingAddress(java.lang.String livingAddress) {
		set("living_address", livingAddress);
		return (M)this;
	}

	/**
	*获取现居地 
	*/
	public java.lang.String getLivingAddress() {
		return getStr("living_address");
	}

	/**
	*设置通信地址 
	*/
	public M setCommuniAddress(java.lang.String communiAddress) {
		set("communi_address", communiAddress);
		return (M)this;
	}

	/**
	*获取通信地址 
	*/
	public java.lang.String getCommuniAddress() {
		return getStr("communi_address");
	}

	/**
	*设置邮政编码 
	*/
	public M setPostalCode(java.lang.String postalCode) {
		set("postal_code", postalCode);
		return (M)this;
	}

	/**
	*获取邮政编码 
	*/
	public java.lang.String getPostalCode() {
		return getStr("postal_code");
	}

	/**
	*设置家庭电话 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取家庭电话 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置手机 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取手机 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
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
	*设置工作电话 
	*/
	public M setWorkPhone(java.lang.String workPhone) {
		set("work_phone", workPhone);
		return (M)this;
	}

	/**
	*获取工作电话 
	*/
	public java.lang.String getWorkPhone() {
		return getStr("work_phone");
	}

	/**
	*设置户口性质 
	*/
	public M setResidenceType(java.lang.String residenceType) {
		set("residence_type", residenceType);
		return (M)this;
	}

	/**
	*获取户口性质 
	*/
	public java.lang.String getResidenceType() {
		return getStr("residence_type");
	}

	/**
	*设置户口所在地 
	*/
	public M setPermanentAddress(java.lang.String permanentAddress) {
		set("permanent_address", permanentAddress);
		return (M)this;
	}

	/**
	*获取户口所在地 
	*/
	public java.lang.String getPermanentAddress() {
		return getStr("permanent_address");
	}

	/**
	*设置居住证类别 
	*/
	public M setLiveType(java.lang.String liveType) {
		set("live_type", liveType);
		return (M)this;
	}

	/**
	*获取居住证类别 
	*/
	public java.lang.String getLiveType() {
		return getStr("live_type");
	}

	/**
	*设置最高学历类型 
	*/
	public M setEducationType(java.lang.Integer educationType) {
		set("education_type", educationType);
		return (M)this;
	}

	/**
	*获取最高学历类型 
	*/
	public java.lang.Integer getEducationType() {
		return getInt("education_type");
	}

	/**
	*设置最高学历 
	*/
	public M setEducation(java.lang.Integer education) {
		set("education", education);
		return (M)this;
	}

	/**
	*获取最高学历 
	*/
	public java.lang.Integer getEducation() {
		return getInt("education");
	}

	/**
	*设置最高学位类型 
	*/
	public M setAcademicDegreeType(java.lang.Integer academicDegreeType) {
		set("academic_degree_type", academicDegreeType);
		return (M)this;
	}

	/**
	*获取最高学位类型 
	*/
	public java.lang.Integer getAcademicDegreeType() {
		return getInt("academic_degree_type");
	}

	/**
	*设置最高学位 
	*/
	public M setAcademicDegree(java.lang.String academicDegree) {
		set("academic_degree", academicDegree);
		return (M)this;
	}

	/**
	*获取最高学位 
	*/
	public java.lang.String getAcademicDegree() {
		return getStr("academic_degree");
	}

	/**
	*设置紧急联系人电话 
	*/
	public M setEmergencyPhone(java.lang.String emergencyPhone) {
		set("emergency_phone", emergencyPhone);
		return (M)this;
	}

	/**
	*获取紧急联系人电话 
	*/
	public java.lang.String getEmergencyPhone() {
		return getStr("emergency_phone");
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
	*设置岗位Id 
	*/
	public M setPostId(java.lang.Integer postId) {
		set("post_id", postId);
		return (M)this;
	}

	/**
	*获取岗位Id 
	*/
	public java.lang.Integer getPostId() {
		return getInt("post_id");
	}

	/**
	*设置岗位等级 
	*/
	public M setPostLevel(java.lang.String postLevel) {
		set("post_level", postLevel);
		return (M)this;
	}

	/**
	*获取岗位等级 
	*/
	public java.lang.String getPostLevel() {
		return getStr("post_level");
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
	*设置健康状况 
	*/
	public M setHealthyType(java.lang.Integer healthyType) {
		set("healthy_type", healthyType);
		return (M)this;
	}

	/**
	*获取健康状况 
	*/
	public java.lang.Integer getHealthyType() {
		return getInt("healthy_type");
	}

	/**
	*设置健康证办理时间 
	*/
	public M setHealthyDate(java.util.Date healthyDate) {
		set("healthy_date", healthyDate);
		return (M)this;
	}

	/**
	*获取健康证办理时间 
	*/
	public java.util.Date getHealthyDate() {
		return get("healthy_date");
	}

	/**
	*设置编制类型 
	*/
	public M setOrgType(java.lang.Integer orgType) {
		set("org_type", orgType);
		return (M)this;
	}

	/**
	*获取编制类型 
	*/
	public java.lang.Integer getOrgType() {
		return getInt("org_type");
	}

	/**
	*设置编制类别 
	*/
	public M setOrgCategory(java.lang.Integer orgCategory) {
		set("org_category", orgCategory);
		return (M)this;
	}

	/**
	*获取编制类别 
	*/
	public java.lang.Integer getOrgCategory() {
		return getInt("org_category");
	}

	/**
	*设置工作校区 
	*/
	public M setSchoolZone(java.lang.String schoolZone) {
		set("school_zone", schoolZone);
		return (M)this;
	}

	/**
	*获取工作校区 
	*/
	public java.lang.String getSchoolZone() {
		return getStr("school_zone");
	}

	/**
	*设置集团连续工作年限 
	*/
	public M setContinuityJobDate(java.lang.String continuityJobDate) {
		set("continuity_job_date", continuityJobDate);
		return (M)this;
	}

	/**
	*获取集团连续工作年限 
	*/
	public java.lang.String getContinuityJobDate() {
		return getStr("continuity_job_date");
	}

	/**
	*设置入工会日期 
	*/
	public M setJoinClueDate(java.lang.String joinClueDate) {
		set("join_clue_date", joinClueDate);
		return (M)this;
	}

	/**
	*获取入工会日期 
	*/
	public java.lang.String getJoinClueDate() {
		return getStr("join_clue_date");
	}

	/**
	*设置港澳台侨 
	*/
	public M setOveType(java.lang.String oveType) {
		set("ove_type", oveType);
		return (M)this;
	}

	/**
	*获取港澳台侨 
	*/
	public java.lang.String getOveType() {
		return getStr("ove_type");
	}

	/**
	*设置档案类型 
	*/
	public M setArchivesType(java.lang.String archivesType) {
		set("archives_type", archivesType);
		return (M)this;
	}

	/**
	*获取档案类型 
	*/
	public java.lang.String getArchivesType() {
		return getStr("archives_type");
	}

	/**
	*设置档案存放地 
	*/
	public M setArchivesAddress(java.lang.String archivesAddress) {
		set("archives_address", archivesAddress);
		return (M)this;
	}

	/**
	*获取档案存放地 
	*/
	public java.lang.String getArchivesAddress() {
		return getStr("archives_address");
	}

	/**
	*设置人事关系 
	*/
	public M setStaffRelation(java.lang.String staffRelation) {
		set("staff_relation", staffRelation);
		return (M)this;
	}

	/**
	*获取人事关系 
	*/
	public java.lang.String getStaffRelation() {
		return getStr("staff_relation");
	}

	/**
	*设置当前状况类别 
	*/
	public M setStatusType(java.lang.Integer statusType) {
		set("status_type", statusType);
		return (M)this;
	}

	/**
	*获取当前状况类别 
	*/
	public java.lang.Integer getStatusType() {
		return getInt("status_type");
	}

	/**
	*设置当前状况时间 
	*/
	public M setStatusDate(java.util.Date statusDate) {
		set("status_date", statusDate);
		return (M)this;
	}

	/**
	*获取当前状况时间 
	*/
	public java.util.Date getStatusDate() {
		return get("status_date");
	}

	/**
	*设置当前状况办理时间 
	*/
	public M setStatusHandleDate(java.util.Date statusHandleDate) {
		set("status_handle_date", statusHandleDate);
		return (M)this;
	}

	/**
	*获取当前状况办理时间 
	*/
	public java.util.Date getStatusHandleDate() {
		return get("status_handle_date");
	}

	/**
	*设置是否残疾 
	*/
	public M setIsDisability(java.lang.String isDisability) {
		set("is_disability", isDisability);
		return (M)this;
	}

	/**
	*获取是否残疾 
	*/
	public java.lang.String getIsDisability() {
		return getStr("is_disability");
	}

	/**
	*设置残疾证号 
	*/
	public M setDisabilityNum(java.lang.String disabilityNum) {
		set("disability_num", disabilityNum);
		return (M)this;
	}

	/**
	*获取残疾证号 
	*/
	public java.lang.String getDisabilityNum() {
		return getStr("disability_num");
	}

	/**
	*设置是否烈属 
	*/
	public M setIsMartyr(java.lang.String isMartyr) {
		set("is_martyr", isMartyr);
		return (M)this;
	}

	/**
	*获取是否烈属 
	*/
	public java.lang.String getIsMartyr() {
		return getStr("is_martyr");
	}

	/**
	*设置是否孤老 
	*/
	public M setIsOld(java.lang.String isOld) {
		set("is_old", isOld);
		return (M)this;
	}

	/**
	*获取是否孤老 
	*/
	public java.lang.String getIsOld() {
		return getStr("is_old");
	}

	/**
	*设置银行账号 
	*/
	public M setBankAccount(java.lang.String bankAccount) {
		set("bank_account", bankAccount);
		return (M)this;
	}

	/**
	*获取银行账号 
	*/
	public java.lang.String getBankAccount() {
		return getStr("bank_account");
	}

	/**
	*设置烈属证号 
	*/
	public M setMartyrNum(java.lang.String martyrNum) {
		set("martyr_num", martyrNum);
		return (M)this;
	}

	/**
	*获取烈属证号 
	*/
	public java.lang.String getMartyrNum() {
		return getStr("martyr_num");
	}

	/**
	*设置岗位受雇日期 
	*/
	public M setHireDate(java.util.Date hireDate) {
		set("hire_date", hireDate);
		return (M)this;
	}

	/**
	*获取岗位受雇日期 
	*/
	public java.util.Date getHireDate() {
		return get("hire_date");
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
