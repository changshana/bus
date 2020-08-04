package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ba02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenBa02<M extends BaseCanteenBa02<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
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
	*设置需求计划汇总id 
	*/
	public M setAca020(java.lang.Integer aca020) {
		set("aca020", aca020);
		return (M)this;
	}

	/**
	*获取需求计划汇总id 
	*/
	public java.lang.Integer getAca020() {
		return getInt("aca020");
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
	*设置生产日期 
	*/
	public M setAba021(java.util.Date aba021) {
		set("aba021", aba021);
		return (M)this;
	}

	/**
	*获取生产日期 
	*/
	public java.util.Date getAba021() {
		return get("aba021");
	}

	/**
	*设置保质天数 
	*/
	public M setAba022(java.lang.Integer aba022) {
		set("aba022", aba022);
		return (M)this;
	}

	/**
	*获取保质天数 
	*/
	public java.lang.Integer getAba022() {
		return getInt("aba022");
	}

	/**
	*设置包装费 
	*/
	public M setAba023(java.math.BigDecimal aba023) {
		set("aba023", aba023);
		return (M)this;
	}

	/**
	*获取包装费 
	*/
	public java.math.BigDecimal getAba023() {
		return get("aba023");
	}

	/**
	*设置入库数量 
	*/
	public M setAba024(java.lang.String aba024) {
		set("aba024", aba024);
		return (M)this;
	}

	/**
	*获取入库数量 
	*/
	public java.lang.String getAba024() {
		return getStr("aba024");
	}

	/**
	*设置损耗费 
	*/
	public M setAba025(java.math.BigDecimal aba025) {
		set("aba025", aba025);
		return (M)this;
	}

	/**
	*获取损耗费 
	*/
	public java.math.BigDecimal getAba025() {
		return get("aba025");
	}

	/**
	*设置损耗量 
	*/
	public M setAba026(java.lang.Integer aba026) {
		set("aba026", aba026);
		return (M)this;
	}

	/**
	*获取损耗量 
	*/
	public java.lang.Integer getAba026() {
		return getInt("aba026");
	}

	/**
	*设置成本价 
	*/
	public M setAba027(java.math.BigDecimal aba027) {
		set("aba027", aba027);
		return (M)this;
	}

	/**
	*获取成本价 
	*/
	public java.math.BigDecimal getAba027() {
		return get("aba027");
	}

	/**
	*设置采购价 
	*/
	public M setAba028(java.math.BigDecimal aba028) {
		set("aba028", aba028);
		return (M)this;
	}

	/**
	*获取采购价 
	*/
	public java.math.BigDecimal getAba028() {
		return get("aba028");
	}

	/**
	*设置单据号 
	*/
	public M setAba029(java.lang.String aba029) {
		set("aba029", aba029);
		return (M)this;
	}

	/**
	*获取单据号 
	*/
	public java.lang.String getAba029() {
		return getStr("aba029");
	}

	/**
	*设置采购类型 
	*/
	public M setAba030(java.lang.Integer aba030) {
		set("aba030", aba030);
		return (M)this;
	}

	/**
	*获取采购类型 
	*/
	public java.lang.Integer getAba030() {
		return getInt("aba030");
	}

	/**
	*设置验收是否合格(1-合格，0-不合格) 
	*/
	public M setAba031(java.lang.Integer aba031) {
		set("aba031", aba031);
		return (M)this;
	}

	/**
	*获取验收是否合格(1-合格，0-不合格) 
	*/
	public java.lang.Integer getAba031() {
		return getInt("aba031");
	}

	/**
	*设置退货状态，(1，已退货) 
	*/
	public M setAba032(java.lang.String aba032) {
		set("aba032", aba032);
		return (M)this;
	}

	/**
	*获取退货状态，(1，已退货) 
	*/
	public java.lang.String getAba032() {
		return getStr("aba032");
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
	*设置 
	*/
	public M setAba033(java.util.Date aba033) {
		set("aba033", aba033);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getAba033() {
		return get("aba033");
	}

	/**
	*设置供应商id 
	*/
	public M setAaa010(java.lang.Integer aaa010) {
		set("aaa010", aaa010);
		return (M)this;
	}

	/**
	*获取供应商id 
	*/
	public java.lang.Integer getAaa010() {
		return getInt("aaa010");
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
	*设置1;直供；2：入中心库 
	*/
	public M setFlag(java.lang.String flag) {
		set("flag", flag);
		return (M)this;
	}

	/**
	*获取1;直供；2：入中心库 
	*/
	public java.lang.String getFlag() {
		return getStr("flag");
	}

}
