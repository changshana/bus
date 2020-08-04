package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_employees_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelEmployeesRecord<M extends BasePersonnelEmployeesRecord<M>> extends Model<M> implements IBean {

	/**
	*设置备案ID 
	*/
	public M setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	/**
	*获取备案ID 
	*/
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
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
	*设置民族描述 
	*/
	public M setNationDesc(java.lang.String nationDesc) {
		set("nation_desc", nationDesc);
		return (M)this;
	}

	/**
	*获取民族描述 
	*/
	public java.lang.String getNationDesc() {
		return getStr("nation_desc");
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
	*设置国家或地区描述 
	*/
	public M setCountryDesc(java.lang.String countryDesc) {
		set("country_desc", countryDesc);
		return (M)this;
	}

	/**
	*获取国家或地区描述 
	*/
	public java.lang.String getCountryDesc() {
		return getStr("country_desc");
	}

	/**
	*设置出生地 
	*/
	public M setBirthplace(java.lang.Integer birthplace) {
		set("birthplace", birthplace);
		return (M)this;
	}

	/**
	*获取出生地 
	*/
	public java.lang.Integer getBirthplace() {
		return getInt("birthplace");
	}

	/**
	*设置出生地描述 
	*/
	public M setBirthplaceDesc(java.lang.String birthplaceDesc) {
		set("birthplace_desc", birthplaceDesc);
		return (M)this;
	}

	/**
	*获取出生地描述 
	*/
	public java.lang.String getBirthplaceDesc() {
		return getStr("birthplace_desc");
	}

	/**
	*设置籍贯 
	*/
	public M setNativePlace(java.lang.Integer nativePlace) {
		set("native_place", nativePlace);
		return (M)this;
	}

	/**
	*获取籍贯 
	*/
	public java.lang.Integer getNativePlace() {
		return getInt("native_place");
	}

	/**
	*设置籍贯描述 
	*/
	public M setNativePlaceDesc(java.lang.String nativePlaceDesc) {
		set("native_place_desc", nativePlaceDesc);
		return (M)this;
	}

	/**
	*获取籍贯描述 
	*/
	public java.lang.String getNativePlaceDesc() {
		return getStr("native_place_desc");
	}

	/**
	*设置证件类型 
	*/
	public M setCertificatesType(java.lang.Integer certificatesType) {
		set("certificates_type", certificatesType);
		return (M)this;
	}

	/**
	*获取证件类型 
	*/
	public java.lang.Integer getCertificatesType() {
		return getInt("certificates_type");
	}

	/**
	*设置婚姻状况 
	*/
	public M setMarriage(java.lang.Integer marriage) {
		set("marriage", marriage);
		return (M)this;
	}

	/**
	*获取婚姻状况 
	*/
	public java.lang.Integer getMarriage() {
		return getInt("marriage");
	}

	/**
	*设置政治面貌 
	*/
	public M setPoliticalOutlook(java.lang.Integer politicalOutlook) {
		set("political_outlook", politicalOutlook);
		return (M)this;
	}

	/**
	*获取政治面貌 
	*/
	public java.lang.Integer getPoliticalOutlook() {
		return getInt("political_outlook");
	}

	/**
	*设置参加党派时间 
	*/
	public M setJoinClanDate(java.lang.String joinClanDate) {
		set("join_clan_date", joinClanDate);
		return (M)this;
	}

	/**
	*获取参加党派时间 
	*/
	public java.lang.String getJoinClanDate() {
		return getStr("join_clan_date");
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
	public M setJobDate(java.lang.String jobDate) {
		set("job_date", jobDate);
		return (M)this;
	}

	/**
	*获取参加工作时间 
	*/
	public java.lang.String getJobDate() {
		return getStr("job_date");
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
	public M setResidenceType(java.lang.Integer residenceType) {
		set("residence_type", residenceType);
		return (M)this;
	}

	/**
	*获取户口性质 
	*/
	public java.lang.Integer getResidenceType() {
		return getInt("residence_type");
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
	public M setLiveType(java.lang.Integer liveType) {
		set("live_type", liveType);
		return (M)this;
	}

	/**
	*获取居住证类别 
	*/
	public java.lang.Integer getLiveType() {
		return getInt("live_type");
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
	*设置岗位ID 
	*/
	public M setPostId(java.lang.Integer postId) {
		set("post_id", postId);
		return (M)this;
	}

	/**
	*获取岗位ID 
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
	*设置健康证办理时间 
	*/
	public M setHealthyDate(java.lang.String healthyDate) {
		set("healthy_date", healthyDate);
		return (M)this;
	}

	/**
	*获取健康证办理时间 
	*/
	public java.lang.String getHealthyDate() {
		return getStr("healthy_date");
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
	*设置后勤连续工作年限 
	*/
	public M setContinuityJobDate(java.lang.Integer continuityJobDate) {
		set("continuity_job_date", continuityJobDate);
		return (M)this;
	}

	/**
	*获取后勤连续工作年限 
	*/
	public java.lang.Integer getContinuityJobDate() {
		return getInt("continuity_job_date");
	}

	/**
	*设置入工会时间 
	*/
	public M setJoinClueDate(java.lang.String joinClueDate) {
		set("join_clue_date", joinClueDate);
		return (M)this;
	}

	/**
	*获取入工会时间 
	*/
	public java.lang.String getJoinClueDate() {
		return getStr("join_clue_date");
	}

	/**
	*设置港澳台侨 
	*/
	public M setOveType(java.lang.Integer oveType) {
		set("ove_type", oveType);
		return (M)this;
	}

	/**
	*获取港澳台侨 
	*/
	public java.lang.Integer getOveType() {
		return getInt("ove_type");
	}

	/**
	*设置档案类型 
	*/
	public M setArchivesType(java.lang.Integer archivesType) {
		set("archives_type", archivesType);
		return (M)this;
	}

	/**
	*获取档案类型 
	*/
	public java.lang.Integer getArchivesType() {
		return getInt("archives_type");
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
	public M setSituationType(java.lang.Integer situationType) {
		set("situation_type", situationType);
		return (M)this;
	}

	/**
	*获取当前状况类别 
	*/
	public java.lang.Integer getSituationType() {
		return getInt("situation_type");
	}

	/**
	*设置当前状况 
	*/
	public M setSituation(java.lang.Integer situation) {
		set("situation", situation);
		return (M)this;
	}

	/**
	*获取当前状况 
	*/
	public java.lang.Integer getSituation() {
		return getInt("situation");
	}

	/**
	*设置当前状况时间 
	*/
	public M setSituationDate(java.lang.String situationDate) {
		set("situation_date", situationDate);
		return (M)this;
	}

	/**
	*获取当前状况时间 
	*/
	public java.lang.String getSituationDate() {
		return getStr("situation_date");
	}

	/**
	*设置当前状况办理时间 
	*/
	public M setSituationHandleDate(java.lang.String situationHandleDate) {
		set("situation_handle_date", situationHandleDate);
		return (M)this;
	}

	/**
	*获取当前状况办理时间 
	*/
	public java.lang.String getSituationHandleDate() {
		return getStr("situation_handle_date");
	}

	/**
	*设置单位类型 
	*/
	public M setCompanyType(java.lang.String companyType) {
		set("company_type", companyType);
		return (M)this;
	}

	/**
	*获取单位类型 
	*/
	public java.lang.String getCompanyType() {
		return getStr("company_type");
	}

	/**
	*设置所在院系部处 
	*/
	public M setCollegeSite(java.lang.String collegeSite) {
		set("college_site", collegeSite);
		return (M)this;
	}

	/**
	*获取所在院系部处 
	*/
	public java.lang.String getCollegeSite() {
		return getStr("college_site");
	}

	/**
	*设置内设机构 
	*/
	public M setSiteName(java.lang.String siteName) {
		set("site_name", siteName);
		return (M)this;
	}

	/**
	*获取内设机构 
	*/
	public java.lang.String getSiteName() {
		return getStr("site_name");
	}

	/**
	*设置健康状况 
	*/
	public M setHealthType(java.lang.Integer healthType) {
		set("health_type", healthType);
		return (M)this;
	}

	/**
	*获取健康状况 
	*/
	public java.lang.Integer getHealthType() {
		return getInt("health_type");
	}

	/**
	*设置来校时间 
	*/
	public M setEnterTime(java.lang.String enterTime) {
		set("enter_time", enterTime);
		return (M)this;
	}

	/**
	*获取来校时间 
	*/
	public java.lang.String getEnterTime() {
		return getStr("enter_time");
	}

	/**
	*设置进校前单位 
	*/
	public M setBeginCompany(java.lang.String beginCompany) {
		set("begin_company", beginCompany);
		return (M)this;
	}

	/**
	*获取进校前单位 
	*/
	public java.lang.String getBeginCompany() {
		return getStr("begin_company");
	}

	/**
	*设置进校方式 
	*/
	public M setEnterWay(java.lang.Integer enterWay) {
		set("enter_way", enterWay);
		return (M)this;
	}

	/**
	*获取进校方式 
	*/
	public java.lang.Integer getEnterWay() {
		return getInt("enter_way");
	}

	/**
	*设置进校类别 
	*/
	public M setEnterType(java.lang.Integer enterType) {
		set("enter_type", enterType);
		return (M)this;
	}

	/**
	*获取进校类别 
	*/
	public java.lang.Integer getEnterType() {
		return getInt("enter_type");
	}

	/**
	*设置职工身份 
	*/
	public M setWorkerIdentity(java.lang.Integer workerIdentity) {
		set("worker_identity", workerIdentity);
		return (M)this;
	}

	/**
	*获取职工身份 
	*/
	public java.lang.Integer getWorkerIdentity() {
		return getInt("worker_identity");
	}

	/**
	*设置人员类型 
	*/
	public M setPersonnelType(java.lang.Integer personnelType) {
		set("personnel_type", personnelType);
		return (M)this;
	}

	/**
	*获取人员类型 
	*/
	public java.lang.Integer getPersonnelType() {
		return getInt("personnel_type");
	}

	/**
	*设置经费来源 
	*/
	public M setFundSources(java.lang.String fundSources) {
		set("fund_sources", fundSources);
		return (M)this;
	}

	/**
	*获取经费来源 
	*/
	public java.lang.String getFundSources() {
		return getStr("fund_sources");
	}

	/**
	*设置薪酬结构 
	*/
	public M setSalaryStructure(java.lang.String salaryStructure) {
		set("salary_structure", salaryStructure);
		return (M)this;
	}

	/**
	*获取薪酬结构 
	*/
	public java.lang.String getSalaryStructure() {
		return getStr("salary_structure");
	}

	/**
	*设置岗位类型（学校） 
	*/
	public M setSchoolPostType(java.lang.String schoolPostType) {
		set("school_post_type", schoolPostType);
		return (M)this;
	}

	/**
	*获取岗位类型（学校） 
	*/
	public java.lang.String getSchoolPostType() {
		return getStr("school_post_type");
	}

	/**
	*设置岗位类别(学校) 
	*/
	public M setSchoolPostCategory(java.lang.String schoolPostCategory) {
		set("school_post_category", schoolPostCategory);
		return (M)this;
	}

	/**
	*获取岗位类别(学校) 
	*/
	public java.lang.String getSchoolPostCategory() {
		return getStr("school_post_category");
	}

	/**
	*设置岗位名称（学校） 
	*/
	public M setSchoolPostName(java.lang.String schoolPostName) {
		set("school_post_name", schoolPostName);
		return (M)this;
	}

	/**
	*获取岗位名称（学校） 
	*/
	public java.lang.String getSchoolPostName() {
		return getStr("school_post_name");
	}

	/**
	*设置岗位聘任年月(学校) 
	*/
	public M setSchoolPostEngageDate(java.lang.String schoolPostEngageDate) {
		set("school_post_engage_date", schoolPostEngageDate);
		return (M)this;
	}

	/**
	*获取岗位聘任年月(学校) 
	*/
	public java.lang.String getSchoolPostEngageDate() {
		return getStr("school_post_engage_date");
	}

	/**
	*设置岗位备注（学校） 
	*/
	public M setSchoolPostRemark(java.lang.String schoolPostRemark) {
		set("school_post_remark", schoolPostRemark);
		return (M)this;
	}

	/**
	*获取岗位备注（学校） 
	*/
	public java.lang.String getSchoolPostRemark() {
		return getStr("school_post_remark");
	}

	/**
	*设置是否双肩挑 
	*/
	public M setSchoolPostMore(java.lang.String schoolPostMore) {
		set("school_post_more", schoolPostMore);
		return (M)this;
	}

	/**
	*获取是否双肩挑 
	*/
	public java.lang.String getSchoolPostMore() {
		return getStr("school_post_more");
	}

	/**
	*设置岗位等级(学校) 
	*/
	public M setSchoolPostLevel(java.lang.String schoolPostLevel) {
		set("school_post_level", schoolPostLevel);
		return (M)this;
	}

	/**
	*获取岗位等级(学校) 
	*/
	public java.lang.String getSchoolPostLevel() {
		return getStr("school_post_level");
	}

	/**
	*设置岗位等级聘任年月 
	*/
	public M setSchoolPostLevelDate(java.lang.String schoolPostLevelDate) {
		set("school_post_level_date", schoolPostLevelDate);
		return (M)this;
	}

	/**
	*获取岗位等级聘任年月 
	*/
	public java.lang.String getSchoolPostLevelDate() {
		return getStr("school_post_level_date");
	}

	/**
	*设置岗位等级首聘年月 
	*/
	public M setSchoolPostLevelBeginDate(java.lang.String schoolPostLevelBeginDate) {
		set("school_post_level_begin_date", schoolPostLevelBeginDate);
		return (M)this;
	}

	/**
	*获取岗位等级首聘年月 
	*/
	public java.lang.String getSchoolPostLevelBeginDate() {
		return getStr("school_post_level_begin_date");
	}

	/**
	*设置聘任技术职务 
	*/
	public M setSchoolSkillEngage(java.lang.String schoolSkillEngage) {
		set("school_skill_engage", schoolSkillEngage);
		return (M)this;
	}

	/**
	*获取聘任技术职务 
	*/
	public java.lang.String getSchoolSkillEngage() {
		return getStr("school_skill_engage");
	}

	/**
	*设置聘任技术职务级别 
	*/
	public M setSchoolSkillEngageLevel(java.lang.String schoolSkillEngageLevel) {
		set("school_skill_engage_level", schoolSkillEngageLevel);
		return (M)this;
	}

	/**
	*获取聘任技术职务级别 
	*/
	public java.lang.String getSchoolSkillEngageLevel() {
		return getStr("school_skill_engage_level");
	}

	/**
	*设置技术职务聘任年月 
	*/
	public M setSchoolSkillEngageDate(java.lang.String schoolSkillEngageDate) {
		set("school_skill_engage_date", schoolSkillEngageDate);
		return (M)this;
	}

	/**
	*获取技术职务聘任年月 
	*/
	public java.lang.String getSchoolSkillEngageDate() {
		return getStr("school_skill_engage_date");
	}

	/**
	*设置技术职务首聘年月 
	*/
	public M setSchoolSkillEngageBeginDate(java.lang.String schoolSkillEngageBeginDate) {
		set("school_skill_engage_begin_date", schoolSkillEngageBeginDate);
		return (M)this;
	}

	/**
	*获取技术职务首聘年月 
	*/
	public java.lang.String getSchoolSkillEngageBeginDate() {
		return getStr("school_skill_engage_begin_date");
	}

	/**
	*设置是否高级专家 
	*/
	public M setIsSenior(java.lang.String isSenior) {
		set("is_senior", isSenior);
		return (M)this;
	}

	/**
	*获取是否高级专家 
	*/
	public java.lang.String getIsSenior() {
		return getStr("is_senior");
	}

	/**
	*设置毕业年月 
	*/
	public M setGraduateDate(java.lang.String graduateDate) {
		set("graduate_date", graduateDate);
		return (M)this;
	}

	/**
	*获取毕业年月 
	*/
	public java.lang.String getGraduateDate() {
		return getStr("graduate_date");
	}

	/**
	*设置最高学位类型 
	*/
	public M setDegreeType(java.lang.Integer degreeType) {
		set("degree_type", degreeType);
		return (M)this;
	}

	/**
	*获取最高学位类型 
	*/
	public java.lang.Integer getDegreeType() {
		return getInt("degree_type");
	}

	/**
	*设置最高学位 
	*/
	public M setDegree(java.lang.String degree) {
		set("degree", degree);
		return (M)this;
	}

	/**
	*获取最高学位 
	*/
	public java.lang.String getDegree() {
		return getStr("degree");
	}

	/**
	*设置授学位年月 
	*/
	public M setDegreeDate(java.lang.String degreeDate) {
		set("degree_date", degreeDate);
		return (M)this;
	}

	/**
	*获取授学位年月 
	*/
	public java.lang.String getDegreeDate() {
		return getStr("degree_date");
	}

	/**
	*设置毕业学校或单位 
	*/
	public M setGraduationCompany(java.lang.String graduationCompany) {
		set("graduation_company", graduationCompany);
		return (M)this;
	}

	/**
	*获取毕业学校或单位 
	*/
	public java.lang.String getGraduationCompany() {
		return getStr("graduation_company");
	}

	/**
	*设置学院结构 
	*/
	public M setInstituteStructure(java.lang.String instituteStructure) {
		set("institute_structure", instituteStructure);
		return (M)this;
	}

	/**
	*获取学院结构 
	*/
	public java.lang.String getInstituteStructure() {
		return getStr("institute_structure");
	}

	/**
	*设置授学位单位 
	*/
	public M setDegreeCompany(java.lang.String degreeCompany) {
		set("degree_company", degreeCompany);
		return (M)this;
	}

	/**
	*获取授学位单位 
	*/
	public java.lang.String getDegreeCompany() {
		return getStr("degree_company");
	}

	/**
	*设置最高学历所学专业 
	*/
	public M setEducationMajor(java.lang.String educationMajor) {
		set("education_major", educationMajor);
		return (M)this;
	}

	/**
	*获取最高学历所学专业 
	*/
	public java.lang.String getEducationMajor() {
		return getStr("education_major");
	}

	/**
	*设置最高学位所学专业 
	*/
	public M setDegreeMajor(java.lang.String degreeMajor) {
		set("degree_major", degreeMajor);
		return (M)this;
	}

	/**
	*获取最高学位所学专业 
	*/
	public java.lang.String getDegreeMajor() {
		return getStr("degree_major");
	}

	/**
	*设置获得学历国家（地区） 
	*/
	public M setEducationCountry(java.lang.Integer educationCountry) {
		set("education_country", educationCountry);
		return (M)this;
	}

	/**
	*获取获得学历国家（地区） 
	*/
	public java.lang.Integer getEducationCountry() {
		return getInt("education_country");
	}

	/**
	*设置获得学位国家（地区） 
	*/
	public M setDegreeCountry(java.lang.Integer degreeCountry) {
		set("degree_country", degreeCountry);
		return (M)this;
	}

	/**
	*获取获得学位国家（地区） 
	*/
	public java.lang.Integer getDegreeCountry() {
		return getInt("degree_country");
	}

	/**
	*设置期限 
	*/
	public M setDeadline(java.lang.Integer deadline) {
		set("deadline", deadline);
		return (M)this;
	}

	/**
	*获取期限 
	*/
	public java.lang.Integer getDeadline() {
		return getInt("deadline");
	}

	/**
	*设置合同类型 
	*/
	public M setContractType(java.lang.Integer contractType) {
		set("contract_type", contractType);
		return (M)this;
	}

	/**
	*获取合同类型 
	*/
	public java.lang.Integer getContractType() {
		return getInt("contract_type");
	}

	/**
	*设置合同起始日期 
	*/
	public M setContractBeginDate(java.lang.String contractBeginDate) {
		set("contract_begin_date", contractBeginDate);
		return (M)this;
	}

	/**
	*获取合同起始日期 
	*/
	public java.lang.String getContractBeginDate() {
		return getStr("contract_begin_date");
	}

	/**
	*设置合同终止日期 
	*/
	public M setContractEndDate(java.lang.String contractEndDate) {
		set("contract_end_date", contractEndDate);
		return (M)this;
	}

	/**
	*获取合同终止日期 
	*/
	public java.lang.String getContractEndDate() {
		return getStr("contract_end_date");
	}

	/**
	*设置参保险种 
	*/
	public M setInsurance(java.lang.String insurance) {
		set("insurance", insurance);
		return (M)this;
	}

	/**
	*获取参保险种 
	*/
	public java.lang.String getInsurance() {
		return getStr("insurance");
	}

	/**
	*设置参保地 
	*/
	public M setInsurancePlace(java.lang.String insurancePlace) {
		set("insurance_place", insurancePlace);
		return (M)this;
	}

	/**
	*获取参保地 
	*/
	public java.lang.String getInsurancePlace() {
		return getStr("insurance_place");
	}

	/**
	*设置岗位聘任年月 
	*/
	public M setPostEngageDate(java.lang.String postEngageDate) {
		set("post_engage_date", postEngageDate);
		return (M)this;
	}

	/**
	*获取岗位聘任年月 
	*/
	public java.lang.String getPostEngageDate() {
		return getStr("post_engage_date");
	}

	/**
	*设置岗位年限 
	*/
	public M setPostYears(java.lang.String postYears) {
		set("post_years", postYears);
		return (M)this;
	}

	/**
	*获取岗位年限 
	*/
	public java.lang.String getPostYears() {
		return getStr("post_years");
	}

	/**
	*设置岗位工资 
	*/
	public M setPostWage(java.lang.String postWage) {
		set("post_wage", postWage);
		return (M)this;
	}

	/**
	*获取岗位工资 
	*/
	public java.lang.String getPostWage() {
		return getStr("post_wage");
	}

	/**
	*设置工龄工资 
	*/
	public M setSeniorityWage(java.lang.String seniorityWage) {
		set("seniority_wage", seniorityWage);
		return (M)this;
	}

	/**
	*获取工龄工资 
	*/
	public java.lang.String getSeniorityWage() {
		return getStr("seniority_wage");
	}

	/**
	*设置技术或学历津贴 
	*/
	public M setAllowance(java.lang.String allowance) {
		set("allowance", allowance);
		return (M)this;
	}

	/**
	*获取技术或学历津贴 
	*/
	public java.lang.String getAllowance() {
		return getStr("allowance");
	}

	/**
	*设置工资卡号 
	*/
	public M setWagesCard(java.lang.String wagesCard) {
		set("wages_card", wagesCard);
		return (M)this;
	}

	/**
	*获取工资卡号 
	*/
	public java.lang.String getWagesCard() {
		return getStr("wages_card");
	}

	/**
	*设置社保卡号 
	*/
	public M setSecurityCard(java.lang.String securityCard) {
		set("security_card", securityCard);
		return (M)this;
	}

	/**
	*获取社保卡号 
	*/
	public java.lang.String getSecurityCard() {
		return getStr("security_card");
	}

	/**
	*设置来后勤参保时间 
	*/
	public M setInsuranceDate(java.lang.String insuranceDate) {
		set("insurance_date", insuranceDate);
		return (M)this;
	}

	/**
	*获取来后勤参保时间 
	*/
	public java.lang.String getInsuranceDate() {
		return getStr("insurance_date");
	}

	/**
	*设置社保终止时间 
	*/
	public M setInsuranceEndDate(java.lang.String insuranceEndDate) {
		set("insurance_end_date", insuranceEndDate);
		return (M)this;
	}

	/**
	*获取社保终止时间 
	*/
	public java.lang.String getInsuranceEndDate() {
		return getStr("insurance_end_date");
	}

	/**
	*设置有无职业资格证书 (特种操作证、 上岗资格证等) 
	*/
	public M setHaveIcetu(java.lang.String haveIcetu) {
		set("have_icetu", haveIcetu);
		return (M)this;
	}

	/**
	*获取有无职业资格证书 (特种操作证、 上岗资格证等) 
	*/
	public java.lang.String getHaveIcetu() {
		return getStr("have_icetu");
	}

	/**
	*设置证书有效时间 
	*/
	public M setPeriodDate(java.lang.String periodDate) {
		set("period_date", periodDate);
		return (M)this;
	}

	/**
	*获取证书有效时间 
	*/
	public java.lang.String getPeriodDate() {
		return getStr("period_date");
	}

	/**
	*设置健康证办理时间 
	*/
	public M setHealthCert(java.lang.String healthCert) {
		set("health_cert", healthCert);
		return (M)this;
	}

	/**
	*获取健康证办理时间 
	*/
	public java.lang.String getHealthCert() {
		return getStr("health_cert");
	}

	/**
	*设置历年后勤评优情况 
	*/
	public M setAssessment(java.lang.String assessment) {
		set("assessment", assessment);
		return (M)this;
	}

	/**
	*获取历年后勤评优情况 
	*/
	public java.lang.String getAssessment() {
		return getStr("assessment");
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
	*设置就失业登记证 
	*/
	public M setEmpJobCard(java.lang.String empJobCard) {
		set("emp_job_card", empJobCard);
		return (M)this;
	}

	/**
	*获取就失业登记证 
	*/
	public java.lang.String getEmpJobCard() {
		return getStr("emp_job_card");
	}

	/**
	*设置合同编号 
	*/
	public M setContractNum(java.lang.String contractNum) {
		set("contract_num", contractNum);
		return (M)this;
	}

	/**
	*获取合同编号 
	*/
	public java.lang.String getContractNum() {
		return getStr("contract_num");
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

}
