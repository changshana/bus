package com.mht.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * personnel_change_record:( do not modify this file.)
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonnelChangeRecord<M extends BasePersonnelChangeRecord<M>> extends Model<M> implements IBean {

	/**
	*设置id 
	*/
	public M setChangeRecordId(java.lang.Integer changeRecordId) {
		set("change_record_id", changeRecordId);
		return (M)this;
	}

	/**
	*获取id 
	*/
	public java.lang.Integer getChangeRecordId() {
		return getInt("change_record_id");
	}

	/**
	*设置合同变更id 
	*/
	public M setContractChangeId(java.lang.Integer contractChangeId) {
		set("contract_change_id", contractChangeId);
		return (M)this;
	}

	/**
	*获取合同变更id 
	*/
	public java.lang.Integer getContractChangeId() {
		return getInt("contract_change_id");
	}

}
