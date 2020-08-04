package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_code:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysCode<M extends BaseSysCode<M>> extends Model<M> implements IBean {

	/**
	*设置id 
	*/
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	/**
	*获取id 
	*/
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	*设置码值类型 
	*/
	public M setCodeType(java.lang.String codeType) {
		set("code_type", codeType);
		return (M)this;
	}

	/**
	*获取码值类型 
	*/
	public java.lang.String getCodeType() {
		return getStr("code_type");
	}

	/**
	*设置 
	*/
	public M setCodeName(java.lang.String codeName) {
		set("code_name", codeName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCodeName() {
		return getStr("code_name");
	}

	/**
	*设置 
	*/
	public M setCodeValue(java.lang.String codeValue) {
		set("code_value", codeValue);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCodeValue() {
		return getStr("code_value");
	}

	/**
	*设置 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.String status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getStatus() {
		return getStr("status");
	}

}
