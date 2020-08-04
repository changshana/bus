package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comments_option:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentsOption<M extends BaseCommentsOption<M>> extends Model<M> implements IBean {

	/**
	*设置问卷选项ID 
	*/
	public M setOpId(java.lang.Integer opId) {
		set("op_id", opId);
		return (M)this;
	}

	/**
	*获取问卷选项ID 
	*/
	public java.lang.Integer getOpId() {
		return getInt("op_id");
	}

	/**
	*设置选项名称 
	*/
	public M setOpName(java.lang.String opName) {
		set("op_name", opName);
		return (M)this;
	}

	/**
	*获取选项名称 
	*/
	public java.lang.String getOpName() {
		return getStr("op_name");
	}

	/**
	*设置所属问卷 
	*/
	public M setInv(java.lang.Integer inv) {
		set("inv", inv);
		return (M)this;
	}

	/**
	*获取所属问卷 
	*/
	public java.lang.Integer getInv() {
		return getInt("inv");
	}

	/**
	*设置选中数 
	*/
	public M setOpLen(java.lang.Integer opLen) {
		set("op_len", opLen);
		return (M)this;
	}

	/**
	*获取选中数 
	*/
	public java.lang.Integer getOpLen() {
		return getInt("op_len");
	}

}
