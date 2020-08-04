package com.mht.common.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class MD5 {
    public static String AESEncode(String encodeRules, String content)
    {
        try
        {
            KeyGenerator keygen = KeyGenerator.getInstance("AES");

            keygen.init(128, new SecureRandom(encodeRules.getBytes()));

            SecretKey original_key = keygen.generateKey();

            byte[] raw = original_key.getEncoded();

            SecretKey key = new SecretKeySpec(raw, "AES");

            Cipher cipher = Cipher.getInstance("AES");

            cipher.init(1, key);

            byte[] byte_encode = content.getBytes("utf-8");

            byte[] byte_AES = cipher.doFinal(byte_encode);

            return new String(new BASE64Encoder().encode(byte_AES));
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchPaddingException e)
        {
            e.printStackTrace();
        }
        catch (InvalidKeyException e)
        {
            e.printStackTrace();
        }
        catch (IllegalBlockSizeException e)
        {
            e.printStackTrace();
        }
        catch (BadPaddingException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static String AESDncode(String encodeRules, String content)
    {
        try
        {
            KeyGenerator keygen = KeyGenerator.getInstance("AES");

            keygen.init(128, new SecureRandom(encodeRules.getBytes()));

            SecretKey original_key = keygen.generateKey();

            byte[] raw = original_key.getEncoded();

            SecretKey key = new SecretKeySpec(raw, "AES");

            Cipher cipher = Cipher.getInstance("AES");

            cipher.init(2, key);

            byte[] byte_content = new BASE64Decoder().decodeBuffer(content);

            byte[] byte_decode = cipher.doFinal(byte_content);
            return new String(byte_decode, "utf-8");
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchPaddingException e)
        {
            e.printStackTrace();
        }
        catch (InvalidKeyException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (IllegalBlockSizeException e)
        {
            System.err.println("输入的密文长度必须为16的倍数");
        }
        catch (BadPaddingException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
