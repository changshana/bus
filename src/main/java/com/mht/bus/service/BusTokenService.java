package com.mht.bus.service;

import com.mht.common.model.BusToken;
import com.mht.common.service.CommonService;

/**
 * Package: com.mht.bus.service
 * Description： TODO
 * Author: 作者
 * Date: Created in 2020/7/21 10:04
 * Company: 公司
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 * Modified By:
 */
public class BusTokenService extends CommonService {
    public static final BusTokenService me=new BusTokenService();

    public void save(BusToken busToken){
        busToken.save();
    }
}
