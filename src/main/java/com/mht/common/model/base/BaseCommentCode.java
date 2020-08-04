package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_code:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentCode<M extends BaseCommentCode<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCodeId(java.lang.Integer codeId) {
		set("code_id", codeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCodeId() {
		return getInt("code_id");
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
	*设置码值类型名称 
	*/
	public M setCodeName(java.lang.String codeName) {
		set("code_name", codeName);
		return (M)this;
	}

	/**
	*获取码值类型名称 
	*/
	public java.lang.String getCodeName() {
		return getStr("code_name");
	}

	/**
	*设置码值 
	*/
	public M setCodeValue(java.lang.String codeValue) {
		set("code_value", codeValue);
		return (M)this;
	}

	/**
	*获取码值 
	*/
	public java.lang.String getCodeValue() {
		return getStr("code_value");
	}

	/**
	*设置码值名称 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取码值名称 
	*/
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	*设置状态 
	*/
	public M setStatus(java.lang.String status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.String getStatus() {
		return getStr("status");
	}

}
