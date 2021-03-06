package cn.boommanpro.wechat.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author BoomMan 59232311@qq.com
 * 微信用户数据解密:
 * https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/signature.html
 */
@Data(staticConstructor = "of")
@Accessors(chain = true)
public class WeChatAccountInfo {

    private String nickName;
    private Integer gender;
    private String language;
    private String city;
    private String province;
    private String country;
    private String avatarUrl;
    private String openId;
    private String unionId;


}
