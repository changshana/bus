package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_ca10:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenCa10<M extends BaseCanteenCa10<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca010(java.lang.Integer aca010) {
		set("aca010", aca010);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca010() {
		return getInt("aca010");
	}

	/**
	*设置入库验收id 
	*/
	public M setAba020(java.lang.Integer aba020) {
		set("aba020", aba020);
		return (M)this;
	}

	/**
	*获取入库验收id 
	*/
	public java.lang.Integer getAba020() {
		return getInt("aba020");
	}

	/**
	*设置加工耗材原料id 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取加工耗材原料id 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置加工耗材数量 
	*/
	public M setAca011(java.lang.String aca011) {
		set("aca011", aca011);
		return (M)this;
	}

	/**
	*获取加工耗材数量 
	*/
	public java.lang.String getAca011() {
		return getStr("aca011");
	}

	/**
	*设置加工耗材金额 
	*/
	public M setAca012(java.lang.String aca012) {
		set("aca012", aca012);
		return (M)this;
	}

	/**
	*获取加工耗材金额 
	*/
	public java.lang.String getAca012() {
		return getStr("aca012");
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
