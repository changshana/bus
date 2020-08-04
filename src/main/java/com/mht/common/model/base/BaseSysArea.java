package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_area:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysArea<M extends BaseSysArea<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Long getId() {
		return getLong("id");
	}

	/**
	*设置父id 
	*/
	public M setParentid(java.lang.Integer parentid) {
		set("parentid", parentid);
		return (M)this;
	}

	/**
	*获取父id 
	*/
	public java.lang.Integer getParentid() {
		return getInt("parentid");
	}

	/**
	*设置区域名称 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取区域名称 
	*/
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	*设置区域代码 
	*/
	public M setCode(java.lang.String code) {
		set("code", code);
		return (M)this;
	}

	/**
	*获取区域代码 
	*/
	public java.lang.String getCode() {
		return getStr("code");
	}

	/**
	*设置区域级别 
	*/
	public M setLevel(java.lang.String level) {
		set("level", level);
		return (M)this;
	}

	/**
	*获取区域级别 
	*/
	public java.lang.String getLevel() {
		return getStr("level");
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

}
