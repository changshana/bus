package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * canteen_aa05:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCanteenAa05<M extends BaseCanteenAa05<M>> extends Model<M> implements IBean {

	/**
	*设置菜谱成分ID 
	*/
	public M setAaa050(java.lang.Integer aaa050) {
		set("aaa050", aaa050);
		return (M)this;
	}

	/**
	*获取菜谱成分ID 
	*/
	public java.lang.Integer getAaa050() {
		return getInt("aaa050");
	}

	/**
	*设置菜谱信息ID 
	*/
	public M setAaa040(java.lang.Integer aaa040) {
		set("aaa040", aaa040);
		return (M)this;
	}

	/**
	*获取菜谱信息ID 
	*/
	public java.lang.Integer getAaa040() {
		return getInt("aaa040");
	}

	/**
	*设置原料ID 
	*/
	public M setAaa030(java.lang.Integer aaa030) {
		set("aaa030", aaa030);
		return (M)this;
	}

	/**
	*获取原料ID 
	*/
	public java.lang.Integer getAaa030() {
		return getInt("aaa030");
	}

	/**
	*设置原料数量 
	*/
	public M setAaa051(java.lang.String aaa051) {
		set("aaa051", aaa051);
		return (M)this;
	}

	/**
	*获取原料数量 
	*/
	public java.lang.String getAaa051() {
		return getStr("aaa051");
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
	*设置单位 
	*/
	public M setAaa052(java.lang.String aaa052) {
		set("aaa052", aaa052);
		return (M)this;
	}

	/**
	*获取单位 
	*/
	public java.lang.String getAaa052() {
		return getStr("aaa052");
	}

}
