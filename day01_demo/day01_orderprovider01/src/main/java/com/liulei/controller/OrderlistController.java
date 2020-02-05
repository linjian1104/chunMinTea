package com.liulei.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liulei.entity.Orderlist;
import com.liulei.service.OrderlistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.net.URLDecoder;
import java.util.Map;

/**
 * (Orderlist)表控制层
 *  订单详情页
 * @author makejava
 * @since 2019-12-05 14:14:26
 */
@RestController
@RequestMapping("orderList")
public class OrderlistController {
/**
 * 服务对象
 */
@Resource
private OrderlistService orderlistService;

        /**
        * 用户查询所有
        * @return
        * */
        @GetMapping("findUserAll/openid={openid}&name={name}")
        public String selectAll(Map<String,Object> map, @PathVariable("openid") String openid , @PathVariable("name") String name) {
                map.put("list",this.orderlistService.findUserAll(openid,name));
                return JSON.toJSONString(map);
         }
         @GetMapping("saveOrder/message={message}")
        public void saveOrder(@PathVariable("message") String message){
                Orderlist orderlist = new Orderlist();
                 String decode = URLDecoder.decode(message);
                 JSONArray objects = JSONArray.parseArray(decode);
                 JSONObject jsonObject =(JSONObject) objects.get(0);
                 orderlist.setOrderdate(jsonObject.getString("date"));
                 orderlist.setOrderstatus("已完成");
                 orderlist.setOrdernumber(jsonObject.getString("orderList"));
                 orderlist.setHousenumber(jsonObject.getString("order_package"));
                 orderlist.setOrderinfo(jsonObject.getString("list"));
                 orderlist.setOpenid(jsonObject.getString("openid"));
                 orderlist.setOrdercount(0);
                 orderlist.setOrderprice(12.8);
                 orderlist.setCustormprice(12);
                 this.update((String)orderlist.getOrderinfo());

             this.orderlistService.saveOrder(orderlist);
         }
    /**
     * 查询所有
     * @return
     * */
    @GetMapping("findAll")
    public String findAll(Map<String,Object> map) {
        map.put("list",this.orderlistService.findAll());
        return JSON.toJSONString(map);
    }

    /**
     * 下单成功后修改数据库中的值
     * */
    public void update(String list){
        JSONArray objects = JSONArray.parseArray(list);
        for(int i =0;i<objects.size();i++){
            JSONObject jsonObject = (JSONObject) objects.get(i);
            String name = jsonObject.getString("name");
            String num = jsonObject.getString("num");
            int num1 = Integer.parseInt(num);
            orderlistService.update(name,num1);
        }
    }

}