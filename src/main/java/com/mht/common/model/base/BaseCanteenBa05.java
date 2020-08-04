package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ba05:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenBa05<M extends BaseCanteenBa05<M>> extends Model<M> implements IBean {

	/**
	*设置原料申请ID 
	*/
	public M setAba050(java.lang.Integer aba050) {
		set("aba050", aba050);
		return (M)this;
	}

	/**
	*获取原料申请ID 
	*/
	public java.lang.Integer getAba050() {
		return getInt("aba050");
	}

	/**
	*设置机构id(餐厅id) 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取机构id(餐厅id) 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置原料id 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取原料id 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置申请数量 
	*/
	public M setAba051(java.lang.String aba051) {
		set("aba051", aba051);
		return (M)this;
	}

	/**
	*获取申请数量 
	*/
	public java.lang.String getAba051() {
		return getStr("aba051");
	}

	/**
	*设置上报状态 
	*/
	public M setAba052(java.lang.Integer aba052) {
		set("aba052", aba052);
		return (M)this;
	}

	/**
	*获取上报状态 
	*/
	public java.lang.Integer getAba052() {
		return getInt("aba052");
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
