package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_team:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairTeam<M extends BaseRepairTeam<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setTeamId(java.lang.Integer teamId) {
		set("team_id", teamId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getTeamId() {
		return getInt("team_id");
	}

	/**
	*设置组名称 
	*/
	public M setTeamName(java.lang.String teamName) {
		set("team_name", teamName);
		return (M)this;
	}

	/**
	*获取组名称 
	*/
	public java.lang.String getTeamName() {
		return getStr("team_name");
	}

	/**
	*设置组类型 
	*/
	public M setGroupType(java.lang.Integer groupType) {
		set("group_type", groupType);
		return (M)this;
	}

	/**
	*获取组类型 
	*/
	public java.lang.Integer getGroupType() {
		return getInt("group_type");
	}

	/**
	*设置成员 
	*/
	public M setMember(java.lang.String member) {
		set("member", member);
		return (M)this;
	}

	/**
	*获取成员 
	*/
	public java.lang.String getMember() {
		return getStr("member");
	}

	/**
	*设置所属部门 
	*/
	public M setDept(java.lang.Integer dept) {
		set("dept", dept);
		return (M)this;
	}

	/**
	*获取所属部门 
	*/
	public java.lang.Integer getDept() {
		return getInt("dept");
	}

	/**
	*设置状态 
	*/
	public M setTeamStatus(java.lang.Integer teamStatus) {
		set("team_status", teamStatus);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getTeamStatus() {
		return getInt("team_status");
	}

	/**
	*设置校区 
	*/
	public M setSchool(java.lang.Integer school) {
		set("school", school);
		return (M)this;
	}

	/**
	*获取校区 
	*/
	public java.lang.Integer getSchool() {
		return getInt("school");
	}

	/**
	*设置负责区域 
	*/
	public M setArea(java.lang.String area) {
		set("area", area);
		return (M)this;
	}

	/**
	*获取负责区域 
	*/
	public java.lang.String getArea() {
		return getStr("area");
	}

}
