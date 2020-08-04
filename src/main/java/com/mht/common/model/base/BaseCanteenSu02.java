package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_su02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenSu02<M extends BaseCanteenSu02<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSu020(java.lang.Integer su020) {
		set("su020", su020);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSu020() {
		return getInt("su020");
	}

	/**
	*设置供货商响应ID 
	*/
	public M setSu010(java.lang.Integer su010) {
		set("su010", su010);
		return (M)this;
	}

	/**
	*获取供货商响应ID 
	*/
	public java.lang.Integer getSu010() {
		return getInt("su010");
	}

	/**
	*设置原料基础信息ID 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取原料基础信息ID 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置采购方参考采购价  
	*/
	public M setAba004(java.lang.String aba004) {
		set("aba004", aba004);
		return (M)this;
	}

	/**
	*获取采购方参考采购价  
	*/
	public java.lang.String getAba004() {
		return getStr("aba004");
	}

	/**
	*设置供货商原料价格  
	*/
	public M setSu021(java.lang.String su021) {
		set("su021", su021);
		return (M)this;
	}

	/**
	*获取供货商原料价格  
	*/
	public java.lang.String getSu021() {
		return getStr("su021");
	}

	/**
	*设置采购数量   
	*/
	public M setSu022(java.lang.String su022) {
		set("su022", su022);
		return (M)this;
	}

	/**
	*获取采购数量   
	*/
	public java.lang.String getSu022() {
		return getStr("su022");
	}

	/**
	*设置采购确认状态    
	*/
	public M setSu023(java.lang.String su023) {
		set("su023", su023);
		return (M)this;
	}

	/**
	*获取采购确认状态    
	*/
	public java.lang.String getSu023() {
		return getStr("su023");
	}

	/**
	*设置需求汇总详情信息 
	*/
	public M setAca020(java.lang.Integer aca020) {
		set("aca020", aca020);
		return (M)this;
	}

	/**
	*获取需求汇总详情信息 
	*/
	public java.lang.Integer getAca020() {
		return getInt("aca020");
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
