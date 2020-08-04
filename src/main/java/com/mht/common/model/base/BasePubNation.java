package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pub_nation:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePubNation<M extends BasePubNation<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setNationId(java.lang.Integer nationId) {
		set("nation_id", nationId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getNationId() {
		return getInt("nation_id");
	}

	/**
	*设置 
	*/
	public M setNationCode(java.lang.String nationCode) {
		set("nation_code", nationCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getNationCode() {
		return getStr("nation_code");
	}

	/**
	*设置 
	*/
	public M setNationName(java.lang.String nationName) {
		set("nation_name", nationName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getNationName() {
		return getStr("nation_name");
	}

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置 
	*/
	public M setShortName(java.lang.String shortName) {
		set("short_name", shortName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getShortName() {
		return getStr("short_name");
	}

}
