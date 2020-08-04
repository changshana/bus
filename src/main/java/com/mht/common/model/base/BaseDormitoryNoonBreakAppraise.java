package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_noon_break_appraise:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryNoonBreakAppraise<M extends BaseDormitoryNoonBreakAppraise<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAppraiseId(java.lang.Integer appraiseId) {
		set("appraise_id", appraiseId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAppraiseId() {
		return getInt("appraise_id");
	}

	/**
	*设置午休铺信息ID 
	*/
	public M setBreakId(java.lang.Integer breakId) {
		set("break_id", breakId);
		return (M)this;
	}

	/**
	*获取午休铺信息ID 
	*/
	public java.lang.Integer getBreakId() {
		return getInt("break_id");
	}

	/**
	*设置评价来源 
	*/
	public M setSource(java.lang.Integer source) {
		set("source", source);
		return (M)this;
	}

	/**
	*获取评价来源 
	*/
	public java.lang.Integer getSource() {
		return getInt("source");
	}

	/**
	*设置满意度 
	*/
	public M setSatisfyDegree(java.lang.String satisfyDegree) {
		set("satisfy_degree", satisfyDegree);
		return (M)this;
	}

	/**
	*获取满意度 
	*/
	public java.lang.String getSatisfyDegree() {
		return getStr("satisfy_degree");
	}

	/**
	*设置评价内容 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取评价内容 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
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

}
