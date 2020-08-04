package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * car_info:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCarInfo<M extends BaseCarInfo<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setInfoId(java.lang.Integer infoId) {
		set("info_id", infoId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getInfoId() {
		return getInt("info_id");
	}

	/**
	*设置名称 
	*/
	public M setInfoName(java.lang.String infoName) {
		set("info_name", infoName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getInfoName() {
		return getStr("info_name");
	}

	/**
	*设置代码 
	*/
	public M setInfoCode(java.lang.String infoCode) {
		set("info_code", infoCode);
		return (M)this;
	}

	/**
	*获取代码 
	*/
	public java.lang.String getInfoCode() {
		return getStr("info_code");
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
	*设置品牌 
	*/
	public M setBrand(java.lang.String brand) {
		set("brand", brand);
		return (M)this;
	}

	/**
	*获取品牌 
	*/
	public java.lang.String getBrand() {
		return getStr("brand");
	}

	/**
	*设置车牌 
	*/
	public M setPlateNumber(java.lang.String plateNumber) {
		set("plate_number", plateNumber);
		return (M)this;
	}

	/**
	*获取车牌 
	*/
	public java.lang.String getPlateNumber() {
		return getStr("plate_number");
	}

	/**
	*设置生产厂商 
	*/
	public M setManufacturer(java.lang.String manufacturer) {
		set("manufacturer", manufacturer);
		return (M)this;
	}

	/**
	*获取生产厂商 
	*/
	public java.lang.String getManufacturer() {
		return getStr("manufacturer");
	}

	/**
	*设置核载人数 
	*/
	public M setNumber(java.lang.Integer number) {
		set("number", number);
		return (M)this;
	}

	/**
	*获取核载人数 
	*/
	public java.lang.Integer getNumber() {
		return getInt("number");
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
	*设置专用校车 
	*/
	public M setDedicated(java.lang.Integer dedicated) {
		set("dedicated", dedicated);
		return (M)this;
	}

	/**
	*获取专用校车 
	*/
	public java.lang.Integer getDedicated() {
		return getInt("dedicated");
	}

	/**
	*设置 
	*/
	public M setTypeId(java.lang.Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getTypeId() {
		return getInt("type_id");
	}

}
