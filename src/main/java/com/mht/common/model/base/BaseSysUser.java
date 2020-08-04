package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_user:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysUser<M extends BaseSysUser<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	*设置登录名 
	*/
	public M setLoginName(java.lang.String loginName) {
		set("login_name", loginName);
		return (M)this;
	}

	/**
	*获取登录名 
	*/
	public java.lang.String getLoginName() {
		return getStr("login_name");
	}

	/**
	*设置密码 
	*/
	public M setPassword(java.lang.String password) {
		set("password", password);
		return (M)this;
	}

	/**
	*获取密码 
	*/
	public java.lang.String getPassword() {
		return getStr("password");
	}

	/**
	*设置用户名称 
	*/
	public M setUserName(java.lang.String userName) {
		set("user_name", userName);
		return (M)this;
	}

	/**
	*获取用户名称 
	*/
	public java.lang.String getUserName() {
		return getStr("user_name");
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
	*设置站点代码 
	*/
	public M setParentSiteId(java.lang.Integer parentSiteId) {
		set("parent_site_id", parentSiteId);
		return (M)this;
	}

	/**
	*获取站点代码 
	*/
	public java.lang.Integer getParentSiteId() {
		return getInt("parent_site_id");
	}

	/**
	*设置教学点代码 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取教学点代码 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置电话 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取电话 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	/**
	*设置经验值 
	*/
	public M setUserExper(java.lang.Integer userExper) {
		set("user_exper", userExper);
		return (M)this;
	}

	/**
	*获取经验值 
	*/
	public java.lang.Integer getUserExper() {
		return getInt("user_exper");
	}

	/**
	*设置最后登录时间 
	*/
	public M setLastLogin(java.util.Date lastLogin) {
		set("last_login", lastLogin);
		return (M)this;
	}

	/**
	*获取最后登录时间 
	*/
	public java.util.Date getLastLogin() {
		return get("last_login");
	}

	/**
	*设置登录ip 
	*/
	public M setIpAddr(java.lang.String ipAddr) {
		set("ip_addr", ipAddr);
		return (M)this;
	}

	/**
	*获取登录ip 
	*/
	public java.lang.String getIpAddr() {
		return getStr("ip_addr");
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
	*设置创建者 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建者 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置微信ID 
	*/
	public M setWeixinId(java.lang.String weixinId) {
		set("weixin_id", weixinId);
		return (M)this;
	}

	/**
	*获取微信ID 
	*/
	public java.lang.String getWeixinId() {
		return getStr("weixin_id");
	}

	/**
	*设置中心库ids(aaa080s) 
	*/
	public M setFakeId(java.lang.String fakeId) {
		set("fake_id", fakeId);
		return (M)this;
	}

	/**
	*获取中心库ids(aaa080s) 
	*/
	public java.lang.String getFakeId() {
		return getStr("fake_id");
	}

	/**
	*设置nick_name 
	*/
	public M setNickName(java.lang.String nickName) {
		set("nick_name", nickName);
		return (M)this;
	}

	/**
	*获取nick_name 
	*/
	public java.lang.String getNickName() {
		return getStr("nick_name");
	}

	/**
	*设置binded 
	*/
	public M setBinded(java.lang.Integer binded) {
		set("binded", binded);
		return (M)this;
	}

	/**
	*获取binded 
	*/
	public java.lang.Integer getBinded() {
		return getInt("binded");
	}

	/**
	*设置bind_time 
	*/
	public M setBindTime(java.lang.Long bindTime) {
		set("bind_time", bindTime);
		return (M)this;
	}

	/**
	*获取bind_time 
	*/
	public java.lang.Long getBindTime() {
		return getLong("bind_time");
	}

	/**
	*设置agent_code 
	*/
	public M setAgentCode(java.lang.String agentCode) {
		set("agent_code", agentCode);
		return (M)this;
	}

	/**
	*获取agent_code 
	*/
	public java.lang.String getAgentCode() {
		return getStr("agent_code");
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
	*设置系统平台编号 
	*/
	public M setPlatIds(java.lang.String platIds) {
		set("plat_ids", platIds);
		return (M)this;
	}

	/**
	*获取系统平台编号 
	*/
	public java.lang.String getPlatIds() {
		return getStr("plat_ids");
	}

	/**
	*设置头像 
	*/
	public M setProfilephoto(java.lang.String profilephoto) {
		set("profilephoto", profilephoto);
		return (M)this;
	}

	/**
	*获取头像 
	*/
	public java.lang.String getProfilephoto() {
		return getStr("profilephoto");
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

}
