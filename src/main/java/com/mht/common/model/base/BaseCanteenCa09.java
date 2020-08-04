package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca09:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa09<M extends BaseCanteenCa09<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca090(java.lang.Integer aca090) {
		set("aca090", aca090);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca090() {
		return getInt("aca090");
	}

	/**
	*设置退货申请表id 
	*/
	public M setAca080(java.lang.Integer aca080) {
		set("aca080", aca080);
		return (M)this;
	}

	/**
	*获取退货申请表id 
	*/
	public java.lang.Integer getAca080() {
		return getInt("aca080");
	}

	/**
	*设置出库记录id 
	*/
	public M setAca060(java.lang.Integer aca060) {
		set("aca060", aca060);
		return (M)this;
	}

	/**
	*获取出库记录id 
	*/
	public java.lang.Integer getAca060() {
		return getInt("aca060");
	}

	/**
	*设置退货数量 
	*/
	public M setAca091(java.lang.String aca091) {
		set("aca091", aca091);
		return (M)this;
	}

	/**
	*获取退货数量 
	*/
	public java.lang.String getAca091() {
		return getStr("aca091");
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
