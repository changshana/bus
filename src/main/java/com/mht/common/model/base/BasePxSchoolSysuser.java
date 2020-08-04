package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_school_sysuser:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxSchoolSysuser<M extends BasePxSchoolSysuser<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setSchoolSysuserId(java.lang.Integer schoolSysuserId) {
		set("school_sysUser_id", schoolSysuserId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getSchoolSysuserId() {
		return getInt("school_sysUser_id");
	}

	/**
	*设置学校id 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取学校id 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
	}

	/**
	*设置用户id 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取用户id 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

}
