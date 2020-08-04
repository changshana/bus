package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca03:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa03<M extends BaseCanteenCa03<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca030(java.lang.Integer aca030) {
		set("aca030", aca030);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca030() {
		return getInt("aca030");
	}

	/**
	*设置单据号 
	*/
	public M setAca031(java.lang.String aca031) {
		set("aca031", aca031);
		return (M)this;
	}

	/**
	*获取单据号 
	*/
	public java.lang.String getAca031() {
		return getStr("aca031");
	}

	/**
	*设置要求供应时间 
	*/
	public M setAca032(java.util.Date aca032) {
		set("aca032", aca032);
		return (M)this;
	}

	/**
	*获取要求供应时间 
	*/
	public java.util.Date getAca032() {
		return get("aca032");
	}

	/**
	*设置上报人 
	*/
	public M setAca033(java.lang.String aca033) {
		set("aca033", aca033);
		return (M)this;
	}

	/**
	*获取上报人 
	*/
	public java.lang.String getAca033() {
		return getStr("aca033");
	}

	/**
	*设置上报时间 
	*/
	public M setAca034(java.util.Date aca034) {
		set("aca034", aca034);
		return (M)this;
	}

	/**
	*获取上报时间 
	*/
	public java.util.Date getAca034() {
		return get("aca034");
	}

	/**
	*设置上报状态 
	*/
	public M setAca035(java.lang.String aca035) {
		set("aca035", aca035);
		return (M)this;
	}

	/**
	*获取上报状态 
	*/
	public java.lang.String getAca035() {
		return getStr("aca035");
	}

	/**
	*设置机构id 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取机构id 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置汇总id 
	*/
	public M setAca010(java.lang.Integer aca010) {
		set("aca010", aca010);
		return (M)this;
	}

	/**
	*获取汇总id 
	*/
	public java.lang.Integer getAca010() {
		return getInt("aca010");
	}

	/**
	*设置招标状态（1已上报，2已确认） 
	*/
	public M setAca036(java.lang.String aca036) {
		set("aca036", aca036);
		return (M)this;
	}

	/**
	*获取招标状态（1已上报，2已确认） 
	*/
	public java.lang.String getAca036() {
		return getStr("aca036");
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

	/**
	*设置1:饮食中心计划;2:配送中心计划 
	*/
	public M setAca037(java.lang.String aca037) {
		set("aca037", aca037);
		return (M)this;
	}

	/**
	*获取1:饮食中心计划;2:配送中心计划 
	*/
	public java.lang.String getAca037() {
		return getStr("aca037");
	}

}
