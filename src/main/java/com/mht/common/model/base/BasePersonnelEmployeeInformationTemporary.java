package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_employee_information_temporary:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelEmployeeInformationTemporary<M extends BasePersonnelEmployeeInformationTemporary<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setEmployeeInformationId(java.lang.Integer employeeInformationId) {
		set("employee_information_id", employeeInformationId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getEmployeeInformationId() {
		return getInt("employee_information_id");
	}

	/**
	*设置中心id 
	*/
	public M setCenterId(java.lang.Integer centerId) {
		set("center_id", centerId);
		return (M)this;
	}

	/**
	*获取中心id 
	*/
	public java.lang.Integer getCenterId() {
		return getInt("center_id");
	}

	/**
	*设置服务部id 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取服务部id 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置级别 
	*/
	public M setLevel(java.lang.String level) {
		set("level", level);
		return (M)this;
	}

	/**
	*获取级别 
	*/
	public java.lang.String getLevel() {
		return getStr("level");
	}

	/**
	*设置工作校区 
	*/
	public M setSchoolZone(java.lang.Integer schoolZone) {
		set("school_zone", schoolZone);
		return (M)this;
	}

	/**
	*获取工作校区 
	*/
	public java.lang.Integer getSchoolZone() {
		return getInt("school_zone");
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
	*设置身份证号 
	*/
	public M setCertificatesNum(java.lang.String certificatesNum) {
		set("certificates_num", certificatesNum);
		return (M)this;
	}

	/**
	*获取身份证号 
	*/
	public java.lang.String getCertificatesNum() {
		return getStr("certificates_num");
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
	*设置员工类型 
	*/
	public M setEmployeeType(java.lang.String employeeType) {
		set("employee_type", employeeType);
		return (M)this;
	}

	/**
	*获取员工类型 
	*/
	public java.lang.String getEmployeeType() {
		return getStr("employee_type");
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
	*设置文化程度 
	*/
	public M setEducationDegree(java.lang.String educationDegree) {
		set("education_degree", educationDegree);
		return (M)this;
	}

	/**
	*获取文化程度 
	*/
	public java.lang.String getEducationDegree() {
		return getStr("education_degree");
	}

	/**
	*设置毕业学校 
	*/
	public M setGraduateSchool(java.lang.String graduateSchool) {
		set("graduate_school", graduateSchool);
		return (M)this;
	}

	/**
	*获取毕业学校 
	*/
	public java.lang.String getGraduateSchool() {
		return getStr("graduate_school");
	}

	/**
	*设置毕业日期 
	*/
	public M setGraduateDate(java.util.Date graduateDate) {
		set("graduate_date", graduateDate);
		return (M)this;
	}

	/**
	*获取毕业日期 
	*/
	public java.util.Date getGraduateDate() {
		return get("graduate_date");
	}

	/**
	*设置所学专业 
	*/
	public M setMajor(java.lang.String major) {
		set("major", major);
		return (M)this;
	}

	/**
	*获取所学专业 
	*/
	public java.lang.String getMajor() {
		return getStr("major");
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
	*设置失业证码 
	*/
	public M setUnemployNum(java.lang.String unemployNum) {
		set("unemploy_num", unemployNum);
		return (M)this;
	}

	/**
	*获取失业证码 
	*/
	public java.lang.String getUnemployNum() {
		return getStr("unemploy_num");
	}

	/**
	*设置户口类型 
	*/
	public M setResidenceType(java.lang.String residenceType) {
		set("residence_type", residenceType);
		return (M)this;
	}

	/**
	*获取户口类型 
	*/
	public java.lang.String getResidenceType() {
		return getStr("residence_type");
	}

	/**
	*设置户籍地址 
	*/
	public M setPermanentAddress(java.lang.String permanentAddress) {
		set("permanent_address", permanentAddress);
		return (M)this;
	}

	/**
	*获取户籍地址 
	*/
	public java.lang.String getPermanentAddress() {
		return getStr("permanent_address");
	}

	/**
	*设置现居地址 
	*/
	public M setResidenceAddress(java.lang.String residenceAddress) {
		set("residence_address", residenceAddress);
		return (M)this;
	}

	/**
	*获取现居地址 
	*/
	public java.lang.String getResidenceAddress() {
		return getStr("residence_address");
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
	*设置电话 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取电话 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置紧急联系人 
	*/
	public M setEmergencyContact(java.lang.String emergencyContact) {
		set("emergency_contact", emergencyContact);
		return (M)this;
	}

	/**
	*获取紧急联系人 
	*/
	public java.lang.String getEmergencyContact() {
		return getStr("emergency_contact");
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
	*设置职工来源 
	*/
	public M setEmployeeSource(java.lang.String employeeSource) {
		set("employee_source", employeeSource);
		return (M)this;
	}

	/**
	*获取职工来源 
	*/
	public java.lang.String getEmployeeSource() {
		return getStr("employee_source");
	}

	/**
	*设置用工形式 
	*/
	public M setWorkForm(java.lang.String workForm) {
		set("work_form", workForm);
		return (M)this;
	}

	/**
	*获取用工形式 
	*/
	public java.lang.String getWorkForm() {
		return getStr("work_form");
	}

	/**
	*设置起始日期 
	*/
	public M setStartDate(java.util.Date startDate) {
		set("start_date", startDate);
		return (M)this;
	}

	/**
	*获取起始日期 
	*/
	public java.util.Date getStartDate() {
		return get("start_date");
	}

	/**
	*设置合同次数 
	*/
	public M setContractsFrequency(java.lang.String contractsFrequency) {
		set("contracts_frequency", contractsFrequency);
		return (M)this;
	}

	/**
	*获取合同次数 
	*/
	public java.lang.String getContractsFrequency() {
		return getStr("contracts_frequency");
	}

	/**
	*设置聘任日期 
	*/
	public M setAppointmentDate(java.util.Date appointmentDate) {
		set("appointment_date", appointmentDate);
		return (M)this;
	}

	/**
	*获取聘任日期 
	*/
	public java.util.Date getAppointmentDate() {
		return get("appointment_date");
	}

	/**
	*设置岗位 
	*/
	public M setPost(java.lang.Integer post) {
		set("post", post);
		return (M)this;
	}

	/**
	*获取岗位 
	*/
	public java.lang.Integer getPost() {
		return getInt("post");
	}

	/**
	*设置岗位年限 
	*/
	public M setPostYear(java.lang.String postYear) {
		set("post_year", postYear);
		return (M)this;
	}

	/**
	*获取岗位年限 
	*/
	public java.lang.String getPostYear() {
		return getStr("post_year");
	}

	/**
	*设置参工日期 
	*/
	public M setJobDate(java.util.Date jobDate) {
		set("job_date", jobDate);
		return (M)this;
	}

	/**
	*获取参工日期 
	*/
	public java.util.Date getJobDate() {
		return get("job_date");
	}

	/**
	*设置工作年限 
	*/
	public M setJobYear(java.lang.String jobYear) {
		set("job_year", jobYear);
		return (M)this;
	}

	/**
	*获取工作年限 
	*/
	public java.lang.String getJobYear() {
		return getStr("job_year");
	}

	/**
	*设置工资号 
	*/
	public M setJobNum(java.lang.String jobNum) {
		set("job_num", jobNum);
		return (M)this;
	}

	/**
	*获取工资号 
	*/
	public java.lang.String getJobNum() {
		return getStr("job_num");
	}

	/**
	*设置工资卡号 
	*/
	public M setJobCardNum(java.lang.String jobCardNum) {
		set("job_card_num", jobCardNum);
		return (M)this;
	}

	/**
	*获取工资卡号 
	*/
	public java.lang.String getJobCardNum() {
		return getStr("job_card_num");
	}

	/**
	*设置入工会日期 
	*/
	public M setJoinJobDate(java.util.Date joinJobDate) {
		set("join_job_date", joinJobDate);
		return (M)this;
	}

	/**
	*获取入工会日期 
	*/
	public java.util.Date getJoinJobDate() {
		return get("join_job_date");
	}

	/**
	*设置离退日期 
	*/
	public M setLeaveJobDate(java.util.Date leaveJobDate) {
		set("leave_job_date", leaveJobDate);
		return (M)this;
	}

	/**
	*获取离退日期 
	*/
	public java.util.Date getLeaveJobDate() {
		return get("leave_job_date");
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
	*设置合同类型 
	*/
	public M setContractType(java.lang.String contractType) {
		set("contract_type", contractType);
		return (M)this;
	}

	/**
	*获取合同类型 
	*/
	public java.lang.String getContractType() {
		return getStr("contract_type");
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
	*设置保险类型 
	*/
	public M setInsuranceType(java.lang.String insuranceType) {
		set("insurance_type", insuranceType);
		return (M)this;
	}

	/**
	*获取保险类型 
	*/
	public java.lang.String getInsuranceType() {
		return getStr("insurance_type");
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
	public M setCreatorTime(java.util.Date creatorTime) {
		set("creator_time", creatorTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreatorTime() {
		return get("creator_time");
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

}
