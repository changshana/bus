package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * lostfound_aa99:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseLostfoundAa99<M extends BaseLostfoundAa99<M>> extends Model<M> implements IBean {

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
	*设置码值类型 
	*/
	public M setAaa002(java.lang.String aaa002) {
		set("aaa002", aaa002);
		return (M)this;
	}

	/**
	*获取码值类型 
	*/
	public java.lang.String getAaa002() {
		return getStr("aaa002");
	}

	/**
	*设置码值类型名称 
	*/
	public M setAaa003(java.lang.String aaa003) {
		set("aaa003", aaa003);
		return (M)this;
	}

	/**
	*获取码值类型名称 
	*/
	public java.lang.String getAaa003() {
		return getStr("aaa003");
	}

	/**
	*设置码值 
	*/
	public M setAaa004(java.lang.String aaa004) {
		set("aaa004", aaa004);
		return (M)this;
	}

	/**
	*获取码值 
	*/
	public java.lang.String getAaa004() {
		return getStr("aaa004");
	}

	/**
	*设置码值名称 
	*/
	public M setAaa005(java.lang.String aaa005) {
		set("aaa005", aaa005);
		return (M)this;
	}

	/**
	*获取码值名称 
	*/
	public java.lang.String getAaa005() {
		return getStr("aaa005");
	}

	/**
	*设置状态 
	*/
	public M setAaa996(java.lang.String aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.String getAaa996() {
		return getStr("aaa996");
	}

}
