package com.imooc.user.enums;

import lombok.Getter;

/**
 * @Author: wenjun
 * @Date: 2019/9/22 16:59
 */
@Getter
public enum ResultEnum {
    LOGIN_FAIL(1,"登录失败"),
    ROLE_ERROR(2,"角色权限有误"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
