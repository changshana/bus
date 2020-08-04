package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * test:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTest<M extends BaseTest<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	*设置 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	*设置 
	*/
	public M setTime(java.util.Date time) {
		set("time", time);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getTime() {
		return get("time");
	}

}
