package com.liulei.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liulei.entity.ShoppingCar;
import com.liulei.service.ShoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLDecoder;
import java.util.Map;

/**
 * @author: liulei
 * @date: 2019/12/10 9:41
 * @describe:
 */
@RestController
@RequestMapping("spCar")
public class ShoppingCarController {
    @Autowired
    private ShoppingcarService shoppingcarService;
    //1.加入购物车
    @RequestMapping("/ShoppingCar/shangping={shangping}&openid={openid}")
    @ResponseBody
    public String shoppingCar(@PathVariable("shangping") String shangping, @PathVariable("openid")String openid, ShoppingCar shoppingCar) {
        String decode = URLDecoder.decode(shangping);
        JSONObject jsonObject = JSON.parseObject(decode);
        String names = jsonObject.getString("name");
        ShoppingCar name = shoppingcarService.one_select(openid,names);
        if(openid==""){
            return "default";
        }else if(name!=null){
            Integer num = name.getNum();
            int doule =Integer.parseInt(jsonObject.getString("num"));
            num = num+doule;
            shoppingcarService.update(num,openid,jsonObject.getString("name"));
        }else{
            shoppingCar.setOpenid(openid);
            shoppingCar.setImage(jsonObject.getString("image"));
            shoppingCar.setName(jsonObject.getString("name"));
            shoppingCar.setContent(jsonObject.getString("content"));
            shoppingCar.setPrice(jsonObject.getInteger("price"));
            shoppingCar.setNum(jsonObject.getInteger("num"));
            shoppingCar.setType(jsonObject.getString("type"));
            shoppingcarService.add(shoppingCar);
        }
        return "success" ;
    }
    //2.查询购物车 根据openid
    @RequestMapping("/selectShoppingCar/openid={openid}")
    @ResponseBody
    public String sh_car(Map<String,Object> map, @PathVariable("openid")String openid){
        map.put("shoppingCarList",shoppingcarService.openid_select(openid));
        return JSON.toJSONString(map);
    }
    //3.删除购物车商品 根据name openid
    @RequestMapping("/delShoppingCar/openid={openid}&name={name}")
    public void del_car(@PathVariable("openid")String openid,@PathVariable("name") String name){
        shoppingcarService.del(openid,name);
    }

    //4.下单,删除购物车对应商品 根据name openid
    @RequestMapping("/delAll/date={date}&openid={openid}")
    public void deleteAll(@PathVariable("date") String date,@PathVariable("openid")String openid){
        String decode = URLDecoder.decode(date);
        JSONArray jsonObject = JSON.parseArray(decode);
        //循环出商品name 再调用删除方法
        for(int i =0;i<jsonObject.size();i++){
            Object s = jsonObject.get(i);
            s=s.toString();
            String json =(String)s;
            JSONObject jsonObject1 = JSON.parseObject(json);
            shoppingcarService.del(openid,jsonObject1.getString("name"));
        }
    }
}
