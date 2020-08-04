package com.mht.system.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.model.PmField;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class PmFieldService extends CommonService {

    public static final PmFieldService me=new PmFieldService();

    public static final PmField pmFieldDao=new PmField().dao();


    public Page<PmField> paginate(int pageNumber, int pageSize,String table_id, String search_param) {
        String filter="";
        if(!"".equals(search_param)){
            filter+=" and field_name like '%"+search_param+"%' ";
        }
        return pmFieldDao.paginate(pageNumber, pageSize, "select *", "FROM `pm_field` where table_id="+table_id+filter+" order by order_code");
    }

    public List<Record> getPmFieldList(String table_id){
        return Db.find("select a.*,(select count(1) from information_schema.columns where table_name=b.table_name and COLUMN_NAME=a.field_name) as is_exist from pm_field a,pm_table b where a.table_id=b.table_id and a.table_id="+table_id+" order by a.order_code");
    }



    public PmField findById(String id){
        return pmFieldDao.findById(id);
    }

    public void delete(String id){
        Db.update("delete from pm_field where field_id="+id);
    }

    public void save(PmField pmField){
        pmField.save();
    }

    public void update(PmField pmField) {
        pmField.update();
    }

    public List<PmField> findFieldByName(String field_name,String table_id,String field_id) {
        if(field_id.isEmpty()){
            return pmFieldDao.find("select * from pm_field where table_id="+table_id+" and field_name ='"+field_name+"'");
        }else{
            return pmFieldDao.find("select * from pm_field where table_id="+table_id+" and field_name ='"+field_name+"' and field_id !="+field_id);
        }
    }

    public void updateOrderCode(Integer fieldId,Integer orderCode){
        Db.update("update pm_field set order_code="+orderCode+" where field_id="+fieldId);
    }

    public List<PmField> findList(String table_id) {
        return pmFieldDao.find("select * from pm_field where table_id="+table_id);
    }
    public String findPrimaryKeyName(String table_id) {
        List<Record> records = Db.find("select field_name from pm_field where table_id=" + table_id + " and field_iskey=1");
        return records.size()>0?records.get(0).getStr("field_name"):"";
    }

    public String getMaxOrderCode() {
        return Db.find("select max(order_code) as max_code from pm_field").get(0).getStr("max_code");
    }

}
