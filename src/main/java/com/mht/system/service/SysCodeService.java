package com.mht.system.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.mht.common.model.SysCode;
import com.mht.common.service.CommonService;

import org.apache.commons.lang3.StringUtils;

public class SysCodeService extends CommonService {
    public static final SysCodeService me=new SysCodeService();
    public static final SysCode codeDao=new SysCode().dao();


    /**
     * 查询码值种类
     * @param pageNumber
     * @param pageSize
     * @return
     */
    public static Page<SysCode> getCodeTypeListPage(int pageNumber, int pageSize) {
        return codeDao.paginate(pageNumber, pageSize, "SELECT CONCAT(code.code_type,'----(',code.code_name,')') AS codeType,code.code_type as code_type", " FROM (SELECT DISTINCT(code_type) AS code_type,code_name FROM sys_code) code");
    }

    /**
     * 分页查询问答库数据
     * @param pageNumber
     * @param pageSize
     * @param search_param 检索关键词
     * @return
     */
    public Page<SysCode> getCodeList(int pageNumber, int pageSize, String search_param,String codeType,String status) {
        return codeDao.paginate(pageNumber,pageSize,"select a.*,(SELECT NAME FROM sys_code WHERE code_type='EFFECTIVE' AND code_value=a.status) AS status_dsc",
                " from sys_code a where (code_name like '%"+search_param+"%' or code_type like '%"+search_param+"%' or name like '%"+search_param+"%')" +
                        ("".equals(status)?" ":" and status='"+status+"'")
                        +("".equals(codeType)?" ":" and code_type='"+codeType+"'")
                        +" order by code_type,code_value ASC");
    }


    /**
     * 启用或禁用
     * @param code_id
     * @param status
     */
    public void updateStatus(String code_id,String status){
        Db.update("update sys_code set status="+status+" where id="+code_id);
    }

    /**
     * 查询单条数据
     * @param id
     * @return
     */
    public SysCode findById(int id){

        return codeDao.findById(id);
    }

    /**
     * 删除一条记录
     * @param id
     */
    public void  delete(int id){
        Db.update("delete from sys_code where id=?",id);
    }

    /**
     * 新增一条记录
     * @param sysCode
     */
    public void save(SysCode sysCode){
        sysCode.save();
    }

    /**
     * 修改一条记录
     * @param sysCode
     */
    public void update(SysCode sysCode){
        sysCode.update();
    }

}