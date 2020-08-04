package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * material_recovery:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialRecovery<M extends BaseMaterialRecovery<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setMaterialRecoveryId(java.lang.Integer materialRecoveryId) {
		set("material_recovery_id", materialRecoveryId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getMaterialRecoveryId() {
		return getInt("material_recovery_id");
	}

	/**
	*设置 
	*/
	public M setNumber(java.lang.String number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getNumber() {
		return getStr("number");
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
	public M setDepartmentDetailsId(java.lang.Integer departmentDetailsId) {
		set("department_details_id", departmentDetailsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDepartmentDetailsId() {
		return getInt("department_details_id");
	}

}
