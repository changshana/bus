package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pm_table_join:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePmTableJoin<M extends BasePmTableJoin<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setJoinId(java.lang.Integer joinId) {
		set("join_id", joinId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getJoinId() {
		return getInt("join_id");
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
	public M setJoinTableName(java.lang.String joinTableName) {
		set("join_table_name", joinTableName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getJoinTableName() {
		return getStr("join_table_name");
	}

	/**
	*设置 
	*/
	public M setJoinTableAlias(java.lang.String joinTableAlias) {
		set("join_table_alias", joinTableAlias);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getJoinTableAlias() {
		return getStr("join_table_alias");
	}

	/**
	*设置 
	*/
	public M setSelectFields(java.lang.String selectFields) {
		set("select_fields", selectFields);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getSelectFields() {
		return getStr("select_fields");
	}

	/**
	*设置 
	*/
	public M setJoinCondition(java.lang.String joinCondition) {
		set("join_condition", joinCondition);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getJoinCondition() {
		return getStr("join_condition");
	}

	/**
	*设置 
	*/
	public M setJoinType(java.lang.String joinType) {
		set("join_type", joinType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getJoinType() {
		return getStr("join_type");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Boolean status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Boolean getStatus() {
		return get("status");
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

}
