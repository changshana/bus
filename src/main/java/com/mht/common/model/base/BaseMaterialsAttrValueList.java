package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_attr_value_list:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsAttrValueList<M extends BaseMaterialsAttrValueList<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAttrValueListId(java.lang.Integer attrValueListId) {
		set("attr_value_list_id", attrValueListId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAttrValueListId() {
		return getInt("attr_value_list_id");
	}

	/**
	*设置名称 
	*/
	public M setAttrValueListName(java.lang.String attrValueListName) {
		set("attr_value_list_name", attrValueListName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getAttrValueListName() {
		return getStr("attr_value_list_name");
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
	*设置屬性ID 
	*/
	public M setAttrId(java.lang.Integer attrId) {
		set("attr_id", attrId);
		return (M)this;
	}

	/**
	*获取屬性ID 
	*/
	public java.lang.Integer getAttrId() {
		return getInt("attr_id");
	}

}
