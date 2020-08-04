package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * comment_grade:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCommentGrade<M extends BaseCommentGrade<M>> extends Model<M> implements IBean {

	/**
	*设置 
	*/
	public M setGradeId(java.lang.Integer gradeId) {
		set("grade_id", gradeId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGradeId() {
		return getInt("grade_id");
	}

	/**
	*设置 
	*/
	public M setGradeExperience(java.lang.Integer gradeExperience) {
		set("grade_experience", gradeExperience);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGradeExperience() {
		return getInt("grade_experience");
	}

	/**
	*设置 
	*/
	public M setGradeState(java.lang.Integer gradeState) {
		set("grade_state", gradeState);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGradeState() {
		return getInt("grade_state");
	}

	/**
	*设置 
	*/
	public M setGradeWealth(java.lang.Integer gradeWealth) {
		set("grade_wealth", gradeWealth);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getGradeWealth() {
		return getInt("grade_wealth");
	}

}
