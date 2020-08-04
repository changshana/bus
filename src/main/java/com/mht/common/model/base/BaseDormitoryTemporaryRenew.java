package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_temporary_renew:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryTemporaryRenew<M extends BaseDormitoryTemporaryRenew<M>> extends Model<M> implements IBean {

	/**
	*设置临客续费id 
	*/
	public M setRenewId(java.lang.Integer renewId) {
		set("renew_id", renewId);
		return (M)this;
	}

	/**
	*获取临客续费id 
	*/
	public java.lang.Integer getRenewId() {
		return getInt("renew_id");
	}

	/**
	*设置临客信息id 
	*/
	public M setTemporaryId(java.lang.Integer temporaryId) {
		set("temporary_id", temporaryId);
		return (M)this;
	}

	/**
	*获取临客信息id 
	*/
	public java.lang.Integer getTemporaryId() {
		return getInt("temporary_id");
	}

	/**
	*设置续住时长 
	*/
	public M setDays(java.lang.Integer days) {
		set("days", days);
		return (M)this;
	}

	/**
	*获取续住时长 
	*/
	public java.lang.Integer getDays() {
		return getInt("days");
	}

	/**
	*设置续费金额 
	*/
	public M setCharge(java.lang.Integer charge) {
		set("charge", charge);
		return (M)this;
	}

	/**
	*获取续费金额 
	*/
	public java.lang.Integer getCharge() {
		return getInt("charge");
	}

	/**
	*设置创建日期 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

}
