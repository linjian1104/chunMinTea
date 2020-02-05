package com.zhang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: liulei
 * @date: 2019/12/13 13:48
 * @describe:
 */
@RestController
@RequestMapping("client/checkIn")
public class CheckInController {

    //订单服务提供者模块的url前缀
    private static final String ORDER_PROVIDER_URL_PREFIX = "http://localhost:8086";
    @Resource
    private RestTemplate restTemplate;

    /**
     * 保存员工的打卡信息
     * */
    @RequestMapping("check")
    public Boolean saveCheckInTime(
            @RequestParam("time")String time,
            @RequestParam("username")String username)
    {

        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/staClient/check/time="+time+"&username="+username,Boolean.class);
    }
    /**
     * 查询单个员工的打卡信息
     * */
    @RequestMapping("selectByTelephone")
    public String selectByTelephone(@RequestParam("username")String username)
    {
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/staClient/selectByTelephone/username="+username,String.class);
    }

}
