package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * xim_model:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXimModel<M extends BaseXimModel<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setModelId(java.lang.Integer modelId) {
		set("model_id", modelId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getModelId() {
		return getInt("model_id");
	}

	/**
	*设置问答库分类名称 
	*/
	public M setModelName(java.lang.String modelName) {
		set("model_name", modelName);
		return (M)this;
	}

	/**
	*获取问答库分类名称 
	*/
	public java.lang.String getModelName() {
		return getStr("model_name");
	}

	/**
	*设置问答库代码 
	*/
	public M setModelCode(java.lang.String modelCode) {
		set("model_code", modelCode);
		return (M)this;
	}

	/**
	*获取问答库代码 
	*/
	public java.lang.String getModelCode() {
		return getStr("model_code");
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
	*设置有效标志 
	*/
	public M setStatus(java.lang.String status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取有效标志 
	*/
	public java.lang.String getStatus() {
		return getStr("status");
	}

}
