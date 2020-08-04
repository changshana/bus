package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_evaluate:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairEvaluate<M extends BaseRepairEvaluate<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setReId(java.lang.Integer reId) {
		set("re_id", reId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getReId() {
		return getInt("re_id");
	}

	/**
	*设置 
	*/
	public M setReName(java.lang.String reName) {
		set("re_name", reName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getReName() {
		return getStr("re_name");
	}

	/**
	*设置 
	*/
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
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
	public M setRsId(java.lang.Integer rsId) {
		set("rs_id", rsId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRsId() {
		return getInt("rs_id");
	}

}
