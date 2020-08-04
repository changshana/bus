package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_tp02:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenTp02<M extends BaseCanteenTp02<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setApt020(java.lang.Integer apt020) {
		set("apt020", apt020);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getApt020() {
		return getInt("apt020");
	}

	/**
	*设置原料基础ID 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取原料基础ID 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置预留字段 
	*/
	public M setAba002(java.lang.String aba002) {
		set("aba002", aba002);
		return (M)this;
	}

	/**
	*获取预留字段 
	*/
	public java.lang.String getAba002() {
		return getStr("aba002");
	}

	/**
	*设置供应价 
	*/
	public M setAba003(java.lang.Double aba003) {
		set("aba003", aba003);
		return (M)this;
	}

	/**
	*获取供应价 
	*/
	public java.lang.Double getAba003() {
		return getDouble("aba003");
	}

	/**
	*设置采购价 
	*/
	public M setAba004(java.lang.Double aba004) {
		set("aba004", aba004);
		return (M)this;
	}

	/**
	*获取采购价 
	*/
	public java.lang.Double getAba004() {
		return getDouble("aba004");
	}

	/**
	*设置差价 
	*/
	public M setAba005(java.lang.Double aba005) {
		set("aba005", aba005);
		return (M)this;
	}

	/**
	*获取差价 
	*/
	public java.lang.Double getAba005() {
		return getDouble("aba005");
	}

	/**
	*设置批次号 
	*/
	public M setAaa995(java.lang.String aaa995) {
		set("aaa995", aaa995);
		return (M)this;
	}

	/**
	*获取批次号 
	*/
	public java.lang.String getAaa995() {
		return getStr("aaa995");
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
	*设置生效日期 
	*/
	public M setAba006(java.util.Date aba006) {
		set("aba006", aba006);
		return (M)this;
	}

	/**
	*获取生效日期 
	*/
	public java.util.Date getAba006() {
		return get("aba006");
	}

	/**
	*设置失效日期 
	*/
	public M setAba007(java.util.Date aba007) {
		set("aba007", aba007);
		return (M)this;
	}

	/**
	*获取失效日期 
	*/
	public java.util.Date getAba007() {
		return get("aba007");
	}

	/**
	*设置采购供应商 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取采购供应商 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

}
