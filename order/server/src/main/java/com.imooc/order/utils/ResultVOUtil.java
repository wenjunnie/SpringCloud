package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;

/**
 * @Author: wenjun
 * @Date: 2019/9/20 21:11
 */
public class ResultVOUtil {

    public static ResultVO success(Object o) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(o);

        return resultVO;
    }
}
