package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_pacesetter_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPacesetterTemp<M extends BasePersonnelPacesetterTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPacesetterTempId(java.lang.Integer pacesetterTempId) {
		set("pacesetter_temp_id", pacesetterTempId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPacesetterTempId() {
		return getInt("pacesetter_temp_id");
	}

	/**
	*设置导入标识 
	*/
	public M setFlag(java.lang.Integer flag) {
		set("flag", flag);
		return (M)this;
	}

	/**
	*获取导入标识 
	*/
	public java.lang.Integer getFlag() {
		return getInt("flag");
	}

	/**
	*设置导入备注 
	*/
	public M setFlagRemark(java.lang.String flagRemark) {
		set("flag_remark", flagRemark);
		return (M)this;
	}

	/**
	*获取导入备注 
	*/
	public java.lang.String getFlagRemark() {
		return getStr("flag_remark");
	}

	/**
	*设置导入批次号 
	*/
	public M setBatchNumber(java.lang.String batchNumber) {
		set("batch_number", batchNumber);
		return (M)this;
	}

	/**
	*获取导入批次号 
	*/
	public java.lang.String getBatchNumber() {
		return getStr("batch_number");
	}

	/**
	*设置序号 
	*/
	public M setIndex(java.lang.String index) {
		set("index", index);
		return (M)this;
	}

	/**
	*获取序号 
	*/
	public java.lang.String getIndex() {
		return getStr("index");
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
	*设置员工姓名 
	*/
	public M setEmployeeName(java.lang.String employeeName) {
		set("employee_name", employeeName);
		return (M)this;
	}

	/**
	*获取员工姓名 
	*/
	public java.lang.String getEmployeeName() {
		return getStr("employee_name");
	}

	/**
	*设置证件号 
	*/
	public M setNum(java.lang.String num) {
		set("num", num);
		return (M)this;
	}

	/**
	*获取证件号 
	*/
	public java.lang.String getNum() {
		return getStr("num");
	}

	/**
	*设置员工性别 
	*/
	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取员工性别 
	*/
	public java.lang.String getSex() {
		return getStr("sex");
	}

	/**
	*设置机构中心 
	*/
	public M setCenter(java.lang.String center) {
		set("center", center);
		return (M)this;
	}

	/**
	*获取机构中心 
	*/
	public java.lang.String getCenter() {
		return getStr("center");
	}

	/**
	*设置所属部门 
	*/
	public M setDepartment(java.lang.String department) {
		set("department", department);
		return (M)this;
	}

	/**
	*获取所属部门 
	*/
	public java.lang.String getDepartment() {
		return getStr("department");
	}

	/**
	*设置岗位 
	*/
	public M setPost(java.lang.String post) {
		set("post", post);
		return (M)this;
	}

	/**
	*获取岗位 
	*/
	public java.lang.String getPost() {
		return getStr("post");
	}

	/**
	*设置评定年份 
	*/
	public M setTheYear(java.lang.String theYear) {
		set("the_year", theYear);
		return (M)this;
	}

	/**
	*获取评定年份 
	*/
	public java.lang.String getTheYear() {
		return getStr("the_year");
	}

	/**
	*设置评定时间 
	*/
	public M setTheTime(java.lang.String theTime) {
		set("the_time", theTime);
		return (M)this;
	}

	/**
	*获取评定时间 
	*/
	public java.lang.String getTheTime() {
		return getStr("the_time");
	}

	/**
	*设置标兵类型 
	*/
	public M setType(java.lang.String type) {
		set("type", type);
		return (M)this;
	}

	/**
	*获取标兵类型 
	*/
	public java.lang.String getType() {
		return getStr("type");
	}

	/**
	*设置标兵事迹 
	*/
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取标兵事迹 
	*/
	public java.lang.String getContent() {
		return getStr("content");
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
	*设置标兵类型值 
	*/
	public M setTypeValue(java.lang.Integer typeValue) {
		set("type_value", typeValue);
		return (M)this;
	}

	/**
	*获取标兵类型值 
	*/
	public java.lang.Integer getTypeValue() {
		return getInt("type_value");
	}

	/**
	*设置员工id 
	*/
	public M setEmployeeInformationId(java.lang.Integer employeeInformationId) {
		set("employee_information_id", employeeInformationId);
		return (M)this;
	}

	/**
	*获取员工id 
	*/
	public java.lang.Integer getEmployeeInformationId() {
		return getInt("employee_information_id");
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
