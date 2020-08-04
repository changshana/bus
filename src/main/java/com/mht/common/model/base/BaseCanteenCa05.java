package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca05:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa05<M extends BaseCanteenCa05<M>> extends Model<M> implements IBean {

	/**
	*设置入库记录ID 
	*/
	public M setAca050(java.lang.Integer aca050) {
		set("aca050", aca050);
		return (M)this;
	}

	/**
	*获取入库记录ID 
	*/
	public java.lang.Integer getAca050() {
		return getInt("aca050");
	}

	/**
	*设置入库验收记录表 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取入库验收记录表 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
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
	*设置是否合格 
	*/
	public M setAca051(java.lang.Integer aca051) {
		set("aca051", aca051);
		return (M)this;
	}

	/**
	*获取是否合格 
	*/
	public java.lang.Integer getAca051() {
		return getInt("aca051");
	}

	/**
	*设置入库数量 
	*/
	public M setAca052(java.lang.String aca052) {
		set("aca052", aca052);
		return (M)this;
	}

	/**
	*获取入库数量 
	*/
	public java.lang.String getAca052() {
		return getStr("aca052");
	}

	/**
	*设置采购价 
	*/
	public M setAca053(java.math.BigDecimal aca053) {
		set("aca053", aca053);
		return (M)this;
	}

	/**
	*获取采购价 
	*/
	public java.math.BigDecimal getAca053() {
		return get("aca053");
	}

	/**
	*设置单据号 
	*/
	public M setAca054(java.lang.String aca054) {
		set("aca054", aca054);
		return (M)this;
	}

	/**
	*获取单据号 
	*/
	public java.lang.String getAca054() {
		return getStr("aca054");
	}

	/**
	*设置审核状态 
	*/
	public M setAca055(java.lang.Integer aca055) {
		set("aca055", aca055);
		return (M)this;
	}

	/**
	*获取审核状态 
	*/
	public java.lang.Integer getAca055() {
		return getInt("aca055");
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
