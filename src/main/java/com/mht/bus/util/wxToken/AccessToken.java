package com.mht.bus.util.wxToken;

/**
 * Package: com.mht.bus.util.wxToken
 * 实体类
 */
public class AccessToken {
    private String accessToken;
    private int expiresin;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresin() {
        return expiresin;
    }

    public void setExpiresin(int expiresin) {
        this.expiresin = expiresin;
    }
}
