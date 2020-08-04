package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa07:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa07<M extends BaseCanteenAa07<M>> extends Model<M> implements IBean {

	/**
	*设置库存信息ID 
	*/
	public M setAaa070(java.lang.Integer aaa070) {
		set("aaa070", aaa070);
		return (M)this;
	}

	/**
	*获取库存信息ID 
	*/
	public java.lang.Integer getAaa070() {
		return getInt("aaa070");
	}

	/**
	*设置原料信息ID 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取原料信息ID 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置入库记录id 
	*/
	public M setAca050(java.lang.Integer aca050) {
		set("aca050", aca050);
		return (M)this;
	}

	/**
	*获取入库记录id 
	*/
	public java.lang.Integer getAca050() {
		return getInt("aca050");
	}

	/**
	*设置系统机构ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取系统机构ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置中心库id 
	*/
	public M setAaa080(java.lang.Integer aaa080) {
		set("aaa080", aaa080);
		return (M)this;
	}

	/**
	*获取中心库id 
	*/
	public java.lang.Integer getAaa080() {
		return getInt("aaa080");
	}

	/**
	*设置库存数量 
	*/
	public M setAaa071(java.lang.String aaa071) {
		set("aaa071", aaa071);
		return (M)this;
	}

	/**
	*获取库存数量 
	*/
	public java.lang.String getAaa071() {
		return getStr("aaa071");
	}

	/**
	*设置库存金额 
	*/
	public M setAaa072(java.math.BigDecimal aaa072) {
		set("aaa072", aaa072);
		return (M)this;
	}

	/**
	*获取库存金额 
	*/
	public java.math.BigDecimal getAaa072() {
		return get("aaa072");
	}

	/**
	*设置单据号 
	*/
	public M setAaa073(java.lang.String aaa073) {
		set("aaa073", aaa073);
		return (M)this;
	}

	/**
	*获取单据号 
	*/
	public java.lang.String getAaa073() {
		return getStr("aaa073");
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
