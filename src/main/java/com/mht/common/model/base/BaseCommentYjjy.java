package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_yjjy:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentYjjy<M extends BaseCommentYjjy<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setYjjyId(java.lang.Long yjjyId) {
		set("yjjy_id", yjjyId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getYjjyId() {
		return getLong("yjjy_id");
	}

	/**
	*设置 
	*/
	public M setYjjyDate(java.lang.String yjjyDate) {
		set("yjjy_date", yjjyDate);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getYjjyDate() {
		return getStr("yjjy_date");
	}

	/**
	*设置 
	*/
	public M setYjjyText(java.lang.String yjjyText) {
		set("yjjy_text", yjjyText);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getYjjyText() {
		return getStr("yjjy_text");
	}

}
