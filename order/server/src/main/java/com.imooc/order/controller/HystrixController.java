package com.imooc.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @Author: wenjun
 * @Date: 2019/10/5 13:23
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

//    显示fallback
//    @HystrixCommand(fallbackMethod = "fallback")
//    显示defaultFallback
//    @HystrixCommand
//    超时设置（默认1000ms）
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
//    })
//    熔断设置
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//设置熔断
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求数达到后才计算
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//休眠时间窗
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//错误率
//    })
    @HystrixCommand
    @GetMapping("/getProductInfoList")
    public String getProductInfoList(@RequestParam("number") Integer number ) {
        if(number % 2 == 0) return "success";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://localhost:8005/product/listForOrder", Arrays.asList("157875196366160022"),String.class);
    }

    private String fallback() {
        return "太拥挤了，请稍后再试~~";
    }

    private String defaultFallback() {
        return "默认提示：太拥挤了，请稍后再试~~";
    }
}
