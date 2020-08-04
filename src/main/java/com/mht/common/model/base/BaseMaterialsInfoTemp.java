package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_info_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsInfoTemp<M extends BaseMaterialsInfoTemp<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setInfoTempId(java.lang.Integer infoTempId) {
		set("info_temp_id", infoTempId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getInfoTempId() {
		return getInt("info_temp_id");
	}

	/**
	*设置材料名称 
	*/
	public M setInfoTempName(java.lang.String infoTempName) {
		set("info_temp_name", infoTempName);
		return (M)this;
	}

	/**
	*获取材料名称 
	*/
	public java.lang.String getInfoTempName() {
		return getStr("info_temp_name");
	}

	/**
	*设置代码 
	*/
	public M setInfoTempCode(java.lang.String infoTempCode) {
		set("info_temp_code", infoTempCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getInfoTempCode() {
		return getStr("info_temp_code");
	}

	/**
	*设置单位 
	*/
	public M setTempUnit(java.lang.String tempUnit) {
		set("temp_unit", tempUnit);
		return (M)this;
	}

	/**
	*获取单位 
	*/
	public java.lang.String getTempUnit() {
		return getStr("temp_unit");
	}

	/**
	*设置状态 
	*/
	public M setTempStatus(java.lang.Integer tempStatus) {
		set("temp_status", tempStatus);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getTempStatus() {
		return getInt("temp_status");
	}

	/**
	*设置创建时间 
	*/
	public M setTempCreateTime(java.util.Date tempCreateTime) {
		set("temp_create_time", tempCreateTime);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getTempCreateTime() {
		return get("temp_create_time");
	}

	/**
	*设置创建用户 
	*/
	public M setTempCreator(java.lang.String tempCreator) {
		set("temp_creator", tempCreator);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getTempCreator() {
		return getStr("temp_creator");
	}

	/**
	*设置备注 
	*/
	public M setTempRemark(java.lang.String tempRemark) {
		set("temp_remark", tempRemark);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getTempRemark() {
		return getStr("temp_remark");
	}

	/**
	*设置品种ID 
	*/
	public M setTempClassId(java.lang.Integer tempClassId) {
		set("temp_class_id", tempClassId);
		return (M)this;
	}

	/**
	*获取品种ID 
	*/
	public java.lang.Integer getTempClassId() {
		return getInt("temp_class_id");
	}

	/**
	*设置类别iD 
	*/
	public M setTempGroupId(java.lang.Integer tempGroupId) {
		set("temp_group_id", tempGroupId);
		return (M)this;
	}

	/**
	*获取类别iD 
	*/
	public java.lang.Integer getTempGroupId() {
		return getInt("temp_group_id");
	}

	/**
	*设置数量预警 
	*/
	public M setTempAlert(java.lang.Integer tempAlert) {
		set("temp_alert", tempAlert);
		return (M)this;
	}

	/**
	*获取数量预警 
	*/
	public java.lang.Integer getTempAlert() {
		return getInt("temp_alert");
	}

	/**
	*设置品牌 
	*/
	public M setTempTrademark(java.lang.String tempTrademark) {
		set("temp_trademark", tempTrademark);
		return (M)this;
	}

	/**
	*获取品牌 
	*/
	public java.lang.String getTempTrademark() {
		return getStr("temp_trademark");
	}

	/**
	*设置型号 
	*/
	public M setTempModel(java.lang.String tempModel) {
		set("temp_model", tempModel);
		return (M)this;
	}

	/**
	*获取型号 
	*/
	public java.lang.String getTempModel() {
		return getStr("temp_model");
	}

	/**
	*设置规格 
	*/
	public M setTempSpecification(java.lang.String tempSpecification) {
		set("temp_specification", tempSpecification);
		return (M)this;
	}

	/**
	*获取规格 
	*/
	public java.lang.String getTempSpecification() {
		return getStr("temp_specification");
	}

	/**
	*设置 
	*/
	public M setTempPrice(java.lang.String tempPrice) {
		set("temp_price", tempPrice);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.String getTempPrice() {
		return getStr("temp_price");
	}

	/**
	*设置失败原因 
	*/
	public M setReason(java.lang.String reason) {
		set("reason", reason);
		return (M)this;
	}

	/**
	*获取失败原因 
	*/
	public java.lang.String getReason() {
		return getStr("reason");
	}

	/**
	*设置校验状态 (1:成功 0：失败) 
	*/
	public M setFlag(java.lang.Integer flag) {
		set("flag", flag);
		return (M)this;
	}

	/**
	*获取校验状态 (1:成功 0：失败) 
	*/
	public java.lang.Integer getFlag() {
		return getInt("flag");
	}

}
