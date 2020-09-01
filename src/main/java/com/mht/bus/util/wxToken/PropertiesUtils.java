package com.mht.bus.util.wxToken;

import com.jfinal.config.Constant;
import com.jfinal.kit.PathKit;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Properties;

/**
 * Package: com.mht.bus.util.wxToken
 * Description： TODO
 * Author: 作者
 * Date: Created in 2020/9/1 11:21
 * Company: 公司
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 * Modified By:
 */
public class PropertiesUtils {

    private static final String LOCATION = "token.properties";

    private static Properties properties = new Properties();

    /**
     * 根据KEY获取参数
     * @return
     */
    public static String getProperties(){

//        String path = PathKit.class.getClassLoader().getResource("").toURI().getPath();
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("").getPath().substring(1);
        FileInputStream fis = null;// 属性文件输入流
        StringBuffer sb = new StringBuffer();
        try {
            fis = new FileInputStream(path + "token.properties");
            byte[] buf = new byte[fis.available()];
        while ((fis.read(buf)) != -1) {
            sb.append(new String(buf));
            buf = new byte[1024];// 重新生成，避免和上次读取的数据重复
        }
        sb = sb.replace(0,13,"");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
