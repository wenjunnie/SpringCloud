package com.imooc.order.controller;

import com.imooc.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wenjun
 * @Date: 2019/9/24 19:48
 */
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("girl/print")
    public String print() {
         return girlConfig.getName() + girlConfig.getAge();
    }
}
