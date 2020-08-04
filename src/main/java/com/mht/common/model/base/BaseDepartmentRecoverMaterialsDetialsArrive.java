package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * department_recover_materials_detials_arrive:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDepartmentRecoverMaterialsDetialsArrive<M extends BaseDepartmentRecoverMaterialsDetialsArrive<M>> extends Model<M> implements IBean {

	/**
	*设置回收记录单id 
	*/
	public M setRecoveryId(java.lang.Integer recoveryId) {
		set("recovery_id", recoveryId);
		return (M)this;
	}

	/**
	*获取回收记录单id 
	*/
	public java.lang.Integer getRecoveryId() {
		return getInt("recovery_id");
	}

	/**
	*设置材料详情表id 
	*/
	public M setApplyMaterialsDetailsId(java.lang.Integer applyMaterialsDetailsId) {
		set("apply_materials_details_id", applyMaterialsDetailsId);
		return (M)this;
	}

	/**
	*获取材料详情表id 
	*/
	public java.lang.Integer getApplyMaterialsDetailsId() {
		return getInt("apply_materials_details_id");
	}

	/**
	*设置回收数量 
	*/
	public M setNumber(java.lang.String number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取回收数量 
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
	*设置 
	*/
	public M setSiteCode(java.lang.Integer siteCode) {
		set("site_code", siteCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getSiteCode() {
		return getInt("site_code");
	}

}
