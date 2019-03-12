package com.bupt.account.enums;

import lombok.Getter;

/**
 * 用户目前状态
 */
@Getter
public enum  UserStatus {
    ONLINE(0,"在线"),
    Offline(1,"离线"),
    DELETED(2,"已注销账户"),
    ;
    private Integer code;
    private String message;
    UserStatus(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
