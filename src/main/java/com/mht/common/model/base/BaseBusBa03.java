package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_ba03:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusBa03<M extends BaseBusBa03<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAba030(java.lang.Integer aba030) {
		set("aba030", aba030);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAba030() {
		return getInt("aba030");
	}

	/**
	*设置校车类型(码表中为aba060字段) 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取校车类型(码表中为aba060字段) 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
	}

	/**
	*设置时间类型 
	*/
	public M setAba003(java.lang.String aba003) {
		set("aba003", aba003);
		return (M)this;
	}

	/**
	*获取时间类型 
	*/
	public java.lang.String getAba003() {
		return getStr("aba003");
	}

	/**
	*设置起点ID 
	*/
	public M setAba007(java.lang.Integer aba007) {
		set("aba007", aba007);
		return (M)this;
	}

	/**
	*获取起点ID 
	*/
	public java.lang.Integer getAba007() {
		return getInt("aba007");
	}

	/**
	*设置终点ID 
	*/
	public M setAba008(java.lang.Integer aba008) {
		set("aba008", aba008);
		return (M)this;
	}

	/**
	*获取终点ID 
	*/
	public java.lang.Integer getAba008() {
		return getInt("aba008");
	}

	/**
	*设置学生是否可预约 
	*/
	public M setAca052(java.lang.Integer aca052) {
		set("aca052", aca052);
		return (M)this;
	}

	/**
	*获取学生是否可预约 
	*/
	public java.lang.Integer getAca052() {
		return getInt("aca052");
	}

	/**
	*设置教师是否可预约 
	*/
	public M setAca053(java.lang.Integer aca053) {
		set("aca053", aca053);
		return (M)this;
	}

	/**
	*获取教师是否可预约 
	*/
	public java.lang.Integer getAca053() {
		return getInt("aca053");
	}

	/**
	*设置途经点 
	*/
	public M setAba031(java.lang.String aba031) {
		set("aba031", aba031);
		return (M)this;
	}

	/**
	*获取途经点 
	*/
	public java.lang.String getAba031() {
		return getStr("aba031");
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

}
