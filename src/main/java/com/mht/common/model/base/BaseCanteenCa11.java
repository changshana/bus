package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca11:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa11<M extends BaseCanteenCa11<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca110(java.lang.Integer aca110) {
		set("aca110", aca110);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca110() {
		return getInt("aca110");
	}

	/**
	*设置耗材材料id 
	*/
	public M setAca012(java.lang.Integer aca012) {
		set("aca012", aca012);
		return (M)this;
	}

	/**
	*获取耗材材料id 
	*/
	public java.lang.Integer getAca012() {
		return getInt("aca012");
	}

	/**
	*设置加工品原料id 
	*/
	public M setAca013(java.lang.Integer aca013) {
		set("aca013", aca013);
		return (M)this;
	}

	/**
	*获取加工品原料id 
	*/
	public java.lang.Integer getAca013() {
		return getInt("aca013");
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
