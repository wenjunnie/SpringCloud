package com.imooc.order.VO;

import lombok.Data;

/**
 * @Author: wenjun
 * @Date: 2019/9/20 21:10
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
