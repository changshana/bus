package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_sitive:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentSitive<M extends BaseCommentSitive<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setSenId(java.lang.Long senId) {
		set("sen_id", senId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSenId() {
		return getLong("sen_id");
	}

	/**
	*设置 
	*/
	public M setSenName(java.lang.String senName) {
		set("senName", senName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getSenName() {
		return getStr("senName");
	}

}
