package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * car_info_person:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCarInfoPerson<M extends BaseCarInfoPerson<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setRoutePersonId(java.lang.Integer routePersonId) {
		set("route_person_id", routePersonId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getRoutePersonId() {
		return getInt("route_person_id");
	}

	/**
	*设置驾驶员Id 
	*/
	public M setPersonId(java.lang.Integer personId) {
		set("person_id", personId);
		return (M)this;
	}

	/**
	*获取驾驶员Id 
	*/
	public java.lang.Integer getPersonId() {
		return getInt("person_id");
	}

	/**
	*设置车辆ID 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取车辆ID 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
	}

}
