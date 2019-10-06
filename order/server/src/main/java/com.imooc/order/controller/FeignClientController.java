//package com.imooc.order.controller;
//
//import com.imooc.order.client.ProductClient;
//import com.imooc.order.dto.CartDTO;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Arrays;
//
///**
// * 使用Feign实现服务间调用,不能与RestTemplate同时使用
// * @Author: wenjun
// * @Date: 2019/9/21 23:33
// */
//@RestController
//@Slf4j
//public class FeignClientController {
//
//    @Autowired
//    private ProductClient productClient;
//
//    @GetMapping("/getProductMsg")
//    public String getProductMsg() {
//        String response = productClient.productMsg();
//        log.info("response={}", response);
//        return response;
//    }
//
//    @GetMapping("/getProductList")
//    public String getProductList() {
//        productClient.listForOrder(Arrays.asList("157875196366160022"));
//        return "ok";
//    }
//
//    @GetMapping("/productDecreaseStock")
//    public String productDecreaseStock() {
//        productClient.decreaseStock(Arrays.asList(new CartDTO("157875196366160022",4)));
//        return "ok";
//    }
//}
