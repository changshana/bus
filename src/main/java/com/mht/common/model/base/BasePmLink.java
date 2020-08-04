package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pm_link:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePmLink<M extends BasePmLink<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setLinkId(java.lang.Integer linkId) {
		set("link_id", linkId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getLinkId() {
		return getInt("link_id");
	}

	/**
	*设置 
	*/
	public M setLinkName(java.lang.String linkName) {
		set("link_name", linkName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getLinkName() {
		return getStr("link_name");
	}

	/**
	*设置 
	*/
	public M setLinkPosition(java.lang.String linkPosition) {
		set("link_position", linkPosition);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getLinkPosition() {
		return getStr("link_position");
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
	public M setPermValue(java.lang.String permValue) {
		set("perm_value", permValue);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPermValue() {
		return getStr("perm_value");
	}

	/**
	*设置 
	*/
	public M setLinkUrl(java.lang.String linkUrl) {
		set("link_url", linkUrl);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getLinkUrl() {
		return getStr("link_url");
	}

	/**
	*设置 
	*/
	public M setLinkTarget(java.lang.String linkTarget) {
		set("link_target", linkTarget);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getLinkTarget() {
		return getStr("link_target");
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

}
