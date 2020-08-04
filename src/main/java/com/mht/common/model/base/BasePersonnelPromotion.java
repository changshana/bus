package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_promotion:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPromotion<M extends BasePersonnelPromotion<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPromotionId(java.lang.Integer promotionId) {
		set("promotion_id", promotionId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPromotionId() {
		return getInt("promotion_id");
	}

	/**
	*设置员工ID 
	*/
	public M setEmployeeInformationId(java.lang.Integer employeeInformationId) {
		set("employee_information_id", employeeInformationId);
		return (M)this;
	}

	/**
	*获取员工ID 
	*/
	public java.lang.Integer getEmployeeInformationId() {
		return getInt("employee_information_id");
	}

	/**
	*设置现任岗位ID 
	*/
	public M setPostId(java.lang.Integer postId) {
		set("post_id", postId);
		return (M)this;
	}

	/**
	*获取现任岗位ID 
	*/
	public java.lang.Integer getPostId() {
		return getInt("post_id");
	}

	/**
	*设置晋升机构ID 
	*/
	public M setPromotionOrgId(java.lang.Integer promotionOrgId) {
		set("promotion_org_id", promotionOrgId);
		return (M)this;
	}

	/**
	*获取晋升机构ID 
	*/
	public java.lang.Integer getPromotionOrgId() {
		return getInt("promotion_org_id");
	}

	/**
	*设置晋升部门ID 
	*/
	public M setPromotionDepId(java.lang.Integer promotionDepId) {
		set("promotion_dep_id", promotionDepId);
		return (M)this;
	}

	/**
	*获取晋升部门ID 
	*/
	public java.lang.Integer getPromotionDepId() {
		return getInt("promotion_dep_id");
	}

	/**
	*设置晋升岗位ID 
	*/
	public M setPromotionPostId(java.lang.Integer promotionPostId) {
		set("promotion_post_id", promotionPostId);
		return (M)this;
	}

	/**
	*获取晋升岗位ID 
	*/
	public java.lang.Integer getPromotionPostId() {
		return getInt("promotion_post_id");
	}

	/**
	*设置晋升年份 
	*/
	public M setPromotionTime(java.util.Date promotionTime) {
		set("promotion_time", promotionTime);
		return (M)this;
	}

	/**
	*获取晋升年份 
	*/
	public java.util.Date getPromotionTime() {
		return get("promotion_time");
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
	*设置审核状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
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
