package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_temporary:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryTemporary<M extends BaseDormitoryTemporary<M>> extends Model<M> implements IBean {

	/**
	*设置临客住宿登记id 
	*/
	public M setTemporaryId(java.lang.Integer temporaryId) {
		set("temporary_id", temporaryId);
		return (M)this;
	}

	/**
	*获取临客住宿登记id 
	*/
	public java.lang.Integer getTemporaryId() {
		return getInt("temporary_id");
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
	*设置出生日期 
	*/
	public M setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
		return (M)this;
	}

	/**
	*获取出生日期 
	*/
	public java.util.Date getBirthday() {
		return get("birthday");
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
	*设置联系电话 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取联系电话 
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
	*设置担保人 
	*/
	public M setBondsman(java.lang.String bondsman) {
		set("bondsman", bondsman);
		return (M)this;
	}

	/**
	*获取担保人 
	*/
	public java.lang.String getBondsman() {
		return getStr("bondsman");
	}

	/**
	*设置担保人单位 
	*/
	public M setBondsmanCom(java.lang.String bondsmanCom) {
		set("bondsman_com", bondsmanCom);
		return (M)this;
	}

	/**
	*获取担保人单位 
	*/
	public java.lang.String getBondsmanCom() {
		return getStr("bondsman_com");
	}

	/**
	*设置担保人电话 
	*/
	public M setBondsmanMobile(java.lang.String bondsmanMobile) {
		set("bondsman_mobile", bondsmanMobile);
		return (M)this;
	}

	/**
	*获取担保人电话 
	*/
	public java.lang.String getBondsmanMobile() {
		return getStr("bondsman_mobile");
	}

	/**
	*设置预约宿舍楼 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取预约宿舍楼 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置宿舍楼所属校区 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取宿舍楼所属校区 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置宿舍楼所属组团 
	*/
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}

	/**
	*获取宿舍楼所属组团 
	*/
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	*设置入住日期 
	*/
	public M setInTime(java.util.Date inTime) {
		set("in_time", inTime);
		return (M)this;
	}

	/**
	*获取入住日期 
	*/
	public java.util.Date getInTime() {
		return get("in_time");
	}

	/**
	*设置到期日期 
	*/
	public M setOutTime(java.util.Date outTime) {
		set("out_time", outTime);
		return (M)this;
	}

	/**
	*获取到期日期 
	*/
	public java.util.Date getOutTime() {
		return get("out_time");
	}

	/**
	*设置收费标准 
	*/
	public M setRates(java.lang.Integer rates) {
		set("rates", rates);
		return (M)this;
	}

	/**
	*获取收费标准 
	*/
	public java.lang.Integer getRates() {
		return getInt("rates");
	}

	/**
	*设置收费 
	*/
	public M setCharge(java.lang.Integer charge) {
		set("charge", charge);
		return (M)this;
	}

	/**
	*获取收费 
	*/
	public java.lang.Integer getCharge() {
		return getInt("charge");
	}

	/**
	*设置押金 
	*/
	public M setDeposit(java.lang.Integer deposit) {
		set("deposit", deposit);
		return (M)this;
	}

	/**
	*获取押金 
	*/
	public java.lang.Integer getDeposit() {
		return getInt("deposit");
	}

	/**
	*设置申请单位 
	*/
	public M setApplyCom(java.lang.String applyCom) {
		set("apply_com", applyCom);
		return (M)this;
	}

	/**
	*获取申请单位 
	*/
	public java.lang.String getApplyCom() {
		return getStr("apply_com");
	}

	/**
	*设置申请原因 
	*/
	public M setApplyReason(java.lang.String applyReason) {
		set("apply_reason", applyReason);
		return (M)this;
	}

	/**
	*获取申请原因 
	*/
	public java.lang.String getApplyReason() {
		return getStr("apply_reason");
	}

	/**
	*设置图片材料 
	*/
	public M setPicture(java.lang.String picture) {
		set("picture", picture);
		return (M)this;
	}

	/**
	*获取图片材料 
	*/
	public java.lang.String getPicture() {
		return getStr("picture");
	}

	/**
	*设置入住状态 
	*/
	public M setEnrollStatus(java.lang.String enrollStatus) {
		set("enroll_status", enrollStatus);
		return (M)this;
	}

	/**
	*获取入住状态 
	*/
	public java.lang.String getEnrollStatus() {
		return getStr("enroll_status");
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
	*设置微信标识 
	*/
	public M setOpenId(java.lang.String openId) {
		set("open_id", openId);
		return (M)this;
	}

	/**
	*获取微信标识 
	*/
	public java.lang.String getOpenId() {
		return getStr("open_id");
	}

}
