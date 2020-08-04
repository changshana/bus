package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_exam_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxExamRecord<M extends BasePxExamRecord<M>> extends Model<M> implements IBean {

	/**
	*设置id 
	*/
	public M setExamRecordId(java.lang.Integer examRecordId) {
		set("exam_record_id", examRecordId);
		return (M)this;
	}

	/**
	*获取id 
	*/
	public java.lang.Integer getExamRecordId() {
		return getInt("exam_record_id");
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
	*设置试题id 
	*/
	public M setQuestionId(java.lang.Integer questionId) {
		set("question_id", questionId);
		return (M)this;
	}

	/**
	*获取试题id 
	*/
	public java.lang.Integer getQuestionId() {
		return getInt("question_id");
	}

	/**
	*设置学员答案 
	*/
	public M setStudentAnswer(java.lang.String studentAnswer) {
		set("student_answer", studentAnswer);
		return (M)this;
	}

	/**
	*获取学员答案 
	*/
	public java.lang.String getStudentAnswer() {
		return getStr("student_answer");
	}

	/**
	*设置答题状态(正确、错误) 
	*/
	public M setAnswerStatus(java.lang.Integer answerStatus) {
		set("answer_status", answerStatus);
		return (M)this;
	}

	/**
	*获取答题状态(正确、错误) 
	*/
	public java.lang.Integer getAnswerStatus() {
		return getInt("answer_status");
	}

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

}
