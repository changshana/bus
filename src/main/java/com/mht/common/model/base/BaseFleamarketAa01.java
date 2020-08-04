package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * fleamarket_aa01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseFleamarketAa01<M extends BaseFleamarketAa01<M>> extends Model<M> implements IBean {

	/**
	*设置商品id 
	*/
	public M setAaa001(java.lang.Integer aaa001) {
		set("aaa001", aaa001);
		return (M)this;
	}

	/**
	*获取商品id 
	*/
	public java.lang.Integer getAaa001() {
		return getInt("aaa001");
	}

	/**
	*设置商品信息 
	*/
	public M setAaa002(java.lang.String aaa002) {
		set("aaa002", aaa002);
		return (M)this;
	}

	/**
	*获取商品信息 
	*/
	public java.lang.String getAaa002() {
		return getStr("aaa002");
	}

	/**
	*设置商品类别 
	*/
	public M setAaa003(java.lang.String aaa003) {
		set("aaa003", aaa003);
		return (M)this;
	}

	/**
	*获取商品类别 
	*/
	public java.lang.String getAaa003() {
		return getStr("aaa003");
	}

	/**
	*设置卖家手机号 
	*/
	public M setAaa004(java.lang.String aaa004) {
		set("aaa004", aaa004);
		return (M)this;
	}

	/**
	*获取卖家手机号 
	*/
	public java.lang.String getAaa004() {
		return getStr("aaa004");
	}

	/**
	*设置卖家姓名 
	*/
	public M setAaa005(java.lang.String aaa005) {
		set("aaa005", aaa005);
		return (M)this;
	}

	/**
	*获取卖家姓名 
	*/
	public java.lang.String getAaa005() {
		return getStr("aaa005");
	}

	/**
	*设置卖家出货地址 
	*/
	public M setAaa006(java.lang.String aaa006) {
		set("aaa006", aaa006);
		return (M)this;
	}

	/**
	*获取卖家出货地址 
	*/
	public java.lang.String getAaa006() {
		return getStr("aaa006");
	}

	/**
	*设置商品价格 
	*/
	public M setAaa007(java.lang.String aaa007) {
		set("aaa007", aaa007);
		return (M)this;
	}

	/**
	*获取商品价格 
	*/
	public java.lang.String getAaa007() {
		return getStr("aaa007");
	}

	/**
	*设置点击量（移动端） 
	*/
	public M setAaa008(java.lang.Integer aaa008) {
		set("aaa008", aaa008);
		return (M)this;
	}

	/**
	*获取点击量（移动端） 
	*/
	public java.lang.Integer getAaa008() {
		return getInt("aaa008");
	}

	/**
	*设置点击量（网页端） 
	*/
	public M setAaa009(java.lang.Integer aaa009) {
		set("aaa009", aaa009);
		return (M)this;
	}

	/**
	*获取点击量（网页端） 
	*/
	public java.lang.Integer getAaa009() {
		return getInt("aaa009");
	}

	/**
	*设置交易状态（1交易中，2交易成功，3交易关闭） 
	*/
	public M setAaa010(java.lang.String aaa010) {
		set("aaa010", aaa010);
		return (M)this;
	}

	/**
	*获取交易状态（1交易中，2交易成功，3交易关闭） 
	*/
	public java.lang.String getAaa010() {
		return getStr("aaa010");
	}

	/**
	*设置状态（0删除，1保留） 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取状态（0删除，1保留） 
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
	*设置商品标题 
	*/
	public M setAaa011(java.lang.String aaa011) {
		set("aaa011", aaa011);
		return (M)this;
	}

	/**
	*获取商品标题 
	*/
	public java.lang.String getAaa011() {
		return getStr("aaa011");
	}

	/**
	*设置校区 
	*/
	public M setAaa012(java.lang.Integer aaa012) {
		set("aaa012", aaa012);
		return (M)this;
	}

	/**
	*获取校区 
	*/
	public java.lang.Integer getAaa012() {
		return getInt("aaa012");
	}

	/**
	*设置微信openid 
	*/
	public M setAca042(java.lang.String aca042) {
		set("aca042", aca042);
		return (M)this;
	}

	/**
	*获取微信openid 
	*/
	public java.lang.String getAca042() {
		return getStr("aca042");
	}

}
