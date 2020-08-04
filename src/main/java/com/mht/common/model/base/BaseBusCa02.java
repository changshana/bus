package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ca02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusCa02<M extends BaseBusCa02<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca001(java.lang.Integer aca001) {
		set("aca001", aca001);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca001() {
		return getInt("aca001");
	}

	/**
	*设置驾驶员id 
	*/
	public M setAaa020(java.lang.Integer aaa020) {
		set("aaa020", aaa020);
		return (M)this;
	}

	/**
	*获取驾驶员id 
	*/
	public java.lang.Integer getAaa020() {
		return getInt("aaa020");
	}

	/**
	*设置车辆id 
	*/
	public M setAaa001(java.lang.Integer aaa001) {
		set("aaa001", aaa001);
		return (M)this;
	}

	/**
	*获取车辆id 
	*/
	public java.lang.Integer getAaa001() {
		return getInt("aaa001");
	}

}
