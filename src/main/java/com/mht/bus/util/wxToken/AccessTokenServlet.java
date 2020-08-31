package com.mht.bus.util.wxToken;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Package: com.mht.bus.util.wxToken
 * 定时任务
 */
public class AccessTokenServlet extends HttpServlet {



    public void init() throws ServletException {
        //获取servlet初始参数appid和appsecret（参数在web.xml配置），并赋值给TokenThread对应的静态全局变量。
        //TokenThread.appId和TokenThread.appSecret是静态的
        TokenThread.appId = "wx9bd39c7ee3f7315c";
        TokenThread.appSecret = "bdef4a40fca943d9b15e57a3fd4f5cc0";
        System.out.println("appid:"+TokenThread.appId);
        System.out.println("appSecret:"+TokenThread.appSecret);
        new Thread(new TokenThread()).start(); //启动进程
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
