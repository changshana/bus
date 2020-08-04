package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * bus_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBusInfo<M extends BaseBusInfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
	}

	/**
	*设置方向 
	*/
	public M setDirectionId(java.lang.Integer directionId) {
		set("direction_id", directionId);
		return (M)this;
	}

	/**
	*获取方向 
	*/
	public java.lang.Integer getDirectionId() {
		return getInt("direction_id");
	}

	/**
	*设置大类 
	*/
	public M setType1(java.lang.String type1) {
		set("type1", type1);
		return (M)this;
	}

	/**
	*获取大类 
	*/
	public java.lang.String getType1() {
		return getStr("type1");
	}

	/**
	*设置时段 
	*/
	public M setType2(java.lang.String type2) {
		set("type2", type2);
		return (M)this;
	}

	/**
	*获取时段 
	*/
	public java.lang.String getType2() {
		return getStr("type2");
	}

	/**
	*设置发车时间 
	*/
	public M setDepartureTime(java.lang.String departureTime) {
		set("departure_time", departureTime);
		return (M)this;
	}

	/**
	*获取发车时间 
	*/
	public java.lang.String getDepartureTime() {
		return getStr("departure_time");
	}

	/**
	*设置到达时间 
	*/
	public M setArriveTime(java.lang.String arriveTime) {
		set("arrive_time", arriveTime);
		return (M)this;
	}

	/**
	*获取到达时间 
	*/
	public java.lang.String getArriveTime() {
		return getStr("arrive_time");
	}

	/**
	*设置起点 
	*/
	public M setDeparturePoint(java.lang.String departurePoint) {
		set("departure_point", departurePoint);
		return (M)this;
	}

	/**
	*获取起点 
	*/
	public java.lang.String getDeparturePoint() {
		return getStr("departure_point");
	}

	/**
	*设置终点 
	*/
	public M setArrivePoint(java.lang.String arrivePoint) {
		set("arrive_point", arrivePoint);
		return (M)this;
	}

	/**
	*获取终点 
	*/
	public java.lang.String getArrivePoint() {
		return getStr("arrive_point");
	}

	/**
	*设置起点经纬度 
	*/
	public M setDepartureLocation(java.lang.String departureLocation) {
		set("departure_location", departureLocation);
		return (M)this;
	}

	/**
	*获取起点经纬度 
	*/
	public java.lang.String getDepartureLocation() {
		return getStr("departure_location");
	}

	/**
	*设置终点经纬度 
	*/
	public M setArriveLocation(java.lang.String arriveLocation) {
		set("arrive_location", arriveLocation);
		return (M)this;
	}

	/**
	*获取终点经纬度 
	*/
	public java.lang.String getArriveLocation() {
		return getStr("arrive_location");
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
	*设置排序 
	*/
	public M setOrderIndex(java.lang.Integer orderIndex) {
		set("order_index", orderIndex);
		return (M)this;
	}

	/**
	*获取排序 
	*/
	public java.lang.Integer getOrderIndex() {
		return getInt("order_index");
	}

}
