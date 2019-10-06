package com.imooc.order.dto;

import com.imooc.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: wenjun
 * @Date: 2019/9/20 0:36
 */
@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;//0新下单
    private Integer payStatus;//0未支付
    private List<OrderDetail> orderDetailList;
}
