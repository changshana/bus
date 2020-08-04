package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pm_field:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePmField<M extends BasePmField<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setFieldId(java.lang.Integer fieldId) {
		set("field_id", fieldId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFieldId() {
		return getInt("field_id");
	}

	/**
	*设置 
	*/
	public M setTableId(java.lang.Integer tableId) {
		set("table_id", tableId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTableId() {
		return getInt("table_id");
	}

	/**
	*设置 
	*/
	public M setFieldName(java.lang.String fieldName) {
		set("field_name", fieldName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFieldName() {
		return getStr("field_name");
	}

	/**
	*设置 
	*/
	public M setFieldAlias(java.lang.String fieldAlias) {
		set("field_alias", fieldAlias);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFieldAlias() {
		return getStr("field_alias");
	}

	/**
	*设置 
	*/
	public M setFieldType(java.lang.String fieldType) {
		set("field_type", fieldType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFieldType() {
		return getStr("field_type");
	}

	/**
	*设置 
	*/
	public M setFieldIskey(java.lang.Integer fieldIskey) {
		set("field_iskey", fieldIskey);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFieldIskey() {
		return getInt("field_iskey");
	}

	/**
	*设置 
	*/
	public M setFieldIsnullable(java.lang.Integer fieldIsnullable) {
		set("field_isnullable", fieldIsnullable);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFieldIsnullable() {
		return getInt("field_isnullable");
	}

	/**
	*设置 
	*/
	public M setFieldMaxLength(java.lang.Integer fieldMaxLength) {
		set("field_max_length", fieldMaxLength);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFieldMaxLength() {
		return getInt("field_max_length");
	}

	/**
	*设置 
	*/
	public M setFieldDecimalLength(java.lang.Integer fieldDecimalLength) {
		set("field_decimal_length", fieldDecimalLength);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFieldDecimalLength() {
		return getInt("field_decimal_length");
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
	public M setInputAttr(java.lang.String inputAttr) {
		set("input_attr", inputAttr);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getInputAttr() {
		return getStr("input_attr");
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
	public M setListData(java.lang.String listData) {
		set("list_data", listData);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getListData() {
		return getStr("list_data");
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

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
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

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setFieldSearch(java.lang.String fieldSearch) {
		set("field_search", fieldSearch);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFieldSearch() {
		return getStr("field_search");
	}

	/**
	*设置 
	*/
	public M setFieldFilter(java.lang.String fieldFilter) {
		set("field_filter", fieldFilter);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFieldFilter() {
		return getStr("field_filter");
	}

	/**
	*设置 
	*/
	public M setInputTip(java.lang.String inputTip) {
		set("input_tip", inputTip);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getInputTip() {
		return getStr("input_tip");
	}

	/**
	*设置 
	*/
	public M setListPageShow(java.lang.Integer listPageShow) {
		set("list_page_show", listPageShow);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getListPageShow() {
		return getInt("list_page_show");
	}

	/**
	*设置 
	*/
	public M setFieldAutoIncrement(java.lang.Integer fieldAutoIncrement) {
		set("field_auto_increment", fieldAutoIncrement);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFieldAutoIncrement() {
		return getInt("field_auto_increment");
	}

	/**
	*设置 
	*/
	public M setInputDefaultValue(java.lang.String inputDefaultValue) {
		set("input_default_value", inputDefaultValue);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getInputDefaultValue() {
		return getStr("input_default_value");
	}

	/**
	*设置 
	*/
	public M setFieldUnique(java.lang.Integer fieldUnique) {
		set("field_unique", fieldUnique);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFieldUnique() {
		return getInt("field_unique");
	}

	/**
	*设置 
	*/
	public M setSourceType(java.lang.Integer sourceType) {
		set("source_type", sourceType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getSourceType() {
		return getInt("source_type");
	}

	/**
	*设置 
	*/
	public M setFieldRange(java.lang.String fieldRange) {
		set("field_range", fieldRange);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFieldRange() {
		return getStr("field_range");
	}

	/**
	*设置 
	*/
	public M setRegExp(java.lang.String regExp) {
		set("reg_exp", regExp);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRegExp() {
		return getStr("reg_exp");
	}

	/**
	*设置 
	*/
	public M setCommonField(java.lang.Integer commonField) {
		set("common_field", commonField);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getCommonField() {
		return getInt("common_field");
	}

	/**
	*设置 
	*/
	public M setDbAutoIncrement(java.lang.Integer dbAutoIncrement) {
		set("db_auto_increment", dbAutoIncrement);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDbAutoIncrement() {
		return getInt("db_auto_increment");
	}

	/**
	*设置 
	*/
	public M setFieldMinLength(java.lang.Integer fieldMinLength) {
		set("field_min_length", fieldMinLength);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getFieldMinLength() {
		return getInt("field_min_length");
	}

	/**
	*设置 
	*/
	public M setFieldMin(java.lang.Long fieldMin) {
		set("field_min", fieldMin);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getFieldMin() {
		return getLong("field_min");
	}

	/**
	*设置 
	*/
	public M setFieldMax(java.lang.Long fieldMax) {
		set("field_max", fieldMax);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getFieldMax() {
		return getLong("field_max");
	}

}
