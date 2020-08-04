package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * stu_retreats:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseStuRetreats<M extends BaseStuRetreats<M>> extends Model<M> implements IBean {

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

}
