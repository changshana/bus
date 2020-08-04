package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_category:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentCategory<M extends BaseCommentCategory<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setCategoryId(java.lang.Long categoryId) {
		set("category_id", categoryId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getCategoryId() {
		return getLong("category_id");
	}

	/**
	*设置 
	*/
	public M setCategoryReplytime(java.lang.Long categoryReplytime) {
		set("category_replyTime", categoryReplytime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getCategoryReplytime() {
		return getLong("category_replyTime");
	}

	/**
	*设置 
	*/
	public M setCategoryReplylength(java.lang.Long categoryReplylength) {
		set("category_replyLength", categoryReplylength);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getCategoryReplylength() {
		return getLong("category_replyLength");
	}

	/**
	*设置 
	*/
	public M setCategoryName(java.lang.String categoryName) {
		set("category_name", categoryName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCategoryName() {
		return getStr("category_name");
	}

	/**
	*设置 
	*/
	public M setCategoryToplength(java.lang.Long categoryToplength) {
		set("category_topLength", categoryToplength);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getCategoryToplength() {
		return getLong("category_topLength");
	}

}
