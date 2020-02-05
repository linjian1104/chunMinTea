package com.liulei.dao;

import com.liulei.entity.Orderlist;
import org.apache.ibatis.annotations.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Orderlist)表数据库访问层
 *  查询订单详情表
 * @author makejava
 * @since 2019-12-05 14:14:26
 */
@Repository
@Mapper
public interface OrderlistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    Orderlist queryById(Integer orderid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Orderlist> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderlist 实例对象
     * @return 对象列表
     */
    List<Orderlist> queryAll(Orderlist orderlist);

    /**
     * 新增数据
     *
     * @param orderlist 实例对象
     * @return 影响行数
     */
    int insert(Orderlist orderlist);

    /**
     * 修改数据
     *
     * @param orderlist 实例对象
     * @return 影响行数
     */
    int update(Orderlist orderlist);

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 影响行数
     */
    int deleteById(Integer orderid);

    /**
     * 通过openid以及状态进行查询单个用户的历史订单
     * */
    @Select("select * from orderlist where openId ='${openid}' and orderStatus = '${status}' ORDER BY orderId desc")
    List<Orderlist> findUserAll(@Param("openid") String openid, @Param("status") String status);
    /**
     * 添加订单用户
     */
    @Insert("insert into orderlist values(null,#{openid},#{orderinfo},#{orderprice},#{orderdate},#{orderstatus},#{custormprice},#{ordercount},#{ordernumber},#{housenumber})")
    void saveOrder(Orderlist orderlist);

    /**
     * 查询所有用户的历史订单
     *
     * */
    @Select("select * from orderlist ORDER BY orderId desc")
    List<Orderlist> findAll();

    /**
     * 商品添加成功后要及时修改库存
     * name 商品名称
     * num  下单数量
     * */
    @Update("update allcontent as con set con.count = con.count - ${num} where con.name ='${name}'")
    void update(@Param("name") String name, @Param("num") int num);

}