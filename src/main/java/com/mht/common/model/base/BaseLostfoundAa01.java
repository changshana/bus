package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * lostfound_aa01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseLostfoundAa01<M extends BaseLostfoundAa01<M>> extends Model<M> implements IBean {

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
	*设置标题 
	*/
	public M setAaa002(java.lang.String aaa002) {
		set("aaa002", aaa002);
		return (M)this;
	}

	/**
	*获取标题 
	*/
	public java.lang.String getAaa002() {
		return getStr("aaa002");
	}

	/**
	*设置物品描述 
	*/
	public M setAaa003(java.lang.String aaa003) {
		set("aaa003", aaa003);
		return (M)this;
	}

	/**
	*获取物品描述 
	*/
	public java.lang.String getAaa003() {
		return getStr("aaa003");
	}

	/**
	*设置联系人 
	*/
	public M setAaa004(java.lang.String aaa004) {
		set("aaa004", aaa004);
		return (M)this;
	}

	/**
	*获取联系人 
	*/
	public java.lang.String getAaa004() {
		return getStr("aaa004");
	}

	/**
	*设置 
	*/
	public M setAaa005(java.lang.String aaa005) {
		set("aaa005", aaa005);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAaa005() {
		return getStr("aaa005");
	}

	/**
	*设置校区 
	*/
	public M setAaa006(java.lang.Integer aaa006) {
		set("aaa006", aaa006);
		return (M)this;
	}

	/**
	*获取校区 
	*/
	public java.lang.Integer getAaa006() {
		return getInt("aaa006");
	}

	/**
	*设置数据来源 
	*/
	public M setAaa007(java.lang.Integer aaa007) {
		set("aaa007", aaa007);
		return (M)this;
	}

	/**
	*获取数据来源 
	*/
	public java.lang.Integer getAaa007() {
		return getInt("aaa007");
	}

	/**
	*设置物品状态 
	*/
	public M setAaa008(java.lang.Integer aaa008) {
		set("aaa008", aaa008);
		return (M)this;
	}

	/**
	*获取物品状态 
	*/
	public java.lang.Integer getAaa008() {
		return getInt("aaa008");
	}

	/**
	*设置拾得日期 
	*/
	public M setAaa009(java.util.Date aaa009) {
		set("aaa009", aaa009);
		return (M)this;
	}

	/**
	*获取拾得日期 
	*/
	public java.util.Date getAaa009() {
		return get("aaa009");
	}

	/**
	*设置领取地址 
	*/
	public M setAaa010(java.lang.String aaa010) {
		set("aaa010", aaa010);
		return (M)this;
	}

	/**
	*获取领取地址 
	*/
	public java.lang.String getAaa010() {
		return getStr("aaa010");
	}

	/**
	*设置数据状态 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取数据状态 
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

}
