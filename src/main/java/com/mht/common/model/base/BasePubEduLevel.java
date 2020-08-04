package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pub_edu_level:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePubEduLevel<M extends BasePubEduLevel<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setLevelId(java.lang.Integer levelId) {
		set("level_id", levelId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getLevelId() {
		return getInt("level_id");
	}

	/**
	*设置名称 
	*/
	public M setEduLevelName(java.lang.String eduLevelName) {
		set("edu_level_name", eduLevelName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getEduLevelName() {
		return getStr("edu_level_name");
	}

	/**
	*设置教育等级 
	*/
	public M setEduLevel(java.lang.String eduLevel) {
		set("edu_level", eduLevel);
		return (M)this;
	}

	/**
	*获取教育等级 
	*/
	public java.lang.String getEduLevel() {
		return getStr("edu_level");
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
	*设置民族 
	*/
	public M setNationId(java.lang.Integer nationId) {
		set("nation_id", nationId);
		return (M)this;
	}

	/**
	*获取民族 
	*/
	public java.lang.Integer getNationId() {
		return getInt("nation_id");
	}

	/**
	*设置zc 
	*/
	public M setZkCode(java.lang.String zkCode) {
		set("zk_code", zkCode);
		return (M)this;
	}

	/**
	*获取zc 
	*/
	public java.lang.String getZkCode() {
		return getStr("zk_code");
	}

}
