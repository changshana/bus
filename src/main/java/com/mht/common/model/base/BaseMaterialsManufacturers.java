package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * materials_manufacturers:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMaterialsManufacturers<M extends BaseMaterialsManufacturers<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setMaterialsManufacturersId(java.lang.Integer materialsManufacturersId) {
		set("materials_manufacturers_id", materialsManufacturersId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getMaterialsManufacturersId() {
		return getInt("materials_manufacturers_id");
	}

	/**
	*设置名称 
	*/
	public M setManufacturersName(java.lang.String manufacturersName) {
		set("manufacturers_name", manufacturersName);
		return (M)this;
	}

	/**
	*获取名称 
	*/
	public java.lang.String getManufacturersName() {
		return getStr("manufacturers_name");
	}

	/**
	*设置联系方式 
	*/
	public M setMobile(java.lang.String mobile) {
		set("mobile", mobile);
		return (M)this;
	}

	/**
	*获取联系方式 
	*/
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	/**
	*设置地址 
	*/
	public M setLocation(java.lang.String location) {
		set("location", location);
		return (M)this;
	}

	/**
	*获取地址 
	*/
	public java.lang.String getLocation() {
		return getStr("location");
	}

	/**
	*设置联系人 
	*/
	public M setContacts(java.lang.String contacts) {
		set("contacts", contacts);
		return (M)this;
	}

	/**
	*获取联系人 
	*/
	public java.lang.String getContacts() {
		return getStr("contacts");
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
	*设置ID 
	*/
	public M setManufacturersTypeId(java.lang.Integer manufacturersTypeId) {
		set("manufacturers_type_id", manufacturersTypeId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getManufacturersTypeId() {
		return getInt("manufacturers_type_id");
	}

	/**
	*设置邮箱 
	*/
	public M setCompanyEmail(java.lang.String companyEmail) {
		set("company_email", companyEmail);
		return (M)this;
	}

	/**
	*获取邮箱 
	*/
	public java.lang.String getCompanyEmail() {
		return getStr("company_email");
	}

	/**
	*设置法定代表人 
	*/
	public M setRepresentative(java.lang.String representative) {
		set("representative", representative);
		return (M)this;
	}

	/**
	*获取法定代表人 
	*/
	public java.lang.String getRepresentative() {
		return getStr("representative");
	}

	/**
	*设置公司成立时间 
	*/
	public M setCompanyCreateTime(java.util.Date companyCreateTime) {
		set("company_create_time", companyCreateTime);
		return (M)this;
	}

	/**
	*获取公司成立时间 
	*/
	public java.util.Date getCompanyCreateTime() {
		return get("company_create_time");
	}

	/**
	*设置企业资质等级 
	*/
	public M setCompanyAptitude(java.lang.String companyAptitude) {
		set("company_aptitude", companyAptitude);
		return (M)this;
	}

	/**
	*获取企业资质等级 
	*/
	public java.lang.String getCompanyAptitude() {
		return getStr("company_aptitude");
	}

	/**
	*设置营业执照号 
	*/
	public M setLicense(java.lang.String license) {
		set("license", license);
		return (M)this;
	}

	/**
	*获取营业执照号 
	*/
	public java.lang.String getLicense() {
		return getStr("license");
	}

	/**
	*设置注册资金 
	*/
	public M setMoney(java.lang.Integer money) {
		set("money", money);
		return (M)this;
	}

	/**
	*获取注册资金 
	*/
	public java.lang.Integer getMoney() {
		return getInt("money");
	}

	/**
	*设置开户银行 
	*/
	public M setDepositBank(java.lang.String depositBank) {
		set("deposit_bank", depositBank);
		return (M)this;
	}

	/**
	*获取开户银行 
	*/
	public java.lang.String getDepositBank() {
		return getStr("deposit_bank");
	}

	/**
	*设置银行账户 
	*/
	public M setBankAccount(java.lang.Integer bankAccount) {
		set("bank_account", bankAccount);
		return (M)this;
	}

	/**
	*获取银行账户 
	*/
	public java.lang.Integer getBankAccount() {
		return getInt("bank_account");
	}

}
