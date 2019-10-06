package com.imooc.user.enums;

import lombok.Getter;

/**
 * @Author: wenjun
 * @Date: 2019/9/30 19:41
 */
@Getter
public enum RoleEnum {
    BUYER(1,"买家"),
    SELLER(2,"卖家"),
    ;

    private Integer code;
    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
