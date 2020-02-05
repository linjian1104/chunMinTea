package com.liulei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



/**
 * 评价信息的控制层
 *
 * @author makejava
 * @since 2019-12-03 15:56:47
 */
@RestController
@RequestMapping("client/teaPj")
public class TeaPjController {
    private static final String URL="http://localhost:8086";

    /**
     * 服务对象
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 查询所有评价信息
     *
     * @param
     * @return 所有数据
     */
    @GetMapping("selectAll")
    public String findAll() {
        return restTemplate.getForObject(URL+"/teaPj/selectAll",String.class);
    }

}