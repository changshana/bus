package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_person_item:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairPersonItem<M extends BaseRepairPersonItem<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPersonItemId(java.lang.Integer personItemId) {
		set("person_item_id", personItemId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPersonItemId() {
		return getInt("person_item_id");
	}

	/**
	*设置人员 
	*/
	public M setPersonId(java.lang.Integer personId) {
		set("person_id", personId);
		return (M)this;
	}

	/**
	*获取人员 
	*/
	public java.lang.Integer getPersonId() {
		return getInt("person_id");
	}

	/**
	*设置类型 
	*/
	public M setItemId(java.lang.Integer itemId) {
		set("item_id", itemId);
		return (M)this;
	}

	/**
	*获取类型 
	*/
	public java.lang.Integer getItemId() {
		return getInt("item_id");
	}

}
