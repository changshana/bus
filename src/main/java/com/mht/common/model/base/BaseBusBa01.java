package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa01<M extends BaseBusBa01<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba001(java.lang.Integer aba001) {
		set("aba001", aba001);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba001() {
		return getInt("aba001");
	}

	/**
	*设置名称 
	*/
	public M setAba002(java.lang.String aba002) {
		set("aba002", aba002);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getAba002() {
		return getStr("aba002");
	}

	/**
	*设置编号 
	*/
	public M setAba003(java.lang.String aba003) {
		set("aba003", aba003);
		return (M)this;
	}

	/**
	*获取编号 
	*/
	public java.lang.String getAba003() {
		return getStr("aba003");
	}

	/**
	*设置排序 
	*/
	public M setAaa995(java.lang.Integer aaa995) {
		set("aaa995", aaa995);
		return (M)this;
	}

	/**
	*获取排序 
	*/
	public java.lang.Integer getAaa995() {
		return getInt("aaa995");
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
	*设置路线ID 
	*/
	public M setAba030(java.lang.Integer aba030) {
		set("aba030", aba030);
		return (M)this;
	}

	/**
	*获取路线ID 
	*/
	public java.lang.Integer getAba030() {
		return getInt("aba030");
	}

	/**
	*设置站点ID 
	*/
	public M setAba070(java.lang.Integer aba070) {
		set("aba070", aba070);
		return (M)this;
	}

	/**
	*获取站点ID 
	*/
	public java.lang.Integer getAba070() {
		return getInt("aba070");
	}

}
