package com.zhang.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: liulei
 * @date: 2019/12/12 9:55
 * @describe:
 */
@RestController
@RequestMapping("staClient")
public class StaffClientController {
    //订单服务提供者模块的url前缀
    private static final String ORDER_PROVIDER_URL_PREFIX = "http://localhost:8086";

    @Resource
    private RestTemplate restTemplate;
    //1.员工信息查询
    @RequestMapping("selectInfo")
    public String userInfo(@RequestParam("telephone") String telephone){
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/staClient/selectInfo/telephone="+telephone,String.class);
    }
    //2.登录
    @PostMapping("login")
    public boolean login(@RequestParam("tel") String tel,@RequestParam("pwd") String pwd){
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/staClient/login/telephone="+tel+"&password="+pwd,boolean.class);
    }
    //3.获取验证码
     @PostMapping("getYzm")
    public String yzm(@RequestParam("telephone") String telephone){
         return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/staClient/getYzm/telephone="+telephone,String.class);
     }
     //4.修改密码
     @PostMapping("update_pwd")
    public boolean update_pwd(@RequestParam("telephone")String telephone,@RequestParam("newPassword")String newPassword){
         return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX+"/staClient/update_pwd/telephone="+telephone+"&newPassword="+newPassword,boolean.class);
     }
}
