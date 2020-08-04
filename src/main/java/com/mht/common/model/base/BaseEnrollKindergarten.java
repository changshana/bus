package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * enroll_kindergarten:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseEnrollKindergarten<M extends BaseEnrollKindergarten<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setKindergartenId(java.lang.Integer kindergartenId) {
		set("kindergarten_id", kindergartenId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getKindergartenId() {
		return getInt("kindergarten_id");
	}

	/**
	*设置名称 
	*/
	public M setKindergartenName(java.lang.String kindergartenName) {
		set("kindergarten_name", kindergartenName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getKindergartenName() {
		return getStr("kindergarten_name");
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
	*设置民族 
	*/
	public M setNationId(java.lang.Integer nationId) {
		set("nation_id", nationId);
		return (M)this;
	}

	/**
	*获取民族 
	*/
	public java.lang.Integer getNationId() {
		return getInt("nation_id");
	}

	/**
	*设置身份证 
	*/
	public M setIdentityCard(java.lang.String identityCard) {
		set("identity_card", identityCard);
		return (M)this;
	}

	/**
	*获取身份证 
	*/
	public java.lang.String getIdentityCard() {
		return getStr("identity_card");
	}

	/**
	*设置省 
	*/
	public M setProvinceCode(java.lang.String provinceCode) {
		set("province_code", provinceCode);
		return (M)this;
	}

	/**
	*获取省 
	*/
	public java.lang.String getProvinceCode() {
		return getStr("province_code");
	}

	/**
	*设置市 
	*/
	public M setCityCode(java.lang.String cityCode) {
		set("city_code", cityCode);
		return (M)this;
	}

	/**
	*获取市 
	*/
	public java.lang.String getCityCode() {
		return getStr("city_code");
	}

	/**
	*设置区 
	*/
	public M setTownCode(java.lang.String townCode) {
		set("town_code", townCode);
		return (M)this;
	}

	/**
	*获取区 
	*/
	public java.lang.String getTownCode() {
		return getStr("town_code");
	}

	/**
	*设置所在地派出所 
	*/
	public M setPoliceStation(java.lang.String policeStation) {
		set("police_station", policeStation);
		return (M)this;
	}

	/**
	*获取所在地派出所 
	*/
	public java.lang.String getPoliceStation() {
		return getStr("police_station");
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
	*设置健康状态 
	*/
	public M setFitnessStatus(java.lang.String fitnessStatus) {
		set("fitness_status", fitnessStatus);
		return (M)this;
	}

	/**
	*获取健康状态 
	*/
	public java.lang.String getFitnessStatus() {
		return getStr("fitness_status");
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

	/**
	*设置代码 
	*/
	public M setKindergartenCode(java.lang.String kindergartenCode) {
		set("kindergarten_code", kindergartenCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getKindergartenCode() {
		return getStr("kindergarten_code");
	}

}
