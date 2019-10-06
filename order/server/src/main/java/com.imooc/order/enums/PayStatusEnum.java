package com.imooc.order.enums;

import lombok.Getter;

/**
 * @Author: wenjun
 * @Date: 2019/9/19 17:06
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
