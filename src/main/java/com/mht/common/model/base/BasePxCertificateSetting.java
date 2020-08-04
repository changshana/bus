package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_certificate_setting:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxCertificateSetting<M extends BasePxCertificateSetting<M>> extends Model<M> implements IBean {

	/**
	*设置证书设置id 
	*/
	public M setCertificateSettingId(java.lang.Integer certificateSettingId) {
		set("certificate_setting_id", certificateSettingId);
		return (M)this;
	}

	/**
	*获取证书设置id 
	*/
	public java.lang.Integer getCertificateSettingId() {
		return getInt("certificate_setting_id");
	}

	/**
	*设置证书名称 
	*/
	public M setCertificateName(java.lang.String certificateName) {
		set("certificate_name", certificateName);
		return (M)this;
	}

	/**
	*获取证书名称 
	*/
	public java.lang.String getCertificateName() {
		return getStr("certificate_name");
	}

	/**
	*设置证书发放类型 
	*/
	public M setCertificateType(java.lang.String certificateType) {
		set("certificate_type", certificateType);
		return (M)this;
	}

	/**
	*获取证书发放类型 
	*/
	public java.lang.String getCertificateType() {
		return getStr("certificate_type");
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
	*设置证书号规则 
	*/
	public M setRule(java.lang.String rule) {
		set("rule", rule);
		return (M)this;
	}

	/**
	*获取证书号规则 
	*/
	public java.lang.String getRule() {
		return getStr("rule");
	}

	/**
	*设置证书模板 
	*/
	public M setCertificateTemplate(byte[] certificateTemplate) {
		set("certificate_template", certificateTemplate);
		return (M)this;
	}

	/**
	*获取证书模板 
	*/
	public byte[] getCertificateTemplate() {
		return get("certificate_template");
	}

}
