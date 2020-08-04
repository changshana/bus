package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_test_question_temp:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxTestQuestionTemp<M extends BasePxTestQuestionTemp<M>> extends Model<M> implements IBean {

	/**
	*设置试题id 
	*/
	public M setTempId(java.lang.Integer tempId) {
		set("temp_id", tempId);
		return (M)this;
	}

	/**
	*获取试题id 
	*/
	public java.lang.Integer getTempId() {
		return getInt("temp_id");
	}

	/**
	*设置出题部门 
	*/
	public M setQuestionDepartment(java.lang.String questionDepartment) {
		set("question_department", questionDepartment);
		return (M)this;
	}

	/**
	*获取出题部门 
	*/
	public java.lang.String getQuestionDepartment() {
		return getStr("question_department");
	}

	/**
	*设置出题人 
	*/
	public M setQuestionPerson(java.lang.String questionPerson) {
		set("question_person", questionPerson);
		return (M)this;
	}

	/**
	*获取出题人 
	*/
	public java.lang.String getQuestionPerson() {
		return getStr("question_person");
	}

	/**
	*设置试题类型(单选、多选、判断、填空、问答题) 
	*/
	public M setTestType(java.lang.String testType) {
		set("test_type", testType);
		return (M)this;
	}

	/**
	*获取试题类型(单选、多选、判断、填空、问答题) 
	*/
	public java.lang.String getTestType() {
		return getStr("test_type");
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
	*设置课程类型 
	*/
	public M setCourseType(java.lang.String courseType) {
		set("course_type", courseType);
		return (M)this;
	}

	/**
	*获取课程类型 
	*/
	public java.lang.String getCourseType() {
		return getStr("course_type");
	}

	/**
	*设置题目内容 
	*/
	public M setRubricContent(java.lang.String rubricContent) {
		set("rubric_content", rubricContent);
		return (M)this;
	}

	/**
	*获取题目内容 
	*/
	public java.lang.String getRubricContent() {
		return getStr("rubric_content");
	}

	/**
	*设置选项1编号 
	*/
	public M setOptionOneNumber(java.lang.String optionOneNumber) {
		set("option_one_number", optionOneNumber);
		return (M)this;
	}

	/**
	*获取选项1编号 
	*/
	public java.lang.String getOptionOneNumber() {
		return getStr("option_one_number");
	}

	/**
	*设置选项1 
	*/
	public M setOptionOne(java.lang.String optionOne) {
		set("option_one", optionOne);
		return (M)this;
	}

	/**
	*获取选项1 
	*/
	public java.lang.String getOptionOne() {
		return getStr("option_one");
	}

	/**
	*设置选项2编号 
	*/
	public M setOptionTowNumber(java.lang.String optionTowNumber) {
		set("option_tow_number", optionTowNumber);
		return (M)this;
	}

	/**
	*获取选项2编号 
	*/
	public java.lang.String getOptionTowNumber() {
		return getStr("option_tow_number");
	}

	/**
	*设置选项2 
	*/
	public M setOptionTow(java.lang.String optionTow) {
		set("option_tow", optionTow);
		return (M)this;
	}

	/**
	*获取选项2 
	*/
	public java.lang.String getOptionTow() {
		return getStr("option_tow");
	}

	/**
	*设置选项3编号 
	*/
	public M setOptionThreeNumber(java.lang.String optionThreeNumber) {
		set("option_three_number", optionThreeNumber);
		return (M)this;
	}

	/**
	*获取选项3编号 
	*/
	public java.lang.String getOptionThreeNumber() {
		return getStr("option_three_number");
	}

	/**
	*设置选项3 
	*/
	public M setOptionThree(java.lang.String optionThree) {
		set("option_three", optionThree);
		return (M)this;
	}

	/**
	*获取选项3 
	*/
	public java.lang.String getOptionThree() {
		return getStr("option_three");
	}

	/**
	*设置选项4编号 
	*/
	public M setOptionFourNumber(java.lang.String optionFourNumber) {
		set("option_four_number", optionFourNumber);
		return (M)this;
	}

	/**
	*获取选项4编号 
	*/
	public java.lang.String getOptionFourNumber() {
		return getStr("option_four_number");
	}

	/**
	*设置选项4 
	*/
	public M setOptionFour(java.lang.String optionFour) {
		set("option_four", optionFour);
		return (M)this;
	}

	/**
	*获取选项4 
	*/
	public java.lang.String getOptionFour() {
		return getStr("option_four");
	}

	/**
	*设置参考答案编号 
	*/
	public M setKeyExercises(java.lang.String keyExercises) {
		set("key_exercises", keyExercises);
		return (M)this;
	}

	/**
	*获取参考答案编号 
	*/
	public java.lang.String getKeyExercises() {
		return getStr("key_exercises");
	}

	/**
	*设置有效性 
	*/
	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	/**
	*获取有效性 
	*/
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	*设置培训学校编号 
	*/
	public M setSchoolId(java.lang.Integer schoolId) {
		set("school_id", schoolId);
		return (M)this;
	}

	/**
	*获取培训学校编号 
	*/
	public java.lang.Integer getSchoolId() {
		return getInt("school_id");
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

	/**
	*设置难度 
	*/
	public M setExamDifficulty(java.lang.Integer examDifficulty) {
		set("exam_difficulty", examDifficulty);
		return (M)this;
	}

	/**
	*获取难度 
	*/
	public java.lang.Integer getExamDifficulty() {
		return getInt("exam_difficulty");
	}

	/**
	*设置判断题答案 
	*/
	public M setChooseAnswer(java.lang.Integer chooseAnswer) {
		set("choose_answer", chooseAnswer);
		return (M)this;
	}

	/**
	*获取判断题答案 
	*/
	public java.lang.Integer getChooseAnswer() {
		return getInt("choose_answer");
	}

	/**
	*设置判断题选项 
	*/
	public M setJudgeChoose(java.lang.Integer judgeChoose) {
		set("judge_choose", judgeChoose);
		return (M)this;
	}

	/**
	*获取判断题选项 
	*/
	public java.lang.Integer getJudgeChoose() {
		return getInt("judge_choose");
	}

	/**
	*设置验证失败原因 
	*/
	public M setReson(java.lang.String reson) {
		set("reson", reson);
		return (M)this;
	}

	/**
	*获取验证失败原因 
	*/
	public java.lang.String getReson() {
		return getStr("reson");
	}

	/**
	*设置成功：1  ，失败 ： 0 
	*/
	public M setTempType(java.lang.Integer tempType) {
		set("temp_type", tempType);
		return (M)this;
	}

	/**
	*获取成功：1  ，失败 ： 0 
	*/
	public java.lang.Integer getTempType() {
		return getInt("temp_type");
	}

	/**
	*设置试题类型名称 
	*/
	public M setTestTypeName(java.lang.String testTypeName) {
		set("test_type_name", testTypeName);
		return (M)this;
	}

	/**
	*获取试题类型名称 
	*/
	public java.lang.String getTestTypeName() {
		return getStr("test_type_name");
	}

	/**
	*设置课程名称 
	*/
	public M setCourseName(java.lang.String courseName) {
		set("course_name", courseName);
		return (M)this;
	}

	/**
	*获取课程名称 
	*/
	public java.lang.String getCourseName() {
		return getStr("course_name");
	}

	/**
	*设置学校名称 
	*/
	public M setSchoolName(java.lang.String schoolName) {
		set("school_name", schoolName);
		return (M)this;
	}

	/**
	*获取学校名称 
	*/
	public java.lang.String getSchoolName() {
		return getStr("school_name");
	}

	/**
	*设置难度名称 
	*/
	public M setExamDifficultyName(java.lang.String examDifficultyName) {
		set("exam_difficulty_name", examDifficultyName);
		return (M)this;
	}

	/**
	*获取难度名称 
	*/
	public java.lang.String getExamDifficultyName() {
		return getStr("exam_difficulty_name");
	}

}
