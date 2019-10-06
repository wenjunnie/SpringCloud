package com.imooc.user.utils;

import com.imooc.user.VO.ResultVO;
import com.imooc.user.enums.ResultEnum;

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

    public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO error(ResultEnum resultEnum) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMessage());
        return resultVO;
    }
}
