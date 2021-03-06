package cn.boommanpro.wechat.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author BoomMan  59232311@qq.com
 * 微信解密数据
 */
@Getter
@Setter
@ToString
public class WeChatDecryptForm {
    /**
     * 用户加密信息
     **/
    private String encryptedData;
    /**
     * 加密算法的初始向量
     **/
    private String iv;
    /**
     * 加密签名的密钥
     **/
    private String sessionKey;

    public WeChatDecryptForm(String encryptedData, String iv, String sessionKey) {
        this.encryptedData = encryptedData;
        this.iv = iv;
        this.sessionKey = sessionKey;
    }
}
