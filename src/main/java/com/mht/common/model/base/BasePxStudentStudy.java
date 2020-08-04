package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_student_study:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxStudentStudy<M extends BasePxStudentStudy<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setStudentStudyId(java.lang.Integer studentStudyId) {
		set("student_study_id", studentStudyId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getStudentStudyId() {
		return getInt("student_study_id");
	}

	/**
	*设置学员id 
	*/
	public M setStudentId(java.lang.Integer studentId) {
		set("student_id", studentId);
		return (M)this;
	}

	/**
	*获取学员id 
	*/
	public java.lang.Integer getStudentId() {
		return getInt("student_id");
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
	*设置课堂id 
	*/
	public M setSchoolroomId(java.lang.Integer schoolroomId) {
		set("schoolroom_id", schoolroomId);
		return (M)this;
	}

	/**
	*获取课堂id 
	*/
	public java.lang.Integer getSchoolroomId() {
		return getInt("schoolroom_id");
	}

	/**
	*设置所需学习时长 
	*/
	public M setStudyTime(java.lang.String studyTime) {
		set("study_time", studyTime);
		return (M)this;
	}

	/**
	*获取所需学习时长 
	*/
	public java.lang.String getStudyTime() {
		return getStr("study_time");
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
	*设置当前视频播放节点 
	*/
	public M setVideoNowTime(java.lang.String videoNowTime) {
		set("video_now_time", videoNowTime);
		return (M)this;
	}

	/**
	*获取当前视频播放节点 
	*/
	public java.lang.String getVideoNowTime() {
		return getStr("video_now_time");
	}

}
