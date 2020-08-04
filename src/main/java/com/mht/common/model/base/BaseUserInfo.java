package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * user_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUserInfo<M extends BaseUserInfo<M>> extends Model<M> implements IBean {

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
	*设置名称 
	*/
	public M setInfoName(java.lang.String infoName) {
		set("info_name", infoName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getInfoName() {
		return getStr("info_name");
	}

	/**
	*设置代码 
	*/
	public M setInfoCode(java.lang.String infoCode) {
		set("info_code", infoCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getInfoCode() {
		return getStr("info_code");
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
