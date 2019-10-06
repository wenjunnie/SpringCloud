package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @Author: wenjun
 * @Date: 2019/9/22 16:57
 */
public class ProductException extends RuntimeException{
    private Integer code;

    public ProductException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
