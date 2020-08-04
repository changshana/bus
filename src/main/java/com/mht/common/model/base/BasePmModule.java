package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * pm_module:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePmModule<M extends BasePmModule<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setModuleId(java.lang.Integer moduleId) {
		set("module_id", moduleId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getModuleId() {
		return getInt("module_id");
	}

	/**
	*设置名称 
	*/
	public M setModuleName(java.lang.String moduleName) {
		set("module_name", moduleName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getModuleName() {
		return getStr("module_name");
	}

	/**
	*设置path 
	*/
	public M setModulePath(java.lang.String modulePath) {
		set("module_path", modulePath);
		return (M)this;
	}

	/**
	*获取path 
	*/
	public java.lang.String getModulePath() {
		return getStr("module_path");
	}

	/**
	*设置pp 
	*/
	public M setPackagePath(java.lang.String packagePath) {
		set("package_path", packagePath);
		return (M)this;
	}

	/**
	*获取pp 
	*/
	public java.lang.String getPackagePath() {
		return getStr("package_path");
	}

	/**
	*设置排序 
	*/
	public M setOrderCode(java.lang.Integer orderCode) {
		set("order_code", orderCode);
		return (M)this;
	}

	/**
	*获取排序 
	*/
	public java.lang.Integer getOrderCode() {
		return getInt("order_code");
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
	*设置st 
	*/
	public M setSeqType(java.lang.String seqType) {
		set("seq_type", seqType);
		return (M)this;
	}

	/**
	*获取st 
	*/
	public java.lang.String getSeqType() {
		return getStr("seq_type");
	}

}
