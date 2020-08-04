package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_sms_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairSmsInfo<M extends BaseRepairSmsInfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSmsInfoId(java.lang.Integer smsInfoId) {
		set("sms_info_id", smsInfoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSmsInfoId() {
		return getInt("sms_info_id");
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

}
