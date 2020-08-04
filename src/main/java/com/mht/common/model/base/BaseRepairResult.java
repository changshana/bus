package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_result:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairResult<M extends BaseRepairResult<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setResultId(java.lang.Integer resultId) {
		set("result_id", resultId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getResultId() {
		return getInt("result_id");
	}

	/**
	*设置 
	*/
	public M setCompleteTime(java.util.Date completeTime) {
		set("complete_time", completeTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCompleteTime() {
		return get("complete_time");
	}

	/**
	*设置 
	*/
	public M setCheckTime(java.util.Date checkTime) {
		set("check_time", checkTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCheckTime() {
		return get("check_time");
	}

	/**
	*设置 
	*/
	public M setCheckUser(java.lang.String checkUser) {
		set("check_user", checkUser);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCheckUser() {
		return getStr("check_user");
	}

	/**
	*设置 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	*设置 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置 
	*/
	public M setRbId(java.lang.Integer rbId) {
		set("rb_id", rbId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getRbId() {
		return getInt("rb_id");
	}

}
