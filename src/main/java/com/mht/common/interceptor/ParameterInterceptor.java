package com.mht.common.interceptor;

import cn.dreampie.ValidateKit;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
import com.jfinal.kit.PropKit;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

public class ParameterInterceptor implements Interceptor {

    public void intercept(Invocation inv) {
        Controller controller = inv.getController();
        String controllerKey = inv.getControllerKey();
        String type = controller.getRequest().getHeader("X-Requested-With");
        if(ValidateKit.isNullOrEmpty(controller.getSessionAttr("theme"))){
            controller.getSession().setAttribute("theme","yzs");
        }
        try {
            String security_url = PropKit.use("security_url.properties").get("security_url");
            String no_security_url = PropKit.use("security_url.properties").get("no_security_url");
            String[] urls = security_url.split(",");
            String[] no_security_urls = no_security_url.split(",");
            boolean security=false;
            for(String url:Arrays.asList(urls)){
                if(controllerKey.substring(0,controllerKey.lastIndexOf("/")).indexOf(url)>=0){
                    security=true;
                }
            }
            for(String url:Arrays.asList(no_security_urls)){
                if(controllerKey.indexOf(url)>=0){
                    security=false;
                }
            }
            if(security){
                if(ValidateKit.isNullOrEmpty(controller.getSessionAttr("user"))||ValidateKit.isNullOrEmpty(controller.getSessionAttr("plat_id"))){
                    if("XMLHttpRequest".equals(type)){
                        controller.getResponse().setHeader("SESSIONSTATUS", "TIMEOUT");
                        controller.getResponse().setHeader("CONTEXTPATH", "error");
                        controller.getResponse().setStatus(HttpServletResponse.SC_REQUEST_TIMEOUT);
                    }else{
                        throw new NullPointerException();
                    }
                }else{
                    inv.invoke();
                }
            }else{
                inv.invoke();
            }
        }catch (NullPointerException e){
            controller.redirect("/error");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
