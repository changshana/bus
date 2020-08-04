package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_health_condition:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelHealthCondition<M extends BasePersonnelHealthCondition<M>> extends Model<M> implements IBean {

	/**
	*设置id 
	*/
	public M setHealthConditionId(java.lang.Integer healthConditionId) {
		set("health_condition_id", healthConditionId);
		return (M)this;
	}

	/**
	*获取id 
	*/
	public java.lang.Integer getHealthConditionId() {
		return getInt("health_condition_id");
	}

	/**
	*设置父id 
	*/
	public M setParentHealthConditionId(java.lang.Integer parentHealthConditionId) {
		set("parent_health_condition_id", parentHealthConditionId);
		return (M)this;
	}

	/**
	*获取父id 
	*/
	public java.lang.Integer getParentHealthConditionId() {
		return getInt("parent_health_condition_id");
	}

	/**
	*设置健康状况名称 
	*/
	public M setHealthConditonName(java.lang.String healthConditonName) {
		set("health_conditon_name", healthConditonName);
		return (M)this;
	}

	/**
	*获取健康状况名称 
	*/
	public java.lang.String getHealthConditonName() {
		return getStr("health_conditon_name");
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
	*设置经办机构id 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取经办机构id 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
	}

}
