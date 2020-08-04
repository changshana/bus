package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_picture:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairPicture<M extends BaseRepairPicture<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPictureId(java.lang.Integer pictureId) {
		set("picture_id", pictureId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPictureId() {
		return getInt("picture_id");
	}

	/**
	*设置地址 
	*/
	public M setPictureUrl(java.lang.String pictureUrl) {
		set("picture_url", pictureUrl);
		return (M)this;
	}

	/**
	*获取地址 
	*/
	public java.lang.String getPictureUrl() {
		return getStr("picture_url");
	}

	/**
	*设置排序 
	*/
	public M setOrderIndex(java.lang.Integer orderIndex) {
		set("order_index", orderIndex);
		return (M)this;
	}

	/**
	*获取排序 
	*/
	public java.lang.Integer getOrderIndex() {
		return getInt("order_index");
	}

	/**
	*设置表名 
	*/
	public M setTableName(java.lang.String tableName) {
		set("table_name", tableName);
		return (M)this;
	}

	/**
	*获取表名 
	*/
	public java.lang.String getTableName() {
		return getStr("table_name");
	}

	/**
	*设置主键ID 
	*/
	public M setPrimaryKeyId(java.lang.Integer primaryKeyId) {
		set("primary_key_id", primaryKeyId);
		return (M)this;
	}

	/**
	*获取主键ID 
	*/
	public java.lang.Integer getPrimaryKeyId() {
		return getInt("primary_key_id");
	}

	/**
	*设置图片类型 
	*/
	public M setPictureType(java.lang.String pictureType) {
		set("picture_type", pictureType);
		return (M)this;
	}

	/**
	*获取图片类型 
	*/
	public java.lang.String getPictureType() {
		return getStr("picture_type");
	}

	/**
	*设置创建时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置创建用户 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

}
