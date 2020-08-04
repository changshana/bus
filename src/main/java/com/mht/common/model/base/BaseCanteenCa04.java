package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca04:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa04<M extends BaseCanteenCa04<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca040(java.lang.Integer aca040) {
		set("aca040", aca040);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca040() {
		return getInt("aca040");
	}

	/**
	*设置原料需求计划单ID 
	*/
	public M setAca030(java.lang.Integer aca030) {
		set("aca030", aca030);
		return (M)this;
	}

	/**
	*获取原料需求计划单ID 
	*/
	public java.lang.Integer getAca030() {
		return getInt("aca030");
	}

	/**
	*设置原料ID 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取原料ID 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置数量 
	*/
	public M setAca041(java.lang.Integer aca041) {
		set("aca041", aca041);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.Integer getAca041() {
		return getInt("aca041");
	}

	/**
	*设置原料价格ID  
	*/
	public M setAba001(java.lang.Integer aba001) {
		set("aba001", aba001);
		return (M)this;
	}

	/**
	*获取原料价格ID  
	*/
	public java.lang.Integer getAba001() {
		return getInt("aba001");
	}

	/**
	*设置写入状态（0未写入，1已写入） 
	*/
	public M setAca042(java.lang.String aca042) {
		set("aca042", aca042);
		return (M)this;
	}

	/**
	*获取写入状态（0未写入，1已写入） 
	*/
	public java.lang.String getAca042() {
		return getStr("aca042");
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
	*设置供应商 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取供应商 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

}
