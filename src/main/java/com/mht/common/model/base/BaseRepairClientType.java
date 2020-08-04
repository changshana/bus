package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_client_type:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairClientType<M extends BaseRepairClientType<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setClientTypeId(java.lang.Integer clientTypeId) {
		set("client_type_id", clientTypeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getClientTypeId() {
		return getInt("client_type_id");
	}

	/**
	*设置代码 
	*/
	public M setClientTypeCode(java.lang.String clientTypeCode) {
		set("client_type_code", clientTypeCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getClientTypeCode() {
		return getStr("client_type_code");
	}

	/**
	*设置名称 
	*/
	public M setClientTypeName(java.lang.String clientTypeName) {
		set("client_type_name", clientTypeName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getClientTypeName() {
		return getStr("client_type_name");
	}

}
