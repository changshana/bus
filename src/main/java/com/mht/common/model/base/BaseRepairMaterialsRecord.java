package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * repair_materials_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRepairMaterialsRecord<M extends BaseRepairMaterialsRecord<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsRecordId(java.lang.Integer materialsRecordId) {
		set("materials_record_id", materialsRecordId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsRecordId() {
		return getInt("materials_record_id");
	}

	/**
	*设置名称 
	*/
	public M setMaterialsRecordName(java.lang.String materialsRecordName) {
		set("materials_record_name", materialsRecordName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getMaterialsRecordName() {
		return getStr("materials_record_name");
	}

	/**
	*设置数量 
	*/
	public M setNumber(java.lang.Integer number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取数量 
	*/
	public java.lang.Integer getNumber() {
		return getInt("number");
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
	*设置校区材料ID 
	*/
	public M setZoneMaterialsId(java.lang.Integer zoneMaterialsId) {
		set("zone_materials_id", zoneMaterialsId);
		return (M)this;
	}

	/**
	*获取校区材料ID 
	*/
	public java.lang.Integer getZoneMaterialsId() {
		return getInt("zone_materials_id");
	}

	/**
	*设置目标ID 
	*/
	public M setGoalId(java.lang.Integer goalId) {
		set("goal_id", goalId);
		return (M)this;
	}

	/**
	*获取目标ID 
	*/
	public java.lang.Integer getGoalId() {
		return getInt("goal_id");
	}

	/**
	*设置目标类型 
	*/
	public M setGoalType(java.lang.Integer goalType) {
		set("goal_type", goalType);
		return (M)this;
	}

	/**
	*获取目标类型 
	*/
	public java.lang.Integer getGoalType() {
		return getInt("goal_type");
	}

}
