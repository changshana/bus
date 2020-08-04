package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_bd01:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryBd01<M extends BaseDormitoryBd01<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAbd001(java.lang.Integer abd001) {
		set("abd001", abd001);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAbd001() {
		return getInt("abd001");
	}

	/**
	*设置文章id 
	*/
	public M setAaa001(java.lang.Integer aaa001) {
		set("aaa001", aaa001);
		return (M)this;
	}

	/**
	*获取文章id 
	*/
	public java.lang.Integer getAaa001() {
		return getInt("aaa001");
	}

	/**
	*设置审核结果 
	*/
	public M setAbd002(java.lang.String abd002) {
		set("abd002", abd002);
		return (M)this;
	}

	/**
	*获取审核结果 
	*/
	public java.lang.String getAbd002() {
		return getStr("abd002");
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
	*设置操作类型（审核/发布=audit/publish） 
	*/
	public M setAbd003(java.lang.String abd003) {
		set("abd003", abd003);
		return (M)this;
	}

	/**
	*获取操作类型（审核/发布=audit/publish） 
	*/
	public java.lang.String getAbd003() {
		return getStr("abd003");
	}

}
