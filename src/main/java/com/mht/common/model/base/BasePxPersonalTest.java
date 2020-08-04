package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_personal_test:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxPersonalTest<M extends BasePxPersonalTest<M>> extends Model<M> implements IBean {

	/**
	*设置考试id 
	*/
	public M setPersonalTestId(java.lang.Integer personalTestId) {
		set("personal_test_id", personalTestId);
		return (M)this;
	}

	/**
	*获取考试id 
	*/
	public java.lang.Integer getPersonalTestId() {
		return getInt("personal_test_id");
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
	*设置试卷id 
	*/
	public M setTestPaperTotalId(java.lang.Integer testPaperTotalId) {
		set("test_paper_total_id", testPaperTotalId);
		return (M)this;
	}

	/**
	*获取试卷id 
	*/
	public java.lang.Integer getTestPaperTotalId() {
		return getInt("test_paper_total_id");
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
	*设置开卷时间 
	*/
	public M setOpenTestTime(java.util.Date openTestTime) {
		set("open_test_time", openTestTime);
		return (M)this;
	}

	/**
	*获取开卷时间 
	*/
	public java.util.Date getOpenTestTime() {
		return get("open_test_time");
	}

	/**
	*设置闭卷时间 
	*/
	public M setCloseTestTime(java.util.Date closeTestTime) {
		set("close_test_time", closeTestTime);
		return (M)this;
	}

	/**
	*获取闭卷时间 
	*/
	public java.util.Date getCloseTestTime() {
		return get("close_test_time");
	}

	/**
	*设置考试时长 
	*/
	public M setExamTime(java.lang.String examTime) {
		set("exam_time", examTime);
		return (M)this;
	}

	/**
	*获取考试时长 
	*/
	public java.lang.String getExamTime() {
		return getStr("exam_time");
	}

	/**
	*设置试卷状态 
	*/
	public M setTestStatus(java.lang.Integer testStatus) {
		set("test_status", testStatus);
		return (M)this;
	}

	/**
	*获取试卷状态 
	*/
	public java.lang.Integer getTestStatus() {
		return getInt("test_status");
	}

	/**
	*设置理论得分 
	*/
	public M setTheoryScore(java.lang.String theoryScore) {
		set("theory_score", theoryScore);
		return (M)this;
	}

	/**
	*获取理论得分 
	*/
	public java.lang.String getTheoryScore() {
		return getStr("theory_score");
	}

	/**
	*设置技能得分 
	*/
	public M setSkillScore(java.lang.String skillScore) {
		set("skill_score", skillScore);
		return (M)this;
	}

	/**
	*获取技能得分 
	*/
	public java.lang.String getSkillScore() {
		return getStr("skill_score");
	}

}
