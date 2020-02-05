package com.lin.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URLEncoder;

/**
 * @author: liulei
 * @date: 2019/12/10 9:41
 * @describe:
 */
@RestController
@RequestMapping("spCar")
public class ShoppingCarController {
    //    订单服务提供者模块的url前缀
    private static final String ORDER_PROVIDER_URL_PREFIX = "http://localhost:8086";

    @Resource
    private RestTemplate restTemplate;

    //加入购物车
    @PostMapping("/ShoppingCar")
    public String shoppingCar(@RequestParam(value = "openid") String openid, @RequestParam(value = "shangping")String shangping){
        String encode1 = URLEncoder.encode(shangping);
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/spCar/ShoppingCar/shangping="+encode1+"&openid="+openid,String.class);
    }
   // 查询购物车 根据openid
    @PostMapping("/selectShoppingCar")
    public String sh_car(@RequestParam("openid")String openid){
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/spCar/selectShoppingCar/openid="+openid,String.class);
    }
    //删除购物车商品 根据name openid
    @PostMapping("/delShoppingCar")
    public void del_car(@RequestParam(value = "openid")String openid,@RequestParam(value = "name") String name){
        restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/spCar/delShoppingCar/openid="+openid+"&name="+name,String.class);
    }

    //下单,删除购物车对应商品 根据name openid
    @PostMapping("/delAll")
    public void deleteAll(@RequestParam("date") String date,@RequestParam("openid")String openid) {
        String encode1 = URLEncoder.encode(date);
        restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/spCar/delAll/date="+encode1+"&openid="+openid,String.class);
    }
}
