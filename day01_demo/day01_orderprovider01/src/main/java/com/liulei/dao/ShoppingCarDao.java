package com.liulei.dao;

import com.liulei.entity.ShoppingCar;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ShoppingCarDao {
    //1.加入购物车
    @Insert("insert into shoppingcar value (null,#{openid},#{image},#{name},#{content},#{price},#{num},#{type})")
    public int add(ShoppingCar shoppingCar);

    // 2.查询购物车 根据openid
    @Select("select * from shoppingcar where openid = #{0} group by content")
    public List<ShoppingCar> openid_select(String openid);

    // 3.查询单个商品 根据openid name
    @Select("select * from shoppingcar where openid = '${openid}' and name= '${name}'")
    public ShoppingCar one_select(@Param("openid")String openid,@Param("name")String name);

    // 4.删除购物车商品 根据openid,name
    @Delete("delete from shoppingcar where openid = '${openid}' and name= '${name}'")
    public int del(@Param("openid") String openid,@Param("name") String name);

    // 5.根据openid以及商品名称来修改同样的商品数量
    @Update("update shoppingcar set num = '${num}' where openid='${openid}' and name = '${name}'")
    public int update(@Param("num") int num,@Param("openid")String openid,@Param("name")String name);
}
