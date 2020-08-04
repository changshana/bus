package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_staff_level:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelStaffLevel<M extends BasePersonnelStaffLevel<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setStaffLevelId(java.lang.Integer staffLevelId) {
		set("staff_level_id", staffLevelId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getStaffLevelId() {
		return getInt("staff_level_id");
	}

	/**
	*设置岗位级别 
	*/
	public M setPostLevel(java.lang.Integer postLevel) {
		set("post_level", postLevel);
		return (M)this;
	}

	/**
	*获取岗位级别 
	*/
	public java.lang.Integer getPostLevel() {
		return getInt("post_level");
	}

	/**
	*设置工资标准(元/月) 
	*/
	public M setSalaryStandard(java.lang.String salaryStandard) {
		set("salary_standard", salaryStandard);
		return (M)this;
	}

	/**
	*获取工资标准(元/月) 
	*/
	public java.lang.String getSalaryStandard() {
		return getStr("salary_standard");
	}

}
