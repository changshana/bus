package com.mht.wxPay;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class MyConfig extends WXPayConfig {

    private byte[] certData;
    private static  MyConfig instance=new MyConfig();

    public MyConfig() {
        InputStream certStream=null;
        try{
            InputStream stream = getClass().getClassLoader().getResourceAsStream("/cert/apiclient_cert.p12");
            File targetFile = new File("apiclient_cert.p12");
            FileUtils.copyInputStreamToFile(stream, targetFile);
            certStream= new FileInputStream(targetFile);
            this.certData = new byte[(int) targetFile.length()];
            certStream.read(this.certData);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("文件不存在："+e.getMessage());
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("io错误："+e.getMessage());
        }finally {
            try {
                certStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static final MyConfig getInstance(){
        return instance;
    }

    public String getAppID() {
        return "wx3b93735a3e04b33d";
    }
    public String getMchID() {
        return "1605702588";
    }
    public String getKey() {
        return "d51ab42f0a330a8f084b49f223313b45";
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

    @Override
    IWXPayDomain getWXPayDomain() {
        return new IWXPayDomain() {
            public void report(String domain, long elapsedTimeMillis, Exception ex) {

            }

            public DomainInfo getDomain(WXPayConfig config) {
                return new DomainInfo(WXPayConstants.DOMAIN_API, true);
            }
        };
    }
}