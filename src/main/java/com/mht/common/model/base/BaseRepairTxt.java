package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_txt:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairTxt<M extends BaseRepairTxt<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setTxtId(java.lang.Integer txtId) {
		set("txt_id", txtId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTxtId() {
		return getInt("txt_id");
	}

	/**
	*设置 
	*/
	public M setTxtUrl(java.lang.String txtUrl) {
		set("txt_url", txtUrl);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTxtUrl() {
		return getStr("txt_url");
	}

	/**
	*设置 
	*/
	public M setTxtType(java.lang.String txtType) {
		set("txt_type", txtType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTxtType() {
		return getStr("txt_type");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
	}

}
