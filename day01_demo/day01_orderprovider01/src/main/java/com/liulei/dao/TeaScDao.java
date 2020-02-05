package com.liulei.dao;

import com.liulei.entity.TeaSc;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: liulei
 * @date: 2019/12/4 11:31
 * @describe:
 */
@Repository
@Mapper
public interface TeaScDao {
    /**
     * 直接根据openID查询所有
     *
     * @return*/
    @Select("select * from tea_sc where openId = #{0} group by content")
    List<TeaSc> findByOpenId(String openId);

    /**
     * 根据openId以及sc_name来进行删除
     *
     * */
    @Delete("delete from tea_sc where openId = '${openid}' and name = '${name}'")
    int deleteByOpenId(@Param("openid") String openid,@Param("name") String name);

    /**根据openId以及对象来进行添加
     *
     * */
    @Insert("insert into tea_sc value (null,#{openId},#{image},#{name},#{content},#{price},#{num},#{type},null)")
    int insertByOpenId(TeaSc tea_sc);
}
