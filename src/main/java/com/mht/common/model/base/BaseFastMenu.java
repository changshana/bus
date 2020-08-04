package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * fast_menu:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseFastMenu<M extends BaseFastMenu<M>> extends Model<M> implements IBean {

	/**
	*设置id 
	*/
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	/**
	*获取id 
	*/
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	*设置所属平台id 
	*/
	public M setPlatId(java.lang.Integer platId) {
		set("plat_id", platId);
		return (M)this;
	}

	/**
	*获取所属平台id 
	*/
	public java.lang.Integer getPlatId() {
		return getInt("plat_id");
	}

	/**
	*设置模块id 
	*/
	public M setModuleId(java.lang.Integer moduleId) {
		set("module_id", moduleId);
		return (M)this;
	}

	/**
	*获取模块id 
	*/
	public java.lang.Integer getModuleId() {
		return getInt("module_id");
	}

	/**
	*设置快捷菜单颜色 
	*/
	public M setMenuColor(java.lang.String menuColor) {
		set("menu_color", menuColor);
		return (M)this;
	}

	/**
	*获取快捷菜单颜色 
	*/
	public java.lang.String getMenuColor() {
		return getStr("menu_color");
	}

	/**
	*设置快捷菜单名称 
	*/
	public M setMenuName(java.lang.String menuName) {
		set("menu_name", menuName);
		return (M)this;
	}

	/**
	*获取快捷菜单名称 
	*/
	public java.lang.String getMenuName() {
		return getStr("menu_name");
	}

	/**
	*设置用户id 
	*/
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	/**
	*获取用户id 
	*/
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

}
