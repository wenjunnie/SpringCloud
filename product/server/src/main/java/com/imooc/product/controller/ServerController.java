package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wenjun
 * @Date: 2019/9/21 21:09
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is a product msg.";
    }
}
