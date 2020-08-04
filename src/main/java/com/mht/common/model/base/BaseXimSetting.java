package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * xim_setting:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXimSetting<M extends BaseXimSetting<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setXimSettingId(java.lang.Integer ximSettingId) {
		set("xim_setting_id", ximSettingId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getXimSettingId() {
		return getInt("xim_setting_id");
	}

	/**
	*设置棉棉机器人名称 
	*/
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	/**
	*获取棉棉机器人名称 
	*/
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	*设置棉棉机器人的昵称 
	*/
	public M setNickname(java.lang.String nickname) {
		set("nickname", nickname);
		return (M)this;
	}

	/**
	*获取棉棉机器人的昵称 
	*/
	public java.lang.String getNickname() {
		return getStr("nickname");
	}

	/**
	*设置棉棉机器人头像 
	*/
	public M setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
		return (M)this;
	}

	/**
	*获取棉棉机器人头像 
	*/
	public java.lang.String getAvatar() {
		return getStr("avatar");
	}

	/**
	*设置棉棉机器人LOGO(url) 
	*/
	public M setXimLogo(java.lang.String ximLogo) {
		set("xim_logo", ximLogo);
		return (M)this;
	}

	/**
	*获取棉棉机器人LOGO(url) 
	*/
	public java.lang.String getXimLogo() {
		return getStr("xim_logo");
	}

	/**
	*设置是否语音提示 
	*/
	public M setIsPlay(java.lang.Integer isPlay) {
		set("isPlay", isPlay);
		return (M)this;
	}

	/**
	*获取是否语音提示 
	*/
	public java.lang.Integer getIsPlay() {
		return getInt("isPlay");
	}

	/**
	*设置棉棉机器人背景色 
	*/
	public M setBgColor(java.lang.String bgColor) {
		set("bg_color", bgColor);
		return (M)this;
	}

	/**
	*获取棉棉机器人背景色 
	*/
	public java.lang.String getBgColor() {
		return getStr("bg_color");
	}

	/**
	*设置棉棉机器人上外边距 
	*/
	public M setXimTop(java.lang.Integer ximTop) {
		set("xim_top", ximTop);
		return (M)this;
	}

	/**
	*获取棉棉机器人上外边距 
	*/
	public java.lang.Integer getXimTop() {
		return getInt("xim_top");
	}

	/**
	*设置版本 
	*/
	public M setVersion(java.lang.String version) {
		set("version", version);
		return (M)this;
	}

	/**
	*获取版本 
	*/
	public java.lang.String getVersion() {
		return getStr("version");
	}

	/**
	*设置棉棉个性签名 
	*/
	public M setSign(java.lang.String sign) {
		set("sign", sign);
		return (M)this;
	}

	/**
	*获取棉棉个性签名 
	*/
	public java.lang.String getSign() {
		return getStr("sign");
	}

	/**
	*设置备注 
	*/
	public M setMark(java.lang.String mark) {
		set("mark", mark);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getMark() {
		return getStr("mark");
	}

}
