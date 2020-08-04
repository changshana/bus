package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pm_index:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePmIndex<M extends BasePmIndex<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setIndexId(java.lang.Integer indexId) {
		set("index_id", indexId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getIndexId() {
		return getInt("index_id");
	}

	/**
	*设置 
	*/
	public M setIndexName(java.lang.String indexName) {
		set("index_name", indexName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getIndexName() {
		return getStr("index_name");
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
	public M setIsUnique(java.lang.Integer isUnique) {
		set("is_unique", isUnique);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getIsUnique() {
		return getInt("is_unique");
	}

	/**
	*设置 
	*/
	public M setColumnExp(java.lang.String columnExp) {
		set("column_exp", columnExp);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getColumnExp() {
		return getStr("column_exp");
	}

}
