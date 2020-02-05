package com.liulei.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

/**
 * 收藏信息的控制层
 * @author: liulei
 * @date: 2019/12/4 13:35
 * @describe:
 */
@RestController
@RequestMapping("client/teaSc")
public class TeaScController {
    private static final String URL="http://localhost:8086";
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("findByOpenId")
    public String findByOpenId(@RequestParam("openid") String openid){
        return restTemplate.getForObject(URL+"teaSc/findByOpenId/openid="+openid,String.class);
    }

    @PostMapping("delect")
    public void delectByOpenId(@RequestParam("openid") String openid,@RequestParam("name") String name){
        restTemplate.getForObject(URL+"/teaSc/delect/openid="+openid+"&name="+name,String.class);
    }

    @PostMapping("insert")
    public String insert(@RequestParam("date") String date,@RequestParam("openid") String openid){
        String decode = URLEncoder.encode(date);
        return restTemplate.getForObject(URL+"/teaSc/insert/date="+decode+"&openid="+openid,String.class);
    }
}
