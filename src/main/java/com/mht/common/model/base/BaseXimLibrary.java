package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * xim_library:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXimLibrary<M extends BaseXimLibrary<M>> extends Model<M> implements IBean {

	/**
	*设置ID 
	*/
	public M setLibraryId(java.lang.Long libraryId) {
		set("library_id", libraryId);
		return (M)this;
	}

	/**
	*获取ID 
	*/
	public java.lang.Long getLibraryId() {
		return getLong("library_id");
	}

	/**
	*设置问题内容 
	*/
	public M setQuesContent(java.lang.String quesContent) {
		set("ques_content", quesContent);
		return (M)this;
	}

	/**
	*获取问题内容 
	*/
	public java.lang.String getQuesContent() {
		return getStr("ques_content");
	}

	/**
	*设置隶属角色id 
	*/
	public M setQuesType(java.lang.String quesType) {
		set("ques_type", quesType);
		return (M)this;
	}

	/**
	*获取隶属角色id 
	*/
	public java.lang.String getQuesType() {
		return getStr("ques_type");
	}

	/**
	*设置隶属角色描述 
	*/
	public M setQuesTypeDesc(java.lang.String quesTypeDesc) {
		set("ques_type_desc", quesTypeDesc);
		return (M)this;
	}

	/**
	*获取隶属角色描述 
	*/
	public java.lang.String getQuesTypeDesc() {
		return getStr("ques_type_desc");
	}

	/**
	*设置问题来源 
	*/
	public M setQuesFrom(java.lang.String quesFrom) {
		set("ques_from", quesFrom);
		return (M)this;
	}

	/**
	*获取问题来源 
	*/
	public java.lang.String getQuesFrom() {
		return getStr("ques_from");
	}

	/**
	*设置答案类型 
	*/
	public M setAnsType(java.lang.String ansType) {
		set("ans_type", ansType);
		return (M)this;
	}

	/**
	*获取答案类型 
	*/
	public java.lang.String getAnsType() {
		return getStr("ans_type");
	}

	/**
	*设置答案内容 
	*/
	public M setAnsContent(java.lang.String ansContent) {
		set("ans_content", ansContent);
		return (M)this;
	}

	/**
	*获取答案内容 
	*/
	public java.lang.String getAnsContent() {
		return getStr("ans_content");
	}

	/**
	*设置语音消息url 
	*/
	public M setAudioUrl(java.lang.String audioUrl) {
		set("audioUrl", audioUrl);
		return (M)this;
	}

	/**
	*获取语音消息url 
	*/
	public java.lang.String getAudioUrl() {
		return getStr("audioUrl");
	}

	/**
	*设置创建日期 
	*/
	public M setCreatime(java.util.Date creatime) {
		set("creatime", creatime);
		return (M)this;
	}

	/**
	*获取创建日期 
	*/
	public java.util.Date getCreatime() {
		return get("creatime");
	}

	/**
	*设置关键词 
	*/
	public M setKeyword(java.lang.String keyword) {
		set("keyword", keyword);
		return (M)this;
	}

	/**
	*获取关键词 
	*/
	public java.lang.String getKeyword() {
		return getStr("keyword");
	}

	/**
	*设置简称 
	*/
	public M setSimplecode(java.lang.String simplecode) {
		set("simplecode", simplecode);
		return (M)this;
	}

	/**
	*获取简称 
	*/
	public java.lang.String getSimplecode() {
		return getStr("simplecode");
	}

	/**
	*设置图文混排模板类型 
	*/
	public M setTemplate(java.lang.String template) {
		set("template", template);
		return (M)this;
	}

	/**
	*获取图文混排模板类型 
	*/
	public java.lang.String getTemplate() {
		return getStr("template");
	}

	/**
	*设置图片Url 
	*/
	public M setImgUrl(java.lang.String imgUrl) {
		set("imgUrl", imgUrl);
		return (M)this;
	}

	/**
	*获取图片Url 
	*/
	public java.lang.String getImgUrl() {
		return getStr("imgUrl");
	}

	/**
	*设置副标题 
	*/
	public M setSubTitle(java.lang.String subTitle) {
		set("sub_title", subTitle);
		return (M)this;
	}

	/**
	*获取副标题 
	*/
	public java.lang.String getSubTitle() {
		return getStr("sub_title");
	}

	/**
	*设置是否有效 
	*/
	public M setEffective(java.lang.String effective) {
		set("effective", effective);
		return (M)this;
	}

	/**
	*获取是否有效 
	*/
	public java.lang.String getEffective() {
		return getStr("effective");
	}

	/**
	*设置关联问题id 
	*/
	public M setQuesRelatedIds(java.lang.String quesRelatedIds) {
		set("ques_related_ids", quesRelatedIds);
		return (M)this;
	}

	/**
	*获取关联问题id 
	*/
	public java.lang.String getQuesRelatedIds() {
		return getStr("ques_related_ids");
	}

	/**
	*设置 
	*/
	public M setModelId(java.lang.Integer modelId) {
		set("model_id", modelId);
		return (M)this;
	}

	/**
	*获取 
	*/
	public java.lang.Integer getModelId() {
		return getInt("model_id");
	}

}
