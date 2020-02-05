package com.liulei.service.impl;

import com.liulei.dao.ShoppingCarDao;
import com.liulei.entity.ShoppingCar;
import com.liulei.service.ShoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: liulei
 * @date: 2019/12/10 9:33
 * @describe:
 */
@Service("ShoppingCarService")
public class ShoppingCarServiceImpl implements ShoppingcarService {
    @Autowired
    private ShoppingCarDao shoppingCarDao;
    //1.加入购物车
    @Override
    public boolean add(ShoppingCar shoppingCar) {
        shoppingCarDao.add(shoppingCar);
        return true;
    }
    // 2.查询购物车 根据openid
    @Override
    public List<ShoppingCar> openid_select(String openid) {
        return shoppingCarDao.openid_select(openid);
    }
    //3.查询单个商品 根据openid name
    @Override
    public ShoppingCar one_select(String openid, String name) {
        return shoppingCarDao.one_select(openid,name);
    }
    //4.删除购物车商品 根据name
    @Override
    public int del(String openid, String name) {
        return shoppingCarDao.del(openid,name);
    }
    //5.根据openid以及商品名称来修改同样的商品数量
    @Override
    public int update(int num, String openid, String name) {
        return shoppingCarDao.update(num,openid,name);
    }
}
