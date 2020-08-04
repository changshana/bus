package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_health_evaluation_tower:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryHealthEvaluationTower<M extends BaseDormitoryHealthEvaluationTower<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	*设置ID 
	*/
	public M setTowerId(java.lang.Integer towerId) {
		set("tower_id", towerId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTowerId() {
		return getInt("tower_id");
	}

	/**
	*设置楼宇名称 
	*/
	public M setTowerName(java.lang.String towerName) {
		set("tower_name", towerName);
		return (M)this;
	}

	/**
	*获取楼宇名称 
	*/
	public java.lang.String getTowerName() {
		return getStr("tower_name");
	}

	/**
	*设置校区ID 
	*/
	public M setSiteId(java.lang.Integer siteId) {
		set("site_id", siteId);
		return (M)this;
	}

	/**
	*获取校区ID 
	*/
	public java.lang.Integer getSiteId() {
		return getInt("site_id");
	}

}
