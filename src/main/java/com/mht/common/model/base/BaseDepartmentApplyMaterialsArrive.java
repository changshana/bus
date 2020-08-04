package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * department_apply_materials_arrive:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDepartmentApplyMaterialsArrive<M extends BaseDepartmentApplyMaterialsArrive<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApplyMaterialsArriveId(java.lang.Integer applyMaterialsArriveId) {
		set("apply_materials_arrive_id", applyMaterialsArriveId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApplyMaterialsArriveId() {
		return getInt("apply_materials_arrive_id");
	}

	/**
	*设置材料申请详情ID 
	*/
	public M setApplyMaterialsDetailsId(java.lang.Integer applyMaterialsDetailsId) {
		set("apply_materials_details_id", applyMaterialsDetailsId);
		return (M)this;
	}

	/**
	*获取材料申请详情ID 
	*/
	public java.lang.Integer getApplyMaterialsDetailsId() {
		return getInt("apply_materials_details_id");
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
	*设置到达数量 
	*/
	public M setArrivalCount(java.lang.String arrivalCount) {
		set("arrival_count", arrivalCount);
		return (M)this;
	}

	/**
	*获取到达数量 
	*/
	public java.lang.String getArrivalCount() {
		return getStr("arrival_count");
	}

}
