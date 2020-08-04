package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_rand:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentRand<M extends BaseCommentRand<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	*设置手机号码 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取手机号码 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置验证码 
	*/
	public M setRand(java.lang.String rand) {
		set("rand", rand);
		return (M)this;
	}

	/**
	*获取验证码 
	*/
	public java.lang.String getRand() {
		return getStr("rand");
	}

	/**
	*设置时间 
	*/
	public M setData(java.util.Date data) {
		set("data", data);
		return (M)this;
	}

	/**
	*获取时间 
	*/
	public java.util.Date getData() {
		return get("data");
	}

	/**
	*设置创建时间 
	*/
	public M setCreat(java.util.Date creat) {
		set("creat", creat);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreat() {
		return get("creat");
	}

}
