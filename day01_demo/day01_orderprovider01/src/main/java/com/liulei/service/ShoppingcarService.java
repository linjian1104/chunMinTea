package com.liulei.service;

import com.liulei.entity.ShoppingCar;

import java.util.List;

public interface ShoppingcarService {
    //1.加入购物车
    public boolean add(ShoppingCar shoppingCar);
    // 2.查询购物车 根据openid
    public List<ShoppingCar> openid_select(String openid);
    //3.查询单个商品 根据openid name
    public ShoppingCar one_select(String openid,String name);
    //4.删除购物车商品 根据name
    public int del(String openid,String name);
    //5.根据openid以及商品名称来修改同样的商品数量
    public int update(int num,String openid,String name);
}
