package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_stage:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairStage<M extends BaseRepairStage<M>> extends Model<M> implements IBean {

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

	/**
	*设置 
	*/
	public M setRsName(java.lang.String rsName) {
		set("rs_name", rsName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRsName() {
		return getStr("rs_name");
	}

	/**
	*设置 
	*/
	public M setColor(java.lang.String color) {
		set("color", color);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getColor() {
		return getStr("color");
	}

}
