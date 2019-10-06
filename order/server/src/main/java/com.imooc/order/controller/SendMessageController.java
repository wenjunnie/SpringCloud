package com.imooc.order.controller;

import com.imooc.order.dto.OrderDTO;
import com.imooc.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: wenjun
 * @Date: 2019/9/26 1:05
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    /**
     * 发送MQ消息
     */
//    @GetMapping("/sendMessage")
//    public void process() {
//        streamClient.output().send(MessageBuilder.withPayload("now" + new Date()).build());
//    }

    @GetMapping("/sendMessage")
    public void process() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("111");
        streamClient.output().send(MessageBuilder.withPayload(orderDTO).build());
    }
}
