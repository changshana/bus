package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * car_type:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCarType<M extends BaseCarType<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setTypeId(java.lang.Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTypeId() {
		return getInt("type_id");
	}

	/**
	*设置名称 
	*/
	public M setTypeName(java.lang.String typeName) {
		set("type_name", typeName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getTypeName() {
		return getStr("type_name");
	}

	/**
	*设置 
	*/
	public M setOrderCode(java.lang.Integer orderCode) {
		set("order_code", orderCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getOrderCode() {
		return getInt("order_code");
	}

}
