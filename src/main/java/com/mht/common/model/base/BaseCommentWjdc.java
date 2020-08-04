package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_wjdc:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentWjdc<M extends BaseCommentWjdc<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setWjdcId(java.lang.Long wjdcId) {
		set("wjdc_id", wjdcId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getWjdcId() {
		return getLong("wjdc_id");
	}

	/**
	*设置 
	*/
	public M setWjdcLb(java.lang.String wjdcLb) {
		set("wjdc_lb", wjdcLb);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getWjdcLb() {
		return getStr("wjdc_lb");
	}

	/**
	*设置 
	*/
	public M setWjdcQus(java.lang.String wjdcQus) {
		set("wjdc_qus", wjdcQus);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getWjdcQus() {
		return getStr("wjdc_qus");
	}

	/**
	*设置 
	*/
	public M setZoneId(java.lang.Integer zoneId) {
		set("zone_id", zoneId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getZoneId() {
		return getInt("zone_id");
	}

	/**
	*设置 
	*/
	public M setPersonType(java.lang.Integer personType) {
		set("person_type", personType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getPersonType() {
		return getInt("person_type");
	}

}
