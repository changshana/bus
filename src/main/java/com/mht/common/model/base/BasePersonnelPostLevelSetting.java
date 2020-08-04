package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_level_setting:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostLevelSetting<M extends BasePersonnelPostLevelSetting<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setPostLevelSettingId(java.lang.Integer postLevelSettingId) {
		set("post_level_setting_id", postLevelSettingId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getPostLevelSettingId() {
		return getInt("post_level_setting_id");
	}

	/**
	*设置岗位类别 
	*/
	public M setPostType(java.lang.String postType) {
		set("post_type", postType);
		return (M)this;
	}

	/**
	*获取岗位类别 
	*/
	public java.lang.String getPostType() {
		return getStr("post_type");
	}

	/**
	*设置岗位级别 
	*/
	public M setPostLevel(java.lang.String postLevel) {
		set("post_level", postLevel);
		return (M)this;
	}

	/**
	*获取岗位级别 
	*/
	public java.lang.String getPostLevel() {
		return getStr("post_level");
	}

	/**
	*设置工资标准 
	*/
	public M setWageStandards(java.lang.String wageStandards) {
		set("wage_standards", wageStandards);
		return (M)this;
	}

	/**
	*获取工资标准 
	*/
	public java.lang.String getWageStandards() {
		return getStr("wage_standards");
	}

}
