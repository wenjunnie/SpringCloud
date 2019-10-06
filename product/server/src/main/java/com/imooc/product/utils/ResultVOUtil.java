package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * @Author: wenjun
 * @Date: 2019/9/19 16:20
 */
public class ResultVOUtil {

    public static ResultVO success(Object o) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(o);
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }
}
