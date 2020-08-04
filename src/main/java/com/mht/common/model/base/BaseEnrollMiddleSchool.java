package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * enroll_middle_school:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseEnrollMiddleSchool<M extends BaseEnrollMiddleSchool<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMiddleSchoolId(java.lang.Integer middleSchoolId) {
		set("middle_school_id", middleSchoolId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMiddleSchoolId() {
		return getInt("middle_school_id");
	}

	/**
	*设置代码 
	*/
	public M setMiddleSchoolCode(java.lang.String middleSchoolCode) {
		set("middle_school_code", middleSchoolCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getMiddleSchoolCode() {
		return getStr("middle_school_code");
	}

	/**
	*设置中学类型 
	*/
	public M setSchoolTypeId(java.lang.Integer schoolTypeId) {
		set("school_type_id", schoolTypeId);
		return (M)this;
	}

	/**
	*获取中学类型 
	*/
	public java.lang.Integer getSchoolTypeId() {
		return getInt("school_type_id");
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
	*设置现就读学校 
	*/
	public M setNowTheSchool(java.lang.String nowTheSchool) {
		set("now_the_school", nowTheSchool);
		return (M)this;
	}

	/**
	*获取现就读学校 
	*/
	public java.lang.String getNowTheSchool() {
		return getStr("now_the_school");
	}

	/**
	*设置申请就读学校 
	*/
	public M setApplySchool(java.lang.String applySchool) {
		set("apply_school", applySchool);
		return (M)this;
	}

	/**
	*获取申请就读学校 
	*/
	public java.lang.String getApplySchool() {
		return getStr("apply_school");
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
	*设置生日 
	*/
	public M setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
		return (M)this;
	}

	/**
	*获取生日 
	*/
	public java.util.Date getBirthday() {
		return get("birthday");
	}

	/**
	*设置父亲姓名 
	*/
	public M setFatherName(java.lang.String fatherName) {
		set("father_name", fatherName);
		return (M)this;
	}

	/**
	*获取父亲姓名 
	*/
	public java.lang.String getFatherName() {
		return getStr("father_name");
	}

	/**
	*设置母亲姓名 
	*/
	public M setMotherName(java.lang.String motherName) {
		set("mother_name", motherName);
		return (M)this;
	}

	/**
	*获取母亲姓名 
	*/
	public java.lang.String getMotherName() {
		return getStr("mother_name");
	}

	/**
	*设置母亲工作单位 
	*/
	public M setMotherWorkUnit(java.lang.String motherWorkUnit) {
		set("mother_work_unit", motherWorkUnit);
		return (M)this;
	}

	/**
	*获取母亲工作单位 
	*/
	public java.lang.String getMotherWorkUnit() {
		return getStr("mother_work_unit");
	}

	/**
	*设置父亲工作单位 
	*/
	public M setFatherWorkUnit(java.lang.String fatherWorkUnit) {
		set("father_work_unit", fatherWorkUnit);
		return (M)this;
	}

	/**
	*获取父亲工作单位 
	*/
	public java.lang.String getFatherWorkUnit() {
		return getStr("father_work_unit");
	}

	/**
	*设置父亲工作职务 
	*/
	public M setFatherWorkDuty(java.lang.String fatherWorkDuty) {
		set("father_work_duty", fatherWorkDuty);
		return (M)this;
	}

	/**
	*获取父亲工作职务 
	*/
	public java.lang.String getFatherWorkDuty() {
		return getStr("father_work_duty");
	}

	/**
	*设置母亲工作职务 
	*/
	public M setMotherWorkDuty(java.lang.String motherWorkDuty) {
		set("mother_work_duty", motherWorkDuty);
		return (M)this;
	}

	/**
	*获取母亲工作职务 
	*/
	public java.lang.String getMotherWorkDuty() {
		return getStr("mother_work_duty");
	}

	/**
	*设置父亲联系方式 
	*/
	public M setFatherPhone(java.lang.String fatherPhone) {
		set("father_phone", fatherPhone);
		return (M)this;
	}

	/**
	*获取父亲联系方式 
	*/
	public java.lang.String getFatherPhone() {
		return getStr("father_phone");
	}

	/**
	*设置母亲联系方式 
	*/
	public M setMotherPhone(java.lang.String motherPhone) {
		set("mother_phone", motherPhone);
		return (M)this;
	}

	/**
	*获取母亲联系方式 
	*/
	public java.lang.String getMotherPhone() {
		return getStr("mother_phone");
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
	*设置父亲工资号 
	*/
	public M setFatherSalaryNumber(java.lang.Integer fatherSalaryNumber) {
		set("father_salary_number", fatherSalaryNumber);
		return (M)this;
	}

	/**
	*获取父亲工资号 
	*/
	public java.lang.Integer getFatherSalaryNumber() {
		return getInt("father_salary_number");
	}

	/**
	*设置母亲工资号 
	*/
	public M setMotherSalaryNumber(java.lang.Integer motherSalaryNumber) {
		set("mother_salary_number", motherSalaryNumber);
		return (M)this;
	}

	/**
	*获取母亲工资号 
	*/
	public java.lang.Integer getMotherSalaryNumber() {
		return getInt("mother_salary_number");
	}

}
