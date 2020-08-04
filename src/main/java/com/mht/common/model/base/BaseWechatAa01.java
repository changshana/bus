package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * wechat_aa01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWechatAa01<M extends BaseWechatAa01<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAaa010(java.lang.Integer aaa010) {
		set("aaa010", aaa010);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAaa010() {
		return getInt("aaa010");
	}

	/**
	*设置分类名称 
	*/
	public M setAaa011(java.lang.String aaa011) {
		set("aaa011", aaa011);
		return (M)this;
	}

	/**
	*获取分类名称 
	*/
	public java.lang.String getAaa011() {
		return getStr("aaa011");
	}

	/**
	*设置parent_id 
	*/
	public M setAaa012(java.lang.Integer aaa012) {
		set("aaa012", aaa012);
		return (M)this;
	}

	/**
	*获取parent_id 
	*/
	public java.lang.Integer getAaa012() {
		return getInt("aaa012");
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

}
