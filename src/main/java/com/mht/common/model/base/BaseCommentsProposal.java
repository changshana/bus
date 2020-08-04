package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comments_proposal:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentsProposal<M extends BaseCommentsProposal<M>> extends Model<M> implements IBean {

	/**
	*设置ID  
	*/
	public M setPropId(java.lang.Integer propId) {
		set("prop_id", propId);
		return (M)this;
	}

	/**
	*获取ID  
	*/
	public java.lang.Integer getPropId() {
		return getInt("prop_id");
	}

	/**
	*设置建议内容 
	*/
	public M setPropText(java.lang.String propText) {
		set("prop_text", propText);
		return (M)this;
	}

	/**
	*获取建议内容 
	*/
	public java.lang.String getPropText() {
		return getStr("prop_text");
	}

	/**
	*设置时间 
	*/
	public M setPropDate(java.util.Date propDate) {
		set("prop_date", propDate);
		return (M)this;
	}

	/**
	*获取时间 
	*/
	public java.util.Date getPropDate() {
		return get("prop_date");
	}

	/**
	*设置操作人 
	*/
	public M setAccount(java.lang.String account) {
		set("account", account);
		return (M)this;
	}

	/**
	*获取操作人 
	*/
	public java.lang.String getAccount() {
		return getStr("account");
	}

}
