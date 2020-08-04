package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa02<M extends BaseCanteenCa02<M>> extends Model<M> implements IBean {

	/**
	*设置需求汇总详情ID 
	*/
	public M setAca020(java.lang.Integer aca020) {
		set("aca020", aca020);
		return (M)this;
	}

	/**
	*获取需求汇总详情ID 
	*/
	public java.lang.Integer getAca020() {
		return getInt("aca020");
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
	*设置确认采购数量 
	*/
	public M setAca021(java.lang.Integer aca021) {
		set("aca021", aca021);
		return (M)this;
	}

	/**
	*获取确认采购数量 
	*/
	public java.lang.Integer getAca021() {
		return getInt("aca021");
	}

	/**
	*设置采购数量 
	*/
	public M setAca024(java.lang.Integer aca024) {
		set("aca024", aca024);
		return (M)this;
	}

	/**
	*获取采购数量 
	*/
	public java.lang.Integer getAca024() {
		return getInt("aca024");
	}

	/**
	*设置机构id(食堂id) 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取机构id(食堂id) 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

	/**
	*设置指定供货商id 
	*/
	public M setAaa010(java.lang.Integer aaa010) {
		set("aaa010", aaa010);
		return (M)this;
	}

	/**
	*获取指定供货商id 
	*/
	public java.lang.Integer getAaa010() {
		return getInt("aaa010");
	}

	/**
	*设置申报类型(1-指定供货商,直供;2供货商申报,竞价) 
	*/
	public M setAca022(java.lang.String aca022) {
		set("aca022", aca022);
		return (M)this;
	}

	/**
	*获取申报类型(1-指定供货商,直供;2供货商申报,竞价) 
	*/
	public java.lang.String getAca022() {
		return getStr("aca022");
	}

	/**
	*设置申报供货回写价格 
	*/
	public M setAca023(java.lang.String aca023) {
		set("aca023", aca023);
		return (M)this;
	}

	/**
	*获取申报供货回写价格 
	*/
	public java.lang.String getAca023() {
		return getStr("aca023");
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
	*设置需求计划单id 
	*/
	public M setAca030(java.lang.Integer aca030) {
		set("aca030", aca030);
		return (M)this;
	}

	/**
	*获取需求计划单id 
	*/
	public java.lang.Integer getAca030() {
		return getInt("aca030");
	}

	/**
	*设置餐链系统采购订单主键id(改：加工类配送中心是否出库) 
	*/
	public M setPurchaseId(java.lang.Long purchaseId) {
		set("purchaseId", purchaseId);
		return (M)this;
	}

	/**
	*获取餐链系统采购订单主键id(改：加工类配送中心是否出库) 
	*/
	public java.lang.Long getPurchaseId() {
		return getLong("purchaseId");
	}

	/**
	*设置收货状态(0::待收货;1:完成收货;2:缺货) 
	*/
	public M setAaa995(java.lang.Integer aaa995) {
		set("aaa995", aaa995);
		return (M)this;
	}

	/**
	*获取收货状态(0::待收货;1:完成收货;2:缺货) 
	*/
	public java.lang.Integer getAaa995() {
		return getInt("aaa995");
	}

}
