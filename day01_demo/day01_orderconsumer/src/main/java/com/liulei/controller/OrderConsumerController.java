package com.liulei.controller;/**
 * @author liulei
 * @data 2019/12/8 0008-下午 9:15
 */


import com.liulei.entity.Allcontent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**所有商品详情
 *@author: liulei
 *@date: 2019/12/8 0008 下午 9:15
 *@describe:
 */
@RestController
@RequestMapping("customer/food")
public class OrderConsumerController {
//    订单服务提供者模块的url前缀
    private static final String ORDER_PROVIDER_URL_PREFIX = "http://localhost:8086";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("search/{name}")
    @ResponseBody
    public List<Allcontent> findAllByKeyWords(@PathVariable(value = "name") String name){
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/food/search/"+name,List.class);
    }


    @GetMapping("findAll")
    public String getAll(){
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/food/findAll",String.class);
    }
}
