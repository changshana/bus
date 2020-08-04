package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_classroom:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxClassroom<M extends BasePxClassroom<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setClassroomId(java.lang.Integer classroomId) {
		set("classroom_id", classroomId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getClassroomId() {
		return getInt("classroom_id");
	}

	/**
	*设置课程id 
	*/
	public M setCourseId(java.lang.Integer courseId) {
		set("course_id", courseId);
		return (M)this;
	}

	/**
	*获取课程id 
	*/
	public java.lang.Integer getCourseId() {
		return getInt("course_id");
	}

	/**
	*设置章节数 
	*/
	public M setSectionNumber(java.lang.String sectionNumber) {
		set("section_number", sectionNumber);
		return (M)this;
	}

	/**
	*获取章节数 
	*/
	public java.lang.String getSectionNumber() {
		return getStr("section_number");
	}

	/**
	*设置章节标题 
	*/
	public M setSectionTitle(java.lang.String sectionTitle) {
		set("section_title", sectionTitle);
		return (M)this;
	}

	/**
	*获取章节标题 
	*/
	public java.lang.String getSectionTitle() {
		return getStr("section_title");
	}

	/**
	*设置课堂名称 
	*/
	public M setClassroomName(java.lang.String classroomName) {
		set("classroom_name", classroomName);
		return (M)this;
	}

	/**
	*获取课堂名称 
	*/
	public java.lang.String getClassroomName() {
		return getStr("classroom_name");
	}

	/**
	*设置视频链接 
	*/
	public M setVideoLink(java.lang.String videoLink) {
		set("video_link", videoLink);
		return (M)this;
	}

	/**
	*获取视频链接 
	*/
	public java.lang.String getVideoLink() {
		return getStr("video_link");
	}

	/**
	*设置视频大小 
	*/
	public M setVideoSize(java.lang.String videoSize) {
		set("video_size", videoSize);
		return (M)this;
	}

	/**
	*获取视频大小 
	*/
	public java.lang.String getVideoSize() {
		return getStr("video_size");
	}

	/**
	*设置视频格式 
	*/
	public M setVideoType(java.lang.String videoType) {
		set("video_type", videoType);
		return (M)this;
	}

	/**
	*获取视频格式 
	*/
	public java.lang.String getVideoType() {
		return getStr("video_type");
	}

	/**
	*设置视频时长 
	*/
	public M setVideoTime(java.lang.String videoTime) {
		set("video_time", videoTime);
		return (M)this;
	}

	/**
	*获取视频时长 
	*/
	public java.lang.String getVideoTime() {
		return getStr("video_time");
	}

	/**
	*设置课件名称 
	*/
	public M setCoursewareName(java.lang.String coursewareName) {
		set("courseware_name", coursewareName);
		return (M)this;
	}

	/**
	*获取课件名称 
	*/
	public java.lang.String getCoursewareName() {
		return getStr("courseware_name");
	}

	/**
	*设置课件大小 
	*/
	public M setCoursewareSize(java.lang.String coursewareSize) {
		set("courseware_size", coursewareSize);
		return (M)this;
	}

	/**
	*获取课件大小 
	*/
	public java.lang.String getCoursewareSize() {
		return getStr("courseware_size");
	}

	/**
	*设置课件格式 
	*/
	public M setCoursewareStyle(java.lang.String coursewareStyle) {
		set("courseware_style", coursewareStyle);
		return (M)this;
	}

	/**
	*获取课件格式 
	*/
	public java.lang.String getCoursewareStyle() {
		return getStr("courseware_style");
	}

	/**
	*设置课堂类型（选修/必修） 
	*/
	public M setCoursewareType(java.lang.String coursewareType) {
		set("courseware_type", coursewareType);
		return (M)this;
	}

	/**
	*获取课堂类型（选修/必修） 
	*/
	public java.lang.String getCoursewareType() {
		return getStr("courseware_type");
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

}
