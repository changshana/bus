package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * xim_ques_related:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXimQuesRelated<M extends BaseXimQuesRelated<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setQuesRelatedId(java.lang.Integer quesRelatedId) {
		set("ques_related_id", quesRelatedId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Integer getQuesRelatedId() {
		return getInt("ques_related_id");
	}

	/**
	*设置关联问题 
	*/
	public M setRelatedContent(java.lang.String relatedContent) {
		set("related_content", relatedContent);
		return (M)this;
	}

	/**
	*获取关联问题 
	*/
	public java.lang.String getRelatedContent() {
		return getStr("related_content");
	}

	/**
	*设置问题id 
	*/
	public M setLibraryId(java.lang.Integer libraryId) {
		set("library_id", libraryId);
		return (M)this;
	}

	/**
	*获取问题id 
	*/
	public java.lang.Integer getLibraryId() {
		return getInt("library_id");
	}

	/**
	*设置匹配度 
	*/
	public M setMatchedDegree(java.lang.Integer matchedDegree) {
		set("matched_degree", matchedDegree);
		return (M)this;
	}

	/**
	*获取匹配度 
	*/
	public java.lang.Integer getMatchedDegree() {
		return getInt("matched_degree");
	}

	/**
	*设置训练状态(已学习：1，未学习：0) 
	*/
	public M setTrainStatus(java.lang.String trainStatus) {
		set("train_status", trainStatus);
		return (M)this;
	}

	/**
	*获取训练状态(已学习：1，未学习：0) 
	*/
	public java.lang.String getTrainStatus() {
		return getStr("train_status");
	}

}
