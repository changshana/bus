package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_type:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusType<M extends BaseBusType<M>> extends Model<M> implements IBean {

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
	public M setOrderIndex(java.lang.Integer orderIndex) {
		set("order_index", orderIndex);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getOrderIndex() {
		return getInt("order_index");
	}

}
