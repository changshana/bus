package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_post_establishment:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelPostEstablishment<M extends BasePersonnelPostEstablishment<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setEstablishmentId(java.lang.Integer establishmentId) {
		set("establishment_id", establishmentId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getEstablishmentId() {
		return getInt("establishment_id");
	}

	/**
	*设置岗位ID 
	*/
	public M setPostId(java.lang.Integer postId) {
		set("post_id", postId);
		return (M)this;
	}

	/**
	*获取岗位ID 
	*/
	public java.lang.Integer getPostId() {
		return getInt("post_id");
	}

	/**
	*设置新增编制 
	*/
	public M setEstablishment(java.lang.Integer establishment) {
		set("establishment", establishment);
		return (M)this;
	}

	/**
	*获取新增编制 
	*/
	public java.lang.Integer getEstablishment() {
		return getInt("establishment");
	}

	/**
	*设置申请时间 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取申请时间 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
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
	*设置原编制 
	*/
	public M setOldEstablishment(java.lang.Integer oldEstablishment) {
		set("old_establishment", oldEstablishment);
		return (M)this;
	}

	/**
	*获取原编制 
	*/
	public java.lang.Integer getOldEstablishment() {
		return getInt("old_establishment");
	}

	/**
	*设置经办机构id 
	*/
	public M setOrgId(java.lang.Integer orgId) {
		set("org_id", orgId);
		return (M)this;
	}

	/**
	*获取经办机构id 
	*/
	public java.lang.Integer getOrgId() {
		return getInt("org_id");
	}

}
