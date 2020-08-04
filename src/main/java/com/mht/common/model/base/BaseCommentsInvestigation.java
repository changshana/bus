package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comments_investigation:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentsInvestigation<M extends BaseCommentsInvestigation<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setInvId(java.lang.Integer invId) {
		set("inv_id", invId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getInvId() {
		return getInt("inv_id");
	}

	/**
	*设置问卷问题 
	*/
	public M setInvQuestion(java.lang.String invQuestion) {
		set("inv_question", invQuestion);
		return (M)this;
	}

	/**
	*获取问卷问题 
	*/
	public java.lang.String getInvQuestion() {
		return getStr("inv_question");
	}

	/**
	*设置问卷类型 
	*/
	public M setInvType(java.lang.Integer invType) {
		set("inv_type", invType);
		return (M)this;
	}

	/**
	*获取问卷类型 
	*/
	public java.lang.Integer getInvType() {
		return getInt("inv_type");
	}

	/**
	*设置选中数 
	*/
	public M setInvLen(java.lang.Integer invLen) {
		set("inv_len", invLen);
		return (M)this;
	}

	/**
	*获取选中数 
	*/
	public java.lang.Integer getInvLen() {
		return getInt("inv_len");
	}

}
