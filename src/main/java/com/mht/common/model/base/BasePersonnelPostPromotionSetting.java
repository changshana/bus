package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_promotion_setting:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostPromotionSetting<M extends BasePersonnelPostPromotionSetting<M>> extends Model<M> implements IBean {

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
	*设置岗位类别 
	*/
	public M setPostCategory(java.lang.Integer postCategory) {
		set("post_category", postCategory);
		return (M)this;
	}

	/**
	*获取岗位类别 
	*/
	public java.lang.Integer getPostCategory() {
		return getInt("post_category");
	}

	/**
	*设置晋升初始岗位级别 
	*/
	public M setFromCategory(java.lang.Integer fromCategory) {
		set("from_category", fromCategory);
		return (M)this;
	}

	/**
	*获取晋升初始岗位级别 
	*/
	public java.lang.Integer getFromCategory() {
		return getInt("from_category");
	}

	/**
	*设置晋升至岗位级别 
	*/
	public M setToCategory(java.lang.Integer toCategory) {
		set("to_category", toCategory);
		return (M)this;
	}

	/**
	*获取晋升至岗位级别 
	*/
	public java.lang.Integer getToCategory() {
		return getInt("to_category");
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
	*设置创建用户 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
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
	*设置晋升级别 
	*/
	public M setStandardId(java.lang.Integer standardId) {
		set("standard_id", standardId);
		return (M)this;
	}

	/**
	*获取晋升级别 
	*/
	public java.lang.Integer getStandardId() {
		return getInt("standard_id");
	}

}
