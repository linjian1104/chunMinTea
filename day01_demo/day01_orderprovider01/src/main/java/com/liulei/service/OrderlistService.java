package com.liulei.service;


import com.liulei.entity.Orderlist;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * (Orderlist)表服务接口
 *
 * @author makejava
 * @since 2019-12-05 14:14:26
 */
public interface OrderlistService {
    /**
     * 添加订单用户
     */
    void saveOrder(Orderlist orderlist);

    /**
     * 通过openid以及状态进行查询
     * */
    List<Orderlist> findUserAll(String openid, String status);

    /**
     * 通过openid以及状态进行查询
     * */
    List<Orderlist> findAll();

    /**
     * 商品添加成功后要及时修改库存
     * */
    void update(String name,int num);
}