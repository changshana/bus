package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * sys_proservice:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysProservice<M extends BaseSysProservice<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setProsId(java.lang.Long prosId) {
		set("pros_id", prosId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getProsId() {
		return getLong("pros_id");
	}

	/**
	*设置 
	*/
	public M setProsName(java.lang.String prosName) {
		set("pros_name", prosName);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getProsName() {
		return getStr("pros_name");
	}

	/**
	*设置 
	*/
	public M setProsReplycount(java.lang.Long prosReplycount) {
		set("pros_replyCount", prosReplycount);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getProsReplycount() {
		return getLong("pros_replyCount");
	}

	/**
	*设置 
	*/
	public M setProsReplytime(java.lang.Long prosReplytime) {
		set("pros_replyTime", prosReplytime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getProsReplytime() {
		return getLong("pros_replyTime");
	}

	/**
	*设置 
	*/
	public M setProsTopcount(java.lang.Long prosTopcount) {
		set("pros_topCount", prosTopcount);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Long getProsTopcount() {
		return getLong("pros_topCount");
	}

}
