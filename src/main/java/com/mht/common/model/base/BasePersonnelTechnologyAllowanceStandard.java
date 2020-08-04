package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_technology_allowance_standard:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelTechnologyAllowanceStandard<M extends BasePersonnelTechnologyAllowanceStandard<M>> extends Model<M> implements IBean {

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
	*设置技术名称 
	*/
	public M setTechnologyName(java.lang.String technologyName) {
		set("technology_name", technologyName);
		return (M)this;
	}

	/**
	*获取技术名称 
	*/
	public java.lang.String getTechnologyName() {
		return getStr("technology_name");
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
	*设置享受年限 
	*/
	public M setEnjoyYear(java.lang.Integer enjoyYear) {
		set("enjoy_year", enjoyYear);
		return (M)this;
	}

	/**
	*获取享受年限 
	*/
	public java.lang.Integer getEnjoyYear() {
		return getInt("enjoy_year");
	}

	/**
	*设置津贴标准(元/月) 
	*/
	public M setAllowanceStandard(java.lang.Integer allowanceStandard) {
		set("allowance_standard", allowanceStandard);
		return (M)this;
	}

	/**
	*获取津贴标准(元/月) 
	*/
	public java.lang.Integer getAllowanceStandard() {
		return getInt("allowance_standard");
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

}
