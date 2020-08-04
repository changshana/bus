package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_class_teacher:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxClassTeacher<M extends BasePxClassTeacher<M>> extends Model<M> implements IBean {

	/**
	*设置关联表id 
	*/
	public M setClassTeacherId(java.lang.Integer classTeacherId) {
		set("class_teacher_id", classTeacherId);
		return (M)this;
	}

	/**
	*获取关联表id 
	*/
	public java.lang.Integer getClassTeacherId() {
		return getInt("class_teacher_id");
	}

	/**
	*设置教师id 
	*/
	public M setTeacherId(java.lang.Integer teacherId) {
		set("teacher_id", teacherId);
		return (M)this;
	}

	/**
	*获取教师id 
	*/
	public java.lang.Integer getTeacherId() {
		return getInt("teacher_id");
	}

	/**
	*设置班级ID 
	*/
	public M setClassId(java.lang.Integer classId) {
		set("class_id", classId);
		return (M)this;
	}

	/**
	*获取班级ID 
	*/
	public java.lang.Integer getClassId() {
		return getInt("class_id");
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
	*设置使用教材 
	*/
	public M setTeachingMaterial(java.lang.String teachingMaterial) {
		set("teaching_material", teachingMaterial);
		return (M)this;
	}

	/**
	*获取使用教材 
	*/
	public java.lang.String getTeachingMaterial() {
		return getStr("teaching_material");
	}

	/**
	*设置课程课时 
	*/
	public M setTeachingHour(java.lang.Integer teachingHour) {
		set("teaching_hour", teachingHour);
		return (M)this;
	}

	/**
	*获取课程课时 
	*/
	public java.lang.Integer getTeachingHour() {
		return getInt("teaching_hour");
	}

	/**
	*设置授课时间 
	*/
	public M setAttend_time(java.util.Date attend_time) {
		set("attend__time", attend_time);
		return (M)this;
	}

	/**
	*获取授课时间 
	*/
	public java.util.Date getAttend_time() {
		return get("attend__time");
	}

	/**
	*设置授课内容 
	*/
	public M setAttendContent(java.lang.String attendContent) {
		set("attend_content", attendContent);
		return (M)this;
	}

	/**
	*获取授课内容 
	*/
	public java.lang.String getAttendContent() {
		return getStr("attend_content");
	}

	/**
	*设置工作性质 
	*/
	public M setWorkNature(java.lang.String workNature) {
		set("work_nature", workNature);
		return (M)this;
	}

	/**
	*获取工作性质 
	*/
	public java.lang.String getWorkNature() {
		return getStr("work_nature");
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
