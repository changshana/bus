package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * middle_school_type:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMiddleSchoolType<M extends BaseMiddleSchoolType<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSchoolTypeId(java.lang.Integer schoolTypeId) {
		set("school_type_id", schoolTypeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSchoolTypeId() {
		return getInt("school_type_id");
	}

	/**
	*设置名称 
	*/
	public M setSchoolTypeName(java.lang.String schoolTypeName) {
		set("school_type_name", schoolTypeName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getSchoolTypeName() {
		return getStr("school_type_name");
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

}
