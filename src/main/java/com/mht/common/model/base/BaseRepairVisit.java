package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_visit:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairVisit<M extends BaseRepairVisit<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setVisitId(java.lang.Integer visitId) {
		set("visit_id", visitId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getVisitId() {
		return getInt("visit_id");
	}

	/**
	*设置编号 
	*/
	public M setVisitNumber(java.lang.Integer visitNumber) {
		set("visit_number", visitNumber);
		return (M)this;
	}

	/**
	*获取编号 
	*/
	public java.lang.Integer getVisitNumber() {
		return getInt("visit_number");
	}

	/**
	*设置报修单 
	*/
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取报修单 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
	}

	/**
	*设置备注 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置回访日期 
	*/
	public M setVisitDate(java.util.Date visitDate) {
		set("visit_date", visitDate);
		return (M)this;
	}

	/**
	*获取回访日期 
	*/
	public java.util.Date getVisitDate() {
		return get("visit_date");
	}

	/**
	*设置创建时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
