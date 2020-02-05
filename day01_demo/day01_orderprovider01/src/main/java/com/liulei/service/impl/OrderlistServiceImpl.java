package com.liulei.service.impl;


import com.liulei.dao.OrderlistDao;
import com.liulei.entity.Orderlist;
import com.liulei.service.OrderlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orderlist)表服务实现类
 *
 * @author makejava
 * @since 2019-12-05 14:14:26
 */
@Service("orderlistService")
public class OrderlistServiceImpl implements OrderlistService {

    @Autowired
    private OrderlistDao orderlistDao;
    @Override
    public void saveOrder(Orderlist orderlist) {
        orderlistDao.saveOrder(orderlist);
    }

    @Override
    public List<Orderlist> findUserAll(String openid, String status) {
        return orderlistDao.findUserAll(openid,status);
    }

    @Override
    public List<Orderlist> findAll() {
        return orderlistDao.findAll();
    }

    /**
     * 商品添加成功后要及时修改库存
     * name 商品名称
     * num  下单数量
     * */
    @Override
    public void update(String name, int num) {
        orderlistDao.update(name,num);
    }
}