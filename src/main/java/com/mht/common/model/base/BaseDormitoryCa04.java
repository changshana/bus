package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_ca04:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryCa04<M extends BaseDormitoryCa04<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setAca040(java.lang.Integer aca040) {
		set("aca040", aca040);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getAca040() {
		return getInt("aca040");
	}

	/**
	*设置夏(冬)令营项目分房设置ID 
	*/
	public M setAca030(java.lang.Integer aca030) {
		set("aca030", aca030);
		return (M)this;
	}

	/**
	*获取夏(冬)令营项目分房设置ID 
	*/
	public java.lang.Integer getAca030() {
		return getInt("aca030");
	}

	/**
	*设置房间编码（楼宇-楼层-房间号） 
	*/
	public M setAca001(java.lang.String aca001) {
		set("aca001", aca001);
		return (M)this;
	}

	/**
	*获取房间编码（楼宇-楼层-房间号） 
	*/
	public java.lang.String getAca001() {
		return getStr("aca001");
	}

	/**
	*设置状态 
	*/
	public M setAaa996(java.lang.Integer aaa996) {
		set("aaa996", aaa996);
		return (M)this;
	}

	/**
	*获取状态 
	*/
	public java.lang.Integer getAaa996() {
		return getInt("aaa996");
	}

	/**
	*设置创建用户 
	*/
	public M setAaa997(java.lang.String aaa997) {
		set("aaa997", aaa997);
		return (M)this;
	}

	/**
	*获取创建用户 
	*/
	public java.lang.String getAaa997() {
		return getStr("aaa997");
	}

	/**
	*设置创建时间 
	*/
	public M setAaa998(java.util.Date aaa998) {
		set("aaa998", aaa998);
		return (M)this;
	}

	/**
	*获取创建时间 
	*/
	public java.util.Date getAaa998() {
		return get("aaa998");
	}

	/**
	*设置备注 
	*/
	public M setAaa999(java.lang.String aaa999) {
		set("aaa999", aaa999);
		return (M)this;
	}

	/**
	*获取备注 
	*/
	public java.lang.String getAaa999() {
		return getStr("aaa999");
	}

	/**
	*设置房间id 
	*/
	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	/**
	*获取房间id 
	*/
	public java.lang.Integer getRoomId() {
		return getInt("room_id");
	}

}
