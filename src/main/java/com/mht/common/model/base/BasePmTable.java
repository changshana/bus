package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pm_table:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePmTable<M extends BasePmTable<M>> extends Model<M> implements IBean {

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
	public M setTableName(java.lang.String tableName) {
		set("table_name", tableName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTableName() {
		return getStr("table_name");
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
	public M setFilePath(java.lang.String filePath) {
		set("file_path", filePath);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFilePath() {
		return getStr("file_path");
	}

	/**
	*设置 
	*/
	public M setPermName(java.lang.String permName) {
		set("perm_name", permName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPermName() {
		return getStr("perm_name");
	}

	/**
	*设置 
	*/
	public M setAllowAdd(java.lang.Integer allowAdd) {
		set("allow_add", allowAdd);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAllowAdd() {
		return getInt("allow_add");
	}

	/**
	*设置 
	*/
	public M setAllowEdit(java.lang.Integer allowEdit) {
		set("allow_edit", allowEdit);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAllowEdit() {
		return getInt("allow_edit");
	}

	/**
	*设置 
	*/
	public M setAllowDelete(java.lang.Integer allowDelete) {
		set("allow_delete", allowDelete);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAllowDelete() {
		return getInt("allow_delete");
	}

	/**
	*设置 
	*/
	public M setAllowSearch(java.lang.Integer allowSearch) {
		set("allow_search", allowSearch);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAllowSearch() {
		return getInt("allow_search");
	}

	/**
	*设置 
	*/
	public M setAllowImport(java.lang.Integer allowImport) {
		set("allow_import", allowImport);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAllowImport() {
		return getInt("allow_import");
	}

	/**
	*设置 
	*/
	public M setAllowExport(java.lang.Integer allowExport) {
		set("allow_export", allowExport);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAllowExport() {
		return getInt("allow_export");
	}

	/**
	*设置 
	*/
	public M setTableAlias(java.lang.String tableAlias) {
		set("table_alias", tableAlias);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTableAlias() {
		return getStr("table_alias");
	}

	/**
	*设置 
	*/
	public M setTransmitFields(java.lang.String transmitFields) {
		set("transmit_fields", transmitFields);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTransmitFields() {
		return getStr("transmit_fields");
	}

	/**
	*设置 
	*/
	public M setAllowDebug(java.lang.Integer allowDebug) {
		set("allow_debug", allowDebug);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAllowDebug() {
		return getInt("allow_debug");
	}

	/**
	*设置 
	*/
	public M setTableAction(java.lang.String tableAction) {
		set("table_action", tableAction);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTableAction() {
		return getStr("table_action");
	}

	/**
	*设置 
	*/
	public M setIsView(java.lang.Integer isView) {
		set("is_view", isView);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getIsView() {
		return getInt("is_view");
	}

	/**
	*设置 
	*/
	public M setModuleId(java.lang.Integer moduleId) {
		set("module_id", moduleId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getModuleId() {
		return getInt("module_id");
	}

	/**
	*设置 
	*/
	public M setOrderExp(java.lang.String orderExp) {
		set("order_exp", orderExp);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getOrderExp() {
		return getStr("order_exp");
	}

	/**
	*设置 
	*/
	public M setPageSize(java.lang.Integer pageSize) {
		set("page_size", pageSize);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getPageSize() {
		return getInt("page_size");
	}

	/**
	*设置 
	*/
	public M setEmptyOnSystemInit(java.lang.Integer emptyOnSystemInit) {
		set("empty_on_system_init", emptyOnSystemInit);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getEmptyOnSystemInit() {
		return getInt("empty_on_system_init");
	}

}
