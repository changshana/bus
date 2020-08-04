package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_papers:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxPapers<M extends BasePxPapers<M>> extends Model<M> implements IBean {

	/**
	*设置试卷id 
	*/
	public M setPaperId(java.lang.Integer paperId) {
		set("paper_id", paperId);
		return (M)this;
	}

	/**
	*获取试卷id 
	*/
	public java.lang.Integer getPaperId() {
		return getInt("paper_id");
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
	*设置试卷名称 
	*/
	public M setPaperName(java.lang.String paperName) {
		set("paper_name", paperName);
		return (M)this;
	}

	/**
	*获取试卷名称 
	*/
	public java.lang.String getPaperName() {
		return getStr("paper_name");
	}

	/**
	*设置试卷描述 
	*/
	public M setPaperDepict(java.lang.String paperDepict) {
		set("paper_depict", paperDepict);
		return (M)this;
	}

	/**
	*获取试卷描述 
	*/
	public java.lang.String getPaperDepict() {
		return getStr("paper_depict");
	}

	/**
	*设置出题时间 
	*/
	public M setSetThemeTime(java.util.Date setThemeTime) {
		set("set_theme_time", setThemeTime);
		return (M)this;
	}

	/**
	*获取出题时间 
	*/
	public java.util.Date getSetThemeTime() {
		return get("set_theme_time");
	}

	/**
	*设置及格分数线 
	*/
	public M setPassScore(java.lang.Integer passScore) {
		set("pass_score", passScore);
		return (M)this;
	}

	/**
	*获取及格分数线 
	*/
	public java.lang.Integer getPassScore() {
		return getInt("pass_score");
	}

	/**
	*设置总分 
	*/
	public M setSumScore(java.lang.Integer sumScore) {
		set("sum_score", sumScore);
		return (M)this;
	}

	/**
	*获取总分 
	*/
	public java.lang.Integer getSumScore() {
		return getInt("sum_score");
	}

	/**
	*设置单项选择题数 
	*/
	public M setOnlyChoiceNubmer(java.lang.Integer onlyChoiceNubmer) {
		set("only_choice_nubmer", onlyChoiceNubmer);
		return (M)this;
	}

	/**
	*获取单项选择题数 
	*/
	public java.lang.Integer getOnlyChoiceNubmer() {
		return getInt("only_choice_nubmer");
	}

	/**
	*设置多项选择题数 
	*/
	public M setMultipleChoiceNubmer(java.lang.Integer multipleChoiceNubmer) {
		set("multiple_choice_nubmer", multipleChoiceNubmer);
		return (M)this;
	}

	/**
	*获取多项选择题数 
	*/
	public java.lang.Integer getMultipleChoiceNubmer() {
		return getInt("multiple_choice_nubmer");
	}

	/**
	*设置判断题数 
	*/
	public M setJudgeNumber(java.lang.Integer judgeNumber) {
		set("judge_number", judgeNumber);
		return (M)this;
	}

	/**
	*获取判断题数 
	*/
	public java.lang.Integer getJudgeNumber() {
		return getInt("judge_number");
	}

	/**
	*设置主观题数 
	*/
	public M setSubjectiveItem(java.lang.Integer subjectiveItem) {
		set("subjective_item", subjectiveItem);
		return (M)this;
	}

	/**
	*获取主观题数 
	*/
	public java.lang.Integer getSubjectiveItem() {
		return getInt("subjective_item");
	}

	/**
	*设置单项选择分值/题 
	*/
	public M setOnlyChoiceScore(java.lang.Double onlyChoiceScore) {
		set("only_choice_score", onlyChoiceScore);
		return (M)this;
	}

	/**
	*获取单项选择分值/题 
	*/
	public java.lang.Double getOnlyChoiceScore() {
		return getDouble("only_choice_score");
	}

	/**
	*设置多项选择分值/题 
	*/
	public M setMultipleChoiceScore(java.lang.Double multipleChoiceScore) {
		set("multiple_choice_score", multipleChoiceScore);
		return (M)this;
	}

	/**
	*获取多项选择分值/题 
	*/
	public java.lang.Double getMultipleChoiceScore() {
		return getDouble("multiple_choice_score");
	}

	/**
	*设置判断题分值/题 
	*/
	public M setJudge_score(java.lang.Double judge_score) {
		set("judge__score", judge_score);
		return (M)this;
	}

	/**
	*获取判断题分值/题 
	*/
	public java.lang.Double getJudge_score() {
		return getDouble("judge__score");
	}

	/**
	*设置主观题分值/题 
	*/
	public M setSubjectiveItemScore(java.lang.Double subjectiveItemScore) {
		set("subjective_item_score", subjectiveItemScore);
		return (M)this;
	}

	/**
	*获取主观题分值/题 
	*/
	public java.lang.Double getSubjectiveItemScore() {
		return getDouble("subjective_item_score");
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
	*设置考试次数限制 
	*/
	public M setExamTimeLimit(java.lang.Integer examTimeLimit) {
		set("exam_time_limit", examTimeLimit);
		return (M)this;
	}

	/**
	*获取考试次数限制 
	*/
	public java.lang.Integer getExamTimeLimit() {
		return getInt("exam_time_limit");
	}

	/**
	*设置考试难度 
	*/
	public M setExamDifficulty(java.lang.Integer examDifficulty) {
		set("exam_difficulty", examDifficulty);
		return (M)this;
	}

	/**
	*获取考试难度 
	*/
	public java.lang.Integer getExamDifficulty() {
		return getInt("exam_difficulty");
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
