package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_plat:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysPlat<M extends BaseSysPlat<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPlatId(java.lang.Integer platId) {
		set("plat_id", platId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPlatId() {
		return getInt("plat_id");
	}

	/**
	*设置名称 
	*/
	public M setPlatName(java.lang.String platName) {
		set("plat_name", platName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getPlatName() {
		return getStr("plat_name");
	}

	/**
	*设置有效状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取有效状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

}
