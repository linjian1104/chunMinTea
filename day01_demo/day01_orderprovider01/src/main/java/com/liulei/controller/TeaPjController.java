package com.liulei.controller;

import com.alibaba.fastjson.JSON;
import com.liulei.service.TeaPjService;
import com.liulei.service.TeaScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 评价信息的控制层
 *
 * @author makejava
 * @since 2019-12-03 15:56:47
 */
@RestController
@RequestMapping("teaPj")
public class TeaPjController {
    /**
     * 服务对象
     */
    @Autowired
    private TeaPjService teaPjService;

    /**
     * 查询所有评价信息
     *
     * @param
     * @return 单条数据
     */
    @GetMapping("selectAll")
    public String findAll(Map<String,Object> map) {
        map.put("list",this.teaPjService.findAll());
        return JSON.toJSONString(map);
    }

}