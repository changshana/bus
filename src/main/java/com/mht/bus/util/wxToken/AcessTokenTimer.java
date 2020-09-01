package com.mht.bus.util.wxToken;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Package: com.mht.bus.util.wxToken
 * 定时更新access_token的值  所有用户从token.properties获取
 */
public class AcessTokenTimer implements Runnable {
//    private static final String APPID = "*************";
//    private static final String APPSECRET = "*********";

    public void setToken() throws IOException {
        //得到access_token
        String url = "https://api.weixin.qq.com/cgi-bin/token";
        String param = "grant_type=client_credential&appid=" + "wx9bd39c7ee3f7315c" + "&secret=" + "bdef4a40fca943d9b15e57a3fd4f5cc0";
        String jsticket = Httprequests.sendGet(url, param);
        //存到token.properties中
        System.out.println("得到的token" + jsticket);
        updateProperties(jsticket);
    }

    /**
     * 修改properties配置文件中access_token的值
     *
     * @throws IOException
     */
    public static void updateProperties(String newToken) throws IOException {
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("").getPath().substring(1);
        FileInputStream fis = new FileInputStream(path + "token.properties");// 属性文件输入流
        byte[] buf = new byte[fis.available()];
        StringBuffer sb = new StringBuffer();
        while ((fis.read(buf)) != -1) {
            sb.append(new String(buf));
            buf = new byte[1024];// 重新生成，避免和上次读取的数据重复
        }
        String substring = sb.substring(0, 13);
        //得到修改后的字符串
        StringBuffer pr = new StringBuffer(substring + newToken);
        fis.close();// 关闭流

        // 文件输出流
        FileOutputStream fos = new FileOutputStream(path + "token.properties");
        // 将Properties集合保存到流中
        fos.write(pr.toString().getBytes());
        fos.close();// 关闭流
    }

    @Override
    public void run() {

        try {
            setToken();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
