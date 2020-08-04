package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_counsellor:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCounsellor<M extends BaseDormitoryCounsellor<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCounsellorId(java.lang.Integer counsellorId) {
		set("counsellor_id", counsellorId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCounsellorId() {
		return getInt("counsellor_id");
	}

	/**
	*设置名称 
	*/
	public M setCounsellorName(java.lang.String counsellorName) {
		set("counsellor_name", counsellorName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getCounsellorName() {
		return getStr("counsellor_name");
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
	*设置辅导员工号 
	*/
	public M setJobNum(java.lang.String jobNum) {
		set("job_num", jobNum);
		return (M)this;
	}

	/**
	*获取辅导员工号 
	*/
	public java.lang.String getJobNum() {
		return getStr("job_num");
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
	*设置Email 
	*/
	public M setEmail(java.lang.String email) {
		set("email", email);
		return (M)this;
	}

	/**
	*获取Email 
	*/
	public java.lang.String getEmail() {
		return getStr("email");
	}

	/**
	*设置座机电话 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取座机电话 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	/**
	*设置家庭住址 
	*/
	public M setPlace(java.lang.String place) {
		set("place", place);
		return (M)this;
	}

	/**
	*获取家庭住址 
	*/
	public java.lang.String getPlace() {
		return getStr("place");
	}

	/**
	*设置数据来源 
	*/
	public M setDataSource(java.lang.String dataSource) {
		set("data_source", dataSource);
		return (M)this;
	}

	/**
	*获取数据来源 
	*/
	public java.lang.String getDataSource() {
		return getStr("data_source");
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
	*设置手机号 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取手机号 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置 
	*/
	public M setOpenId(java.lang.String openId) {
		set("open_id", openId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getOpenId() {
		return getStr("open_id");
	}

}
