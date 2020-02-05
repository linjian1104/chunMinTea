package com.liulei.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * (Orderlist)表控制层
 *  订单详情页
 * @author makejava
 * @since 2019-12-05 14:14:26
 */
@RestController
@RequestMapping("client/orderList")
public class OrderlistController {
        /**
         * 服务对象
         */
        @Autowired
        private RestTemplate restTemplate;

        /**
         * 查询用户所有订单
         *
         * @return
         */
        @PostMapping("findUserAll")
        public String findUserAll(@RequestParam("openid") String openid, @RequestParam("date") String date) {
                return restTemplate.getForObject("http://localhost:8086/orderList/findUserAll/openid="+openid+"&name="+date, String.class);
        }

        /**
         * 查询所有用户所有订单
         *
         * @return
         */
        @RequestMapping("findAll")
        public String findAll() {
                return restTemplate.getForObject("http://localhost:8086/orderList/findAll", String.class);
        }
}