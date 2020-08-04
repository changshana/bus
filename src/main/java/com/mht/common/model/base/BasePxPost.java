package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_post:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxPost<M extends BasePxPost<M>> extends Model<M> implements IBean {

	/**
	*设置岗位id 
	*/
	public M setPostId(java.lang.Integer postId) {
		set("post_id", postId);
		return (M)this;
	}

	/**
	*获取岗位id 
	*/
	public java.lang.Integer getPostId() {
		return getInt("post_id");
	}

	/**
	*设置单位名称 
	*/
	public M setUnitName(java.lang.String unitName) {
		set("unit_name", unitName);
		return (M)this;
	}

	/**
	*获取单位名称 
	*/
	public java.lang.String getUnitName() {
		return getStr("unit_name");
	}

	/**
	*设置岗位名称 
	*/
	public M setPostName(java.lang.String postName) {
		set("post_name", postName);
		return (M)this;
	}

	/**
	*获取岗位名称 
	*/
	public java.lang.String getPostName() {
		return getStr("post_name");
	}

	/**
	*设置招聘人数 
	*/
	public M setAdvertisesSum(java.lang.Integer advertisesSum) {
		set("advertises_sum", advertisesSum);
		return (M)this;
	}

	/**
	*获取招聘人数 
	*/
	public java.lang.Integer getAdvertisesSum() {
		return getInt("advertises_sum");
	}

	/**
	*设置最高月薪 
	*/
	public M setMothlyPayTop(java.lang.String mothlyPayTop) {
		set("mothly_pay_top", mothlyPayTop);
		return (M)this;
	}

	/**
	*获取最高月薪 
	*/
	public java.lang.String getMothlyPayTop() {
		return getStr("mothly_pay_top");
	}

	/**
	*设置最低月薪 
	*/
	public M setMothlyPayLow(java.lang.String mothlyPayLow) {
		set("mothly_pay_low", mothlyPayLow);
		return (M)this;
	}

	/**
	*获取最低月薪 
	*/
	public java.lang.String getMothlyPayLow() {
		return getStr("mothly_pay_low");
	}

	/**
	*设置福利 
	*/
	public M setWelfare(java.lang.String welfare) {
		set("welfare", welfare);
		return (M)this;
	}

	/**
	*获取福利 
	*/
	public java.lang.String getWelfare() {
		return getStr("welfare");
	}

	/**
	*设置所属行业 
	*/
	public M setAttributeCalling(java.lang.String attributeCalling) {
		set("attribute_calling", attributeCalling);
		return (M)this;
	}

	/**
	*获取所属行业 
	*/
	public java.lang.String getAttributeCalling() {
		return getStr("attribute_calling");
	}

	/**
	*设置单位类型 
	*/
	public M setUnitType(java.lang.String unitType) {
		set("unit_type", unitType);
		return (M)this;
	}

	/**
	*获取单位类型 
	*/
	public java.lang.String getUnitType() {
		return getStr("unit_type");
	}

	/**
	*设置单位地址 
	*/
	public M setUnitAddress(java.lang.String unitAddress) {
		set("unit_address", unitAddress);
		return (M)this;
	}

	/**
	*获取单位地址 
	*/
	public java.lang.String getUnitAddress() {
		return getStr("unit_address");
	}

}
