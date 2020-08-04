package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * car_info_pass:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCarInfoPass<M extends BaseCarInfoPass<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setInfoPassId(java.lang.Integer infoPassId) {
		set("info_pass_id", infoPassId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getInfoPassId() {
		return getInt("info_pass_id");
	}

	/**
	*设置方向Id 
	*/
	public M setRouteId(java.lang.Integer routeId) {
		set("route_id", routeId);
		return (M)this;
	}

	/**
	*获取方向Id 
	*/
	public java.lang.Integer getRouteId() {
		return getInt("route_id");
	}

	/**
	*设置车辆Id 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取车辆Id 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
	}

}
