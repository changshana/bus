package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_student_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryStudentTemp<M extends BaseDormitoryStudentTemp<M>> extends Model<M> implements IBean {

	/**
	*设置编号 
	*/
	public M setTempId(java.lang.Integer tempId) {
		set("temp_id", tempId);
		return (M)this;
	}

	/**
	*获取编号 
	*/
	public java.lang.Integer getTempId() {
		return getInt("temp_id");
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
	*设置学号 
	*/
	public M setStudentNum(java.lang.String studentNum) {
		set("student_num", studentNum);
		return (M)this;
	}

	/**
	*获取学号 
	*/
	public java.lang.String getStudentNum() {
		return getStr("student_num");
	}

	/**
	*设置姓名 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取姓名 
	*/
	public java.lang.String getName() {
		return getStr("name");
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
	*设置性别描述 
	*/
	public M setSexDesc(java.lang.String sexDesc) {
		set("sex_desc", sexDesc);
		return (M)this;
	}

	/**
	*获取性别描述 
	*/
	public java.lang.String getSexDesc() {
		return getStr("sex_desc");
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
	*设置学生类别 
	*/
	public M setCategory(java.lang.Integer category) {
		set("category", category);
		return (M)this;
	}

	/**
	*获取学生类别 
	*/
	public java.lang.Integer getCategory() {
		return getInt("category");
	}

	/**
	*设置学生类别描述 
	*/
	public M setCategoryDesc(java.lang.String categoryDesc) {
		set("category_desc", categoryDesc);
		return (M)this;
	}

	/**
	*获取学生类别描述 
	*/
	public java.lang.String getCategoryDesc() {
		return getStr("category_desc");
	}

	/**
	*设置政治面貌 
	*/
	public M setPolitical(java.lang.Integer political) {
		set("political", political);
		return (M)this;
	}

	/**
	*获取政治面貌 
	*/
	public java.lang.Integer getPolitical() {
		return getInt("political");
	}

	/**
	*设置政治面貌描述 
	*/
	public M setPoliticalDesc(java.lang.String politicalDesc) {
		set("political_desc", politicalDesc);
		return (M)this;
	}

	/**
	*获取政治面貌描述 
	*/
	public java.lang.String getPoliticalDesc() {
		return getStr("political_desc");
	}

	/**
	*设置家庭住址 
	*/
	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	/**
	*获取家庭住址 
	*/
	public java.lang.String getAddress() {
		return getStr("address");
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
	*设置所属校区 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取所属校区 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置所属院系 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取所属院系 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置专业 
	*/
	public M setMajorId(java.lang.Integer majorId) {
		set("major_id", majorId);
		return (M)this;
	}

	/**
	*获取专业 
	*/
	public java.lang.Integer getMajorId() {
		return getInt("major_id");
	}

	/**
	*设置所属班级 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取所属班级 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
	}

	/**
	*设置入学时间 
	*/
	public M setEnrollDate(java.lang.String enrollDate) {
		set("enroll_date", enrollDate);
		return (M)this;
	}

	/**
	*获取入学时间 
	*/
	public java.lang.String getEnrollDate() {
		return getStr("enroll_date");
	}

	/**
	*设置考号 
	*/
	public M setExamNum(java.lang.String examNum) {
		set("exam_num", examNum);
		return (M)this;
	}

	/**
	*获取考号 
	*/
	public java.lang.String getExamNum() {
		return getStr("exam_num");
	}

	/**
	*设置是否毕业 
	*/
	public M setGraduateStatus(java.lang.Integer graduateStatus) {
		set("graduate_status", graduateStatus);
		return (M)this;
	}

	/**
	*获取是否毕业 
	*/
	public java.lang.Integer getGraduateStatus() {
		return getInt("graduate_status");
	}

	/**
	*设置毕业日期 
	*/
	public M setGraduateDate(java.lang.String graduateDate) {
		set("graduate_date", graduateDate);
		return (M)this;
	}

	/**
	*获取毕业日期 
	*/
	public java.lang.String getGraduateDate() {
		return getStr("graduate_date");
	}

	/**
	*设置联系电话 
	*/
	public M setTelphone(java.lang.String telphone) {
		set("telphone", telphone);
		return (M)this;
	}

	/**
	*获取联系电话 
	*/
	public java.lang.String getTelphone() {
		return getStr("telphone");
	}

	/**
	*设置临时数据类型 
	*/
	public M setType(java.lang.String type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取临时数据类型 
	*/
	public java.lang.String getType() {
		return getStr("type");
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
	*设置创建日期 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置验证失败原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取验证失败原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
	}

	/**
	*设置年级 
	*/
	public M setEnrollYear(java.lang.String enrollYear) {
		set("enroll_year", enrollYear);
		return (M)this;
	}

	/**
	*获取年级 
	*/
	public java.lang.String getEnrollYear() {
		return getStr("enroll_year");
	}

	/**
	*设置学制 
	*/
	public M setEductionalYear(java.lang.String eductionalYear) {
		set("eductional_year", eductionalYear);
		return (M)this;
	}

	/**
	*获取学制 
	*/
	public java.lang.String getEductionalYear() {
		return getStr("eductional_year");
	}

	/**
	*设置校区名称 
	*/
	public M setSiteName(java.lang.String siteName) {
		set("site_name", siteName);
		return (M)this;
	}

	/**
	*获取校区名称 
	*/
	public java.lang.String getSiteName() {
		return getStr("site_name");
	}

	/**
	*设置院系名称 
	*/
	public M setDepartmentName(java.lang.String departmentName) {
		set("department_name", departmentName);
		return (M)this;
	}

	/**
	*获取院系名称 
	*/
	public java.lang.String getDepartmentName() {
		return getStr("department_name");
	}

	/**
	*设置专业名称 
	*/
	public M setMajorName(java.lang.String majorName) {
		set("major_name", majorName);
		return (M)this;
	}

	/**
	*获取专业名称 
	*/
	public java.lang.String getMajorName() {
		return getStr("major_name");
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
	*设置批次号 
	*/
	public M setBatchNumber(java.lang.String batchNumber) {
		set("batch_number", batchNumber);
		return (M)this;
	}

	/**
	*获取批次号 
	*/
	public java.lang.String getBatchNumber() {
		return getStr("batch_number");
	}

	/**
	*设置出生日期 
	*/
	public M setBirthday(java.lang.String birthday) {
		set("birthday", birthday);
		return (M)this;
	}

	/**
	*获取出生日期 
	*/
	public java.lang.String getBirthday() {
		return getStr("birthday");
	}

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}
