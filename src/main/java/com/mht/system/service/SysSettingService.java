package com.mht.system.service;

import java.util.List;

import com.mht.common.model.SysSetting;
import com.mht.common.service.CommonService;

/**
 * @author xionggy ， 2018/3/27.
 */
public class SysSettingService extends CommonService {

    public static final SysSettingService me=new SysSettingService();

    public static final SysSetting settingDao=new SysSetting().dao();

    public void save(SysSetting sysSetting){
        sysSetting.save();
    }


    public SysSetting findOne() {
        List<SysSetting> sysSettings = settingDao.find("select * from sys_setting limit 1");
        if (sysSettings.size() == 0) {
            return new SysSetting();
        }
        return sysSettings.get(0);
    }

    /**
     * 更新
     */
    public void update(SysSetting sysSetting) {
        sysSetting.update();
    }






}
