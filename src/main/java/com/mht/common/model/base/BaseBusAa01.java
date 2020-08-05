package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_aa01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusAa01<M extends BaseBusAa01<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa001(java.lang.Integer aaa001) {
		set("aaa001", aaa001);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa001() {
		return getInt("aaa001");
	}

	/**
	*设置名称 
	*/
	public M setAaa002(java.lang.String aaa002) {
		set("aaa002", aaa002);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getAaa002() {
		return getStr("aaa002");
	}

	/**
	*设置编号 
	*/
	public M setAaa003(java.lang.String aaa003) {
		set("aaa003", aaa003);
		return (M)this;
	}

	/**
	*获取编号 
	*/
	public java.lang.String getAaa003() {
		return getStr("aaa003");
	}

	/**
	*设置品牌 
	*/
	public M setAaa004(java.lang.String aaa004) {
		set("aaa004", aaa004);
		return (M)this;
	}

	/**
	*获取品牌 
	*/
	public java.lang.String getAaa004() {
		return getStr("aaa004");
	}

	/**
	*设置车牌 
	*/
	public M setAaa005(java.lang.String aaa005) {
		set("aaa005", aaa005);
		return (M)this;
	}

	/**
	*获取车牌 
	*/
	public java.lang.String getAaa005() {
		return getStr("aaa005");
	}

	/**
	*设置生产厂商 
	*/
	public M setAaa006(java.lang.String aaa006) {
		set("aaa006", aaa006);
		return (M)this;
	}

	/**
	*获取生产厂商 
	*/
	public java.lang.String getAaa006() {
		return getStr("aaa006");
	}

	/**
	*设置车辆座次类型 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取车辆座次类型 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
	}

	/**
	*设置核载人数 
	*/
	public M setAaa007(java.lang.String aaa007) {
		set("aaa007", aaa007);
		return (M)this;
	}

	/**
	*获取核载人数 
	*/
	public java.lang.String getAaa007() {
		return getStr("aaa007");
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
	*设置车辆类型 
	*/
	public M setAba060(java.lang.Integer aba060) {
		set("aba060", aba060);
		return (M)this;
	}

	/**
	*获取车辆类型 
	*/
	public java.lang.Integer getAba060() {
		return getInt("aba060");
	}

	/**
	*设置公车预约与之前车辆的区分，1为之前的，2为公车 
	*/
	public M setAaa008(java.lang.Long aaa008) {
		set("aaa008", aaa008);
		return (M)this;
	}

	/**
	*获取公车预约与之前车辆的区分，1为之前的，2为公车 
	*/
	public java.lang.Long getAaa008() {
		return getLong("aaa008");
	}

	/**
	*设置车辆图片地址 
	*/
	public M setAaa009(java.lang.String aaa009) {
		set("aaa009", aaa009);
		return (M)this;
	}

	/**
	*获取车辆图片地址 
	*/
	public java.lang.String getAaa009() {
		return getStr("aaa009");
	}

	/**
	*设置车辆每公里的单价（暂定） 
	*/
	public M setAza001(java.math.BigDecimal aza001) {
		set("aza001", aza001);
		return (M)this;
	}

	/**
	*获取车辆每公里的单价（暂定） 
	*/
	public java.math.BigDecimal getAza001() {
		return get("aza001");
	}

	/**
	*设置开此车需要的驾驶证级别 
	*/
	public M setAza002(java.lang.String aza002) {
		set("aza002", aza002);
		return (M)this;
	}

	/**
	*获取开此车需要的驾驶证级别 
	*/
	public java.lang.String getAza002() {
		return getStr("aza002");
	}

}
