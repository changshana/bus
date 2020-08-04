package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_setting:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxSetting<M extends BasePxSetting<M>> extends Model<M> implements IBean {

	/**
	*设置id 
	*/
	public M setSettingId(java.lang.Integer settingId) {
		set("setting_id", settingId);
		return (M)this;
	}

	/**
	*获取id 
	*/
	public java.lang.Integer getSettingId() {
		return getInt("setting_id");
	}

	/**
	*设置是否设置考试限制开关（1：开，0：关） 
	*/
	public M setIsExamLimit(java.lang.String isExamLimit) {
		set("isExamLimit", isExamLimit);
		return (M)this;
	}

	/**
	*获取是否设置考试限制开关（1：开，0：关） 
	*/
	public java.lang.String getIsExamLimit() {
		return getStr("isExamLimit");
	}

	/**
	*设置是否设置短信通知开关（1：开，0：关） 
	*/
	public M setIsMessage(java.lang.String isMessage) {
		set("isMessage", isMessage);
		return (M)this;
	}

	/**
	*获取是否设置短信通知开关（1：开，0：关） 
	*/
	public java.lang.String getIsMessage() {
		return getStr("isMessage");
	}

	/**
	*设置报名成功短信内容模板 
	*/
	public M setTemplate1(java.lang.String template1) {
		set("template1", template1);
		return (M)this;
	}

	/**
	*获取报名成功短信内容模板 
	*/
	public java.lang.String getTemplate1() {
		return getStr("template1");
	}

	/**
	*设置交费成功短信内容模板 
	*/
	public M setTemplate2(java.lang.String template2) {
		set("template2", template2);
		return (M)this;
	}

	/**
	*获取交费成功短信内容模板 
	*/
	public java.lang.String getTemplate2() {
		return getStr("template2");
	}

	/**
	*设置是否审核 
	*/
	public M setIsAudit(java.lang.String isAudit) {
		set("is_audit", isAudit);
		return (M)this;
	}

	/**
	*获取是否审核 
	*/
	public java.lang.String getIsAudit() {
		return getStr("is_audit");
	}

	/**
	*设置审核 事项 
	*/
	public M setAuditSelect(java.lang.String auditSelect) {
		set("audit_select", auditSelect);
		return (M)this;
	}

	/**
	*获取审核 事项 
	*/
	public java.lang.String getAuditSelect() {
		return getStr("audit_select");
	}

	/**
	*设置证书模板 
	*/
	public M setCertificateTemplate(java.lang.String certificateTemplate) {
		set("certificate_template", certificateTemplate);
		return (M)this;
	}

	/**
	*获取证书模板 
	*/
	public java.lang.String getCertificateTemplate() {
		return getStr("certificate_template");
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
	public M setStatus(java.lang.String status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.String getStatus() {
		return getStr("status");
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

}
