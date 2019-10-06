package com.imooc.order.controller;

import com.imooc.order.VO.ResultVO;
import com.imooc.order.converter.OrderForm2OrderDTOConvert;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.OrderException;
import com.imooc.order.form.OrderForm;
import com.imooc.order.service.OrderService;
import com.imooc.order.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wenjun
 * @Date: 2019/9/20 0:35
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm,
                           BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            log.error("【创建订单】参数不正确， orderForm={}", orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode()
                    ,bindingResult.getFieldError().getDefaultMessage());//获得@NotEmpty中信息
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConvert.convert(orderForm);
        if(orderDTO.getOrderDetailList().isEmpty()) {
            log.error("【创建订单】购物车信息为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }

        OrderDTO result = orderService.create(orderDTO);

        Map<String,String> map = new HashMap<>();
        map.put("orderId", result.getBuyerOpenid());

        return ResultVOUtil.success(map);
    }

    @PostMapping("/finish")
    public ResultVO<OrderDTO> finish(@RequestParam("orderId") String orderId) {
        return ResultVOUtil.success(orderService.finish(orderId));
    }
}
