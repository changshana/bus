package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ba04:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenBa04<M extends BaseCanteenBa04<M>> extends Model<M> implements IBean {

	/**
	*设置出库验收详情ID 
	*/
	public M setAba040(java.lang.Integer aba040) {
		set("aba040", aba040);
		return (M)this;
	}

	/**
	*获取出库验收详情ID 
	*/
	public java.lang.Integer getAba040() {
		return getInt("aba040");
	}

	/**
	*设置出库验收id 
	*/
	public M setAba030(java.lang.Integer aba030) {
		set("aba030", aba030);
		return (M)this;
	}

	/**
	*获取出库验收id 
	*/
	public java.lang.Integer getAba030() {
		return getInt("aba030");
	}

	/**
	*设置库存id 
	*/
	public M setAaa070(java.lang.Integer aaa070) {
		set("aaa070", aaa070);
		return (M)this;
	}

	/**
	*获取库存id 
	*/
	public java.lang.Integer getAaa070() {
		return getInt("aaa070");
	}

	/**
	*设置出库数量 
	*/
	public M setAba041(java.lang.String aba041) {
		set("aba041", aba041);
		return (M)this;
	}

	/**
	*获取出库数量 
	*/
	public java.lang.String getAba041() {
		return getStr("aba041");
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
