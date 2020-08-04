package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pm_detail:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePmDetail<M extends BasePmDetail<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setDetailId(java.lang.Integer detailId) {
		set("detail_id", detailId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getDetailId() {
		return getInt("detail_id");
	}

	/**
	*设置 
	*/
	public M setPageUrl(java.lang.String pageUrl) {
		set("page_url", pageUrl);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPageUrl() {
		return getStr("page_url");
	}

	/**
	*设置 
	*/
	public M setPageName(java.lang.String pageName) {
		set("page_name", pageName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPageName() {
		return getStr("page_name");
	}

	/**
	*设置 
	*/
	public M setFunctionName(java.lang.String functionName) {
		set("function_name", functionName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFunctionName() {
		return getStr("function_name");
	}

	/**
	*设置 
	*/
	public M setFieldParams(java.lang.String fieldParams) {
		set("field_params", fieldParams);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getFieldParams() {
		return getStr("field_params");
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
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getContent() {
		return getStr("content");
	}

}
