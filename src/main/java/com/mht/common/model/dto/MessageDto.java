package com.mht.common.model.dto;

import java.io.Serializable;

/**
 * Package: com.mht.common.model.dto
 * Description： TODO
 * Author: 作者
 * Date: Created in 2020/12/28 15:02
 * Company: 公司
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 * Modified By:
 */
public class MessageDto  implements Serializable {
    private String appId;
    private String secretKey;
    private String mobiles;
    private String content;
    private String digest;

    public MessageDto() {
    }

    public MessageDto(String appId, String secretKey, String mobiles, String content, String digest) {
        this.appId = appId;
        this.secretKey = secretKey;
        this.mobiles = mobiles;
        this.content = content;
        this.digest = digest;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getMobiles() {
        return mobiles;
    }

    public void setMobiles(String mobiles) {
        this.mobiles = mobiles;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
}
