package com.imooc.product.common;

import lombok.Data;

/**
 * @Author: wenjun
 * @Date: 2019/9/22 16:33
 */
@Data
public class DecreaseStockInput {
    private String productId;
    private Integer productQuantity;

    //写了构造方法后加了@Data使原来无参失效，得加上
    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
