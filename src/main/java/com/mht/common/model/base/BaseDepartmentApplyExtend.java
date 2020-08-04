package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * department_apply_extend:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDepartmentApplyExtend<M extends BaseDepartmentApplyExtend<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApplyExtendId(java.lang.Integer applyExtendId) {
		set("apply_extend_id", applyExtendId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApplyExtendId() {
		return getInt("apply_extend_id");
	}

	/**
	*设置申请单详情 
	*/
	public M setApplyDetailsId(java.lang.Integer applyDetailsId) {
		set("apply_details_id", applyDetailsId);
		return (M)this;
	}

	/**
	*获取申请单详情 
	*/
	public java.lang.Integer getApplyDetailsId() {
		return getInt("apply_details_id");
	}

	/**
	*设置数量 
	*/
	public M setNumber(java.lang.String number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.String getNumber() {
		return getStr("number");
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
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
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
	*设置拒绝理由 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取拒绝理由 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}
