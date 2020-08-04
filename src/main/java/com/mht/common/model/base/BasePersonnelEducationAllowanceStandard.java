package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_education_allowance_standard:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelEducationAllowanceStandard<M extends BasePersonnelEducationAllowanceStandard<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setStandardId(java.lang.Integer standardId) {
		set("standard_id", standardId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getStandardId() {
		return getInt("standard_id");
	}

	/**
	*设置文化程度id 
	*/
	public M setEducationId(java.lang.Integer educationId) {
		set("education_id", educationId);
		return (M)this;
	}

	/**
	*获取文化程度id 
	*/
	public java.lang.Integer getEducationId() {
		return getInt("education_id");
	}

	/**
	*设置是否享受津贴 
	*/
	public M setIsAllowance(java.lang.Integer isAllowance) {
		set("is_allowance", isAllowance);
		return (M)this;
	}

	/**
	*获取是否享受津贴 
	*/
	public java.lang.Integer getIsAllowance() {
		return getInt("is_allowance");
	}

	/**
	*设置津贴标准 
	*/
	public M setAllowanceStandard(java.lang.String allowanceStandard) {
		set("allowance_standard", allowanceStandard);
		return (M)this;
	}

	/**
	*获取津贴标准 
	*/
	public java.lang.String getAllowanceStandard() {
		return getStr("allowance_standard");
	}

}
