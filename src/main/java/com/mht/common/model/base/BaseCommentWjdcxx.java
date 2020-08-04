package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_wjdcxx:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentWjdcxx<M extends BaseCommentWjdcxx<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setWjdcxxId(java.lang.Long wjdcxxId) {
		set("wjdcXx_id", wjdcxxId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getWjdcxxId() {
		return getLong("wjdcXx_id");
	}

	/**
	*设置 
	*/
	public M setWjdcxxLen(java.lang.String wjdcxxLen) {
		set("wjdcXx_len", wjdcxxLen);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getWjdcxxLen() {
		return getStr("wjdcXx_len");
	}

	/**
	*设置 
	*/
	public M setWjdcxxXx(java.lang.String wjdcxxXx) {
		set("wjdcXx_xx", wjdcxxXx);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getWjdcxxXx() {
		return getStr("wjdcXx_xx");
	}

	/**
	*设置 
	*/
	public M setSyswjdcWjdcId(java.lang.Long syswjdcWjdcId) {
		set("sysWjdc_wjdc_id", syswjdcWjdcId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getSyswjdcWjdcId() {
		return getLong("sysWjdc_wjdc_id");
	}

}
