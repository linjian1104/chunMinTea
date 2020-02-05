package com.liulei.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liulei.entity.TeaSc;
import com.liulei.service.TeaScService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("teaSc")
public class TeaScController {
    @Autowired
    private TeaScService teaScService;
    @RequestMapping("findByOpenId/openid={openid}")
    public String findByOpenId(Map<String,Object> map, @PathVariable("openid") String openid){
        map.put("list",teaScService.findByOpenId(openid));
        return JSON.toJSONString(map);
    }

    @RequestMapping("delect/openid={openid}&name={name}")
    public String delectByOpenId(@PathVariable("openid") String openid,@PathVariable("name") String name){
        int i = teaScService.deleteByOpenId(openid, name);
        return "success";
    }

    @RequestMapping("insert/date={date}&openid={openid}")
    public String insert(@PathVariable("date") String date,@PathVariable("openid") String openid){
        String encode = URLDecoder.decode(date);
        JSONObject jsonObject = JSON.parseObject(encode);
        TeaSc teaSc = new TeaSc();
        if(openid==""){
            return "false";
        }else {
            teaSc.setOpenId(openid);
            teaSc.setContent(jsonObject.getString("content"));
            teaSc.setImage(jsonObject.getString("image"));
            teaSc.setName(jsonObject.getString("name"));
            teaSc.setNum(Integer.parseInt(jsonObject.getString("num")));
            teaSc.setPrice(Double.parseDouble(jsonObject.getString("price")));
            teaSc.setType(jsonObject.getString("type"));
            teaScService.insertByOpenId(teaSc);
            return "liulei";
        }
    }

}
