package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department_materials_get:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartmentMaterialsGet<M extends BaseRepairDepartmentMaterialsGet<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRdmgId(java.lang.Integer rdmgId) {
		set("rdmg_id", rdmgId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRdmgId() {
		return getInt("rdmg_id");
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
	*设置单号 
	*/
	public M setRdmgCode(java.lang.String rdmgCode) {
		set("rdmg_code", rdmgCode);
		return (M)this;
	}

	/**
	*获取单号 
	*/
	public java.lang.String getRdmgCode() {
		return getStr("rdmg_code");
	}

	/**
	*设置实际到货时间 
	*/
	public M setPredictArriveTime(java.util.Date predictArriveTime) {
		set("predict_arrive_time", predictArriveTime);
		return (M)this;
	}

	/**
	*获取实际到货时间 
	*/
	public java.util.Date getPredictArriveTime() {
		return get("predict_arrive_time");
	}

	/**
	*设置部门ID 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取部门ID 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

	/**
	*设置名称 
	*/
	public M setRdmgName(java.lang.String rdmgName) {
		set("rdmg_name", rdmgName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getRdmgName() {
		return getStr("rdmg_name");
	}

}
