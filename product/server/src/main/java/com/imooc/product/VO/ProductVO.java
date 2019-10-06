package com.imooc.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: wenjun
 * @Date: 2019/9/19 15:21
 */
@Data
public class ProductVO {
    @JsonProperty("name")//返回前端显示
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
}
