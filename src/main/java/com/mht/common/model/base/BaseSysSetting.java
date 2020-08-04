package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_setting:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysSetting<M extends BaseSysSetting<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSettingId(java.lang.Integer settingId) {
		set("setting_id", settingId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSettingId() {
		return getInt("setting_id");
	}

	/**
	*设置学校代码 
	*/
	public M setSchoolCode(java.lang.String schoolCode) {
		set("school_code", schoolCode);
		return (M)this;
	}

	/**
	*获取学校代码 
	*/
	public java.lang.String getSchoolCode() {
		return getStr("school_code");
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
	*设置系统名称 
	*/
	public M setSysName(java.lang.String sysName) {
		set("sys_name", sysName);
		return (M)this;
	}

	/**
	*获取系统名称 
	*/
	public java.lang.String getSysName() {
		return getStr("sys_name");
	}

	/**
	*设置系统URL 
	*/
	public M setSysUrl(java.lang.String sysUrl) {
		set("sys_url", sysUrl);
		return (M)this;
	}

	/**
	*获取系统URL 
	*/
	public java.lang.String getSysUrl() {
		return getStr("sys_url");
	}

	/**
	*设置登录地址 
	*/
	public M setLoginUrl(java.lang.String loginUrl) {
		set("login_url", loginUrl);
		return (M)this;
	}

	/**
	*获取登录地址 
	*/
	public java.lang.String getLoginUrl() {
		return getStr("login_url");
	}

	/**
	*设置关键字 
	*/
	public M setKeywords(java.lang.String keywords) {
		set("keywords", keywords);
		return (M)this;
	}

	/**
	*获取关键字 
	*/
	public java.lang.String getKeywords() {
		return getStr("keywords");
	}

	/**
	*设置描述 
	*/
	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}

	/**
	*获取描述 
	*/
	public java.lang.String getDescription() {
		return getStr("description");
	}

	/**
	*设置author 
	*/
	public M setAuthor(java.lang.String author) {
		set("author", author);
		return (M)this;
	}

	/**
	*获取author 
	*/
	public java.lang.String getAuthor() {
		return getStr("author");
	}

	/**
	*设置copyright 
	*/
	public M setCopyright(java.lang.String copyright) {
		set("copyright", copyright);
		return (M)this;
	}

	/**
	*获取copyright 
	*/
	public java.lang.String getCopyright() {
		return getStr("copyright");
	}

	/**
	*设置domain 
	*/
	public M setDomain(java.lang.String domain) {
		set("domain", domain);
		return (M)this;
	}

	/**
	*获取domain 
	*/
	public java.lang.String getDomain() {
		return getStr("domain");
	}

	/**
	*设置icp 
	*/
	public M setIcp(java.lang.String icp) {
		set("icp", icp);
		return (M)this;
	}

	/**
	*获取icp 
	*/
	public java.lang.String getIcp() {
		return getStr("icp");
	}

	/**
	*设置phone 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取phone 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置address 
	*/
	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	/**
	*获取address 
	*/
	public java.lang.String getAddress() {
		return getStr("address");
	}

	/**
	*设置email 
	*/
	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}

	/**
	*获取email 
	*/
	public java.lang.String getEmail() {
		return getStr("email");
	}

	/**
	*设置postcode 
	*/
	public M setPostcode(java.lang.String postcode) {
		set("postcode", postcode);
		return (M)this;
	}

	/**
	*获取postcode 
	*/
	public java.lang.String getPostcode() {
		return getStr("postcode");
	}

	/**
	*设置qq 
	*/
	public M setQq(java.lang.String qq) {
		set("qq", qq);
		return (M)this;
	}

	/**
	*获取qq 
	*/
	public java.lang.String getQq() {
		return getStr("qq");
	}

	/**
	*设置logo_admin 
	*/
	public M setLogoAdmin(java.lang.String logoAdmin) {
		set("logo_admin", logoAdmin);
		return (M)this;
	}

	/**
	*获取logo_admin 
	*/
	public java.lang.String getLogoAdmin() {
		return getStr("logo_admin");
	}

	/**
	*设置logo_login 
	*/
	public M setLogoLogin(java.lang.String logoLogin) {
		set("logo_login", logoLogin);
		return (M)this;
	}

	/**
	*获取logo_login 
	*/
	public java.lang.String getLogoLogin() {
		return getStr("logo_login");
	}

	/**
	*设置logo_roll_table 
	*/
	public M setLogoRollTable(java.lang.String logoRollTable) {
		set("logo_roll_table", logoRollTable);
		return (M)this;
	}

	/**
	*获取logo_roll_table 
	*/
	public java.lang.String getLogoRollTable() {
		return getStr("logo_roll_table");
	}

	/**
	*设置student_url 
	*/
	public M setStudentUrl(java.lang.String studentUrl) {
		set("student_url", studentUrl);
		return (M)this;
	}

	/**
	*获取student_url 
	*/
	public java.lang.String getStudentUrl() {
		return getStr("student_url");
	}

	/**
	*设置manage_url 
	*/
	public M setManageUrl(java.lang.String manageUrl) {
		set("manage_url", manageUrl);
		return (M)this;
	}

	/**
	*获取manage_url 
	*/
	public java.lang.String getManageUrl() {
		return getStr("manage_url");
	}

	/**
	*设置learning_url 
	*/
	public M setLearningUrl(java.lang.String learningUrl) {
		set("learning_url", learningUrl);
		return (M)this;
	}

	/**
	*获取learning_url 
	*/
	public java.lang.String getLearningUrl() {
		return getStr("learning_url");
	}

	/**
	*设置exam_url 
	*/
	public M setExamUrl(java.lang.String examUrl) {
		set("exam_url", examUrl);
		return (M)this;
	}

	/**
	*获取exam_url 
	*/
	public java.lang.String getExamUrl() {
		return getStr("exam_url");
	}

	/**
	*设置exam_proxy 
	*/
	public M setExamProxy(java.lang.String examProxy) {
		set("exam_proxy", examProxy);
		return (M)this;
	}

	/**
	*获取exam_proxy 
	*/
	public java.lang.String getExamProxy() {
		return getStr("exam_proxy");
	}

	/**
	*设置main_site_code 
	*/
	public M setMainSiteCode(java.lang.String mainSiteCode) {
		set("main_site_code", mainSiteCode);
		return (M)this;
	}

	/**
	*获取main_site_code 
	*/
	public java.lang.String getMainSiteCode() {
		return getStr("main_site_code");
	}

	/**
	*设置main_hand_code 
	*/
	public M setMainHandCode(java.lang.String mainHandCode) {
		set("main_hand_code", mainHandCode);
		return (M)this;
	}

	/**
	*获取main_hand_code 
	*/
	public java.lang.String getMainHandCode() {
		return getStr("main_hand_code");
	}

	/**
	*设置main_province_code 
	*/
	public M setMainProvinceCode(java.lang.String mainProvinceCode) {
		set("main_province_code", mainProvinceCode);
		return (M)this;
	}

	/**
	*获取main_province_code 
	*/
	public java.lang.String getMainProvinceCode() {
		return getStr("main_province_code");
	}

}
