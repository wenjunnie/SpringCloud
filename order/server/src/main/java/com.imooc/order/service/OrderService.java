package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @Author: wenjun
 * @Date: 2019/9/20 0:35
 */
public interface OrderService {
    OrderDTO create(OrderDTO orderDTO);//创建订单
    OrderDTO finish(String orderId);//完结订单（只能卖家操作）
}
