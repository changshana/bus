package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa09:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa09<M extends BaseCanteenAa09<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa090(java.lang.Integer aaa090) {
		set("aaa090", aaa090);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa090() {
		return getInt("aaa090");
	}

	/**
	*设置中心库供需机构ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取中心库供需机构ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置中心库ID 
	*/
	public M setAaa080(java.lang.Integer aaa080) {
		set("aaa080", aaa080);
		return (M)this;
	}

	/**
	*获取中心库ID 
	*/
	public java.lang.Integer getAaa080() {
		return getInt("aaa080");
	}

}
