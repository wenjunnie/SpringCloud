package com.imooc.order.dto;

import lombok.Data;

/**
 * @Author: wenjun
 * @Date: 2019/9/22 16:33
 */
@Data
public class CartDTO {
    private String productId;
    private Integer productQuantity;

    //写了构造方法后加了@Data使原来无参失效，得加上
    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
