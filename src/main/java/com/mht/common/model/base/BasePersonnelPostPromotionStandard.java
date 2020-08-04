package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_promotion_standard:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostPromotionStandard<M extends BasePersonnelPostPromotionStandard<M>> extends Model<M> implements IBean {

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
	*设置晋升类别 
	*/
	public M setPromotionCategory(java.lang.String promotionCategory) {
		set("promotion_category", promotionCategory);
		return (M)this;
	}

	/**
	*获取晋升类别 
	*/
	public java.lang.String getPromotionCategory() {
		return getStr("promotion_category");
	}

	/**
	*设置工作年限 
	*/
	public M setWorkExperience(java.lang.Integer workExperience) {
		set("work_experience", workExperience);
		return (M)this;
	}

	/**
	*获取工作年限 
	*/
	public java.lang.Integer getWorkExperience() {
		return getInt("work_experience");
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
	*设置说明 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取说明 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
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
