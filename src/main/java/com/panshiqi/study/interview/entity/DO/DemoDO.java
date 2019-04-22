
package com.panshiqi.study.interview.entity.DO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DemoDO extends BaseDO {

    /**
     * 用户名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号类型
     */
    private String accountType;

    /**
     * 渠道id
     */
    private String channelId;

    /**
     * 账号状态
     */
    private String status;

    /**
     * 昵称
     */
    private String nickName;

}
