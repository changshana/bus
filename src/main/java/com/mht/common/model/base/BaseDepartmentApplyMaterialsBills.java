package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * department_apply_materials_bills:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDepartmentApplyMaterialsBills<M extends BaseDepartmentApplyMaterialsBills<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApplyMaterialsBillsId(java.lang.Integer applyMaterialsBillsId) {
		set("apply_materials_bills_id", applyMaterialsBillsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApplyMaterialsBillsId() {
		return getInt("apply_materials_bills_id");
	}

	/**
	*设置代码 
	*/
	public M setApplyMaterialsBillsCode(java.lang.String applyMaterialsBillsCode) {
		set("apply_materials_bills_code", applyMaterialsBillsCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getApplyMaterialsBillsCode() {
		return getStr("apply_materials_bills_code");
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
	*设置一级机构 
	*/
	public M setSiteCode(java.lang.String siteCode) {
		set("site_code", siteCode);
		return (M)this;
	}

	/**
	*获取一级机构 
	*/
	public java.lang.String getSiteCode() {
		return getStr("site_code");
	}

	/**
	*设置二级机构 
	*/
	public M setHandCode(java.lang.String handCode) {
		set("hand_code", handCode);
		return (M)this;
	}

	/**
	*获取二级机构 
	*/
	public java.lang.String getHandCode() {
		return getStr("hand_code");
	}

	/**
	*设置申请说明 
	*/
	public M setApplyMaterialsBillsName(java.lang.String applyMaterialsBillsName) {
		set("apply_materials_bills_name", applyMaterialsBillsName);
		return (M)this;
	}

	/**
	*获取申请说明 
	*/
	public java.lang.String getApplyMaterialsBillsName() {
		return getStr("apply_materials_bills_name");
	}

	/**
	*设置拒绝理由 
	*/
	public M setRefuseReason(java.lang.String refuseReason) {
		set("refuse_reason", refuseReason);
		return (M)this;
	}

	/**
	*获取拒绝理由 
	*/
	public java.lang.String getRefuseReason() {
		return getStr("refuse_reason");
	}

	/**
	*设置提交时间 
	*/
	public M setApplyTime(java.util.Date applyTime) {
		set("apply_time", applyTime);
		return (M)this;
	}

	/**
	*获取提交时间 
	*/
	public java.util.Date getApplyTime() {
		return get("apply_time");
	}

	/**
	*设置是否回收 
	*/
	public M setCategType(java.lang.Integer categType) {
		set("categ_type", categType);
		return (M)this;
	}

	/**
	*获取是否回收 
	*/
	public java.lang.Integer getCategType() {
		return getInt("categ_type");
	}

}
