package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * xim_browse_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXimBrowseRecord<M extends BaseXimBrowseRecord<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setBrowseRecordId(java.lang.Integer browseRecordId) {
		set("browse_record_id", browseRecordId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getBrowseRecordId() {
		return getInt("browse_record_id");
	}

	/**
	*设置user_id 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取user_id 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	*设置library_id 
	*/
	public M setLibraryId(java.lang.String libraryId) {
		set("library_id", libraryId);
		return (M)this;
	}

	/**
	*获取library_id 
	*/
	public java.lang.String getLibraryId() {
		return getStr("library_id");
	}

	/**
	*设置record_time 
	*/
	public M setRecordTime(java.util.Date recordTime) {
		set("record_time", recordTime);
		return (M)this;
	}

	/**
	*获取record_time 
	*/
	public java.util.Date getRecordTime() {
		return get("record_time");
	}

}
