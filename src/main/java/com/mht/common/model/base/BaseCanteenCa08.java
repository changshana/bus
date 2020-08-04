package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca08:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa08<M extends BaseCanteenCa08<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca080(java.lang.Integer aca080) {
		set("aca080", aca080);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca080() {
		return getInt("aca080");
	}

	/**
	*设置单据号 
	*/
	public M setAca081(java.lang.String aca081) {
		set("aca081", aca081);
		return (M)this;
	}

	/**
	*获取单据号 
	*/
	public java.lang.String getAca081() {
		return getStr("aca081");
	}

	/**
	*设置创建餐厅 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取创建餐厅 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置退货状态(1发布申请） 
	*/
	public M setAca082(java.lang.String aca082) {
		set("aca082", aca082);
		return (M)this;
	}

	/**
	*获取退货状态(1发布申请） 
	*/
	public java.lang.String getAca082() {
		return getStr("aca082");
	}

	/**
	*设置退货理由 
	*/
	public M setAca083(java.lang.String aca083) {
		set("aca083", aca083);
		return (M)this;
	}

	/**
	*获取退货理由 
	*/
	public java.lang.String getAca083() {
		return getStr("aca083");
	}

	/**
	*设置状态 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getAaa996() {
		return getInt("aaa996");
	}

	/**
	*设置创建用户 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getAaa997() {
		return getStr("aaa997");
	}

	/**
	*设置创建时间 
	*/
	public M setAaa998(java.util.Date aaa998) {
		set("aaa998", aaa998);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getAaa998() {
		return get("aaa998");
	}

	/**
	*设置备注 
	*/
	public M setAaa999(java.lang.String aaa999) {
		set("aaa999", aaa999);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getAaa999() {
		return getStr("aaa999");
	}

}
