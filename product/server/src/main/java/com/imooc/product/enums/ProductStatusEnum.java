package com.imooc.product.enums;

import lombok.Getter;

/**
 * @Author: wenjun
 * @Date: 2019/9/18 21:48
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    Down(1, "下架"),
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
