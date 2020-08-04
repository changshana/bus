package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * dormitory_room_coords:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDormitoryRoomCoords<M extends BaseDormitoryRoomCoords<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setCoordsId(java.lang.Integer coordsId) {
		set("coords_id", coordsId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getCoordsId() {
		return getInt("coords_id");
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

	/**
	*设置宽度 
	*/
	public M setRoomWidth(java.lang.Integer roomWidth) {
		set("room_width", roomWidth);
		return (M)this;
	}

	/**
	*获取宽度 
	*/
	public java.lang.Integer getRoomWidth() {
		return getInt("room_width");
	}

	/**
	*设置高度 
	*/
	public M setRoomHeight(java.lang.Integer roomHeight) {
		set("room_height", roomHeight);
		return (M)this;
	}

	/**
	*获取高度 
	*/
	public java.lang.Integer getRoomHeight() {
		return getInt("room_height");
	}

	/**
	*设置坐标 
	*/
	public M setCoordinate(java.lang.String coordinate) {
		set("coordinate", coordinate);
		return (M)this;
	}

	/**
	*获取坐标 
	*/
	public java.lang.String getCoordinate() {
		return getStr("coordinate");
	}

	/**
	*设置创建人 
	*/
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}

	/**
	*获取创建人 
	*/
	public java.lang.String getCreator() {
		return getStr("creator");
	}

	/**
	*设置创建日期 
	*/
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
