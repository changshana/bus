package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_account:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentAccount<M extends BaseCommentAccount<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setAccId(java.lang.Long accId) {
		set("acc_id", accId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getAccId() {
		return getLong("acc_id");
	}

	/**
	*设置 
	*/
	public M setAccBirthday(java.util.Date accBirthday) {
		set("acc_birthday", accBirthday);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getAccBirthday() {
		return get("acc_birthday");
	}

	/**
	*设置 
	*/
	public M setAccEmail(java.lang.String accEmail) {
		set("acc_email", accEmail);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccEmail() {
		return getStr("acc_email");
	}

	/**
	*设置 
	*/
	public M setAccNickname(java.lang.String accNickname) {
		set("acc_nickname", accNickname);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccNickname() {
		return getStr("acc_nickname");
	}

	/**
	*设置 
	*/
	public M setAccPassword(java.lang.String accPassword) {
		set("acc_password", accPassword);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccPassword() {
		return getStr("acc_password");
	}

	/**
	*设置 
	*/
	public M setAccPhone(java.lang.String accPhone) {
		set("acc_phone", accPhone);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAccPhone() {
		return getStr("acc_phone");
	}

	/**
	*设置 
	*/
	public M setSysdeptDeptId(java.lang.Long sysdeptDeptId) {
		set("sysDept_dept_id", sysdeptDeptId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSysdeptDeptId() {
		return getLong("sysDept_dept_id");
	}

	/**
	*设置 
	*/
	public M setSysgradeGradeId(java.lang.Integer sysgradeGradeId) {
		set("sysGrade_grade_id", sysgradeGradeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getSysgradeGradeId() {
		return getInt("sysGrade_grade_id");
	}

	/**
	*设置 
	*/
	public M setDeptId(java.lang.String deptId) {
		set("deptId", deptId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDeptId() {
		return getStr("deptId");
	}

	/**
	*设置 
	*/
	public M setState(java.lang.String state) {
		set("state", state);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getState() {
		return getStr("state");
	}

	/**
	*设置 
	*/
	public M setPhoto(java.lang.String photo) {
		set("photo", photo);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPhoto() {
		return getStr("photo");
	}

	/**
	*设置 
	*/
	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getSex() {
		return getStr("sex");
	}

	/**
	*设置验证码 
	*/
	public M setRand(java.lang.String rand) {
		set("rand", rand);
		return (M)this;
	}

	/**
	*获取验证码 
	*/
	public java.lang.String getRand() {
		return getStr("rand");
	}

	/**
	*设置验证码时间 
	*/
	public M setData(java.util.Date data) {
		set("data", data);
		return (M)this;
	}

	/**
	*获取验证码时间 
	*/
	public java.util.Date getData() {
		return get("data");
	}

}
