package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ca03:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusCa03<M extends BaseBusCa03<M>> extends Model<M> implements IBean {

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
	*设置座位号 
	*/
	public M setAba041(java.lang.Integer aba041) {
		set("aba041", aba041);
		return (M)this;
	}

	/**
	*获取座位号 
	*/
	public java.lang.Integer getAba041() {
		return getInt("aba041");
	}

	/**
	*设置人员ID 
	*/
	public M setAca031(java.lang.String aca031) {
		set("aca031", aca031);
		return (M)this;
	}

	/**
	*获取人员ID 
	*/
	public java.lang.String getAca031() {
		return getStr("aca031");
	}

	/**
	*设置人员类型 
	*/
	public M setAca044(java.lang.Integer aca044) {
		set("aca044", aca044);
		return (M)this;
	}

	/**
	*获取人员类型 
	*/
	public java.lang.Integer getAca044() {
		return getInt("aca044");
	}

	/**
	*设置车辆班次ID 
	*/
	public M setAca050(java.lang.Integer aca050) {
		set("aca050", aca050);
		return (M)this;
	}

	/**
	*获取车辆班次ID 
	*/
	public java.lang.Integer getAca050() {
		return getInt("aca050");
	}

	/**
	*设置日期 
	*/
	public M setAba032(java.util.Date aba032) {
		set("aba032", aba032);
		return (M)this;
	}

	/**
	*获取日期 
	*/
	public java.util.Date getAba032() {
		return get("aba032");
	}

	/**
	*设置评价星级 
	*/
	public M setAca032(java.lang.Integer aca032) {
		set("aca032", aca032);
		return (M)this;
	}

	/**
	*获取评价星级 
	*/
	public java.lang.Integer getAca032() {
		return getInt("aca032");
	}

	/**
	*设置评价类型 
	*/
	public M setAca033(java.lang.Integer aca033) {
		set("aca033", aca033);
		return (M)this;
	}

	/**
	*获取评价类型 
	*/
	public java.lang.Integer getAca033() {
		return getInt("aca033");
	}

	/**
	*设置评价备注 
	*/
	public M setAca034(java.lang.String aca034) {
		set("aca034", aca034);
		return (M)this;
	}

	/**
	*获取评价备注 
	*/
	public java.lang.String getAca034() {
		return getStr("aca034");
	}

	/**
	*设置支付状态 
	*/
	public M setAca035(java.lang.Integer aca035) {
		set("aca035", aca035);
		return (M)this;
	}

	/**
	*获取支付状态 
	*/
	public java.lang.Integer getAca035() {
		return getInt("aca035");
	}

	/**
	*设置乘坐状态 
	*/
	public M setAca036(java.lang.Integer aca036) {
		set("aca036", aca036);
		return (M)this;
	}

	/**
	*获取乘坐状态 
	*/
	public java.lang.Integer getAca036() {
		return getInt("aca036");
	}

	/**
	*设置商户订单号 
	*/
	public M setOutTradeNo(java.lang.String outTradeNo) {
		set("out_trade_no", outTradeNo);
		return (M)this;
	}

	/**
	*获取商户订单号 
	*/
	public java.lang.String getOutTradeNo() {
		return getStr("out_trade_no");
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
	*设置创建人 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取创建人 
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
