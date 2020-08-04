package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa01<M extends BaseCanteenCa01<M>> extends Model<M> implements IBean {

	/**
	*设置需求汇总ID 
	*/
	public M setAca010(java.lang.Integer aca010) {
		set("aca010", aca010);
		return (M)this;
	}

	/**
	*获取需求汇总ID 
	*/
	public java.lang.Integer getAca010() {
		return getInt("aca010");
	}

	/**
	*设置采购单据号 
	*/
	public M setAca011(java.lang.String aca011) {
		set("aca011", aca011);
		return (M)this;
	}

	/**
	*获取采购单据号 
	*/
	public java.lang.String getAca011() {
		return getStr("aca011");
	}

	/**
	*设置汇总时间 
	*/
	public M setAca030(java.util.Date aca030) {
		set("aca030", aca030);
		return (M)this;
	}

	/**
	*获取汇总时间 
	*/
	public java.util.Date getAca030() {
		return get("aca030");
	}

	/**
	*设置采购处理人 
	*/
	public M setAca021(java.lang.String aca021) {
		set("aca021", aca021);
		return (M)this;
	}

	/**
	*获取采购处理人 
	*/
	public java.lang.String getAca021() {
		return getStr("aca021");
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
	*设置采购处理时间 
	*/
	public M setAca022(java.util.Date aca022) {
		set("aca022", aca022);
		return (M)this;
	}

	/**
	*获取采购处理时间 
	*/
	public java.util.Date getAca022() {
		return get("aca022");
	}

	/**
	*设置采购处理状态 
	*/
	public M setAca035(java.lang.String aca035) {
		set("aca035", aca035);
		return (M)this;
	}

	/**
	*获取采购处理状态 
	*/
	public java.lang.String getAca035() {
		return getStr("aca035");
	}

	/**
	*设置餐链系统采购订单主键id 
	*/
	public M setPurchaseId(java.lang.Long purchaseId) {
		set("purchaseId", purchaseId);
		return (M)this;
	}

	/**
	*获取餐链系统采购订单主键id 
	*/
	public java.lang.Long getPurchaseId() {
		return getLong("purchaseId");
	}

}
