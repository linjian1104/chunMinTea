package com.lin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: liulei
 * @date: 2019/12/16 10:18
 * @describe:
 */
@RestController
@RequestMapping("/client/shoppingCar/selectCount")
public class SelectCountByName {
    private static final String ORDER_PROVIDER_URL_PREFIX = "http://localhost:8086";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/ByName")
    int selectCountByName(@RequestParam("name")String name){
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/food/selectCount/"+name,int.class);
    }
}
