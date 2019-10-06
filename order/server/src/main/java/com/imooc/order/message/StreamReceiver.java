package com.imooc.order.message;

import com.imooc.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @Author: wenjun
 * @Date: 2019/9/26 1:02
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

    /**
     * 接收MQ消息
     */
//    @StreamListener(StreamClient.OUTPUT)
//    //@SendTo(StreamClient.OUTPUT)
//    public void processInput(OrderDTO message) {
//        log.info("StreamReceiver:{}", message);
//    }

//    @StreamListener(StreamClient.INPUT)
//    public void processOutput(OrderDTO message) {
//        log.info("StreamReceiver:{}", message);
//    }
}
