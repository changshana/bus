package com.mht.system.service;

import java.util.List;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mht.common.model.SiteInfo;
import com.mht.common.service.CommonService;

import cn.dreampie.ValidateKit;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SiteInfoService extends CommonService {

    public static final SiteInfoService me=new SiteInfoService();

    public static final SiteInfo siteDao=new SiteInfo().dao();


    public Page<SiteInfo> paginate(int pageNumber, int pageSize,String parent_site_id,String status) {
        String filter="";
        if(!"".equals(status)){
            filter+=" and status="+status;
        }
        if("".equals(parent_site_id)){
            return siteDao.paginate(pageNumber, pageSize, "select *", "FROM `site_info` where parent_site_id is null "+filter+" order by create_time,site_id");
        }else{
            return siteDao.paginate(pageNumber, pageSize, "select *", "FROM `site_info` where parent_site_id="+parent_site_id+filter+" order by create_time,site_id");
        }

    }
    public List getOrgList(String parent_site_id,String status) {
        String filter="";
        if(!"".equals(status)){
            filter+=" and status="+status;
        }
        if("".equals(parent_site_id)){
            return siteDao.find("select * FROM `site_info` where parent_site_id is null "+filter+" order by create_time,site_id");
        }else{
            return siteDao.find("select * FROM `site_info` where parent_site_id="+parent_site_id+filter+" order by create_time,site_id");
        }

    }


    public SiteInfo findById(String id){
        return siteDao.findById(id);
    }
    public List findOrgSite(String id){
        return Db.find("select * from site_info where parent_site_id="+id+" and status=1");
    }

    public void delete(String id){
        Db.update("delete from site_info where site_id="+id);
    }

    public void save(SiteInfo siteInfo){
        siteInfo.save();
        updateSitePlatId();
    }

    public void update(SiteInfo siteInfo) {
        siteInfo.update();
        updateSitePlatId();
    }

    public void updateSitePlatId(){
        updateSql("system.updateSitePlatId");
    }

    public String findSiteName(int siteId){
        String sql = "select site_name from site_info where site_id = "+siteId;
        Record s  =  Db.findFirst(sql);
        if(s!=null){
            return s.getStr("site_name");
        }
      return null;
    }

    public String getOrgTree(String field,String platId) {
        StringBuilder sb=new StringBuilder();
        if("0".equals(platId)){platId="";}
        List<Record> records = records(Kv.by("plat_id",platId),"system.getTopOrgTree");
        setOrgTree(records,sb,field);
        return sb.toString();
    }

    public String setOrgTree(List<Record> records,StringBuilder sb,String field){
        if(!ValidateKit.isNullOrEmpty(records)){
            Record record=new Record();
            for(int i=0;i<records.size();i++){
                record=records.get(i);
                sb.append("{");
                sb.append("name:'"+record.getStr("site_name")+"',"+field+":'"+record.getStr("site_id")+"',plat:"+record.getStr("plat_id")+",");
                if(i==0){
                    sb.append("spread:true,");
                }
                /*if(ValidateKit.isNullOrEmpty(record.get("parent_site_id"))&&"value".equals(field)){
                    sb.append("disabled: true,");
                }*/
                List<Record> childs = records(Kv.by("parent_site_id", record.get("site_id")), "system.getOrgTreeByParent");
                if(!ValidateKit.isNullOrEmpty(childs)){
                    sb.append("children: [");
                    sb.append( setOrgTree(childs, new StringBuilder(),field) );
                    sb.append("]");
                }
                sb.append("},");
            }
        }
        return sb.toString();
    }
}
