package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_file:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelFile<M extends BasePersonnelFile<M>> extends Model<M> implements IBean {

	/**
	*设置文件流水号 
	*/
	public M setFileId(java.lang.Integer fileId) {
		set("file_id", fileId);
		return (M)this;
	}

	/**
	*获取文件流水号 
	*/
	public java.lang.Integer getFileId() {
		return getInt("file_id");
	}

	/**
	*设置关联表主键id 
	*/
	public M setRelevanceId(java.lang.Integer relevanceId) {
		set("relevance_id", relevanceId);
		return (M)this;
	}

	/**
	*获取关联表主键id 
	*/
	public java.lang.Integer getRelevanceId() {
		return getInt("relevance_id");
	}

	/**
	*设置关联表类型（表名） 
	*/
	public M setRelevanceType(java.lang.String relevanceType) {
		set("relevance_type", relevanceType);
		return (M)this;
	}

	/**
	*获取关联表类型（表名） 
	*/
	public java.lang.String getRelevanceType() {
		return getStr("relevance_type");
	}

	/**
	*设置文件名称 
	*/
	public M setFileName(java.lang.String fileName) {
		set("file_name", fileName);
		return (M)this;
	}

	/**
	*获取文件名称 
	*/
	public java.lang.String getFileName() {
		return getStr("file_name");
	}

	/**
	*设置文件存储地址 
	*/
	public M setFileUrl(java.lang.String fileUrl) {
		set("file_url", fileUrl);
		return (M)this;
	}

	/**
	*获取文件存储地址 
	*/
	public java.lang.String getFileUrl() {
		return getStr("file_url");
	}

	/**
	*设置文件类型 
	*/
	public M setFileType(java.lang.String fileType) {
		set("file_type", fileType);
		return (M)this;
	}

	/**
	*获取文件类型 
	*/
	public java.lang.String getFileType() {
		return getStr("file_type");
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
	*设置经办机构 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取经办机构 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
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

}
