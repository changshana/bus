package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_department_materials_out_bill:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairDepartmentMaterialsOutBill<M extends BaseRepairDepartmentMaterialsOutBill<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRdmobId(java.lang.Integer rdmobId) {
		set("rdmob_id", rdmobId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRdmobId() {
		return getInt("rdmob_id");
	}

	/**
	*设置名称 
	*/
	public M setRdmobName(java.lang.String rdmobName) {
		set("rdmob_name", rdmobName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getRdmobName() {
		return getStr("rdmob_name");
	}

	/**
	*设置代码 
	*/
	public M setBillCode(java.lang.String billCode) {
		set("bill_code", billCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getBillCode() {
		return getStr("bill_code");
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
	*设置部门 
	*/
	public M setDepartmentId(java.lang.Integer departmentId) {
		set("department_id", departmentId);
		return (M)this;
	}

	/**
	*获取部门 
	*/
	public java.lang.Integer getDepartmentId() {
		return getInt("department_id");
	}

}
