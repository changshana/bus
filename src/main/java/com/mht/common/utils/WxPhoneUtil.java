package com.mht.common.utils;


import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.AlgorithmParameterSpec;

/**
 * @author liuxlh ， 2019/8/8.
 */
public class WxPhoneUtil{

    /**
     * TODO:在这里你需要注意了:你需要对整个返回的String做处理，把需要的那个手机号拿出来就ok了，你可以打印一下这个返回值然后处理，因为处理方式很多，我的处理方式不一定适合大家自身的习惯，所以这里改动了一下
     */
    public static JSONObject getPhoneNumberBeanS5(String decryptData, String sKey, String ivParameter) throws Exception {
       /*
       *这里你没必要非按照我的方式写，下面打代码主要是在一个自己的类中 放上decrypts5这个解密工具，工具在下方有代码
       */
        String resultMessage = decryptS5(decryptData,"UTF-8",sKey,ivParameter);
        JSONObject js=JSONObject.parseObject(resultMessage);
        return js;
    }

    /**
     * 解密工具直接放进去即可
     */
    public static String decryptS5(String sSrc, String encodingFormat, String sKey, String ivParameter) throws Exception {
        byte[] encData = Base64.decodeBase64(sSrc.getBytes());
        byte[] iv = Base64.decodeBase64(ivParameter.getBytes());
        byte[] key = Base64.decodeBase64(sKey.getBytes());
        String resultString = null;
        try {
            AlgorithmParameterSpec ivSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
            //解析解密后的字符串
            resultString = new String(cipher.doFinal(encData), "UTF-8");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultString;
    }
}

