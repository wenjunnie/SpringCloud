package com.imooc.product.common;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: wenjun
 * @Date: 2019/9/18 21:10
 */
@Data
//@Table(name = "T_xx")
public class ProductInfoOutput {
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
