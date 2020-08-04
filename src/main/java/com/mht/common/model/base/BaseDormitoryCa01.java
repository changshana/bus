package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_ca01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCa01<M extends BaseDormitoryCa01<M>> extends Model<M> implements IBean {

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

}
