package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_start:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairStart<M extends BaseRepairStart<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setStartId(java.lang.Integer startId) {
		set("start_id", startId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStartId() {
		return getInt("start_id");
	}

	/**
	*设置 
	*/
	public M setEstimateArriveTime(java.util.Date estimateArriveTime) {
		set("estimate_arrive_time", estimateArriveTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getEstimateArriveTime() {
		return get("estimate_arrive_time");
	}

	/**
	*设置 
	*/
	public M setPracticalArriveTime(java.util.Date practicalArriveTime) {
		set("practical_arrive_time", practicalArriveTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getPracticalArriveTime() {
		return get("practical_arrive_time");
	}

	/**
	*设置 
	*/
	public M setEstimateCompleteTime(java.util.Date estimateCompleteTime) {
		set("estimate_complete_time", estimateCompleteTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getEstimateCompleteTime() {
		return get("estimate_complete_time");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置 
	*/
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
	}

}
