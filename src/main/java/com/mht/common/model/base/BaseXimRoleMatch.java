package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * xim_role_match:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXimRoleMatch<M extends BaseXimRoleMatch<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMatchId(java.lang.Integer matchId) {
		set("match_id", matchId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMatchId() {
		return getInt("match_id");
	}

	/**
	*设置棉棉系统角色id 
	*/
	public M setRoleId(java.lang.Integer roleId) {
		set("role_id", roleId);
		return (M)this;
	}

	/**
	*获取棉棉系统角色id 
	*/
	public java.lang.Integer getRoleId() {
		return getInt("role_id");
	}

	/**
	*设置业务系统角色id 
	*/
	public M setMatchRoleId(java.lang.Integer matchRoleId) {
		set("match_role_id", matchRoleId);
		return (M)this;
	}

	/**
	*获取业务系统角色id 
	*/
	public java.lang.Integer getMatchRoleId() {
		return getInt("match_role_id");
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

}
