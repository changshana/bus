package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * px_exam_assess:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePxExamAssess<M extends BasePxExamAssess<M>> extends Model<M> implements IBean {

	/**
	*设置评价id 
	*/
	public M setAssessId(java.lang.Integer assessId) {
		set("assess_id", assessId);
		return (M)this;
	}

	/**
	*获取评价id 
	*/
	public java.lang.Integer getAssessId() {
		return getInt("assess_id");
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
	*设置评价内容 
	*/
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	/**
	*获取评价内容 
	*/
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	*设置评价日期 
	*/
	public M setAssessDatetime(java.util.Date assessDatetime) {
		set("assess_datetime", assessDatetime);
		return (M)this;
	}

	/**
	*获取评价日期 
	*/
	public java.util.Date getAssessDatetime() {
		return get("assess_datetime");
	}

}
