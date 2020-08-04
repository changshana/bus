package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_health_evaluation_setting:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryHealthEvaluationSetting<M extends BaseDormitoryHealthEvaluationSetting<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSettingId(java.lang.Integer settingId) {
		set("setting_id", settingId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSettingId() {
		return getInt("setting_id");
	}

	/**
	*设置标题 
	*/
	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}

	/**
	*获取标题 
	*/
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	*设置评比频率 
	*/
	public M setRate(java.lang.Integer rate) {
		set("rate", rate);
		return (M)this;
	}

	/**
	*获取评比频率 
	*/
	public java.lang.Integer getRate() {
		return getInt("rate");
	}

	/**
	*设置首次评比时间 
	*/
	public M setFirstTime(java.util.Date firstTime) {
		set("first_time", firstTime);
		return (M)this;
	}

	/**
	*获取首次评比时间 
	*/
	public java.util.Date getFirstTime() {
		return get("first_time");
	}

}
