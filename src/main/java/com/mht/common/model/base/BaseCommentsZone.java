package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comments_zone:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentsZone<M extends BaseCommentsZone<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCommId(java.lang.Integer commId) {
		set("comm_id", commId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCommId() {
		return getInt("comm_id");
	}

	/**
	*设置中心名称 
	*/
	public M setCommName(java.lang.String commName) {
		set("comm_name", commName);
		return (M)this;
	}

	/**
	*获取中心名称 
	*/
	public java.lang.String getCommName() {
		return getStr("comm_name");
	}

	/**
	*设置回复时长 
	*/
	public M setCommReplyTime(java.lang.Integer commReplyTime) {
		set("comm_reply_time", commReplyTime);
		return (M)this;
	}

	/**
	*获取回复时长 
	*/
	public java.lang.Integer getCommReplyTime() {
		return getInt("comm_reply_time");
	}

	/**
	*设置点赞数 
	*/
	public M setCommTopCount(java.lang.Integer commTopCount) {
		set("comm_top_count", commTopCount);
		return (M)this;
	}

	/**
	*获取点赞数 
	*/
	public java.lang.Integer getCommTopCount() {
		return getInt("comm_top_count");
	}

}
