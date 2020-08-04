package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_bills:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairBills<M extends BaseRepairBills<M>> extends Model<M> implements IBean {

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

	/**
	*设置 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	*设置 
	*/
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	*设置 
	*/
	public M setZoneId(java.lang.Integer zoneId) {
		set("zone_id", zoneId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getZoneId() {
		return getInt("zone_id");
	}

	/**
	*设置 
	*/
	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getAddress() {
		return getStr("address");
	}

	/**
	*设置 
	*/
	public M setItemId(java.lang.Integer itemId) {
		set("item_id", itemId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getItemId() {
		return getInt("item_id");
	}

	/**
	*设置 
	*/
	public M setDescribe(java.lang.String describe) {
		set("describe", describe);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getDescribe() {
		return getStr("describe");
	}

	/**
	*设置 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
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
	public M setYear(java.lang.String year) {
		set("year", year);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getYear() {
		return getStr("year");
	}

	/**
	*设置 
	*/
	public M setAreaId(java.lang.Integer areaId) {
		set("area_id", areaId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getAreaId() {
		return getInt("area_id");
	}

	/**
	*设置 
	*/
	public M setBillsCode(java.lang.String billsCode) {
		set("bills_code", billsCode);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getBillsCode() {
		return getStr("bills_code");
	}

	/**
	*设置 
	*/
	public M setTypeId(java.lang.Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTypeId() {
		return getInt("type_id");
	}

	/**
	*设置 
	*/
	public M setVisitId(java.lang.Integer visitId) {
		set("visit_id", visitId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getVisitId() {
		return getInt("visit_id");
	}

	/**
	*设置 
	*/
	public M setEvaluateId(java.lang.Integer evaluateId) {
		set("evaluate_id", evaluateId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getEvaluateId() {
		return getInt("evaluate_id");
	}

	/**
	*设置 
	*/
	public M setOnDutyTime(java.lang.Integer onDutyTime) {
		set("on_duty_time", onDutyTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getOnDutyTime() {
		return getInt("on_duty_time");
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
	public M setClientType(java.lang.Integer clientType) {
		set("client_type", clientType);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getClientType() {
		return getInt("client_type");
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
	public M setServer(java.lang.String server) {
		set("server", server);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getServer() {
		return getStr("server");
	}

}
