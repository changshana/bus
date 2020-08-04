package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sms_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSmsInfo<M extends BaseSmsInfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
	}

	/**
	*设置手机号 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取手机号 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	/**
	*设置内容 
	*/
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取内容 
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
	*设置 
	*/
	public M setIpAddr(java.lang.String ipAddr) {
		set("ip_addr", ipAddr);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getIpAddr() {
		return getStr("ip_addr");
	}

}
