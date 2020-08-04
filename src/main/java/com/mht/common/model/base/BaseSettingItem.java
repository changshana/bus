package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * setting_item:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSettingItem<M extends BaseSettingItem<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setItemId(java.lang.Integer itemId) {
		set("item_id", itemId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getItemId() {
		return getInt("item_id");
	}

	/**
	*设置 
	*/
	public M setModuleName(java.lang.String moduleName) {
		set("module_name", moduleName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getModuleName() {
		return getStr("module_name");
	}

	/**
	*设置 
	*/
	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	*设置 
	*/
	public M setInputType(java.lang.String inputType) {
		set("input_type", inputType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getInputType() {
		return getStr("input_type");
	}

	/**
	*设置 
	*/
	public M setControlAttr(java.lang.String controlAttr) {
		set("control_attr", controlAttr);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getControlAttr() {
		return getStr("control_attr");
	}

	/**
	*设置 
	*/
	public M setInputFormat(java.lang.String inputFormat) {
		set("input_format", inputFormat);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getInputFormat() {
		return getStr("input_format");
	}

	/**
	*设置 
	*/
	public M setSettingKey(java.lang.String settingKey) {
		set("setting_key", settingKey);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getSettingKey() {
		return getStr("setting_key");
	}

	/**
	*设置 
	*/
	public M setModuleRemark(java.lang.String moduleRemark) {
		set("module_remark", moduleRemark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getModuleRemark() {
		return getStr("module_remark");
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

	/**
	*设置 
	*/
	public M setDataSource(java.lang.String dataSource) {
		set("data_source", dataSource);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDataSource() {
		return getStr("data_source");
	}

	/**
	*设置 
	*/
	public M setDefaultValue(java.lang.String defaultValue) {
		set("default_value", defaultValue);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDefaultValue() {
		return getStr("default_value");
	}

	/**
	*设置 
	*/
	public M setOriginalItemId(java.lang.Integer originalItemId) {
		set("original_item_id", originalItemId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getOriginalItemId() {
		return getInt("original_item_id");
	}

	/**
	*设置 
	*/
	public M setLanguage(java.lang.String language) {
		set("language", language);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getLanguage() {
		return getStr("language");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

}
