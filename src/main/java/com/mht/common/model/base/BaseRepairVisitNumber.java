package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_visit_number:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairVisitNumber<M extends BaseRepairVisitNumber<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setRvnId(java.lang.Integer rvnId) {
		set("rvn_id", rvnId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRvnId() {
		return getInt("rvn_id");
	}

	/**
	*设置 
	*/
	public M setRvnName(java.lang.String rvnName) {
		set("rvn_name", rvnName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRvnName() {
		return getStr("rvn_name");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

}
