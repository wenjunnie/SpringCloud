package com.imooc.user.VO;

import lombok.Data;

/**
 * @Author: wenjun
 * @Date: 2019/9/19 15:19
 */
@Data
public class ResultVO<T> {
    private Integer code;//错误码
    private String msg;//提示信息
    private T data;//具体内容
}
