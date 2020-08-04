package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * site_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSiteInfo<M extends BaseSiteInfo<M>> extends Model<M> implements IBean {

	/**
	*设置站点ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取站点ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置父站点ID 
	*/
	public M setParentSiteId(java.lang.Integer parentSiteId) {
		set("parent_site_id", parentSiteId);
		return (M)this;
	}

	/**
	*获取父站点ID 
	*/
	public java.lang.Integer getParentSiteId() {
		return getInt("parent_site_id");
	}

	/**
	*设置站点级别 
	*/
	public M setSiteLevel(java.lang.Integer siteLevel) {
		set("site_level", siteLevel);
		return (M)this;
	}

	/**
	*获取站点级别 
	*/
	public java.lang.Integer getSiteLevel() {
		return getInt("site_level");
	}

	/**
	*设置站点代码 
	*/
	public M setSiteCode(java.lang.String siteCode) {
		set("site_code", siteCode);
		return (M)this;
	}

	/**
	*获取站点代码 
	*/
	public java.lang.String getSiteCode() {
		return getStr("site_code");
	}

	/**
	*设置站点名称 
	*/
	public M setSiteName(java.lang.String siteName) {
		set("site_name", siteName);
		return (M)this;
	}

	/**
	*获取站点名称 
	*/
	public java.lang.String getSiteName() {
		return getStr("site_name");
	}

	/**
	*设置完整代码 
	*/
	public M setFullCode(java.lang.String fullCode) {
		set("full_code", fullCode);
		return (M)this;
	}

	/**
	*获取完整代码 
	*/
	public java.lang.String getFullCode() {
		return getStr("full_code");
	}

	/**
	*设置站点简称 
	*/
	public M setShortName(java.lang.String shortName) {
		set("short_name", shortName);
		return (M)this;
	}

	/**
	*获取站点简称 
	*/
	public java.lang.String getShortName() {
		return getStr("short_name");
	}

	/**
	*设置单位名称 
	*/
	public M setUnitName(java.lang.String unitName) {
		set("unit_name", unitName);
		return (M)this;
	}

	/**
	*获取单位名称 
	*/
	public java.lang.String getUnitName() {
		return getStr("unit_name");
	}

	/**
	*设置站点性质 
	*/
	public M setSiteNature(java.lang.Integer siteNature) {
		set("site_nature", siteNature);
		return (M)this;
	}

	/**
	*获取站点性质 
	*/
	public java.lang.Integer getSiteNature() {
		return getInt("site_nature");
	}

	/**
	*设置合作状态 
	*/
	public M setCoopStatus(java.lang.Integer coopStatus) {
		set("coop_status", coopStatus);
		return (M)this;
	}

	/**
	*获取合作状态 
	*/
	public java.lang.Integer getCoopStatus() {
		return getInt("coop_status");
	}

	/**
	*设置站点状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取站点状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置所在省份代码 
	*/
	public M setProvince(java.lang.String province) {
		set("province", province);
		return (M)this;
	}

	/**
	*获取所在省份代码 
	*/
	public java.lang.String getProvince() {
		return getStr("province");
	}

	/**
	*设置所在城市代码 
	*/
	public M setCityCode(java.lang.String cityCode) {
		set("city_code", cityCode);
		return (M)this;
	}

	/**
	*获取所在城市代码 
	*/
	public java.lang.String getCityCode() {
		return getStr("city_code");
	}

	/**
	*设置邮政编码 
	*/
	public M setZipcode(java.lang.String zipcode) {
		set("zipcode", zipcode);
		return (M)this;
	}

	/**
	*获取邮政编码 
	*/
	public java.lang.String getZipcode() {
		return getStr("zipcode");
	}

	/**
	*设置详细地址 
	*/
	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	/**
	*获取详细地址 
	*/
	public java.lang.String getAddress() {
		return getStr("address");
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
	*设置联系人姓名 
	*/
	public M setLinkMan(java.lang.String linkMan) {
		set("link_man", linkMan);
		return (M)this;
	}

	/**
	*获取联系人姓名 
	*/
	public java.lang.String getLinkMan() {
		return getStr("link_man");
	}

	/**
	*设置联系人电话 
	*/
	public M setLinkTel(java.lang.String linkTel) {
		set("link_tel", linkTel);
		return (M)this;
	}

	/**
	*获取联系人电话 
	*/
	public java.lang.String getLinkTel() {
		return getStr("link_tel");
	}

	/**
	*设置联系人QQ号 
	*/
	public M setLinkQq(java.lang.String linkQq) {
		set("link_qq", linkQq);
		return (M)this;
	}

	/**
	*获取联系人QQ号 
	*/
	public java.lang.String getLinkQq() {
		return getStr("link_qq");
	}

	/**
	*设置联系人手机 
	*/
	public M setLinkMobile(java.lang.String linkMobile) {
		set("link_mobile", linkMobile);
		return (M)this;
	}

	/**
	*获取联系人手机 
	*/
	public java.lang.String getLinkMobile() {
		return getStr("link_mobile");
	}

	/**
	*设置联系人传真 
	*/
	public M setLinkFax(java.lang.String linkFax) {
		set("link_fax", linkFax);
		return (M)this;
	}

	/**
	*获取联系人传真 
	*/
	public java.lang.String getLinkFax() {
		return getStr("link_fax");
	}

	/**
	*设置联系人邮箱 
	*/
	public M setLinkEmail(java.lang.String linkEmail) {
		set("link_email", linkEmail);
		return (M)this;
	}

	/**
	*获取联系人邮箱 
	*/
	public java.lang.String getLinkEmail() {
		return getStr("link_email");
	}

	/**
	*设置联系人职务 
	*/
	public M setLinkDuty(java.lang.String linkDuty) {
		set("link_duty", linkDuty);
		return (M)this;
	}

	/**
	*获取联系人职务 
	*/
	public java.lang.String getLinkDuty() {
		return getStr("link_duty");
	}

	/**
	*设置负责人姓名 
	*/
	public M setMaster(java.lang.String master) {
		set("master", master);
		return (M)this;
	}

	/**
	*获取负责人姓名 
	*/
	public java.lang.String getMaster() {
		return getStr("master");
	}

	/**
	*设置负责人电话 
	*/
	public M setMasterTel(java.lang.String masterTel) {
		set("master_tel", masterTel);
		return (M)this;
	}

	/**
	*获取负责人电话 
	*/
	public java.lang.String getMasterTel() {
		return getStr("master_tel");
	}

	/**
	*设置负责人手机 
	*/
	public M setMasterMobile(java.lang.String masterMobile) {
		set("master_mobile", masterMobile);
		return (M)this;
	}

	/**
	*获取负责人手机 
	*/
	public java.lang.String getMasterMobile() {
		return getStr("master_mobile");
	}

	/**
	*设置负责人传真 
	*/
	public M setMasterFax(java.lang.String masterFax) {
		set("master_fax", masterFax);
		return (M)this;
	}

	/**
	*获取负责人传真 
	*/
	public java.lang.String getMasterFax() {
		return getStr("master_fax");
	}

	/**
	*设置负责人邮箱 
	*/
	public M setMasterEmail(java.lang.String masterEmail) {
		set("master_email", masterEmail);
		return (M)this;
	}

	/**
	*获取负责人邮箱 
	*/
	public java.lang.String getMasterEmail() {
		return getStr("master_email");
	}

	/**
	*设置负责人职务 
	*/
	public M setMasterDuty(java.lang.String masterDuty) {
		set("master_duty", masterDuty);
		return (M)this;
	}

	/**
	*获取负责人职务 
	*/
	public java.lang.String getMasterDuty() {
		return getStr("master_duty");
	}

	/**
	*设置建站日期 
	*/
	public M setSetupDate(java.util.Date setupDate) {
		set("setup_date", setupDate);
		return (M)this;
	}

	/**
	*获取建站日期 
	*/
	public java.util.Date getSetupDate() {
		return get("setup_date");
	}

	/**
	*设置备注SCHE 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取备注SCHE 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
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
	*设置修改用户 
	*/
	public M setModify(java.lang.String modify) {
		set("modify", modify);
		return (M)this;
	}

	/**
	*获取修改用户 
	*/
	public java.lang.String getModify() {
		return getStr("modify");
	}

	/**
	*设置修改日期 
	*/
	public M setModifyTime(java.util.Date modifyTime) {
		set("modify_time", modifyTime);
		return (M)this;
	}

	/**
	*获取修改日期 
	*/
	public java.util.Date getModifyTime() {
		return get("modify_time");
	}

	/**
	*设置审核用户 
	*/
	public M setAuditor(java.lang.String auditor) {
		set("auditor", auditor);
		return (M)this;
	}

	/**
	*获取审核用户 
	*/
	public java.lang.String getAuditor() {
		return getStr("auditor");
	}

	/**
	*设置审核日期 
	*/
	public M setAuditTime(java.util.Date auditTime) {
		set("audit_time", auditTime);
		return (M)this;
	}

	/**
	*获取审核日期 
	*/
	public java.util.Date getAuditTime() {
		return get("audit_time");
	}

	/**
	*设置依托单位名称 
	*/
	public M setRelyOrg(java.lang.String relyOrg) {
		set("rely_org", relyOrg);
		return (M)this;
	}

	/**
	*获取依托单位名称 
	*/
	public java.lang.String getRelyOrg() {
		return getStr("rely_org");
	}

	/**
	*设置依托单位性质 
	*/
	public M setRelyOrgNature(java.lang.String relyOrgNature) {
		set("rely_org_nature", relyOrgNature);
		return (M)this;
	}

	/**
	*获取依托单位性质 
	*/
	public java.lang.String getRelyOrgNature() {
		return getStr("rely_org_nature");
	}

	/**
	*设置最后一批学生入学日期 
	*/
	public M setEnterDate(java.lang.String enterDate) {
		set("enter_date", enterDate);
		return (M)this;
	}

	/**
	*获取最后一批学生入学日期 
	*/
	public java.lang.String getEnterDate() {
		return getStr("enter_date");
	}

	/**
	*设置最后一次审核通过日期 
	*/
	public M setLastPassDate(java.util.Date lastPassDate) {
		set("last_pass_date", lastPassDate);
		return (M)this;
	}

	/**
	*获取最后一次审核通过日期 
	*/
	public java.util.Date getLastPassDate() {
		return get("last_pass_date");
	}

	/**
	*设置是否有局域网 
	*/
	public M setHasLan(java.lang.String hasLan) {
		set("has_lan", hasLan);
		return (M)this;
	}

	/**
	*获取是否有局域网 
	*/
	public java.lang.String getHasLan() {
		return getStr("has_lan");
	}

	/**
	*设置联网计算机数 
	*/
	public M setOnlineComputer(java.lang.Integer onlineComputer) {
		set("online_computer", onlineComputer);
		return (M)this;
	}

	/**
	*获取联网计算机数 
	*/
	public java.lang.Integer getOnlineComputer() {
		return getInt("online_computer");
	}

	/**
	*设置局域网带宽 
	*/
	public M setLanBandwidth(java.lang.Integer lanBandwidth) {
		set("lan_bandwidth", lanBandwidth);
		return (M)this;
	}

	/**
	*获取局域网带宽 
	*/
	public java.lang.Integer getLanBandwidth() {
		return getInt("lan_bandwidth");
	}

	/**
	*设置多媒体教室数量 
	*/
	public M setMediaRoom(java.lang.Integer mediaRoom) {
		set("media_room", mediaRoom);
		return (M)this;
	}

	/**
	*获取多媒体教室数量 
	*/
	public java.lang.Integer getMediaRoom() {
		return getInt("media_room");
	}

	/**
	*设置远程教育接收设备数 
	*/
	public M setReceiveDevice(java.lang.Integer receiveDevice) {
		set("receive_device", receiveDevice);
		return (M)this;
	}

	/**
	*获取远程教育接收设备数 
	*/
	public java.lang.Integer getReceiveDevice() {
		return getInt("receive_device");
	}

	/**
	*设置互联网接入带宽  
	*/
	public M setInternetBandwidth(java.lang.Integer internetBandwidth) {
		set("internet_bandwidth", internetBandwidth);
		return (M)this;
	}

	/**
	*获取互联网接入带宽  
	*/
	public java.lang.Integer getInternetBandwidth() {
		return getInt("internet_bandwidth");
	}

	/**
	*设置专用服务器数量  
	*/
	public M setSpecialServer(java.lang.Integer specialServer) {
		set("special_server", specialServer);
		return (M)this;
	}

	/**
	*获取专用服务器数量  
	*/
	public java.lang.Integer getSpecialServer() {
		return getInt("special_server");
	}

	/**
	*设置 
	*/
	public M setRegOnline(java.lang.Integer regOnline) {
		set("reg_online", regOnline);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRegOnline() {
		return getInt("reg_online");
	}

	/**
	*设置招生管理员姓名 
	*/
	public M setEnrollManager(java.lang.String enrollManager) {
		set("enroll_manager", enrollManager);
		return (M)this;
	}

	/**
	*获取招生管理员姓名 
	*/
	public java.lang.String getEnrollManager() {
		return getStr("enroll_manager");
	}

	/**
	*设置招生管理员电话 
	*/
	public M setEnrollTel(java.lang.String enrollTel) {
		set("enroll_tel", enrollTel);
		return (M)this;
	}

	/**
	*获取招生管理员电话 
	*/
	public java.lang.String getEnrollTel() {
		return getStr("enroll_tel");
	}

	/**
	*设置招生管理员手机 
	*/
	public M setEnrollMobile(java.lang.String enrollMobile) {
		set("enroll_mobile", enrollMobile);
		return (M)this;
	}

	/**
	*获取招生管理员手机 
	*/
	public java.lang.String getEnrollMobile() {
		return getStr("enroll_mobile");
	}

	/**
	*设置招生管理员传真 
	*/
	public M setEnrollFax(java.lang.String enrollFax) {
		set("enroll_fax", enrollFax);
		return (M)this;
	}

	/**
	*获取招生管理员传真 
	*/
	public java.lang.String getEnrollFax() {
		return getStr("enroll_fax");
	}

	/**
	*设置招生管理员邮箱 
	*/
	public M setEnrollEmail(java.lang.String enrollEmail) {
		set("enroll_email", enrollEmail);
		return (M)this;
	}

	/**
	*获取招生管理员邮箱 
	*/
	public java.lang.String getEnrollEmail() {
		return getStr("enroll_email");
	}

	/**
	*设置教学管理员姓名 
	*/
	public M setTeachManager(java.lang.String teachManager) {
		set("teach_manager", teachManager);
		return (M)this;
	}

	/**
	*获取教学管理员姓名 
	*/
	public java.lang.String getTeachManager() {
		return getStr("teach_manager");
	}

	/**
	*设置教学管理员电话 
	*/
	public M setTeachTel(java.lang.String teachTel) {
		set("teach_tel", teachTel);
		return (M)this;
	}

	/**
	*获取教学管理员电话 
	*/
	public java.lang.String getTeachTel() {
		return getStr("teach_tel");
	}

	/**
	*设置教学管理员手机 
	*/
	public M setTeachMobile(java.lang.String teachMobile) {
		set("teach_mobile", teachMobile);
		return (M)this;
	}

	/**
	*获取教学管理员手机 
	*/
	public java.lang.String getTeachMobile() {
		return getStr("teach_mobile");
	}

	/**
	*设置教学管理员传真 
	*/
	public M setTeachFax(java.lang.String teachFax) {
		set("teach_fax", teachFax);
		return (M)this;
	}

	/**
	*获取教学管理员传真 
	*/
	public java.lang.String getTeachFax() {
		return getStr("teach_fax");
	}

	/**
	*设置教学管理员邮箱 
	*/
	public M setTeachEmail(java.lang.String teachEmail) {
		set("teach_email", teachEmail);
		return (M)this;
	}

	/**
	*获取教学管理员邮箱 
	*/
	public java.lang.String getTeachEmail() {
		return getStr("teach_email");
	}

	/**
	*设置省级教育行政部门批准文号 
	*/
	public M setApprovalNumber(java.lang.String approvalNumber) {
		set("approval_number", approvalNumber);
		return (M)this;
	}

	/**
	*获取省级教育行政部门批准文号 
	*/
	public java.lang.String getApprovalNumber() {
		return getStr("approval_number");
	}

	/**
	*设置站点类型 
	*/
	public M setTypeId(java.lang.Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}

	/**
	*获取站点类型 
	*/
	public java.lang.Integer getTypeId() {
		return getInt("type_id");
	}

	/**
	*设置站点介绍 
	*/
	public M setIntroFile(java.lang.String introFile) {
		set("intro_file", introFile);
		return (M)this;
	}

	/**
	*获取站点介绍 
	*/
	public java.lang.String getIntroFile() {
		return getStr("intro_file");
	}

	/**
	*设置教学类型 
	*/
	public M setTeachType(java.lang.String teachType) {
		set("teach_type", teachType);
		return (M)this;
	}

	/**
	*获取教学类型 
	*/
	public java.lang.String getTeachType() {
		return getStr("teach_type");
	}

	/**
	*设置招生电话一 
	*/
	public M setEnrollPhone1(java.lang.String enrollPhone1) {
		set("enroll_phone1", enrollPhone1);
		return (M)this;
	}

	/**
	*获取招生电话一 
	*/
	public java.lang.String getEnrollPhone1() {
		return getStr("enroll_phone1");
	}

	/**
	*设置招生电话二 
	*/
	public M setEnrollPhone2(java.lang.String enrollPhone2) {
		set("enroll_phone2", enrollPhone2);
		return (M)this;
	}

	/**
	*获取招生电话二 
	*/
	public java.lang.String getEnrollPhone2() {
		return getStr("enroll_phone2");
	}

	/**
	*设置短信剩余数 
	*/
	public M setSmsCount(java.lang.Integer smsCount) {
		set("sms_count", smsCount);
		return (M)this;
	}

	/**
	*获取短信剩余数 
	*/
	public java.lang.Integer getSmsCount() {
		return getInt("sms_count");
	}

	/**
	*设置站点分组 
	*/
	public M setGroupCode(java.lang.String groupCode) {
		set("group_code", groupCode);
		return (M)this;
	}

	/**
	*获取站点分组 
	*/
	public java.lang.String getGroupCode() {
		return getStr("group_code");
	}

	/**
	*设置所属平台ID 
	*/
	public M setPlatId(java.lang.Integer platId) {
		set("plat_id", platId);
		return (M)this;
	}

	/**
	*获取所属平台ID 
	*/
	public java.lang.Integer getPlatId() {
		return getInt("plat_id");
	}

}
