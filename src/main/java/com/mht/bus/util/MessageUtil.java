package com.mht.bus.util;

import java.io.UnsupportedEncodingException;
import java.security.*;

import com.alibaba.fastjson.JSONArray;
import com.mht.common.model.dto.MessageDto;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;



/**
 * Package: com.mht.bus.util
 * Description： TODO
 * Author: 作者
 * Date: Created in 2020/12/28 10:44
 */
public class MessageUtil {


    private static  String  appId = "prim1557709374901";  //开发者 ID
    private static  String  secretKey = "db125b69";  //开发者密码


    public static void main(String[] args) throws Exception {
        String message = sendMessage("15181716179,15181716179", "校车部门测试");
        System.out.println(message);
    }



    /**
     *
     * @param mobiles 手机号码  可为多个号码  例 13388387121,17628078958
     * @param content 短信内容
     * @return
     * @throws Exception
     */
    public static String sendMessage(String mobiles,String content) throws Exception {
        MessageDto messageDto = new MessageDto(appId,secretKey,mobiles,content,getDigest(mobiles,content));
        Object obj = JSONArray.toJSON(messageDto);
        String json = obj.toString();
        String encrypt = encrypt(json,"rmyNsXJxnDdCYCYA");
        encrypt = "rmyNsXJxnDdCYCYA"+encrypt;
//        String s1 = testInterfaces(encrypt, "http://202.115.62.13/sms");
        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod("http://202.115.62.13/sms");
        post.setRequestBody(encrypt);
        client.executeMethod(post);
        String result = new String(post.getResponseBodyAsString().getBytes("utf-8"));
//        System.out.println(result); // 打印返回消息状态
        int statusCode1 = post.getStatusCode();
        post.releaseConnection();
        return result;
    }



    /**
     *  MD5加密32 将 appId 、secretKey 、mobiles 、content 的参数值按顺序拼接，
     *  并 进行 MD5（32位 小 写 ） 计算 后 得 出 的信息摘要
     * @param mobiles 用英文符逗号隔开的手机号码
     * @param content 短信内容
     * @return
     */
    public static String  getDigest(String mobiles,String content){
        String str = appId + secretKey + mobiles + content;
        String result = "";
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        try {
            md5.update((str).getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte b[] = md5.digest();
        int i;
        StringBuffer buf = new StringBuffer("");
        for(int offset=0; offset<b.length; offset++){
            i = b[offset];
            if(i<0){
                i+=256;
            }
            if(i<16){
                buf.append("0");
            }
            buf.append(Integer.toHexString(i));
        }
        result = buf.toString();
        return result;
    }

    public static String encrypt(String data, String sKey) throws Exception {
        if (sKey == null) {
            System.out.print("Key为空null");
            return null;
        }
        // 判断Key是否为16位
        if (sKey.length() != 16) {
            System.out.print("Key长度不是16位");
            return null;
        }
        byte[] raw = sKey.getBytes();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/pkcs5padding");//"算法/模式/补码方式"
        IvParameterSpec iv = new IvParameterSpec("hfouH6789087#754".getBytes());//使用CBC模式，需要一个向量iv，可增加加密算法的强度
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] bytes = data.getBytes("UTF-8");
        byte[] encrypted = cipher.doFinal(bytes);
        String encode = new BASE64Encoder().encode(encrypted);
        return encode;//此处使用BASE64做转码功能，同时能起到2次加密的作用。
    }

}
