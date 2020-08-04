package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * zone_out_extend:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseZoneOutExtend<M extends BaseZoneOutExtend<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setZoneOutExtendId(java.lang.Integer zoneOutExtendId) {
		set("zone_out_extend_id", zoneOutExtendId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getZoneOutExtendId() {
		return getInt("zone_out_extend_id");
	}

	/**
	*设置状态 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置操作人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取操作人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置操作时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取操作时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置拒绝理由 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取拒绝理由 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置出库详情 
	*/
	public M setOutDetailsId(java.lang.Integer outDetailsId) {
		set("out_details_id", outDetailsId);
		return (M)this;
	}

	/**
	*获取出库详情 
	*/
	public java.lang.Integer getOutDetailsId() {
		return getInt("out_details_id");
	}

}
