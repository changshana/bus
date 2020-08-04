package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_noon_break_out_room:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryNoonBreakOutRoom<M extends BaseDormitoryNoonBreakOutRoom<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setOutId(java.lang.Integer outId) {
		set("out_id", outId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getOutId() {
		return getInt("out_id");
	}

	/**
	*设置午休铺预约信息ID 
	*/
	public M setBreakId(java.lang.Integer breakId) {
		set("break_id", breakId);
		return (M)this;
	}

	/**
	*获取午休铺预约信息ID 
	*/
	public java.lang.Integer getBreakId() {
		return getInt("break_id");
	}

	/**
	*设置退宿备注 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取退宿备注 
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
